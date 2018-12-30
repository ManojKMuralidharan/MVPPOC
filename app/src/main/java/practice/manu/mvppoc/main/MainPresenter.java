package practice.manu.mvppoc.main;

import android.view.View;

/**
 * Responsible for handling the actions from the view and updating the UI as required.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.MvpView mvpView;

    MainPresenter(MainContract.MvpView view){
        mvpView = view;
    }

    ///// Presenter Methods /////
    @Override
    public void handleSignInButtonClick(View view) {
        mvpView.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick(View view) {
        mvpView.showSignUpScreen();
    }
}
