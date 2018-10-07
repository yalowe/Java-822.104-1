Java Virtual Machine (JVM) & its Architecture
=============================================


What is JVM?
------------

JVM is a engine that provides runtime environment to drive the Java Code or applications. It converts Java bytecode into machines language. JVM is a part of JRE(Java Run Environment). It stands for Java Virtual Machine

*   In other programming languages, the compiler produces machine code for a particular system. However, Java compiler produces code for a Virtual Machine known as Java Virtual Machine.
*   First, Java code is complied into bytecode. This bytecode gets interpreted on different machines
*   Between host system and Java source, Bytecode is an intermediary language.
*   JVM is responsible for allocating memory space.

[![Working of Java Virtual Machine(JVM) & its Architecture](https://www.guru99.com/images/java/052016_0614_WorkingofJa10.jpg "Working of Java Virtual Machine(JVM) & its Architecture")](/https://www.guru99.com/images/java/052016_0614_WorkingofJa10.jpg)

In this tutorial, you will learn-

*   [What is JVM?](#3)
*   [JVM Architecture](#7)
*   [Software Code Compilation & Execution process](#6)
*   [C code Compilation and Execution process](#1)
*   [Java code Compilation and Execution process](#2)
*   [Why is Java both interpreted and Compiled Language?](#4)
*   [Why is Java slow?](#5)

JVM Architecture
----------------

Let's understand the Architecture of JVM. It contains classloader, memory area, execution engine etc.

[![Working of Java Virtual Machine(JVM) & its Architecture](https://www.guru99.com/images/1/2.png "Working of Java Virtual Machine(JVM) & its Architecture")](/https://www.guru99.com/images/1/2.png)

**1) ClassLoader**

The class loader is a subsystem used for loading class files. It performs three major functions viz. Loading, Linking, and Initialization.

**2) Method Area**

JVM Method Area stores class structures like metadata, the constant runtime pool, and the code for methods.

**3) Heap**

All the Objects, their related instance variables, and arrays are stored in the heap. This memory is common and shared across multiple threads.

**4) JVM language Stacks**

Java language Stacks store local variables, and it’s partial results. Each thread has its own JVM stack, created simultaneously as the thread is created. A new frame is created whenever a method is invoked, and it is deleted when method invocation process is complete.

**5)  PC Registers**

PC register store the address of the Java virtual machine instruction which is currently executing. In Java, each thread has its separate PC register.

**6) Native Method Stacks**

Native method stacks hold the instruction of native code depends on the native library. It is written in another language instead of Java.

**7) Execution Engine**

It is a type of software used to test hardware, software, or complete systems. The test execution engine never carries any information about the tested product.

**8) Native Method interface**

The Native Method Interface is a programming framework. It allows Java code which is running in a JVM to call by libraries and native applications.

googletag.cmd.push(function(){googletag.display('div-gpt-ad-9092914-1');});

**9) Native Method Libraries**

Native Libraries is a collection of the Native Libraries(C, C++) which are needed by the Execution Engine.

Software Code Compilation & Execution process
---------------------------------------------

In order to write and execute a software program, you need the following

**1) Editor**  – To type your program into, a notepad could be used for this

**2) Compiler**  – To convert your high language program into native machine code

**3) Linker**  – To combine different program files reference in your main program together.

**4) Loader**  – To load the files from your secondary storage device like Hard Disk, Flash Drive, CD into RAM for execution. The loading is automatically done when you execute your code.

**5) Execution** – Actual execution of the code which is handled by your OS & processor.

With this background, refer the following video & learn the working and architecture of the Java Virtual Machine.

