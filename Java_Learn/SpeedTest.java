package bytecode;

class SpeedTest {
	
	public static void main(String args[]){
		long start1 = System.currentTimeMillis();
		String r1 = "";
		for (int i = 0; i < 10000; i++) {
			 r1 = r1 + i;
		}
		long end1 = System.currentTimeMillis();
		System.out.println("1 waste "+(end1 - start1));
		
		long start2 = System.currentTimeMillis();
		StringBuffer r2 = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			r2.append(i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("2 waste "+(end2 - start2));
		
		System.out.println(r1.length());
		System.out.println(r2.length());
	}
	
}