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

## class research.tests.integer.TestNotUnique:

> class sort.MergeSortIndex     	9.76     ms

> class sort.MergeSortIndex2    	30.54    ms

> class sort.MergeSort          	25.98    ms

> class sort.MergeSort2         	26.55    ms

> class sort.MergeSort5Segment  	15.11    ms

> class sort.CountingSort       	6.00     ms

> class sort.SquareSort         	30.14    ms

> class sort.SelectionSort      	260.69   ms

> class sort.BinarySort         	11.26    ms

> class sort.InsertionSort      	219.22   ms

> Collections.sort              	1.44     ms	*



## class research.tests.integer.TestUnique:

> class sort.MergeSortIndex     	3.21     ms

> class sort.MergeSortIndex2    	10.81    ms

> class sort.MergeSort          	3.03     ms

> class sort.MergeSort2         	23.20    ms

> class sort.MergeSort5Segment  	3.38     ms

> class sort.CountingSort       	10.93    ms

> class sort.SquareSort         	4.75     ms

> class sort.SelectionSort      	88.74    ms

> class sort.BinarySort         	8.18     ms

> class sort.InsertionSort      	86.75    ms

> Collections.sort              	1.07     ms	*



## class research.tests.integer.TestInvert:

> class sort.MergeSortIndex     	0.76     ms

> class sort.MergeSortIndex2    	1.47     ms

> class sort.MergeSort          	1.24     ms

> class sort.MergeSort2         	3.25     ms

> class sort.MergeSort5Segment  	1.85     ms

> class sort.CountingSort       	1.62     ms

> class sort.SquareSort         	2.70     ms

> class sort.SelectionSort      	102.97   ms

> class sort.BinarySort         	7.68     ms

> class sort.InsertionSort      	160.80   ms

> Collections.sort              	0.54     ms	*



## class research.tests.integer.TestSortedList:

> class sort.MergeSortIndex     	0.74     ms

> class sort.MergeSortIndex2    	0.87     ms

> class sort.MergeSort          	1.24     ms

> class sort.MergeSort2         	1.22     ms

> class sort.MergeSort5Segment  	1.58     ms

> class sort.CountingSort       	2.95     ms

> class sort.SquareSort         	2.85     ms

> class sort.SelectionSort      	79.41    ms

> class sort.BinarySort         	0.74     ms

> class sort.InsertionSort      	0.08     ms

> Collections.sort              	0.03     ms	*



## class research.tests.integer.TestPreSort:

> class sort.MergeSortIndex     	0.74     ms

> class sort.MergeSortIndex2    	2.12     ms

> class sort.MergeSort          	1.37     ms

> class sort.MergeSort2         	3.39     ms

> class sort.MergeSort5Segment  	2.34     ms

> class sort.CountingSort       	1.28     ms

> class sort.SquareSort         	5.11     ms

> class sort.SelectionSort      	83.14    ms

> class sort.BinarySort         	1.57     ms

> class sort.InsertionSort      	0.26     ms	*

> Collections.sort              	0.40     ms



## class research.tests.integer.TestSameElements:

> class sort.MergeSortIndex     	0.80     ms

> class sort.MergeSortIndex2    	0.31     ms

> class sort.MergeSort          	1.35     ms

> class sort.MergeSort2         	0.77     ms

> class sort.MergeSort5Segment  	2.75     ms

> class sort.CountingSort       	0.38     ms

> class sort.SquareSort         	28.26    ms

> class sort.SelectionSort      	89.14    ms

> class sort.BinarySort         	7.11     ms

> class sort.InsertionSort      	160.50   ms

> Collections.sort              	0.02     ms	*



## class research.tests.integer.TestPreSortWith2Unique:

> class sort.MergeSortIndex     	0.53     ms

> class sort.MergeSortIndex2    	0.35     ms

> class sort.MergeSort          	1.15     ms

> class sort.MergeSort2         	0.88     ms

> class sort.MergeSort5Segment  	1.54     ms

> class sort.CountingSort       	3.38     ms

> class sort.SquareSort         	4.56     ms

> class sort.SelectionSort      	82.71    ms

> class sort.BinarySort         	0.14     ms

> class sort.InsertionSort      	0.10     ms

> Collections.sort              	0.03     ms	*



## class research.tests.integer.TestPreSortWith5Unique:

> class sort.MergeSortIndex     	0.55     ms

> class sort.MergeSortIndex2    	0.37     ms

> class sort.MergeSort          	1.52     ms

> class sort.MergeSort2         	0.43     ms

> class sort.MergeSort5Segment  	1.55     ms

> class sort.CountingSort       	2.17     ms

> class sort.SquareSort         	3.13     ms

> class sort.SelectionSort      	75.69    ms

> class sort.BinarySort         	0.16     ms

> class sort.InsertionSort      	0.09     ms

> Collections.sort              	0.06     ms	*



## class research.tests.string.TestStringSameElement:

> class sort.MergeSortIndex     	16.10    ms

> class sort.MergeSortIndex2    	2.42     ms

> class sort.MergeSort          	24.28    ms

> class sort.MergeSort2         	3.95     ms

> class sort.MergeSort5Segment  	32.94    ms

> class sort.CountingSort       	4.50     ms

> class sort.SquareSort         	81.85    ms

> class sort.SelectionSort      	211.86   ms

> class sort.BinarySort         	9.07     ms

> class sort.InsertionSort      	532.02   ms

> Collections.sort              	0.55     ms	*



## class research.tests.string.TestStringUnique:

> class sort.MergeSortIndex     	4.03     ms

> class sort.MergeSortIndex2    	29.99    ms

> class sort.MergeSort          	44.97    ms

> class sort.MergeSort2         	43.75    ms

> class sort.MergeSort5Segment  	36.54    ms

> class sort.CountingSort       	18.78    ms

> class sort.SquareSort         	25.26    ms

> class sort.SelectionSort      	959.51   ms

> class sort.BinarySort         	13.12    ms

> class sort.InsertionSort      	537.69   ms

> Collections.sort              	1.22     ms	*



## class research.tests.string.TestStringNotUnique:

> class sort.MergeSortIndex     	2.61     ms

> class sort.MergeSortIndex2    	5.22     ms

> class sort.MergeSort          	5.23     ms

> class sort.MergeSort2         	7.84     ms

> class sort.MergeSort5Segment  	3.35     ms

> class sort.CountingSort       	0.84     ms

> class sort.SquareSort         	9.13     ms

> class sort.SelectionSort      	586.28   ms

> class sort.BinarySort         	9.59     ms

> class sort.InsertionSort      	390.13   ms

> Collections.sort              	0.72     ms	*



---------------------------------------

class SelectionSort is very slow, don`t use this class

class BinarySort is very slow, don`t use this class

class InsertionSort is very slow, don`t use this class

### Main result - use Collections.sort() by default, except CountingSort just for special cases.


--------------------------------------------------