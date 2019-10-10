package id.boxee.pay.adapter;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import id.boxee.pay.R;
import id.boxee.pay.modelclass.Transaction_Modal_Class;


public class Activities_Recycleview_Adapter extends RecyclerView.Adapter<Activities_Recycleview_Adapter.MyViewHolder> {

    Context context;
    private List<Transaction_Modal_Class> transactionModalClasses;




public Activities_Recycleview_Adapter(Context mainActivityContacts, List<Transaction_Modal_Class> listModalClassList) {
        this.transactionModalClasses = listModalClassList;
        this.context = mainActivityContacts;
        }

@Override
public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.item_activities, parent, false);




        return new MyViewHolder(itemView);


        }

@RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
@Override
public void onBindViewHolder(final MyViewHolder holder, final int position){
    Transaction_Modal_Class modalClass = transactionModalClasses.get(position);
        holder.img1.setImageResource(modalClass.getImg());
        holder.name1.setText(modalClass.getName());
        holder.date1.setText(modalClass.getDate());
        holder.price1.setText(modalClass.getPrice());
        holder.symbol.setText(modalClass.getSign());


    if (position % 2 == 0){

        holder.symbol.setTextColor(Color.parseColor("#43a047"));

    }else {

        holder.symbol.setTextColor(Color.parseColor("#cd2f04"));

    }


}

@Override
public int getItemCount() {
        return transactionModalClasses.size();
        }

public class MyViewHolder extends RecyclerView.ViewHolder {


    TextView name1,date1,price1,symbol;
    ImageView img1;


    public MyViewHolder(View view) {
        super(view);


        name1 = (TextView) view.findViewById(R.id.name1);
        date1 = (TextView) view.findViewById(R.id.date1);
        price1 = (TextView) view.findViewById(R.id.price1);
        img1 = (ImageView) view.findViewById(R.id.img1);
        symbol = (TextView) view.findViewById(R.id.symbol);


    }

}
}
