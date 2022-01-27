package com.baeldung;

import com.baeldung.coverage.Generated;

public class Palindrome {

    int num;

    public boolean isPalindrome(String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String mid = inputString.substring(1, inputString.length() - 1);
            return (firstChar == lastChar) && isPalindrome(mid);
        }
    }

    @Generated
    public int getNum() {
        return num;
    }
}
