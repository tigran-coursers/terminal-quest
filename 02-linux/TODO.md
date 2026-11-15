# Linux assignment

## Scenario

Your team will run the Java app in Ubuntu WSL2. Prepare a clean working copy in your Linux home directory and diagnose it through Bash. Keep deletion experiments under `02-linux/practice`.

## Student tasks

- [ ] Record WSL status, Ubuntu distribution, and version 2 from PowerShell. Start Ubuntu and identify your Linux user and home directory.
- [ ] Visit `/home`, `/etc`, `/var`, `/tmp`, and `/mnt/c`. Record what each is for and one Windows/Linux path difference.
- [ ] Complete [filesystem practice](filesystem/README.md) using `pwd`, `ls`, `mkdir`, `cp`, `mv`, `rm`, `find`, and `grep` within `practice`.
- [ ] Complete [permission practice](permissions/README.md): inspect ownership and mode, change permission on your own test script, and explain why `sudo` is not needed there.
- [ ] Use `man` or `--help` for at least two commands. Inspect package information with `apt`; use `sudo` only if installing a missing JDK.
- [ ] In a Linux home copy of the repository, build and test the app, set `APP_NAME` and `SERVER_PORT`, start it, redirect logs, find its PID and listening port, query `/health`, and stop it safely.
- [ ] Complete the [Bash starter scripts](bash/README.md).

## Constraints

Delete only inside `practice`. Never run `sudo rm` for this homework. Do not kill a process merely because its name contains `java`; verify its PID and command first.

## Expected results

The Linux build produces the same named JAR; a configured app responds on the selected local port; logs show startup and requests. File permissions and process evidence are recorded.

## Acceptance criteria

Your report shows WSL2, commands and outputs for filesystem/permissions, one package-help investigation, successful Gradle tests, configured HTTP output, and a clean stop. Your scripts show useful error messages.

## Submission requirements

Submit your report and completed `scripts/linux/*.sh`, including success and failure examples without system secrets.
