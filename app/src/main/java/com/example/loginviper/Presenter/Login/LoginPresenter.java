package com.example.loginviper.Presenter.Login;

import com.example.loginviper.Contract.Login.LoginContractsInteractorInput;
import com.example.loginviper.Contract.Login.LoginContractsInteractorOutput;
import com.example.loginviper.Contract.Login.LoginContractsPresenter;
import com.example.loginviper.Enity.User;
import com.example.loginviper.Interactor.Login.LoginInteractor;
import com.example.loginviper.Routing.Login.LoginRouter;
import com.example.loginviper.View.LoginActivity;

public class LoginPresenter implements LoginContractsPresenter, LoginContractsInteractorOutput {
    LoginActivity mLoginActivity;
    LoginRouter mLoginRouter;

    LoginInteractor loginInteractor = new LoginInteractor(this);

    public LoginPresenter(LoginActivity mLoginActivity) {
        this.mLoginActivity = mLoginActivity;
        mLoginRouter = new LoginRouter(this.mLoginActivity);
    }

    @Override
    public void onAuthUserSuccess(User mUser) {
        mLoginRouter.goToHomeScreen(mUser);
    }

    @Override
    public void onAuthUserFail(String mMessage) {
        mLoginActivity.showError("Failled");
    }

    @Override
    public void vailidateUser(String userName, String passWord) {
        if (userName.isEmpty() || passWord.isEmpty()) {
            mLoginActivity.showError("Failed");
        } else {
            User mUser = new User(userName, passWord);
            loginInteractor.authUser(mUser);
        }
    }

    @Override
    public void onDestroy() {
        loginInteractor.onDestroy();
        mLoginRouter.onDestroy();
        mLoginRouter = null;
        loginInteractor = null;
    }
}
