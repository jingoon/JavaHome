package InterfaceTest;

import java.io.Serializable;

public class MemberDTO implements Serializable{ 		// 1

	
	private static final long serialVersionUID = 1L; 	// 1-1

	private String id;									// 2
	private String name;
	private int age;									
	
	public MemberDTO() {								// 3
	}													
	public MemberDTO(String id, String name, int age) {	// 4
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}													
	public String getId() {								// 5
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;						
	}
	@Override											// 6
	public String toString() {
		return "MemberDTO [id=" + id + ", name=" + name + ", age=" + age + "]";		
	}
	@Override											// 7
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override											// 7
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberDTO other = (MemberDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
