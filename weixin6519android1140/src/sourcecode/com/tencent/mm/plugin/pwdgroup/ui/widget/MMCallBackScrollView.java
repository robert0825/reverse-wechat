package com.tencent.mm.plugin.pwdgroup.ui.widget;

import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;

public class MMCallBackScrollView
  extends ScrollView
{
  private ae mHandler;
  private int mState;
  private int nQt;
  public a nQu;
  
  public MMCallBackScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10695005437952L, 79684);
    this.mState = 0;
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(10692723736576L, 79667);
        int i = MMCallBackScrollView.this.getScrollY();
        if (i == MMCallBackScrollView.a(MMCallBackScrollView.this))
        {
          MMCallBackScrollView.a(MMCallBackScrollView.this, 0);
          GMTrace.o(10692723736576L, 79667);
          return;
        }
        MMCallBackScrollView.b(MMCallBackScrollView.this, i);
        MMCallBackScrollView.b(MMCallBackScrollView.this).sendMessageDelayed(MMCallBackScrollView.b(MMCallBackScrollView.this).obtainMessage(), 5L);
        MMCallBackScrollView.a(MMCallBackScrollView.this, 1);
        GMTrace.o(10692723736576L, 79667);
      }
    };
    GMTrace.o(10695005437952L, 79684);
  }
  
  public MMCallBackScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(10695139655680L, 79685);
    this.mState = 0;
    this.mHandler = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(10692723736576L, 79667);
        int i = MMCallBackScrollView.this.getScrollY();
        if (i == MMCallBackScrollView.a(MMCallBackScrollView.this))
        {
          MMCallBackScrollView.a(MMCallBackScrollView.this, 0);
          GMTrace.o(10692723736576L, 79667);
          return;
        }
        MMCallBackScrollView.b(MMCallBackScrollView.this, i);
        MMCallBackScrollView.b(MMCallBackScrollView.this).sendMessageDelayed(MMCallBackScrollView.b(MMCallBackScrollView.this).obtainMessage(), 5L);
        MMCallBackScrollView.a(MMCallBackScrollView.this, 1);
        GMTrace.o(10692723736576L, 79667);
      }
    };
    GMTrace.o(10695139655680L, 79685);
  }
  
  private void sO(int paramInt)
  {
    GMTrace.i(10694871220224L, 79683);
    if ((this.nQu != null) && (this.mState != paramInt))
    {
      this.mState = paramInt;
      this.nQu.bi(paramInt);
    }
    GMTrace.o(10694871220224L, 79683);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(10695273873408L, 79686);
    boolean bool = super.onTouchEvent(paramMotionEvent);
    this.nQt = getScrollY();
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      GMTrace.o(10695273873408L, 79686);
      return bool;
      if (this.mHandler != null)
      {
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(), 5L);
        continue;
        sO(1);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void bi(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\pwdgroup\ui\widget\MMCallBackScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */