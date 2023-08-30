m,n=input().split()
arr=input().split()
a=set(input().split())
b=set(input().split())
h=0
for i in arr:
    if i in a:
        h=h+1
    elif i in b:
        h=h-1
print(h)
