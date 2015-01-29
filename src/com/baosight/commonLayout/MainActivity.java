package com.baosight.commonLayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	ImageView imageView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test_frame);
		imageView = (ImageView)findViewById(R.id.iv_bfq);
	}


	public void play(View v){
		imageView.setVisibility(View.INVISIBLE);
	}
	
	public void stop(View v){
		imageView.setVisibility(View.VISIBLE);
	}
	
}
