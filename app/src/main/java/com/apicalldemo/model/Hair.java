package com.apicalldemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hair {

@SerializedName("color")
@Expose
private String color;
@SerializedName("type")
@Expose
private String type;

public String getColor() {
return color;
}

public void setColor(String color) {
this.color = color;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

}