/*

- James Arthur Goseling - 1995
- SUN Microsystems
- Oracle

JVM, JRE & JDK

JVM - Java Virtual Machine
JRE - Java Runtime Environment
JDK - Java Development Kit

JVM:
It acts as platform.

Load the code
Verify the code
Provides JRE
Executes the code

Platform Independence:
C/C++ Programs -> Interact directly with OS
Java Program -> Interacts with JVM
JVM -> Platform Dependent

Byte Code:
Compiled code id Byte Code

file.c  -> a.out

Prog.java   -> Prog.class (Byte Code)

javac Prog.java

*/

class Program
{
    public static void main(String[] args) { //Command Line Argument
        System.out.println("Hello World");
        System.out.print("Hello Coders");
    }
}

/*
Class & Object:



*/

/*
class Demo {
    void fun() {
        System.out.println("Demo Class Method");
    }
}

class DriverDemo {
    public static void main(String[] args) {
        
        Demo ob = new Demo();
        ob.fun();
    }
}
*/
/*
Data Types:
1) Primitive - int, float, byte, short, long, boolean, char, float, double
2) Non - Primitive - Arrays, Strings etc

*/

class Test {
    int x; //instance variable
    static int y; //static variable or class variable
    void show() {
        System.out.println("Data: " + x + " " + y);
    }
}

class DriveTest {
    public static void main(String[] args) {
        Test ob1 = new Test();
        Test ob2 = new Test();
        ob1.x = 20;
        ob1.y = 40;
        ob2.x = 30;
        ob2.y = 50;
        ob1.show();
        ob2.show();
    }
}