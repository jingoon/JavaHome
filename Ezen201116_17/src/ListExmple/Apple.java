package ListExmple;

import java.io.Serializable;

public class Apple implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String address;
	private String name;
	private int price;
	
	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public Apple(String id, String address, String name, int price) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "[" + id + "," + address + "," + name + "," + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
