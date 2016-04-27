package com.example.robert.pruebaintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void callIntent(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.Button01:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://udo.edu.ve"));
                startActivity(intent);
                break;
            case R.id.Button02:
                intent = new Intent(Intent.ACTION_CALL,
                        Uri.parse("tel:*5"));
                startActivity(intent);
                break;
            case R.id.Button03:
                intent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:*5"));
                startActivity(intent);
                break;
            case R.id.Button04:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0.0?q=Cumana"));
                startActivity(intent);
                break;
            case R.id.Button05:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0.0?q=UDO SUCRE"));
                startActivity(intent);
                break;
            case R.id.Button06:
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivityForResult(intent, 0);
                break;
            case R.id.Button07:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("content://contacts/people/"));
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
