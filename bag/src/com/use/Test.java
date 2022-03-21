package com.use;
//package的作用是声明当前类所在的包，需要放在类的最上面
//一个类中最多只有一句package
import com.xiaoming.dog;

import java.util.Arrays;
//import指令位置放在package的下面，在类定义前面，可以有多句且顺序没有要求
public class Test {
    public static void main(String[] args) {
        com.xiaoming.dog d=new dog();
        //包命名
        //命名规范
        //一般是小写字母+小圆点
        //com.公司名。项目名。业务名
        System.out.println(Math.abs(-1));
        //lang包默认导入，不需要可用导入
        int[] arr={1,20,2,13,3};
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
