What is Java Platform
=====================================================


What is Java?
-------------

Java is a programming language and a computing platform for application development. It was first released by Sun Microsystem in 1995 and later acquired by Oracle Corporation. It is one of the most used programming languages.

What is Java Platform?
----------------------

Java platform is a collection of programs that help to develop and run programs written in the Java programming language. Java platform includes an execution engine, a compiler, and a set of libraries. JAVA is platform-independent language. It is not specific to any processor or operating system.

To understand JAVA programming language, we need to understand some basic concept of how a computer program can run a command and execute the action.

What is PC?
-----------

A computer is an electronic device capable of performing computations, and we all know that it is composed of a monitor, keyboard, mouse, and memory to store information. But the most important component of the computer is a PROCESSOR. Which does all thinking of computer, but the question is how the computer does this thinking? How does it understand text, images, videos, etc.?

[![What is Java Platform?](https://www.guru99.com/images/ccna/061516_1256_WhatisJava1.png "What is Java Platform?")](/https://www.guru99.com/images/ccna/061516_1256_WhatisJava1.png)

What is Assembly Language?
--------------------------

The computer is an electronic device, and it can only understand electronic signals or binary signals. For example, the 5-volt electronic signal may represent binary number 1 while 0 volts may represent binary number 0. So your PC is continuously bombarded with these signals.

[![What is Java Platform?](https://www.guru99.com/images/ccna/061516_1256_WhatisJava2.png "What is Java Platform?")](/https://www.guru99.com/images/ccna/061516_1256_WhatisJava2.png)

Eight bits of such signals are group together to interpret Text, numerical and symbols.

[![What is Java Platform?](https://www.guru99.com/images/ccna/061516_1256_WhatisJava3.png "What is Java Platform?")](/https://www.guru99.com/images/ccna/061516_1256_WhatisJava3.png)

For example, the # symbol is identified by computer as 10101010. Similarly, the pattern for adding a function is represented by 10000011.

[![What is Java Platform?](https://www.guru99.com/images/ccna/061516_1256_WhatisJava4.png "What is Java Platform?")](/https://www.guru99.com/images/ccna/061516_1256_WhatisJava4.png)

This is known as 8-bit computing. Current day processor is capable of decoding 64-bit time. But what is the relation of this concept with the programming language JAVA? Let understand these as an example.

Suppose if you want to tell the computer to add two number (1+2) which is represented by some binary numbers (10000011), how are you going to tell the computer? Yes, we going to use assembly language to get our code executed.

**"Assembly Language is the most elementary form of software development languages."**

We are going to give the command to a computer in this format as shown below. Your code to add two numbers in this language would be in this order.

[![What is Java Platform?](https://www.guru99.com/images/ccna/061516_1256_WhatisJava5.png "What is Java Platform?")](/https://www.guru99.com/images/ccna/061516_1256_WhatisJava5.png)

*   Store number 1 at memory location say A
*   Store number 2 at memory location say B
*   Add contents of Location A & B
*   Store results

But how are we going to do this? Back in 1950's when computers were huge and consumed a great deal of power, you would convert your assembly code into corresponding machine code to 1 and 0's using mapping sheets. Later this code will be punched into the machine cards and feed to the computer. The computer will read these code and execute the program. These would be a long process then until ASSEMBLER came to help.


What are Assembler and Compiler?
--------------------------------

With the advancement in technology i/o devices were invented, you could directly type your program into the PC using a program called ASSEMBLER. It converts it into corresponding machine code (110001..) and feeds to your processor. So coming back to our example addition of (1+2), the assembler will convert this code into machine code and give the output.

[![What is Java Platform?](https://www.guru99.com/images/ccna/061516_1256_WhatisJava6.png "What is Java Platform?")](/https://www.guru99.com/images/ccna/061516_1256_WhatisJava6.png)

That apart, you will also have to make calls to create Operating System provided functions to display the output of the code.

But alone assembler is not involved in this whole process; it also requires the compiler to compile the long code into a small chunk of codes. With advancement in software development languages, this entire assembly code could shrink into just one line **print f 1+2 A** with the help of software called COMPILER. It is used to convert your c language code into assembly code, and the assembler converts it into corresponding machine code, and this machine code will be transmitted to the processor. The most common processor used in PC or Computers are Intel processor.

[![What is Java Platform?](https://www.guru99.com/images/ccna/061516_1256_WhatisJava7.png "What is Java Platform?")](/https://www.guru99.com/images/ccna/061516_1256_WhatisJava7.png)

Though present-day compilers come bundled with assembler can directly convert your higher language code into machine code.

Now, suppose Windows operating system is running on this Intel processor, a combination of Operating System plus the processor is called the PLATFORM. The most common platform in the world is the Windows, and Intel called the Wintel Platform. The other popular platforms are AMD and [Linux,](/unix-linux-tutorial.html) Power PC, and Mac OS X.

Now, with a change in processor, the assembly instructions will also change. For example the

*   Add instruction in Intel may be called ADDITION for AMD
*   OR Math ADD for Power PC

And obviously, with a change in Operating System, the level and nature of O.S level calls will also change.

As a developer, I want my software program to work on all platforms available, to maximize my revenues. So I would have to buy separate compilers which convert my print f command into the native machine code.

[![What is Java Platform?](https://www.guru99.com/images/ccna/061516_1256_WhatisJava8.png "What is Java Platform?")](/https://www.guru99.com/images/ccna/061516_1256_WhatisJava8.png)

But compilers come expensive, and there is a chance of compatibility issues. So buying and installing a separate compiler for different O.S and processor is not feasible. So, what can be an alternative solution? Enter Java language.

How Java Virtual Machine works?
-------------------------------

By using **Java Virtual Machine**, this problem can be solved. But how it works on different processors and O.S. Let's understand this process step by step.

[![What is Java Platform?](https://www.guru99.com/images/ccna/061516_1256_WhatisJava9.png "What is Java Platform?")](/https://www.guru99.com/images/ccna/061516_1256_WhatisJava9.png)

**Step 1)** The code to display addition of two numbers is System.out.println(1+2), and saved as .java file.

**Step 2)** Using the java compiler the code is converted into an intermediate code called the **bytecode.** The output is a **.class file.**

**Step 3)** This code is not understood by any platform, but only a virtual platform called the **Java Virtual Machine.**

**Step 4)** This Virtual Machine resides in the RAM of your operating system. When the Virtual Machine is fed with this bytecode, it identifies the platform it is working on and converts the bytecode into the native machine code.

In fact, while working on your PC or browsing the web whenever you see either of these icons be assured the java virtual machine is loaded into your RAM. But what makes java lucrative is that code once compiled can run not only on all PC platforms but also mobiles or other electronic gadgets supporting java.

Hence,

**"Java is a programming language as well as a Platform"**

How is Java Platform Independent?
---------------------------------

Like C compiler, Java compiler does not produce native executable code for a particular machine. Instead, Java produces a unique format called bytecode. It executes according to the rules laid out in the virtual machine specification.

Bytecode is understandable to any JVM installed on any OS. In short, the java source code can run on all operating systems.
