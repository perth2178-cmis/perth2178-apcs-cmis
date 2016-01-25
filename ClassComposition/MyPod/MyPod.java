import java.util.ArrayList;
public class MyPod
{
    private String color;
    private int memory;
    private ArrayList<String> SongLibrary = new ArrayList();

    public MyPod()
    {
        color = new String("Green");
        memory = 16;
        SongLibrary.add("Adventure of a Lifetime");
        SongLibrary.add("Crystalized");
        SongLibrary.add("Shoot to Thrill");
    }

    public MyPod(String color, int memory, String Song1, String Song2, String Song3)
    {
        this.color= new String(color);
        this.memory=memory; 
        SongLibrary.add(Song1);
        SongLibrary.add(Song2);
        SongLibrary.add(Song3);
    }

    public String toString()
    {
        String output=new String();
        output="MyPod Information\nColor: " + color + 
        "\nMemory Capacity: " + memory + 
        "\nSong Library:\n";
        for(String Song : SongLibrary)
        {
            output+=Song+"\n";
        }
        return output;
    }
}
