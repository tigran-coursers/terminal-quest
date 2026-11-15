# PowerShell script practice

## Introduction and learning objectives

Turn manual build and run commands into reusable PowerShell scripts. Learn script paths, native exit codes, environment values, and useful error messages.

## Prerequisites

Complete the file and process exercises in the [Windows assignment](../TODO.md). Have Java 21 and a working local Gradle Wrapper.

## Concepts and short examples

`$PSScriptRoot` identifies the directory containing the script. `$LASTEXITCODE` reports the last native program's exit code. A cmdlet can fail differently, so inspect its own error behavior too.

Use the starter files [run.ps1](../../scripts/windows/run.ps1), [build.ps1](../../scripts/windows/build.ps1), and [deploy.ps1](../../scripts/windows/deploy.ps1). First make `build.ps1` check the Java version, invoke the local Gradle Wrapper, inspect its exit code, and report the JAR path. Make `run.ps1` set or read app configuration, start the JAR, and capture output while preserving a way to stop it. Leave `deploy.ps1` for the integration section.

Explore `Get-Help about_Scripts`, `Get-Help Start-Process -Examples`, and `$LASTEXITCODE`. PowerShell cmdlets use error behavior different from external programs; test both failure paths. Your scripts should work from any current directory and print useful failures. Document one success and one failure for each script in your report.

## Expected outcome

The completed scripts build and run the app from any current directory and explain failures. See [PowerShell script documentation](https://learn.microsoft.com/powershell/module/microsoft.powershell.core/about/about_scripts).
