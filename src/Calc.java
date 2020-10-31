import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Calc {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oper, num1,num2;
        int result;
        int flag = 0;
        int num_1 = 0, num_2 = 0;
        while (true){
            String operation = reader.readLine();
            num1 = StringToNumber.StringToNumber(operation).get(0);
            num2 = StringToNumber.StringToNumber(operation).get(2);
            oper = StringToNumber.StringToNumber(operation).get(1);
            if (NumberCheck.numberCheckArab(num1,num2)){
                num_1 = StringToNumber.RimToInt(num1);
                num_2 = StringToNumber.RimToInt(num2);
                flag = 1;
            }else if(NumberCheck.numberCheckInt(num1,num2)){
                num_1 = Integer.parseInt(num1);
                num_2 = Integer.parseInt(num2);
            }else{
                throw new Exception("incorrect number");
            }
            if(num_1 > 10 || num_2 > 10){
                throw new Exception("Number > 10");
            }
            if(oper.equals("+")){
                result = num_1+num_2;
            }else if(oper.equals("-")){
                result = num_1-num_2;
            }else if(oper.equals("*")){
                result = num_1*num_2;
            }else if(oper.equals("/")){
                result = num_1/num_2;
            }else{
                throw new Exception("incorrect command");
            }
            if (flag == 1){
                System.out.println(StringToNumber.IntToRim(result));
            }else{
                System.out.println(result);
            }
        }


    }
}
