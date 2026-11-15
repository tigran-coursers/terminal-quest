# Filesystems and paths

A **path** names a file or directory. An absolute Windows path begins with a drive, for example `C:\Users\Student\project`. An absolute Linux path begins with `/`, for example `/home/student/project`. A relative path starts from the current directory, which `Get-Location` or `pwd` displays.

Ubuntu conventions: `/home` stores users’ files; `/etc` holds system configuration; `/var` holds changing system data and logs; `/tmp` is temporary space; `/mnt/c` exposes Windows C: to WSL. Your own practice directory is the safe place for creating and deleting files. File names on Linux are usually case sensitive. Ownership and mode bits determine access; `ls -l` shows them. A shell script may need `chmod u+x script.sh` before `./script.sh`, while `bash script.sh` asks Bash to read it directly.

PowerShell examples: `Get-Location`, `Get-ChildItem`, `New-Item -ItemType Directory practice`. Bash examples: `pwd`, `ls -la`, `mkdir practice`. For deletion, inspect the exact target first and delete only your practice files. See [Linux exercises](../02-linux/TODO.md).
