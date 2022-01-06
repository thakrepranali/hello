package secondaryrefe;

public class Test {
	public static void main(String[] args) {
		Address adr=new Address();
		adr.setAreaname("Karvenagar");
		adr.setCityarea("pune");
		
		Student s=new Student();
		s.setRollno(10);
		s.setName("Pranali");
		s.setAddr(adr);
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddr().getAreaname());
		System.out.println(s.getAddr().getCityarea());
		
	}

}
