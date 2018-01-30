package com.niujiwei.group.utils.common;

import org.junit.Test;

/**
 * @author niujiwei
 * @date 2018/01/30
 */
/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class StringUtilToolsTest {
    @Test
    public void isEmpty() {
        System.out.println(StringUtilTools.isEmpty(""));
        System.out.println(StringUtilTools.isEmpty(null));
        System.out.println(StringUtilTools.isEmpty(" 张三 "));
    }

    @Test
    public void isNotEmpty() {
        System.out.println(StringUtilTools.isNotEmpty(""));
        System.out.println(StringUtilTools.isNotEmpty(null));
        System.out.println(StringUtilTools.isNotEmpty(" 张三 "));
    }

    @Test
    public void isAnyEmpty() {
        System.out.println(StringUtilTools.isAnyEmpty(" "));

        System.out.println(StringUtilTools.isAnyEmpty("", null, new StringBuffer()));
        System.out.println(StringUtilTools.isAnyEmpty("134", new StringBuffer().append("11")));
    }

    @Test
    public void isNoneEmpty() {
        System.out.println(StringUtilTools.isNoneEmpty("", null, new StringBuffer()));
        System.out.println(StringUtilTools.isNoneEmpty("134", new StringBuffer().append("11")));
    }

    @Test
    public void isBlank() {
        System.out.println(StringUtilTools.isBlank(""));
        System.out.println(StringUtilTools.isBlank(" "));
        System.out.println(StringUtilTools.isBlank("               "));
        System.out.println(StringUtilTools.isBlank("    "));
        System.out.println(StringUtilTools.isBlank("       1        "));
        System.out.println(StringUtilTools.isBlank(null));
        System.out.println(StringUtilTools.isBlank("张三"));
    }

    @Test
    public void isNotBlank() {
        System.out.println(StringUtilTools.isNotBlank(""));
        System.out.println(StringUtilTools.isNotBlank(" "));
        System.out.println(StringUtilTools.isNotBlank("               "));
        System.out.println(StringUtilTools.isNotBlank("    "));
        System.out.println(StringUtilTools.isNotBlank("       1        "));
        System.out.println(StringUtilTools.isNotBlank(null));
        System.out.println(StringUtilTools.isNotBlank("张三"));
    }

    @Test
    public void isAnyBlank() {
        System.out.println(StringUtilTools.isAnyBlank(" "));
        System.out.println(StringUtilTools.isAnyBlank("", null, new StringBuffer()));
        System.out.println(StringUtilTools.isAnyBlank("134", new StringBuffer().append("11")));
    }

    @Test
    public void isNoneBlank() {
        System.out.println(StringUtilTools.isNoneBlank(" "));
        System.out.println(StringUtilTools.isNoneBlank("", null, new StringBuffer()));
        System.out.println(StringUtilTools.isNoneBlank("134", new StringBuffer().append("11")));
    }

    @Test
    public void trim() {
        System.out.println(StringUtilTools.trim(null));
        System.out.println(StringUtilTools.trim(""));
        System.out.println(StringUtilTools.trim("  "));
        System.out.println(StringUtilTools.trim(" zhang snan  "));
    }

    @Test
    public void trimToNull() {
        System.out.println(StringUtilTools.trimToNull(null));
        System.out.println(StringUtilTools.trimToNull(""));
        System.out.println(StringUtilTools.trimToNull("  "));
        System.out.println(StringUtilTools.trimToNull(" zhang snan  "));
    }

    @Test
    public void trimToEmpty() {
        System.out.println(StringUtilTools.trimToEmpty(null));
        System.out.println(StringUtilTools.trimToEmpty(""));
        System.out.println(StringUtilTools.trimToEmpty("  "));
        System.out.println(StringUtilTools.trimToEmpty(" zhang snan  "));
    }

    @Test
    public void equals() {
        System.out.println(StringUtilTools.equals(null, null));
        System.out.println(StringUtilTools.equals(null, "abc"));
        System.out.println(StringUtilTools.equals("abc", null));
        System.out.println(StringUtilTools.equals("abc", "abc"));
        System.out.println(StringUtilTools.equals("abc", "ABC"));
    }
    @Test
    public void equalsIgnoreCase(){
        System.out.println(StringUtilTools.equalsIgnoreCase(null, null));
        System.out.println(StringUtilTools.equalsIgnoreCase(null, "abc"));
        System.out.println(StringUtilTools.equalsIgnoreCase("abc", null));
        System.out.println(StringUtilTools.equalsIgnoreCase("abc", "abc"));
        System.out.println(StringUtilTools.equalsIgnoreCase("abc", "ABC"));
    }

}
