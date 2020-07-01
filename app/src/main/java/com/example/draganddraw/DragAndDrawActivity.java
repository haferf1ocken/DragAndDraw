package com.example.draganddraw;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.Objects;

public class DragAndDrawActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_fragment, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.clear_display:
                Fragment fragment = getSupportFragmentManager()
                        .findFragmentById(R.id.fragment_container);
                getSupportFragmentManager().beginTransaction()
                        .remove(fragment).commit();
                newFragment(null, getSupportFragmentManager());
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
