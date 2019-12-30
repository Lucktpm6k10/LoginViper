package com.example.loginviper.Contract.Login;

import android.content.Intent;

import com.example.loginviper.Enity.User;

public interface LoginContractsView {
    void showError(String mMessage);

    void showLoading();

    void dismissLoading();
}
