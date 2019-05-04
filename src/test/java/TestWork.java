import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestWork {
    public static void main(String[] args) {
            String english = "my name is xiao meng";
            reversal(english);
            String bb =  reversal2(english);
            System.out.println(bb);
        int[] arr1 = {5,2,4,1,3};
        int[] arr2 = {8,5,2,6,7,4};
        int[] arr3 = {4,6,18,37,2,26,5,9};
        sort(arr3);
        System.out.println("");
        String[][] str ={//y x
                 {"手机号密码均为空","",""},
                 {"手机号为空","","123456"},
                {"密码为空","13517315120",""},
                {"错误的信息账号","13517315121","1234567"},
                {"正确的账号信息","13517315120","123456"}
    } ;
        login(str);

    }


    /**
     * 方法一
     * @param input
     */
    public static void reversal(String input){
        String rev = "";
        for (int i = input.length()-1; i >= 0; i--){
            rev += String.valueOf(input.charAt(i));

        }
        System.out.println(rev);
    }
    /**
     * 方法二
     */
    public static String reversal2(String input){
        List<Character> list = new ArrayList<>();
        char[] arr = input.toCharArray();
        for (char ca: arr) {
            list.add(ca);
        }
        Collections.reverse(list);
        StringBuilder builder = new StringBuilder();
        for (Character c:list) {
            builder.append(c);

        }
        return builder.toString();
    }

    /**
     * 第三题手机账号密码
     */

    public static void login(String[][] str){
        for (int i = 0; i < str.length; i++){
            for(int j = 1; j < str[i].length-1;j++){
                if(str[i][j].isEmpty()&&str[i][j+1].isEmpty()){
                    System.out.println(str[i][j-1]+" 【 】 【 】");
                }else if (str[i][j].isEmpty()&&str[i][j+1].equals("123456")){
                    System.out.println(str[i][j-1]+" 【 】 "+str[i][j+1]);
                }else if(str[i][j].equals("13517315120")&&str[i][j+1].isEmpty()){
                    System.out.println(str[i][j-1]+" "+str[i][j]+"【 】");
                }else if(str[i][j].equals("13517315121")&&str[i][j+1].equals("1234567")){
                    System.out.println(str[i][j-1]+" "+str[i][j]+" "+str[i][j+1]);
                }else if (str[i][j].equals("13517315120")&&str[i][j+1].equals("123456")){
                    System.out.println(str[i][j-1]+" "+str[i][j]+" "+str[i][j+1]);
                }


            }
        }

    }



    /**
     * 第四题，冒泡排序，从小到大
     */
    public static void sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int emp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = emp;
                }
            }
        }
        for (int number:arr) {
            System.out.print(number+" ");
        }
    }
}
