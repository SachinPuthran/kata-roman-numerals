package a2r;

import static a2r.ArabicToRoman.arabicToRoman;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArabicToRomanTest {

    @Test
    public void arabicToRomanFor1ReturnsI() {
        assertEquals("I", arabicToRoman(1));
    }

    @Test
    public void arabicToRomanFor2ReturnsII() {
        assertEquals("II", arabicToRoman(2));
    }

    @Test
    public void arabicToRomanFor3ReturnsIII() {
        assertEquals("III", arabicToRoman(3));
    }

    @Test
    public void arabicToRomanFor5ReturnsV() {
        assertEquals("V", arabicToRoman(5));
    }

    @Test
    public void arabicToRomanFor10ReturnsX() {
        assertEquals("X", arabicToRoman(10));
    }

    @Test
    public void arabicToRomanFor20ReturnsXX() {
        assertEquals("XX", arabicToRoman(20));
    }

    @Test
    public void arabicToRomanFor13ReturnsXIII() {
        assertEquals("XIII", arabicToRoman(13));
    }

    @Test
    public void arabicToRomanFor7ReturnsVII() {
        assertEquals("VII", arabicToRoman(7));
    }

    @Test
    public void arabicToRomanFor4ReturnsIV() {
        assertEquals("IV", arabicToRoman(4));
    }

    @Test
    public void arabicToRomanFor9ReturnsIX() {
        assertEquals("IX", arabicToRoman(9));
    }

    @Test
    public void arabicToRomanFor1066ReturnsMLXVI() {
        assertEquals("MLXVI", arabicToRoman(1066));
    }

    @Test
    public void arabicToRomanFor1989ReturnsMCMLXXXIX() {
        assertEquals("MCMLXXXIX", arabicToRoman(1989));
    }

    @Test
    public void arabicToRomanFor449ReturnsCDXLIX() {
        assertEquals("CDXLIX", arabicToRoman(449));
    }
}
