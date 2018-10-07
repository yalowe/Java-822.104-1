Hello World: How to Create Your First Java Program
==================================================


You need the following 2 software to create your first Java Program

1.  **The Java SE Development Kit**

Please refer our last tutorial to [download and install JDK](/install-java.html)

2.  **A Text Editor**

In this example, we'll use Notepad. it is a simple editor included with the Windows Operating System. You can use a different text editor like NotePad++

This video will help you code your first Java program.

Please be patient. The Video will load in some time. If you still face issue viewing video click [here](/faq.html)

Steps to Compile and Run first Java program
-------------------------------------------

**Step 1)** Open Notepad from Start menu by selecting Programs > Accessories > Notepad.

[![](https://www.guru99.com/images/java/111417_1102_Java11.png)](https://www.guru99.com/images/java/111417_1102_Java11.png)

**Step 2)** Create a Source Code for your Program

*   Declare a class with name A.
*   Declare the main method **public static void main(String args\[\]){**
*   Now Type the **System.out.println("Hello World");** which displays the text Hello World.

[![](https://www.guru99.com/images/java/111417_1102_Java12.png)](https://www.guru99.com/images/java/111417_1102_Java12.png)

 class A {
 public static void main(String args\[\]){
     System.out.println("Hello World");
 }
}

**Step 3)** Save the file as **FirstProgram.java** make sure to select file type as all files while saving the file in our working folder **C:\\workspace**

googletag.cmd.push(function(){googletag.display('div-gpt-ad-9092914-1');});

[![](https://www.guru99.com/images/java/111417_1102_Java13.png)](https://www.guru99.com/images/java/111417_1102_Java13.png)

**Step 4)** Open the command prompt. Go to Directory **C:\\workspace**. Compile the code using command,

javac FirstProgram.java

[![](https://www.guru99.com/images/java/111417_1102_Java14.png)](https://www.guru99.com/images/java/111417_1102_Java14.png)  

**Step 5)** If you look in your working folder, you can see that a file named **A.class** has been created.

[![](https://www.guru99.com/images/java/111417_1102_Java15.png)](https://www.guru99.com/images/java/111417_1102_Java15.png)

**Step 6)** To execute the code, enter the command java followed by the class name, as expected output **Hello World** is displayed now.

java A

[![](https://www.guru99.com/images/java/111417_1102_Java16.png)](https://www.guru99.com/images/java/111417_1102_Java16.png)

**Note:** Java is case sensitive Programming language. All code, commands, and file names should is used in consistent casing. **FirstProgram** is not same as **firstprogram.**

**Step 7)** If you copy and paste the same code in IDE like Eclipse the compiling and execution is done with the click of a button Using IDE is convenient and improves your efficiency but since you are learning Java, we recommend you stick to notepad.

[![](https://www.guru99.com/images/java/Eclipse.png)](https://www.guru99.com/images/java/Eclipse.png)
