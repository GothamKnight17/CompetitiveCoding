for _ in range(int(input())):
    n = int(input())
    x  = list(map(int, input().split()))
    y  = list(map(int, input().split()))
    absDif = []
    for i in range(n):
        absDif.append(abs(y[0]-y[i]))
    notPossible = False
    for i in range(1, n):
        prev, curr = absDif[i-1], absDif[i]
        if prev > curr:
            notPossible = True
            break
        if prev == curr:
            if y[i-1] > y[i]:
                notPossible = True
                break
        if notPossible == True:
            break
    
    if notPossible == True:
        print(-1)
    else:
        print(x.index(y[0])+1)