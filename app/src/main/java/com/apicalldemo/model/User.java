package com.apicalldemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("firstName")
@Expose
private String firstName;
@SerializedName("lastName")
@Expose
private String lastName;
@SerializedName("maidenName")
@Expose
private String maidenName;
@SerializedName("age")
@Expose
private Integer age;
@SerializedName("gender")
@Expose
private String gender;
@SerializedName("email")
@Expose
private String email;
@SerializedName("phone")
@Expose
private String phone;
@SerializedName("username")
@Expose
private String username;
@SerializedName("password")
@Expose
private String password;
@SerializedName("birthDate")
@Expose
private String birthDate;
@SerializedName("image")
@Expose
private String image;
@SerializedName("bloodGroup")
@Expose
private String bloodGroup;
@SerializedName("height")
@Expose
private Integer height;
@SerializedName("weight")
@Expose
private Double weight;
@SerializedName("eyeColor")
@Expose
private String eyeColor;
@SerializedName("hair")
@Expose
private Hair hair;
@SerializedName("domain")
@Expose
private String domain;
@SerializedName("ip")
@Expose
private String ip;
@SerializedName("address")
@Expose
private Address address;
@SerializedName("macAddress")
@Expose
private String macAddress;
@SerializedName("university")
@Expose
private String university;
@SerializedName("bank")
@Expose
private Bank bank;
@SerializedName("company")
@Expose
private Company company;
@SerializedName("ein")
@Expose
private String ein;
@SerializedName("ssn")
@Expose
private String ssn;
@SerializedName("userAgent")
@Expose
private String userAgent;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getMaidenName() {
return maidenName;
}

public void setMaidenName(String maidenName) {
this.maidenName = maidenName;
}

public Integer getAge() {
return age;
}

public void setAge(Integer age) {
this.age = age;
}

public String getGender() {
return gender;
}

public void setGender(String gender) {
this.gender = gender;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getPhone() {
return phone;
}

public void setPhone(String phone) {
this.phone = phone;
}

public String getUsername() {
return username;
}

public void setUsername(String username) {
this.username = username;
}

public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}

public String getBirthDate() {
return birthDate;
}

public void setBirthDate(String birthDate) {
this.birthDate = birthDate;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

public String getBloodGroup() {
return bloodGroup;
}

public void setBloodGroup(String bloodGroup) {
this.bloodGroup = bloodGroup;
}

public Integer getHeight() {
return height;
}

public void setHeight(Integer height) {
this.height = height;
}

public Double getWeight() {
return weight;
}

public void setWeight(Double weight) {
this.weight = weight;
}

public String getEyeColor() {
return eyeColor;
}

public void setEyeColor(String eyeColor) {
this.eyeColor = eyeColor;
}

public Hair getHair() {
return hair;
}

public void setHair(Hair hair) {
this.hair = hair;
}

public String getDomain() {
return domain;
}

public void setDomain(String domain) {
this.domain = domain;
}

public String getIp() {
return ip;
}

public void setIp(String ip) {
this.ip = ip;
}

public Address getAddress() {
return address;
}

public void setAddress(Address address) {
this.address = address;
}

public String getMacAddress() {
return macAddress;
}

public void setMacAddress(String macAddress) {
this.macAddress = macAddress;
}

public String getUniversity() {
return university;
}

public void setUniversity(String university) {
this.university = university;
}

public Bank getBank() {
return bank;
}

public void setBank(Bank bank) {
this.bank = bank;
}

public Company getCompany() {
return company;
}

public void setCompany(Company company) {
this.company = company;
}

public String getEin() {
return ein;
}

public void setEin(String ein) {
this.ein = ein;
}

public String getSsn() {
return ssn;
}

public void setSsn(String ssn) {
this.ssn = ssn;
}

public String getUserAgent() {
return userAgent;
}

public void setUserAgent(String userAgent) {
this.userAgent = userAgent;
}

}
