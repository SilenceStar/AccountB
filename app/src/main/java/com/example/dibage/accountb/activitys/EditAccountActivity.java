package com.example.dibage.accountb.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.dibage.accountb.R;

public class EditAccountActivity extends AppCompatActivity {


    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_account);
        initFBI();
        initData();
        initView();
        initEvent();
    }

    private void initEvent() {
    }

    private void initView() {

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("修改账号");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditAccountActivity.this.finish();
            }
        });

    }

    private void initData() {
    }

    private void initFBI() {
        toolbar = findViewById(R.id.toolbar);
    }
}
