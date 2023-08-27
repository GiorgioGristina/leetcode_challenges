import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;


class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> romanToNum = new HashMap<>();
        romanToNum.put("I", 1);
        romanToNum.put("V", 5);
        romanToNum.put("X", 10);
        romanToNum.put("L", 50);
        romanToNum.put("C", 100);
        romanToNum.put("D", 500);
        romanToNum.put("M", 1000);
        int counter = 0;
        char[] stringArr = s.toCharArray();
        // for(String el : stringArr){
        // System.out.println("letter    ..    " + el);
        // System.out.println("is equal " + el == );
        // }
        for(int i = 0; i < stringArr.length; i++){
            // add the number to count positive if not followed by one of the charachter that decreese
            // System.out.println("is equal to the lettr C " + stringArr[i] == "C");
            
                if (i == stringArr.length - 1){
              
                counter += romanToNum.get(String.valueOf(stringArr[i]));
               
                } else if (stringArr[i] == 'C' && ((stringArr[i + 1] == 'D') || (stringArr[i + 1] == 'M'))){
                // (stringArr[i] == 'I' && ((stringArr[i + 1] == 'X') || (stringArr[i + 1] == 'V'))){
                    
                    counter -= romanToNum.get(String.valueOf(stringArr[i]));

                } else if (stringArr[i] == 'X' && ((stringArr[i + 1] == 'L') || (stringArr[i + 1] == 'C'))){
                    
                    counter -= romanToNum.get(String.valueOf(stringArr[i]));

                } else if (stringArr[i] == 'I' && ((stringArr[i + 1] == 'X') || (stringArr[i + 1] == 'V'))){
                    
                    counter -= romanToNum.get(String.valueOf(stringArr[i]));

                } else {
                    counter += romanToNum.get(String.valueOf(stringArr[i]));
                }
               

            
            // System.out.println("num from hash " + romanToNum.get(stringArr[i]));

            // if(s[i] != )
        }

        System.out.println("numero " + counter);
        
        return counter;

    }


    public static void main(String[] args) {
        Solution x = new Solution();
        // x.romanToInt("III");
        // x.romanToInt("LVIII");
        x.romanToInt("MCMXCIV");

    }
}