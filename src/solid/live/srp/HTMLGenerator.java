package solid.live.srp;

public class HTMLGenerator {
	public static String toHtml(SolidEmployee employee) {
		String str = "<div>" +
				"<h1>Employee Info</h1>" +
				"<div id='emp" + employee.getEmpId() + "'>" +
				"<span>" + employee.getName() + "</span>" +
				"<div class='left'>" +
				"<span>Leave Left :</span>" +
				"<span>Annual Salary:</span>" +
				"<span>Manager:</span>" +
				"<span>Reimbursable Leave:</span>" +
				"</div>";
		str += "<div class='right'><span>" + (LeaveInfo.TOTAL_LEAVES_ALLOWED - employee.getLeaveInfo().getLeavesTaken()) + "</span>";
		str += "<span>" + Math.round(employee.getMonthlySalary() * 12) + "</span>";
		if (employee.getManager() != null) str += "<span>" + employee.getManager() + "</span>";
		else str += "<span>None</span>";
		int years = 3;
		if (employee.getYearsInOrg() < 3) {
			years = employee.getYearsInOrg();
		}
		int totalLeaveLeftPreviously = 0;
		for (int i = 0; i < years; i++) {
			totalLeaveLeftPreviously += employee.getLeaveInfo().getLeavesLeftPreviously()[years - i - 1];
		}
		str += "<span>" + totalLeaveLeftPreviously + "</span>";
		return str + "</div> </div>";
	}
}
