
 abstract class abstract1 {
	 static  final int a=10;
	//Welcome


	void show()
	 {
		 
	 }
abstract  void test();
	
}

 class abstract_demo extends abstract1
 {
	 void test()
	 {
		System.out.println("In the Test...."); 
	 }
	 public static void main(String[] args) {
		// abstract1 d=new abstract1();
		abstract_demo d1=new abstract_demo();
		d1.test();
	}
 }
