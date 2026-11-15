# Shell scripts and automation

A `.ps1` file is a PowerShell script; a `.sh` file is usually a Bash script in this project. Both can combine CLI calls, variables, conditions, and error checks. They are different languages: PowerShell uses `$env:APP_NAME`, Bash uses `$APP_NAME`; quoting, arrays, pipelines, and error handling differ. Do not copy one script’s syntax into the other.

Build scripts should locate the repository from their own path instead of assuming the user’s current directory. They should check Java and the build exit code, print the expected JAR path, and fail early if a step fails. A run script should read app settings, start the JAR, and capture logs. A stop script should verify the saved PID refers to the expected app before signaling it. A deployment script should verify each SSH and SCP step before moving on.

PowerShell example: `Get-Help about_Execution_Policies` explains script policy. A session-scoped policy may be appropriate if your machine permits it; do not make a permanent machine-wide change for homework. Bash example: `bash -n script.sh` checks syntax without running the script. Explore `Get-Help about_Scripts`, `man bash`, and each program’s `--help`. The [starter scripts](../scripts) intentionally contain TODOs, not finished solutions.
