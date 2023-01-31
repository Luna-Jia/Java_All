package Zoom5_10_OOP.Tamagotchi;

import Zoom5_10_OOP.MyDate.MyDate;

public class Tamagotchi {

    private String name;                        //attributes and properties
    private int hunger;
    private int boredom;
    private String vocab;
    private MyDate birthday;

    public static int numOfPets;                      //everywhere and everyone can use static variable

    public Tamagotchi(String name){     //Doesn't have to include all the value
        this.name = name;
        hunger = 0;
        boredom = 0;
        birthday = new MyDate();
        numOfPets++;
    }

    public Tamagotchi(){
        name = "N/A";
        hunger = 0;
        boredom = 0;
        birthday = new MyDate();
        numOfPets++;
    }
    public Tamagotchi(Tamagotchi otherPet){               // copy constructor
        setName(otherPet.name);
        setVocab(otherPet.vocab);
        birthday = new MyDate(otherPet.birthday);
        hunger = otherPet.hunger;
        boredom = otherPet.boredom;
        numOfPets++;
    }

    public void setBirthday(MyDate birthday){
        this.birthday = birthday;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setVocab(String vocab) {
        this.vocab = vocab;
    }

    public static void printNumOfPets() {
        //int num=1;
        System.out.println("You currently have " + numOfPets + "pets.");  // static method doesn't have instance variable
    }

    public void timeGoesBy(int minute){
        System.out.println(minute + " minutes went by.");
        for (int i=0; i<minute; i++){
            hunger++;
            boredom++;
        }
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi I am " + name);


        stringBuilder.append("My birthday is: " + birthday +"\n");
        if (hunger < 20 && boredom < 20) {

            stringBuilder.append("Hi I am " + name);
        }else{
            if (hunger >= 20){

                stringBuilder.append("I am hungry! Feed me!");
            }
            if (boredom >= 20){

                stringBuilder.append("I am bored! Play with me!");
            }
        }
        if (vocab !=null) {
            stringBuilder.append("I can say " + vocab);
        }
        return stringBuilder.toString();

    }

    public boolean equals(Tamagotchi otherPet){
        return name.equals(otherPet.name) && birthday.equals(otherPet.birthday);
    }

    public void feed(){
        hunger--;
        System.out.println("Yay! Meal time!");
    }

    public void play(){
        System.out.println("Yay! Play time!");
        boredom--;
    }

}
