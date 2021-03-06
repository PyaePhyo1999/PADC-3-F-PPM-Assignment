package xyz.arkarhein.news.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.arkarhein.news.R;
import xyz.arkarhein.news.adapters.InternationalNewsAdapter;

/**
 * Created by Arkar Hein on 1/7/2018.
 */

public class InternationalNewsFragment extends Fragment {
    @BindView(R.id.rv_international_news)
    RecyclerView rvInternationalNews;

    private InternationalNewsAdapter mInternationalNewsAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_international_news, container, false);
        ButterKnife.bind(this, view);

        mInternationalNewsAdapter = new InternationalNewsAdapter();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rvInternationalNews.setAdapter(mInternationalNewsAdapter);
        rvInternationalNews.setLayoutManager(linearLayoutManager);

        return view;
    }
}
