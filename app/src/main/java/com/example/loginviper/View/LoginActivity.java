package com.example.loginviper.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loginviper.Contract.Login.LoginContractsView;
import com.example.loginviper.Presenter.Login.LoginPresenter;
import com.example.loginviper.R;

public class LoginActivity extends AppCompatActivity implements LoginContractsView {
    EditText mTVUserName,mTVPassword;
    Button mBtnLogin;
    LoginPresenter mLoginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initListener();
    }

    private void initListener() {
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginButtonClicked();
            }
        });
    }

    private void initView() {
        mTVUserName = findViewById(R.id.tv_UserName);
        mTVPassword = findViewById(R.id.tv_PassWord);
        mBtnLogin = findViewById(R.id.btn_Login);
        mLoginPresenter = new LoginPresenter(this);
    }

    @Override
    public void showError(String mMessage) {
        Toast.makeText(this, "Login " + mMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    private void LoginButtonClicked(){
        mLoginPresenter.vailidateUser(mTVUserName.getText().toString(), mTVPassword.getText().toString());
    }
}
