package com.gwh.recyclerview.snapHelper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.gwh.recyclerview.BaseActivity;
import com.gwh.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Guo Wenhui
 * 2020/9/11
 **/
public class LinearSnapHelperActivity extends BaseActivity {
    private RecyclerView recyclerView;
    List<Integer> mList = new ArrayList<>();

    @Override
    public int layoutInflate() {
        return R.layout.activity_linear_snap;
    }

    @Override
    public void initViews() {
        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        //和viewpager不同，一次可滑动多个
        LinearSnapHelper linearSnapHandler = new LinearSnapHelper();

        LinearSnapAdapter adapter = new LinearSnapAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        linearSnapHandler.attachToRecyclerView(recyclerView);
        //一次只能切换一个，类似viewpager
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
//        pagerSnapHelper.attachToRecyclerView(recyclerView);

    }

    @Override
    public void registerListener() {

    }

    @Override
    public void loadData() {
        mList.add(R.mipmap.a);
        mList.add(R.mipmap.b);
        mList.add(R.mipmap.a);
        mList.add(R.mipmap.b);
        mList.add(R.mipmap.a);
        mList.add(R.mipmap.b);
        mList.add(R.mipmap.a);
        mList.add(R.mipmap.b);
        mList.add(R.mipmap.a);
        mList.add(R.mipmap.b);
        mList.add(R.mipmap.a);
        mList.add(R.mipmap.b);
        mList.add(R.mipmap.a);
        mList.add(R.mipmap.b);
        mList.add(R.mipmap.a);
        mList.add(R.mipmap.b);
        mList.add(R.mipmap.a);
        mList.add(R.mipmap.b);
        mList.add(R.mipmap.a);
        mList.add(R.mipmap.b);
        mList.add(R.mipmap.a);
        mList.add(R.mipmap.b);
    }

    class LinearSnapAdapter extends RecyclerView.Adapter<LinearSnapAdapter.LinearSnapHolder> {
        private Context mContext;
        private LayoutInflater mLayoutInflater;

        LinearSnapAdapter(Context context) {
            this.mContext = context;
            mLayoutInflater = LayoutInflater.from(context);
        }

        @NonNull
        @Override
        public LinearSnapHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = mLayoutInflater.inflate(R.layout.item_snap, parent, false);
            return new LinearSnapHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull LinearSnapHolder holder, int position) {
            holder.iv.setImageResource(mList.get(position));
        }

        @Override
        public int getItemCount() {
            return mList.size();
        }

        class LinearSnapHolder extends RecyclerView.ViewHolder {
            private ImageView iv;

            public LinearSnapHolder(@NonNull View itemView) {
                super(itemView);
                iv = itemView.findViewById(R.id.iv);

            }
        }
    }
}
