package com.example.loginviper.Contract.Login;

import com.example.loginviper.Enity.User;

public interface LoginContractsRouting {
    void goToHomeScreen(User user);
    void onDestroy();
}
