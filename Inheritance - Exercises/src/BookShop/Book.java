package BookShop;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String author, String title, double price) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if (title.trim().length() < 3){
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        String[] firstSecondName = author.trim().split(" ");
        if (firstSecondName.length > 1) {
            char[] secondName = firstSecondName[1].trim().toCharArray();
            if (Character.isDigit(secondName[0])) {
                throw new IllegalArgumentException("Author not valid!");
            }
        }

        this.author = author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder bd = new StringBuilder();

        return bd.append("Type: ")
                .append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ")
                .append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ")
                .append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ")
                .append(this.getPrice())
                .append(System.lineSeparator())
                .toString();
    }
}
