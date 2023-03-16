import numpy as np
eps = float(input("Nhập sai số :")) # nhập sai số 
A = np.loadtxt("input.txt",delimiter=' ')
# Nhập vector b
b = np.array([1,4,1,2,4,12])

def cot():
    # kich thuoc theo hang cua ma tran A
    n,_ = np.shape(A)
    I = np.identity(n) 
    T = np.linalg.inv(np.diag(np.diag(A)))
    B = I - np.dot(T, A)
    d = np.dot(T, b)
    norm_B = np.linalg.norm(B, 1) # chuẩn 1 của ma trận B
    lst = np.diag(A)
    y0 = np.zeros_like(b) # khởi tạo y0 ( ma tran khong)
    i = 0 # số lần lặp
    lamda = max(abs(lst)) / min(abs(lst))

    eps0 = ((1 - norm_B) * eps) / ( lamda * norm_B)
    y1 = np.dot(B, y0) + d
    print("Các nghiệm trung gian:")
    while np.linalg.norm((y1 - y0), 1) > eps0 :
        y0 = y1
        y1 = np.dot(B, y0) + d
        i += 1
        print(y1)

    print("Số lần lặp:",i)
    print("q:",norm_B)
    print("lamda:",lamda)
    print("Kiem tra lai nghiem",A.dot(y1)-b )
def hang():
    # kich thuoc theo hang cua ma tran A
    n,_ = np.shape(A)
    I = np.identity(n) 
    T = np.linalg.inv(np.diag(np.diag(A)))
    B = I - np.dot(T, A)
    d = np.dot(T, b)
    norm_B = np.linalg.norm(B, np.inf) # chuẩn vo cung của ma trận B
    i = 0 # số lần lặp
    x0 = np.zeros_like(b) # khởi tạo x0 ( ma tran khong)
    lst = np.diag(A)
    lamda = max(abs(lst)) / min(abs(lst))

    eps0 = ((1 - norm_B) * eps) / ( lamda * norm_B)
    x1 = np.dot(B, x0) + d
    print("Các nghiệm trung gian:")
    while np.linalg.norm((x1 - x0), np.inf) > eps0 :
        x0 = x1
        x1 = np.dot(B, x0) + d
        i += 1
        print(x1)
    print("Số lần lặp:" ,i)
    print("q:",norm_B)
    print("lamda:",lamda)
    print("Kiem tra lai nghiem",A.dot(x1)-b )

def check(): # Kiểm tra tính chéo trội
    n = int(A.shape[0])
    row_dom = col_dom = 1

    for i in range(n):
        sum_row = sum_col = 0
        for j in range(n): 
            if(i != j):
                sum_row += abs(A[i, j])
                sum_col += abs(A[j, i])

            if(sum_row >= abs(A[i, i])): row_dom = 0
            if(sum_col >= abs(A[i, i])): col_dom = 0


    if(row_dom == 1): return 1
    if(col_dom == 1): return -1
    return 0
p=check()
if np.linalg.det(A) == 0 or p==0:
    print("A không khả nghịch nên không đưa ra được ma trận nghịch đảo")
if(p == 1): 
    print("A chéo trội hàng")
    hang()
if(p == -1):
    print("A chéo trội cột")
    cot()