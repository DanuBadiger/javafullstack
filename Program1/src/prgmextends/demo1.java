package prgmextends;


class Myclass extends Thread
{
	public void run()
	{
		System.out.println("thread is Running");
	}


	public static void main(String[] args) {
		Myclass myclass=new Myclass();

		myclass.start();
	
		// TODO Auto-generated method stub

	}

}