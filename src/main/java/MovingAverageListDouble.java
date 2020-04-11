import java.util.ArrayList;
import java.util.List;

public class MovingAverageListDouble implements MovingAverageList<Double> {

    private List<Double> list;

    private double totalSum;

    private int slidingWindowSize;

    public MovingAverageListDouble(int slidingWindowSize){

        if(slidingWindowSize<=0){
            throw new IllegalArgumentException("Window size should be greater or equal to 1");
        }

        this.list = new ArrayList<>();
        this.slidingWindowSize = slidingWindowSize;
    }

    @Override
    public void addElement(Double element) {
            list.add(element);
            totalSum += element;

            if(list.size()>slidingWindowSize){
                totalSum -= list.get(list.size()-slidingWindowSize-1);
            }
    }

    @Override
    public Double getElement(int index) {
        return list.get(index);
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Double getMovingAverage() {

        if (slidingWindowSize > 0 && (list.size() > slidingWindowSize || list.size() == slidingWindowSize)) {
            return totalSum / slidingWindowSize;
        }
        else if (list.size() < slidingWindowSize) {
           throw new IndexOutOfBoundsException("Window size N= "+slidingWindowSize +" cannot be greater than number of elements in the list (" + list.size()+")");
        }
        return null;
    }
}
