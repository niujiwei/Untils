package com.niujiwei.group.utils.common;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 *
 * @author niujiwei
 * @version 1.0
 * @date 2018/01/30
 */
public class StringUtilTools {
    /**
     * 空白字符串 {@code ""}
     */
    public static final String EMPTY = StringUtils.EMPTY;

    /**
     * 空格字符串
     */
    public static final String SPACE = StringUtils.SPACE;

    /**
     * 判断字符串是否为"" 或者null
     *
     * @param charSequence 字符串对象
     * @return 如果为null 和"" 返回true
     * @see StringUtils
     */
    public static boolean isEmpty(CharSequence charSequence) {
        return StringUtils.isEmpty(charSequence);
    }

    /**
     * 判断字符串是不是不为"" 或者null
     *
     * @param charSequence 字符串对象
     * @return 如果不为null 和"" 返回true
     * @see StringUtils
     * @since 1.0
     */
    public static boolean isNotEmpty(CharSequence charSequence) {
        return StringUtils.isNotEmpty(charSequence);
    }

    /**
     * 任意一个参数为空的话，返回true，
     * 如果这些参数都不为空的话返回false。
     *
     * @param charSequences 字符串对象
     * @return true/false
     */
    public static boolean isAnyEmpty(CharSequence... charSequences) {
        return StringUtils.isAnyEmpty(charSequences);
    }

    /**
     * 任意一个参数是空，返回false
     * 所有参数都不为空，返回true
     * 注意这些方法的用法
     *
     * @param charSequences 字符串对象
     * @return boolean
     */
    public static boolean isNoneEmpty(CharSequence... charSequences) {
        return StringUtils.isNoneEmpty(charSequences);
    }

    /**
     * 判断字符对象是不是空字符串;
     * 注意与isEmpty的区别 " " 为true
     *
     * @param charSequence 字符串对象
     * @return boolean
     */
    public static boolean isBlank(CharSequence charSequence) {
        return StringUtils.isBlank(charSequence);
    }

    /**
     * 判断字符对象是不是不为空字符串;
     * 注意与isEmpty的区别 " " 为false
     *
     * @param charSequence 字符串对象
     * @return boolean
     */
    public static boolean isNotBlank(CharSequence charSequence) {
        return StringUtils.isNotBlank(charSequence);
    }

    /**
     * 是否有一个为空
     *
     * @param charSequences 字符串对象
     * @return 有一个为空或者null 返回true
     */
    public static boolean isAnyBlank(CharSequence... charSequences) {
        return StringUtils.isAnyBlank(charSequences);
    }

    /**
     * 判断是不是没有一个空
     *
     * @param charSequences 字符串对象
     * @return 如果都不为空则返回true
     */
    public static boolean isNoneBlank(CharSequence... charSequences) {
        return StringUtils.isNoneBlank(charSequences);
    }

    /**
     * 去除字符串前后端空格
     *
     * @param str 字符串对象
     * @return {@code str}
     */
    public static String trim(String str) {
        return StringUtils.trim(str);
    }

    /**
     * 去除空格 如果为空则返回null
     *
     * @param str 字符串对象
     * @return 如果为空则返回null
     */
    public static String trimToNull(String str) {
        return StringUtils.trimToNull(str);
    }

    /**
     * 去除空格
     *
     * @param str 字符串对象
     * @return str
     */
    public static String trimToEmpty(String str) {
        return StringUtils.trimToEmpty(str);
    }

    /**
     * 俩个值比较是否相等
     *
     * @param charSequence1 参数1
     * @param charSequence2 参数2
     * @return boolean
     */
    public static boolean equals(CharSequence charSequence1, CharSequence charSequence2) {
        return StringUtils.equals(charSequence1, charSequence2);
    }

    /**
     * 忽略大小写的判断是否相等
     *
     * @param charSequence1 参数1
     * @param charSequence2 参数2
     * @return boolean
     */
    public static boolean equalsIgnoreCase(CharSequence charSequence1, CharSequence charSequence2) {
        return StringUtils.equalsIgnoreCase(charSequence1, charSequence2);
    }
}
