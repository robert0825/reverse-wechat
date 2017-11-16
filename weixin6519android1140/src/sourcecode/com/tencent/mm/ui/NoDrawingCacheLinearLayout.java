package com.tencent.mm.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;

public class NoDrawingCacheLinearLayout
  extends LinearLayout
{
  public NoDrawingCacheLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2871588290560L, 21395);
    GMTrace.o(2871588290560L, 21395);
  }
  
  @SuppressLint({"NewApi"})
  public NoDrawingCacheLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2871454072832L, 21394);
    GMTrace.o(2871454072832L, 21394);
  }
  
  public void buildDrawingCache()
  {
    GMTrace.i(2872125161472L, 21399);
    GMTrace.o(2872125161472L, 21399);
  }
  
  public void buildDrawingCache(boolean paramBoolean)
  {
    GMTrace.i(2871990943744L, 21398);
    GMTrace.o(2871990943744L, 21398);
  }
  
  public Bitmap getDrawingCache()
  {
    GMTrace.i(2871722508288L, 21396);
    GMTrace.o(2871722508288L, 21396);
    return null;
  }
  
  public Bitmap getDrawingCache(boolean paramBoolean)
  {
    GMTrace.i(2871856726016L, 21397);
    GMTrace.o(2871856726016L, 21397);
    return null;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(2872259379200L, 21400);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(2872259379200L, 21400);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\NoDrawingCacheLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */