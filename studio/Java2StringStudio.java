package studio;

import java.util.HashMap;
import java.util.Map;

public class Java2StringStudio {
    public static void main(String args[]) {
      String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there";
        //char[] charactersInString = text.toCharArray();
         //  String str = "RAjitha";
            characterCount(str);
    }
    static void characterCount(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {

                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
       for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}