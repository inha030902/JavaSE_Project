package workshop.person.entity;

public class PersonEntity {

    private String name; 
	private char gender;
	private String ssn; 
	private String address; 
	private String phone;

    public PersonEntity() {
    
    }

    public PersonEntity(String name, String ssn, String address, String phone) {    
        // this.name = name;
        // this.ssn = ssn;
        // this.address = address;
        // this.phone = phone;
        setName(name);
        setSsn(ssn); // 이건 반드시 setSsn()을 호출해야 이상한 값이 들어오지 않음.
        setAddress(address);
        setPhone(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
        //0508073457896
        char genderNum = ssn.charAt(6);
        if (genderNum == '1' || genderNum == '3') {
            setGender('남');
        }else { //2,4
            setGender('여');
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
