How to Download & Install Java JDK in Windows
===============================================

This Java Development Kit(JDK) allows you to code and run Java programs. It's possible that you install multiple JDK versions on the same PC. But Its recommended that you install only latest version.

Following are steps to install Java in Windows

**Step 1)** Go to [link](http://www.oracle.com/technetwork/java/javase/downloads/index.html). Click on Download JDK. For java latest version.

[![](https://www.guru99.com/images/java/111417_1107_Java21.png)](https://www.guru99.com/images/java/111417_1107_Java21.png)

**Step 2)** Next,

1.  Accept License Agreement
2.  Download latest Java JDK for your version(32 or 64 bit) of java for Windows.

[![](https://www.guru99.com/images/java/111417_1107_Java22.png)](https://www.guru99.com/images/java/111417_1107_Java22.png)

**Step 3)** Once the download is complete, run the exe for install JDK. Click Next

[![](https://www.guru99.com/images/java/111417_1107_Java23.png)](https://www.guru99.com/images/java/111417_1107_Java23.png)

**Step 4)** Once installation is complete click Close

[![](https://www.guru99.com/images/java/111417_1107_Java24.png)](https://www.guru99.com/images/java/111417_1107_Java24.png)

How to set Environment Variables in Java: Path and Classpath
------------------------------------------------------------

The PATH variable gives the location of executables like javac, java etc. It is possible to run a program without specifying the PATH but you will need to give full path of executable like _**C:\\Program Files\\Java\\jdk1.8.0\_131\\bin\\javac A.java**_ instead of simple _**javac A.java**_

The CLASSPATH variable gives location of the Library Files.

Let's look into the steps to set the PATH and CLASSPATH

**Step 1)** Right Click on the My Computer and Select the properties

[![](https://www.guru99.com/images/java/111417_1107_Java25.png)](https://www.guru99.com/images/java/111417_1107_Java25.png)

**Step 2)** Click on advanced system settings

[![](https://www.guru99.com/images/java/111417_1107_Java26.png)](https://www.guru99.com/images/java/111417_1107_Java26.png)

**Step 3)** Click on Environment Variables

[![](https://www.guru99.com/images/java/111417_1107_Java27.png)](https://www.guru99.com/images/java/111417_1107_Java27.png)

googletag.cmd.push(function(){googletag.display('div-gpt-ad-9092914-1');});

**Step 4)** Click on new Button of User variables

[![](https://www.guru99.com/images/java/111417_1107_Java28.png)](https://www.guru99.com/images/java/111417_1107_Java28.png)

**Step 5)** Type PATH in the Variable name.

[![](https://www.guru99.com/images/java/111417_1107_Java29.png)](https://www.guru99.com/images/java/111417_1107_Java29.png)

**Step 6)** Copy the path of bin folder which is installed in JDK folder.

[![](https://www.guru99.com/images/java/111417_1107_Java210.png)](https://www.guru99.com/images/java/111417_1107_Java210.png)

**Step 7)** Paste Path of bin folder in Variable value and click on OK Button.

[![](https://www.guru99.com/images/java/111417_1107_Java211.png)](https://www.guru99.com/images/java/111417_1107_Java211.png)

**Note:** In case you already have a PATH variable created in your PC, edit the PATH variable to

PATH = <JDK installation directory>\\bin;%PATH%;

Here, %PATH% appends the existing path variable to our new value

**Step 8)** You can follow a similar process to set CLASSPATH.

[![](https://www.guru99.com/images/java/1.png)](https://www.guru99.com/images/java/1.png)  

**Note:** In case you java installation does not work after installation, change classpath to

CLASSPATH = <JDK installation directory>\\lib\\tools.jar;

**Step 9)** Click on OK button

[![](https://www.guru99.com/images/java/111417_1107_Java213.png)](https://www.guru99.com/images/java/111417_1107_Java213.png)

**Step 10)** Go to command prompt and type javac commands.

If you see a screen like below, Java is installed.

[![](https://www.guru99.com/images/java/111417_1107_Java214.png)](https://www.guru99.com/images/java/111417_1107_Java214.png)
