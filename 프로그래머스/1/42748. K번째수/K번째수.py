def solution(array, commands):
    answer = []
    arr = []
    def cut(start, end):
        i = 0
        for k in range(start -1, end):
            arr.append(array[k])
            i += 1
            
    # cut for len(i)
    for n in range(len(commands)):
        cut(commands[n][0], commands[n][1]);
        # sort by asc
        arr.sort()
        # select number
        answer.append(arr[commands[n][2] - 1])
        arr = []

    return answer

   
        