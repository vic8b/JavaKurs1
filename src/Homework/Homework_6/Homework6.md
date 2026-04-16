# Homework – Introduction to OOP (classes, objects, constructors, this, static, method overloading)

1. **First class and object**
    - Create a class `Car` with fields `brand` (String) and `yearOfProduction` (int).
    - In `main`, create an object of this class, set field values, and print the car data.

2. **No-args constructor**
    - Add a no-args constructor in `Car` that sets default values (`"Unknown"`, `2000`).
    - In `main`, create an object using this constructor and print its data.

3. **Constructor with parameters**
    - Add a constructor in `Car` that accepts `brand` and `yearOfProduction`.
    - Create several cars with different data and print their values.

4. **Fields vs local variables**
    - In `Car`, add a method `showDifference()` that creates a local variable named `brand`.
    - Print both values (`this.brand` and local `brand`) to show the difference.

5. **Using this in a method**
    - Add a method `changeBrand(String brand)` that changes the object’s `brand` field.
    - Use `this.brand = brand`.
    - Test in `main`.

6. **Calling one constructor from another**
    - Add a no-args constructor that calls the parameterized one (`this("Unknown", 2000)`).
    - Check in `main`.

7. **Instance method**
    - Add a method `introduceYourself()` that prints:  
      `I am a car of brand BRAND from year YEAR.`
    - Call it in `main` for several objects.

8. **Static method**
    - Add a static method `classDescription()` that prints:  
      `This class represents cars.`
    - Call it in `main` without creating an object.

9. **Static field**
    - Add a static field `counter` that counts created `Car` objects.
    - Increase the counter in the constructor.
    - In `main`, print how many objects were created.

10. **Array of objects**
    - Create an array `Car[]` containing 3 different cars.
    - Print data of all cars in a loop.

11. **Simple class Person**
    - Create a class `Person` with fields `name` and `age`.
    - Add a method `introduceYourself()` that prints the person’s data.
    - In `main`, create several people and call their methods.

12. **Method overloading – Person**
    - In `Person`, add an overloaded method `introduceYourself(String greeting)` that prints the greeting before the person’s info.
    - Call both versions in `main`.

13. **Constructor overloading – Person**
    - Add a constructor with two parameters (`name`, `age`) and another with only `name` (default age = 0).
    - Create objects using different constructors and print data.

14. **Using this in overloaded constructors**
    - In the one-parameter constructor (`name`), call the two-parameter constructor with `age = 0`.
    - Test in `main`.

15. **Static vs non-static – difference**
    - In `Person`, add a static field `numberOfPeople`.
    - Increase it in the constructor.
    - In `main`, print how many objects were created and compare access via object vs class.

16. **Array of people and method**
    - Create an array `Person[]` with several objects.
    - Add a method in `Person` that returns whether the person is an adult.
    - In `main`, print which people are adults.

17. **Method with object parameter**
    - Add a method `compareAge(Person other)` that returns the age difference.
    - In `main`, compare the age of two people and print the result.

18. **Simple class Product**
    - Create a class `Product` with fields `name` and `price` (Double, or BigDecimal if you know it).
    - Add a constructor and a method `showProduct()` that prints product data.
    - In `main`, create several products and print them.

19. **Overloaded methods in Product**
    - In `Product`, add a method `reducePrice(Double amount)` and an overloaded version `reducePrice(Double amount, String reason)` that also prints the reason.
    - Test both methods in `main`.

20. **Simple Shop**
    - Create a class `Shop` with a field `name` and an array of products.
    - Add a constructor setting the name and product list.
    - Add a method `showProducts()` that prints all products in the shop.
    - In `main`, create a shop with several products and call this method.
