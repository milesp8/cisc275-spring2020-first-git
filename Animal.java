public class Animal{
    int legs;
    String name;
    public Animal(String n, int l){
	this.legs = l;
	this.name = n;
    }
    public String toString(){
	return this.name + " has " + legs + " legs.";
    }
    public int getLegs(){
	return this.legs;
    }
}
