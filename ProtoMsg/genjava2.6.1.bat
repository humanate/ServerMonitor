@echo off
rem �����ļ�
for /f "delims=" %%i in ('dir /b ".\*.proto"') do echo %%i
for /f "delims=" %%i in ('dir /b/a ".\*.proto"') do protoc2.6.1 --java_out=./ %%i
pause