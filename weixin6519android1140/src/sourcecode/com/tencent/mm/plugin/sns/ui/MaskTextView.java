package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;

public class MaskTextView
  extends SnsTextView
{
  public MaskTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8612483170304L, 64168);
    GMTrace.o(8612483170304L, 64168);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8612617388032L, 64169);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8612617388032L, 64169);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8612751605760L, 64170);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(8612751605760L, 64170);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\MaskTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */