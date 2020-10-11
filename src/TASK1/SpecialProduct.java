package TASK1;

public class SpecialProduct extends Product {
    int regularPrice;
    int percentageOff;

    public SpecialProduct(name,price) {
        super(name, price);

    }

    @Override
    public String toString() {
        return "TASK1.SpecialProduct{" +
                "regularPrice=" + regularPrice +
                ", percentageOff=" + percentageOff +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public static SpecialProduct applyOffOnProduct(Product product,int percentageOff)
    {
       SpecialProduct product1=new SpecialProduct(product.name,discountedPrice)
               regularPrice= product.price;
       this.percentageOff=percentageOff;
       return product1;
    }

}
