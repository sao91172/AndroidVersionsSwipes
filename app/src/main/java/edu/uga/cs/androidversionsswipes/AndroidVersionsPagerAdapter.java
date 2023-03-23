package edu.uga.cs.androidversionsswipes;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AndroidVersionsPagerAdapter extends FragmentStateAdapter {
    public AndroidVersionsPagerAdapter( FragmentManager fragmentManager, Lifecycle lifecycle ) {
        super( fragmentManager, lifecycle );
    }

    @Override
    public Fragment createFragment(int position){
        return AndroidVersionFragment.newInstance( position );
    } // fragment

    /**
     * Letting android know when to stop
     * @return
     */
    @Override
    public int getItemCount() {
        return AndroidVersionFragment.getNumberOfVersions();
    } //getitemcount
}
