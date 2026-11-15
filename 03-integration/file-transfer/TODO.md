# SCP task — copying files

## Scenario

Your deployment needs to copy files from Windows to Ubuntu without shared-folder shortcuts.

## Student tasks

- [ ] Create a harmless text file in your Windows practice directory and a target folder in your Ubuntu home directory.
- [ ] Use `scp` from PowerShell to copy the file to Ubuntu over the local SSH port. Note that SCP uses uppercase `-P` for the port.
- [ ] Verify the file in Ubuntu by name, size, and content or checksum.
- [ ] Copy a small practice directory recursively and verify its contents. Compare SSH’s remote command role with SCP’s transfer role.
- [ ] Describe a real development situation where SCP is useful and one reason a copied artifact should be verified.

## Constraints

Copy only practice files and use the local WSL2 target. Do not include credentials or keys in copied directories.

## Expected results

The file and directory arrive intact in your Ubuntu home directory.

## Acceptance criteria

Your report shows both transfer commands, verification results, and the SSH/SCP distinction.

## Submission requirements

Submit report evidence, not the transferred files.
