/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
         int low=1;
         int high=n;
         while(low<=high)
         {
             int mid=(high)-(high-low)/2;
         //    Sytem.out.println(guess(mid));
             if(guess(mid)==0)
                 return (int)mid;
             else if(guess(mid)==1)
             {
                 low=mid+1;
             }
             else
             {
                 high=mid-1;
             }
         }
        return 0;
        
    }
}