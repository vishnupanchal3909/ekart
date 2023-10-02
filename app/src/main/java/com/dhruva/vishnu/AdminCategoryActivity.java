package com.dhruva.vishnu;


import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AdminCategoryActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    CardView Fibar,Wood,Metal,Glass,Electronic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);
        Fibar=findViewById(R.id.fiber);
        Wood=findViewById(R.id.wood);
        Metal=findViewById(R.id.metal);
        Glass=findViewById(R.id.glass);
        Electronic=findViewById(R.id.electronic);

        bottomNavigationView=findViewById(R.id.bottom_navigation_learn);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.yourorder:
                        Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.account:
                        Intent intent2= new Intent(AdminCategoryActivity.this,MainActivity.class);
                        intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent2);
                        finish();

                    case R.id.home21:
                        Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        Fibar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.vishnu.AdminAddNewProductActivity.class);
                intent.putExtra("category", "FiberDoor");
                startActivity(intent);
            }
        });
        Wood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.vishnu.AdminAddNewProductActivity.class);
                intent.putExtra("category", "WoodDoor");
                startActivity(intent);
            }
        });
        Metal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.vishnu.AdminAddNewProductActivity.class);
                intent.putExtra("category", "MetalDoor");
                startActivity(intent);
            }
        });
        Glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.vishnu.AdminAddNewProductActivity.class);
                intent.putExtra("category", "GlassDoor");
                startActivity(intent);
            }
        });
        Electronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, com.dhruva.vishnu.AdminAddNewProductActivity.class);
                intent.putExtra("category", "ElectronicDoor");
                startActivity(intent);
            }
        });

    }
}
