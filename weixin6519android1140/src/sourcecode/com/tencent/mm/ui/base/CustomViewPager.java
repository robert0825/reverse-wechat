package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.mogic.WxViewPager;

public class CustomViewPager
  extends WxViewPager
{
  public boolean CR;
  
  public CustomViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3330210267136L, 24812);
    this.CR = true;
    GMTrace.o(3330210267136L, 24812);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3330344484864L, 24813);
    if (!this.CR)
    {
      GMTrace.o(3330344484864L, 24813);
      return false;
    }
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    GMTrace.o(3330344484864L, 24813);
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3330478702592L, 24814);
    if (!this.CR)
    {
      GMTrace.o(3330478702592L, 24814);
      return false;
    }
    try
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(3330478702592L, 24814);
      return bool;
    }
    catch (Exception paramMotionEvent)
    {
      w.printErrStackTrace("MicroMsg.CustomViewPager", paramMotionEvent, "get a Exception", new Object[0]);
      GMTrace.o(3330478702592L, 24814);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\CustomViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */