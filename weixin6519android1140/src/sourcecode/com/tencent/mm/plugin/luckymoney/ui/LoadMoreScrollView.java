package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class LoadMoreScrollView
  extends ScrollView
{
  public LoadMoreScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9849299533824L, 73383);
    GMTrace.o(9849299533824L, 73383);
  }
  
  public LoadMoreScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9849165316096L, 73382);
    GMTrace.o(9849165316096L, 73382);
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(9849433751552L, 73384);
    w.v("MicroMsg.LoadMoreScrollView", paramInt1 + ", " + paramInt2 + ", " + paramBoolean1 + ", " + paramBoolean2 + ", " + getScrollY());
    super.onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    GMTrace.o(9849433751552L, 73384);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LoadMoreScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */