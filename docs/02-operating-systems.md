# Windows and Linux in this project

An operating system manages processes, files, memory, users, and hardware. Windows is the host operating system. WSL2 runs a real Linux kernel in a lightweight virtual environment so Ubuntu tools can run beside Windows tools. The exercise uses WSL2 as a local practice target; a production Linux server may have different networking, service management, users, and security policy.

Windows Terminal can open a PowerShell tab or an Ubuntu tab. In PowerShell, `wsl --list --verbose` reports installed distributions and their WSL version. Inside Ubuntu, `uname -a` and `whoami` describe the Linux environment. Use `wsl -d Ubuntu` to start it from Windows. Installing WSL can require administrator rights, virtualization support, an internet download, and a restart.

Windows uses drive letters such as `C:\Users\...`; Linux uses a single tree rooted at `/`. WSL2 exposes Windows drives at paths such as `/mnt/c`. For Linux build work, keep a copy in your Linux home directory so Linux file behavior and performance are more predictable. See [filesystem paths](03-filesystems-and-paths.md) and [Microsoft WSL documentation](https://learn.microsoft.com/windows/wsl/).
