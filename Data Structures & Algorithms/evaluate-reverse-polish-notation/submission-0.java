class Solution {
    public int evalRPN(String[] tokens) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<tokens.length;i++)
        {
            int a,b;
            if((!tokens[i].equals("+"))&&(!tokens[i].equals("-"))&&(!tokens[i].equals("*"))&&(!tokens[i].equals("/")))
            {
                al.add(Integer.parseInt(tokens[i]));
            }
            else if(tokens[i].equals("+"))
            {
                b=al.remove(al.size()-1);
                a=al.remove(al.size()-1);
                al.add(a+b);
            }
            else if(tokens[i].equals("-"))
            {
                b=al.remove(al.size()-1);
                a=al.remove(al.size()-1);
                al.add(a-b);
            }
            else if(tokens[i].equals("*"))
            {
                b=al.remove(al.size()-1);
                a=al.remove(al.size()-1);
                al.add(a*b);
            }
            else
            {
                b=al.remove(al.size()-1);
                a=al.remove(al.size()-1);
                al.add(a/b);
            }
        }
        return al.remove(al.size()-1);
    }
}
