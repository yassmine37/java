package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat ;
    public Aquatic(String family, String name, int age, boolean isMammal ,String habitat) {
      super(family, name, age, isMammal);
      this.habitat = habitat;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public abstract void swim ();

    @Override
    public String toString() {
        return super.toString() +  " , habitat=" + habitat ;
    }
    @Override
    public boolean equals(Object obj) {
        if (null == obj)
            return false;
        if (obj instanceof Aquatic x)
            return this.habitat.equals(x.getHabitat()) && this.getAge() == x.getAge() && this.getName() == x.getName();
        return false;
    }
}
