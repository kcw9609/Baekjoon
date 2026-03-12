def solution(array, commands):
    answer = []
    for i, j, k in commands:
        # cut
        arr = array[i-1:j]
        # sort
        arr.sort()
        #select
        answer.append(arr[k-1])
    
    return answer
