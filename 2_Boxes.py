for _ in range(int(input())):
    x, y, k = map(int, input().split())
    if k == abs(x-y):
        print(0)
    elif k%2!=abs(x-y)%2:
        print(-1)
    else:
        curr = abs(x-y)
        target = k
        ans = 0
        if curr < target:
            ans = target - curr + 2
            ans /= 2
        else:
            ans = curr - target +  2
            ans /= 2  
        print(int(ans)-1)