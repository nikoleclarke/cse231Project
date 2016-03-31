@ECHO OFF
Color 0b
Title Java Program Tool
SET currentDirectory=%CD%

:loopStart
CLS
Color 0a
CD %currentDirectory%

SET /P input=Enter compile, execute, javadoc, or quit:
Color 0b

IF /I "%input%"=="compile" CALL compile.bat
IF /I "%input%"=="execute" CALL execute.bat
IF /I "%input%"=="javadoc" CALL javadoc.bat
IF /I "%input%"=="quit" EXIT

PAUSE

GOTO :loopStart