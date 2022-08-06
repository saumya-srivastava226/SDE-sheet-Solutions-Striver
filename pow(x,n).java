class Solution {
    public double myPow(double x, int n) {
        double pow=1;
        long temp=n;
        if(temp<0)
            temp=temp*-1;
        while(temp>0)
        {
            if(temp%2!=0)
            {
                pow=pow*x;
                temp=temp-1;
            }
            else
            {
                x=x*x;
                temp=temp/2;
            }
        }
        if(n<0)
            return (double)1.0/(double)pow;
        return pow;
        
    }
}
