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

class research.tests.integer.TestNotUnique:
class sort.MergeSortIndex     	7.82     ms
class sort.MergeSortIndex2    	29.98    ms
class sort.MergeSort          	22.11    ms
class sort.MergeSort2         	24.28    ms
class sort.MergeSort5Segment  	9.42     ms
class sort.CountingSort       	6.67     ms
class sort.SquareSort         	34.93    ms
class sort.SelectionSort      	183.31   ms
class sort.BinarySort         	6.93     ms
class sort.InsertionSort      	111.96   ms
Collections.sort              	1.75     ms	*

class research.tests.integer.TestUnique:
class sort.MergeSortIndex     	3.35     ms
class sort.MergeSortIndex2    	11.00    ms
class sort.MergeSort          	3.28     ms
class sort.MergeSort2         	10.01    ms
class sort.MergeSort5Segment  	3.35     ms
class sort.CountingSort       	10.46    ms
class sort.SquareSort         	5.40     ms
class sort.SelectionSort      	84.07    ms
class sort.BinarySort         	7.87     ms
class sort.InsertionSort      	85.23    ms
Collections.sort              	1.78     ms	*

class research.tests.integer.TestInvert:
class sort.MergeSortIndex     	1.40     ms
class sort.MergeSortIndex2    	2.40     ms
class sort.MergeSort          	2.26     ms
class sort.MergeSort2         	2.57     ms
class sort.MergeSort5Segment  	4.56     ms
class sort.CountingSort       	2.62     ms
class sort.SquareSort         	4.66     ms
class sort.SelectionSort      	116.26   ms
class sort.BinarySort         	7.32     ms
class sort.InsertionSort      	160.74   ms
Collections.sort              	0.43     ms	*

class research.tests.integer.TestSortedList:
class sort.MergeSortIndex     	1.21     ms
class sort.MergeSortIndex2    	1.32     ms
class sort.MergeSort          	2.35     ms
class sort.MergeSort2         	1.09     ms
class sort.MergeSort5Segment  	2.95     ms
class sort.CountingSort       	3.22     ms
class sort.SquareSort         	4.62     ms
class sort.SelectionSort      	79.32    ms
class sort.BinarySort         	0.42     ms
class sort.InsertionSort      	0.05     ms
Collections.sort              	0.02     ms	*

class research.tests.integer.TestPreSort:
class sort.MergeSortIndex     	0.74     ms
class sort.MergeSortIndex2    	3.46     ms
class sort.MergeSort          	2.42     ms
class sort.MergeSort2         	4.09     ms
class sort.MergeSort5Segment  	2.07     ms
class sort.CountingSort       	0.51     ms
class sort.SquareSort         	3.16     ms
class sort.SelectionSort      	76.14    ms
class sort.BinarySort         	1.30     ms
class sort.InsertionSort      	0.28     ms	*
Collections.sort              	0.29     ms

class research.tests.integer.TestSameElements:
class sort.MergeSortIndex     	0.76     ms
class sort.MergeSortIndex2    	0.23     ms
class sort.MergeSort          	1.57     ms
class sort.MergeSort2         	0.17     ms
class sort.MergeSort5Segment  	2.32     ms
class sort.CountingSort       	0.29     ms
class sort.SquareSort         	24.33    ms
class sort.SelectionSort      	91.87    ms
class sort.BinarySort         	6.58     ms
class sort.InsertionSort      	160.24   ms
Collections.sort              	0.02     ms	*

class research.tests.integer.TestPreSortWith2Unique:
class sort.MergeSortIndex     	0.67     ms
class sort.MergeSortIndex2    	0.48     ms
class sort.MergeSort          	1.46     ms
class sort.MergeSort2         	0.29     ms
class sort.MergeSort5Segment  	2.04     ms
class sort.CountingSort       	3.02     ms
class sort.SquareSort         	2.63     ms
class sort.SelectionSort      	78.53    ms
class sort.BinarySort         	0.14     ms
class sort.InsertionSort      	0.08     ms
Collections.sort              	0.03     ms	*

class research.tests.integer.TestPreSortWith5Unique:
class sort.MergeSortIndex     	0.57     ms
class sort.MergeSortIndex2    	0.39     ms
class sort.MergeSort          	1.40     ms
class sort.MergeSort2         	0.35     ms
class sort.MergeSort5Segment  	2.11     ms
class sort.CountingSort       	1.99     ms
class sort.SquareSort         	3.09     ms
class sort.SelectionSort      	81.97    ms
class sort.BinarySort         	0.18     ms
class sort.InsertionSort      	0.10     ms
Collections.sort              	0.03     ms	*

class research.tests.string.TestStringSameElement:
class sort.MergeSortIndex     	16.59    ms
class sort.MergeSortIndex2    	3.15     ms
class sort.MergeSort          	33.10    ms
class sort.MergeSort2         	2.75     ms
class sort.MergeSort5Segment  	12.96    ms
class sort.CountingSort       	4.69     ms
class sort.SquareSort         	90.33    ms
class sort.SelectionSort      	206.72   ms
class sort.BinarySort         	11.52    ms
class sort.InsertionSort      	514.30   ms
Collections.sort              	0.55     ms	*

class research.tests.string.TestStringUnique:
class sort.MergeSortIndex     	3.95     ms
class sort.MergeSortIndex2    	15.73    ms
class sort.MergeSort          	35.85    ms
class sort.MergeSort2         	29.57    ms
class sort.MergeSort5Segment  	15.60    ms
class sort.CountingSort       	25.35    ms
class sort.SquareSort         	45.23    ms
class sort.SelectionSort      	941.19   ms
class sort.BinarySort         	13.54    ms
class sort.InsertionSort      	546.52   ms
Collections.sort              	3.85     ms	*

class research.tests.string.TestStringNotUnique:
class sort.MergeSortIndex     	4.08     ms
class sort.MergeSortIndex2    	5.17     ms
class sort.MergeSort          	3.08     ms
class sort.MergeSort2         	11.85    ms
class sort.MergeSort5Segment  	5.16     ms
class sort.CountingSort       	0.40     ms	*
class sort.SquareSort         	8.72     ms
class sort.SelectionSort      	586.59   ms
class sort.BinarySort         	7.87     ms
class sort.InsertionSort      	380.14   ms
Collections.sort              	0.72     ms

---------------------------------------

class SelectionSort is very slow, don`t use this class

class BinarySort is very slow, don`t use this class

class InsertionSort is very slow, don`t use this class

### Main result - use Collections.sort() by default, except CountingSort just for special cases.


--------------------------------------------------