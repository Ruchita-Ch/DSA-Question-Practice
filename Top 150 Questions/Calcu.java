

public interface Calcu {
void add (int a , int b);
void sub (int a , int b);
void mul (int a , int b);
void div (int a , int b);
}

class Calci_imple implements Calcu {
	
	
	@Override
	public void add (int a , int b) {
		System.out.println(a+b);
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a-b);
		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println(a*b);
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println(a/b);
		
	}
}

class Driver {
	public static void main(String[] args) {
		Calcu c = new Calci_imple();
		
		c.add(23, 32);
		c.sub(23, 32);
		c.mul(23, 32);
		c.div(23, 32);
		
	
	}
}