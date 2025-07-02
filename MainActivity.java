package com.example.tablayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    BottomNavigationView btmNavBar;
    DrawerLayout drawer_layout;
    MaterialToolbar material_toolbar;
    NavigationView navigation_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        drawer_layout = findViewById(R.id.drawer_layout);
        material_toolbar = findViewById(R.id.material_toolbar);
        navigation_view = findViewById(R.id.navigation_view);

        askNotificationPermission();
        initFirebaseToken();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout, new Boishakh());
        fragmentTransaction.commit();

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                MainActivity.this, drawer_layout, material_toolbar, R.string.dr_close, R.string.dr_open);
        drawer_layout.addDrawerListener(toggle);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(

        ) {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int tabPosition = tab.getPosition();
                //String tabText=tab.getText().toString();
                if (tabPosition == 0) {
                    //Boishakh.Web_Url="https://www.dse.com.bd/";
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Boishakh());
                    fragmentTransaction.commit();
                } else if (tabPosition == 1) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Joishtha());
                    fragmentTransaction.commit();
                } else if (tabPosition == 2) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Ashar());
                    fragmentTransaction.commit();
                } else if (tabPosition == 3) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Srabon());
                    fragmentTransaction.commit();
                } else if (tabPosition == 4) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Bhadra());
                    fragmentTransaction.commit();
                } else if (tabPosition == 5) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Ashwin());
                    fragmentTransaction.commit();
                } else if (tabPosition == 6) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Kartik());
                    fragmentTransaction.commit();
                } else if (tabPosition == 7) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Ogrohayon());
                    fragmentTransaction.commit();
                } else if (tabPosition == 8) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Poush());
                    fragmentTransaction.commit();
                } else if (tabPosition == 9) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Magh());
                    fragmentTransaction.commit();
                } else if (tabPosition == 10) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Falgun());
                    fragmentTransaction.commit();
                } else if (tabPosition == 11) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Chaitra());
                    fragmentTransaction.commit();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        btmNavBar = findViewById(R.id.btmNavBar);
        btmNavBar.getOrCreateBadge(R.id.app_bar_notification).setNumber(100);

        btmNavBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId() == R.id.app_bar_home) {
                    clearTabSelection();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Magh());
                    fragmentTransaction.commit();

                } else if (menuItem.getItemId() == R.id.app_bar_notification) {
                    clearTabSelection();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Chaitra());
                    fragmentTransaction.commit();

                    btmNavBar.getOrCreateBadge(R.id.app_bar_notification).clearNumber();


                } else if (menuItem.getItemId() == R.id.app_bar_search) {
                    clearTabSelection();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Ogrohayon());
                    fragmentTransaction.commit();
                    tabLayout.setSelected(false);


                }
                return true;
            }
        });
        navigation_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.dwr_bar_home) {
                    //Toast.makeText(MainActivity.this,"Hello Bangladesh",Toast.LENGTH_LONG).show();
                    clearTabSelection();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Ashar());
                    fragmentTransaction.commit();
                    drawer_layout.closeDrawer(GravityCompat.START);
                } else if (menuItem.getItemId() == R.id.dwr_bar_setting) {
                    //Toast.makeText(MainActivity.this,"Hello Bangladesh",Toast.LENGTH_LONG).show();
                    clearTabSelection();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Falgun());
                    fragmentTransaction.commit();
                    drawer_layout.closeDrawer(GravityCompat.START);
                } else if (menuItem.getItemId() == R.id.dwr_bar_cotact) {
                    clearTabSelection();
                    //Toast.makeText(MainActivity.this,"Hello Bangladesh",Toast.LENGTH_LONG).show();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Poush());
                    fragmentTransaction.commit();
                    drawer_layout.closeDrawer(GravityCompat.START);
                } else if (menuItem.getItemId() == R.id.dwr_bar_email) {
                    clearTabSelection();
                    //Toast.makeText(MainActivity.this,"Hello Bangladesh",Toast.LENGTH_LONG).show();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayout, new Kartik());
                    fragmentTransaction.commit();
                    drawer_layout.closeDrawer(GravityCompat.START);
                }
                return true;
            }
        });


    }
    //=====================================Tablayout active Whene call start=======================================//
     public void clearTabSelection() {

        /*if (tabLayout.getSelectedTabPosition() != -1) {
            TabLayout.Tab tab = tabLayout.getTabAt(tabLayout.getSelectedTabPosition());
            if (tab != null) {
                tab.select();
                tabLayout.clearOnTabSelectedListeners();
            }
        }*/
         if (tabLayout.getSelectedTabPosition() != -1) {
             tabLayout.selectTab(null);
         }
    }
    //=====================================Tablayout active Whene call end=======================================//
    //=====================================Real time Notification start=======================================//
    private final ActivityResultLauncher<String> requestPermissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(), isGranted -> {
                if (isGranted) {
                    // FCM SDK (and your app) can post notifications.
                } else {
                    // TODO: Inform user that that your app will not show notifications.
                }
            });
    private void askNotificationPermission() {
        // This is only necessary for API level >= 33 (TIRAMISU)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {

            if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) ==
                    PackageManager.PERMISSION_GRANTED) {


            } else if (shouldShowRequestPermissionRationale(android.Manifest.permission.POST_NOTIFICATIONS)) {

                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Notification Permision")
                        .setMessage("Need your Permision for Good work!!")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                requestPermissionLauncher.launch(android.Manifest.permission.POST_NOTIFICATIONS);
                            }
                        })
                        .setNegativeButton("No Thanks", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .create()
                        .show();
            } else {
                // Directly ask for the permission
                requestPermissionLauncher.launch(android.Manifest.permission.POST_NOTIFICATIONS);
            }
        }
    }
    //=====================================Real time Notification End=======================================//
    //=====================================Firebase Token Start=======================================//
    public void initFirebaseToken(){
        /*FirebaseMessaging.getInstance().getToken()

                .addOnCompleteListener(new OnCompleteListener<String>() {
                    @Override
                    public void onComplete(@NonNull Task<String> task) {
                        if (!task.isSuccessful()) {
                            Log.w("FirebaseToken", "Fetching FCM registration token failed", task.getException());
                            return;
                        }

                        // Get new FCM registration token
                        String token = task.getResult();

                        Log.d("FirebaseToken",token);
                    }
                });*/
        FirebaseMessaging.getInstance().subscribeToTopic("allDevices")
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        String msg = "Subscribed to topic";
                        if (!task.isSuccessful()) {
                            msg = "Subscription failed";

                        }
                        Log.d("token", msg);
                    }
                });
    }
    //=====================================Firebase Token end=======================================//
}