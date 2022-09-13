public class Main {
    public static void main(String[] args) {

        //oluşturduğumuz ürün classının içindeki ayrıntılara elle değikenlere tanımlamalarımızı yaptık.
        Product product=new Product();
        product.name="Laptop";
        product.id=1;
        product.description="Asus Laptop";
        product.price=5000;
        product.stockAmount=5;

        //Oluşturduğumuz ürün yönetim classımıza ürün yüklememizi yaptık.
        ProductManager productManager=new ProductManager();
        productManager.Add(product);







    }
}