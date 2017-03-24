package com.example.rey.resume;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button workHistoryButton;
    Button callButton;
    Button emailButton;
    Button educationButton;

//    TODO:
//    1. Add listview to the xml
//    2. Add json file that generate the workhistory and education
//    3. Add pdf resume to download.
//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workHistoryButton = (Button) findViewById(R.id.workHistoryButton);
        educationButton = (Button) findViewById(R.id.educationButton);
        callButton = (Button) findViewById(R.id.callButton);
        emailButton = (Button) findViewById(R.id.emailButton);

        educationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToEducationActivity = new Intent(getApplicationContext(), EducationActivity.class);
                startActivity(goToEducationActivity);
            }
        });

        workHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToWorkHistoryActivity = new Intent(getApplicationContext(), WorkHistoryActivity.class);
                startActivity(goToWorkHistoryActivity);
            }
        });

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri myPhoneNumber = Uri.parse("tel:18018655626");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, myPhoneNumber);
                startActivity(callIntent);
            }
        });

        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"zonickblack@gmail.com"});
                startActivity(emailIntent);
            }
        });
    }
}
