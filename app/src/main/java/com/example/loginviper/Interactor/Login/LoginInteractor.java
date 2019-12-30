package com.example.loginviper.Interactor.Login;

import com.example.loginviper.Contract.Login.LoginContractsInteractorInput;
import com.example.loginviper.Contract.Login.LoginContractsInteractorOutput;
import com.example.loginviper.Enity.User;

public class LoginInteractor implements LoginContractsInteractorInput {
    LoginContractsInteractorOutput output;

    public LoginInteractor(LoginContractsInteractorOutput output) {
        this.output = output;
    }

    @Override
    public void onDestroy() {
        output = null;
    }

    @Override
    public void authUser(User mUser) {
        if (mUser.getmUserName().equals("Android") && mUser.getmPassWord().equals("1111")) {
            output.onAuthUserSuccess(mUser);
        } else {
            output.onAuthUserFail("Failed");
        }
    }


    public LoginContractsInteractorOutput getOutput() {
        return output;
    }

    public void setOutput(LoginContractsInteractorOutput output) {
        this.output = output;
    }
}
