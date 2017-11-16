package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;

public class VoiceInputScrollView
  extends ScrollView
{
  public VoiceInputScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1165546749952L, 8684);
    GMTrace.o(1165546749952L, 8684);
  }
  
  public VoiceInputScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1165680967680L, 8685);
    GMTrace.o(1165680967680L, 8685);
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1165815185408L, 8686);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(1165815185408L, 8686);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\VoiceInputScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */