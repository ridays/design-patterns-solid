package solid.live.srp;

public class SolidEmployee {
	private int empId;
	private double monthlySalary;
	private String name;
	private Address address;
	private LeaveInfo leaveInfo;
	private String manager;
	private int yearsInOrg;

	public SolidEmployee(int empId,
						 double monthlySalary,
						 String manager,
						 String name,
						 Address address,
						 LeaveInfo leaveInfo) {
		this.empId = empId;
		this.monthlySalary = monthlySalary;
		this.name = name;
		this.address = address;
		this.manager = manager;
		this.leaveInfo = leaveInfo;
		this.yearsInOrg = leaveInfo.getLeavesLeftPreviously().length;
	}

	public int getEmpId() {
		return empId;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public int getYearsInOrg() {
		return yearsInOrg;
	}

	public LeaveInfo getLeaveInfo() {
		return leaveInfo;
	}

	public String getManager() {
		return manager;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// Logically
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setLeaveInfo(LeaveInfo leaveInfo) {
		this.leaveInfo = leaveInfo;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYearsInOrg(int yearsInOrg) {
		this.yearsInOrg = yearsInOrg;
	}

	public String getHTML() {
		return HTMLGenerator.toHtml(this);
	}
}
