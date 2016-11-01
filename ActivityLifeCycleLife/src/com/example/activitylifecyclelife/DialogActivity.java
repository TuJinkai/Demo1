package com.example.activitylifecyclelife;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class DialogActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.normal_layout);
	}
}
