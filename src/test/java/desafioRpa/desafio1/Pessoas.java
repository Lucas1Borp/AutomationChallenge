package desafioRpa.desafio1;

public class Pessoas {
	public String firstName;
	public String lastName;
	public String companyName;
	public String roleInCompany;
	public String address;
	public String email;
	public String phoneNumber;
	
	
	public Pessoas pessoa(Pessoas pessoas) {
		return pessoas;
	}
	

	public Pessoas(String firstName, String lastName, String companyName, String roleInCompany, String address,
			String email, String phoneNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.roleInCompany = roleInCompany;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Pessoas [firstName=" + firstName + ", lastName=" + lastName + ", companyName=" + companyName
				+ ", roleInCompany=" + roleInCompany + ", address=" + address + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}

}
