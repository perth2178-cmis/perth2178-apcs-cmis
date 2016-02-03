
/**
 * Write a description of class Array2D3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array2D3
{
    public static void main(String[] args)
    {
        int[][] grid= new int[10][10];
        for(int r=1;r<grid.length;r++)
        {
            for(int c=1;c<grid[0].length;c++)
            {
                grid[r][c]=r*c;
                grid[0][c]=c;
            }
            grid[r][0]=r;
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
