import numpy as np

def Mul(A,xk):
    A.append(1)
    for i in range(len(A)-2,0,-1):
        A[i] = A[i - 1] - A[i] * xk
    A[0] = - A[0] * xk
    return A

def Div(A,xk):
    B = np.ones(len(A) - 1)
    for i in range(len(B) - 2,-1,-1):
        B[i] = A[i + 1] + B[i + 1] * xk
    return B

def init():
    global x,y,n
    x = []
    y = []
    with open('input.txt','r+') as f:
            for line in f.readlines():
                xt = float(line.split(' ')[0])
                yt = float(line.split(' ')[1])
                check = True
                for x_check in x:
                    if x_check == xt:
                        check = False
                        break
                if check:
                    x.append(xt)
                    y.append(yt)
    x = np.asarray(x)
    y = np.asarray(y)
    n = len(x)

def solve():
    D = []
    for i in range(n):
        D.append(1)
        for j in range(n):
            if(i != j):
                D[i] *= (x[i] - x[j])
    D = np.asarray(D)
    # tinh w
    w = [1]
    for i in range(n):
        w = Mul(w,x[i])
    w = np.asarray(w)
    # tinh wi
    wi = []
    for i in range(n):
        wi.append(Div(w,x[i]))
    wi = np.asarray(wi)

    # tinh px
    px = np.zeros(n)
    for i in range(n):
        for j in range(n):
            px[i] += wi[j,i] * y[j] / D[j]

    print(px)

def main():
    init()
    solve()