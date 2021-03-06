package in.ac.lnmiit.android.appointr.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import in.ac.lnmiit.android.appointr.Functions.AppStatus;
import in.ac.lnmiit.android.appointr.Functions.SessionManagement;
import in.ac.lnmiit.android.appointr.R;

public class login_home extends AppCompatActivity {

    SessionManagement session;
    Button btnFaculty,btnStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_home);


        if (AppStatus.getInstance(this).isOnline()) {
            session = new SessionManagement(getApplicationContext());
            if(session.isLoggedIn()){
                session.checkLogin();
                finish();
            }

        } else {

           Toast.makeText(this,"You are not online!!!!",Toast.LENGTH_LONG).show();
        }


        btnFaculty = (Button) findViewById(R.id.faculty);
        btnFaculty.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(login_home.this, Flogin.class);
                startActivity(intent);
                finish();
                // Do something in response to button click
            }
        });

        btnStudent = (Button) findViewById(R.id.student);
        btnStudent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(login_home.this, Slogin.class);
                startActivity(intent);
                finish();// Do something in response to button click
            }
        });
    }

}
