package com.example.student.a0928;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

//        menu.add(0,1,0,"選單一");
//        menu.add(0,2,0,"選單二");
        //menu.add("選單一");
        //menu.add("選單二");
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //if (item.getTitle().equals("選單一")){
//        if (item.getItemId() == 1){
        if (item.getItemId()== R.id.menu1){
            Toast.makeText(MainActivity.this,"新增被按下",Toast.LENGTH_SHORT).show();
        }

        //if (item.getTitle().equals("選單二")){
//        if (item.getItemId() == 2){
          if(item.getItemId()==R.id.menu2){
            Toast.makeText(MainActivity.this,"選單二被按下",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
