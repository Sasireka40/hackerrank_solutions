i=int(input())
a=set(map(int,input().split()))
j=int(input())
b=set(map(int,input().split()))
s=list(a.intersection(b))
print(len(s))
