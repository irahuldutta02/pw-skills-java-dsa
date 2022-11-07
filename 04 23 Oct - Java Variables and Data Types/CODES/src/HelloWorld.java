// running file from command line and passing arguments
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(args[0] + " ");
        System.out.println(args[1]);
    }
}

// 1. cd src (Enter)
// 2. javac ./HelloWorld.java (Enter)
// 3. java HelloWorld one two (Enter)