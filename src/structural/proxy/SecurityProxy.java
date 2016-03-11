package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {

    // should be able to use generics instead likely
    private Object obj;

    private SecurityProxy(Object obj) {
	this.obj = obj;
    }

    public static Object newInstance(Object obj) {
	return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
				      obj.getClass().getInterfaces(), new SecurityProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	Object result;
	try {
	    // security could be replaced by some proper security library/oauth etc
	    if (method.getName().contains("post")) {
 		throw new IllegalAccessException("Posts are currently not allowed.");
	    } else {
		result = method.invoke(obj, args);
	    }
	} catch (InvocationTargetException e) {
	    throw e.getTargetException();
	} catch (Exception e) {
	    throw new RuntimeException("Unexpected invocation exception" + e.getMessage());
	}

	return result;
    }
}
