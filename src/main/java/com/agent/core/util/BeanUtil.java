package com.agent.core.util;

import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

/**
 * Created by lby on 2018/11/23.
 */
public class BeanUtil {
    public static void copyBeanProperty(Map<String, ?> fromMap, Object targetBean) {
            Assert.notNull(fromMap, "fromMap must not be null");
            Assert.notNull(targetBean, "targetBean must not be null");
        try{
            BeanInfo bi = Introspector.getBeanInfo(targetBean.getClass());
            PropertyDescriptor[] pds = bi.getPropertyDescriptors();
            for (PropertyDescriptor pd : pds) {
                Method writeMethod = pd.getWriteMethod();
                String propertyName = pd.getName();
                Object fromValue = fromMap.get(propertyName);
                if (fromMap.containsKey(propertyName) && writeMethod != null && ClassUtils.isAssignable(pd.getWriteMethod().getParameterTypes()[0],fromValue.getClass()))
                {
                    if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
                        writeMethod.setAccessible(true);
                    }
                    writeMethod.invoke(targetBean, new Object[]{fromValue});
                }
            }
        }catch (Exception e){
            throw new RuntimeException("copy property error");
        }

    }
}
