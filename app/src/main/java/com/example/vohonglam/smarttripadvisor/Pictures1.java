package com.example.vohonglam.smarttripadvisor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ViewFlipper;

/**
 * Created by VO HONG LAM on 03/08/2015.
 */
public class Pictures1 extends Activity {
    private ViewFlipper viewFlipper;
    private float lastX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pictures1);
        viewFlipper = (ViewFlipper) findViewById(R.id.view_flipper);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.return_main:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public boolean onTouchEvent(MotionEvent touchevent) {
        switch (touchevent.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                lastX = touchevent.getX();
                break;
            }
            case MotionEvent.ACTION_UP: {
                float currentX = touchevent.getX();

                if (lastX < currentX) {
                    if (viewFlipper.getDisplayedChild() == 0)
                        break;

                    viewFlipper.setInAnimation(this, R.anim.in_from_left);
                    viewFlipper.setOutAnimation(this, R.anim.out_to_right);
                    viewFlipper.showNext();
                }

                if (lastX > currentX) {
                    if (viewFlipper.getDisplayedChild() == 1)
                        break;
                    viewFlipper.setInAnimation(this, R.anim.in_from_right);
                    viewFlipper.setOutAnimation(this, R.anim.out_to_left);
                    viewFlipper.showPrevious();
                }
                break;
            }
        }
        return false;
    }

    public void Return1 (View View){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
