package itog1.com;

import java.util.*;
public class Main {

  public static void main(String[] args) {
  
  System.out.println("Введите число в двоичном формате:");
  
 
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
  
        int sum = 0, a;
        char c;

        for (int i = 0; i < str.length(); i++) {
        
            c = str.charAt(str.length() - 1 - i);

            if(c == '1' || c == '0') {
                if (c == '1')
                    a = 1;
                else a = 0;
            } else {
                System.out.println("Неверный ввод!");
                break;
            }
            sum += (a * Math.pow(2, i));
        }

        System.out.println("В десятичной системе счисления " + str + " = " + sum);
    }
   
  }

