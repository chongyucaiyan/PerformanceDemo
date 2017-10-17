package com.github.cyc.performance.overdrawdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cyc on 2017/10/17.
 */

public class AlphabetAdapter extends RecyclerView.Adapter<AlphabetAdapter.AlphabetViewHolder> {
    private Context mContext;
    private List<String> mDataList;

    public AlphabetAdapter(Context context, List<String> dataList) {
        mContext = context;
        mDataList = dataList;
    }

    @Override
    public AlphabetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.view_alphabet, parent, false);
        AlphabetViewHolder viewHolder = new AlphabetViewHolder(itemView);
        viewHolder.tvAlphabet = (TextView) itemView.findViewById(R.id.tv_alphabet);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AlphabetViewHolder holder, int position) {
        String alphabet = mDataList.get(position);
        holder.tvAlphabet.setText(alphabet);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    static class AlphabetViewHolder extends RecyclerView.ViewHolder {
        TextView tvAlphabet;

        AlphabetViewHolder(View itemView) {
            super(itemView);
        }
    }
}
