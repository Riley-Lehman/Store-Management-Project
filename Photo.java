public class Photo {

public String photo; 
public String photographer;
public String dateTook;
public String camera;
public double price;

   
public Photo() {
this.photo = "no photo found";
this.photographer = "photographer not found";
this.dateTook = "no date found";
this.camera = "no device found";
this.price = 0.0;
}

public Photo(String photo, String photographer, String dateTook, String camera, double price) {
this.photo = photo;
this.photographer = photographer;
this.dateTook = dateTook;
this.camera = camera;
this.price = price;
}

public String getPhoto() {
return photo; 
}

public void setPhoto(String photo) {
this.photo = photo;
}

public String getPhotographer() {
return photographer;
}

public void setPhotographer(String photographer) {
this.photographer = photographer;
}

public String getDateTook() {
return dateTook;
}

public void setDateTook(String dateTook) {
this.dateTook = dateTook;
}

public String getCamera() {
return camera;
}
    
public void setCamera(String camera) {
this.camera = camera;
}

public double getPrice() {
return price;
}

public void setPrice(double price) {
this.price = price;
}
  
public String toString() {
return "Photo: " + photo + ", Photographer: " + photographer + ", Date Taken: " + dateTook + ", Camera: " + camera + ", Price: $" + price;
}
}