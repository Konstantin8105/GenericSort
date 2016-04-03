# GenericSort

Sorting by java generic \<T extends Comparable\<T\>\>

Result of research test:

--------------------------------------------------

##Test. Checking of correct result:

Amount elements = 10000 items

>class MergeSort --> OK

>class CountingSort --> OK

>class SelectionSort --> OK

>class BinarySort --> OK

>class InsertionSort --> OK
 
---------------------------------------

## Test with many same items:

Amount elements = 10000 items

> Collections.sort() --> 4.0 ms

> class sort.MergeSortIndex --> 2.0 ms

> class sort.MergeSort --> 2.4 ms

> class sort.CountingSort --> 0.4 ms

> class sort.SquareSort --> 6.0 ms

> class sort.SelectionSort --> 132.0 ms

> class sort.BinarySort --> 4.8 ms

> class sort.InsertionSort --> 135.8 ms

---------------------------------------

## Test with many unique items:

Amount elements = 10000 items

> Collections.sort() --> 6.0 ms

> class sort.MergeSortIndex --> 3.6 ms

> class sort.MergeSort --> 3.8 ms

> class sort.CountingSort --> 5.8 ms

> class sort.SquareSort --> 6.0 ms

> class sort.SelectionSort --> 139.8 ms

> class sort.BinarySort --> 7.0 ms

> class sort.InsertionSort --> 139.0 ms

---------------------------------------

## Test add new item to sorted many unique items :

Amount elements = 10000 items

> Collections.sort() --> 0.0 ms

> class sort.MergeSortIndex --> 2.0 ms

> class sort.MergeSort --> 3.2 ms

> class sort.CountingSort --> 6.8 ms

> class sort.SquareSort --> 4.4 ms

> class sort.SelectionSort --> 184.8 ms

> class sort.BinarySort --> 0.2 ms

> class sort.InsertionSort --> 0.2 ms

---------------------------------------

## Test add new item to sorted many same items :

Amount elements = 10000 items

> Collections.sort() --> 0.0 ms

> class sort.MergeSortIndex --> 1.6 ms

> class sort.MergeSort --> 3.0 ms

> class sort.CountingSort --> 3.6 ms

> class sort.SquareSort --> 4.2 ms

> class sort.SelectionSort --> 148.4 ms

> class sort.BinarySort --> 0.8 ms

> class sort.InsertionSort --> 0.6 ms

---------------------------------------

## Test with many unique items on invert direction:

Amount elements = 10000 items

> Collections.sort() --> 0.0 ms

> class sort.MergeSortIndex --> 1.2 ms

> class sort.MergeSort --> 2.0 ms

> class sort.CountingSort --> 6.0 ms

> class sort.SquareSort --> 28.8 ms

> class sort.SelectionSort --> 197.2 ms

> class sort.BinarySort --> 0.8 ms

> class sort.InsertionSort --> 0.4 ms

---------------------------------------

## Research of sorting:


Amount elements = 1.0 ... 1000000.0 items


Result of research


Collections.sort()

   Amount:   10^0 |   10^1 |   10^2 |   10^3 |   10^4 |   10^5 |   10^6 |
   
 Time(ms):    0.0 |    0.0 |    0.0 |    1.0 |    2.0 |   27.0 |  476.0 |

class sort.MergeSortIndex

   Amount:   10^0 |   10^1 |   10^2 |   10^3 |   10^4 |   10^5 |   10^6 |
   
 Time(ms):    0.0 |    0.0 |    0.0 |    0.2 |    2.2 |   37.0 |  810.8 |

class sort.MergeSort

   Amount:   10^0 |   10^1 |   10^2 |   10^3 |   10^4 |   10^5 |   10^6 |
   
 Time(ms):    0.0 |    0.0 |    0.2 |    0.2 |    2.4 |   40.6 |  596.6 |
 

class sort.CountingSort

   Amount:   10^0 |   10^1 |   10^2 |   10^3 |   10^4 |   10^5 |   10^6 |
   
 Time(ms):    0.0 |    0.0 |    0.0 |    0.2 |    3.6 |   78.0 | 1364.6 |

class sort.SquareSort

   Amount:   10^0 |   10^1 |   10^2 |   10^3 |   10^4 |   10^5 |   10^6 |
   
 Time(ms):    0.0 |    0.0 |    0.0 |    0.4 |    5.2 |   67.2 | 1129.0 |
 
--------------------------------------------------


class SelectionSort is very slow, don`t use this class

class BinarySort is very slow, don`t use this class

class InsertionSort is very slow, don`t use this class

### Main result - use Collections.sort() by default, except CountingSort just for special cases.


--------------------------------------------------