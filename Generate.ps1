# 1. set location to spec-pr
# Set-Location C:\workspace\azure-rest-api-specs-pr
# 2. copy .cadl files to cadl-tests/cadl/adp
$autorestAdpCadlDir = 'C:\workspace\autorest.java\cadl-tests\cadl\adp\'
$autorestAdpDataManagementDir = 'C:\workspace\autorest.java\cadl-tests\cadl\adp\DataManagement\'
$specDir = 'C:\workspace\azure-rest-api-specs-pr\specification\adp\'
$adpExperimentRepoDir = 'C:\workspace\adp-experiment\'

if (!(Test-Path -Path $autorestAdpCadlDir))
{
    New-Item -ItemType Directory -Force -Path $autorestAdpCadlDir
}
$includes = '.cadl'
Get-ChildItem $specDir  -Recurse -Force |
        Where-Object {$_.Name -match $includes} |
        Resolve-Path |
        ForEach-Object {
            if ($_ -ne "Path" -and $_ -ne "----") {
                $source = $_.ToString().Replace('Microsoft.PowerShell.Core\FileSystem::', '')
                $destination = $_.ToString().Replace('Microsoft.PowerShell.Core\FileSystem::'+$specDir, $autorestAdpCadlDir)
                if (!(Test-Path -Path $destination)) {
                    New-Item -ItemType file -Force -Path $destination
                }
                Copy-Item -Path $source -Destination $destination
            }
        }

Set-Location -Path C:\workspace\autorest.java\cadl-tests\
.\Setup.ps1

Set-Location -Path $autorestAdpDataManagementDir
if (Test-Path "node_modules\")
{
    echo "Delete node_modules"
    Remove-Item -Path "node_modules\" -Recurse
}
# 5. remove package-lock.json
if (Test-Path "package-lock.json") {
    echo "Delete package-lock.json"
    Remove-Item -Path "package-lock.json"
}
# 6. npm install
npm install
# 7. cadl compile client.cadl
if (Test-Path "cadl-output\") {
    echo "Delete cadl-output"
    Remove-Item -Path "cadl-output\" -Recurse
}
cadl compile client.cadl
# 8. copy cadl-output/ to adp-experiment
#$source = "cadl-output\src\"
#$destination = $adpExperimentRepoDir
#if (Test-Path $destination"src\")
#{
#    Remove-Item -Path $destination"src\" -Recurse
#}
#
#Copy-Item -Path $source -Destination $destination -Recurse -Force

$destination = $adpExperimentRepoDir+"adp-with-convenience-methods\"
$source = "cadl-output\"
if (Test-Path $destination)
{
    Remove-Item -Path $destination -Recurse
}
Copy-Item -Path $source -Destination $destination -Recurse -Force
Copy-Item $destination\pom.xml $destination\pom-backup.xml
Get-Content -path $destination\pom.xml | % { $_ -Replace "<artifactId>adp-datamanagement</artifactId>", "<artifactId>adp-datamanagement-convenience</artifactId>" } |  Out-File $destination\pom-backup.xml
Copy-Item $destination\pom-backup.xml $destination\pom.xml
Remove-Item $destination\pom-backup.xml


Copy-Item ./cadl-project.yaml ./cadl-project-backup.yaml
$destination = $adpExperimentRepoDir+"adp-without-convenience-methods\"
$source = "cadl-output\"
if (Test-Path $destination)
{
    Remove-Item -Path $destination -Recurse
}
Copy-Item -Path $source -Destination $destination -Recurse -Force
Copy-Item ./cadl-project-backup.yaml ./cadl-project.yaml


Set-Location $adpExperimentRepoDir

#mvn package