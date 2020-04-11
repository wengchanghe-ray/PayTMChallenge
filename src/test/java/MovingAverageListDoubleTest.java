import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovingAverageListDoubleTest {

    private MovingAverageList<Double> movingAverageList;

    @Before
    public void init(){
        movingAverageList = new MovingAverageListDouble(2);
    }


    @Test
    public void testAdd(){

        movingAverageList.addElement(2.0);
        movingAverageList.addElement(5.0);
        movingAverageList.addElement(3.0);
        Assert.assertEquals(3.0, movingAverageList.getElement(2), 0.1);
    }

    @Test(expected = NullPointerException.class)
    public void testNullAdd(){

        movingAverageList.addElement(null);

    }

    @Test(expected = NullPointerException.class)
    public void testNullAddInBetween(){

        movingAverageList.addElement(2.0);
        movingAverageList.addElement(5.0);
        movingAverageList.addElement(null);

    }

    @Test
    public void testMovingAverage(){

        movingAverageList.addElement(2.0);
        movingAverageList.addElement(5.0);
        movingAverageList.addElement(4.0);
        //window size =2
        Assert.assertEquals(4.5, movingAverageList.getMovingAverage(), 0.1);

        movingAverageList.addElement(4.0);
        Assert.assertEquals(4.0, movingAverageList.getMovingAverage(), 0.1);
    }

    @Test
    public void testZeroElements(){

        movingAverageList.addElement(0.0);
        movingAverageList.addElement(0.0);
        movingAverageList.addElement(0.0);
        movingAverageList.addElement(0.0);
        movingAverageList.addElement(0.0);

        Assert.assertEquals(0.0, movingAverageList.getMovingAverage(), 0.1);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWindowSizeGreaterThanListSize(){

        movingAverageList.addElement(2.0);
        //element added =1, window size = 2
        movingAverageList.getMovingAverage();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testZeroListSize(){
        movingAverageList.getMovingAverage();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeWindowSize(){

        MovingAverageList<Double> list = new MovingAverageListDouble(-3);

    }
}
