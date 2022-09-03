package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규표현식예제 {

    public static void main(String[] args) {
        String s="...!@BaT#*..y.ab c231fgHIjklm86가나다";

        s = s.replaceAll("[.]{2}", "안녕");
        s = s.replaceAll("(a)", "!");
        s = s.replaceAll("()*", " ");
        s = s.replaceAll("\\s", "-");
        s = s.replaceAll("[^-가-힣]","");
        s= s.replaceAll("^-|-$","다");
        s=  s.replaceAll("[다]{1,}","ss123");
        s = s.replaceAll("\\W","");
        Pattern compile = Pattern.compile("[0-9]");
        Matcher matcher = compile.matcher(s);
        System.out.println("matcher = " + matcher);
        boolean b = matcher.find();
        System.out.println("b = " + b);
        System.out.println("s = " + s);
    }
}
