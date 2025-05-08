package objExample;

public class HashCodeDemo {
	
	int x = 20;
	int y = 30;
	
	@Override
	public int hashCode() {
		return x+y;
	}
	
	public static void main(String[] args) {
		
		HashCodeDemo hs1 = new HashCodeDemo();
		
		HashCodeDemo hs2 = new HashCodeDemo();
		
		System.out.println(hs1.hashCode());
		System.out.println(hs2.hashCode());
		
		System.out.println(System.identityHashCode(hs1));
	}
	
	
	
}
