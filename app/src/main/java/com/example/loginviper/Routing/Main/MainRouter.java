package com.example.loginviper.Routing.Main;

import com.example.loginviper.Contract.Main.MainContractsRouting;
import com.example.loginviper.View.MainActivity;

public class MainRouter implements MainContractsRouting {
    MainActivity mMainActivity = new MainActivity();

    @Override
    public void onDestroy() {
        mMainActivity = null;
    }

}
