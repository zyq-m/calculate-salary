## About The Project

Calculate Salary is a program to calculate employee's salary; gross salary and net salary. 
This project is build on top of Java and implementing Object Oriented Programming (OOP).

## Tools and Technologies

During the development process I've used:

- Java
- Netbeans IDE
- OOP concept
- Java Swing GUI

## Installation

1. Install [Netbeans](https://www3.ntu.edu.sg/home/ehchua/programming/howto/netbeans_howto.html)
2. Clone or download this repository
3. Open the project in your Netbeans IDE

## Problems During Development Process

### 1. Null pointer exception

During the development process, I got this error message ``java.lang.NullPointerException`` multiple times. This because I forgot to specify the array size.
I've used ``ArrayList`` instead of traditional array because I can't predict how many employee object should be stored in an array.

```java
private ArrayList<Employee> employees = new ArrayList<Employee>();
```

### 2. Push code to GitHub

It is my first time push the code through Netbeans IDE. Unlike in VScode I can push through terminal and I find it easy to use. 
The problem is Netbeans didn't authorized my github account. I've been searching through Internet and found this [solution](https://stackoverflow.com/questions/10475726/git-receive-pack-not-permitted-on-push#comment35029432_17265594).

## Connect with Me

- [Twitter](https://twitter.com/zyq__m)
- Email: haziq.musa02@gmail.com

## Acknowlegements

- [Java OOP](https://www.javatpoint.com/java-oops-concepts)
- [Java swing GUI](https://www.javatpoint.com/java-swing)
- [Array of Java object](https://stackoverflow.com/questions/3982550/creating-an-arraylist-of-objects)
- [Fix null pointer exception](https://stackoverflow.com/questions/218384/what-is-a-nullpointerexception-and-how-do-i-fix-it)
- [Retrieve value from JComboBox](https://stackoverflow.com/questions/3496532/retrieve-text-from-jcombobox)
- [Disable JTextField](https://stackhowto.com/how-to-disable-jtextarea-and-jtextfield/)
- [Unselect JRadioButton](https://stackoverflow.com/questions/2408689/unselecting-radiobuttons-in-java-swing)
- [Netbeans installation](https://www3.ntu.edu.sg/home/ehchua/programming/howto/netbeans_howto.html)
- [Problem pushing code to GitHub](https://stackoverflow.com/questions/10475726/git-receive-pack-not-permitted-on-push#comment35029432_17265594)

