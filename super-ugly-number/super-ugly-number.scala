import scala.collection.mutable.PriorityQueue
object Solution {
    
    var res: Array[Int] = Array[Int]()
    
    case class pair(prime: Int, num: Int, index: Int) extends Ordered[pair] {
        
        def compare(that: pair): Int = this.num.compare(that.num)
        
        def next: pair = pair(prime, res(index)*prime,index+1)
    }
    def nthSuperUglyNumber(n: Int, primes: Array[Int]): Int = {
        
        val h = PriorityQueue.empty(Ordering[pair].reverse)
        
        if (n == 1) 
        return 1
        for (p <- primes) {
            
            h.enqueue(pair(p, p, 1))
        }
        res = Array.ofDim[Int](n)
        res(0) = 1
        for (i <- 1 until n) {
            
            val tmp = h.dequeue()
            
            res(i) = tmp.num
            
            h.enqueue(tmp.next)
           
            while (h.head.num == tmp.num) {
                h.enqueue(h.dequeue().next)
            }
        }
        res.last
    }
}