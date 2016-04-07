package src;

import java.util.ArrayList;
import java.util.List;

/**
 * ***********************************************************
 *
 * @类名 : reese_algorithm {XXX.java}
 * @DESCRIPTION : ===========XXXX==================
 * @AUTHOR :  meila-x->reese
 * @DATE : 2016/4/7
 * ***********************************************************
 */
public class DirectInsert {

    public void doAlgorithm(int[] list){
        System.out.println("开始进行直接插入排序...");
        for(int i=1;i<list.length;i++){//从第1个开始，默认list为一个只有1个元素的列表
            int j = 0 ;
            int temp = list[i];
            // 因为前i-1个数都是从小到大的有序序列，所以只要当前比较的数(list[j])比temp大，就把这个数后移一位
            for (j = i - 1; j >= 0 ; j--) {
                if(temp < list[j]){
                    list[j + 1] = list[j];
                }
            }
            list[j + 1] = temp;
        }

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

    }
}
