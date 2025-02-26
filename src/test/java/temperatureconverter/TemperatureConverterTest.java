package temperatureconverter;

import org.example.TemperatureConverter;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        assertEquals(0, new TemperatureConverter().fahrenheitToCelsius(32), 0.01);
    }

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        assertEquals(32, new TemperatureConverter().celsiusToFahrenheit(0), 0.01);
    }

    @org.junit.jupiter.api.Test
    void isExtremeTemperature() {
        assertTrue(new TemperatureConverter().isExtremeTemperature(50));
        assertFalse(new TemperatureConverter().isExtremeTemperature(-39));
    }

    @org.junit.jupiter.api.Test
    void isExtremeNegativeTemperature() {
        assertTrue(new TemperatureConverter().isExtremeTemperature(-40));
        assertFalse(new TemperatureConverter().isExtremeTemperature(-39));
    }
}