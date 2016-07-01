package com.qcxzuo.marqueeviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.qcxzuo.marqueeviewdemo.tools.MarqueeView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private MarqueeView marqueeView;
    private MarqueeView marqueeView1;
    private MarqueeView marqueeView2;
    private MarqueeView marqueeView3;
    private MarqueeView marqueeView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marqueeView = (MarqueeView) findViewById(R.id.marqueeView);
        marqueeView1 = (MarqueeView) findViewById(R.id.marqueeView1);
        marqueeView2 = (MarqueeView) findViewById(R.id.marqueeView2);
        marqueeView3 = (MarqueeView) findViewById(R.id.marqueeView3);
        marqueeView4 = (MarqueeView) findViewById(R.id.marqueeView4);

        List<String> info = new ArrayList<>();
        info.add("1. 大家好。");
        info.add("2. Android");
        info.add("3. Hello World");
        marqueeView.startWithList(info);

        marqueeView1.startWithText(getString(R.string.marquee_texts));
        marqueeView2.startWithText(getString(R.string.marquee_texts));
        marqueeView3.startWithText(getString(R.string.marquee_texts));
        marqueeView4.startWithText(getString(R.string.marquee_text));

        marqueeView.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, TextView textView) {
                Toast.makeText(getApplicationContext(), textView.getText() + "", Toast.LENGTH_SHORT).show();
            }
        });

        marqueeView1.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, TextView textView) {
                Toast.makeText(getApplicationContext(), String.valueOf(marqueeView1.getPosition()) + ". " + textView.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
