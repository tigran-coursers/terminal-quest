# Permissions and ownership practice

## Introduction and learning objectives

Learn what Linux owner and execute permissions mean by testing your own script.

## Prerequisites

Ubuntu WSL2 and a `02-linux/practice` folder. Read [Linux setup](../README.md).

## Concepts and short examples

`ls -l script.sh` shows mode and owner; `chmod u+x script.sh` adds execute permission for the owner. `whoami` reports your user.

In `02-linux/practice`, create a short script of your own that prints a message. Inspect its `ls -l` output, try to run it directly, change only its owner execute bit with `chmod`, and try again. Record what changed. Compare `bash script.sh` with `./script.sh`. Check your username with `whoami` and file owner with `ls -l`. Explain when `sudo` is appropriate for installing packages and why it is unnecessary for your own files. Do not change permissions in `/etc` or other system directories.

## Expected outcome

You can explain why a file did or did not execute and when elevated rights are needed. See [filesystem concepts](../../docs/03-filesystems-and-paths.md) and the [Linux assignment](../TODO.md).
