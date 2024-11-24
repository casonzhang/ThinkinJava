package learn.l2;

public class Main {


    public static void main(String[] args) {

        Person Henry=new Person("Henry","Zhang",12,1);
        Person Alyssa=new Person("Alyssa","Zhang",12,1);
        Fish fish=new Fish();
        Dog dog=new Dog();

//        iAnimal iHenry=(iAnimal)Henry;



//        iHenry.doEat();
        iAnimal [] animals={Henry,fish,dog};
        for (iAnimal animal:animals){
            animal.doEat();
        }
//
        iObject [] objects={Henry,Alyssa};
        for (iObject object:objects){
            System.out.println(object.getName());
        }

        iAnimalObject [] animalObjects={Henry,fish,dog};
        for (iAnimalObject animalObject:animalObjects){
            System.out.println(animalObject.getName());
            animalObject.getName();
        }

    }
}
