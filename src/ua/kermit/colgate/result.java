package ua.kermit.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class result extends Activity
{

    String str_q1;
    String str_q11;
    String str_q2;
    String str_q3;


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
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.result);
        
        
        Bundle extras = getIntent().getExtras();
        str_q1 = extras.getString("q1");
        str_q11 = extras.getString("q11");
        str_q2 = extras.getString("q2");
        str_q3 = extras.getString("q3");
        
        i = R.drawable.f_05_progum; //0x7f02000a;
        LinearLayout imgFavorite = (LinearLayout) findViewById(R.id.backImg);
		imgFavorite.setBackgroundResource(i);
        
        flag1 = str_q2.contains("4");
        flag2 = str_q2.contains("5");
        flag3 = str_q2.contains("8");
        
        if (!flag1 && !flag2 && !flag3)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        
        
        if (flag || !str_q3.contains("4")) 
        {
            if (!flag && str_q3.contains("1") && str_q1.equals("3"))
            {
                i = 0x7f020017;
            } else
            if (!flag && str_q3.contains("2") && str_q1.equals("3"))
            {
                i = 0x7f020008;
            } else
            if (flag3)
            {
                i = 0x7f02000c;
            } else
            if (flag1 && !str_q1.equals("3"))
            {
                if (str_q3.contains("4"))
                {
                    i = 0x7f02000c;
                } else
                {
                    i = 0x7f020017;
                }
            } else
            if (flag1 && str_q1.equals("3"))
            {
                i = 0x7f020017;
            } else
            if (flag2)
            {
                i = 0x7f020019;
            }
        }       
        else 
        {
	        if (str_q1.equals("1"))
	        {
	            i = 0x7f020000;
	        }
	        if (str_q1.equals("2"))
	        {
	            i = 0x7f020002;
	        }
	        if (str_q1.equals("3"))
	        {
	            if (str_q11.equals("1"))
	            {
	                i = 0x7f020010;
	            } else
	            if (str_q11.equals("2"))
	            {
	                i = 0x7f020015;
	            } else
	            {
	                i = 0x7f020008;
	            }
	        }
	        if (str_q1.equals("4"))
	        {
	            i = 0x7f020004;
	        }
	        if (str_q1.equals("5"))
	        {
	            i = 0x7f020006;
	        }
	        if (str_q1.equals("6"))
	        {
	            i = 0x7f02000a;
	        }
	        if (str_q1.equals("7"))
	        {
	            i = 0x7f02000c;
	        }
	        if (str_q1.equals("8"))
	        {
	            i = 0x7f02000e;
	        }
        }
        

		imgFavorite.setBackgroundResource(i);
        ((TextView)findViewById(0x7f050035)).setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.putExtra("res", "prev");
                setResult(-1, intent);
                finish();
            }

            
        });
        ((TextView)findViewById(0x7f050037)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(result.this, details.class);
                intent.putExtra("q1", str_q1);
                intent.putExtra("q11", str_q11);
                intent.putExtra("q2", str_q2);
                intent.putExtra("q3", str_q3);
                startActivityForResult(intent, 1);
            }

        });
        return;
    }
}
