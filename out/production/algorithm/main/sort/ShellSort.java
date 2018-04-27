
package main.sort;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort extends BaseSort{

	public void sort(int[] a) {
		// i表示希尔排序中的第n/2+1个元素（或者n/4+1）
		// j表示希尔排序中从0到n/2的元素（n/4）
		// r表示希尔排序中n/2+1或者n/4+1的值
		int i, j, r, tmp;
		// 划组排序
		for(r = a.length / 2; r >= 1; r = r / 2) {
			for(i = r; i < a.length; i++) {
				tmp = a[i];
				j = i - r;
				// 一轮排序
				while(j >= 0 && tmp < a[j]) {
					a[j+r] = a[j];
					j -= r;
				}
				a[j+r] = tmp;
			}
		}
	}
  
  public static void main(String[] args) {
        sort(data);
        sort(data2);
        print();
    }

}
