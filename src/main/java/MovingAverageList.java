
/*

Interface to calculate moving average.

@param <N> extends number.

 */
public interface MovingAverageList<N extends Number> {


    /*
    * Adds element of Type N to the list
    *
    * @param <N> extends number
    * @return void
     */
    public void addElement(N element);

    /*
    * Gets an element of Type <N> at index.
    *
    * @param int index
    * @return <N> element
    *
     */
    public N getElement(int index);

    /*
    *
    * Returns the number of elements present in the list
    *
    * @return int the number of elements
     */
    public int getSize();

    /*
    *
    * Returns the moving average.
    *
    * @return Double moving average.
     */
    public Double getMovingAverage();
}

