package id.boxee.pay.modelclass;

public class SendMoneyModalClass {

    int profile;
    String profile_name;

    public SendMoneyModalClass(int profile, String profile_name) {
        this.profile = profile;
        this.profile_name = profile_name;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getProfile_name() {
        return profile_name;
    }

    public void setProfile_name(String profile_name) {
        this.profile_name = profile_name;
    }
}
