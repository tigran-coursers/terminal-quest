# Linux filesystem practice

## Introduction and learning objectives

Practice safe file work in Ubuntu and compare Linux and Windows paths. You will create, search, copy, move, and remove your own files.

## Prerequisites

Ubuntu WSL2, a repository copy in your Linux home, and the [Linux introduction](../README.md).

## Concepts and short examples

`pwd` shows the current directory; `find . -name '*.txt'` searches names; `grep -n Quest message.txt` searches text.

Make `02-linux/practice` in your Linux home checkout. Create a small text file, copy and rename it, search for its name with `find`, search for a word with `grep`, and remove only the extra copy. Compare Linux `/` paths with the Windows path to the same repository under `/mnt/c`. Observe that names can be case sensitive in the Linux filesystem. Record the final listing and one difference from your PowerShell exercise. Use `man find` or `find --help` to discover one option you did not know.

## Expected outcome

Your report shows the final files, searches, and path comparison. See [filesystem concepts](../../docs/03-filesystems-and-paths.md) and the [Linux assignment](../TODO.md).
