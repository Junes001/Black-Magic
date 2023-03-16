n=int(input("Nhập n là bậc của đơn thức:"))
class oop:
    def __init__(self,c,n,p) :
        self.c=c
        
def solve(c):
    b[n]=a[n];
    for i in range (1,n-1):
        b[i]=b[i+1]*c + a[i]
    return b[1]

def chia(c):
    b[n]=a[n]
    for i in range(1,n-1):
        b[i]=b[i+1]*c+a[i]
    printf("(")
    for i in range (2,n):
        print("b:",i-1,"x:"i-2)
        if (i>2):
            print("+ ")
    print(\n)
    for i in range(2,n):
        print("b",i-1,"="b[i])
    print("Phan du :",b[1])
}

def nhan(c):
    b[n]=a[n];
    b[0]=a[1]*(-c);
    for(int i=n-1;i>=1;i--)
    {
        b[i]=a[i+1]*(-c)+a[i];
    }

    printf("(");
    for(int i=n;i>=0;i--)
    {
        printf("b%dx^%d ",i+1,i);
        if (i>0) printf("+ ");
    }
    printf(")\n");
    for(int i=n;i>=0;i--)
    {
        printf("b%d=%f\n",i+1,b[i]);
    }
}





float daoham(float c)
{
    b[n]=a[n];
    for(int i=n-1;i>=1;i--)
    {
        b[i]=b[i+1]*c+a[i];
    }
    C[n]=b[n];
    for(int i=n-1;i>=2;i--)
    {
        C[i]=C[i+1]*c+b[i];
    }
    return C[2];
}