def rotate(arr) :
    return arr[-1:] + arr[:-1]

def solution(arrA,arrB):
    arrA_len = len(arrA)
    arrB_len = len(arrB)

    if(arrA_len!=arrB_len):
        return False

    for _ in range(arrA_len):
        if arrA == arrB:

            return True
        arrA = rotate(arrA)
    return False