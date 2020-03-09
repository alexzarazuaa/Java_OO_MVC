package Modules.Login.Classes;

import Classes.dates;

public  class User {
	
	private String NickName; // CLAU PRIMARIA
	private String password;
    private String type;	 ///  TIPO DE USUARIO
	private String mail;
	private dates contractDate;
	private String type_fee;
	

	public User(String nickName, String password, String type, String mail, dates contractDate, String type_fee) {
		super();
		NickName = nickName;
		this.password = password;
		this.type = type;
		this.mail = mail;
		this.contractDate = contractDate;
		this.type_fee = type_fee;
	}



	public User () {
		
	}
	public User(String nickName) { // CONSTRUCTOR DE LA CLAU PRIMARIA
		this.NickName = nickName;
	}



	public String getNickName() {
		return NickName;
	}



	public void setNickName(String nickName) {
		NickName = nickName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getMail() {
		return mail;
	}



	public void setMail(String mail) {
		this.mail = mail;
	}



	public dates getContractDate() {
		return contractDate;
	}



	public void setContractDate(dates contractDate) {
		this.contractDate = contractDate;
	}



	public String getType_fee() {
		return type_fee;
	}



	public void setType_fee(String type_fee) {
		this.type_fee = type_fee;
	}



	public boolean comparePassword(User object) {
		return getPassword().equals(((User)object).getPassword());
	}
	
//	public int compareTo(User param) {//para ordenar los clientes por Nombre de usuario
//	if(this.getNickName().compareTo(param.getNickName())>0)
//		return 1;
//	if(this.getNickName().compareTo(param.getNickName())<0)
//		return -1;
//	return 0;
//  }

	
	
	public boolean equals(User object){
		return getNickName().equals(((User)object).getNickName());
	}	


	

	@Override
	public String toString() {
		return "User [NickName=" + NickName + "\n ," +
				"Password=" + password + "\n ," +
				"Type=" + type + "\n ," + 
				"Mail=" + mail + "\n ," +
				"ContractDate=" + contractDate + "\n ," +
				"Type_fee=" + type_fee ;
	}

}
