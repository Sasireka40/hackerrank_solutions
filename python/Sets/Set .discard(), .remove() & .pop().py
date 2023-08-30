n = int(input())
s = set(map(int, input().split()))
k=int(input())
for i in range(0,k):
    str1=input().split()
    if str1[0]=="remove":
        s.remove(int(str1[1]))
    elif str1[0]=="discard":
        s.discard(int(str1[1]))
    elif str1[0]=="pop":
        s.pop()
print(sum(s))
