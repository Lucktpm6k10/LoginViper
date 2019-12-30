package com.example.loginviper.Contract.Login;

import com.example.loginviper.Enity.User;

public interface LoginContractsInteractorOutput {
     void onAuthUserSuccess(User mUser);
     void onAuthUserFail(String mMessage);
}
