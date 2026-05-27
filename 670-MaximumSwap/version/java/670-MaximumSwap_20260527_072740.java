// Last updated: 5/27/2026, 7:27:40 AM
1class Solution {
2    public int maximumSwap(int num) {
3    char[] numArr = Integer.toString(num).toCharArray();
4    int n = numArr.length;
5    int[] last=new int[10];
6    for(int i=0;i<n;i++){
7        last[numArr[i]-'0']=i;
8    }    
9    for(int i=0;i<n;i++){
10        for(int d=9;d>numArr[i]-'0';d--){
11            if(last[d]>i){
12                char temp=numArr[i];
13                numArr[i]=numArr[last[d]];
14                numArr[last[d]]=temp;
15                return Integer.parseInt(new String(numArr));
16            }
17        }
18    }
19    return num;
20    }
21}