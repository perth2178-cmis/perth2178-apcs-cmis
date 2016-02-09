public class Roster2Driver
{
    public static void main (String args[])
    {
        Roster2 apComputerScience = new Roster2();
        apComputerScience.addStudent(new Student("James","Lew",2.9));
        apComputerScience.addStudent(new Student("Simon","Shlovik",3.3));
        apComputerScience.addStudent(new Student("Ella","Dendy",3.9));
        System.out.println(apComputerScience);
        apComputerScience.dropStudent("Lew");
        System.out.println("\n"+apComputerScience);
    }
}