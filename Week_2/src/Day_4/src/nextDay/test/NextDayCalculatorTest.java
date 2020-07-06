import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void isnamNhuan0() {
        int day = 2;
        int month = 2;
        int year = 2000;
        boolean expected = true;
        boolean result = new NextDayCalculator(day,month,year).isnamNhuan();
        assertEquals(expected, result);
    }

    @Test
    void isnamNhuan1() {
        int day = 2;
        int month = 2;
        int year = 2001;
        boolean expected = false;
        boolean result = new NextDayCalculator(day,month,year).isnamNhuan();
        assertEquals(expected, result);
    }

    @Test
    void nextDayCalculator0() {
        int day = 28;
        int month = 2;
        int year = 2000;
        NextDayCalculator result = new NextDayCalculator(day, month, year);
        result.nextDayCalculator();
        String expected = "The next Day \n"
                + "Day " + 29
                + " Month " + 2
                + " Year " + 2000;

        assertEquals(expected, result.toString());
    }

    @Test
    void nextDayCalculator1() {
        int day = 28;
        int month = 2;
        int year = 2001;
        NextDayCalculator result = new NextDayCalculator(day, month, year);
        result.nextDayCalculator();
        String expected = "The next Day \n"
                + "Day " + 1
                + " Month " + 3
                + " Year " + 2001;

        assertEquals(expected, result.toString());
    }

    @Test
    void nextDayCalculator2() {
        int day = 31;
        int month = 12;
        int year = 2001;
        NextDayCalculator result = new NextDayCalculator(day, month, year);
        result.nextDayCalculator();
        String expected = "The next Day \n"
                + "Day " + 1
                + " Month " + 1
                + " Year " + 2002;

        assertEquals(expected, result.toString());
    }

    @Test
    void nextDayCalculator3() {
        int day = 10;
        int month = 12;
        int year = -2001;
        NextDayCalculator result = new NextDayCalculator(day, month, year);
        result.nextDayCalculator();
        String expected = "Date Not Found";

        assertEquals(expected, result.toString());
    }

}