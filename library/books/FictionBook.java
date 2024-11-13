package library.books;

public class FictionBook {
    String title;
    String author;
    String genre;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void displayInfo(){
        System.out.println("Title :\t"+title);
        System.out.println("Author :\t"+author);
        System.out.println("Genre :\t"+genre);
    }

}