Please be patient. The Video will load in some time. If you still face issue viewing video click [here](/faq.html#1)  
  

C code Compilation and Execution process
----------------------------------------

To understand the Java compiling process in Java. Let's first take a quick look to compiling and linking process in C.

Suppose in the main, you have called two function f1 and f2. The main function is stored in file a1.c.

[![Working of Java Virtual Machine(JVM) & its Architecture](https://www.guru99.com/images/java/052016_0614_WorkingofJa1.jpg "Working of Java Virtual Machine(JVM) & its Architecture")](/https://www.guru99.com/images/java/052016_0614_WorkingofJa1.jpg)

Function f1 is stored in a file a2.c

[![Working of Java Virtual Machine(JVM) & its Architecture](https://www.guru99.com/images/java/052016_0614_WorkingofJa2.jpg "Working of Java Virtual Machine(JVM) & its Architecture")](/https://www.guru99.com/images/java/052016_0614_WorkingofJa2.jpg)

Function f2 is stored in a file a3.c

[![Working of Java Virtual Machine(JVM) & its Architecture](https://www.guru99.com/images/java/052016_0614_WorkingofJa3.jpg "Working of Java Virtual Machine(JVM) & its Architecture")](/https://www.guru99.com/images/java/052016_0614_WorkingofJa3.jpg)

All these files, i.e., a1.c, a2.c, and a3.c, is fed to the compiler. Whose output is the corresponding object files which are the machine code.

[![Working of Java Virtual Machine(JVM) & its Architecture](https://www.guru99.com/images/java/052016_0614_WorkingofJa4.jpg "Working of Java Virtual Machine(JVM) & its Architecture")](/https://www.guru99.com/images/java/052016_0614_WorkingofJa4.jpg)

The next step is integrating all these object files into a single .exe file with the help of linker. The linker will club all these files together and produces the .exe file.

[![Working of Java Virtual Machine(JVM) & its Architecture](https://www.guru99.com/images/java/052016_0614_WorkingofJa5.jpg "Working of Java Virtual Machine(JVM) & its Architecture")](/https://www.guru99.com/images/java/052016_0614_WorkingofJa5.jpg)

During program run, a loader program will load a.exe into the RAM for the execution.

[![Working of Java Virtual Machine(JVM) & its Architecture](https://www.guru99.com/images/java/052016_0614_WorkingofJa6.jpg "Working of Java Virtual Machine(JVM) & its Architecture")](/https://www.guru99.com/images/java/052016_0614_WorkingofJa6.jpg)

Java code Compilation and Execution in Java VM
----------------------------------------------

Let's look at the process for JAVA. In your main, you have two methods f1 and f2.

*   The main method is stored in file a1.java
*   f1 is stored in a file as a2.java
*   f2 is stored in a file as a3.java

[![Working of Java Virtual Machine(JVM) & its Architecture](https://www.guru99.com/images/java/052016_0614_WorkingofJa7.jpg "Working of Java Virtual Machine(JVM) & its Architecture")](/https://www.guru99.com/images/java/052016_0614_WorkingofJa7.jpg)

The compiler will compile the three files and produces 3 corresponding .class file which consists of BYTE code. **Unlike C, no linking is done**.

The Java VM or Java Virtual Machine resides on the RAM. During execution, using the class loader the class files are brought on the RAM. The BYTE code is verified for any security breaches.

googletag.cmd.push(function(){googletag.display('div-gpt-ad-9092914-2');});

[![Working of Java Virtual Machine(JVM) & its Architecture](https://www.guru99.com/images/java/052016_0614_WorkingofJa8.jpg "Working of Java Virtual Machine(JVM) & its Architecture")](/https://www.guru99.com/images/java/052016_0614_WorkingofJa8.jpg)

Next, the execution engine will convert the Bytecode into Native machine code. This is just in time compiling. It is one of the main reason why Java is comparatively slow.

[![Working of Java Virtual Machine(JVM) & its Architecture](https://www.guru99.com/images/java/052016_0614_WorkingofJa9.jpg "Working of Java Virtual Machine(JVM) & its Architecture")](/https://www.guru99.com/images/java/052016_0614_WorkingofJa9.jpg)

**NOTE:** **JIT** or Just-in-time compiler is the part of the Java Virtual Machine (JVM). It interprets part of the Byte Code that has similar functionality at the same time.

Why is Java both Interpreted and Compiled Language?
---------------------------------------------------

Programming languages are classified as

*   Higher Level Language Ex. C++, Java
*   Middle-Level Languages Ex. C
*   Low-Level Language Ex Assembly
*   finally the lowest level as the Machine Language.

A **compiler** is a program which converts a program from one level of language to another. Example conversion of C++ program into machine code.

The java compiler converts high-level java code into bytecode (which is also a type of machine code).

An **interpreter** is a program which converts a program at one level to another programming language at the **same level.** Example conversion of Java program into C++

In Java, the Just In Time Code generator converts the bytecode into the native machine code which are at the same programming levels.

Hence, Java is both compiled as well as interpreted language.

Why is Java slow?
-----------------

The two main reasons behind the slowness of Java are

1.  **Dynamic Linking:** Unlike C, linking is done at run-time, every time the program is run in Java.
2.  **Run-time Interpreter:** The conversion of byte code into native machine code is done at run-time in Java which furthers slows down the speed

However, the latest version of Java has addressed the performance bottlenecks to a great extent.

**Summary**:

*   JVM or Java Virtual Machine is the engine that drives the Java Code. It converts Java bytecode into machines language.
*   In JVM, Java code is compiled to bytecode. This bytecode gets interpreted on different machines
*   JIT or Just-in-time compiler is the part of the Java Virtual Machine (JVM). It is used to speed up the execution time
*   In comparison to other compiler machines, Java may be slow in execution.