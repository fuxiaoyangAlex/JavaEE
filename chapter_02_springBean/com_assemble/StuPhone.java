package chapter_02_springBean.com_assemble;

public class StuPhone {
    private Phone phone;

    public StuPhone(Phone phone) {
        this.phone = phone;
    }

    public StuPhone(){

    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "StuPhone{" +
                "phone=" + phone +
                '}';
    }

    public Phone getPhone() {
        return phone;
    }
}
