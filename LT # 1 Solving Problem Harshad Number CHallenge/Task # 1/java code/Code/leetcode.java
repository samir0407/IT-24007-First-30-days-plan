class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int num) {

        int temp=num;
        int rem,sum=0;
        while (temp>0)
        {
            rem=temp%10;
            temp=temp/10;
            sum=sum+rem;
            
        }
        if (num%sum==0){
            return sum;
        }
        else {
            return -1;
        }
    }
}

    
