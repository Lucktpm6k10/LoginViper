package com.example.loginviper.Contract.Login;

public interface LoginContractsPresenter {
    void vailidateUser(String userName, String passWord);

    void onDestroy();
}
