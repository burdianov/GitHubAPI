package com.testography.githubapi.UI.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.testography.githubapi.R;
import com.testography.githubapi.UI.adapters.GithubAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    LinearLayoutManager mLinearLayoutManager;
    GithubAdapter mGithubAdapter;
    ArrayList<String> mArrayList;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        mArrayList = new ArrayList<>();
        mArrayList.add("Vasilica");
        mArrayList.add("Mudica");
        mGithubAdapter = new GithubAdapter(mArrayList);

        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mRecyclerView.setAdapter(mGithubAdapter);
    }
}
