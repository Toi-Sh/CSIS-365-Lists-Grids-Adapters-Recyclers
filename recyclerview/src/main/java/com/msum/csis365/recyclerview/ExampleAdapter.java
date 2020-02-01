package com.msum.csis365.recyclerview;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ViewHolder> {

    // The data items the adapter will iterate over
    private String[] dataItems = {};

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Creates and stores an ExampleRowView in the ViewHolder
        return new ViewHolder(new ExampleRowView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Passes the corresponding data to the ExampleRowView in the ViewHolder
        holder.rowView.setup(dataItems[position]);
    }

    @Override
    public int getItemCount() {
        // Returns how many data items are in the list
        return dataItems.length;
    }

    public void setDataItems(String[] dataItems) {
        // Assigns the new lists of data items into the class-level variable
        this.dataItems = dataItems;

        // Tells the Adapter to refresh/redraw itself
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        // Inner-class-level of the ExampleRowView to be setup
        ExampleRowView rowView;

        ViewHolder(@NonNull ExampleRowView itemView) {
            super(itemView);

            // Assigns the ExampleRowView into the inner-class-level variable
            rowView = itemView;
        }
    }
}