package id.boxee.pay.modelclass;

public class Transaction_Modal_Class_2 {

    int img;
    String name;
    String date;
    String price;


    public Transaction_Modal_Class_2() {


    }

    public Transaction_Modal_Class_2(int img, String name, String date, String price) {
        this.img = img;
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

