all: bin/main.o bin/hello.o
	g++ bin/main.o bin/hello.o -o bin/app.exe

bin/main.o: src/main.cpp
	g++ -c src/main.cpp -o bin/main.o

bin/hello.o: src/hello.cpp
	g++ -c src/hello.cpp -o bin/hello.o

clean:
	rm -f bin/*.o bin/*.exe
