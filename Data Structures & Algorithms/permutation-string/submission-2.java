class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }
        int l=0;
        for(int r=s1.length();r<=s2.length();r++)
        {
            if(Anagrams(s1, s2.substring(l,r)))
            {
                return true;
            }
            l++;
        }
        return false;
    }
    public static boolean Anagrams(String s1, String s2)
        {
            if(s1.length()!=s2.length())
            {
                return false;
            }
            char[] arr1=s1.toCharArray();
            char[] arr2=s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }
}
