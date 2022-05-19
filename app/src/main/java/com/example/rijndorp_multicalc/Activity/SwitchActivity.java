package com.example.rijndorp_multicalc.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rijndorp_multicalc.R;

public class SwitchActivity extends AppCompatActivity implements View.OnClickListener{


    int pos, pos2;
    EditText fDen1, fDen2, fFreq1, fFreq2, fNew1, fNew2, fPow1, fPow2, fSpd1, fSpd2, fRect1, fRect2, fRect3, fCyl1, fCyl2, fCone1, fCone2, fSphr1;
    Button fDBtn, fFBtn, fNLBtn, fPBtn, fSBtn,fRectBtn, fCylBtn, fSphrBtn, fConeBtn;
    TextView densResult, freqResult, spdResult, powResult, newtonResult, rectResult, cylResult, sphrResult, coneResult;

    protected void onCreate(Bundle savedInstanceState) {
        pos = -1;
        pos2 = -1;
        super.onCreate(savedInstanceState);
        Bundle a = getIntent().getExtras();
        pos = a.getInt("positioning");
        if (pos == 0) {
            SpeedFormula();
        } else if (pos == 1) {
            DensityFormula();
        } else if (pos == 2) {
            FrequencyFormula();
        } else if (pos == 3) {
            PowerFormula();
        } else if (pos == 4) {
            NewtonSecondLaw();
        }
        pos2 = a.getInt("positioning2");
        if (pos2 == 0) {
            RectangleFormula();
        } else if (pos2 == 1) {
            CylinderFormula();
        } else if (pos2 == 2) {
            ConeFormula();
        } else if (pos2 == 3) {
            SphereFormula();
        }

    }
    public void DensityFormula () {
        setContentView(R.layout.formuladensity);
    }
    public void FrequencyFormula () {
        setContentView(R.layout.formulafrequency);
    }
    public void NewtonSecondLaw () {
        setContentView(R.layout.formulapower);
    }
    public void PowerFormula () {
        setContentView(R.layout.formulapower);
    }
    public void SpeedFormula () {
        setContentView(R.layout.formulaspeed);
    }
    public void SphereFormula () {
        setContentView(R.layout.formula2_sphere);
    }
    public void RectangleFormula () {
        setContentView(R.layout.formula2_rectangle);
    }
    public void ConeFormula () {
        setContentView(R.layout.formula2_cone);
    }
    public void CylinderFormula () {
        setContentView(R.layout.formula2_cylinder);
    }
    @Override
    public void onClick(View view) {

        //ID for EditText
        //Formula1
        fDen1 = findViewById(R.id.fDmass);
        fDen2 = findViewById(R.id.fDvelocity);
        fFreq1 = findViewById(R.id.fFvelocity);
        fFreq2 = findViewById(R.id.fFwavelength);
        fNew1 = findViewById(R.id.fNLaccel);
        fNew2 = findViewById(R.id.fNLmass);
        fPow1 = findViewById(R.id.fPtime);
        fPow2 = findViewById(R.id.fPwork);
        fSpd1 = findViewById(R.id.fSdistance);
        fSpd2 = findViewById(R.id.fStime);
        //Formula2
        fRect1 = findViewById(R.id.fRect1);
        fRect2 = findViewById(R.id.fRect2);
        fRect3 = findViewById(R.id.fRect3);
        fCyl1 = findViewById(R.id.fCyl1);
        fCyl2 = findViewById(R.id.fCyl2);
        fCone1 = findViewById(R.id.fCone1);
        fCone2 = findViewById(R.id.fCone2);
        fSphr1 = findViewById(R.id.fSphr1);
        //ID for TextView
        //Formula1
        densResult = findViewById(R.id.dResult);
        freqResult = findViewById(R.id.fResult);
        newtonResult = findViewById(R.id.nlResult);
        powResult = findViewById(R.id.pResult);
        spdResult = findViewById(R.id.sResult);
        //Formula2
        rectResult = findViewById(R.id.rectResult);
        cylResult = findViewById(R.id.fCylResult);
        coneResult = findViewById(R.id.fConeResult);
        sphrResult = findViewById(R.id.fSphrResult);
        //EditText String to Int
        double var1, var2, var3, ans;

        //ID for Button
        //Formula1
        fDBtn = findViewById(R.id.btnDCalc);
        fFBtn = findViewById(R.id.btnFCalc);
        fNLBtn = findViewById(R.id.btnNLCalc);
        fPBtn = findViewById(R.id.btnPCalc);
        fSBtn = findViewById(R.id.btnSCalc);
        //Formula2
        fRectBtn = findViewById(R.id.btnRect);
        fCylBtn = findViewById(R.id.btnCylinder);
        fConeBtn = findViewById(R.id.btnCone);
        fSphrBtn = findViewById(R.id.btnSphr);
        //SetOnClickListener

        switch(view.getId()) {
            case R.id.btnDCalc:
                if (fDen1.getText().toString().equals("") || fDen2.getText().toString().equals("")) {
                } else {
                    String fDen1Str = fDen1.getText().toString();
                    String fDen2Str = fDen2.getText().toString();
                    var1 = Double.parseDouble(fDen1Str);
                    var2 = Double.parseDouble(fDen2Str);
                    ans = (var1 / var2);
                    densResult.setText(" " + ans);
                }
                break;
            case R.id.btnFCalc:
                if (fFreq1.getText().toString().equals("") || fFreq2.getText().toString().equals("")) {
                } else {
                    String fFreqStr1 = fFreq1.getText().toString();
                    String fFreqStr2 = fFreq2.getText().toString();
                    var1 = Double.parseDouble(fFreqStr1);
                    var2 = Double.parseDouble(fFreqStr2);
                    ans = (var1 / var2);
                    freqResult.setText(" " + ans);
                }
                break;
            case R.id.btnNLCalc:
                if (fNew1.getText().toString().equals("") || fNew2.getText().toString().equals("")) {
                } else {
                String fNewStr1 = fNew1.getText().toString();
                String fNewStr2 = fNew2.getText().toString();
                var1 = Double.parseDouble(fNewStr1);
                var2 = Double.parseDouble(fNewStr2);
                ans = (var1 * var2);
                newtonResult.setText(" " + ans);
                }
                break;
            case R.id.btnPCalc:
                if (fPow1.getText().toString().equals("") || fPow2.getText().toString().equals("")) {
                } else {
                    String fPow1Str = fPow1.getText().toString();
                    String fPow2Str = fPow2.getText().toString();
                    var1 = Double.parseDouble(fPow1Str);
                    var2 = Double.parseDouble(fPow2Str);
                    ans = (var1 / var2);
                    powResult.setText(" " + ans);
                }
                break;
            case R.id.btnSCalc:
                if (fSpd1.getText().toString().equals("") || fSpd2.getText().toString().equals("")) {
                } else {
                    String fSpd1Str = fSpd1.getText().toString();
                    String fSpd2Str = fSpd2.getText().toString();
                    var1 = Double.parseDouble(fSpd1Str);
                    var2 = Double.parseDouble(fSpd2Str);
                    ans = (var1 / var2);
                    spdResult.setText(" " + ans);
                }
                break;
            case R.id.btnRect:
                if (fRect1.getText().toString().equals("") || fRect2.getText().toString().equals("") || fRect3.getText().toString().equals("")) {

                } else {
                    String fRect1Str = fRect1.getText().toString();
                    String fRect2Str = fRect2.getText().toString();
                    String fRect3Str = fRect3.getText().toString();
                    var1 = Double.parseDouble(fRect1Str);
                    var2 = Double.parseDouble(fRect2Str);
                    var3 = Double.parseDouble(fRect3Str);
                    ans = (var1*var2*var3);
                    rectResult.setText("" + ans);
                }
                break;
            case R.id.btnCone:
                if (fCone1.getText().toString().equals("") || fCone2.getText().toString().equals("")) {

                } else {
                    String fConeStr1 = fCone1.getText().toString();
                    String fConeStr2 = fCone2.getText().toString();
                    var1 = Double.parseDouble(fConeStr1);
                    var2 = Double.parseDouble(fConeStr2);
                    ans = Math.PI*(var2*var2)*var1/3;
                    coneResult.setText("" + ans);
                }
                break;
            case R.id.btnCylinder:
                if (fCyl1.getText().toString().equals("") || fCyl2.getText().toString().equals("")) {

                } else {
                    String fCylStr1 = fCyl1.getText().toString();
                    String fCylStr2 = fCyl2.getText().toString();
                    var1 = Double.parseDouble(fCylStr1);
                    var2 = Double.parseDouble(fCylStr2);
                    ans = Math.PI*(var1*var1)*var2;
                    cylResult.setText("" + ans);
                }
                break;
            case R.id.btnSphr:
                if (fSphr1.getText().toString().equals("")) {

                } else {
                    String fSphrStr1 = fSphr1.getText().toString();
                    var1 = Double.parseDouble(fSphrStr1);
                    ans = (4.0/3.0)*Math.PI*(Math.pow(var1, 3));
                    sphrResult.setText("" + ans);
                }
                break;
        }
    }
}
