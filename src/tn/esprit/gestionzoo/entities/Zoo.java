package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages=25;
    private int nbrAnimals = 0;

    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages];
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne doit pas être vide.");
        }
        this.name = name;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo is full");
            return false;
        }
        if (searchAnimal(animal) == -1)  {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        System.out.println("Animal already exist");
        return false;
    }

    public boolean removeAnimal(Animal animal)
    {
        int deleteIndex = searchAnimal(animal);
        if (deleteIndex == -1)
        {
            return false;
        }
        ///remplissage de la case supprimer
        for (int i = deleteIndex ; i < nbrAnimals -1 ; i++) {
            animals[i] = animals[i+1];
        }
        //supp dernier element en double
        animals[nbrAnimals - 1] = null;
        //mise a jour du nbr d'animaux
        nbrAnimals--;
        return true;
    }

   public boolean isZooFull (){
        return nbrAnimals >= nbrCages;
    }

    public void showAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public void displayZoo() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Nbr Cages max : " + nbrCages);
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return "name: " + name + ", city: " + city + ", nbr Cages: " + nbrCages + ", nbr Animals: " + nbrAnimals;
    }
    public static Zoo comparerZoo (Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        }else if (z1.nbrAnimals < z2.nbrAnimals) {
            return z2;
        }else {
            return null;
        }
    }
}

