package com.example.loginviper.Routing.Login;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginviper.Contract.Login.LoginContractsRouting;
import com.example.loginviper.Enity.User;
import com.example.loginviper.View.LoginActivity;
import com.example.loginviper.View.MainActivity;

public class LoginRouter implements LoginContractsRouting {
    LoginActivity mActivity;

    public LoginRouter(LoginActivity mActivity) {
        this.mActivity = mActivity;

    }

    @Override
    public void goToHomeScreen(User user) {
        if(mActivity != null){
            Intent intent = new Intent(mActivity, MainActivity.class);
            mActivity.startActivity(intent);
        }
    }

    @Override
    public void onDestroy() {
        mActivity = null;
    }
}
