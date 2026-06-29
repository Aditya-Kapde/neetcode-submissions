class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        
        int[] target = new int[128];
        int[] window = new int[128];
        
        for (int i = 0; i < t.length(); i++) {
            target[t.charAt(i)]++;
        }
        
        int required = t.length();  
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;
    
        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            window[r]++;
            
            if (window[r] <= target[r]) {
                required--;
            }
            
            
            while (required == 0) {
                
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }
                
                char l = s.charAt(left);
                window[l]--;
                
               
                if (window[l] < target[l]) {
                    required++;
                }
                
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}
