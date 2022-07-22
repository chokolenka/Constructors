package com.company;

//Bridge мост
public class LionAndHare {
    public static void main(String[] args) {
        Hare hare = new CleverHare();
        Lion lion = new StupidLion();
        hare.meetWithLion(lion);
        lion.meetWithHare(hare);
    }

}
abstract class Lion{
    public boolean intellect; // ум
    abstract public void meetWithHare(Hare hare); // что произойдет при встрече зайца

}
abstract class Hare {
    public boolean intellect; // ум

    abstract public void meetWithLion(Lion lion); // что произойдет при встрече льва
}

class CleverHare extends Hare{

    public CleverHare() {
        this.intellect = true;
    }

    @Override
    public void meetWithLion(Lion lion) {
        if (lion.intellect)
            System.out.println("The lion is clever, my attempt is false");
        else
            System.out.println("The lion is stupid, I will try to fool it");
    }
}
class StupidHare extends Hare{

    public StupidHare() {
        this.intellect = false;
    }

    @Override
    public void meetWithLion(Lion lion) {
        if (lion.intellect)
            System.out.println("The clever lion! I can't do anything");
        else
            System.out.println("The stupid lion! I'm afraid of it");
    }
}
class CleverLion extends Lion{

    public CleverLion() {
        this.intellect = true;
    }

    @Override
    public void meetWithHare(Hare hare) {
        if (hare.intellect)
            System.out.println("The hare is clever ! I don't want to eat it");
        else
            System.out.println("The hare is stupid! I'd rather eat it");

    }
}
class StupidLion extends Lion{

    public StupidLion() {
        this.intellect = false;
    }

    @Override
    public void meetWithHare(Hare hare) {
        if (hare.intellect)
            System.out.println("What? Another lion in my jungle");
        else
            System.out.println("It is another hare. I'm very hungry");

    }
}
