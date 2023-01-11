package CIMSThrusdayLab;

public class StudentDetailsAnudip {

	private int id;
	private String course;
	private String name;
	private String email;
	private long phone;
	
	public StudentDetailsAnudip(int id,String course,String name,String email,long phone)
	{
		this.id=id;
		this.course=course;
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getPhone() {
		return phone;
	}



	public void setPhone(long phone) {
		this.phone = phone;
	}



	public StudentDetailsAnudip() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "StudentDetailsAnudip [id=" + id + ", course=" + course + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + "]";
	}





	
	
	
}
