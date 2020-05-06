package demo.reflect;

public class ReflectTarget {

    //默认的带参数的构造函数
    ReflectTarget(String str) {
        System.out.println("(默认)的构造函数" + str);
    }

    //无参构造函数
    public ReflectTarget() {
        System.out.println("调用了公有的无参构造方法");
    }

    public ReflectTarget(char name) {
        System.out.println("调用了带有一个参数的构造方法,参数值为 " + name);
    }

    //有多个参数的构造函数
    public ReflectTarget(String name, int index) {
        System.out.println("调用了带有多个参数的构造方法, 参数值为【目标名】" + name
                + "【序号】" + index);
    }

    //受保护的构造函数
    protected ReflectTarget(boolean n) {
        System.out.println("受保护的构造方法n:" + n);
    }

    //私有的构造函数
    private ReflectTarget(int index) {
        System.out.println("私有的构造方法 序号: " + index);
    }

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
