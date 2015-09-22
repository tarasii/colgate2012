package ua.kermit.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class q1 extends Activity
{


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

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030003);
        ((TextView)findViewById(R.id.textView_05)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(q1.this, q2.class);
                intent.putExtra("q1", "1");
                intent.putExtra("q11", "0");
                startActivityForResult(intent, 1);
            }

            
        });
        ((TextView)findViewById(R.id.textView_10)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
            	Intent intent = new Intent();
            	intent.setClass(q1.this, q2.class);
            	intent.putExtra("q1", "2");
            	intent.putExtra("q11", "0");
                startActivityForResult(intent, 1);
            }

            
        });
        ((TextView)findViewById(R.id.textView_14)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
            	Intent intent = new Intent();
                intent.setClass(q1.this, q11.class);
                intent.putExtra("q1", "3");
                intent.putExtra("q11", "0");
                startActivityForResult(intent, 1);
            }

            
        });
        ((TextView)findViewById(R.id.textView_18)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(q1.this, q2.class);
                intent.putExtra("q1", "4");
                intent.putExtra("q11", "0");
                startActivityForResult(intent, 1);
            }

            
        });
        ((TextView)findViewById(R.id.textView_22)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(q1.this, q2.class);
                intent.putExtra("q1", "5");
                intent.putExtra("q11", "0");
                startActivityForResult(intent, 1);
            }

            
        });
        ((TextView)findViewById(R.id.textView_26)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
            	Intent intent = new Intent();
            	intent.setClass(q1.this, q2.class);
            	intent.putExtra("q1", "6");
            	intent.putExtra("q11", "0");
                startActivityForResult(intent, 1);
            }

            
        });
        ((TextView)findViewById(R.id.textView_30)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
            	Intent intent = new Intent();
            	intent.setClass(q1.this, q2.class);
            	intent.putExtra("q1", "7");
            	intent.putExtra("q11", "0");
                startActivityForResult(intent, 1);
            }

            
        });
        ((TextView)findViewById(R.id.textView_31)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(q1.this, q2.class);
                intent.putExtra("q1", "8");
                intent.putExtra("q11", "0");
                startActivityForResult(intent, 1);
            }

            
        });
        ((TextView)findViewById(R.id.textView_back_q1)).setOnClickListener(new android.view.View.OnClickListener() {


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
