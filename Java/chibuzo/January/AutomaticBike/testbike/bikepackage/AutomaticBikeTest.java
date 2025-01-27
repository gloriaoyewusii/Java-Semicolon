package bikepackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void test_thatPowerIsOff_whenITurnPowerOn_BikeCanBeTurnedOn(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOff();

        assertTrue(bike.turnOn());
    }
    @Test
    public void test_thatPowerIsOn_whenITurnPowerOff_BikeCanBeTurnedOff(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();

        assertTrue(bike.turnOff());
    }
    @Test
    public void test_thatITurnPowerOn_whenTheGearIsAtGearOne_bikeSpeedIncreasesByOne(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.accelerate());
        assertEquals(16, bike.gearOne(15));
    }
    @Test
    public void test_thatITurnPowerOn_whenTheGearIsAtGearTwo_bikeSpeedIncreasesByTwo(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.accelerate());
        assertEquals(26, bike.gearTwo(24));
    }
    @Test
    public void test_thatITurnPowerOn_whenTheGearIsAtGearThree_bikeSpeedIncreasesByThree(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.accelerate());
        assertEquals(38, bike.gearThree(35));
    }
    @Test
    public void test_thatITurnPowerOn_whenTheGearIsAtGearFour_bikeSpeedIncreasesByFour(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.accelerate());
        assertEquals(48, bike.gearFour(44));
    }
    @Test
    public void test_thatITurnPowerOn_whenTheGearIsAtGearOne_bikeSpeedDecrementsInOnes(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.decelerate());
        assertEquals(14, bike.gearOne(15));
    }
    @Test
    public void test_thatITurnPowerOn_whenTheGearIsAtGearTwo_bikeSpeedDecrementsInTwos(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.decelerate());
        assertEquals(22, bike.gearTwo(24));
    }
    @Test
    public void test_thatITurnPowerOn_whenTheGearIsAtGearThree_bikeSpeedDecrementsInThrees(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.decelerate());
        assertEquals(32, bike.gearThree(35));
    }
    @Test
    public void test_thatITurnPowerOn_whenTheGearIsAtGearFour_bikeSpeedDecrementsInFours(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.decelerate());
        assertEquals(40, bike.gearFour(44));
    }

}
