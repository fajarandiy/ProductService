package com.example.demo.util;

import java.lang.reflect.Field;

import org.apache.commons.lang3.reflect.FieldUtils;

public class BaseUtil {
	
	public static void setObjectFromObject(Object obj1, Object obj2) {
		Field [] fields = obj2.getClass().getDeclaredFields();
		System.out.println("obj2 length : "+fields.length);
		for (int i=1; i<fields.length; i++) {
			Field field = fields[i];
			try {
				Object fieldValue = FieldUtils.readField(field, obj2, true);
				if(fieldValue!=null) {
					System.out.println("fieldValue : "+fieldValue);
					FieldUtils.writeField(obj1, field.getName(), fieldValue, true);
				}
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				System.out.println("ex : "+e.getMessage());
			}
		}
		System.out.println("result object : "+obj1);
	}

}
