//Printing fibonacci series.
class lab_task_9{
	public static void main(String[] args){
		int t1=0,t2=1,t3;
		//Printing the first 2 terms.
		System.out.print(t1+" "+t2);
		//Starting loop from 2 because 2 terms already printed.
		for(int i = 2; i<20;++i)
		{
			t3 = t1 + t2;
			System.out.print(" "+t3);
			t1=t2;
			t2=t3;
		}
	}
}