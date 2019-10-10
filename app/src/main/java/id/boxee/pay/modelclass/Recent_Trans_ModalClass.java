package id.boxee.pay.modelclass;

public class Recent_Trans_ModalClass {

    int tran_profile;
    String tran_name;
    String tran_subname;
    String tran_price;
    String tran_date;

    public  Recent_Trans_ModalClass(){

    }

    public Recent_Trans_ModalClass(int tran_profile, String tran_name, String tran_subname, String tran_price, String tran_date) {
        this.tran_profile = tran_profile;
        this.tran_name = tran_name;
        this.tran_subname = tran_subname;
        this.tran_price = tran_price;
        this.tran_date = tran_date;
    }

    public int getTran_profile() {
        return tran_profile;
    }

    public void setTran_profile(int tran_profile) {
        this.tran_profile = tran_profile;
    }

    public String getTran_name() {
        return tran_name;
    }

    public void setTran_name(String tran_name) {
        this.tran_name = tran_name;
    }

    public String getTran_subname() {
        return tran_subname;
    }

    public void setTran_subname(String tran_subname) {
        this.tran_subname = tran_subname;
    }

    public String getTran_price() {
        return tran_price;
    }

    public void setTran_price(String tran_price) {
        this.tran_price = tran_price;
    }

    public String getTran_date() {
        return tran_date;
    }

    public void setTran_date(String tran_date) {
        this.tran_date = tran_date;
    }
}
