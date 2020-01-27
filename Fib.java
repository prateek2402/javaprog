class Fib{
	public static void main(String [] args){
		int n = Integer.parseInt(args[0]);
		int t1 = 0, t2 = 1, t3;
		System.out.println(t1 + " " + t2);
		for(int i = 2; i<=n; i++){
			t3 = t1+ t2;
			System.out.println(t3);
			t1 = t2;
			t2 = t3;
		}
	}
}