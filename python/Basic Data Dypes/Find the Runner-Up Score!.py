if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    lst=set(arr)
    ls2=list(lst)
    ls2.sort()
    print(ls2[-2])
