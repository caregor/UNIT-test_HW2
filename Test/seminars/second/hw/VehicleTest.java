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
        assertEquals(4,car.getNumWheels(), "A car has some different number of wheels than 4");
    }
    @Test
    public void testMotorcycleHasTwoWheels(){
        Motorcycle bike = new Motorcycle("Honda", "CBR1000RR-R", 2022);
        assertEquals(2, bike.getNumWheels(), "A motocycle has some different number of wheels than 2");
    }
    // проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void testCarSpeedInTestDrive(){
        Car car = new Car("Fiat", "500", 2022);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }
}