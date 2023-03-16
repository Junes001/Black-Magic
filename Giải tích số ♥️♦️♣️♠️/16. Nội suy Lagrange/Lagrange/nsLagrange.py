import numpy as np

def hoocneNhan(A,xk):
    A.append(1)
    for i in range(len(A)-2,0,-1):
        A[i] = A[i - 1] - A[i] * xk
    A[0] = - A[0] * xk
    return A

class Hoocne:
    def __init__(self, x):
        self.x = x 

    @classmethod 
    def readInput(cls):
        fileI = open("input.txt", "r")
        x = list(map(float, fileI.readline().split()))

        fileI.close()
def main():
    x=Hoocne.readInput()
    print(x)
    n=len(x)
    for i in range(n):
        print("("),print("x-x",i),print(")"),
    
    # tinh w
    w = [1]
    for i in range(n):
        w = hoocneNhan(w,x[i])
    w = np.asarray(w)


if __name__=='__main__':
    main()