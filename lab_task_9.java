class lab_task_9{
	public static void main(String[] args){
		int t1=0,t2=1,t3;
		System.out.print(t1+" "+t2);
		for(int i = 2; i<10;++i)
		{
			t3 = t1 + t2;
			System.out.print(" "+t3);
			t1=t2;
			t2=t3;
		}
	}
}