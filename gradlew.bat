@echo off
REM Minimal gradlew stub - runs the local 'gradle' if available, otherwise instructs the user to install gradle or generate the wrapper.
where gradle >nul 2>&1
nif %errorlevel%==0 (
  gradle %*
) else (
  echo Gradle ist nicht installiert und der Gradle Wrapper ist nicht vollständig eingerichtet.
  echo Installiere Gradle oder generiere den Wrapper lokal mit: gradle wrapper
  exit /b 1
)

