package Characters;

import Enums.Gender;
import Interfaces.FlyWindowable;
import Worlds.FairyTaleWorld;

import java.util.Objects;

public class Witch extends Character implements FlyWindowable {
    private String name;
    private int flyheight;
    public Witch(String name, Gender gender, double weight, double height){
        super(name, gender, weight, height);
    }
    public Witch(String name, Gender gender, double weight, double height, int flyheight){
        super(name, gender, weight, height);
        this.flyheight = flyheight;
    }
    public void flyPastTheWindow(FairyTaleWorld fairyTaleWorld){
        fairyTaleWorld.moveCharacterInSky(10, 10, 0, 0);
        flyheight+=2;
        System.out.println("Мимо окна пролетает ведьма.");
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (this.getClass()!=object.getClass()){
            return false;
        }
        Witch witch = (Witch) object;
        return Objects.equals(name, witch.name);
    }

    @Override
    public String toString() {
        return name;
    }
    public int getFlyheight(){
        return flyheight;
    }
}
