package CIMSThrusdayLab;

import java.time.LocalDate;
import java.util.Set;

public class Batch {
	private String batchId;
	//OneToMany relationship-one batch can have many students
	private Set<StudentDetailsAnudip> students; 
	private String duration;
	private LocalDate startDate;
	private LocalDate endDate;
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public Set<StudentDetailsAnudip> getStudents() {
		return students;
	}
	public void setStudents(Set<StudentDetailsAnudip> students) {
		this.students = students;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Batch(String batchId, String duration, LocalDate startDate,
			LocalDate endDate) {
		super();
		this.batchId = batchId;
		this.duration = duration;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Batch [batchId=").append(batchId).append(", duration=").append(duration).append(", startDate=")
				.append(startDate).append(", endDate=").append(endDate).append("]");
		return builder.toString();
	}
}
