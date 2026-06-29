class MinStack {
    private int[] arr;
    private int top;
    
    public MinStack() {
        // Starting with a manageable size; can be adjusted or dynamically resized as needed.
        arr = new int[100];
        top = -1;
    }
    
    public void push(int val) {
        // Resize if necessary
        if (top == arr.length - 1) {
            int[] newArr = new int[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        arr[++top] = val;
    }
    
    public void pop() {
        if (top >= 0) {
            top--;
        }
    }
    
    public int top() {
        if (top >= 0) {
            return arr[top];
        }
        throw new RuntimeException("Stack is empty");
    }
    
    public int getMin() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        int min = arr[0];
        for (int i = 1; i <= top; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
