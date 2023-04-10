package com.example.mcoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    String[] Role = {"Tutor", "Head Tutor", "Parent", "Learner", "Management"};
    int[] Grade = {0 ,1, 2, 3 , 4, 5, 6, 7};
    String[] Gender = {"Male", "Female"};

    AutoCompleteTextView ARole;
    AutoCompleteTextView AGender;
    AutoCompleteTextView AGrade;

    ArrayAdapter<String> adapterItems;
    ArrayAdapter<Integer> adapterItems2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ARole = findViewById(R.id.RoleSelector);
        AGender = findViewById(R.id.GenderSelector);
        AGrade = findViewById(R.id.GradeSelector);

        adapterItems = new ArrayAdapter<>(this, R.layout.activity_sign_up);
        adapterItems2 = new ArrayAdapter<>(this, R.layout.activity_sign_up);

        ARole.setAdapter(adapterItems);
        AGender.setAdapter(adapterItems);
        AGrade.setAdapter(adapterItems2);

        ARole.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(), "Item: " + item, Toast.LENGTH_SHORT).show();
            }
        });
    }
}