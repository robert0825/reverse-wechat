package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.GridView;
import com.tencent.gmtrace.GMTrace;

public class IPCallShareGridView
  extends GridView
{
  public IPCallShareGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11711436292096L, 87257);
    GMTrace.o(11711436292096L, 87257);
  }
  
  public IPCallShareGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11711570509824L, 87258);
    GMTrace.o(11711570509824L, 87258);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11711704727552L, 87259);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    GMTrace.o(11711704727552L, 87259);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallShareGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */