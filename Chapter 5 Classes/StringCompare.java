public class StringCompare
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        if (word1.compareTo("aaa") > 0)
        {
            System.out.println("Greater");
        }
        if (word1.equals(word2))
        {
            System.out.println("Equals");
        }
        if (word1.compareTo(word2) < 0)
        {
            System.out.println("Less");
        }
        
        String word1sub = word1.substring(0,3);
        String word2sub = word2.substring(0,3);
        
        if (word1sub.equals(word2sub))
        {
            System.out.println("Substrings are equal");
        }
    }
}