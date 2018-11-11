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
