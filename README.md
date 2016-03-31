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
 
--------------------------------------------------

##Test with many same items:

Amount elements = 10000 items

>class MergeSort -->  2.2 ms

>class CountingSort -->  0.4 ms

>class SelectionSort --> 105.6 ms

>class BinarySort -->  7.6 ms

>class InsertionSort --> 124.0 ms

--------------------------------------------------

##Test with many unique items:

Amount elements = 10000 items

>class MergeSort --> 29.8 ms

>class CountingSort --> 16.2 ms

>class SelectionSort --> 197.8 ms

>class BinarySort -->  5.6 ms

> class InsertionSort --> 145.6 ms

--------------------------------------------------

##Test add new item to sorted many unique items :

Amount elements = 10000 items

> class MergeSort -->  2.8 ms
> class CountingSort -->  4.8 ms
> class SelectionSort --> 150.0 ms
> class BinarySort -->  0.2 ms
> class InsertionSort -->  0.2 ms

--------------------------------------------------

##Test add new item to sorted many same items :

Amount elements = 10000 items

> class MergeSort --> 17.8 ms

> class CountingSort --> 26.8 ms

> class SelectionSort --> 303.8 ms

> class BinarySort -->  6.0 ms

> class InsertionSort -->  3.4 ms

--------------------------------------------------

##Test with many unique items on invert direction:

Amount elements = 10000 items

> class MergeSort --> 14.4 ms

> class CountingSort --> 31.2 ms

> class SelectionSort --> 300.4 ms

> class BinarySort -->  5.0 ms

> class InsertionSort -->  1.6 ms

--------------------------------------------------

##Research of sorting:

Amount elements = 10000.0 ... 1000000.0 items

Result of research

>class MergeSort

>Amount:   10^4 |   10^5 |   10^6 |

>Time(ms):   20.0 |   51.6 |  548.0 |


Result of research

>class CountingSort

>Amount:   10^4 |   10^5 |   10^6 |

>Time(ms):    6.0 |   75.6 | 1237.6 |

--------------------------------------------------


class SelectionSort is very slow, don`t use this class

class BinarySort is very slow, don`t use this class

class InsertionSort is very slow, don`t use this class