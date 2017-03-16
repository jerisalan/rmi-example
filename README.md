# rmi-example
This is a simple program to understand and get started with RMI basics in Java.

# How to Run
### Compile source files
To compile the Java source files, run the javac command as follows:

javac *.java

This will lead to the .class files being generated in the same firectory as the source files.

### Start RMI Registry
To start the registry on the server, execute the rmiregistry command.

For example, on Linux:

rmiregistry &

For example, on Windows:

start rmiregistry

This command produces no output and is typically run in the background.

### Start Server and Client
Next, start the server using the command:

java CalculatorImpl

Once the registry and server are running, the client can be run in a new terminal as follows:

java CalculatorClient
