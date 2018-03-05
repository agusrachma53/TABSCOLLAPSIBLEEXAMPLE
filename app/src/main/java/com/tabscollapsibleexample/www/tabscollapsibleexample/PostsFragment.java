package com.tabscollapsibleexample.www.tabscollapsibleexample;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Jack Ma on 3/5/2018.
 */

public class PostsFragment extends android.support.v4.app.Fragment {

    @BindView(R.id.recycleView) RecyclerView recyclerView;

    public static android.support.v4.app.Fragment newInstance(Context context){
        PostsFragment f = new PostsFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.recycleview_content,null);
        setUpView(root);
        return root;

    }

    public void setUpView(ViewGroup root){
        ButterKnife.bind(this, root);
        setUPList();
    }

    void setUPList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        CommonRecycleAdapter adapter = new CommonRecycleAdapter(createItemList());
        recyclerView.setAdapter(adapter);
    }

    private List<String> createItemList() {
        List<String> itemList = new ArrayList<>();
        for(int i=0;i<30;i++) {
            itemList.add("Item "+i);
        }
        return itemList;
    }


}
