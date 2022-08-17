public class Repository {



    Product[] products = new Product[0];

    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }


    public void removeById(int removeId) {
        if (findById(removeId) == null) {
            throw new NotFoundException("Element with id: " + removeId + " not found");
        }
        Product[] tmp = new Product[products.length - 1];
        int index = 0;
         for (Product product : products) {
             if (product.getId() != removeId) {
                 tmp[index] = product;
                 index++;
             }
         }
         products = tmp;
    }

    public Product findById(int id) {
        Product result = null;
        for (Product product : products) {
            if (product.getId() == id) {
                result = product;
                break;
            }
        }
        return result;
    }


    public Product[] findAll() {
        return products;
    }


}
