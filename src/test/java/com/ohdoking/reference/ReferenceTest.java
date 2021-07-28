package com.ohdoking.reference;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@DisplayName("UT. IdsTxProcessorTest.")
@ExtendWith(MockitoExtension.class)
class ReferenceTest {

    @Test
    void filled_0_in_empty() {
        int num = 44;
        System.out.println(String.format("%04d", num));
    }

    @Test
    void get_value_between_special_char() {
        String name = "IDS Bourg en Bresse / Montagnat (FR0102)";
        Pattern MY_PATTERN = Pattern.compile("(.*?)(\\(.*?\\))");
        Matcher m = MY_PATTERN.matcher(name);
        String s = "";
        String originalId = "";
        while (m.find()) {
            s = m.group(1);
            originalId = m.group(2).subSequence(1, m.group(2).length() - 1).toString();

        }
        System.out.println(s);
        System.out.println(originalId);
    }


}
