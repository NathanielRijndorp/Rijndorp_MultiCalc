package com.example.rijndorp_multicalc;

public class Formula2 {

    private String formulaName2;
    private int image2;

    public Formula2() {

    }

    public Formula2(String FormulaNames2, int Image2) {
        formulaName2 = FormulaNames2;
        image2 = Image2;
    }

    //Getters
    public void setFormulaName(String formulaName) {
        this.formulaName2 = formulaName;
    }

    public void setImage(int image) {
        this.image2 = image;
    }

    //Setters
    public String getFormulaName() {
        return formulaName2;
    }

    public int getImage() {
        return image2;
    }
}