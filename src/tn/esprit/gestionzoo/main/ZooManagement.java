package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.ZooFullException;

public class ZooManagement{
    public static void main(String[] args) {

        Zoo zoo = new Zoo("zoo","Tunis",25);

        // Aquatic aquatic = new Dolphin("Aquatic","Dolphin",3 ,true,"Océan",25.0f);
        // Aquatic aquatic2 = new Dolphin("Aquatic","Dolphin",3 ,true,"Océan",25.0f);
        //Aquatic aquatic3 = new Penguin("Aquatic","Penguin2",1 , false,"Atlantique Nord",6.25f);
        try {
            Animal dolphin = new Dolphin("Aquatic", "Dolphin", -2, true, "Océan", 25.0f);
            Animal penguin = new Penguin("Aquatic", "Penguin", 1, false, "Atlantique Nord", 3.25f);
            Animal penguin2 = new Penguin("Aquatic", "Penguin2", 1, false, "Atlantique Nord", 6.25f);

            Animal terrestrial = new Terrestrial("Terrestrial", "Chat", 2, true, 4);
            // System.out.println("Aquatic: " + aquatic);
            System.out.println("Dolphin: " + dolphin);
            System.out.println("Penguin: " + penguin);
            System.out.println("Terrestrial: " + terrestrial);
        }catch (InvalidAgeException err){
            System.out.println(err.getMessage());
        }

        /*aquatic.swim();
        dolphin.swim();
        penguin.swim();*/

        //System.out.println("Comparaison entre " + aquatic.getName() + " et " + aquatic2.getName() + " : " +aquatic.equals(aquatic2));
        //System.out.println("Comparaison entre " + aquatic.getName() + " et " + aquatic3.getName() + " : " +aquatic.equals(aquatic3));

       /* try {

            zoo.addAnimal(dolphin);
            zoo.addAnimal(penguin);
            zoo.addAnimal(terrestrial);
            zoo.addAnimal(penguin2);
        }catch (ZooFullException err){
            System.out.println(err.getMessage());
        }
        zoo.showAnimals();*/



        /*zoo.swimm();
        zoo.displayNumberOfAquaticsByType();

        float maxDepth = zoo.maxPenguinSwimmingDepth();
        System.out.println("Max Penguin Swimming depth :  " + maxDepth);*/


    }

}