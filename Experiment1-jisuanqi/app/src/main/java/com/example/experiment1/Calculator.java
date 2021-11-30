package com.example.experiment1;

import java.util.ArrayList;

public class Calculator {
    ArrayList<String[]> cal;
    int index;

    public Calculator () {
        String[] str = new String[5];//str[0]存放类型，str[1]~str[4]存放数和符号
        //str[0] == 0 : 数组中未存放数和符号
        //str[0] == 1 : 数组中存放了一个数字和一个+或-
        //str[0] == 2 : 数组中存放了一个数字和一个*或/
        //str[0] == 3 : 数组中[1][2]存放了一个数字和一个+或- [3][4]存放了一个数字和一个*或/
        str[0] = "0";
        cal = new ArrayList<String[]>();
        cal.add(str);
        index = 0;
    }

    public String calculate(String num, String symbol) {
        String[] str = cal.get(index);
        String result;
        switch(str[0]) {
            case "0":
                if(symbol.equals("+")||symbol.equals("-")) {
                    str[1] = num;
                    str[2] = symbol;
                    str[0] = "1";
                }
                if(symbol.equals("*")||symbol.equals("/")) {
                    str[1] = num;
                    str[2] = symbol;
                    str[0] = "2";
                }
                if(symbol.equals("=")) {
                    return "0";
                }
                break;
            case "1":
                if(symbol.equals("+")||symbol.equals("-")) {
                    str[1] = operation(str[1],str[2],num);
                    str[2] = symbol;
                    str[0] = "1";
                }
                if(symbol.equals("*")||symbol.equals("/")) {
                    str[3] = num;
                    str[4] = symbol;
                    str[0] = "3";
                }
                if(symbol.equals("=")) {
                    result = operation(str[1],str[2],num);
                    str[0] = "0";
                    str[1] = "";
                    str[2] = "";
                    return result;
                }
                break;
            case "2":
                if(symbol.equals("+")||symbol.equals("-")) {
                    str[1] = operation(str[1],str[2],num);
                    str[2] = symbol;
                    str[0] = "1";
                }
                if(symbol.equals("*")||symbol.equals("/")) {
                    str[3] = operation(str[1],str[2],num);
                    str[4] = symbol;
                    str[0] = "2";
                }
                if(symbol.equals("=")) {
                    result = operation(str[1],str[2],num);
                    str[0] = "0";
                    str[1] = "";
                    str[2] = "";
                    return result;
                }
                break;
            case "3":
                if(symbol.equals("+")||symbol.equals("-")) {
                    str[3] = operation(str[3],str[4],num);
                    str[4] = "";
                    str[1] = operation(str[1],str[2],str[3]);
                    str[3] = "";
                    str[2] = symbol;
                    str[0] = "1";
                }
                if(symbol.equals("*")||symbol.equals("/")) {
                    str[3] = operation(str[3],str[4],num);
                    str[4] = symbol;
                    str[0] = "3";
                }
                if(symbol.equals("=")) {
                    str[3] = operation(str[3],str[4],num);
                    result = operation(str[1],str[2],str[3]);
                    str[0] = "0";
                    str[1] = "";
                    str[2] = "";
                    str[3] = "";
                    str[4] = "";
                    return result;
                }
                break;
        }
        return null;
    }

    public String operation(String num1, String symbol, String num2) {
        String[] str = cal.get(index);
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        double sum = 0;
        switch(symbol) {
            case "+":
                sum = n1 + n2;
                return sum+"";
            case "-":
                sum = n1 - n2;
                return sum+"";
            case "*":
                sum = n1 * n2;
                return sum+"";
            case "/":
                sum = n1 / n2;
                return sum+"";
            default:
                return sum+"";
        }
    }

}
