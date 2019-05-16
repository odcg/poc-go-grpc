set PATH=C:\olivier.dugast\application\TDM-GCC-64\bin;%PATH%
go build -buildmode=c-shared -o target/go/lib-prime.so \\main\go\prime.go
go build -buildmode=c-shared -o target/go/lib-add.so src\main\go\Add.go
c:\olivier.dugast\application\go\bin\go.exe

runtime.main_main·f: function main is undeclared in the main package
