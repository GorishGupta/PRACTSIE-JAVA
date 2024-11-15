package OOPS;

public class Dogs extends animal {

    String name;
    String voice;
    String color;

    public Dogs(){};

    public Dogs(
        String name, String voice, String color,
        int legs, boolean tail, int food
    ){
        this.name = name;
        this.voice = voice;
        this.color = color;
        this.legs = legs  ;
        this.tail = tail ;
        this.food =  food;
    }
    void Display(){
        System.out.println(this.name);
        System.out.println(this.voice);
        System.out.println(this.color);
        System.out.println(this.legs);
        System.out.println(this.tail);
        System.out.println(this.fh.habit[this.food]);
    }
}
