package id.boxee.pay.modelclass;

public class Activities_Modal_Class {




    int img1;
    String name1;
    String date1;
    String price1;


    public Activities_Modal_Class(){


    }

    public Activities_Modal_Class(int img1, String name1, String date1, String price1) {
        this.img1 = img1;
        this.name1 = name1;
        this.date1 = date1;
        this.price1 = price1;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }


}
