import java.util.ArrayList;
public class GPSApp
{
       public static void main(String[] args)
       {
        ArrayList<Integer> markers1 = new ArrayList<Integer>();
        ArrayList<Integer> markers2 = new ArrayList<Integer>();
        
        markers1.add(90);   //0
        markers1.add(80);   //1
        markers1.add(90);   //2
        markers1.add(100);  //3
        markers1.add(120);  //4
        markers1.add(100);  //5
        markers1.add(80);   //6
        markers1.add(110);  //7
        markers1.add(150);  //8
        markers1.add(160);  //9
        markers1.add(160);  //10
        markers1.add(100);  //11
        markers1.add(205);  //12
        
        markers2.add(110);  //0
        markers2.add(115);  //1
        markers2.add(120);  //2
        markers2.add(115);  //3
        markers2.add(105);  //4
        markers2.add(100);  //5
        markers2.add(100);  //6
        markers2.add(100);  //7
        markers2.add(105);  //8
        markers2.add(110);  //9
        markers2.add(100);  //10
        markers2.add(105);  //11
        markers2.add(110);  //12
        
        GPS carGPS =new GPS ();
        GPS vanGPS =new GPS (markers1);
        GPS busGPS =new GPS (markers2);
        GPS[] allGPS ={carGPS, vanGPS, busGPS};
        
        System.out.println(carGPS);
        System.out.println(vanGPS);
        System.out.println(busGPS);
    
        for(int i = 0; i < allGPS.length;i++)
        {
            if(allGPS[i].isLevelTrailSegment(0,12))
            {
                System.out.println("This trail is level.");
            }
            else
            {
                System.out.println("This trail is not level.");
            }
        }
        
        for(int i = 0; i < allGPS.length;i++)
        {
            if(allGPS[i].isLevelTrailSegment(5,6))
            {
                System.out.println("This trail segment is level.");
            }
            else
            {
                System.out.println("This trail segment is not level.");
            }
        }
        
        for(int i = 0; i < allGPS.length;i++)
        {
            if(allGPS[i].isDifficult(0,12))
            {
                System.out.println("This trail is difficult.");
            }
            else
            {
                System.out.println("This trail is not difficult.");
            }
        }
        
        for(int i = 0; i < allGPS.length;i++)
        {
            if(allGPS[i].isDifficult(11,12))
            {
                System.out.println("This trail segment is difficult.");
            }
            else
            {
                System.out.println("This trail segment is not difficult.");
            }
        }
     }
}