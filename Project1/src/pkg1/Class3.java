package pkg1;
public class Class3 {
	public int sum(int value1,int value2){
		int value3= value1+value2;
		System.out.println(value3);
		return value3;
	}
	public int sub(int value4,int value5){
		int value6= value4-value5;
		System.out.println(value6);
		return value6;
	}
	public int multi(int value7,int value8) {
		int value9 = value7*value8;
		System.out.println(value9);
		return value9;
	}
	public void div(int value10,int value11) {
		int value12=value10/value11;
		System.out.println(value12);
	}
	public static void main(String[] args) {
		System.out.println("------------Assignment Two------------");
		Class3 obj=new Class3();
		System.out.print("10-2 = ");
		int subresult=obj.sub(10, 2);//10-2=8
		System.out.print("8+2 = ");
		int sumresult=obj.sum(subresult, 2);//8+2=10
		System.out.print("10-2 = ");
		subresult=obj.sub(sumresult, 2);//10-2=8
		System.out.print("8*2 = ");
		int multiresult=obj.multi(subresult, 2);//8*2=16
		System.out.print("16/2 = ");
		obj.div(multiresult, 2);//16/2=8
	}
}
