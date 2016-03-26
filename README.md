# GenericSort

Sorting by java generic \<T extends Comparable\<T\>\>

Result of research test:

--------------------------------------------------
 Test with many same items:
 CollectionsSort sort --> 16 ms

                                              class MergeSort --> 38 ms
                                           class CountingSort --> 9 ms
                                          class SelectionSort --> 284 ms
--------------------------------------------------
 Test with many unique items:
 CollectionsSort sort --> 8 ms

                                              class MergeSort --> 4 ms
                                           class CountingSort --> 19 ms
                                          class SelectionSort --> 242 ms
--------------------------------------------------

class SelectionSort is very slow, don`t use this class