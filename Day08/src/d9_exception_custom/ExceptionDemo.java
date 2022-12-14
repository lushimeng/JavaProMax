/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d9_exception_custom;
/**
 * 1、自定义编译时异常
 *  定义一个异常类继承Exception.
 *  重写构造器。
 *  在出现异常的地方用throw new 自定义对象抛出，
 * 作用：编译时异常是编译阶段就报错，提醒更加强烈，一定需要处理！！
 *
 * 2、自定义运行时异常
 * 定义一个异常类继承RuntimeException.
 * 重写构造器。
 * 在出现异常的地方用throw new 自定义对象抛出!
 * 作用：提醒不强烈，编译阶段不报错！！运行时才可能出现！！
 */
public class ExceptionDemo {
    public static void main(String[] args) {

    }
}
