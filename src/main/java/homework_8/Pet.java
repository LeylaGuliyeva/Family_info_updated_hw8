package homework_8;

import java.util.Objects;
import java.util.Set;


public abstract class Pet {

    protected homework_8.Species species;
    protected String nickname;
    protected int age;
    protected int trickLevel;
    protected Set<String> habits;
    public homework_8.Species getSpecies() {
        return species;
    }
    public void setSpecies(homework_8.Species species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    final void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.println("Hello, friend");
    }
    public void foul(){
        System.out.println("It is time to suppress.");
    }

    @Override
    public String toString() {
        return this.species + "{nickname='" + this.nickname + "', age=" + this.age + ", trickLevel=" + this.trickLevel + ", habits=" + this.habits + "}";
    }

    protected Pet(){
    }
    protected Pet(String nnm){
        this.nickname=nnm;

    }
    protected Pet(String nnm, int a, int tl, Set<String> hbt){
        this.nickname=nnm;
        this.age=a;
        this.trickLevel=tl;
        this.habits=hbt;
    }

    {
        for(homework_8.Species sp: homework_8.Species.values()) {
            if(sp.toString().toUpperCase().equals(this.getClass().getSimpleName().toUpperCase()))
                this.species = sp;
        }

        if(this.species == null)
            this.species = homework_8.Species.UNKNOWN;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return getAge() == pet.getAge() && getSpecies().equals(pet.getSpecies()) && getNickname().equals(pet.getNickname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpecies(), getNickname(), getAge());
    }
    @Override
    protected void finalize(){
        System.out.println("Pet class element will be deleted!");
    }
}
