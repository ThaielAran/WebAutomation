package testingAPI;

import java.util.List;

public class Example {

private String name;
private String height;
private String mass;
private String hairColor;
private String skinColor;
private String eyeColor;
private String birthYear;
private String gender;
private String homeworld;
private List<String> films;
private List<String> species;
private List<Object> vehicles;
private List<Object> starships;
private String created;
private String edited;
private String url;


public Example() {
}

public Example(String name, String skinColor, List<String> films) {
}
public Example(String name, String height, String mass, String hairColor, String skinColor, String eyeColor, String birthYear, String gender, String homeworld, List<String> films, List<String> species, List<Object> vehicles, List<Object> starships, String created, String edited, String url) {
super();
this.name = name;
this.height = height;
this.mass = mass;
this.hairColor = hairColor;
this.skinColor = skinColor;
this.eyeColor = eyeColor;
this.birthYear = birthYear;
this.gender = gender;
this.homeworld = homeworld;
this.films = films;
this.species = species;
this.vehicles = vehicles;
this.starships = starships;
this.created = created;
this.edited = edited;
this.url = url;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getHeight() {
return height;
}

public void setHeight(String height) {
this.height = height;
}

public String getMass() {
return mass;
}

public void setMass(String mass) {
this.mass = mass;
}

public String getHairColor() {
return hairColor;
}

public void setHairColor(String hairColor) {
this.hairColor = hairColor;
}

public String getSkinColor() {
return skinColor;
}

public void setSkinColor(String skinColor) {
this.skinColor = skinColor;
}

public String getEyeColor() {
return eyeColor;
}

public void setEyeColor(String eyeColor) {
this.eyeColor = eyeColor;
}

public String getBirthYear() {
return birthYear;
}

public void setBirthYear(String birthYear) {
this.birthYear = birthYear;
}

public String getGender() {
return gender;
}

public void setGender(String gender) {
this.gender = gender;
}

public String getHomeworld() {
return homeworld;
}

public void setHomeworld(String homeworld) {
this.homeworld = homeworld;
}

public List<String> getFilms() {
return films;
}

public void setFilms(List<String> films) {
this.films = films;
}

public List<String> getSpecies() {
return species;
}

public void setSpecies(List<String> species) {
this.species = species;
}

public List<Object> getVehicles() {
return vehicles;
}

public void setVehicles(List<Object> vehicles) {
this.vehicles = vehicles;
}

public List<Object> getStarships() {
return starships;
}

public void setStarships(List<Object> starships) {
this.starships = starships;
}

public String getCreated() {
return created;
}

public void setCreated(String created) {
this.created = created;
}

public String getEdited() {
return edited;
}

public void setEdited(String edited) {
this.edited = edited;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

}
