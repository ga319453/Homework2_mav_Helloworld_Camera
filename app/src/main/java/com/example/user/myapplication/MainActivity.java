package com.example.user.myapplication;

import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageView;
import android.net.Uri;
import java.io.File;
import android.provider.MediaStore;


public class MainActivity extends Nav {
    //
    //宣告

    Button button;
    ImageView imageView;
    static final int CAM__REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

    }

}
