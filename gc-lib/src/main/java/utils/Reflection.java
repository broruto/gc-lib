package utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

	public static void testReflection() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Object obj = new Object();
		Method[] m = obj.getClass().getDeclaredMethods();
		for ( Method method : m) {
			System.out.println(method.getName());
			Object o = method.invoke(obj);
			System.out.println(o);
		}
	}
}
