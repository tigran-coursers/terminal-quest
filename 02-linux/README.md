# 02 — Ubuntu Linux in WSL2

## Introduction

WSL2 runs a Linux environment on Windows. You will use Ubuntu Bash for the same kinds of developer tasks you first tried in PowerShell. It is useful preparation for Linux servers, but WSL2 is not identical to administering a standalone server.

## Learning objectives

Install and identify WSL2, navigate Linux paths, work with files and permissions, use `sudo` and `apt` carefully, search with `find` and `grep`, inspect processes and ports, and write Bash scripts.

## Prerequisites and setup

In an elevated PowerShell session, inspect `wsl --status` and `wsl --list --verbose`. If WSL is absent, follow [Microsoft’s WSL install guide](https://learn.microsoft.com/windows/wsl/install); `wsl --install -d Ubuntu` requires administrator rights, virtualization support, and often a restart. Start Ubuntu from Windows Terminal or `wsl -d Ubuntu`. Create your Linux user when prompted. Confirm the distribution reports version 2 with `wsl --list --verbose` in PowerShell. Inside Ubuntu, install a Java 21 JDK if `java -version` does not show one; use Ubuntu’s package instructions for your release, with `sudo` only for package management.

Clone the repository into your Linux home directory for Linux build work. A Windows drive is visible under `/mnt/c`, but tools and permissions may behave differently there. `pwd`, `ls`, `cd`, and `man ls` are useful first commands.

## Concepts and examples

`/home` holds user homes; `/etc` system configuration; `/var` variable data such as logs; `/tmp` temporary files; `/mnt/c` the Windows C: drive. `find . -name '*.md'` finds Markdown files, and `grep -n 'TODO' README.md` searches text. `ls -l` shows permissions; `chmod u+x script.sh` lets the owner execute a script. Use `sudo` only when a task truly needs administrator rights. `apt update` refreshes package indexes but does not install packages. `ps`, `kill`, and `ss` help inspect processes and ports.

See [filesystem practice](filesystem/README.md), [permissions practice](permissions/README.md), [Bash scripts](bash/README.md), [filesystem concepts](../docs/03-filesystems-and-paths.md), and [Ubuntu command line guide](https://ubuntu.com/tutorials/command-line-for-beginners).

## Expected outcome

You can build and run the app within Ubuntu, inspect its process and logs, and explain how Linux paths and permissions differ from Windows. Complete [the assignment](TODO.md).
