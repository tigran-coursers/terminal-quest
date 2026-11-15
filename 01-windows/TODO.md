# Windows assignment

## Scenario

You are preparing a Java app for a teammate. Use Windows Terminal and PowerShell to inspect the repository and build it without an IDE. Work only inside a new `01-windows/practice` directory for file deletion tasks.

## Student tasks

- [ ] Open PowerShell and CMD as separate Windows Terminal tabs. Record how you identified each shell.
- [ ] In PowerShell, find your current directory, list the repository, and open command help for a file cmdlet. Explain which commands are cmdlets and which of `java`, `git`, and `gradlew.bat` are external programs.
- [ ] In `01-windows/practice`, create a text file, copy it, move the copy, search by filename and by text, then delete only the practice copy. Record the final listing.
- [ ] Set `APP_NAME` and `SERVER_PORT` in the current session. Show their values and explain whether a new terminal tab inherits them.
- [ ] Use a pipeline to filter a directory listing and redirect a useful listing to a file in `practice`. Compare output with the original terminal display.
- [ ] Inspect running processes, run the sample JAR, identify its Java process and port, request `/health`, then stop it safely.
- [ ] Check `java -version`, `git --version`, and the Gradle Wrapper version. Build and test the sample app from PowerShell.
- [ ] Complete the [PowerShell starter scripts](powershell/README.md); do the small [CMD comparison](cmd/README.md).

## Constraints

Do not delete anything outside `practice`. Do not terminate an unrelated Java process. Do not change the machine-wide execution policy or use an unreviewed downloaded script.

## Expected results

The JAR is built under `sample-app/build/libs`; `/health` returns JSON with an UP status; the practice directory contains your retained evidence; your scripts report errors clearly.

## Acceptance criteria

Your report shows successful build/test, file operations, variable and pipeline examples, one process/port observation, and an explanation of cmdlets versus external tools. The scripts can be run repeatedly without relying on a fixed current directory.

## Submission requirements

Submit your report and completed `scripts/windows/*.ps1`. Include command snippets or screenshots without secrets.
