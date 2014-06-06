package com.polatic.polaticvideoplayer.ui;

import com.polatic.polaticvideoplayer.R;
import com.polatic.polaticvideoplayer.local.VideoLocalActivity;
import com.polatic.polaticvideoplayer.streaming.StreamViewActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PolaticVideoPlayerActivity extends Activity implements OnClickListener{
	private Button mBtnLocal;
	private Button mBtnStream;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_layout);
		initView();
		setListener();		
	}

	private void setListener() {
		mBtnLocal.setOnClickListener(this);
		mBtnStream.setOnClickListener(this);
	}

	private void initView() {
		mBtnLocal = (Button) findViewById(R.id.btnLocal);
		mBtnStream = (Button) findViewById(R.id.btnStream);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnLocal:
			startActivity(new Intent(this, VideoLocalActivity.class));
			break;
		case R.id.btnStream :
			startActivity(new Intent(this, StreamViewActivity.class));
			break;
		default:
			break;
		}
	}
}
