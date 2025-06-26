package day1_6;

class Product {
    private static int codeCounter = 101;
    private String productCode;
    private String name;

    public Product(String name) {
        this.name = name;
        this.productCode = "P" + codeCounter++;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product Code: " + productCode + ", Name: " + name;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone");

        System.out.println(p1);
        System.out.println(p2);
    }
}
