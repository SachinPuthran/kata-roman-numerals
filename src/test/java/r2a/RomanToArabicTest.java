package r2a;

import static org.junit.Assert.assertEquals;
import static r2a.RomanToArabic.romanToArabic;

import org.junit.Test;

public class RomanToArabicTest {

    @Test
    public void romanToArabicForIReturns1() {
        assertEquals(1, romanToArabic("I"));
    }

    @Test
    public void romanToArabicForIIReturns2() {
        assertEquals(2, romanToArabic("II"));
    }

    @Test
    public void romanToArabicForIIIReturns3() {
        assertEquals(3, romanToArabic("III"));
    }

    @Test
    public void romanToArabicForVReturns5() {
        assertEquals(5, romanToArabic("V"));
    }

    @Test
    public void romanToArabicForXReturns10() {
        assertEquals(10, romanToArabic("X"));
    }

    @Test
    public void romanToArabicForXXReturns20() {
        assertEquals(20, romanToArabic("XX"));
    }

    @Test
    public void romanToArabicForXIIIReturns13() {
        assertEquals(13, romanToArabic("XIII"));
    }

    @Test
    public void romanToArabicForVIIReturns7() {
        assertEquals(7, romanToArabic("VII"));
    }

    @Test
    public void romanToArabicForIVReturns4() {
        assertEquals(4, romanToArabic("IV"));
    }

    @Test
    public void romanToArabicForIXReturns9() {
        assertEquals(9, romanToArabic("IX"));
    }

    @Test
    public void romanToArabicForMLXVIReturns1066() {
        assertEquals(1066, romanToArabic("MLXVI"));
    }

    @Test
    public void romanToArabicForMCMLXXXIXReturns1989() {
        assertEquals(1989, romanToArabic("MCMLXXXIX"));
    }

    @Test
    public void romanToArabicForCDXLIXReturns449() {
        assertEquals(449, romanToArabic("CDXLIX"));
    }
}
