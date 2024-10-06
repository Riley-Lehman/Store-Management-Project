public class coloredPhoto extends Photo {

private String colorMode;

public coloredPhoto(String photo, String photographer, String dateTook, String camera, double price, String colorMode) {
super.setPhoto(photo);
super.setPhotographer(photographer);
super.setDateTook(dateTook);
super.setCamera(camera);
super.setPrice(price);
this.colorMode = colorMode;
}

public String getColorMode() {
return colorMode;
}

public void setColorMode(String colorMode) {
this.colorMode = colorMode;
}

public String toString() {
return "Photo: " + getPhoto() + 
", Photographer: " + getPhotographer() + 
", Date Taken: " + getDateTook() + 
", Camera: " + getCamera() + 
", Price: $" + getPrice() + 
", Color Mode: " + colorMode;
    }
}