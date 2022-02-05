public class Cast1 {

	public static void main(String[] args) {
		
		String s="500";
		//int i = s; //Error
		int i = Integer.parseInt(s);
		int num = Integer.valueOf(s);
		System.out.println(i);
		System.out.println(num);
		//implicit 
		int a2=16;
		double d=a2;
		System.out.println(d);
		//explicit
		int a1=65;
		char c1=(char)a1;
		System.out.println(c1);
		char a='s';
		int i2=(int) a;
		System.out.println(i2);
	}

}
