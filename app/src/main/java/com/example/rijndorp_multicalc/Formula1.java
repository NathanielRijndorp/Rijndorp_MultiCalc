package com.example.rijndorp_multicalc;

public class Formula1 {

    private String formulaName;
    private int image;

    public Formula1() {

    }

    public Formula1(String FormulaNames1, int Image1) {
        formulaName = FormulaNames1;
        image = Image1;
    }

    //Getters
    public void setFormulaName(String formulaName) {
        this.formulaName = formulaName;
    }

    public void setImage(int image) {
        this.image = image;
    }

    //Setters
    public String getFormulaName() {
        return formulaName;
    }

    public int getImage() {
        return image;
    }
}