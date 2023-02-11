package Okna;
import java.util.Scanner;

/*
    The window company should have:
    - length
    - width
    - price
    - window name
    - buyer first name
    - buyer last name
 */

public class Okienka {

    private float windowLength;             // It stores the window's length
    private float windowWidth;              // It stores the window's widthe
    private float windowPrice = 100.0f;     // It stores the window's price in USD
    private String windowName = "";         // It stores the window's name (the product name), by default it stores none
    private String buyerName = "";          // It holds the first name of the buyer, by default it stores none
    private String buyerSurname = "";       // It holds the last name of the buyer, by default it stores none

    public Okienka(String bName, String bSurname) {
        this.buyerName = bName;
        this.buyerSurname = bSurname;

        // I am outputing the first name and the last name of the buyer
        System.out.println("Hello: [" + this.buyerName + "] [" + this.buyerSurname + "]");

        // The user selects the window
        this.windowName = windows();

        // Sets the width and length of the window
        setWinParameters(this.windowName);

        // Sets the price of the window
        setWinPrice(this.windowName);
    }

    // The method shows the windows the company has
    public String windows() {
        System.out.println("SELECT THE WINDOW MODEL");
        System.out.print("1 Window M\n2 Window L\n3 Window XL\n0 None\nSelect: ");
        int option = getInt();

        if (option == 1) { return "WindowM"; }
        else if (option == 2) { return "WindowL"; }
        else if (option == 3) { return "WindowXL"; }
        else { return ""; }
    }

    // The method sets the width and length of the window in meters
    public void setWinParameters(String window) {
        if (window.equals("WindowM")) {
            this.windowWidth = 0.5f;
            this.windowLength = 0.5f;
        } else if (window.equals("WindowL")) {
            this.windowWidth = 1.0f;
            this.windowLength = 1.0f;
        } else if (window.equals("WindowXL")) {
            this.windowWidth = 1.5f;
            this.windowLength = 1.5f;
        } else {
            this.windowWidth = 0.0f;
            this.windowLength = 0.0f;
        }
    }

    // The method sets the price of the window depending on the model
    public void setWinPrice(String window) {
        if (window.equals("WindowM")) {
            this.windowPrice *= 1.5f;
        } else if (window.equals("WindowL")) {
            this.windowPrice *= 2.5f;
        } else if (window.equals("WindowXL")) {
            this.windowPrice *= 3.8f;
        } else {
            System.out.println("Sorry, but you will still pay 100 USD since you are using our services :-)");
        }
    }

    // The get input String method
    public static String getString() {
        return new Scanner(System.in).next();
    }

    // The get input int method
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    // The get input float method
    public static float getFloat() {
        return new Scanner(System.in).nextFloat();
    }
}
