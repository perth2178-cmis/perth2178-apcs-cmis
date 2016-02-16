public class Array2D1
{
    public static void main(String[] args)
    {
        int[][] grid= new int[3][4];
        
        for(int r=0;r<grid.length;r++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                grid[r][c]=(int)(Math.random()*10);
            }
        }
        
        for(int r=0;r<grid.length;r++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                System.out.print(grid[r][c]+" ");
            }
            System.out.print("\n");
        }
        
        for(int r=0;r<grid.length;r++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                if(grid[r][c]==5)
                {
                   System.out.print(r+","+c+" "); 
                }
            }
        }
    }
}
