package com.fabianofranca.androidlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setupTheme();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupToolbar();
        setupFonts();
    }

    private void setupTheme() {
        //Remove splash theme

        setTheme(R.style.AppTheme);
    }

    private void setupToolbar() {
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
    }

    private void setupFonts() {
        //Ensures that the default font will always be the same

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }
}
