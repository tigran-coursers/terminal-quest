# Java deployment task

## Scenario

Ship the Java application from the Windows build environment to Ubuntu WSL2, then turn the manual sequence into a PowerShell script.

## Student tasks

- [ ] In PowerShell, run the Gradle Wrapper tests and JAR task. Identify `sample-app/build/libs/terminal-quest-app.jar` and record its size or checksum.
- [ ] Connect to Ubuntu with SSH, prepare a directory under your Linux home, and check `java -version`. Install Java 21 if missing.
- [ ] Transfer the JAR using SCP to that directory. Compare size or checksum on both sides.
- [ ] Start it in Ubuntu with a chosen `APP_NAME` and `SERVER_PORT`, redirect output to a log file, and retain its PID.
- [ ] Inspect startup and request logs, test `/health` from Ubuntu and from Windows over localhost, then stop the verified process safely.
- [ ] Implement `scripts/windows/deploy.ps1` to build, check exit status, transfer, remotely start, test health, and report failures. Re-run it to show the result is repeatable.

## Constraints

Keep the SSH target local; verify host keys. Do not hard-code a password, private key content, or your personal home path. Avoid killing unrelated Java processes. Choose a free local HTTP port.

## Expected results

The Windows-built JAR runs in Ubuntu, health returns `{"status":"UP"}`, logs reveal startup and requests, and the app stops cleanly.

## Acceptance criteria

Your report shows successful tests, artifact comparison, remote process/PID, health output, log sample, safe stop, and both success and failure behavior of the deployment script.

## Submission requirements

Submit the report and completed `deploy.ps1`; exclude JAR, PID, and log files.
