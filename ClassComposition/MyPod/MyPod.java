public class MyPod
{
    private String color;
    private int memory;
    private String[] SongLibrary = new String[3];

    public MyPod()
    {
        color = new String("Green");
        memory = 16;
        this.SongLibrary[0] = "Adventure of a Lifetime";
        this.SongLibrary[1] = "Crystalized";
        this.SongLibrary[2] = "Shoot to Thrill";
    }

    public MyPod(String color, int memory)
    {
        this.color = new String(color);
        this.memory = memory; 
    }

    public String toString()
    {
        String output=new String();
        output="MyPod Information\nColor: " + color + 
        "\nMemory Capacity: " + memory + 
        "\nSong Library:\n";
        for(int i=0;i<SongLibrary.length;i++)
        {
            System.out.println(SongLibrary[i]);
        }
        return output;
    }
}
