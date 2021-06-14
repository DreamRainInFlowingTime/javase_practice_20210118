package org.example.collection;

import org.example.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        List<Integer> list = new ArrayList();
        System.out.println(list.remove("1"));
        //list.add();
        //list.add()
        list.remove(new Integer(1));
        //System.out.println([1]);
        //二维数组直接打印、默认值问题
        //二维数组的默认值是null
        int[][] aa = new int[5][];
        aa[1] = new int[]{1,2};
        System.out.println(aa[1]);
        int[] ints = new int[5];
        System.out.println(Arrays.toString(ints));
        Integer[] integers = new Integer[]{1,2,3,4,5,6};
        System.out.println(integers);
        //md可变数组是个坑，非引用数据类型，会存数组存引用
        List intsList = Arrays.asList(ints);
        List integersList = Arrays.asList(integers);


        //
        System.out.println(collection.getClass());
        int[] a = new int[]{2324};
        //new ArrayList(new Integer[]{1,2,3});

        //new ArrayList(new int[]{1,2,3,4});
        List<String> list4 = new ArrayList<String>();
        List<?>  list3 = list4;
        //list3.add("1");
    }
}
