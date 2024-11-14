package tech_test.webzen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFilter {
    public static void main(String[] args) {
        String email = "abcd1217@naver.com";
        String filteredEmail = filterEmail(email);
        System.out.println(filteredEmail);
    }

    public static String filterEmail(String email) {
        String regex = "^(.)[^@]*(\\d)(@.+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.find()) {
            String firstChar = matcher.group(1); // 앞자리
            String lastDigit = matcher.group(2); // 숫자
            String domain = matcher.group(3); // '@' 포함한 도메인 부분


            int totalLength = matcher.group(0).length();
            int firstCharLength = firstChar.length();
            int lastDigitLength = lastDigit.length();
            int domainLength = domain.length();

            int starsCount = totalLength - (firstCharLength + lastDigitLength + domainLength);

            String maskedMiddle = "*".repeat(starsCount);

            return firstChar + maskedMiddle + lastDigit + domain;
        }

        return email;
    }
}
