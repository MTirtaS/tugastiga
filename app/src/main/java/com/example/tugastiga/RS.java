package com.example.tugastiga;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] daftarRs = new String[] {"Rumah Sakit Awal Bros", "Rumah Sakit Eka Hospital",
        "Rumah Sakit Jiwa Tampan", "Rumah Sakit Tabrani"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, daftarRs));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object oRS = this.getListAdapter().getItem(position);
        String pilihan = oRS.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try{
            Intent a = null;
            if(pilihan.equals("Rumah Sakit Awal Bros")){
                a = new Intent(this,RSawalbross.class);
                startActivity(a);

            }else if (pilihan.equals("Rumah Sakit Eka Hospital")){

            }else if (pilihan.equals("Rumah Sakit Jiwa Tampan")){

            }else if (pilihan.equals("Rumah Sakit Tabrani")){

            }

        }catch (Exception e){

        }
    }
}
