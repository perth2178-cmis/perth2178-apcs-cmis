public class StudentDriver
{
   public static void main(String[] args)
   {
       Student[][] studentbody= new Student[3][2];
       
       studentbody[0][0] = new PostGrad("Peter","Music",9);
       studentbody[0][1] = new PostGrad("Grant","Paleontology",19);
       studentbody[1][0] = new Grad("Elliot","Botany",16);
       studentbody[1][1] = new Grad("Miriam","Sociology",17);
       studentbody[2][0] = new UnderGrad("Yui","Buisness",15);
       studentbody[2][1] = new UnderGrad("Bruno","Biology",4);
       
       for(int r=0;r<studentbody.length;r++)
        {
            for(int c=0;c<studentbody[0].length;c++)
            {
                System.out.print(studentbody[r][c]+"\t\t");
            }
            System.out.println("\n");
        }
    }
}
