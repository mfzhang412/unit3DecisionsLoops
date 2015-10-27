

public class CountMatches
{
    public static int countSpaces(String str)
    {
        int spaces = 0;
        
        for(int i = 0;
            i < str.length();
            i++)
        {
            char character = str.charAt(i);
            if (character == ' ')
            {
                spaces++;
            }
        }
        
        return spaces;
    }
    
}