package practice.manu.mvppoc.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import practice.manu.mvppoc.R;

/**
 * Displays the Main Screen
 */

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    MainPreseneter mainPreseneter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPreseneter = new MainPreseneter(this);
    }
}
