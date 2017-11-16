package com.tencent.mm.pluginsdk.ui.applet;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;

public final class i
{
  private int background;
  int index;
  boolean jNC;
  View.OnClickListener oiK;
  int row;
  h twX;
  private final View.OnTouchListener txH;
  int txM;
  public b txN;
  public a txd;
  
  public i()
  {
    GMTrace.i(946100764672L, 7049);
    this.background = -1;
    this.txH = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(962743762944L, 7173);
        GMTrace.o(962743762944L, 7173);
        return true;
      }
    };
    this.oiK = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(949858861056L, 7077);
        GMTrace.o(949858861056L, 7077);
      }
    };
    GMTrace.o(946100764672L, 7049);
  }
  
  public static abstract interface a
  {
    public abstract void zh(int paramInt);
  }
  
  public static abstract interface b
  {
    public abstract boolean lZ(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */