import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    Hangar hangar;
    Plane plane1;

    @Before
    public void before(){
        hangar = new Hangar();
        plane1 = new Plane(PlaneType.AIRBUSA300, AirLine.WeeDaves);
    }

    @Test
    public void checkStartsEmpty(){
        assertEquals(0,hangar.getStorageSize());
    }

    @Test
    public void addPlaneToStorage(){
        hangar.addPlane(plane1);
        assertEquals(1,hangar.getStorageSize());
    }

    @Test
    public void removePlaneStorage(){
        hangar.addPlane(plane1);
        hangar.removePlane(plane1);
        assertEquals(0,hangar.getStorageSize());
    }

}
