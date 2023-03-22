package customer;

import java.time.LocalDate;
import java.util.UUID;

public class CustomerEntity {
	
	private UUID customerId;
	private String name;
	private String gender;
	private String address;
	private String phoneNumber;
	private boolean marketing;
	private boolean indiInformation;
	private LocalDate createDate;
	
	public CustomerEntity() {}
	
	public CustomerEntity(UUID customerId, String name, String gender, String address, String phoneNumber,
			boolean marketing, boolean indiInformation, LocalDate createDate) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.marketing = marketing;
		this.indiInformation = indiInformation;
		this.createDate = createDate;
	}

	public UUID getCustomerId() {
		return customerId;
	}

	public void setCustomerId(UUID customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isMarketing() {
		return marketing;
	}

	public void setMarketing(boolean marketing) {
		this.marketing = marketing;
	}

	public boolean isIndiInformation() {
		return indiInformation;
	}

	public void setIndiInformation(boolean indiInformation) {
		this.indiInformation = indiInformation;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", name=" + name + ", gender=" + gender + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", marketing=" + marketing + ", indiInformation="
				+ indiInformation + ", createDate=" + createDate + "]";
	}
	
	
	
	
	
}
