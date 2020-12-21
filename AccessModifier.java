class AccessModifier{
	
	private static String str = "test";
	
	
	public static void main(String[] args){
		System.out.println(AccessModifier.str);
		System.out.println("String length : " + AccessModifier.strLength(AccessModifier.str));
	}
	
	public static int strLength(String s){
		return s.length();
		
	}


}