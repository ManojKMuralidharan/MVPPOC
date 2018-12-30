package practice.manu.mvppoc.main;

import android.view.View;

/**
 * Defines the contract between the view {@link MainActivity} and the presenter {@link MainPresenter}
 */
public interface MainContract {
    interface MvpView{
        void showSignInScreen();

        void showSignUpScreen();
    }
    interface Presenter{
        void handleSignInButtonClick(View view);

        void handleSignUpButtonClick(View view);
    }
}
