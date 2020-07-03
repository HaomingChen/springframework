1. maven scope标签属性:
provided:程序在编译，测试，运行时使用该jar包
compile:程序行为相同, 在打war包时也会将该jar包
打🥇进去。
test: 该jar包只能在测试的时候用到

2.门面模式, 对一套功能提供一个接口类
例:slf4j

3.包装类运行之前无法被发现有误, 泛型可以在编译
时被发现类型错误

4. 泛型类 -> 泛型接口 -> 泛型方法
慎用?实现泛型
？ extends E -> 给泛型引入上边界限制
？ super E -> 给泛型引入下边界限制
泛型方法与泛型类的字母无关
在泛型接口中，实现泛型接口的类可以继承
泛型也可以设定具体的类型
泛型的
E:一般在数组中使用代表Element
T:代表Type代表Class类型
K:key键
V:value代表值
N:number数值类型

5. tomcat容器配置中 /路径不会接收.jsp路径的请求
而/*会接受.jsp路径的请求， 且/*配置的优先级高于/的
优先级,所以配置了转发/\*会被转发到jsp可能造成服务器
无限循环。

6. Class类特点
Class类也是类的一种,class则是关键字
Class类只有一个私有的构造函数,只有JVM能够创建Class
类的实例 -> Class私有方法上的注释
JVM中只有唯一一个和类相对应的Class对象来描述其
类型信息

7. 设计方法: 将service分为combine service和
solo service, 能用solo service的方法解决的业务
逻辑就用solo service方法, combine service作为
solo service的组合。

8. 注解@interface是继承了Annotation类
9. 反射可以设置为Accessible为true因为Method
Field类都继承了Accessible这个类,所以都可以
将私有的Method，Field为true