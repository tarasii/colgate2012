package ua.kermit.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class q11 extends Activity
{

    String str_q1;

    public q11()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (j == -1 && intent.getStringExtra("res").equals("main"))
        {
            intent = new Intent();
            intent.putExtra("res", "main");
            setResult(-1, intent);
            finish();
        }
    }

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        setContentView(0x7f030004);
        
        str_q1 = getIntent().getExtras().getString("q1");
        TextView textview2  = (TextView)findViewById(0x7f05001a);
        TextView textview = (TextView)findViewById(0x7f05001b);
        TextView textview1 = (TextView)findViewById(0x7f05001c);
        textview2.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
            	Intent intent = new Intent();
            	intent.setClass(q11.this, q2.class);
            	intent.putExtra("q1", str_q1);
            	intent.putExtra("q11", "1");
                startActivityForResult(intent, 1);
            }

        });
        textview.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
            	Intent intent = new Intent();
            	intent.setClass(q11.this, q2.class);
            	intent.putExtra("q1", str_q1);
            	intent.putExtra("q11", "2");
                startActivityForResult(intent, 1);
            }

        });
        textview1.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(q11.this, q2.class);
                intent.putExtra("q1", str_q1);
                intent.putExtra("q11", "3");
                startActivityForResult(intent, 1);
            }
           
        });
        ((TextView)findViewById(0x7f05001d)).setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
            	Intent intent = new Intent();
            	intent.putExtra("res", "prev");
                setResult(-1, intent);
                finish();
            }

        });
    }
}
