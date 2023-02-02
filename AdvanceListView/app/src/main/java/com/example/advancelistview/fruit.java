package com.example.advancelistview;

public class fruit {
    private String Ten, MoTa;
    private int img;

    public fruit (String Ten,String MoTa, int img){
       this.Ten=Ten;
        this.MoTa= MoTa;
        this.img = img;
    }
    public String getTen(){
        return Ten;
    }
    public void setTen(String ten){
        this.Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        this.MoTa = moTa;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
