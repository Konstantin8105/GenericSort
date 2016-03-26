# GenericSort

Sorting by java generic \<T extends Comparable\<T\>\>

Result of research test:

--------------------------------------------------
#Test. Checking of correct result:

Amount elements = 10000 items

>class MergeSort --> OK

>class CountingSort --> OK

>class SelectionSort --> OK
 
--------------------------------------------------
#Test with many same items:

Amount elements = 10000 items

>      class MergeSort -->  2.2 ms

>   class CountingSort -->  0.4 ms

>  class SelectionSort --> 105.6 ms

--------------------------------------------------
#Test with many unique items:

Amount elements = 10000 items

>class MergeSort --> 29.8 ms

>class CountingSort --> 16.2 ms

>class SelectionSort --> 197.8 ms

--------------------------------------------------
#Research of sorting:

Amount elements = 10000.0 ... 1000000.0 items

Result of research

>class MergeSort

>Amount:   10^4 |   10^5 |   10^6 |

>Time(ms):   20.0 |   51.6 |  548.0 |



>class CountingSort

>Amount:   10^4 |   10^5 |   10^6 |

>Time(ms):    6.0 |   75.6 | 1237.6 |
--------------------------------------------------


class SelectionSort is very slow, don`t use this class
