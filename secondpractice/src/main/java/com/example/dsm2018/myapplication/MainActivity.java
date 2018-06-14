package com.example.dsm2018.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends Activity {
    @Override

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");
        tabSpecSong.setContent(R.id.tabSong);
        tabHost.addTab(tabSpecSong);

        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("가수별");
        tabSpecSong.setContent(R.id.tabArtist);
        tabHost.addTab(tabSpecArtist);

        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("ARTIST").setIndicator("앨범별");
        tabSpecSong.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpecArtist);

        tabHost.setCurrentTab(0);
    }
}