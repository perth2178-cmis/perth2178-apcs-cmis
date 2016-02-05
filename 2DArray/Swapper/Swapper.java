public class Swapper
{
    public static void main(String[] args)
    {
        int[][] grid = new int[][] {{9, 7, 2, 5, 7, 9, 7, 5, 8, 5},
                                                {4 ,8 ,1, 0, 7, 5, 3, 6, 2, 7},
                                                {0, 0, 5, 6, 7, 5, 6, 6, 4, 7},
                                                {5, 1,6 ,2 ,2 ,2 ,7 ,9 ,1 ,9},
                                                {7, 0, 8, 9, 7, 0, 4, 3, 8, 6},
                                                {1 ,7 ,5 ,6, 3, 2, 9, 3, 5, 3},
                                                {5 ,3 ,1, 4 ,9 ,9 ,1 ,3 ,4 ,8},
                                                { 5 ,6 ,9 ,9 ,0 ,8 ,0 ,3 ,9 ,3},
                                                {1 ,7, 4, 8, 3, 1, 7, 2, 1, 5},
                                                {1, 0, 3, 6, 3, 0, 8, 3, 3, 6}};
        int[] rowproduct=new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] colproduct=new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int highestrow=0;
        int highestcol=0;
        int rvalue=0;
        int cvalue=0;
        int detect=0;
        for(int r=0;r<rowproduct.length;r++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                if(grid[r][c]>0)
                {
                    rowproduct[r]=rowproduct[r]*grid[r][c];
                }
            }
        }

        for(int c=0;c<grid[0].length;c++)
        {
            for(int r=0;r<colproduct.length;r++)
            {
                if(grid[r][c]>0)
                {
                    colproduct[c]=colproduct[c]*grid[r][c];
                }
            }
        }

        for(int i=0;i<rowproduct.length;i++)
        {
            if (rowproduct[i]>highestrow)
            {
                highestrow=rowproduct[i];
                rvalue=i;
            }
        }
        System.out.println();
        for(int i=0;i<colproduct.length;i++)
        {
            if (colproduct[i]>highestcol)
            {
                highestcol=colproduct[i];
                cvalue=i;
            }
        }
        grid[rvalue][cvalue]=detect;
        for(int r=0;r<rowproduct.length;r++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                if(grid[r][c]==detect)
                {
                    grid[r][c]=0;
                }
                if(grid[r][c]==0)
                {
                    grid[r][c]=detect;
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
