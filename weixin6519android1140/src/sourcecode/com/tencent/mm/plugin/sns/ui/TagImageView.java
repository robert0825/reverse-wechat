package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.widget.QFadeImageView;

public class TagImageView
  extends QFadeImageView
{
  public int position;
  
  public TagImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8388608000000L, 62500);
    this.position = -1;
    GMTrace.o(8388608000000L, 62500);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8388876435456L, 62502);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8388876435456L, 62502);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8388742217728L, 62501);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(8388742217728L, 62501);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\TagImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */