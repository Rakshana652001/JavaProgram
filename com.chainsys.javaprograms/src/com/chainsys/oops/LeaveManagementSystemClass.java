package com.chainsys.oops;


public class LeaveManagementSystemClass {
	int employeeID;
	String dateOfLeave;
	int dateFrom, dateTo;
	String reasonOfLeave;
	long payOff;
	String approval, noApproval;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getDateOfLeave() {
		return dateOfLeave;
	}
	public void setDateOfLeave(String dateOfLeave) {
		this.dateOfLeave = dateOfLeave;
	}
	public int getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(int dateFrom) {
		this.dateFrom = dateFrom;
	}
	public int getDateTo() {
		return dateTo;
	}
	public void setDateTo(int dateTo) {
		this.dateTo = dateTo;
	}
	public String getReasonOfLeave() {
		return reasonOfLeave;
	}
	public void setReasonOfLeave(String reasonFOrLeave) {
		this.reasonOfLeave = reasonFOrLeave;
	}
	public long getPayOff() {
		return payOff;
	}
	public void setPayOff(long payOff) {
		this.payOff = payOff;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}
	public String getNoApproval() {
		return noApproval;
	}
	public void setNoApproval(String noApproval) {
		this.noApproval = noApproval;
	}
	@Override
	public String toString() {
		return "LeaveManagementSystemClass [employeeID=" + employeeID + ", dateOfLeave=" + dateOfLeave + ", dateFrom="
				+ dateFrom + ", dateTo=" + dateTo + ", reasonOfLeave=" + reasonOfLeave + ", payOff=" + payOff
				+ ", approval=" + approval + ", noApproval=" + noApproval + "]";
	}
	
	

}
