class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length())
        {
            int[] str1=new int[26];
            int[] str2=new int[26];
            for(int i=0;i<s.length();i++)
            {
                str1[s.charAt(i)-'a']++;
            }
            for(int j=0;j<t.length();j++)
            {
                str2[t.charAt(j)-'a']++;
            }
            for(int k=0;k<26;k++)
            {
                if(str1[k]!=str2[k])
                return false;
            }
            return true;

        }
        else{
            return false;
        }
    }
}
