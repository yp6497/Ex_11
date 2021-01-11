package com.example.ex_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


    /**
     * @author Yulia Piavka <yp6497@bs.amalnet.k12.il>
     * @version 1.1
     * @since 12/1/2021
     * short description- the credits.
     */
    public class creditsActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_activitycredits);
        }

        /**
         * description- if "Main screen" selected: return back to the Main activity.
         */
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {

            String st = item.getTitle().toString();
            if (st.endsWith("Main screen")) {
                Intent si = new Intent(this, creditsActivity.class);
                startActivity(si);
            }
            return true;
        }
    }
