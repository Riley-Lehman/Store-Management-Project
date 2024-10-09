public class filteredPhoto extends Photo {

private String colorMode;
/* 
  * Parameter Constructor for filteredPhoto
  */
public filteredPhoto(String photo, String photographer, String dateTook, String camera, double price, String colorMode) {
super.setPhoto(photo);
super.setPhotographer(photographer);
super.setDateTook(dateTook);
super.setCamera(camera);
super.setPrice(price);
this.colorMode = colorMode;
}
/* 
  * Accessor method for colorMode
  */
public String getColorMode() {
return colorMode;
}
/* 
  * Modifier method for colorMode
  */
public void setColorMode(String colorMode) {
this.colorMode = colorMode;
}
/* 
  * ToString dislays variable names paired with values
  */
public String toString() {
return "Photo: " + getPhoto() + 
", Photographer: " + getPhotographer() + 
", Date Taken: " + getDateTook() + 
", Camera: " + getCamera() + 
", Price: $" + getPrice() + 
", Color Mode: " + colorMode;
    }
}
