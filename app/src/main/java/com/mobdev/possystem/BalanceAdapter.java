package com.mobdev.possystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BalanceAdapter extends RecyclerView.Adapter<BalanceAdapter.ViewHolder> {

    Context context;
    List<BalanceModel> balance_list;

    public BalanceAdapter(Context context, List<BalanceModel> balance_list) {
        this.context = context;
        this.balance_list = balance_list;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull BalanceAdapter.ViewHolder holder, int position) {
        if (balance_list != null && balance_list.size()>0){
            BalanceModel model = balance_list.get(position);
            holder.textViewInvoiceNo.setText(model.getInvoiceNo());
            holder.textViewTotalInvoiceValue.setText(model.getInvoiceValue());
        } else {
            return;
        }
    }

    @Override
    public int getItemCount() {
        return balance_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewInvoiceNo,textViewTotalInvoiceValue;
        public ViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            textViewInvoiceNo = itemView.findViewById(R.id.textViewInvoiceNo);
            textViewTotalInvoiceValue = itemView.findViewById(R.id.textViewTotalInvoiceValue);

        }
    }
}
