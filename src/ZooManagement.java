import java.util.Scanner;


public class ZooManagement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal lion = new Animal("félin", "lion" ,5,true);
        Animal chat = new Animal("félin", "chat", 2, true);
        Animal loup = new Animal("canidé", "loup", 7, false);
        Animal baleine = new Animal("cétacé", "baleine", 3, true);

        ///instruction 1
        //int nbrCages=20;
        //String zooName= "my zoo" ;
        //System.out.println (zooName+" comprte  "+ nbrCages+" cages" );

        ///instruction2

        System.out.println("Entrer le nom du zoo :");
        String zooName = scanner.nextLine();


        //verif que les données sont mises convenablement

        while (zooName.isEmpty()) {
            System.out.println("entrer le nom du zoo :");
            zooName = scanner.nextLine();
        }
        // saisie nbr cages
        int nbrCages = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("entrer le nombre de cages :");
            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();
                if (nbrCages > 0) {
                    validInput = true;
                } else {
                    System.out.println("nbr doit etre superieur a 0");
                }
            } else {
                System.out.println(" le nombre de cages n'est pas valide ");
                scanner.next();
            }
            }
        //capcite max des animaux est 25
        Animal[] animals = new Animal[25];
        animals[0] = lion;
        animals[1] = chat;
        animals[2] = loup;
        animals[3] = baleine;

        Zoo myZoo = new Zoo(zooName, "city" , nbrCages, animals);
            ///affichage
        myZoo.displayZoo();
        System.out.println(myZoo);
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
        myZoo.showAnimals();
        //System.out.println (zooName+" comprte  "+ nbrCages+" cages" );
        /*System.out.println(myZoo.getName() + " comporte "+myZoo.getNbrCages() + " cages. ");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {

                System.out.println("le zoo a un "+myZoo.getAnimals()[i].getName() +" appartenant à la famille des "+myZoo.getAnimals()[i].getFamily());

            }
        }*/
        scanner.close();
        }

    }
