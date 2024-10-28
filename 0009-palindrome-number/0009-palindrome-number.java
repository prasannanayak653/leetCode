class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){//If the value of the Interger is a Negative value it returns false
            return false;
        }
        int rev=0;
        int temp=x;
        while(temp!=0){//repeats the loops until the temp value is 0. 
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        return (rev==x);//It will return a Boolean value by Comparing the  reverse value and Original value

        
        


        
    }
}