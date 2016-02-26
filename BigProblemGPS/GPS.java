import java.util.ArrayList;
public class GPS
{
    private ArrayList<Integer> markers = new ArrayList<Integer>();

    public GPS()
    {
        markers.add(100);   //0
        markers.add(150);   //1
        markers.add(105);   //2
        markers.add(120);   //3
        markers.add(90);    //4
        markers.add(80);    //5
        markers.add(50);    //6
        markers.add(75);    //7
        markers.add(75);    //8
        markers.add(70);    //9
        markers.add(80);    //10
        markers.add(90);    //11
        markers.add(100);   //12
    }

    public GPS( ArrayList<Integer> markers )
    {
        this.markers = markers;
    }

    public void addMarker(int marker)
    {
        markers.add(marker);
    }

    public int getLength()
    {
        return markers.size();
    }

    public boolean LevelTrailSegment(int begin, int end)
    {
        boolean Level = true;

        if(markers.get(begin) != markers.get(end))
        {
            Level = false; 
        }
        else
        {
            for(int i = begin; i < end; i++)
            {
                if(markers.get(begin) - markers.get(end) > 10 || markers.get(i) - markers.get(i+1) > 10)
                {
                    Level = false;
                }
            }
        }
        return Level;
    }

    public boolean Difficult(int begin, int end)
    {
        boolean Difficult = false;
        int netGain = 0;
        if(LevelTrailSegment(begin, end) == false)
        {
            for(int i = begin; i < end; i++)
            {
                int calc = markers.get(i + 1) - markers.get(i);
                if(calc > 0)
                {
                    netGain += calc;

                }
            }
        }
        if(netGain >= 100)
        {
            Difficult = true;
        }
        return Difficult;
    }

    public String toString()
    {
        String output = new String("Index : Elevation \n");
        int counter = 0;
        for ( int s : markers)
        {
            output += counter + ":\t" + s + "\n" ;
            counter ++;
        }
        return output;
    }
}