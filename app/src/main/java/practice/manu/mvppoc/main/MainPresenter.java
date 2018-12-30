package practice.manu.mvppoc.main;

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
    public void handleSignInButtonClick() {
        mvpView.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick() {
        mvpView.showSignUpScreen();
    }
}
