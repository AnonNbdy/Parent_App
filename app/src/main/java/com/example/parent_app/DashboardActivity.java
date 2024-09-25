package com.example.parent_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class DashboardActivity extends AppCompatActivity {

    private TextView welcomeText;
    private Button viewAttendanceButton, reprintQrCodeButton;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_dashboard);

        welcomeText = findViewById(R.id.parentWelcomeText);
        viewAttendanceButton = findViewById(R.id.viewAttendanceButton);
        reprintQrCodeButton = findViewById(R.id.reprintQrCodeButton);

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();

        welcomeText.setText("Welcome, " + currentUser.getEmail());

        viewAttendanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, AttendanceActivity.class);
                startActivity(intent);
            }
        });

        reprintQrCodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, QrCodeActivity.class);
                startActivity(intent);
            }
        });
    }
}
