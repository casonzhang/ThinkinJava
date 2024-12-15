package learn.l3;

import learn.l2.Fish;

public class SunFish extends Fish {

    public String color = "r";

//    private String name="PName";

    @Override
    public String getName() {

        return "A " + getColors(color) + " " + super.getName() ;//+ "   name:" + name;
    }

    public String getColors(String color) {

        switch (color) {
            case "r":
                return "red";
            case "b":
                return "blue";
            case "g":
                return "green";
            default:
                return "other";
        }

    }

    public void setColor(String color) {

        this.color=color;

    }

}
