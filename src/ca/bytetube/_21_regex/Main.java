package ca.bytetube._21_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        System.out.println("\\[");
          //test1();
//        String regex = "[a-zA-Z]\\w{5,17}";
//        System.out.println(validate("a2345_6"));
//        System.out.println("a2345_6".matches(regex));

        String input = "afooaaaaaafooa";
        String regex1 = ".*foo";
        String regex2 = ".*?foo";
        String regex3 = ".*+foo";
        //System.out.println(input.matches(regex));
        findAll(regex1,input);//"afooaaaaaafoo",[0,13)
        findAll(regex2,input);//"afoo",[0,4)   "aaaaaafoo",[4,13)
        findAll(regex3,input);//no match!

    }

    public static void findAll(String regex, String input){
        if (regex == null || input == null) return;
        findAll(regex,input,0);

    }

    private static void findAll(String regex, String input,int flags){

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean found = false;

        while (matcher.find()){
            found = true;
            System.out.format("\"%s\",[%d,%d)%n",matcher.group(),matcher.start(),matcher.end());

        }
        if (!found) {
            System.out.println("no match!");
        }
    }




    public static void test1(){
        String regex = "\\[123\\]";
        System.out.println("1".matches(regex));
        System.out.println("2".matches(regex));
        System.out.println("3".matches(regex));
        System.out.println("123".matches(regex));
        System.out.println("[123]".matches(regex));
    }

    //6~18个长度，可以使用字母，数字，下划线，并且以字母开头
    public static boolean  validate(String email){
        if (email == null) return false;
        char[] chars = email.toCharArray();
        if (chars.length < 6 || chars.length > 18) return false;
        if (!isLetter(chars[0])) return false;
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (isLetter(c) || isDigit(c)|| c == '_') continue;
            return false;
        }

        return true;
    }

    private static boolean isLetter(char c){

        return (c >= 'a' && c <='z')|| (c >= 'A' && c <='Z') ;

    }

    private static boolean isDigit(char c){
        return (c >= '0' && c <='9') ;
    }
}
