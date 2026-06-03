import java.lang.reflect.Method;

class Student {
    public void display() {
        System.out.println("Student Method");
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {

        Class<?> c = Class.forName("Student");

        Object obj = c.getDeclaredConstructor().newInstance();

        Method[] methods = c.getDeclaredMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
        }

        Method method = c.getMethod("display");
        method.invoke(obj);
    }
}