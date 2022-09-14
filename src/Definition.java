import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


public class Definition {
    private final HashMap<String, Integer> romeIntMap = new HashMap<>();
    private final int[] intDigit = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final String[] romeDigit = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

     public Definition() {
        romeIntMap.put("I", 1);
        romeIntMap.put("II", 2);
        romeIntMap.put("III", 3);
        romeIntMap.put("IV", 4);
        romeIntMap.put("V", 5);
        romeIntMap.put("VI", 6);
        romeIntMap.put("VII", 7);
        romeIntMap.put("VIII", 8);
        romeIntMap.put("IX", 9);
        romeIntMap.put("X", 10);
     }

    public boolean isOperator(String s) {
        return s.matches("[+-/*]");
    }

    public boolean isRoman(String s) {
        if(s.matches("[CLXVI]+"))
            return romeIntMap.containsKey(s);
        else
            return false;
    }

    public boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public Integer romeToIntConvert(String s){
        return romeIntMap.getOrDefault(s, null);
     }

     public String intToRomeConvert(int num){
         StringBuilder sb = new StringBuilder();
         for (int j = 0; j<intDigit.length; j++) {
             while (num - intDigit[j] >= 0) {
                 num -= intDigit[j];
                 sb.append(romeDigit[j]);
             }
         }
         return sb.toString();
     }
}
