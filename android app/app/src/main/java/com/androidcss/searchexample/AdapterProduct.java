package com.androidcss.searchexample;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Collections;
import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    List<DataProduct> data= Collections.emptyList();
    DataProduct current;
    int currentPos=0;

    // create constructor to initialize context and data sent from SearchActivity
    public AdapterProduct(Context context, List<DataProduct> data){
        this.context=context;
        inflater= LayoutInflater.from(context);
        this.data=data;
    }

    // Inflate the layout when ViewHolder created
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.container_product, parent,false);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    // Bind data
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        // Get current position of item in RecyclerView to bind data and assign values from list
        MyHolder myHolder= (MyHolder) holder;
        DataProduct current=data.get(position);
        myHolder.textTitle.setText(current.productTitle);
        myHolder.textPrice.setText( current.productPrice + "\\EURO");
        myHolder.textPrice.setTextColor(ContextCompat.getColor(context, R.color.colorAccent));

    }

    // return total item from List
    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView textTitle;
        TextView textPrice;

        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            textTitle= (TextView) itemView.findViewById(R.id.textProductName);
            textPrice = (TextView) itemView.findViewById(R.id.textProductPrice);
            itemView.setOnClickListener(this);
        }

        // Click event for all items
        @Override
        public void onClick(View v) {

            Toast.makeText(context, "You clicked an item", Toast.LENGTH_SHORT).show();

        }

    }

}
