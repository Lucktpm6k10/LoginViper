package com.example.loginviper.Contract.Login;

import com.example.loginviper.Enity.User;

public interface LoginContractsInteractorInput {
    void onDestroy();

    void authUser(User mUser);

}
