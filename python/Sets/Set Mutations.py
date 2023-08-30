i=int(input())
a=set(map(int,input().split()))
k=int(input())
for i in range(0,k):
    st=input().split()
    b=set(map(int,input().split()))
    if st[0]=="intersection_update":
        a.intersection_update(b)
    elif st[0]=="update":
        a.update(b)
    elif st[0]=="symmetric_difference_update":
        a.symmetric_difference_update(b)
    else:
        a.difference_update(b)
print(sum(a))
