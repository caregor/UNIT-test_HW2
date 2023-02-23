package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }
    @Test
    public void  testCarHasFourWheels(){
        Car car = new Car("Ford","Mustang", 2018);
        assertEquals(4,car.getNumWheels(), "has some different number of wheels than 4");
    }

}