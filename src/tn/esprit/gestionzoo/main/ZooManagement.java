package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement{
    public static void main(String[] args) {

        Animal lion = new Animal("félin", "lion" ,5,true);
        Animal chat = new Animal("félin", "chat", 2, true);
        Animal loup = new Animal("canidé", "loup", 7, false);
        Animal baleine = new Animal("cétacé", "baleine", 3, true);
        Animal lion2 = new Animal("félin", "lion" ,5,true);


        //Zoo myZoo = new Zoo("jurassik", "new york", 25, null);

        /*myZoo.addAnimal(lion);
        myZoo.addAnimal(chat);
        myZoo.addAnimal(loup);
        myZoo.addAnimal(baleine);
        myZoo.addAnimal(lion2);*/

        Zoo zoo1 = new Zoo("jurassik", "new york" ,25,null);
        Zoo zoo2 = new Zoo("safari" , "bali", 20,null);

        zoo1.addAnimal(chat);
        zoo2.addAnimal(loup);
        zoo2.addAnimal(baleine);
        Zoo comparer = Zoo.comparerZoo(zoo1, zoo2);
        if(comparer != null){
            System.out.println("le zoo avec le plus d'animaux est: " + comparer.getName());

        }else {
            System.out.println("même nbr d'animaux dans les 2 zoo");
        }

        //isZooFull
        /*if (myZoo.isZooFull()){
            System.out.println("Zoo full");
        }else{
            System.out.println("Zoo not full");
        }

        //System.out.println(myZoo);
        System.out.println("animaux avant supp");
        myZoo.showAnimals();
        System.out.println("indice de lion2 :" + myZoo.searchAnimal(lion2));
        boolean removed = myZoo.removeAnimal(lion2);
        System.out.println("lion2 supprimé:" + removed);
        System.out.println("animaux aprés supp");
        myZoo.showAnimals();*/
    }

}