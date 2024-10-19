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
        if (this == obj) {
            return true;
        } if ( obj == null || getClass() != obj.getClass() ) {
            return false;
        }
        Aquatic autre = (Aquatic) obj;
        return this.getName().equals(autre.getName())&&
                this.getAge() == autre.getAge() &&
                this.habitat.equals(autre.habitat);
    }
}
