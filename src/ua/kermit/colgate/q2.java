package ua.kermit.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class q2 extends Activity
{

    boolean q1_prs;
    boolean q2_prs;
    boolean q3_prs;
    boolean q4_prs;
    boolean q5_prs;
    boolean q6_prs;
    boolean q7_prs;
    boolean q8_prs;
    String str_q1;
    String str_q11;
    String str_q2;

    public q2()
    {
        q1_prs = false;
        q2_prs = false;
        q3_prs = false;
        q4_prs = false;
        q5_prs = false;
        q6_prs = false;
        q7_prs = false;
        q8_prs = false;
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
        setContentView(0x7f030005);
        Bundle extras = getIntent().getExtras();
        str_q1 = extras.getString("q1");
        str_q11 = extras.getString("q11");
        final TextView button_q1 = (TextView)findViewById(R.id.textView_q21);
        button_q1.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                q1_prs = !q1_prs;
                if (q1_prs)
                {
                    button_q1.setBackgroundResource(R.drawable.right_mark);
                    return;
                } else
                {
                    button_q1.setBackgroundResource(R.drawable.right_unmark);
                    return;
                }
            }

            
        });
        final TextView button_q2 = (TextView)findViewById(0x7f050027);
        button_q2.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                q2_prs = !q2_prs;
                if (q2_prs)
                {
                    button_q2.setBackgroundResource(R.drawable.left_mark);
                    return;
                } else
                {
                    button_q2.setBackgroundResource(R.drawable.left_unmark);
                    return;
                }
            }

            
        });
        final TextView button_q3 = (TextView)findViewById(0x7f050023);
        button_q3.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                q3_prs = !q3_prs;
                if (q3_prs)
                {
                    button_q3.setBackgroundResource(R.drawable.right_mark);
                    return;
                } else
                {
                    button_q3.setBackgroundResource(R.drawable.right_unmark);
                    return;
                }
            }
            
        });
        final TextView button_q4 = (TextView)findViewById(0x7f050028);
        button_q4.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                q4_prs = !q4_prs;
                if (q4_prs)
                {
                    button_q4.setBackgroundResource(R.drawable.left_mark);
                    return;
                } else
                {
                    button_q4.setBackgroundResource(R.drawable.left_unmark);
                    return;
                }
            }

            
        });
        final TextView button_q5 = (TextView)findViewById(0x7f050024);
        button_q5.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                q5_prs = !q5_prs;
                if (q5_prs)
                {
                    button_q5.setBackgroundResource(R.drawable.right_mark);
                    return;
                } else
                {
                    button_q5.setBackgroundResource(R.drawable.right_unmark);
                    return;
                }
            }

            
        });
        final TextView button_q6 = (TextView)findViewById(0x7f050029);
        button_q6.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                q6_prs = !q6_prs;
                if (q6_prs)
                {
                    button_q6.setBackgroundResource(R.drawable.left_mark);
                    return;
                } else
                {
                    button_q6.setBackgroundResource(R.drawable.left_unmark);
                    return;
                }
            }

            
        });
        final TextView button_q7 = (TextView)findViewById(0x7f050025);
        button_q7.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                q7_prs = !q7_prs;
                if (q7_prs)
                {
                    button_q7.setBackgroundResource(R.drawable.right_mark);
                    return;
                } else
                {
                    button_q7.setBackgroundResource(R.drawable.right_unmark);
                    return;
                }
            }

            
        });
        final TextView button_q8 = (TextView)findViewById(0x7f05002a);
        button_q8.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                q8_prs = !q8_prs;
                if (q8_prs)
                {
                    button_q8.setBackgroundResource(R.drawable.left_mark);
                    return;
                } else
                {
                    button_q8.setBackgroundResource(R.drawable.left_unmark);
                    return;
                }
            }

            
        });
        ((TextView)findViewById(0x7f05002d)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(q2.this, q3.class);
                intent.putExtra("q1", str_q1);
                intent.putExtra("q11", str_q11);
                str_q2 = "";
                if (q1_prs)
                {
                    str_q2.concat("1");
                }
                if (q2_prs)
                {
                    str_q2.concat("5");
                }
                if (q3_prs)
                {
                    str_q2.concat("2");
                }
                if (q4_prs)
                {
                    str_q2.concat("6");
                }
                if (q5_prs)
                {
                    str_q2.concat("3");
                }
                if (q6_prs)
                {
                    str_q2.concat("7");
                }
                if (q7_prs)
                {
                    str_q2.concat("4");
                }
                if (q8_prs)
                {
                    str_q2.concat("8");
                }
                intent.putExtra("q2", str_q2);
                startActivityForResult(intent, 1);
            }

            
        });
        ((TextView)findViewById(0x7f05002b)).setOnClickListener(new android.view.View.OnClickListener() {

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
