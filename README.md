1. maven scope标签属性:
provided:程序在编译，测试，运行时使用该jar包
compile:程序行为相同, 在打war包时也会将该jar包
打🥇进去。
test: 该jar包只能在测试的时候用到

2.门面模式, 对一套功能提供一个接口类
例:slf4j