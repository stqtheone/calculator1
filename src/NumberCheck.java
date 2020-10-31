import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NumberCheck {
    StringToNumber str = new StringToNumber();
     public static HashMap<String, Integer> Dictionary(){ //Создание словаря для хранения значений Римских цифр
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);
        return map;
    }

     public static Boolean numberCheckArab(String num1, String num2){ // Проверяем арабские или нет
        Boolean status = false;
        Boolean rim1 = checkKeyMap(num1);
        Boolean rim2 = checkKeyMap(num2);
        if(rim1 == true && rim2 == true){
            status = true;
        }
        return status;
    }

     public static Boolean checkKeyMap(String str){ //Поиск по словарю значений
        for (String string: Dictionary().keySet()){
            if(string.contains(str)){
                return true;
            }
        }
        return false;
    }

    public static boolean numberCheckInt(String num1, String num2){ //проверяем является ли числом
        try {
            Integer.parseInt(num1);
            Integer.parseInt(num2);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
