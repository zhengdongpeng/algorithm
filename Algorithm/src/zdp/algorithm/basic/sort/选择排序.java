package zdp.algorithm.basic.sort;

/**
 * ѡ������
 * ѡ��������һ�����������㷨��Ч�ʲ��ߣ������������������࣬�����Ӷ�����
 * �㷨��Ҫ����ѡ����С��������ֵ����������ֵ���бȽϣ�һ��ѡ������Ϊ0
 * λ�õ���Ϊ��󣬻���Сֵ��Ȼ���ǰ�������αȽϣ�ֱ���Ƚ����ѡ���������
 * ���ֵ����Сֵ
 * @author zhengdongpeng
 *
 */
public class ѡ������ {

	public static void main(String[] args) {
		int [] num = {2,1,4,5,0,7,6,7,8};
		
		SelectedSort(num);
		
		for(int i : num){
			System.out.print(i +",");
		}
		
	}
	/**
	 * ѡ�������㷨����ѡ���һ��ֵΪ����ֵ��Ȼ�����αȽ�
	 * @param num
	 */
	private static void SelectedSort(int[] num) {
		
		//��һ��ѭ����������ѵ�����ֵ
		for(int i = 0;i<num.length ; i++){
			//������Сֵ���Ե�һ��ѭ����ֵΪ��Сֵ
			int min = i;
			//�ڶ���ѭ�������αȽ�
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
