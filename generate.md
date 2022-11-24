## Generate steps
1. cd to folder `DataManagement`
`npm install`
2. when update emitter.ts, run cadl-tests/Setup.ps1, then cd to `DataManagement`, run `npm install`
3. run `cadl compile xxx.cadl`

## debug codegen

1. modify emitter.ts
```typescript
const output = await promisify(execFile)("java", [
        `-DemitterOptions=${emitterOptions}`,
+        "-agentlib:jdwp=transport=dt_socket,server=y,suspend=y,quiet=y,address=5005",
        "-jar",
        jarFileName,
        codeModelFileName,
      ]);
```

2. run `Setup.ps1` under `cadl-tests`
3. run `npm install` under `DataManagement`
4. run `cadl compile main.cadl`

## debug emitter ts code
```
$ C:\workspace\autorest.java\cadl-tests\cadl\adp\DataManagement> node --inspect-brk node_modules/\@cadl-lang/compiler/dist/core/cli.js compile main.cadl
```