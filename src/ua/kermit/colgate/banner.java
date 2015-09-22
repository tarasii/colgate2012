package ua.kermit.colgate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class banner extends Activity
{

    public banner()
    {
    }

    void AnyClick()
    {
        Intent intent = new Intent();
        intent.putExtra("res", "main");
        setResult(-1, intent);
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030000);
        ((TextView)findViewById(0x7f050002)).setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                AnyClick();
            }

            
        });
        ((TextView)findViewById(0x7f050001)).setOnClickListener(new android.view.View.OnClickListener() {


            public void onClick(View view)
            {
                AnyClick();
            }

            
        });
    }
}
