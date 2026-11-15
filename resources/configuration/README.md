# App configuration practice

The Java app reads three environment variables at startup. `APP_NAME` defaults to `Terminal Quest` (1–80 printable characters); `SERVER_PORT` defaults to `8080` (valid range 1–65535); `LOG_LEVEL` defaults to `INFO` (`DEBUG`, `INFO`, `WARN`, or `ERROR`). Set these in the shell session before starting `java -jar`. Try one invalid value and record the exit code and error. Do not place passwords or secrets in environment examples.
