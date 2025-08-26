package javainflearn.inheritance;

public class Album extends Item {
    private String artist;

    public Album(String name, int price, String artist) {
        this.artist = artist;
        this.setName(name);
        this.setPrice(price);
    }


    @Override
    public  void print(){
        super.print();
        System.out.println("-아티스트:"+artist);
    }
}
