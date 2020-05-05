package demo.reflect;

public class ReflectTarget {

    public static void main(String[] args) throws ClassNotFoundException {
        ReflectTarget reflectTarget = new ReflectTarget();
        Class c1 = reflectTarget.getClass();
        System.out.println(c1.getName());
        Class c2 = ReflectTarget.class;
        System.out.println(c2.getName());
        Class c3 = Class.forName("demo.reflect.ReflectTarget");
        System.out.println(c3.getName());
        System.out.println(c1 == c2 && c2 == c3);
    }

}
