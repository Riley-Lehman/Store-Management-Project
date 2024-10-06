public class StoreRunner {
public static void main(String[] args) {

Photo colored = new Photo ("The Night Sky" , "Gerald Rhemann" , "9.15.2022" , "Canon EOS R6 Mark II" , 200.00);
Photo filtered = new Photo ("Famous Artist" , "Rembrandt" , "2.27.2021" , "Fujifilm X-T5" , 150.00);

coloredPhoto buyColoredPhoto = new coloredPhoto(colored.getPhoto(), colored.getPhotographer(), colored.getDateTook(), colored.getCamera(), colored.getPrice(), "Full Color");
System.out.println(buyColoredPhoto.toString());

filteredPhoto buyFilteredPhoto = new filteredPhoto(filtered.getPhoto(), filtered.getPhotographer(), filtered.getDateTook(), filtered.getCamera(), filtered.getPrice(), "Black and White");
System.out.println(buyFilteredPhoto.toString());
  }
}