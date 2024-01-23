# Scryper-Work

# **Section 1: Core Java**

**First Code "Hello World"** \

```java
class hello
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
}

```
> [!IMPORTANT]
> All programs in Java compile in the terminal, to do that we can use:\
> 
> 1) javac programa.java (compile y generate bytecode) 
> 2) java programa (execute bytecode [.class])


The meaning of each word in this code is:
- **public**: Indicates that the method is accessible from any other class. It is necessary for the system to find and execute the program.

- **static**: Indicates that the method belongs to the class itself, not to a specific instance. You can call the method without creating an object of the class.

- **void**: Indicates that the method does not return any value. In the case of main, it usually does not return results.

- **main**: Name of the method. It is the main entry point for the execution of a Java program.

- **String[] args**: Parameter that accepts an array of strings. Allows passing arguments to the program from the command line, storing them in this array called args.
/

**Data Type:**
Primitive:
- Integer: byte, short, int, long
- Float: double, float
- Character: store just one Unicode character. ([Code: UNICODE](https://www.ibm.com/docs/es/workload-automation/9.3.0?topic=SSGSPN_9.3.0/com.ibm.tivoli.itws.doc_9.3/apps/src_usr/awsauwhatsunic.htm))
- Boolean: V o F (deffault is F)

**Allowed Size:**
- int - 4bytes
- long - 8 bytes
- short - 2 bytes
- byte - 1 byte -> -2e7 to 2e7-1
- float - 4bytes (Exam: 5.6f)
- double - 8bytes
- char - 2bytes

> [!NOTE]
> - char ch = 'a' - always is between single quotes
> - The byte value is between -128 and 127. En caso en una operación ocurra un “desbordamiento”, java lo resta con 256 y ese sería el valor que tomaría en el byte.
> - In some case, if some operation cause a "desbordamiento", java will subtract the number with 256 and take this value.
> - To deffault, Java takes "float" to represent decimals.

**Values Convertions**
- Explicit
b = (byte) a; (Casting)

- Implicit
a = b (implicit convertion)

*Example of convertion:*
```java
char ch = 'a';
char result = (char)(ch + 1);
```
-> *Explain:* \
Since "char" is char and 1 is entire. A UNICODE value is assigned to "ch" that is 97, It was add to 1, resulted 98. Then since the conversion to char had been done, the 98 means "b" in UNICODE Code. For that, it result = b.\

## **Conditional and Loops**

**Conditional Statements:**\
Java supports conditional statements like if, else if, and else to execute different blocks of code based on specified conditions.
The syntax involves the if keyword followed by a condition. Optionally, else if and else blocks can be added for additional conditions.\

**Loops:**\
Java provides different types of loops, including for, while, and do-while, to repeatedly execute a block of code.
The for loop is commonly used for iterating over a range of values, while while and do-while loops are used for general looping constructs.\

**Ternary Operator:**\
Java features the ternary operator (? :) as a concise way to express a conditional statement in a single line.
It takes a boolean condition, evaluates it, and returns one of two expressions based on whether the condition is true or false.\

```java
int a = 3;
int b = 6;
int result = (a > 5 && b < 10) ? a : b;
System.out.println(result);
```

**Link de referencias:**
> - [This was done with Markdown Code](https://docs.github.com/es/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
> - [Markdown for code](https://docs.github.com/es/get-started/writing-on-github/working-with-advanced-formatting/creating-and-highlighting-code-blocks)
