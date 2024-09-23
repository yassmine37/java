public class Zoo {
    public Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    int nbrAnimals=0;
    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals != null ? animals : new Animal[25];
    }
    boolean addAnimal(Animal animal) {
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    void showAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
    int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    boolean removeAnimal(Animal animal) {
        int deleteIndex =searchAnimal(animal);
        animals[deleteIndex] = null;
        return true;
    }
    public void displayZoo(){
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Nbr Cages: " + nbrCages);
    }
    @Override
    public String toString() {
        return "zoo [name= " +name+ " city= " +city+ " nbrCages=  " +nbrCages + "]";
    }
    public Animal[] getAnimals() {
        return animals;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getNbrCages() {
        return nbrCages;
    }
    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }
}
