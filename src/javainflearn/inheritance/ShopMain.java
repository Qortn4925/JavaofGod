package javainflearn.inheritance;

public class ShopMain {

    public static void main(String[] args) {

        Book book = new Book("java", 10000, "han", 12345);
        Album album = new Album("앨범1", 15000, "seo");
        Movie movie = new Movie("영화1", 18000, "감독 1", "배우 1");


        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice()+ album.getPrice()+ movie.getPrice() ;
        System.out.println("sum = " + sum);
    }
}
