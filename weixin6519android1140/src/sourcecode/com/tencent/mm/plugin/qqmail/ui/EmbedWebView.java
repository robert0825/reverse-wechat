package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;

public class EmbedWebView
  extends MMWebView
{
  private GestureDetector nVV;
  private boolean nVW;
  private float[] nVX;
  private float[] nVY;
  private float[] nVZ;
  private float[] nWa;
  
  public EmbedWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5568961970176L, 41492);
    this.nVW = false;
    this.nVX = new float[2];
    this.nVY = new float[2];
    this.nVZ = new float[2];
    this.nWa = new float[2];
    this.nVV = new GestureDetector(new GestureDetector.SimpleOnGestureListener()
    {
      public final boolean onDoubleTap(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(5536615497728L, 41251);
        paramAnonymousMotionEvent = EmbedWebView.this;
        w.d("MicroMsg.EmbedWebView", "onDoubleTapm, before scale:" + paramAnonymousMotionEvent.getScale());
        int i = 10;
        while (paramAnonymousMotionEvent.getScale() != 1.0F)
        {
          i -= 1;
          if (i <= 0) {
            break;
          }
          if (paramAnonymousMotionEvent.getScale() > 1.0F) {
            paramAnonymousMotionEvent.zoomOut();
          } else {
            paramAnonymousMotionEvent.zoomIn();
          }
        }
        w.d("MicroMsg.EmbedWebView", "onDoubleTapm, after scale:" + EmbedWebView.this.getScale());
        GMTrace.o(5536615497728L, 41251);
        return true;
      }
    });
    postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5492457865216L, 40922);
        View localView = (View)EmbedWebView.this.getParent();
        if (localView == null)
        {
          GMTrace.o(5492457865216L, 40922);
          return;
        }
        localView = (View)localView.getParent();
        if ((localView != null) && ((localView instanceof ScrollView)))
        {
          EmbedWebView.a(EmbedWebView.this);
          localView.setOnTouchListener(new View.OnTouchListener()
          {
            public final boolean onTouch(View paramAnonymous2View, MotionEvent paramAnonymous2MotionEvent)
            {
              GMTrace.i(5479438745600L, 40825);
              if (paramAnonymous2MotionEvent.getPointerCount() == 2) {
                EmbedWebView.this.onTouchEvent(paramAnonymous2MotionEvent);
              }
              GMTrace.o(5479438745600L, 40825);
              return false;
            }
          });
        }
        GMTrace.o(5492457865216L, 40922);
      }
    }, 100L);
    GMTrace.o(5568961970176L, 41492);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = 0;
    int i = 0;
    GMTrace.i(5569096187904L, 41493);
    this.nVV.onTouchEvent(paramMotionEvent);
    int m;
    int k;
    if (this.nVW)
    {
      m = paramMotionEvent.getAction();
      k = paramMotionEvent.getPointerCount();
      if (k == 2) {
        break label71;
      }
    }
    while (i == 0)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(5569096187904L, 41493);
      return bool;
      label71:
      i = j;
      switch (m & 0xFF)
      {
      case 3: 
      case 4: 
      default: 
        i = 1;
        break;
      case 5: 
        while (i < k)
        {
          this.nVX[i] = paramMotionEvent.getX(i);
          this.nVY[i] = paramMotionEvent.getY(i);
          i += 1;
        }
      case 2: 
        i = 0;
        while (i < k)
        {
          this.nVZ[i] = paramMotionEvent.getX(i);
          this.nWa[i] = paramMotionEvent.getY(i);
          i += 1;
        }
        float f1 = (float)(Math.pow(this.nVX[1] - this.nVX[0], 2.0D) + Math.pow(this.nVY[1] - this.nVY[0], 2.0D));
        float f2 = (float)(Math.pow(this.nVZ[1] - this.nVZ[0], 2.0D) + Math.pow(this.nWa[1] - this.nWa[0], 2.0D));
        if (f1 - f2 > 20000.0F) {
          zoomOut();
        }
        for (;;)
        {
          this.nVX[0] = this.nVZ[0];
          this.nVX[1] = this.nVZ[1];
          this.nVY[0] = this.nWa[0];
          this.nVY[1] = this.nWa[1];
          break;
          if (f2 - f1 > 20000.0F) {
            zoomIn();
          }
        }
      }
    }
    GMTrace.o(5569096187904L, 41493);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\EmbedWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */