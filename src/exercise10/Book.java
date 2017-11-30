package exercise10;

import java.util.Comparator;
import java.util.Objects;

/**
 * Class Book
 * @author yasiro01
 */
public class Book {
    private final String title;
    private final String author;
    private Double price;
    private final Integer year;
    
    public Book(String title, String author, Double price, Integer year){
        this.title=title;
        this.author=author;
        this.price=price;
        this.year= year;
    }
    public Book(Book o){
        title=o.title;
        author=o.author;
        price=o.price;
        year=o.year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getYear() {
        return year;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.title);
        hash = 23 * hash + Objects.hashCode(this.author);
        hash = 23 * hash + Objects.hashCode(this.price);
        hash = 23 * hash + Objects.hashCode(this.year);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return title + '('+year + ')'+" by " + author + " costs $" + price;
    }
    
    
}

class ByTitle implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getTitle().equals(o2.getTitle())){
            return 1;
        }
        return 0;
    }
    
}

class ByAuthor implements Comparator<Book> {
     @Override
    public int compare(Book o1, Book o2) {
        if(o1.getAuthor().equals(o2.getAuthor())){
            return 1;
        }
        return 0;
    }
}

class ByPrice implements Comparator<Book> {
     @Override
    public int compare(Book o1, Book o2) {
        if(o1.getPrice().equals(o2.getPrice())){
            return 1;
        }
        return 0;
    }
}

class ByYear implements Comparator<Book> {
     @Override
    public int compare(Book o1, Book o2) {
        if(o1.getYear().equals(o2.getYear())){
            return 1;
        }
        return 0;
    }
}
