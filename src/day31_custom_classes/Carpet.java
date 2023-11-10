package day31_custom_classes;

public class Carpet {
//instance variables:
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    //local variables:
    public Carpet (boolean inputIsPersian, double inputWidth, double inputLenght, double inputUnitPrice) {
        width =inputWidth;
        length =inputLenght;
        isPersian =inputIsPersian;
        unitPrice = inputUnitPrice;
        calculatePrice();
    }



    public void calculatePrice () {
        totalPrice = width * length * unitPrice;

        if(isPersian) {
            totalPrice += 200;
        }

    }

    @Override
    public String toString() {
        return (isPersian ? "The Persian carpet " : "The carper") +
                "\n\tHas dimensions: " + width + " x " + length +
                "\n\tUnit Price $" + unitPrice +
                "\n\tTotal Price $" + totalPrice;

    }
}