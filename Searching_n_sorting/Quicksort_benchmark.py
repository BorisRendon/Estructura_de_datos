from  QuickSort import quicksort , partition
from random import randint

arr = list(range(1, 1000))
n = len(arr)


def test_quicksort(benchmark):
    benchmark(quicksort, arr,0,n-1)
