# SSH task — Windows client to WSL2 server

## Scenario

You need a secure command session from PowerShell to Ubuntu on the same computer.

## Student tasks

- [ ] In Ubuntu, identify your username. Install `openssh-server` if missing, inspect its configuration, and start the SSH service using the service method supported by your WSL2 setup. Confirm it listens on a local port; if port 22 conflicts, configure an unused port such as 2222 and restart it.
- [ ] In PowerShell, locate the `ssh` client. Generate a dedicated practice key pair with `ssh-keygen`. Explain which file is private and which is public.
- [ ] Add only the public key to your Ubuntu user’s `~/.ssh/authorized_keys` with correct directory/file permissions. Do not copy the private key to Ubuntu.
- [ ] From PowerShell, connect to `localhost` on your chosen port. Compare the presented server host-key fingerprint with the Ubuntu server fingerprint before accepting it. Record the chosen port and method of verification, not key material.
- [ ] Run a simple Linux command over SSH, then exit the interactive session. Explain the difference between client, server, user key, and host key.
- [ ] Test and explain one connectivity issue, such as wrong port, stopped SSH service, or failed permissions, without disabling host-key checking.

## Constraints

Keep the service local to this assignment and follow your machine’s firewall rules. Never commit a private key, password, or `authorized_keys`. Do not use `StrictHostKeyChecking=no`. Stop or disable the SSH service after the lesson if you no longer need it.

## Expected results

PowerShell authenticates to the Ubuntu user over local SSH, a remote command prints output, and the session exits normally.

## Acceptance criteria

Your report shows the listening port, successful connection, host-key verification method, remote command, and a correct explanation of key roles.

## Submission requirements

Submit redacted command/output evidence in the report; exclude all key files.
