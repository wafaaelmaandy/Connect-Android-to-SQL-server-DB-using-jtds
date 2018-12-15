package com.wafaaelm3andy.loaddatafromsqlserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView nameTV,accountNumberTV ;
    private final String ACCOUNT_NAME="ACCOUNT_NAME" ;
    private final String ACCOUNT_NUMBER="ACCOUNT_NUMBER" ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        nameTV=findViewById(R.id.name_TV);
        accountNumberTV=findViewById(R.id.accountNumber);
        int accountNumber=getIntent().getExtras().getInt(ACCOUNT_NUMBER);
        String accountName =getIntent().getExtras().getString(ACCOUNT_NAME);
                 nameTV.setText("Account Name   :"+accountName);
        accountNumberTV.setText("Account Number :"+accountNumber);


    }
}
