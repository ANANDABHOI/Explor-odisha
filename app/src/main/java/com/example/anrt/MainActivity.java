package com.example.anrt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.ListView);
        List<String> list =new ArrayList<>();
        list.add("Angul");
        list.add(" Balangir");
        list.add(" Balasore");
        list.add("Bargarh");
        list.add(" Bhadrak");
        list.add("Boudh");
        list.add("Cuttack");
        list.add("Deogarh");
        list.add(" Dhenkanal");
        list.add("Gajapati");
        list.add(" Ganjam ");
        list.add("Jagatsinghpur");
        list.add("Jajpur");
        list.add("Jharsuguda");
        list.add("Kandhamal");
        list.add(" Kalahandi");
        list.add("Kendrapara");
        list.add(" Keonjhar");
        list.add("Khordha");
        list.add("Koraput");
        list.add(" Malkangiri");
        list.add(" Mayurbhanj");
        list.add(" Nabarangpur");
        list.add("Nayagarh");
        list.add("Nuapada");
        list.add(" Puri");
        list.add("Rayagada");
        list.add("Sambalpur");
        list.add("Subarnapur");
        list.add("Sundargarh");
        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                if(position==0){
                 //clickd Angul

                    startActivity(new Intent(MainActivity.this,Angul.class));
                } else if (position==1) {
                    //clicked Balangir
                    startActivity(new Intent(MainActivity.this,Balangir.class));
                } else if (position==2) {
                    //clicked balasore
                    startActivity(new Intent(MainActivity.this,balasore.class));
                } else if (position==3) {
                    //clicked bargarh
                    startActivity(new Intent(MainActivity.this,bargarh.class));
                } else if (position==4) {
                    //bhadrak
                    startActivity(new Intent(MainActivity.this,bhadrak.class));
                } else if (position==5) {
                    //boudh
                    startActivity(new Intent(MainActivity.this,boudh.class));
                } else if (position==6) {
                    //cuttack
                    startActivity(new Intent(MainActivity.this,cuttack.class));
                } else if (position==7) {
                    //deogarh
                    startActivity(new Intent(MainActivity.this,deogarh.class));
                } else if (position==8) {
                    //dhenkanal
                    startActivity(new Intent(MainActivity.this,dhenkanal.class));
                } else if (position==9) {
                    //gajapati
                    startActivity(new Intent(MainActivity.this,gajpati.class));
                } else if (position==10) {
                    //ganjam
                    startActivity(new Intent(MainActivity.this,ganjam.class));
                } else if (position==11) {
                    //jagatgatsingpur
                    startActivity(new Intent(MainActivity.this,jharsugda.class));
                } else if (position==12) {
                    //jajpur
                    startActivity(new Intent(MainActivity.this,jajpur.class));
                } else if (position==13) {
                    //jhursugda
                    startActivity(new Intent(MainActivity.this,jharsugda.class));
                } else if (position==14) {
                    //kandhamal
                    startActivity(new Intent(MainActivity.this,kandhmal.class));
                } else if (position==15) {
                    //kalahandi
                    startActivity(new Intent(MainActivity.this,kalahandi.class));
                } else if (position==16) {
                    //kendrapada
                    startActivity(new Intent(MainActivity.this,kendrapada.class));
                } else if (position==17) {
                    //keonjhar
                    startActivity(new Intent(MainActivity.this,keonjhur.class));
                } else if (position==18) {
                    //khordha
                    startActivity(new Intent(MainActivity.this,khordha.class));
                } else if (position==19) {
                    //koraput
                    startActivity(new Intent(MainActivity.this,koraput.class));
                } else if (position==20) {
                    //malkangiri
                    startActivity(new Intent(MainActivity.this,malkangiri.class));
                } else if (position==21) {
                    //mayurbhanj
                    startActivity(new Intent(MainActivity.this,mayurbhanj.class));
                } else if (position==22) {
                    //nabarangpur
                    startActivity(new Intent(MainActivity.this,mayurbhanj.class));
                } else if (position==23) {
                    //nayagarh
                    startActivity(new Intent(MainActivity.this,nabarangpur.class));
                } else if (position==24) {
                    //nuapada
                    startActivity(new Intent(MainActivity.this,nuapada.class));
                } else if (position==25) {
                    //puri
                    startActivity(new Intent(MainActivity.this,puri.class));
                } else if (position==26) {
                    //rayagada
                    startActivity(new Intent(MainActivity.this,rayagada.class));
                } else if (position==27) {
                    //sambalpur
                    startActivity(new Intent(MainActivity.this,sambalpur.class));
                } else if (position==28) {
                    //subarnapur
                    startActivity(new Intent(MainActivity.this,subarnapur.class));
                } else if (position==29) {
                    //sundargarh
                    startActivity(new Intent(MainActivity.this,sundargarh.class));
                }

            }
        });




    }
}