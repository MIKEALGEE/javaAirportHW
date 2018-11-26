import org.junit.Before;
import org.junit.Test;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747,AirLine.RyanAir);
    }

}
