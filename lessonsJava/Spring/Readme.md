
Spring Framework Short Projects Overview

## 1. Spring Basics Project
Description:\
A fundamental Spring project showcasing the core concepts of dependency injection, inversion of control (IoC), and aspect-oriented programming (AOP). Utilizes XML-based configuration for bean definitions and illustrates the creation of simple Java classes as Spring beans.

**Example Code:**

```java
// Main Application
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.printMessage();
    }
}

// Bean Configuration (spring-config.xml)
<beans>
    <bean id="helloWorld" class="com.example.HelloWorld"/>
</beans>

// Sample Bean Class
public class HelloWorld {
    public void printMessage() {
        System.out.println("Hello, Spring!");
    }
}
```


## 2. JDBC Integration Project
Description:\
An introductory project demonstrating the integration of Spring with JDBC (Java Database Connectivity). Illustrates how to configure a DataSource, create a simple DAO (Data Access Object), and perform basic database operations using Spring's JDBC template.

**Example Code:**

```java
// Main Application
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.printMessage();
    }
}

// Bean Configuration (spring-config.xml)
<beans>
    <bean id="helloWorld" class="com.example.HelloWorld"/>
</beans>

// Sample Bean Class
public class HelloWorld {
    public void printMessage() {
        System.out.println("Hello, Spring!");
    }
}

```

## 3. Spring Boot REST API Project
Description:\
A concise Spring Boot project implementing a RESTful API. Utilizes Spring Boot's auto-configuration and annotations for rapid development. Includes CRUD (Create, Read, Update, Delete) operations for a simple resource.

Example Code:

```java
// REST Controller
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id) {
        // Get product by id
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        // Create new product
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product product) {
        // Update product
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable long id) {
        // Delete product
    }
}

```


## Spring Data JPA:

Spring Data JPA simplifies access to relational databases using JPA (Java Persistence API) and integrates with the Spring framework.

1) JPA Repositories: Spring Data JPA provides JPA repositories that offer high-level methods to interact with the database without writing SQL queries.
Example:

```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByLastName(String lastName);
```
2) Derived Queries: Methods in the repositories can automatically generate queries based on the method name.
Example:

3) Auditing: Spring Data JPA offers auditing capabilities that allow tracking who and when entities were created or modified.

```java
List<User> findByFirstNameAndLastName(String firstName, String lastName);
```



Spring Data Rest:

Spring Data REST simplifies the creation of RESTful services based on JPA repositories. 


