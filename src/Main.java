public class Main {
    public static void main(String[] args) {

        Student Henry=new Student("Henry","Zhang",12,1);
        Teacher Alyssa=new Teacher("Alyssa","Zhang",7,0);


        System.out.println("Hello "+Henry.getName()+"!");



        Henry.doEat();
        System.out.println("Weight1: "+Henry.getWeight());

        Henry.doEat();
        System.out.println("Weight2: "+Henry.getWeight());

        Henry.doEat();
        System.out.println("Weight3: "+Henry.getWeight());


        Alyssa.doEat();
        System.out.println("Alyss Weight1: "+Alyssa.getWeight());
    }
}