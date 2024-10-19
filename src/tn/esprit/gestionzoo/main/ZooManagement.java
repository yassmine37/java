package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement{
    public static void main(String[] args) {
        Aquatic aquatic = new Dolphin("Aquatic","Dolphin",3 ,true,"Océan",25.0f);
        Aquatic aquatic2 = new Dolphin("Aquatic","Dolphin",3 ,true,"Océan",25.0f);
        Aquatic aquatic3 = new Penguin("Aquatic","Penguin2",1 , false,"Atlantique Nord",6.25f);

        Dolphin dolphin = new Dolphin("Aquatic", "Dolphin", 2 ,true , "Océan",25.0f);
        Penguin penguin = new Penguin("Aquatic","Penguin",1 , false,"Atlantique Nord",3.25f);
        Penguin penguin2 = new Penguin("Aquatic","Penguin2",1 , false,"Atlantique Nord",6.25f);

        Terrestrial terrestrial =new Terrestrial("Terrestrial","Chat",2 ,true,4);
        //System.out.println("Aquatic: " + aquatic);
        //System.out.println("Dolphin: " + dolphin);
       //System.out.println("Penguin: " + penguin);
        //System.out.println("Terrestrial: " + terrestrial);

        /*aquatic.swim();
        dolphin.swim();
        penguin.swim();*/

        System.out.println("Comparaison entre " + aquatic.getName() + " et " + aquatic2.getName() + " : " +aquatic.equals(aquatic2));
        System.out.println("Comparaison entre " + aquatic.getName() + " et " + aquatic3.getName() + " : " +aquatic.equals(aquatic3));

        Zoo zoo = new Zoo("zoo","Tunis",25);
        zoo.addAqutics(dolphin);
        zoo.addAqutics(penguin);
        zoo.addAqutics(penguin2);
        zoo.swimm();
        zoo.displayNumberOfAquaticsByType();

        float maxDepth = zoo.maxPenguinSwimmingDepth();
        System.out.println("Max Penguin Swimming depth :  " + maxDepth);


    }

}