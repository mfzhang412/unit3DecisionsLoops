

public class FindFirstMatch
{
    // returns the index of the first space in the specified string or
    //  -1 if the string contains no spaces
    public static int findFirstSpace(String str)
    {
        boolean found = false;
        int position = 0;
        
        while (found == false && position < str.length())
        {
            char character = str.charAt(position);
            if (character == ' ')
            {
                found = true;
            }
            else
            {
                position++;
            }
        }
        
        if (!found)
        {
            position = -1;
        }
        
        return position;
    }
    
}