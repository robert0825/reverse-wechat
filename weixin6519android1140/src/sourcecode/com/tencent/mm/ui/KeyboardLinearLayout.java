package com.tencent.mm.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;

public class KeyboardLinearLayout
  extends OnLayoutChangedLinearLayout
{
  public String TAG;
  private boolean mHasInit;
  private int mHeight;
  private boolean vJd;
  public a vJe;
  
  public KeyboardLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2532151656448L, 18866);
    this.TAG = "MicroMsg.KeyboardLinearLayout";
    this.mHasInit = false;
    this.mHasInit = false;
    this.mHeight = 0;
    this.vJd = false;
    this.TAG += getId();
    GMTrace.o(2532151656448L, 18866);
  }
  
  public KeyboardLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(2532285874176L, 18867);
    this.TAG = "MicroMsg.KeyboardLinearLayout";
    this.mHasInit = false;
    GMTrace.o(2532285874176L, 18867);
  }
  
  public void oD(int paramInt)
  {
    GMTrace.i(2532688527360L, 18870);
    if (this.vJe != null) {
      this.vJe.oD(paramInt);
    }
    GMTrace.o(2532688527360L, 18870);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(2532420091904L, 18868);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    xP(paramInt4);
    GMTrace.o(2532420091904L, 18868);
  }
  
  public void xP(int paramInt)
  {
    GMTrace.i(2532554309632L, 18869);
    if (!this.mHasInit)
    {
      this.mHasInit = true;
      this.mHeight = paramInt;
      w.i(this.TAG, "init height:%d", new Object[] { Integer.valueOf(this.mHeight) });
      if (this.vJe != null) {
        this.vJe.oD(-1);
      }
      if ((this.mHasInit) && (!this.vJd) && (this.mHeight - paramInt > 100))
      {
        this.vJd = true;
        oD(-3);
        w.w(this.TAG, "show keyboard!! mHeight: " + this.mHeight + " b: " + paramInt);
      }
      if ((this.mHasInit) && (this.vJd) && (this.mHeight - paramInt <= 100))
      {
        this.vJd = false;
        oD(-2);
        w.w(this.TAG, "hide keyboard!! mHeight: " + this.mHeight + " b: " + paramInt);
      }
      GMTrace.o(2532554309632L, 18869);
      return;
    }
    if (this.mHeight < paramInt) {}
    for (int i = paramInt;; i = this.mHeight)
    {
      this.mHeight = i;
      break;
    }
  }
  
  public static abstract interface a
  {
    public abstract void oD(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\KeyboardLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */