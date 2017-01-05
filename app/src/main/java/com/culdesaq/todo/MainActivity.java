package com.culdesaq.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements BaseView<TodoPresenter> {

    private TodoPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {

    }

    public void setPresenter(TodoPresenter presenter) {
        mPresenter = presenter;
    }
}
