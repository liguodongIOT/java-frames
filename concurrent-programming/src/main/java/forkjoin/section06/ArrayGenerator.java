package forkjoin.section06;

import java.util.Random;

/**
 * Created by liguodong on 2016/11/22.
 */

//.创建ArrayGenerator类。这个类将产生一组随机的、指定大小的整数数字。
// 实现generateArray()方法。它将产生一组数字，它接收数组大小作为参数。
public class ArrayGenerator {
    public int[] generateArray(int size) {

        int array[]=new int[size];

        Random random=new Random();

        for (int i=0; i<size; i++){
            array[i]=random.nextInt(10);
        }
        return array;
    }
}