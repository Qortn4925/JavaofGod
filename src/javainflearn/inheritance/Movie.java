package javainflearn.inheritance;

public class Movie extends Item {
    private String director;
    private  String actor;

    public Movie(String name, int price, String director, String actor) {
        this.setName(name);
        this.setPrice(price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public  void print(){
        super.print();
        System.out.println("-감독:"+director+"배우:"+actor);
    }
}
