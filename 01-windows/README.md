# 01 — Windows terminal work

## Introduction

Windows Terminal is a window that hosts shells. PowerShell is the main shell in this module; CMD is included for comparison. Java, Git, and Gradle are separate CLI programs that a shell launches.

## Learning objectives

Navigate and manage practice files; search files and text; use environment variables, pipelines, and redirection; inspect processes; get help; run Java, Git, and the Gradle Wrapper; begin PowerShell scripts.

## Prerequisites

Windows 10/11, Windows Terminal, PowerShell, Git, and Java 21. Open PowerShell in Windows Terminal at the repository root. Use a dedicated `practice` directory for any deletion exercise.

## Concepts and short examples

`Get-Location` displays your directory; `Get-ChildItem` lists items; `Get-Help Get-ChildItem -Examples` teaches a cmdlet. `java -version` runs an external program. `$env:APP_NAME = 'Quest Lab'` sets a variable in the current PowerShell session. `Get-Process | Where-Object ProcessName -like '*java*'` passes **objects** through a pipeline. `Get-ChildItem > listing.txt` writes formatted output to a file. CMD uses commands such as `dir` and `cd`, and variable syntax `%APP_NAME%`.

PowerShell script execution may be restricted by policy. Inspect with `Get-ExecutionPolicy -List`. If needed, use a session-scoped policy only after understanding your organization’s rules; do not change machine-wide policy just for homework. Run only scripts you wrote or reviewed.

See [PowerShell guide](powershell/README.md), [CMD comparison](cmd/README.md), [process guide](../docs/04-processes-and-environment.md), and [Microsoft PowerShell documentation](https://learn.microsoft.com/powershell/).

## Expected outcome

You can operate the sample app and explain which program handled each command. Complete the [assignment](TODO.md) and save evidence in your report.
