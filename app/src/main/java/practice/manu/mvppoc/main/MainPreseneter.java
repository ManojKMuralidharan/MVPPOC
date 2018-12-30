package practice.manu.mvppoc.main;

/**
 * Responsible for handling the actions from the view and updating the UI as required.
 */

public class MainPreseneter implements MainContract.Presenter {

    private MainContract.MvpView mvpView;

    MainPreseneter(MainContract.MvpView view){
        mvpView = view;
    }

}
