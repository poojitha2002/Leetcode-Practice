class Solution {
    public int shortestSubarray(int[] A, int K) {
        int[] sum = new int[A.length + 1];
        int curSum = 0;
        for (int i = 0; i < A.length; i++) {
            curSum += A[i];
            sum[i + 1] = curSum;
        }
        Deque<Integer> deque = new LinkedList<>();
        deque.offer(0);
        int sh = -1;
        for (int i = 1; i < sum.length; i++) {
            while (!deque.isEmpty() && sum[deque.peekLast()] >= sum[i]) {  
                deque.pollLast();
            }
            while (!deque.isEmpty() && sum[i] - sum[deque.peekFirst()] >= K) {  
                if (sh == -1)
                    sh = i - deque.pollFirst();
                else
                    sh = Math.min(sh, i - deque.pollFirst());
            }
            deque.offerLast(i);
        }
        
        return sh;
    }
}