import java.util.ArrayList;
import java.util.Arrays;

public class StringToNumber {
    public static ArrayList<String> StringToNumber(String str) { //Преобразовываем строку в массив элементов
        ArrayList<String> result = new ArrayList<String>(Arrays.asList(str.split(" ")));
        for (int i = 0; i < result.size(); i++) {
        }
        return result;
    }

    public static String IntToRim(int input) { // из обычных в римские
        String s = "";
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }

    public static int RimToInt(String s) { // из римских в обычные
        int num = 0;
        if (NumberCheck.checkKeyMap(s)) {
            num = NumberCheck.Dictionary().get(s);
        } else {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                int number = strToNum(ch);
                if (i + 1 < s.length()) {
                    int nextNumber = strToNum(s.charAt(i + 1));
                    if (nextNumber > number) {
                        num += (nextNumber - number);
                        i++;
                    } else {
                        num += number;
                    }
                }
            }
        }
        return num;
    }

    private static int strToNum(char ch) { //свич для перевода чисел
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default: return -1;
        }
    }
}
