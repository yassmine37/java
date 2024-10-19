package tn.esprit.gestionzoo.entities;

public class Animal {
   private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family,String name, int age, Boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getFamily() {
        return family;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif.");
        }
        this.age = age;
    }
    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal family=" + family + ", name=" + name + ", age=" + age+ ", isMammal=" + isMammal ;
    }

}


