package org.yooranchen.test;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import org.yooranchen.test.view.FlowLayout;


public class MainActivity extends ActionBarActivity {

    private String[] mValues = new String[]{
            "Hello", "Welcome", "Ios", "Linux", "Welcome", "Welcome",
            "Hello", "Welcome", "Ios", "Linux",
            "Hello", "Welcome", "Ios", "Linux", "Welcome",
            "Hello", "Welcome", "Ios", "Linux", "Welcome",
            "Hello", "Welcome", "Ios", "Linux", "Welcome"
    };
    private FlowLayout mFlowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlowLayout = (FlowLayout) findViewById(R.id.flowLayout);
        initFlow();
    }

    private void initFlow() {
//        for (int i = 0; i < mValues.length; i++) {
//            Button button = new Button(this);
//            button.setText(mValues[i]);
//            ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.WRAP_CONTENT,
//                    ViewGroup.MarginLayoutParams.WRAP_CONTENT);
//            mFlowLayout.addView(button, lp);
//        }

        for (int i = 0; i < mValues.length; i++) {
            TextView textView = (TextView) getLayoutInflater().inflate(R.layout.tv, mFlowLayout, false);
            textView.setText(mValues[i]);
            textView.setTextColor(Color.WHITE);
            mFlowLayout.addView(textView);
        }
    }
}
