public class Array2D4
{
    public static void main(String[] args)
    {
        String[][] grid= new String[10][10];
        String[] ABC;
        int i=0;
        ABC=new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for(int r=0;r<grid.length;r++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                grid[r][c]=ABC[i];
                i=i+1;
                if(i==26)
                {
                    i=0;
                }
            }
        }

        for(int r=0;r<grid.length;r++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                System.out.print(grid[r][c]+"\t");
            }
            System.out.print("\n");
        }
    }
}