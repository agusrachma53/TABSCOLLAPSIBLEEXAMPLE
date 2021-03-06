package com.tabscollapsibleexample.www.tabscollapsibleexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Jack Ma on 3/5/2018.
 */

public class CommonRecycleAdapter extends RecyclerView.Adapter<CommonRecycleAdapter.ViewHolder> {

    private List<String> itemsData;

    public CommonRecycleAdapter(List<String> itemsData){
        this.itemsData = itemsData;
    }

    @Override
    public CommonRecycleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleviewitem, null);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CommonRecycleAdapter.ViewHolder viewHolder, int position) {

        viewHolder.text.setText(itemsData.get(position));

    }

    @Override
    public int getItemCount() {
        return itemsData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.text) TextView text;
        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            ButterKnife.bind(this, itemLayoutView);
        }
    }
}
