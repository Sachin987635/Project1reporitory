package pkg1;//Assignment Number One

public class Arithmetic 
{
	public int sum(int value1,int value2) {
		int sumtotal = value1+value2;
		System.out.println(" 10 + 2 : " + sumtotal);
		return sumtotal;
	}
	public int sub(int value3,int value4) {
		int subtotal = value3-value4;
		System.out.println(" 12 - 2 : " + subtotal);
		return subtotal;
	}
	public int multi(int value5,int value6) {
		int multitotal = value5*value6;
		System.out.println(" 12 * 2 : " + multitotal);
		return multitotal;
	}
	public void div(int value7,int value8) {
		int divtotal=value7/value8;
		System.out.println(" Final Answer 24 / 2 : " + divtotal);
	}
	public static void main(String[] args) {
		Arithmetic Totalsum=new Arithmetic();
		Arithmetic Totalsub=new Arithmetic();
		Arithmetic Totalmulti=new Arithmetic();
		Arithmetic Totaldiv=new Arithmetic();
		/*
		int Tempvalue = Totalsum.sum(10, 2);//10 + 2 = 12
		Tempvalue = Totalsub.sub(Tempvalue, 2);//12 - 2 = 10
		Tempvalue = Totalsub.sum(Tempvalue, 2);//10 + 2 = 12
		Tempvalue = Totalmulti.multi(Tempvalue, 2);//12 * 2 = 
		Totaldiv.div(Tempvalue, 2);*/
		int Tempvalue = Totalmulti.multi(10, 2);
		Tempvalue = Totalsum.sum(Tempvalue, 2);
		Tempvalue = Totalsub.sub(Tempvalue, 2);
		Tempvalue = Totalsub.sub(Tempvalue, 2);
		Tempvalue = Totalsum.sum(Tempvalue, 2);
		Totaldiv.div(Tempvalue, 2);
	}
	/*
	public int sum(int tmpvalue1,int tmpvalue2) {
		int tmpval = tmpvalue1+tmpvalue2;
		System.out.println(tmpval);
		return tmpval;
	}
	public int sub(int tmpvalue3,int tmpvalue4) {
		int tmpval2= tmpvalue3-tmpvalue3;
		System.out.println(tmpval2);
		return tmpval2;
	}
	public int multi(int tmpvalue5,int tmpvalue6) {
		int tmpval3= tmpvalue5*tmpvalue6;
		System.out.println(tmpval3);
		return tmpval3;
	}
	public void div(int tmpvalue7,int tmpvalue8) {
		int tmpval4= tmpvalue7 / tmpvalue8;
		System.out.println(tmpval4);
	}
	public static void main(String[] args) {
		Arithmetic Totalsum=new Arithmetic();
		Arithmetic Totalsub=new Arithmetic();
		Arithmetic Totalmulti=new Arithmetic();
		Arithmetic Totaldiv=new Arithmetic();
		int Tempvalue = Totalmulti.multi(10, 2);//20
		Tempvalue = Totalsum.sum(Tempvalue, 2);//22
		Tempvalue = Totalsum.sub(Tempvalue, 2);//20
		Tempvalue = Totalsub.sub(Tempvalue, 2);//18
		Tempvalue = Totalsum.sum(Tempvalue, 2);//20
		Totaldiv.div(Tempvalue, 2);//10
	}*/
}
