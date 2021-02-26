class Demo{

	private int roll;
	private String name;
	private double salary;

	public void setRoll(int x)
	{
		roll=x;
	}
	public void setName(String s)
	{
		name=s;
	}
	public void setSalary(double d)
	{
		salary=d;
	}
	public int getRoll()
	{
		return roll;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
        return salary;
	}
}
class Test{

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.setRoll(100);
		d.setName("subhabrata");
		d.setSalary(9.8);
		System.out.println("roll="+d.getRoll());
		System.out.println("name="+d.getName());
		System.out.println("salary="+d.getSalary()+" lakh's");
     }
}