package DiGuiLianXi;
//�������ã�һ��С���������º�����һ��С���ӣ����ĸ��¼�����Сһ�ԣ�
//������£����������������µ�С����Ҳ���������O���Ӳ���12���º�һ���ж��ٶ����ӡ�
public class TuZi {

	public static void main(String[] args) {
		//�������鷽��
		/*int[] c=new int[8];
		c[0]=1;
		c[1]=1;
		for (int i = 2; i < c.length; i++) {
			c[i]=c[i-2]+c[i-1];
			System.out.println(c[i]);
		}*/
		System.out.println(fun(8));
		
	}
	//�õݹ���
	public static int fun(int i){
		if (i==1||i==2) {
			return 1;
		}else {
			return fun(i-2)+fun(i-1);
		}
		
		
	}

}
