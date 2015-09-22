package ua.kermit.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Colgate2012 extends Activity
{


    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030002);
        ((TextView)findViewById(0x7f05000a)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(Colgate2012.this, q1.class);
                startActivityForResult(intent, 1);
            }

            
        });
        ((TextView)findViewById(0x7f050009)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
            }

            
        });
    }
}
