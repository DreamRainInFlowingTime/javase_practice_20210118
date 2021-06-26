package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        new Son(1).show();
        Constructor<Person> declaredConstructor = Person.class.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);

        //declaredConstructor.newInstance("4560");
        Constructor<Person> declaredConstructor1 = Person.class.getDeclaredConstructor(int.class);
        declaredConstructor1.setAccessible(true);
        declaredConstructor1.newInstance(1);
        Arrays.asList(Son.class.getDeclaredMethods()).forEach(System.out::println);
        new Person(1);
    }
}
