@echo off
rem ╡Иурнд╪Ч
for /f "delims=" %%i in ('dir /b ".\*.proto"') do echo %%i
for /f "delims=" %%i in ('dir /b/a ".\*.proto"') do protoc3.5.1 --java_out=./ %%i
pause