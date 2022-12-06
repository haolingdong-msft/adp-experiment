# 1. set location to spec-pr
# Set-Location C:\workspace\azure-rest-api-specs-pr
# 2. copy .cadl files to cadl-tests/cadl/adp
$autorestAdpCadlDir = 'C:\workspace\autorest.java\cadl-tests\cadl\adp\'
$specDir = 'C:\workspace\azure-rest-api-specs-pr\specification\adp\'
$adpExperimentRepoDir = 'C:\workspace\adp-experiment'

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
# 3. set location to cadl-tests/cadl/adp/DataManagement
Set-Location $autorestAdpCadlDir+"DataManagement\"
# 4. remove node-modules
Get-Location node_modules\
Remove-Item -Path "node_modules\" -Recurse
# 5. remove package-lock.json
Remove-Item -Path "package-lock.json" -Recurse
# 6. npm install
npm install
# 7. cadl compile client.cadl
cadl compile client.cadl
# 8. copy cadl-output/ to adp-experiment
$source = $autorestAdpCadlDir + "DataManagement\cadl-output\src\"
$destination = $adpExperimentRepoDir
Remove-Item -Path $destination -Recurse
Copy-Item -Path $source -Destination $destination -Recurse
