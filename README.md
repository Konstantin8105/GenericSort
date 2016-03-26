# GenericSort

Sorting by java generic \<T extends Comparable\<T\>\>

Result of research test:

--------------------------------------------------
#Test. Checking of correct result:
Amount elements = 10000 items

     class MergeSort .... OK
     
  class CountingSort .... OK
  
 class SelectionSort .... OK
 
--------------------------------------------------
#Test with many same items:
Amount elements = 10000 items
     class MergeSort ....  2.4 ms
  class CountingSort ....  0.4 ms
 class SelectionSort .... 106.8 ms
--------------------------------------------------
#Test with many unique items:
Amount elements = 10000 items
     class MergeSort .... 30.0 ms
  class CountingSort .... 22.6 ms
 class SelectionSort .... 188.4 ms
--------------------------------------------------
#Research of sorting:
Amount elements = 10000.0 ... 1000000.0 items
Result of research
     class MergeSort
   Amount:   10^4 |   10^5 |   10^6 |
 Time(ms):   14.4 |   50.8 |  542.6 |

  class CountingSort
   Amount:   10^4 |   10^5 |   10^6 |
 Time(ms):    6.0 |   78.0 | 1336.8 |
--------------------------------------------------


class SelectionSort is very slow, don`t use this class
