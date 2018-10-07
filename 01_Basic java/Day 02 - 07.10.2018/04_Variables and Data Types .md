Java Variables and Data Types 
==========================================


What is a Variable?
-------------------

A variable can be thought of as a container which holds value for you, during the life of a Java program. Every variable is assigned a **data type** which designates the type and quantity of value it can hold.

In order to use a variable in a program you to need to perform 2 steps

1.  Variable Declaration
2.  Variable Initialization

In this tutorial, you will learn-

*   [Variable Declaration](#4)
*   [Variable Initialization](#5)
*   [Types of variables](#7)
*   [Data Types in Java](#2)
*   [Type Conversion & Type Casting](#6)

Variable Declaration:
---------------------

To declare a variable, you must specify the data type & give the variable a unique name.  
 

[![Java Variables and Data Types](https://www.guru99.com/images/uploads/2012/07/VriableTypeNameDeclaration.jpg "Java Variables and Data Types")](https://www.guru99.com/images/uploads/2012/07/VriableTypeNameDeclaration.jpg)

Examples of other Valid Declarations are
```java
int a,b,c;

float pi;

double d;

char a;
```
Variable Initialization:
------------------------

To initialize a variable, you must assign it a valid value.  
 

[![Java Variables and Data Types](https://www.guru99.com/images/uploads/2012/07/java-varibale-initialization.jpg "Java Variables and Data Types")](https://www.guru99.com/images/uploads/2012/07/java-varibale-initialization.jpg)

Example of other Valid Initializations are
```java
pi =3.14f;

do =20.22d;

a=’v’;
```
You can combine variable declaration and initialization.  
 

[![Java Variables and Data Types](https://www.guru99.com/images/uploads/2012/07/intialization__declaration.jpg "Java Variables and Data Types")](https://www.guru99.com/images/uploads/2012/07/intialization__declaration.jpg)

Example :
```java

int a=2,b=4,c=6;

float pi=3.14f;

double do=20.22d;

char a=’v’;
```
Types of variables
------------------

In Java, there are three types of variables:

1.  Local Variables
2.  Instance Variables
3.  Static Variables

### 1) Local Variables

Local Variables are a variable that are declared inside the body of a method.

### 2) Instance Variables

Instance variables are defined without the STATIC keyword .They are defined Outside a method declaration. They are Object specific and are known as instance variables.


### 3) Static Variables

Static variables are initialized only once, at the start of the program execution. These variables should be initialized first, before the initialization of any instance variables.

Example: Types of Variables in Java
-----------------------------------
```java
class Teat {
    int data = 99; //instance variable  
    static int a = 1; //static variable  
    void method() {
        int b = 90; //local variable  
    }
}
```
Data Types in Java
------------------

Data types classify the different values to be stored in the variable. In java, there are two types of data types:

1.  Primitive Data Types
2.  Non-primitive Data Types

[![Java Data Types](https://www.guru99.com/images/java/DataTypes.png "Java Data Types")](https://www.guru99.com/images/java/DataTypes.png)

### Primitive Data Types

Primitive Data Types are predefined and available within the Java language. Primitive values do not share state with other primitive values.

There are 8 primitive types: byte, short, int, long, char, float, double, and boolean 

**Textual Data Type**

* char (2 bytes)

**Logical**

* boolean (1 byte) (true/false)
* **Floating Data Type**

* float (4 bytes)

* double (8 bytes)

**Integer data types**

* byte (1 byte)
* short (2 bytes)
* int (4 bytes)
* long (8 bytes)

[![Java Variables and Data Types](https://www.guru99.com/images/uploads/2012/07/java-varaibles.jpg "Java Variables and Data Types")](https://www.guru99.com/images/uploads/2012/07/java-varaibles.jpg)



**Points to Remember:**

*   All numeric data types are signed(+/-).
*   The size of data types remain the same on all platforms (standardized)
*   char data type in Java is 2 bytes because it uses **UNICODE** character set. By virtue of it, Java supports internationalization. UNICODE is a character set which covers all known scripts and language in the world

Java Variable Type Conversion & Type Casting
--------------------------------------------

A variable of one type can receive the value of another type. Here there are 2 cases -  

**Case 1)** Variable of smaller capacity is be assigned to another variable of bigger capacity.  
 

[![Java Variables and Data Types](https://www.guru99.com/images/uploads/2012/07/java-type-conversion.jpg "Java Variables and Data Types")](https://www.guru99.com/images/uploads/2012/07/java-type-conversion.jpg)

This process is Automatic, and non-explicit is known as **_Conversion_**  

**Case 2)** Variable of larger capacity is be assigned to another variable of smaller capacity  
 

[![Java Variables and Data Types](https://www.guru99.com/images/uploads/2012/07/java-type-cast-operator.jpg "Java Variables and Data Types")](https://www.guru99.com/images/uploads/2012/07/java-type-cast-operator.jpg)

In such cases, you have to explicitly specify the **type cast operator. This process is known as _Type Casting._**  
  
In case, you do not specify a type cast operator; the compiler gives an error. Since this rule is enforced by the compiler, it makes the programmer aware that the conversion he is about to do may cause some loss in data and prevents **accidental losses.**  
  
**Example: To Understand Type Casting**  
  
**Step 1)** Copy the following code into an editor.
```java
class Demo {
 public static void main(String args\[\]) {
  byte x;
  int a = 270;
  double b = 128.128;
  System.out.println("int converted to byte");
  x = (byte) a;
  System.out.println("a and x " + a + " " + x);
  System.out.println("double converted to int");
  a = (int) b;
  System.out.println("b and a " + b + " " + a);
  System.out.println("\\ndouble converted to byte");
  x = (byte)b;
  System.out.println("b and x " + b + " " + x);
 }
}
```
**Step 2)** Save, Compile & Run the code.  

**Output:**
```
int converted to byte
a and x 270 14
double converted to int
b and a 128.128 128

double converted to byte
b and x 128.128 -128
```
