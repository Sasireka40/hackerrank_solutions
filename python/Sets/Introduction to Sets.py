def average(array):
    # your code goes here
    
    arr=list(set(array))
    l=len(arr)
    total=0
    for i in range(0,l):
        total+=arr[i]
    m=total/l
    return m
