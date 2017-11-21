package bytecode;

class Reverse {
	public static void main(String[] args) {
        String input = "I saw Tom";
        
        String temp = "";
        for (int i=input.length()-1;i>=0;i--) {
        	temp = temp + input.charAt(i);
        }
        System.out.println(temp);
		/*
        StringBuffer result = new StringBuffer();
        for(int i=input.length()-1; i>=0;i--){
        	result.append(input.charAt(i));
        }      
        System.out.println(result);
		*/
    }
}