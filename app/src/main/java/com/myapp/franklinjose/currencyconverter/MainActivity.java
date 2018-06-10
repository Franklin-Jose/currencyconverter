package com.myapp.franklinjose.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public void submit(View view)
{
    EditText name1=(EditText) findViewById(R.id.name);
    EditText pass1=(EditText) findViewById(R.id.pass);
    EditText dollaramt=(EditText) findViewById(R.id.dollaramt);
    // String rupeeamt=dollaramt.getText().toString()*60;
    double damt=Double.parseDouble(dollaramt.getText().toString());
    double ramt=damt*60;
    String rupeeamt=String.format("%.2f",ramt);
    Log.i("Hello",  ""+name1);
   if(pass1.getText().toString().equals("jesus")==true)
    {
        ImageView image=(ImageView) findViewById(R.id.dollar) ;
        image.setImageResource(R.drawable.rupees);
        Toast.makeText(this , "$"+dollaramt.getText().toString()+" is "+ "Rs."+rupeeamt,Toast.LENGTH_LONG).show();
   }
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
