n=int(input())
a=[]
for i in range(n):
    k=input()
    a.append(k)
l=list(set(a))
print(len(l))
