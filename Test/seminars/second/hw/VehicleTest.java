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
    @Test
    public void testCarSpeedInTestDrive(){
        Car car = new Car("Fiat", "500", 2022);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }
    @Test
    public void testMotorcycleSpeedInTestDrive(){
        Motorcycle bike = new Motorcycle("BMW", "R 18", 2023);
        bike.testDrive();
        assertEquals(75, bike.getSpeed());
    }
    //проверить, что в режиме парковки
    // (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    public void testCarParking(){
        Car car = new Car("Citroen", "C4", 2014);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(), "Speed not 0!");
    }
    @Test
    public void testMotorcycleParking(){
        Motorcycle bike = new Motorcycle("Suzuki", "V-Strom 650", 2022);
        bike.testDrive();
        bike.park();
        assertEquals(0,bike.getSpeed(), "Speed not 0");
    }
}