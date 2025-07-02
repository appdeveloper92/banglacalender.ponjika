package com.example.tablayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class day_details extends Fragment {


    public  static String bengolidate;
    public  static String bengolimonth;
    public  static String engishdate,bengolyear1,bengoliday,engishyear;

    RelativeLayout back_batton;
    ImageView back_image;
    TextView bangladaymonth,begoliyear,bangladayname,englishdaymonth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView= inflater.inflate(R.layout.fragment_day_details, container, false);

        back_batton = myView.findViewById(R.id.back_batton);
        back_image = myView.findViewById(R.id.back_image);
        bangladaymonth = myView.findViewById(R.id.bangladaymonth);
        begoliyear = myView.findViewById(R.id.begoliyear);
        bangladayname = myView.findViewById(R.id.bangladayname);
        englishdaymonth = myView.findViewById(R.id.englishdaymonth);


        backpage();
        daydetails();

        return myView;

    }

    //=======================================Backpress button start Here===================================//
    private void backpage() {
        back_batton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(getContext(), Boishakh.class);
                startActivity(intent);*/
                FragmentManager manager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.frameContainer, new Boishakh());
                transaction.commit();

                Toast.makeText(getActivity(), "Hello", Toast.LENGTH_LONG).show();
            }
        });
    }
    //=======================================Backpress button end Here===================================//
    //======================================= day details show end Here===================================//
    private void daydetails(){

         bangladaymonth.setText(bengolidate+" "+bengolimonth);
        begoliyear.setText(bengolyear1);
        bangladayname.setText(bengoliday);
        englishdaymonth.setText(engishyear);





    }

    //=======================================day details show end Here===================================//
}