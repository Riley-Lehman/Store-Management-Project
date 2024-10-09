public class Photo {

public String photo; 
public String photographer;
public String dateTook;
public String camera;
public double price;

/* 
  * No Parameter Constructor for Photo
  */
public Photo() {
this.photo = "no photo found";
this.photographer = "photographer not found";
this.dateTook = "no date found";
this.camera = "no device found";
this.price = 0.0;
}
/* 
  * Parameter Constructor for Photo
  */
public Photo(String photo, String photographer, String dateTook, String camera, double price) {
this.photo = photo;
this.photographer = photographer;
this.dateTook = dateTook;
this.camera = camera;
this.price = price;
}
/* 
  * Accessor Method for Photo 
  */
public String getPhoto() {
return photo; 
}
/* 
  * Modifier Method for Photo
  */
public void setPhoto(String photo) {
this.photo = photo;
}
/* 
  * Accessor Method for Photographer
  */
public String getPhotographer() {
return photographer;
}
/* 
  * Modifier Method for Photographer
  */
public void setPhotographer(String photographer) {
this.photographer = photographer;
}
/* 
  * Accessor Method for DateTook
  */
public String getDateTook() {
return dateTook;
}
/* 
  * Modifier Method for DateTook
  */
public void setDateTook(String dateTook) {
this.dateTook = dateTook;
}
/* 
  * Accessor Method for Camera
  */
public String getCamera() {
return camera;
}
 /* 
  * Modifier Method for Camera
  */   
public void setCamera(String camera) {
this.camera = camera;
}
/* 
  * Accessor Method for Price
  */
public double getPrice() {
return price;
}
/* 
  * Modifier Method for Price
  */
public void setPrice(double price) {
this.price = price;
}
/* 
  * Accessor Method for ToString
  */  
public String toString() {
return "Photo: " + photo + ", Photographer: " + photographer + ", Date Taken: " + dateTook + ", Camera: " + camera + ", Price: $" + price;
}
}