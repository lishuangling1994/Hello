package DiGuiLianXi;

import java.util.ArrayList;


//ɱ����Ϸ��������վ��һ��Ȧ����3�ı�����ɱ����
public class LuckNum {

	public static void main(String[] args) {
		System.out.println(getlucknum(8));
	}
	public static int getlucknum(int num){
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i = 1; i <=num; i++) {
			list.add(i);
		}
		int count=1;
		for (int i = 0; list.size()!=1; i++) {
			if (i==list.size()) {
				i=0;
			}
			if (count%3==0) {
				list.remove(i--);
			}
			count++;
		}
		return list.get(0);
		
	}
}
