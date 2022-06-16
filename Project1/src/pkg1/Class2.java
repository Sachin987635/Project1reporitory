package pkg1;

public class Class2 {
	public int sum(int value1, int value2) {
		int value3 = value1+value2;
		System.out.println("Sum Of 10+2 & 12+2 Is: " + value3);
		return value3;
	}
	public int sub(int value4, int value5) {
		int value6 = value4-value5;
		System.out.println("Sub Of 14-2 Is : " + value6);
		return value6;
	}
	public int multi(int value7, int value8) {
		int value9 = value7*value8;
		System.out.println("Multi Of 12*2 Is " + value9);
		return value9;
	}
	public void div(int value10, int value11) {
		int value12 = value10/value11;
		System.out.println("Division Of 24/2 Is : " + value12);
	}
	public static void main(String[] args) {
		System.out.println("------------Assignment One------------");
		Class2 obj=new Class2();
		int sumresult=obj.sum(10, 2);//10+2;
		sumresult=obj.sum(sumresult, 2);//((10+2)+2);
		int subresult=obj.sub(sumresult, 2);//(((10+2)+2)-2);
		int multiresult=obj.multi(subresult, 2);//((((10+2)+2)-2)*2);
		obj.div(multiresult,2);//((((10+2)+2)-2)*2)/2);	
	}
}
