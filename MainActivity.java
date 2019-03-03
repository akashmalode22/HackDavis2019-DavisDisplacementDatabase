package com.example.databaseinput;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    Button generateButton;
    Button resetButton;
    EditText nameInput;
    EditText addressInput;
    EditText descriptionInput;
    EditText linkInput;
    EditText phoneInput;
    CheckBox dayshelter;
    CheckBox nightShelter;
    CheckBox meals;
    CheckBox clothing;
    CheckBox medicalmentalhealth;
    CheckBox crisisintervention;
    CheckBox legalhelp;
    CheckBox hivaids;
    CheckBox men;
    CheckBox women;
    CheckBox family;
    CheckBox youth;
    CheckBox seniors;
    CheckBox hivpatients;
    CheckBox disabilities;
    CheckBox veterans;
    CheckBox miscellaneous;


    int checkbox1=0, checkbox2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateButton = (Button) findViewById(R.id.generateButton);
        resetButton = (Button) findViewById(R.id.resetButton);

        nameInput = (EditText) findViewById(R.id.nameInput);
        addressInput = (EditText) findViewById(R.id.addressInput);
        descriptionInput = (EditText) findViewById(R.id.descriptionInput);
        linkInput = (EditText) findViewById(R.id.linkInput);
        phoneInput = (EditText) findViewById(R.id.phoneInput);

        dayshelter = (CheckBox) findViewById(R.id.dayshelter) ;
        nightShelter = (CheckBox) findViewById(R.id.nightshelter) ;
        meals = (CheckBox) findViewById(R.id.meals) ;
        clothing = (CheckBox) findViewById(R.id.clothing) ;
        medicalmentalhealth = (CheckBox) findViewById(R.id.medicalmentalhealth) ;
        crisisintervention = (CheckBox) findViewById(R.id.crisisintervention) ;
        legalhelp = (CheckBox) findViewById(R.id.legalhelp) ;
        hivaids = (CheckBox) findViewById(R.id.hivaids) ;

        men = (CheckBox) findViewById(R.id.men) ;
        women = (CheckBox) findViewById(R.id.women) ;
        family = (CheckBox) findViewById(R.id.family) ;
        youth = (CheckBox) findViewById(R.id.youth) ;
        seniors = (CheckBox) findViewById(R.id.seniors) ;
        disabilities = (CheckBox) findViewById(R.id.disabilities) ;
        veterans = (CheckBox) findViewById(R.id.veterans) ;
        hivpatients = (CheckBox) findViewById(R.id.hivpatients);
        miscellaneous = (CheckBox) findViewById(R.id.misc);






        generateButton.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                if (dayshelter.isChecked()) {
                    checkbox1 = checkbox1 | (1 << 1);
                }
                if (nightShelter.isChecked()) {
                    checkbox1 = checkbox1 | (1 << 2);
                }
                if (meals.isChecked()) {
                    checkbox1 = checkbox1 | (1 << 3);
                }
                if (clothing.isChecked()) {
                    checkbox1 = checkbox1 | (1 << 4);
                }
                if (medicalmentalhealth.isChecked()) {
                    checkbox1 = checkbox1 | (1 << 5);
                }
                if (crisisintervention.isChecked()) {
                    checkbox1 = checkbox1 | (1 << 6);
                }
                if (legalhelp.isChecked()) {
                    checkbox1 = checkbox1 | (1 << 7);
                }
                if (hivaids.isChecked()) {
                    checkbox1 = checkbox1 | (1 << 8);
                }

                System.out.println("BinaryRep --> " + Integer.toBinaryString(checkbox1));
                System.out.println("ToInteger --> " + checkbox1/2);

                if (men.isChecked()) {
                    checkbox2 = checkbox2 | (1 << 1);
                }
                if (women.isChecked()) {
                    checkbox2 = checkbox2 | (1 << 2);
                }
                if (family.isChecked()) {
                    checkbox2 = checkbox2 | (1 << 3);
                }
                if (youth.isChecked()) {
                    checkbox2 = checkbox2 | (1 << 4);
                }
                if (seniors.isChecked()) {
                    checkbox2 = checkbox2 | (1 << 5);
                }
                if (hivpatients.isChecked()) {
                    checkbox2 = checkbox2 | (1 << 6);
                }
                if (disabilities.isChecked()) {
                    checkbox2 = checkbox2 | (1 << 7);
                }
                if (veterans.isChecked()) {
                    checkbox2 = checkbox2 | (1 << 8);
                }
                if (miscellaneous.isChecked()) {
                    checkbox2 = checkbox2 | (1 << 9);
                }


                System.out.println("BinaryRep --> " + Integer.toBinaryString(checkbox2));
                System.out.println("ToInteger --> " + checkbox2/2);

                // INSERT INTO ResourceList VALUES ( “name”, 2, “2210 4th ave W”, filters, “dasndi”)

                System.out.println("INSERT INTO ResourceList VALUES (\"" +  nameInput.getText() + "\", " + checkbox1/2 + ", \"" + addressInput.getText() + "\", " + checkbox2/2 + ", \"" + descriptionInput.getText() + "\", \"" + linkInput.getText() + "\", \"" + phoneInput.getText() + "\");") ;



            }
        });



        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameInput.getText().clear();
                addressInput.getText().clear();
                descriptionInput.getText().clear();
                linkInput.getText().clear();
                phoneInput.getText().clear();
                checkbox1 = 0;
                checkbox2 = 0;

                dayshelter.setChecked(false);
                nightShelter.setChecked(false);
                meals.setChecked(false);
                clothing.setChecked(false);
                medicalmentalhealth.setChecked(false);
                crisisintervention.setChecked(false);
                legalhelp.setChecked(false);
                hivaids.setChecked(false);

                men.setChecked(false);
                women.setChecked(false);
                family.setChecked(false);
                youth.setChecked(false);
                seniors.setChecked(false);
                disabilities.setChecked(false);
                veterans.setChecked(false);
                hivpatients.setChecked(false);
                miscellaneous.setChecked(false);

            }
        });




    }



}
