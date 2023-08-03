package solid.live.srp;

public class LeaveInfo {
	public static int TOTAL_LEAVES_ALLOWED = 30;
	private final int leavesTaken;
	private int[] leavesLeftPreviously;

	public LeaveInfo(int leavesTaken, int[] leavesLeftPreviously) {
		this.leavesTaken = leavesTaken;
		this.leavesLeftPreviously = leavesLeftPreviously;
	}

	public int getLeavesTaken() {
		return leavesTaken;
	}

	public int[] getLeavesLeftPreviously() {
		return leavesLeftPreviously;
	}

	public static void setTotalLeavesAllowed(int totalLeavesAllowed) {
		TOTAL_LEAVES_ALLOWED = totalLeavesAllowed;
	}

	public void setLeavesLeftPreviously(int[] leavesLeftPreviously) {
		this.leavesLeftPreviously = leavesLeftPreviously;
	}
}
