package com.use;
//package��������������ǰ�����ڵİ�����Ҫ�������������
//һ���������ֻ��һ��package
import com.xiaoming.dog;

import java.util.Arrays;
//importָ��λ�÷���package�����棬���ඨ��ǰ�棬�����ж����˳��û��Ҫ��
public class Test {
    public static void main(String[] args) {
        com.xiaoming.dog d=new dog();
        //������
        //�����淶
        //һ����Сд��ĸ+СԲ��
        //com.��˾������Ŀ����ҵ����
        System.out.println(Math.abs(-1));
        //lang��Ĭ�ϵ��룬����Ҫ���õ���
        int[] arr={1,20,2,13,3};
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
