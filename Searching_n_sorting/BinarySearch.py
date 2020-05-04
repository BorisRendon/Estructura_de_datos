
def binarySearch(arr,l,r,x):
    if r>=l:
        mid = l + (r-l)

        if arr[mid] == x:
            return mid


        elif arr[mid] >x:
            return binarySearch(arr,l,mid-1,x)


        else:
            return binarySearch(arr,mid+1,r,x)
        
    else:
        return -1


#arr = range(1,10000)
#x = randint(1,1000)
