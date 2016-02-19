public class Person
{
    private String name;
    private String birthDate;
    
    public Person(String name, String yob, String mob, String dob)
    {
        this.name = name; 
        this.birthDate = new String(yob+", "+mob+", "+dob);
    }

    public String toString()
    {
        return String.format("Name: %s\nDate of Birth: %s", name, birthDate);
    }

}