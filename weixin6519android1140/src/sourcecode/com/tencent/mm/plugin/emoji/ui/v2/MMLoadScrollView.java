package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;

public class MMLoadScrollView
  extends ScrollView
{
  private a kvd;
  
  public MMLoadScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11485413638144L, 85573);
    GMTrace.o(11485413638144L, 85573);
  }
  
  public MMLoadScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11485279420416L, 85572);
    GMTrace.o(11485279420416L, 85572);
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(11485547855872L, 85574);
    if ((paramBoolean2) && (paramInt2 > 0) && (this.kvd != null)) {
      this.kvd.atc();
    }
    super.onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    GMTrace.o(11485547855872L, 85574);
  }
  
  public static abstract interface a
  {
    public abstract void atc();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\MMLoadScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */