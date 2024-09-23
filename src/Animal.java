public class Animal {
    private String family;
    String name;
    private int age;
    private boolean isMammal;
    public Animal(String family,String name, int age, Boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age+ ", isMammal=" + isMammal + "]";
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }
}


