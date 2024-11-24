package learn.l2;

public class Dog implements iAnimalObject{
    private String name;
    private Integer age;
    private int sex;
    public void doEat() {
        System.out.println("The dog: doEat");

    }


    public void doSleep() {

    }

    @Override
    public String getName() {
        return "Dog";
    }
}
