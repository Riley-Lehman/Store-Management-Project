import java.util.Scanner;

public class StoreRunner {
public static void main(String[] args) {

// Creates a Scanner object - feel free to delete if not using!
Scanner input = new Scanner(System.in);
  
/*
* Instantiate new coloredPhoto and filteredPhoto values to the variables, including name, camera details, cost
*/
Photo colored = new Photo ("The Night Sky" , "Gerald Rhemann" , "9.15.2022" , "Canon EOS R6 Mark II" , 200.00);
Photo filtered = new Photo ("Famous Artist" , "Rembrandt" , "2.27.2021" , "Fujifilm X-T5" , 150.00);
  
/*
* Instantiates new colored and filtered photos with undefined values tied to their variables
*/
coloredPhoto buyColoredPhoto = new coloredPhoto(colored.getPhoto(), colored.getPhotographer(), colored.getDateTook(), colored.getCamera(), colored.getPrice(), "Full Color");
System.out.println(buyColoredPhoto.toString());
filteredPhoto buyFilteredPhoto = new filteredPhoto(filtered.getPhoto(), filtered.getPhotographer(), filtered.getDateTook(), filtered.getCamera(), filtered.getPrice(), "Black and White");
System.out.println(buyFilteredPhoto.toString());

/*
* Print small talk / choices
*/
System.out.println("Look Around and Tell Me What You Find!");     
System.out.println("Oh! I See You've Found Our Best Sellers!");
System.out.println("Luckily For You, We Have Two More Photos In Stock!");
System.out.println("A Full Color Photo Of The Night Sky, Or A Black And White Portrait Of A Famous Artist?");
String userphoto = input.nextLine();

/*
* Print prices and small talk
*/
System.out.println("Colored is 4.00 and Filtered is 2.00!");
System.out.println("You Can Pay Over Here!");
  
/*
* Instantiate space and undefined value to input value 4.00 or 2.00
*/
double userPrice = input.nextDouble();
colored.setPrice(userPrice);
String userprice = input.nextLine();

/*
* If statement to separate 4.00 Sky from 2.00 Portrait
*/
if (userPrice == 4.00) {
/*
* Display the variables along with respective values 
*/  
System.out.println("Photographer: " + colored.getPhotographer());
System.out.println("Date: " + colored.getDateTook());
System.out.println("Camera: " + colored.getCamera());
  
} else {
/*
* Display the variables along with respective values 
*/  
System.out.println("Photographer: " + filtered.getPhotographer());
System.out.println("Date: " + filtered.getDateTook());
System.out.println("Camera: " + filtered.getCamera());
  
}


// Closes the Scanner object
input.close();

  }
}