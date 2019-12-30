package com.example.loginviper.Contract.Main;

import com.example.loginviper.Enity.User;

public interface MainContractsView {
    void showError(String mMesseage);
    void updateData(User user);
}
