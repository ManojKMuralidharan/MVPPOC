package practice.manu.mvppoc.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import practice.manu.mvppoc.R;

/**
 * Displays the Main Screen
 */

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter(this);
    }

    ///// MvpView Methods /////
    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking user to the SignIn screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user to the SignUp screen", Toast.LENGTH_SHORT).show();
    }
}
