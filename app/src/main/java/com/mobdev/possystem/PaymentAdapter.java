package com.mobdev.possystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class PaymentAdapter extends RecyclerView.Adapter<PaymentAdapter.ViewHolder>
{
    //
    Context context;
    List<PaymentModel> payment_list;

    //constructor context
    public PaymentAdapter(Context context, List<PaymentModel> payment_list) {
        this.context = context;
        this.payment_list = payment_list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        if (payment_list != null && payment_list.size() > 0){
            PaymentModel model = payment_list.get(position);
            holder.code_tv.setText(model.getCode());
            holder.name_tv.setText(model.getName());
            holder.quantity_tv.setText(model.getQuantity());
            holder.totalV_tv.setText(model.getTotalV());
        } else {
            return;
        }
    }

    @Override
    public int getItemCount() {
        return payment_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView code_tv, name_tv, quantity_tv, totalV_tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            code_tv = itemView.findViewById(R.id.code_tv);
            name_tv = itemView.findViewById(R.id.name_tv);
            quantity_tv = itemView.findViewById(R.id.quantity_tv);
            totalV_tv = itemView.findViewById(R.id.totalV_tv);

        }
    }
}
