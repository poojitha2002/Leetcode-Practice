class CustomStack {
    int []a;
    
    int size;
    int i;
    int k1;
    public CustomStack(int maxSize) {
       a=new int[maxSize];
       k1=maxSize;
        size=0;
        i=0;
    }
    
    public void push(int x) {
        if(i<k1)
        {
            a[i++]=x;
        }
    }
    
    public int pop() {
        
        if(i>0)
        {
            int v= a[i-1];
            i--;
            return v;
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        for(int j=0;j<k && j<i;j++)
            a[j]=a[j]+val;
            
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */