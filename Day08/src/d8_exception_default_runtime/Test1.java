/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d8_exception_default_runtime;
/**
    目标：运行时异常的处理机制。

    可以不处理，编译阶段又不报错。
    按照理论规则：建议还是处理，只需要在最外层捕获处理即可
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("程序开始。。。");
        try {
            chu(10, 0);  // 编译不报错，运行出错
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束。。。");
    }
    public static void chu(int a, int b){
        System.out.println(a);
        System.out.println(b);
        int c = a / b;
        System.out.println("方法结束。。。");
    }
}
