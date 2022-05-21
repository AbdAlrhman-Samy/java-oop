# Notes on: Hello Java

We create a **.java** file for out main class, compile it, then run the **.class** file

```
javac HelloWorld.java
java HelloWorld
```

---

For the main method (which, to my understanding, is like the int main() function in C++)

```
public static void main(String[] args)
```

- **public** : Means _main()_ method is accessible globally available.
- **static** : The _main()_ method is static so that JVM can invoke it without instantiating the class.
- **void** : No return value.