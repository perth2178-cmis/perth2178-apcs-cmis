public class Doctor extends Senior
{
    String DoctorType;
    int yoe;
    
    public Doctor(String name, String yob, String mob, String dob, String schoolName, String university, boolean gapYear, String DoctorType, int yoe)
    {
       super(name, yob, mob, dob, schoolName, university, gapYear);
       this.DoctorType=DoctorType;
       this.yoe=yoe;
    }
    
    public String toString()
    {
        return super.toString() + String.format("\nType of Doctor: %s\nYears of Experice: %d", DoctorType, yoe);
    }
}
