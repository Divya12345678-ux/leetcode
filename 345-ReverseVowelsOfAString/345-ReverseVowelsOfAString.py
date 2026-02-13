# Last updated: 2/13/2026, 10:08:09 AM
class Solution(object):
    def reverseVowels(self, s):
        v=[]
        for i in s:
            if i.lower() in ['a','e','i','o','u']:
                v.append(i)
        v=v[::-1]
        ind=0
        se=list(s)
        for i in range(len(se)):
            if se[i].lower() in ['a','e','i','o','u']:
                se[i]=v[ind]
                ind+=1
        
        return "".join(se)