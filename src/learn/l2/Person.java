package learn.l2;

public class Person implements iAnimalObject{
    private String firstname;
    private String lastname;
    private Integer age;
    private int sex;
    public int weight=50;
    public Person(String firstname, String lastname, int age, int sex){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.sex=sex;

    }
    public String getName(){
        return firstname +" , "+ lastname;
    }
    public int getAge(){
        return age;
    }
    public void doEat(){
        if (sex==1){
            weight=weight+5;}
        else{
            weight =weight+ 1;
        }

        System.out.println(getName()+": doEat");

    }
    public int getWeight(){
        return weight;
    }
    public void doSleep(){

    }
}
