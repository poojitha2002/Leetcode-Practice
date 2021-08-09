class Solution {
    public int findMinFibonacciNumbers(int k) {
        int a = 1;
        int b = 1;
        int c;
        while (b < k) {
            c=a;
            a=b;
            b=c+b;
        }
        int count = 0;
        while (k != 0) {
        	if (k >= b) {
        		k = k - b;
        		++count;
        	}
            c=a;
            a=b-a;
            b=c;
        }
        return count;
    }
}