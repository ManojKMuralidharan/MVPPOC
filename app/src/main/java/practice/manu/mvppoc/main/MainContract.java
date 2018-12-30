package practice.manu.mvppoc.main;

/**
 * Defines the contract between the view {@link MainActivity} and the presenter {@link MainPresenter}
 */
public interface MainContract {
    interface MvpView{
        void showSignInScreen();

        void showSignUpScreen();
    }
    interface Presenter{
        void handleSignInButtonClick();

        void handleSignUpButtonClick();
    }
}
