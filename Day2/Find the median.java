//https://www.geeksforgeeks.org/problems/find-the-median0527/1

class Solution
{
    public int find_median(int[] v)
    {
        int value = 0;
        Arrays.sort(v);
        int n = v.length;
        
        if(n%2==0){
            value=(v[n/2-1]+v[n/2])/2;
        }
        else{
            value=v[n/2];            
                
        }
            
        
    return value;
    }
}
