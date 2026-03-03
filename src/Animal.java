public class Animal {
    // Instance variables
    private String species;
    private String name;
    private String zoo;
    private String sound;
// Constructor 
    public Animal(String spe, String nam, String zo, String sou){
        species = spe;
        name = nam;
        zoo = zo;
        sound = sou;
    }
    public String getSpecies() // Getters for each instance variable
    {
    return species;
    }

    public String getName()
    {
    return name;
    }

    public String getZoo()
    {
    return zoo;
    }

    public String getSound()
    {
    return sound;
    }
    public void setZoo(String zo){
       zoo = zo;
    }


}
