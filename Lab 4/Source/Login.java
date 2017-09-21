package com.example.navya.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button contact =(Button)findViewById(R.id.button2);
        contact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent act1 = new Intent(view.getContext(), SignupActivity.class);
                startActivity(act1);
    }
});
        final Button msg =(Button)findViewById(R.id.button);
        msg.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view2)
            {
                Intent act2 = new Intent(view2.getContext(), Home.class);
                startActivity(act2);

            }
        });
    }
}
