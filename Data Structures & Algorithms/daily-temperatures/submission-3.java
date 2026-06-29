class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] result=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()])
            {
                int index=stack.pop();
                result[index]=i-index;
            }
            stack.push(i);
        }
        return result;
    }
}
/*
suppose for temp[30, 38, 30, 36, 35, 40, 28]
Iteration-1(i=0)
stack[]
temp[i]=30
stack empty so we push i=0 to stack
stack[0]

Iteration-2(i=1)
stack[0]
temp[i]=38
temp[i]>temp[stack.peek()]=>38>30
So, result[0]=i-index=>result[0]=1-0=1
push i=1 to stack
stack[1]

Iteration-3(i=2)
stack[1]
temp[i]=30
temp[i]!>temp[stack.peek()]=>30!>38
So, push i=2 to stack
stack[1, 2]

Iteration-4(i=3)
stack[1, 2]
temp[i]=36
temp[i]>temp[stack.peek()]=>36>30
pop 2 from stack, result[2]=i-index=3-2=1
So, push i=3 to stack
stack[1, 3]

Iteration-5(i=4)
stack[1, 3]
temp[i]=35
temp[i]!>temp[stack.peek()]=>35!>36
So, push i=4 to stack
stack[1, 3, 4]

Iteration-5(i=5)
stack[1, 3, 4]
temp[i]=40
temp[i]>temp[stack.peek()]=>40>35
pop() 4 and result[4]=i-index=5-4=1
and again temp[i]>temp[stack.peek()]=>40>36
pop() 3 result[3]=i-index=5-3=2
and again temp[i]>temp[stack.peek()]=>40>38
pop() 1 result[1]=i-index=5-1=4
And now push 5 to stack
stack[5]

Iteration-6(i=6)
stack[5]
temp[i]=28
temp[i]!>temp[stack.peek()]=>28!>40
So, push 6 to stack
stack[5, 6]

All iteration ends and final result is[1, 4, 1, 2, 1, 0, 0]
*/
