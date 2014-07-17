package structural.composite;

/*
 * Leaf node - no children
 */
public class Developer implements Employee {

	private String name;
	private double salary;

	public Developer(String name, double salary) {
		this.setName(name);
		this.setSalary(salary);
	}

	@Override
	public void add(Employee employee) {
		// not supported
	}

	@Override
	public void remove(Employee employee) {
		// not supported
	}

	@Override
	public Employee getChild(int i) {
		// not supported
		return null;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void print() {
		System.out.println("Name: " + getName() + ", " + "Salary: "
				+ getSalary());
		System.out.println("***********");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
