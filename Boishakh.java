package com.example.tablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

public class Boishakh extends Fragment {

    RecyclerView recyclerview;
    HashMap<String,String> hashMap;
    ArrayList<HashMap<String,String>> arrayList;
   public static String Web_Url="https://www.dse.com.bd/";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.activity_boishakh,container,false);



        //===================== Stock Exchance Sart Here =======================================//
        // Find the WebView by its unique ID
        /*WebView webView = myview.findViewById(R.id.web);
        // this will enable the javascript.
        webView.getSettings().setJavaScriptEnabled(true);
        // loading https://www.geeksforgeeks.org url in the WebView.
        webView.loadUrl(Web_Url);
        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.setWebViewClient(new WebViewClient());*/
        //===================== Stock Exchance End Here =======================================//
        //===================== RecyclerView start Here =======================================//
        recyclerview=myview.findViewById(R.id.recyclerview);

        arrayList = new ArrayList<>();
        //===================== Day HashMap start Here =======================================//
        hashMap = new HashMap<>();
        hashMap.put("itemType","week");
        hashMap.put("Day","রবি");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType","week");
        hashMap.put("Day","সোম");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType","week");
        hashMap.put("Day","মঙ্গল");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType","week");
        hashMap.put("Day","বুধ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType","week");
        hashMap.put("Day","বৃহঃ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType","week");
        hashMap.put("Day","শুক্র");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType","week");
        hashMap.put("Day","শনি");
        arrayList.add(hashMap);
        //===================== Day HashMap End Here =======================================//
        //===================== Date HashMap start Here ====================================//
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate"," ");
        hashMap.put("bengolidate"," ");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate"," ");
        hashMap.put("bengolidate"," ");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","15 Apr");
        hashMap.put("engishyear","১৫মে ২০২৫");
        hashMap.put("bengolimonth","বৈশাখ");
        hashMap.put("bengolidate","১");
        hashMap.put("bengolyear","১৪৩১");
        hashMap.put("bengoliday","মঙ্গলবার");
        hashMap.put("maqueetext","বাংলা নববর্ষ");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","16 Apr");
        hashMap.put("bengolidate","২");
        hashMap.put("maqueetext","উল্লাসকর দত্ত(জন্মদিন)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","17 Apr");
        hashMap.put("bengolidate","৩");
        hashMap.put("maqueetext","অমৃতলাল বসু(জন্মদিন)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","18 Apr");
        hashMap.put("bengolidate","৪");
        hashMap.put("maqueetext","গুড ফ্রইডে");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","19 Apr");
        hashMap.put("bengolidate","৫");
        hashMap.put("maqueetext","মুক্তিয়ার শ্রীশ্রী কালীপূজা");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","20 Apr");
        hashMap.put("bengolidate","৬");
        hashMap.put("maqueetext","ইস্টার সানডে");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","21 Apr");
        hashMap.put("bengolidate","৭");
        hashMap.put("maqueetext","শঙ্খ ঘোষ(তিরোধান দিবস)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","22 Apr");
        hashMap.put("bengolidate","৮");
        hashMap.put("maqueetext","কানন দেবী(জন্মদিন)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","23 Apr");
        hashMap.put("bengolidate","৯");
        hashMap.put("maqueetext","জ্ঞনেন্দ্রনাথ মুখোপধ্যায়(জন্মদিন)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","24 Apr");
        hashMap.put("bengolidate","১০");
        hashMap.put("maqueetext","যামিনী রায়(জন্মদিন)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","25 Apr");
        hashMap.put("bengolidate","১১");
        hashMap.put("maqueetext","নিবারণচন্দ্র গুপ্ত(জন্মদিন)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","26 Apr");
        hashMap.put("bengolidate","১২");
        hashMap.put("maqueetext","দেবীর দ্যুতিযোগ যাত্রা");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","27 Apr");
        hashMap.put("bengolidate","১৩");
        hashMap.put("maqueetext","গদাধর পন্ডিত(জন্মতিথি)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","28 Apr");
        hashMap.put("bengolidate","১৪");
        hashMap.put("maqueetext","ক্ষুদিরাম দাস(তিরোধাম দিবস)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","29 Apr");
        hashMap.put("bengolidate","১৫");
        hashMap.put("maqueetext","আন্তর্জাতিক নৃত্য দিবস(জন্মদিন)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","30 Apr");
        hashMap.put("bengolidate","১৬");
        hashMap.put("maqueetext","অক্ষয় তৃতীয়া~ভারতীয় সময় সন্ধ্যা 06:12 PM মধ্যে");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","1 May");
        hashMap.put("bengolidate","১৭");
        hashMap.put("maqueetext","মান্না দে(জন্মদিন)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","2 May");
        hashMap.put("bengolidate","১৮");
        hashMap.put("maqueetext","ষষ্ঠপঞ্চমী ব্রত");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","3 May");
        hashMap.put("bengolidate","১৯");
        hashMap.put("maqueetext","চন্দন ষষ্ঠী~ভারতীয় সময় দুপুর 01:15PM মধ্যে");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","4 May");
        hashMap.put("bengolidate","২০");
        hashMap.put("maqueetext","জহ্লুসপ্তমী~ দুপুর 12:23PM মধ্যে স্নানদানে শতগুন ফল");;
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","5 May");
        hashMap.put("bengolidate","২১");
        hashMap.put("maqueetext","সীতা নবমী(স্মার্ত মতে)~ভারতীয় সময় সকাল 01:15M থেকে");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","6 May");
        hashMap.put("bengolidate","২২");
        hashMap.put("maqueetext","সীতা নবমী(গোস্বমী মতে)~ভারতীয় সময় দুপুর 12:07PM মধ্যে");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","7 May");
        hashMap.put("bengolidate","২৩");
        hashMap.put("maqueetext","বাসন্তী দেবী(তিরোধান দিবস");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","8 May");
        hashMap.put("bengolidate","২৪");
        hashMap.put("maqueetext","নিমায় ঘোষ(আলোকচিত্রী)(তিরোধান দিবস");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","9 May");
        hashMap.put("bengolidate","২৫");
        hashMap.put("maqueetext","পরশুরাাম দ্বাদশী");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","10 May");
        hashMap.put("bengolidate","২৬");
        hashMap.put("maqueetext","গুরুসদয় দত্ত(জন্মদিন)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","11 May");
        hashMap.put("bengolidate","২৭");
        hashMap.put("maqueetext","নৃসিংহ চতুর্দশী ব্রত~সন্ধ্যা 06:05PM থেকে রাত্রি 07:17PM মধ্যে");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","12 May");
        hashMap.put("bengolidate","২৮");
        hashMap.put("maqueetext","বুদ্ধ পূণর্িমা ");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","13 May");
        hashMap.put("bengolidate","২৯");
        hashMap.put("maqueetext","স্যার রোনাল্ড রস(জন্মদিন)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","14 May");
        hashMap.put("bengolidate","৩০");
        hashMap.put("maqueetext","মৃনাল সেন(জন্মদিন)");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","eb day");
        hashMap.put("engishdate","15 May");
        hashMap.put("bengolidate","৩১");
        hashMap.put("maqueetext","শ্রী শ্রী কেশবব্রতসমাপন");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","image_baglatext");
        hashMap.put("imengishdate","12 Jan");
        hashMap.put("dayimage", ""+ R.drawable.lokki_t);
        hashMap.put("maqueetext","একাদশী");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("itemType","image_baglatext");
        hashMap.put("imengishdate","1 Jan");
        hashMap.put("dayimage", ""+ R.drawable.lokki_takur);
        hashMap.put("maqueetext","একাদশী");
        arrayList.add(hashMap);

        //===================== Date HashMap start Here ====================================//

        Xadapter adapter = new Xadapter();
        recyclerview.setAdapter(adapter);
        recyclerview.setLayoutManager(new GridLayoutManager(getContext(), 7));





        //=================-===== RecyclerView end Here =======================================//
        return myview;
    }
  private class Xadapter extends RecyclerView.Adapter{
        int Week_day=0;
        int eb_day=1;
        int image_text=2;


        private class weekviewholder extends RecyclerView.ViewHolder{
            TextView day;

            public weekviewholder(@NonNull View itemView) {
                super(itemView);
                day=itemView.findViewById(R.id.day);
            }
        }
        private class ebviewholder extends RecyclerView.ViewHolder{
            TextView enlishday,bengoliday,maqueetext,bengolimonth;
            RelativeLayout daydetails;
            public ebviewholder(@NonNull View itemView) {
                super(itemView);
                enlishday= itemView.findViewById(R.id.enlishday);
                bengoliday= itemView.findViewById(R.id.bengoliday);
                maqueetext= itemView.findViewById(R.id.maqueetext);
                daydetails= itemView.findViewById(R.id.daydetails);

            }
        }
        private class imageviewholder extends RecyclerView.ViewHolder {
            TextView imenlishday,maqueetext;
            ImageView dayimage;

            public imageviewholder(@NonNull View itemView) {
                super(itemView);
                imenlishday= itemView.findViewById(R.id.imenlishday);
                maqueetext= itemView.findViewById(R.id.maqueetext);
                dayimage= itemView.findViewById(R.id.dayimage);



            }

        private class daydetails extends RecyclerView.ViewHolder {
            public daydetails(@NonNull View itemView) {
                super(itemView);
            }
        }
        }

      @NonNull
      @Override
      public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();

            if(viewType==Week_day){

              View myView=inflater.inflate(R.layout.item_day,parent,false);
              return new weekviewholder(myView);

          } else if (viewType==eb_day) {

              View myView=inflater.inflate(R.layout.item_english_bangla_day,parent,false);
              return new ebviewholder(myView);

          }else  {
                View myView=inflater.inflate(R.layout.item_image_text_scroll,parent,false);
                return new imageviewholder(myView);
            }
            
      }

      @Override
      public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

            if(getItemViewType(position)==Week_day){

                weekviewholder myholder = (weekviewholder) holder;

                hashMap=arrayList.get(position);
                String day= hashMap.get("Day");

                myholder.day.setText(day);

            } else if (getItemViewType(position)==eb_day) {

                ebviewholder myholder= (ebviewholder) holder;
                hashMap=arrayList.get(position);
                String engishdate= hashMap.get("engishdate");
                String bengolidate= hashMap.get("bengolidate");
                String maqueetext=hashMap.get("maqueetext");
                String bengolimonth=hashMap.get("bengolimonth");
                String bengolyear=hashMap.get("bengolyear");
                String bengoliday=hashMap.get("bengoliday");
                String engishyear=hashMap.get("engishyear");

                myholder.enlishday.setText(engishdate);
                myholder.bengoliday.setText(bengolidate);
                myholder.maqueetext.setMarqueeRepeatLimit(-1);
                myholder.maqueetext.setText(maqueetext);
                myholder.maqueetext.setSelected(true);

                myholder.daydetails.setOnClickListener(v ->{

                    day_details.engishdate = engishdate;
                    day_details.bengolidate = bengolidate;
                    day_details.bengolimonth = bengolimonth;
                    day_details.bengolyear1 = bengolyear;
                    day_details.bengoliday = bengoliday;
                    day_details.engishyear = engishyear;


                    FragmentManager manager = requireActivity().getSupportFragmentManager();
                    FragmentTransaction transaction = manager.beginTransaction();
                    transaction.replace(R.id.frameContainer, new day_details());
                    transaction.commit();

                });

            }else {
                imageviewholder myholder = (imageviewholder) holder;
                hashMap=arrayList.get(position);
                String imenlishday=hashMap.get("imengishdate");
                String maqueetext=hashMap.get("maqueetext");
                String dayimage= hashMap.get("dayimage");
                int myimage=Integer.parseInt(dayimage);

                myholder.imenlishday.setText(imenlishday);

                Picasso.get()
                        .load(myimage)
                        .resize(1200, 1200)
                        //.centerCrop()
                        .into(myholder.dayimage);

                myholder.maqueetext.setMarqueeRepeatLimit(-1);
                myholder.maqueetext.setText(maqueetext);
                myholder.maqueetext.setSelected(true);

            }

      }

      @Override
      public int getItemCount() {
          return arrayList.size();
      }

      @Override
      public int getItemViewType(int position) {
            hashMap=arrayList.get(position);
            String itemType = hashMap.get("itemType");

            if(itemType.contains("week")) return Week_day;
            else if (itemType.contains("eb day")) return eb_day;
            else  return image_text ;

      }
  }



}