package ua.kermit.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class details extends Activity
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
        
        setContentView(R.layout.details);
        
        Bundle extras = getIntent().getExtras();
        str_q1 = extras.getString("q1");
        str_q11 = extras.getString("q11");
        str_q2 = extras.getString("q2");
        str_q3 = extras.getString("q3");
        
        i = 0x7f02000b;
        
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
        LinearLayout imgFavorite = (LinearLayout) findViewById(0x7f050003);
        if (flag || !str_q3.contains("4")) 
        {        	
            if (!flag && str_q3.contains("1") && str_q1.equals("3"))
            {
                i = 0x7f020018;
            } else
            if (!flag && str_q3.contains("2") && str_q1.equals("3"))
            {
                i = 0x7f020009;
            } else
            if (flag3)
            {
                i = 0x7f02000d;
            } else
            if (flag1 && !str_q1.equals("3"))
            {
                if (str_q3.contains("4"))
                {
                    i = 0x7f02000d;
                } else
                {
                    i = 0x7f020018;
                }
            } else
            if (flag1 && str_q1.equals("3"))
            {
                i = 0x7f020018;
            } else
            if (flag2)
            {
                i = 0x7f02001a;
            }
        } 
        else 
        {
	        if (str_q1.equals("1"))
	        {
	            i = 0x7f020001;
	        }
	        if (str_q1.equals("2"))
	        {
	            i = 0x7f020003;
	        }
	        if (str_q1.equals("3"))
	        {
	            if (str_q11.equals("1"))
	            {
	                i = 0x7f020011;
	            } else
	            if (str_q11.equals("2"))
	            {
	                i = 0x7f020016;
	            } else
	            {
	                i = 0x7f020009;
	            }
	        }
	        if (str_q1.equals("4"))
	        {
	            i = 0x7f020005;
	        }
	        if (str_q1.equals("5"))
	        {
	            i = 0x7f020007;
	        }
	        if (str_q1.equals("6"))
	        {
	            i = 0x7f02000b;
	        }
	        if (str_q1.equals("7"))
	        {
	            i = 0x7f02000d;
	        }
	        if (str_q1.equals("8"))
	        {
	            i = 0x7f02000f;
	        }
        }
	    imgFavorite.setBackgroundResource(i);
        ((TextView)findViewById(0x7f050006)).setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.putExtra("res", "prev");
                setResult(-1, intent);
                finish();
            }

        });
        ((TextView)findViewById(0x7f050008)).setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(details.this, banner.class);
                startActivityForResult(intent, 1);
            }

        });
        return;
    }
}
