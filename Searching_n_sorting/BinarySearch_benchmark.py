from BinarySearch import binarySearch
from random import randint
from searching import linear_search, jump_search

arr = list(range(1, 1000))
x = randint(1, 999)

#resutl = binarySearch(arr,0,len(arr)-1,x)

def test_Binary_Search(benchmark):
    benchmark(binarySearch,arr,0,len(arr)-1,x)
