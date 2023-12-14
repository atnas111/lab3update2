package Characters;

import Enums.*;
import Interfaces.Impressionable;
import Worlds.FairyTaleWorld;

import java.util.Objects;

public class Uncle extends Character implements Impressionable {
    private double weight;
    private int happinessLevel;
    private String name;
    private Marriagestatus marriagestatus;
    public Uncle(String name, Gender gender, double weight, double height, int happinessLevel, Marriagestatus marriagestatus) {
        super(name, gender, weight, height);

        this.happinessLevel = HappinessLevels.HIGH.getHappinessLevel();
        this.marriagestatus = marriagestatus;
    }

    @Override
    public void beHappy(Day day){
        if(day == Day.YESTERDAY){
            String happy = "Дядя Юлиус был очень весел и счастлив.";
            happinessLevel+=1;
            System.out.println(happy);
        }
        if(day == Day.TODAY){
            String happy = "Дядя Юлиус повторял, что счастлив очень-очень сильно.";
            happinessLevel+=2;
            System.out.println(happy);
        }
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getHappinessLevel(){
        return happinessLevel;
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
        Uncle uncle = (Uncle) object;
        return Objects.equals(name, uncle.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public void beStubborn() {
        happinessLevel-=1;
        System.out.print("Дядя Юлиус был упрям. ");
    }

    public void setMarriagestatus(){
        this.marriagestatus = marriagestatus;
    }

    public void thankTo(PropellerMan propellerMan){
        if (propellerMan.equals(propellerMan)) {
            weight -= 1;
            happinessLevel += 1;
            System.out.println("Дядя Юлиус поблагодарил Карлсона.");
        }
    }
    public void beAfraid(Witch witch){
        if (witch.getFlyheight()==0){
            happinessLevel-=1;
            System.out.println("Он испугался летающей ведьмы.");
        }
    }
    public void goToWorld(Time time, FairyTaleWorld fairyTaleWorld, Uncle uncle){

        if (time == Time.NOW){
            fairyTaleWorld.addCharacter(uncle, 0, 0);
            System.out.println("Ему открылся замечательный мир сказок.");
        }
        if (time == Time.FUTURE){
            fairyTaleWorld.ComeBackToWorld(uncle, 0, 0);
            System.out.println("Он снова окунулся в мир пердков.");
        }
    }
}
