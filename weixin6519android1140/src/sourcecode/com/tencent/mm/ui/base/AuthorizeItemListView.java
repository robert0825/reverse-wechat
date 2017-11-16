package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;

public class AuthorizeItemListView
  extends ListView
{
  public int Ob;
  
  public AuthorizeItemListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3370072932352L, 25109);
    GMTrace.o(3370072932352L, 25109);
  }
  
  public AuthorizeItemListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3369938714624L, 25108);
    GMTrace.o(3369938714624L, 25108);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3370207150080L, 25110);
    if (this.Ob <= 5)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
      GMTrace.o(3370207150080L, 25110);
      return;
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(3370207150080L, 25110);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\AuthorizeItemListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */