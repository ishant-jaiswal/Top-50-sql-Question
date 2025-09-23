class MinStack {
    ArrayList<Integer> arr;
    public MinStack() {
        arr=new ArrayList<>();
    }
    
    public void push(int val) {
        arr.add(val);
    }
    
    public void pop() {
        arr.remove(arr.size()-1);
    }
    
    public int top() {
        return arr.get(arr.size()-1);
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<min){
                min=arr.get(i);
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */