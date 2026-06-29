class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack=new ArrayList<>();//Creating a stack 
        for(int i=0;i<s.length();i++)//Loop for iteration througout the sequence of given string
        {
            char c=s.charAt(i);//Current bracket of string 
            if(c=='('||c=='{'||c=='[')
            {
                stack.add(c);//Adding the open brackets to stack
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
            
            char last=stack.get(stack.size()-1);
            if((c==')' && last=='(')||(c=='}' && last=='{')||(c==']' && last=='['))
            {
                stack.remove(stack.size()-1);
            }
            else
            {
                return false;
            }
        }
        }
        return stack.isEmpty();
    }
}
