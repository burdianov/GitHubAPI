package com.testography.githubapi.UI.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.testography.githubapi.R;

import java.util.ArrayList;

public class GithubAdapter extends RecyclerView.Adapter<GithubAdapter.Holder> {

    ArrayList<String> mArrayList;

    public GithubAdapter(ArrayList<String> arrayList) {
        mArrayList = arrayList;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout
                .github_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.mTextView.setText(mArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class Holder extends RecyclerView.ViewHolder {

        private TextView mTextView;

        public Holder(View itemView) {
            super(itemView);

            mTextView = (TextView) itemView.findViewById(R.id.recycler_view_txt);
        }
    }
}
