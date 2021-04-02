class Collage 
{
	public static void main(String[] args) 
	{
//================================================================		
		//instance one creating
		Student01 s1=new Student01();
		s1.collageName="SIET";
		s1.sname="Hari";
		s1.sno=502;
	    s1.fee=10000;
//==================================================================
		//instance two creating
		Student01 s2=new Student01();
		s2.collageName="SIET";
		s2.sname="Naveen";
		s2.sno=503;
		s2.fee=2000;
//====================================================================
		System.out.println("\n*******First Student Details*******");
//====================================================================
	    System.out.println("sno\t\t"+s1.sno);
	    System.out.println("sname\t\t"+s1.sname);
		System.out.println("collageName\t"+s1.collageName);
		System.out.println("fee\t\t"+s1.fee);
//=================================================================
	    System.out.println("\n*******Second Student Details*******");
//====================================================================
	    System.out.println("sno\t\t"+s2.sno);
	    System.out.println("sname\t\t"+s2.sname);
		System.out.println("collageName\t"+s2.collageName);
		System.out.println("fee\t\t"+s2.fee);
	}
}
