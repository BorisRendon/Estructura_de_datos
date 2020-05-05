
from random import randint

from InsertionSort import insertionSort


arr = list(range(1, 1000))
x = randint(1, 999)

def test_insertionSort(benchmark):
    benchmark(insertionSort,arr)
