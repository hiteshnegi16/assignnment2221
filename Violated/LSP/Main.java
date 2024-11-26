// Usage
public class Main {
    public static void main(String[] args) {
        Bird bird = new Ostrich();
        bird.fly(); // This will throw an exception, violating LSP
    }
}
