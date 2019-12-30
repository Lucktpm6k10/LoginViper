package com.example.loginviper.Contract.Main;

import com.example.loginviper.Enity.User;

public interface MainContractsInteractorOutput {
   void onUsserFetched(User user);
   void onGetUserFailed(String mMesseage);
}
