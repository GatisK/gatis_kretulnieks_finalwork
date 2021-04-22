package lv.lu.gatis.kretulnieks.finalwork;

import lv.lu.gatis.kretulnieks.finalwork.model.Product;
import lv.lu.gatis.kretulnieks.finalwork.repository.ProductRepository;
import lv.lu.gatis.kretulnieks.finalwork.service.ProductService;
import lv.lu.gatis.kretulnieks.finalwork.ui.ConsoleUi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        final Map<Long, Product> repository = new HashMap<>();
        ProductRepository productRepository = new ProductRepository(repository);
        ProductService productService = new ProductService(productRepository);
        Scanner scanner = new Scanner(System.in);

       new ConsoleUi(productService, scanner).run();
    }
}
