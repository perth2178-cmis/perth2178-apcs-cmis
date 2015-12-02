public class CollegeApp
{
    public static void main(String[] args)
    {
        String school1 = new String ("Whitman"); 
        String school2 = new String ("Colorado"); 
        String school3 = new String ("Carlham"); 
        System.out.println( school2.compareTo( school3 ));
        /* a. What is the output of the compareTo() method telling us? 
         *      It tells us how far the first letter of each word is by counting the distance between the two letters alphabetically with 
         *      a having being the lowest value and z being the hieghest and so when comparing two words alphabetically the output would be negative but
         *      if it is done counter alphabetically the return value is positive.
         * b. Compare to schools that have the same first letter and a different second letter. What does compareTo() do in this case?
         *      When the first letter of the word is the same for both words compareto() moves on to the second letter and 
         *      does the exact same thing to what it would normally do by comparing the two letters by the number of letters that are in between the letters
           */
    }//end method main
}//end class CollegeAppDriver