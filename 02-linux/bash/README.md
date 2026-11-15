# Bash script practice

## Introduction and learning objectives

Automate a Linux build and app lifecycle while learning paths, exit codes, PIDs, and logs.

## Prerequisites

Ubuntu WSL2, Java 21, and a completed manual run from the [Linux assignment](../TODO.md).

## Concepts and short examples

`$?` is the previous command's exit status and `$!` is the last background process PID. `bash -n script.sh` checks syntax without running it.

Complete [run.sh](../../scripts/linux/run.sh), [build.sh](../../scripts/linux/build.sh), and [stop.sh](../../scripts/linux/stop.sh). The build script checks Java and Gradle’s exit status. The run script reads app settings, starts the named JAR, captures logs, and writes a PID to a local ignored file. The stop script verifies that PID belongs to this app before stopping it. Explore `bash --help`, `man bash`, `$?`, `$!`, and `trap`. Run scripts from a different current directory to test path handling. Record one useful failure case.

## Expected outcome

The completed scripts build, run, log, and safely stop one app instance. See [scripting concepts](../../docs/05-shell-scripting-concepts.md).
