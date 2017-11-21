package bytecode;

class Compare {
	public static void main(String[] args) {
        String s1 = "king";
        String s2 = "king";
        String s3 = new String("king");
        String s4 = " king ";
        String s5 = "KiNg";
        
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s4.trim()));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}