package com.tencent.mm.plugin.chatroom.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Iterator;

public final class c
  extends TouchDelegate
{
  private static final Rect jSE;
  ArrayList<TouchDelegate> jSF;
  TouchDelegate jSG;
  
  static
  {
    GMTrace.i(9071105146880L, 67585);
    jSE = new Rect();
    GMTrace.o(9071105146880L, 67585);
  }
  
  public c(View paramView)
  {
    super(jSE, paramView);
    GMTrace.i(9070836711424L, 67583);
    GMTrace.o(9070836711424L, 67583);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(9070970929152L, 67584);
    Object localObject;
    switch (paramMotionEvent.getAction())
    {
    default: 
      localObject = null;
    }
    for (;;)
    {
      if (localObject != null) {
        break label151;
      }
      GMTrace.o(9070970929152L, 67584);
      return false;
      if (this.jSF == null) {
        break;
      }
      localObject = this.jSF.iterator();
      while (((Iterator)localObject).hasNext())
      {
        TouchDelegate localTouchDelegate = (TouchDelegate)((Iterator)localObject).next();
        if ((localTouchDelegate != null) && (localTouchDelegate.onTouchEvent(paramMotionEvent)))
        {
          this.jSG = localTouchDelegate;
          GMTrace.o(9070970929152L, 67584);
          return true;
        }
      }
      localObject = null;
      continue;
      localObject = this.jSG;
      continue;
      localObject = this.jSG;
      this.jSG = null;
    }
    label151:
    boolean bool = ((TouchDelegate)localObject).onTouchEvent(paramMotionEvent);
    GMTrace.o(9070970929152L, 67584);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */