package learn.l3;

import learn.l2.*;

public class Main {


    public static void main(String[] args) {



        SunFish sunFish = new SunFish();
        SunFish sunFish2= sunFish;
        SunFish sunFish3= sunFish;
        SunFish sunFish4= sunFish;

        sunFish4.setColor("r");

        //handle
        Fish fish=sunFish;

        System.out.println("--------------------------------");
        System.out.println("Sunfish getName:"+sunFish3.getName());
//        System.out.println("Fish getName:"+fish.getName());
        System.out.println("Sunfish color:"+sunFish.getColors("b"));
        System.out.println("--------------------------------");

    }
}
