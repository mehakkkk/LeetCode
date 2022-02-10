public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        System.out.println(n);
        while(n!=0)
        {
            System.out.println(n+" "+(n&1));
            count+= (n&1);
            
            n= n>>>1;
        }
        return count;
        
    }
}