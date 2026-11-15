# Terminal, shell, and CLI

A **terminal application** displays text input and output. Windows Terminal is one example. A **shell** reads your commands and launches programs. PowerShell, CMD, and Bash are shells. A **CLI program** accepts command-line arguments and does a job; `java`, `git`, `ssh`, and Gradle are examples. A terminal can host different shells, and a shell can launch many CLI programs. Opening a new Windows Terminal tab may launch a different shell profile.

PowerShell has built-in **cmdlets** such as `Get-ChildItem`. `java -version` starts an external executable. Check `Get-Command java` and `Get-Command Get-ChildItem` to see the distinction. CMD is an older Windows shell with commands such as `dir`; PowerShell supports objects and has a different scripting language. Bash is a common Unix shell that usually passes text between processes.

Why this matters: when a tutorial says “run this in the terminal,” the shell determines quoting, variable syntax, pipelines, and script syntax. Explore `Get-Help Get-Command`, `help` in CMD, and `man bash` in Ubuntu. See [Windows](../01-windows/README.md) and [shell concepts](05-shell-scripting-concepts.md).
