def find_unique_number(arr):
    result = 0
    for num in arr:
        result ^= num
    return result

arr=[4,2,2,1,5,6,7,5,6,7,4]
result=find_unique_number(arr)
print(result)