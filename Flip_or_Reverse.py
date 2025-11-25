import math
for _ in range(int(input())):
    n = int(input())
    a = input()
    b = input()
    cnt1 = 0
    cnt2 = 0
    for i in range(n):
        if a[i]!=b[i]:
            cnt1+=1
        else:
            cnt2+=1
    if cnt1<=math.ceil(float(n/2)):
        print(cnt1)
    else:
        print(cnt2)