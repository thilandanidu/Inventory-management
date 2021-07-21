package com.mobdev.releseone.Controller;

//*** RecycleView Adapter class
//* 1- extend ItemAdapter class with .Adapter
//* 2- create class ViewHolder
//* 3- implement method from ItemAdapter extend
//      onCreateViewHolder
//      onBindViewHolder
//      getItemCount
//* 4- make ViewHolder class extend to RecyclerView.ViewHolder

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mobdev.releseone.Model.ItemModel;
import com.mobdev.releseone.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    Context context;
    List<ItemModel> item_list;

    public ItemAdapter(Context context, List<ItemModel> item_list) {
        this.context = context;
        this.item_list = item_list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.stock_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(item_list != null && item_list.size() > 0){
            ItemModel model = item_list.get(position);

            holder.item_code.setText(model.getCode());
            holder.item_name.setText(model.getItem_Name());
            holder.item_initialPrice.setText(model.getInitial_Price());
            holder.item_salePrice.setText(model.getSale_Price());
            holder.item_date.setText(model.getAdded_Date());
            holder.item_quantity.setText(model.getQuantity());
        }else{
            return;
        }
    }

    @Override
    public int getItemCount() {
        return item_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView item_code,item_name,item_initialPrice,item_salePrice,item_date,item_quantity;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            item_code = itemView.findViewById(R.id.item_code);
            item_name = itemView.findViewById(R.id.item_name);
            item_initialPrice = itemView.findViewById(R.id.item_initialPrice);
            item_salePrice = itemView.findViewById(R.id.item_salePrice);
            item_date = itemView.findViewById(R.id.item_date);
            item_quantity = itemView.findViewById(R.id.item_quantity);
        }
    }
}
