package com.mall.houlide.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author 张代浩
 */
public class ApplicationContextUtil implements ApplicationContextAware {

    private static ApplicationContext context;

    public static ApplicationContext getContext() {
        return context;
    }

    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        this.context = context;
    }
}
