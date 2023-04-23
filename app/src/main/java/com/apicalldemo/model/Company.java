package com.apicalldemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Company {

@SerializedName("address")
@Expose
private Address__1 address;
@SerializedName("department")
@Expose
private String department;
@SerializedName("name")
@Expose
private String name;
@SerializedName("title")
@Expose
private String title;

public Address__1 getAddress() {
return address;
}

public void setAddress(Address__1 address) {
this.address = address;
}

public String getDepartment() {
return department;
}

public void setDepartment(String department) {
this.department = department;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

}