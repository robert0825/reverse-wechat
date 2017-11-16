package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;

public class MMAlbumListView
  extends ListView
{
  public MMAlbumListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3157740486656L, 23527);
    GMTrace.o(3157740486656L, 23527);
  }
  
  public MMAlbumListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3157874704384L, 23528);
    GMTrace.o(3157874704384L, 23528);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3158008922112L, 23529);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(3158008922112L, 23529);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\base\MMAlbumListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */