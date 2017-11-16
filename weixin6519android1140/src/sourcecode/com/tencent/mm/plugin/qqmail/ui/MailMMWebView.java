package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;

public class MailMMWebView
  extends MMWebViewWithJsApi
{
  private float iTi;
  private float jry;
  private boolean nXA;
  private boolean nXB;
  boolean nXx;
  View nXy;
  View nXz;
  
  public MailMMWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5552184754176L, 41367);
    GMTrace.o(5552184754176L, 41367);
  }
  
  public MailMMWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5552318971904L, 41368);
    GMTrace.o(5552318971904L, 41368);
  }
  
  private int aZp()
  {
    GMTrace.i(5553124278272L, 41374);
    int i = Math.max(getTitleHeight() - getWebScrollY(), 0);
    GMTrace.o(5553124278272L, 41374);
    return i;
  }
  
  public final int aZq()
  {
    GMTrace.i(5553526931456L, 41377);
    if (this.nXz != null)
    {
      int i = this.nXz.getHeight();
      GMTrace.o(5553526931456L, 41377);
      return i;
    }
    GMTrace.o(5553526931456L, 41377);
    return 0;
  }
  
  public final void aZr()
  {
    GMTrace.i(5553661149184L, 41378);
    int i = (int)(getTitleHeight() / getScale());
    evaluateJavascript("javascript:_updateTitleBarHeight(" + i + ");", null);
    GMTrace.o(5553661149184L, 41378);
  }
  
  public final void aZs()
  {
    GMTrace.i(5553795366912L, 41379);
    int i = (int)(aZq() / getScale());
    evaluateJavascript("javascript:_updateBottomBarHeight(" + i + ");", null);
    GMTrace.o(5553795366912L, 41379);
  }
  
  public int computeVerticalScrollExtent()
  {
    GMTrace.i(5552855842816L, 41372);
    int j = getHeight();
    int i = j;
    if (isHorizontalScrollBarEnabled())
    {
      i = j;
      if (!overlayHorizontalScrollbar()) {
        i = j - getHorizontalScrollbarHeight();
      }
    }
    j = aZp();
    GMTrace.o(5552855842816L, 41372);
    return i - j;
  }
  
  public int computeVerticalScrollOffset()
  {
    GMTrace.i(5552990060544L, 41373);
    int i = Math.max(getWebScrollY() - getTitleHeight(), 0);
    GMTrace.o(5552990060544L, 41373);
    return i;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(5552587407360L, 41370);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    int i = getWebScrollY();
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    while ((this.nXA) && (this.nXy != null))
    {
      paramMotionEvent.setLocation(f1, f2 + i);
      bool = this.nXy.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(5552587407360L, 41370);
      return bool;
      this.jry = f1;
      this.iTi = f2;
      if ((this.nXy != null) && ((int)this.iTi < aZp()))
      {
        this.nXA = true;
      }
      else if ((this.nXz != null) && (this.nXz.getVisibility() == 0) && (this.iTi + aZq() > getHeight()))
      {
        this.nXB = true;
        continue;
        if ((Math.abs(f2 - this.iTi) > 50.0F) && (this.nXA))
        {
          paramMotionEvent.setAction(3);
          paramMotionEvent.setLocation(this.jry, this.iTi + i);
          this.nXy.dispatchTouchEvent(paramMotionEvent);
          paramMotionEvent.setAction(0);
          paramMotionEvent.setLocation(this.jry, this.iTi);
          super.dispatchTouchEvent(paramMotionEvent);
          paramMotionEvent.setAction(2);
          paramMotionEvent.setLocation(f1, f2);
        }
      }
    }
    if ((this.nXB) && (this.nXz != null))
    {
      paramMotionEvent.setLocation(f1, f2 + aZq() - getHeight());
      bool = this.nXz.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(5552587407360L, 41370);
      return bool;
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(5552587407360L, 41370);
    return bool;
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    GMTrace.i(5553258496000L, 41375);
    boolean bool;
    if (paramView == this.nXy)
    {
      int i = getWebScrollY();
      paramCanvas.save();
      paramCanvas.translate(0.0F, -i);
      bool = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restore();
    }
    for (;;)
    {
      GMTrace.o(5553258496000L, 41375);
      return bool;
      bool = super.drawChild(paramCanvas, paramView, paramLong);
    }
  }
  
  public final void gK(boolean paramBoolean)
  {
    GMTrace.i(5553929584640L, 41380);
    if (this.nXz != null)
    {
      if (paramBoolean)
      {
        this.nXz.setVisibility(0);
        GMTrace.o(5553929584640L, 41380);
        return;
      }
      this.nXz.setVisibility(4);
    }
    GMTrace.o(5553929584640L, 41380);
  }
  
  public final int getTitleHeight()
  {
    GMTrace.i(5553392713728L, 41376);
    if (this.nXy != null)
    {
      int i = this.nXy.getHeight();
      GMTrace.o(5553392713728L, 41376);
      return i;
    }
    GMTrace.o(5553392713728L, 41376);
    return 0;
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(5552453189632L, 41369);
    this.nXx = true;
    super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
    GMTrace.o(5552453189632L, 41369);
  }
  
  public void onWebViewScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(19547738341376L, 145642);
    int i = (int)(getContentHeight() * getScale());
    int j = getHeight() + paramInt2;
    super.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    invalidate();
    if (i - j < aZq())
    {
      if (Math.abs(i - j) <= 20) {
        break label96;
      }
      aZs();
      gK(false);
    }
    for (;;)
    {
      if (getVisibleTitleHeight() == 0) {
        aZr();
      }
      GMTrace.o(19547738341376L, 145642);
      return;
      label96:
      gK(true);
    }
  }
  
  private final class a
    extends FrameLayout
  {
    public a(Context paramContext)
    {
      super();
      GMTrace.i(5543057948672L, 41299);
      GMTrace.o(5543057948672L, 41299);
    }
    
    public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
    {
      GMTrace.i(5543192166400L, 41300);
      if ((!MailMMWebView.a(MailMMWebView.this)) && (!MailMMWebView.b(MailMMWebView.this)))
      {
        GMTrace.o(5543192166400L, 41300);
        return false;
      }
      switch (paramMotionEvent.getAction() & 0xFF)
      {
      }
      for (;;)
      {
        super.dispatchTouchEvent(paramMotionEvent);
        GMTrace.o(5543192166400L, 41300);
        return true;
        MailMMWebView.c(MailMMWebView.this);
        MailMMWebView.d(MailMMWebView.this);
      }
    }
    
    protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(5543326384128L, 41301);
      super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      if ((this == MailMMWebView.e(MailMMWebView.this)) && (MailMMWebView.this.getTitleHeight() > 0))
      {
        MailMMWebView.this.aZr();
        GMTrace.o(5543326384128L, 41301);
        return;
      }
      if ((this == MailMMWebView.f(MailMMWebView.this)) && (MailMMWebView.this.aZq() > 0)) {
        MailMMWebView.this.aZs();
      }
      GMTrace.o(5543326384128L, 41301);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\MailMMWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */