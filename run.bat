<# : chooser.bat
:: file chooser taken from
:: http://stackoverflow.com/a/15885133/1683264

@echo off
set arg1=%1
setlocal

for /f "delims=" %%I in ('powershell -noprofile "iex (${%~f0} | out-string)"') do (
    :: copies user selected file to Solutions.java then runs the code
    copy %%~I %%~pISolution.java >NUL
    javac %%~pISolution.java
    java -classpath %%~pI Solution

    DEL %%~pISolution.class
    DEL %%~pISolution.java
)
goto :EOF

: end Batch portion / begin PowerShell hybrid chimera #>

Add-Type -AssemblyName System.Windows.Forms
$f = new-object Windows.Forms.OpenFileDialog
$f.InitialDirectory = pwd
$f.Filter = "Java Files (*.java)|*.java|All Files (*.*)|*.*"
$f.ShowHelp = $true
$f.Multiselect = $false
[void]$f.ShowDialog()
if ($f.Multiselect) { $f.FileNames } else { $f.FileName }
