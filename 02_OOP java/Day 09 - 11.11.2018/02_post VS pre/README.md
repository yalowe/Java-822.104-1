# Post VS pre inc / dec


<table>


<tr>
<td></td>
<td>PRE</td>
<td>POST</td>
</tr>


<tr>
<td>Syntax</td>
<td>

```java
int num;
++num;
```

</td>
<td>


```java
int num;
num++;
```

</td>


<tr>
<td>Action value</td>
<td>

```java
int n1=0;
int n2=0;
		
n2=n2+1;
n1=n2;
```
is equal to:

```java
int n1=0;
int n2=0;
		
n1=++n2;
```

</td>
<td>


```java
int n1=0;
int n2=0;
		
n1=n2;
n2=n2+1;
```
is equal to:

```java
int n1=0;
int n2=0;
		
n1=n2++;
```


</td>
</tr>
</table>


### Example of code:
```java
public class App {

	public static void main(String[] args) {
	 		
		
		int num=0;

        //--------post-----------
		System.out.print(num++);

        //--------pre-----------
		System.out.print(++num);
	}

}
```
is equal to:
```java
public class App {

	public static void main(String[] args) {
	 		
		
		int num=0;

        //--------post-----------
		System.out.print(num);
        num=num+1;


        //--------pre-----------
        num=num+1;
		System.out.print(num);
	}

}
```

