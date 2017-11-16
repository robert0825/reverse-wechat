package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.storage.x;

public abstract class ProfileItemView
  extends FrameLayout
{
  public x kse;
  
  public ProfileItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1188900634624L, 8858);
    GMTrace.o(1188900634624L, 8858);
  }
  
  public ProfileItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1189034852352L, 8859);
    LayoutInflater.from(paramContext).inflate(aXW(), this);
    init();
    GMTrace.o(1189034852352L, 8859);
  }
  
  public boolean L(x paramx)
  {
    GMTrace.i(1189169070080L, 8860);
    this.kse = paramx;
    boolean bool = aXX();
    GMTrace.o(1189169070080L, 8860);
    return bool;
  }
  
  public abstract int aXW();
  
  public abstract boolean aXX();
  
  public abstract void init();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\ProfileItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */