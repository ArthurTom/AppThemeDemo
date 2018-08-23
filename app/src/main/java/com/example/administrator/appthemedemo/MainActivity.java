package com.example.administrator.appthemedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.appthemedemo.view.AppThemeColor;

/**
 *
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnOne = findViewById(R.id.btn_one);
		btnOne.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		Intent intent;
		switch (view.getId()) {
			case R.id.btn_one:
				intent = new Intent(this, AppThemeColor.class);
				startActivity(intent);
				break;
		}
	}
}
