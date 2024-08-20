class code{
	public static int fact_recursive(int n){
		if(n == 0) return 0;
		if(n == 1) return 1;
		return n * fact_recursive(n - 1);
	}
	public static void main(String[] args){
		System.out.println(fact_recursive(5));
	}
}
