## Challenge solution

### Problem #1 Moving average

#### Explanation

- The [MovingAverageList interface](/src/main/java/MovingAverageList.java) uses generic which extends number. This to ensure that only numeric types can be added to the list.
- A sample implementaton of doubles type is provided in [MovingAverageListDouble class](/src/main/java/MovingAverageListDouble.java). 
- It has another variable slidingWindow which stores the window size "N". This is the count used to calculate the moving average.
- The implementation has a List with additional variable totalSum. totalSum keeps track of the sum of elements added to the list. If the number of elements are more than the windowSize then the total sum is subtracted by the first element in the window so that the totalSum reflects the sum of "N" elements at anytime.
- The method getMovingAverage() calculates the moving average using totalSum and slidingWindow.
- As we are re-calculating the sum of the N elements at the time of addition of a new element to the list. The time complexity of calculation of the average is *O(1)*
- The test cases are in the file [MovingAverageListDoubleTest](/src/test/java/MovingAverageListDoubleTest.java).

##### Issues
- The return type of getMovingAverageMethod is Double. In case of currency (BigDecimal) it can return unexpected values due to precision.
- Another way is to use generic return type in the getMovingAverageMethod. In case of Integer it will not work because average is a decimal type.


### Problem # 2 Google Analytics system design

The system design and explanation can be found in the file [GoogleAnalytics.md](GoogleAnalytics.md).

