package zdp.algorithm.basic.sort;

/**
 * 选择排序
 * 选择排序是一个基本排序算法，效率不高，随着排序数量的增多，而复杂度增大
 * 算法主要采用选择最小，或最大的值依次与其他值进行比较，一般选择索引为0
 * 位置的数为最大，或最小值，然后从前往后依次比较，直到比较完后选择出真正的
 * 最大值和最小值
 * @author zhengdongpeng
 *
 */
public class 选择排序 {

	public static void main(String[] args) {
		int [] num = {2,1,4,5,0,7,6,7,8};
		
		SelectedSort(num);
		
	}
	/**
	 * 选择排序算法，先选择第一个值为基本值，然后依次比较
	 * @param num
	 */
	private static void SelectedSort(int[] num) {
		
	}

}
