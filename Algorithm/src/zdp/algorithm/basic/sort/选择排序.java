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
		
		for(int i : num){
			System.out.print(i +",");
		}
		
	}
	/**
	 * 选择排序算法，先选择第一个值为基本值，然后依次比较
	 * @param num
	 */
	private static void SelectedSort(int[] num) {
		
		//第一层循环，依次轮训数组的值
		for(int i = 0;i<num.length ; i++){
			//设置最小值，以第一层循环的值为最小值
			int min = i;
			//第二层循环，依次比较
			for(int j=i+1;j<num.length;j++){
				if(num[j]<num[i]) min=j;
			}
			
			if(min != i){
				int type = num[i];
				num[i]=num[min];
				num[min]=type;
			}
		}
	}

}
