package learn.l2;

public class Fish implements iAnimalObject{
    private String name;
    private Integer age;
    private int sex;
    public void doEat() {
        System.out.println("The fish: doEat");

    }


    public void doSleep() {

    }

    @Override
    public String getName() {
        return "Fish";
    }
}
