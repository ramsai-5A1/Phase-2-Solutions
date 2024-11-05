class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        
        ArrayList<Integer> result = new ArrayList<>();
        int pLen = pattern.length();
        int tLen = text.length();
        
        // Slide the pattern over text one by one
        for (int i = 0; i <= tLen - pLen; i++) {
            if(pattern.equals(text.substring(i,i+pattern.length())))
            {
                
                result.add(i+1);
            }
        }
        return(result);
    }
}