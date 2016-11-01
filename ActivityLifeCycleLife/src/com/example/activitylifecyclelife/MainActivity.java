package com.example.activitylifecyclelife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {
	
	public static final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		//初始化按钮事件
		Button startNormalActivity = (Button) findViewById(R.id.Start_normal_activity);
		Button startDialogActivity = (Button) findViewById(R.id.Start_dialog_activity);
		
		startNormalActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent = new Intent(MainActivity.this,NormalActivity.class);
				startActivity(intent);
			}
		});
		
		startDialogActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				Intent intent = new Intent(MainActivity.this,DialogActivity.class);
				startActivity(intent);		
			}
		});
	}

	@Override
	protected void onStart() {
		// TODO 自动生成的方法存根
		super.onStart();
		Log.d(TAG, "OnStart");
	}

	@Override
	protected void onResume() {
		// TODO 自动生成的方法存根
		super.onResume();
		Log.d(TAG, "onResume");
	}

	@Override
	protected void onPause() {
		// TODO 自动生成的方法存根
		super.onPause();
		Log.d(TAG, "onPause");
	}

	@Override
	protected void onStop() {
		// TODO 自动生成的方法存根
		super.onStop();
		Log.d(TAG, "onStop");
	}

	@Override
	protected void onRestart() {
		// TODO 自动生成的方法存根
		super.onRestart();
		Log.d(TAG, "onRestart");
	}

	@Override
	protected void onDestroy() {
		// TODO 自动生成的方法存根
		super.onDestroy();
		Log.d(TAG, "onDestroy");
	}


}
