package com.example.android.appportfilo;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("My App Portfilo");
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

    public void pushSpotifyStreamer(View view)
    {
        Toast toast = createToast("This button will launch spotify streamer app");
        toast.show();
    }

    public void pushScoresApp(View view)
    {
        Toast toast = createToast("This button will launch scores app");
        toast.show();
    }

    public void pushLibraryApp(View view)
    {
        Toast toast = createToast("This button will launch library app");
        toast.show();
    }

    public void pushBuildIt(View view)
    {
        Toast toast = createToast("This button will launch build it bigger app");
        toast.show();
    }

    public void pushXYZ(View view)
    {
        Toast toast = createToast("This button will launch xyz reader app");
        toast.show();
    }

    public void pushCapstone(View view)
    {
        Toast toast = createToast("This button will launch my capstone app");
        toast.show();
    }

    private Toast createToast(String msg)
    {
        Context context = getApplicationContext();
        CharSequence text = msg;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 50);
        return toast;
        //toast.show();
    }
}
