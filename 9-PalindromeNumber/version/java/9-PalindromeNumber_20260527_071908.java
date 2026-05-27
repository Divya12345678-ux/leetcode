// Last updated: 5/27/2026, 7:19:08 AM
1class Solution {
2    public boolean isPalindrome(int x) {
3    if(x<0 || (x%10==0 && x != 0)){
4        return false;
5    }    
6    int rev=0;
7    while(x>rev){
8        int digit=x%10;
9        rev=rev*10+digit;
10        x/=10;
11    }
12    return x==rev || x==rev/10;
13    }
14}