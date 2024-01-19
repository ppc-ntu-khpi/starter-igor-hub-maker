public class Shirt {
    public int shirtID = 5; // стандартне значення номера моделі сорочки
    public String description = " Це сорочка"; // стандартний опис сорочки
    // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
    public String colorCode = "green";
    public double price = 150.2; // стандартна вартість сорочки
    public int quantityInStock = 600; // стандартна кількість на складі

    // цей метод просто виводить всю інформацію про сорочку на екран
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    } // кінець методу displayShirtInformation
} // кінець опису класу