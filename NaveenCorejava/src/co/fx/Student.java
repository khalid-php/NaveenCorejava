package co.fx;
/** Model class of the student*/ 
public class Student {
	private Integer sid;
	private String sname;
	private Double sfee;
	private String subject;	
	
	public Integer getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public Double getSfee() {
		return sfee;
	}

	public String getSubject() {
		return subject;
	}

	public Student(Integer sid, String sname, Double sfee, String subject) {
	this.sid = sid;
	this.sname = sname;
	this.sfee = sfee;
	this.subject = subject;
}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", subject=" + subject + "]";
	}
	

}
