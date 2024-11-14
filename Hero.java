public class Hero{
    public String name;
    public int powerLevel;
    enum Affiliation{
        justiceLeague
    }
    public Student(String name, int powerLevel, Affiliation affiliation)
    {
        this.name = name;
        this.grade = powerLevel;
        this.affiliation = affiliation;
    }

    public String getName(){
        return name;
    }

    public int getPowerLevel(){
        return powerLevel;
    }

    public Affiliation getAffiliation(){
        return affiliation;
    }

    public String toString(){
        return "Name: " + name + "\npowerLevel: " + powerLevel + "\naffiliation: " + affiliation;
    }
}



