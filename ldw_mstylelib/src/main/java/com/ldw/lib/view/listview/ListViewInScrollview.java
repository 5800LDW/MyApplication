package com.ldw.lib.view.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by admin on 2016/10/14.
 */
public class ListViewInScrollview extends ListView {
    public ListViewInScrollview(Context context) {
        super(context);
    }

    public ListViewInScrollview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ListViewInScrollview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    public ListViewInScrollview(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }

    @Override
     /**
      * 重写该方法，达到使ListView适应ScrollView的效果
      */
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
        MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
