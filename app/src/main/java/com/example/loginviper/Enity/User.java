package com.example.loginviper.Enity;

public class User {
    private String mUserName;
    private String mPassWord;

    public User(String mUserName, String mPassWord) {
        this.mUserName = mUserName;
        this.mPassWord = mPassWord;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getmPassWord() {
        return mPassWord;
    }

    public void setmPassWord(String mPassWord) {
        this.mPassWord = mPassWord;
    }
}
