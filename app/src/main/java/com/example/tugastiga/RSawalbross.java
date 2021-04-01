package com.example.tugastiga;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSawalbross extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] daftaraksi = new String[] {"Call Center", "SMS Center","Driving Direction",
                "Website", "Info on Google"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, daftaraksi));
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
            if(pilihan.equals("Call Center")){
                String notel ="tel: 08117518119";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(notel));
                startActivity(a);

            }else if (pilihan.equals("SMS Center")){
                String smstext ="Muhammad Tirta Syakban";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:08117518119"));
                a.putExtra("sms_body",smstext);
                startActivity(a);

            }else if (pilihan.equals("Driving Direction")){
                String lokasi ="google.navigation:q=0.4965894,101.4540993";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasi));
                startActivity(a);

            }else if (pilihan.equals("Website")){
                String website = "http://awalbros.com/en/branch/pekanbaru/";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));
                startActivity(a);

            }else if (pilihan.equals("Info on Google")){
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Awal Bros");
                startActivity(a);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}