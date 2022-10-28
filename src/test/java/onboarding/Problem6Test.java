package onboarding;

import org.junit.jupiter.api.Test;
import utils.Problem6Util;

import static org.assertj.core.api.Assertions.assertThat;

class Problem6Test {

    @Test
    void nameMatchingTest() {
        String str1 = "제이엠";
        String str2 = "이엠제";
        String str3 = "제엠이";
        String str4 = "크롱";
        String str5 = "크크크크크크크크크크크롱";
        assertThat(Problem6Util.isDuplicated(str1, str2)).isTrue();
        assertThat(Problem6Util.isDuplicated(str2, str3)).isFalse();
        assertThat(Problem6Util.isDuplicated(str2, str4)).isFalse();
        assertThat(Problem6Util.isDuplicated(str4, str5)).isTrue();
    }
}