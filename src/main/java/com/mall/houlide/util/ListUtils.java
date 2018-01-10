package com.mall.houlide.util;

import org.apache.commons.beanutils.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    /**
     * 按新的Class对象复制
     *
     * @param source list, example: list
     * @param
     */
    public static <E> List<E> copyTo(List<?> source, Class<E> destinationClass)
            throws Exception {
        if (source.size() == 0)
            return new ArrayList();
        List<E> res = new ArrayList<E>(source.size());
        for (Object o : source) {
            E e = destinationClass.newInstance();
            BeanUtils.copyProperties(e, o);
            res.add(e);
        }
        return res;
    }

    public static boolean isNullOrEmpty(List list) {
        return list == null || list.isEmpty();
    }
}
