public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("VOV");

    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
