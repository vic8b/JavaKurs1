package Homework.Homework_7;

class Product {
    private String name;
    private Category category;

    Product(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product: ")
                .append(name)
                .append(", category: ")
                .append(category.toString().toLowerCase());
        return sb.toString();
    }
}
