package id.boxee.pay;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.boxee.pay.adapter.Activities_Recycleview_Adapter;
import id.boxee.pay.modelclass.Transaction_Modal_Class;

public class SummaryFragment extends Fragment {

    RecyclerView summary_recycleview;

    Activities_Recycleview_Adapter mActivities_Adapter;

    private ArrayList<Transaction_Modal_Class> transactionModalClassArrayList;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_summary, container, false);

        summary_recycleview = (RecyclerView)rootView.findViewById(R.id.summary_recycleview);




        // Album List
        transactionModalClassArrayList = new ArrayList<>();
        transactionModalClassArrayList.add(new Transaction_Modal_Class(R.drawable.red_arrow,"Ms. Jackson","Sep 27, 2019","Rp 8.500.000","-"));
        transactionModalClassArrayList.add(new Transaction_Modal_Class(R.drawable.green_arrow,"Teguh","Sep 27, 2019","Rp 2.000.000","+"));
        transactionModalClassArrayList.add(new Transaction_Modal_Class(R.drawable.red_arrow,"Kintan Buffet","Oct 01, 2019","Rp 560.000","-"));
        transactionModalClassArrayList.add(new Transaction_Modal_Class(R.drawable.green_arrow,"Laduma","Sep 27, 2019","Rp 150.000","+"));
        transactionModalClassArrayList.add(new Transaction_Modal_Class(R.drawable.red_arrow,"CGV","Oct 01, 2019","Rp 400.000","-"));
        transactionModalClassArrayList.add(new Transaction_Modal_Class(R.drawable.red_arrow,"Esther","Sep 27, 2019","Rp 10.000.000","-"));



        mActivities_Adapter = new Activities_Recycleview_Adapter(getActivity(),transactionModalClassArrayList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        summary_recycleview.setLayoutManager(layoutManager1);
        summary_recycleview.setAdapter(mActivities_Adapter);



        return rootView;
    }


}
