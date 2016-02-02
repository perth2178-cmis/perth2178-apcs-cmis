public class Array2D2
{
    public static void main(String[] args)
    {
        int[][] grid= new int[3][5];
        int i=1;
        int[] rowsum=new int[3];
        int[] colsum=new int[5];
        int totalsum=0;

        for(int r=0;r<grid.length;r++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                grid[r][c]=i;
                i=i+1;
                totalsum=totalsum+i;
            }
        }

        i=1;
        for(int a=0;a<rowsum.length;a++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                grid[a][c]=i;
                i=i+1;
                rowsum[a]=rowsum[a]+i;
            }
        }

        i=1;
        for(int c=0;c<grid[0].length;c++)
        {
            for(int r=0;r<grid.length;r++)
            {
                colsum[c]=colsum[c]+i;
                i=i+5;
            }
            i=i+2-16;
        }
        
        i=1;
        for(int[] r:grid)
        {
            for(int num:r)
            {
                System.out.print(num+"\t");
            }
            System.out.println("\n");
        }

        for(int a=0;a<rowsum.length;a++)
        {
            System.out.println("Row "+(a+1)+": "+rowsum[a]);
        }
        for(int a=0;a<colsum.length;a++)
        {
            System.out.println("Column "+(a+1)+": "+colsum[a]);
        }
        System.out.println(totalsum);
    }
}