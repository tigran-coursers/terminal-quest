# 03 — Local integration and deployment

## Introduction

Windows and Ubuntu will now work together. PowerShell’s SSH client connects to an OpenSSH server inside WSL2, SCP copies the JAR, and Ubuntu runs the app. The connection stays on your own computer.

## Learning objectives

Explain client/server roles, host keys and user keys; connect and run a remote command; copy files using SCP; build and deploy the Java app; automate the workflow.

## Prerequisites

Complete [Windows](../01-windows/TODO.md) and [Linux](../02-linux/TODO.md). Confirm Java 21 on both sides, `ssh` and `scp` in PowerShell, and Ubuntu WSL2 running. Installing `openssh-server` inside Ubuntu needs `sudo`; Windows PowerShell acts only as the client. Follow [SSH setup](ssh/TODO.md) before file transfer. If organization policy blocks a local SSH service, ask your instructor for the approved local setup.

## Concepts and short examples

SSH gives an authenticated remote shell: `ssh user@localhost -p 2222`. SCP copies files over SSH: `scp -P 2222 file.txt user@localhost:~/incoming/`. Port numbers and the `-p`/`-P` options differ. A remote command can be supplied after the SSH destination. Verify the host key fingerprint on first connection; never disable checking. WSL2 localhost forwarding normally lets Windows reach a service bound in WSL2, but behavior can depend on WSL/network configuration. Check `ss -ltn` in Ubuntu and `Test-NetConnection localhost -Port 2222` in PowerShell if it fails. Choose an unused local port if 2222 conflicts.

See [SSH concepts](../docs/06-ssh-and-networking.md), [SSH assignment](ssh/TODO.md), [SCP assignment](file-transfer/TODO.md), [deployment assignment](java-deployment/TODO.md), and [Microsoft WSL networking guide](https://learn.microsoft.com/windows/wsl/networking).

## Expected outcome

You can deploy `terminal-quest-app.jar` from Windows to Ubuntu, verify `/health`, stop it safely, and explain each step. Complete [integration tasks](TODO.md).
