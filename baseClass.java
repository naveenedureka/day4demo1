class baseClass {
	int x=220;
	public void display()
	{
		System.out.println("Value of x :"+x);
	}
}

class DerivedClass extends baseClass
{
	public static void main(String[] args) {
		DerivedClass d1=new DerivedClass();
		d1.display();//UpCasting 
	}
}