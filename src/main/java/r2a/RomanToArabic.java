package r2a;

import java.util.*;

public class RomanToArabic {

    static Map<String, Integer> romanToArabicMap = new LinkedHashMap<String, Integer>() {{
        put("M", 1000);
        put("CM", 900);
        put("D", 500);
        put("CD", 400);
        put("C", 100);
        put("XC", 90);
        put("L", 50);
        put("XL", 40);
        put("X", 10);
        put("IX", 9);
        put("V", 5);
        put("IV", 4);
        put("I", 1);
    }};

    public static int romanToArabic(String originalRomanNumeral) {
        String romanNumeral = originalRomanNumeral;
        int arabic = 0;
        while (!romanNumeral.equals("")) {
            String romanKey = getRomanKey(romanNumeral);
            Integer arabicNumber = getArabicNumberForRoman(romanKey);
            if (arabicNumber == null) {
                romanKey = String.valueOf(romanKey.charAt(0));
                arabicNumber = getArabicNumberForRoman(romanKey);
            }
            arabic += arabicNumber;
            romanNumeral = romanNumeral.replaceFirst(romanKey, "");
        }
        return arabic;
    }

    private static Integer getArabicNumberForRoman(String romanKey) {
        return romanToArabicMap.get(romanKey);
    }

    private static String getRomanKey(String romanNumeral) {
        String romanKey;
        if (romanNumeral.length() >= 2) {
            romanKey = romanNumeral.substring(0, 2);
        } else {
            romanKey = romanNumeral;
        }
        return romanKey;
    }
}
