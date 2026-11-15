# PowerShell and Bash command cheatsheet

These are common starting points, not interchangeable spellings. PowerShell cmdlets work with objects; Bash commands usually emit text. Check help before relying on behavior.

| Goal | PowerShell | Bash / Ubuntu | Important difference |
|---|---|---|---|
| Current directory | `Get-Location` | `pwd` | Output types differ. |
| List files | `Get-ChildItem` | `ls -la` | Hidden files and metadata options differ. |
| Change directory | `Set-Location path` | `cd path` | Path syntax differs. |
| Create directory | `New-Item -ItemType Directory name` | `mkdir name` | PowerShell returns an object. |
| Copy file | `Copy-Item a b` | `cp a b` | Recursive options differ. |
| Move file | `Move-Item a b` | `mv a b` | Error behavior differs. |
| Delete practice file | `Remove-Item practice/file` | `rm practice/file` | Inspect target first; recursive behavior differs. |
| Find names | `Get-ChildItem -Recurse -Filter '*.md'` | `find . -name '*.md'` | Filters and traversal differ. |
| Find text | `Select-String -Path README.md -Pattern TODO` | `grep -n TODO README.md` | One returns match objects, one text. |
| Show variable | `$env:APP_NAME` | `echo "$APP_NAME"` | Variables are set differently. |
| Set session variable | `$env:APP_NAME = 'Lab'` | `export APP_NAME=Lab` | Scope rules differ. |
| List processes | `Get-Process` | `ps aux` | Output and filters differ. |
| See listening ports | `Get-NetTCPConnection -State Listen` | `ss -ltn` | Tools report different fields. |
| Command help | `Get-Help Get-Process -Examples` | `man ps` or `ps --help` | Help availability differs. |
| Last external exit | `$LASTEXITCODE` | `$?` | PowerShell cmdlet failures need separate handling. |

For HTTP checks, PowerShell’s `Invoke-RestMethod http://127.0.0.1:8080/health` parses JSON, while Ubuntu’s `curl -i http://127.0.0.1:8080/health` shows HTTP headers and body. PowerShell’s `curl` may resolve differently across versions; use an explicit program or cmdlet when documenting behavior.
