public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Dogs can't fly");
    }
}
