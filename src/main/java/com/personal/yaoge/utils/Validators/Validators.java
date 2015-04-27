package com.personal.yaoge.utils.Validators;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

/**
 * 类Validators.java的实现描述：校验输入字符
 * 
 * @author yaoge 2015年4月26日 下午2:27:32
 */
public class Validators {

    public static boolean isBlankString(String string) {
        return StringUtils.isBlank(string);
    }

    public static  boolean isBlankList(List list) {
        return list.isEmpty();
    }
}
