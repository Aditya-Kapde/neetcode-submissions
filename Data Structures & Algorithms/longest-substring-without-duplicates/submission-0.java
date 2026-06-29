class Solution {
    public int lengthOfLongestSubstring(String s) {
        String sub="";
        int ml=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int index=sub.indexOf(ch);
            if(index!=-1)
            {
                sub=sub.substring(index+1);
            }
            sub+=ch;
            if(sub.length()>ml)
            {
                ml=sub.length();
            }
        }

        return ml;
    }
}
