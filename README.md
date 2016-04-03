# GenericSort

Sorting by java generic \<T extends Comparable\<T\>\>

Result of research test:

---------------------------------------

## Test with many unique items:

Amount elements = 10000 items

> Collections.sort() --> 2.0 ms

> class sort.MergeSortIndex --> 3.4 ms

> class sort.MergeSort --> 3.2 ms

> class sort.CountingSort --> 4.0 ms

> class sort.SquareSort --> 5.6 ms

> class sort.SelectionSort --> 150.2 ms

> class sort.BinarySort --> 6.8 ms

> class sort.InsertionSort --> 148.4 ms

---------------------------------------

## Test with many unique strings:

Amount elements = 10000 items

> Collections.sort() --> 31.0 ms

> class sort.MergeSortIndex --> 36.0 ms

> class sort.MergeSort --> 69.8 ms

> class sort.CountingSort --> 77.0 ms

> class sort.SquareSort --> 45.4 ms

> class sort.SelectionSort --> 1696.6 ms

> class sort.BinarySort --> 25.0 ms

> class sort.InsertionSort --> 924.0 ms

---------------------------------------

## Test add new item to sorted many unique items :

Amount elements = 10000 items

> Collections.sort() --> 0.0 ms

> class sort.MergeSortIndex --> 2.0 ms

> class sort.MergeSort --> 4.0 ms

> class sort.CountingSort --> 6.2 ms

> class sort.SquareSort --> 7.0 ms

> class sort.SelectionSort --> 200.6 ms

> class sort.BinarySort --> 0.4 ms

> class sort.InsertionSort --> 0.4 ms

---------------------------------------

## Test add 2 new item to sorted many unique items :

Amount elements = 10000 items

> Collections.sort() --> 0.0 ms

> class sort.MergeSortIndex --> 0.8 ms

> class sort.MergeSort --> 3.0 ms

> class sort.CountingSort --> 6.0 ms

> class sort.SquareSort --> 3.4 ms

> class sort.SelectionSort --> 219.0 ms

> class sort.BinarySort --> 0.4 ms

> class sort.InsertionSort --> 0.2 ms

---------------------------------------

## Test add new item to sorted many unique items. variant 2:

Amount elements = 10000 items

> Collections.sort() --> 1.0 ms

> class sort.MergeSortIndex --> 21.4 ms

> class sort.MergeSort --> 59.8 ms

> class sort.CountingSort --> 73.8 ms

> class sort.SquareSort --> 179.4 ms

> class sort.SelectionSort --> 280.0 ms

> class sort.BinarySort --> 4.4 ms

> class sort.InsertionSort --> 2.6 ms

---------------------------------------

## Test with many unique items on invert direction:

Amount elements = 10000 items

> Collections.sort() --> 1.0 ms

> class sort.MergeSortIndex --> 1.6 ms

> class sort.MergeSort --> 3.8 ms

> class sort.CountingSort --> 6.4 ms

> class sort.SquareSort --> 5.2 ms

> class sort.SelectionSort --> 188.2 ms

> class sort.BinarySort --> 1.0 ms

> class sort.InsertionSort --> 0.6 ms









---------------------------------------

## Test with many same items:

Amount elements = 10000 items

> Collections.sort() --> 5.0 ms

> class sort.MergeSortIndex --> 2.0 ms

> class sort.MergeSort --> 2.6 ms

> class sort.CountingSort --> 0.2 ms

> class sort.SquareSort --> 6.4 ms

> class sort.SelectionSort --> 153.0 ms

> class sort.BinarySort --> 5.8 ms

> class sort.InsertionSort --> 153.4 ms


---------------------------------------

## Test add new item to sorted many same items :

Amount elements = 10000 items

> Collections.sort() --> 1.0 ms

> class sort.MergeSortIndex --> 2.0 ms

> class sort.MergeSort --> 6.0 ms

> class sort.CountingSort --> 4.8 ms

> class sort.SquareSort --> 4.2 ms

> class sort.SelectionSort --> 149.2 ms

> class sort.BinarySort --> 0.6 ms

> class sort.InsertionSort --> 0.2 ms

---------------------------------------

## Test add new item to sorted many same items. variant 2 :

Amount elements = 10000 items

> Collections.sort() --> 1.0 ms

> class sort.MergeSortIndex --> 3.4 ms

> class sort.MergeSort --> 10.2 ms

> class sort.CountingSort --> 16.2 ms

> class sort.SquareSort --> 6.4 ms

> class sort.SelectionSort --> 156.6 ms

> class sort.BinarySort --> 1.6 ms

> class sort.InsertionSort --> 0.4 ms

---------------------------------------

## Research of sorting:

Amount elements = 1.0 ... 1000000.0 items

Result of research

> Collections.sort()

>    Amount:   10^0 |   10^1 |   10^2 |   10^3 |   10^4 |   10^5 |   10^6 |

>  Time(ms):    0.0 |    1.0 |    0.0 |    8.0 |   27.0 |  233.0 |  875.0 |


> class sort.MergeSortIndex

>    Amount:   10^0 |   10^1 |   10^2 |   10^3 |   10^4 |   10^5 |   10^6 |

>  Time(ms):    0.0 |    0.0 |    0.4 |    7.2 |   10.8 |  119.8 |  969.2 |


> class sort.MergeSort

>    Amount:   10^0 |   10^1 |   10^2 |   10^3 |   10^4 |   10^5 |   10^6 |

>  Time(ms):    0.0 |    0.2 |    0.6 |    1.8 |   10.0 |  126.2 |  556.2 |


> class sort.CountingSort

>    Amount:   10^0 |   10^1 |   10^2 |   10^3 |   10^4 |   10^5 |   10^6 |

>  Time(ms):    0.2 |    1.4 |    0.2 |    1.6 |   11.6 |   86.0 | 1184.2 |


> class sort.SquareSort

>    Amount:   10^0 |   10^1 |   10^2 |   10^3 |   10^4 |   10^5 |   10^6 |

>  Time(ms):    0.0 |    0.2 |    1.2 |    3.2 |   11.2 |   77.0 | 1017.4 |


---------------------------------------

class SelectionSort is very slow, don`t use this class

class BinarySort is very slow, don`t use this class

class InsertionSort is very slow, don`t use this class

### Main result - use Collections.sort() by default, except CountingSort just for special cases.


--------------------------------------------------