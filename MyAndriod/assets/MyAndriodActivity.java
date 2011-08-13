package com.adnroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MyAndriodActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        init();
    }
    public void init(){
    	btn =(Button)this.findViewById(R.id.btn1);
        btn.setText("xx");
    }
    
    public Button btn;
}