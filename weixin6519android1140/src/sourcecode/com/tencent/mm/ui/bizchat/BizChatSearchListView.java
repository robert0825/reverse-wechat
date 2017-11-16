package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;

public class BizChatSearchListView
  extends ListView
{
  a wpm;
  
  public BizChatSearchListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2999766220800L, 22350);
    GMTrace.o(2999766220800L, 22350);
  }
  
  public BizChatSearchListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2999900438528L, 22351);
    GMTrace.o(2999900438528L, 22351);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3000034656256L, 22352);
    if (this.wpm != null) {
      this.wpm.aio();
    }
    if (super.onInterceptTouchEvent(paramMotionEvent))
    {
      GMTrace.o(3000034656256L, 22352);
      return true;
    }
    GMTrace.o(3000034656256L, 22352);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract boolean aio();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bizchat\BizChatSearchListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */