package ua.kermit.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class q3 extends Activity
{

    boolean q1_prsm;
    boolean q2_prsm;
    boolean q3_prsm;
    boolean q4_prsm;
    String str_q1;
    String str_q11;
    String str_q2;
    String str_q3;

    public q3()
    {
        q1_prsm = false;
        q2_prsm = false;
        q3_prsm = false;
        q4_prsm = false;
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

    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        setContentView(0x7f030006);
        
        Bundle extras = getIntent().getExtras();
        str_q1 = extras.getString("q1");
        str_q11 = extras.getString("q11");
        str_q2 = extras.getString("q2");
        final TextView button_q1 = (TextView)findViewById(0x7f05002e);
        final TextView button_q2 = (TextView)findViewById(0x7f05002f);
        final TextView button_q3 = (TextView)findViewById(0x7f050030);
        final TextView button_q4 = (TextView)findViewById(0x7f050031);
 
        button_q1.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                q1_prsm = !q1_prsm;
                if (q1_prsm)
                {
                    q4_prsm = false;
                    button_q1.setBackgroundResource(R.drawable.right_mark);
                    button_q4.setBackgroundResource(R.drawable.left_unmark);
                    return;
                } else
                {
                    button_q1.setBackgroundResource(R.drawable.right_unmark);
                    return;
                }
            }
        });
        
        button_q2.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                q2_prsm = !q2_prsm;
                if (q2_prsm)
                {
                    q4_prsm = false;
                    button_q2.setBackgroundResource(R.drawable.left_mark);
                    button_q4.setBackgroundResource(R.drawable.left_unmark);
                    return;
                } else
                {
                    button_q2.setBackgroundResource(R.drawable.left_unmark);
                    return;
                }
            }
        });
        
        button_q3.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                q3_prsm = !q3_prsm;
                if (q3_prsm)
                {
                    q4_prsm = false;
                    button_q3.setBackgroundResource(R.drawable.right_mark);
                    button_q4.setBackgroundResource(R.drawable.left_unmark);
                    return;
                } else
                {
                    button_q3.setBackgroundResource(R.drawable.right_unmark);
                    return;
                }
            }
        });
        
        button_q4.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                q4_prsm = !q4_prsm;
                if (q4_prsm)
                {
                    q1_prsm = false;
                    q2_prsm = false;
                    q3_prsm = false;
                    button_q4.setBackgroundResource(R.drawable.left_mark);
                    button_q3.setBackgroundResource(R.drawable.right_unmark);
                    button_q2.setBackgroundResource(R.drawable.left_unmark);
                    button_q1.setBackgroundResource(R.drawable.right_unmark);
                    return;
                } else
                {
                    button_q4.setBackgroundResource(R.drawable.left_unmark);
                    return;
                }
            }
        });
        
        ((TextView)findViewById(0x7f050033)).setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(q3.this, result.class);
                //intent.setClass(q3.this, q1.class);
                //intent.setClass(q3.this, details.class);
                intent.putExtra("q1", str_q1);
                intent.putExtra("q11", str_q11);
                str_q3 = "";
                if (q1_prsm)
                {
                    str_q3.concat("1");
                }
                if (q2_prsm)
                {
                    str_q3.concat("3");
                }
                if (q3_prsm)
                {
                    str_q3.concat("2");
                }
                if (q4_prsm)
                {
                    str_q3.concat("4");
                }
                if (str_q3.length() == 0)
                {
                    str_q3 = "4";
                }
                intent.putExtra("q2", str_q2);
                intent.putExtra("q3", str_q3);
                startActivityForResult(intent, 1);
            }
            
        });
        
        ((TextView)findViewById(0x7f050032)).setOnClickListener(new android.view.View.OnClickListener() {


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
