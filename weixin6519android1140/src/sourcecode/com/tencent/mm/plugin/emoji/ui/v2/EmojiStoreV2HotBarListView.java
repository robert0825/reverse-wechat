package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;

public class EmojiStoreV2HotBarListView
  extends ListView
{
  public EmojiStoreV2HotBarListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11482863501312L, 85554);
    GMTrace.o(11482863501312L, 85554);
  }
  
  public EmojiStoreV2HotBarListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11482729283584L, 85553);
    GMTrace.o(11482729283584L, 85553);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11482997719040L, 85555);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(11482997719040L, 85555);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\EmojiStoreV2HotBarListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */