class Solution {
    public boolean checkIfPangram(String sentence) {
         char[] alphabet = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u',
            'v', 'w', 'x', 'y', 'z'
        };

        if(sentence.length() < 26) return false;
        for(int i=0;i<26;i++)
        {
            if(!sentence.contains(String.valueOf(alphabet[i])))
            {
                return false;
            }
        }
        return true;
    }
}