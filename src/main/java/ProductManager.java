public class ProductManager {

    Repository repository;

    public ProductManager(Repository repository) {
        this.repository = repository;
    }

    public void add(Product product) {
        repository.add(product);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product: repository.findAll()) {
            if (product.getName().contains(text)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result [i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }




   // private boolean matches(Product product, String search) {
   //     if (product.getName().contains(search)) {
    //        return true;
    //    } else {
    //       return false;
     //   }
   // }
}
