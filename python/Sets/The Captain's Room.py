a=int(input())
dict={}
for x in input().split():
    dict[x]=dict.get(x,0)+1
for k,v in dict.items():
    if dict[k]==1:
        print(k)
