package com.algorithms.algorithms;

import com.algorithms.algorithms.basic.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class StringsTests {

    @Test
    void stringsAreAnagram() {
        // given
        String a = "banana";
        String b = "aaannb";

        // when
        boolean result = Strings.isAnagram(a, b);

        // then
        assertThat(result).isTrue();
    }

    @Test
    void stringsAreNotAnagram() {
        // given
        String a = "jandaba";
        String b = "jalalal";

        // when
        boolean result = Strings.isAnagram(a, b);

        // then
        assertThat(result).isFalse();
    }

    @Test
    void stringIsPalindrome() {
        // given
        String a = "madam";

        // when
        boolean result = Strings.isPalindrome(a);

        // then
        assertThat(result).isTrue();
    }

    @Test
    void stringIsPalindromeOdd() {
        // given
        String a = "elle";

        // when
        boolean result = Strings.isPalindrome(a);

        // then
        assertThat(result).isTrue();
    }

    @Test
    void stringIsNotPalindrome() {
        // given
        String a = "noway";

        // when
        boolean result = Strings.isPalindrome(a);

        // then
        assertThat(result).isFalse();
    }
}
