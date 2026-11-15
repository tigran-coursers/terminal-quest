# Integration assignment

## Scenario

Your Windows workstation builds a release JAR. Ubuntu WSL2 is a local stand-in for a deployment machine. Set up secure local access, transfer the artifact, and automate deployment.

## Student tasks

- [ ] Complete [SSH setup and connection](ssh/TODO.md).
- [ ] Complete [SCP file and directory transfer](file-transfer/TODO.md).
- [ ] Complete [remote Java deployment](java-deployment/TODO.md).
- [ ] Finish `scripts/windows/deploy.ps1` and show a successful second deployment.

## Constraints

Use only localhost/WSL2. Verify the host key. Keep private keys and passwords out of the repository. Do not open a public port or disable SSH host-key checking. Stop only the app process you started.

## Expected results

The Windows-built JAR runs in Ubuntu and `/health` responds. The final script reports each stage and fails clearly when a stage cannot complete.

## Acceptance criteria

Your report includes SSH identity and host-key observations, SCP verification, JAR checksum or size comparison, deployment command evidence, health output, log excerpt, process stop, and automation results.

## Submission requirements

Submit your completed script and report. Redact usernames and local paths if you prefer, but never submit private keys, passwords, or `authorized_keys` contents.
