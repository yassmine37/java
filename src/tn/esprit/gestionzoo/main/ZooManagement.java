package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement{
    public static void main(String[] args) {
        Aquatic aquatic = new Aquatic("Aquatic","Poisson",3 ,false,"Océan");
        Dolphin dolphin = new Dolphin("Aquatic", "Dolphin", 2 ,true , "Océan",25.0f);
        Penguin penguin = new Penguin("Aquatic","Penguin",1 , false,"Atlantique Nord",3.25f);
        Terrestrial terrestrial =new Terrestrial("Terrestrial","Chat",2 ,true,4);
        System.out.println("Aquatic: " + aquatic);
        System.out.println("Dolphin: " + dolphin);
        System.out.println("Penguin: " + penguin);
        System.out.println("Terrestrial: " + terrestrial);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();


    }

}