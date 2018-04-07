package com.project.ase.loginapp;

import android.content.Intent;
        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;

public class lostpassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword_fragment);

    }

    public void sendlostpassword(android.view.View v){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "amulya.k116@gmail.com" });
        intent.putExtra(Intent.EXTRA_SUBJECT, "reset your password here");
        startActivity(Intent.createChooser(intent, ""));
    }

}
