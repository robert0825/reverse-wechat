package com.tencent.mm.pluginsdk.ui.d;

import android.content.Context;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kiss.widget.textview.StaticTextView;
import com.tencent.mm.plugin.comm.a.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.w;

public final class k
  implements View.OnTouchListener
{
  private static boolean DEBUG;
  private static int tEs;
  public static int vU;
  String hNz;
  private l tEo;
  private boolean tEp;
  private View tEq;
  public boolean tEr;
  private Context tEt;
  private ae tEu;
  private b tEv;
  private a tEw;
  public View view;
  
  static
  {
    GMTrace.i(1205946286080L, 8985);
    DEBUG = false;
    vU = ViewConfiguration.getTapTimeout();
    int i = ViewConfiguration.getLongPressTimeout();
    tEs = i;
    if (i > vU * 2) {
      tEs -= vU;
    }
    w.d("MicroMsg.PressSpanTouchListener", "long press timeout:%d", new Object[] { Integer.valueOf(tEs) });
    GMTrace.o(1205946286080L, 8985);
  }
  
  public k()
  {
    GMTrace.i(1204604108800L, 8975);
    this.tEo = null;
    this.tEp = false;
    this.tEq = null;
    this.tEr = false;
    this.tEt = null;
    this.tEu = new ae(Looper.getMainLooper());
    this.tEv = new b();
    this.tEw = new a();
    GMTrace.o(1204604108800L, 8975);
  }
  
  public k(Context paramContext)
  {
    GMTrace.i(1204738326528L, 8976);
    this.tEo = null;
    this.tEp = false;
    this.tEq = null;
    this.tEr = false;
    this.tEt = null;
    this.tEu = new ae(Looper.getMainLooper());
    this.tEv = new b();
    this.tEw = new a();
    this.tEt = paramContext;
    GMTrace.o(1204738326528L, 8976);
  }
  
  private void D(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1205006761984L, 8978);
    if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1)) {
      aIL();
    }
    GMTrace.o(1205006761984L, 8978);
  }
  
  public final void aIL()
  {
    GMTrace.i(1205140979712L, 8979);
    if (this.tEo != null)
    {
      this.tEo.nfC = false;
      this.tEo.setContext(null);
      this.tEq.invalidate();
      this.tEq = null;
      this.tEo = null;
    }
    GMTrace.o(1205140979712L, 8979);
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(1204872544256L, 8977);
    if ((!(paramView instanceof TextView)) && (!(paramView instanceof StaticTextView)))
    {
      GMTrace.o(1204872544256L, 8977);
      return false;
    }
    int i;
    int j;
    if (paramMotionEvent.getAction() == 0)
    {
      i = (int)paramMotionEvent.getRawX();
      j = (int)paramMotionEvent.getRawY();
      paramView.setTag(a.e.cie, new int[] { i, j });
    }
    this.view = paramView;
    Layout localLayout;
    CharSequence localCharSequence;
    MotionEvent localMotionEvent;
    Object localObject;
    int k;
    if ((paramView instanceof TextView))
    {
      localLayout = ((TextView)paramView).getLayout();
      localCharSequence = ((TextView)paramView).getText();
      if (DEBUG) {
        w.d("MicroMsg.PressSpanTouchListener", "ontouch action: %d, isLongPress:%b " + localLayout + " " + (localCharSequence instanceof Spanned) + " " + new ah().toString(), new Object[] { Integer.valueOf(paramMotionEvent.getAction()), Boolean.valueOf(this.tEr) });
      }
      localMotionEvent = MotionEvent.obtain(paramMotionEvent);
      if (((localCharSequence instanceof Spanned)) && (localLayout != null))
      {
        localObject = (Spanned)localCharSequence;
        i = localMotionEvent.getAction();
        paramView.invalidate();
        if ((i != 1) && (i != 0) && (i != 2) && (i != 3)) {
          break label853;
        }
        j = (int)localMotionEvent.getX();
        i = (int)localMotionEvent.getY();
        if (!(paramView instanceof StaticTextView)) {
          break label469;
        }
        if (j >= ((StaticTextView)paramView).xL())
        {
          k = localLayout.getWidth();
          if (j <= ((StaticTextView)paramView).xL() + k) {
            break label428;
          }
        }
        D(localMotionEvent);
      }
    }
    label428:
    label469:
    label589:
    label853:
    label939:
    label1071:
    label1332:
    label1380:
    for (;;)
    {
      localMotionEvent.recycle();
      if (DEBUG) {
        w.d("MicroMsg.PressSpanTouchListener", "ontouch action2: %d, isLongPress:%b " + localLayout + " " + (localCharSequence instanceof Spanned) + " processResult: false" + " " + new ah().toString(), new Object[] { Integer.valueOf(paramMotionEvent.getAction()), Boolean.valueOf(this.tEr) });
      }
      GMTrace.o(1204872544256L, 8977);
      return false;
      localLayout = ((StaticTextView)paramView).xT();
      localCharSequence = ((StaticTextView)paramView).getText();
      break;
      if (i >= ((StaticTextView)paramView).xM())
      {
        k = localLayout.getHeight();
        if (i <= ((StaticTextView)paramView).xM() + k) {}
      }
      else
      {
        D(localMotionEvent);
        continue;
        if ((paramView instanceof TextView))
        {
          if (j >= ((TextView)paramView).getTotalPaddingLeft())
          {
            k = localLayout.getWidth();
            if (j <= ((TextView)paramView).getTotalPaddingLeft() + k) {}
          }
          else
          {
            D(localMotionEvent);
            continue;
          }
          if (i >= ((TextView)paramView).getTotalPaddingTop())
          {
            k = localLayout.getHeight();
            if (i <= ((TextView)paramView).getTotalPaddingTop() + k) {}
          }
          else
          {
            D(localMotionEvent);
            continue;
          }
        }
      }
      if ((paramView instanceof TextView))
      {
        j -= ((TextView)paramView).getTotalPaddingLeft();
        i -= ((TextView)paramView).getTotalPaddingTop();
        k = paramView.getScrollX();
        j = localLayout.getOffsetForHorizontal(localLayout.getLineForVertical(i + paramView.getScrollY()), j + k);
        i = j;
        if ((paramView instanceof TextView))
        {
          i = j;
          if (j < ((Spanned)localObject).length()) {
            i = j + 1;
          }
        }
        j = localMotionEvent.getAction();
        localObject = (l[])((Spanned)localObject).getSpans(i, i, l.class);
        i = localObject.length - 1;
        if (DEBUG) {
          w.d("MicroMsg.PressSpanTouchListener", "processPress action: %d, isLongPress:%b " + localObject.length + " " + this.tEo + " " + new ah().toString(), new Object[] { Integer.valueOf(localMotionEvent.getAction()), Boolean.valueOf(this.tEr) });
        }
        if (localObject.length == 0) {
          break label1332;
        }
        if (j != 1) {
          break label1071;
        }
        this.tEu.removeCallbacks(this.tEv);
        this.tEu.removeCallbacks(this.tEw);
        if (!this.tEr) {
          break label939;
        }
        aIL();
        this.tEr = false;
        paramView.setClickable(this.tEp);
        if (DEBUG) {
          w.i("MicroMsg.PressSpanTouchListener", "processPress action1 " + localMotionEvent.getAction());
        }
      }
      for (;;)
      {
        if (!DEBUG) {
          break label1380;
        }
        w.i("MicroMsg.PressSpanTouchListener", "processTouch action2 " + localMotionEvent.getAction());
        break;
        if ((paramView instanceof StaticTextView))
        {
          j -= ((StaticTextView)paramView).xL();
          i -= ((StaticTextView)paramView).xM();
          break label589;
        }
        j -= paramView.getPaddingLeft();
        i -= paramView.getPaddingTop();
        break label589;
        this.tEr = false;
        if (this.tEo != null)
        {
          localObject = this.tEo;
          ((l)localObject).hNz = this.hNz;
          if (((l)localObject).tEz != null) {
            ((l)localObject).tEz.hNz = ((l)localObject).hNz;
          }
          if (this.tEt != null) {
            this.tEo.setContext(this.tEt);
          }
          this.tEo.onClick(paramView);
        }
        for (;;)
        {
          paramView.setClickable(this.tEp);
          aIL();
          if (!DEBUG) {
            break;
          }
          w.i("MicroMsg.PressSpanTouchListener", "processPress action2 " + localMotionEvent.getAction());
          break;
          w.e("MicroMsg.PressSpanTouchListener", "ACTION_UP error, lastClickSpan is null");
        }
        if ((j == 0) || (j == 2))
        {
          if ((j == 0) && (tEs > 0)) {
            zF(0);
          }
          if (j == 0) {
            this.tEp = paramView.isClickable();
          }
          aIL();
          this.tEo = localObject[i];
          this.tEq = paramView;
          localObject[i].setContext(null);
          localObject[i].nfC = true;
          localObject[i].mEnable = true;
          paramView.invalidate();
          if (this.tEr)
          {
            localObject[i].nfC = false;
            localObject[i].mEnable = false;
            paramView.setClickable(this.tEp);
            if (DEBUG) {
              w.i("MicroMsg.PressSpanTouchListener", "processPress action3 " + localMotionEvent.getAction());
            }
          }
          else if (DEBUG)
          {
            w.i("MicroMsg.PressSpanTouchListener", "processPress action4 " + localMotionEvent.getAction());
          }
        }
        else if (j == 3)
        {
          this.tEu.removeCallbacks(this.tEv);
          this.tEu.removeCallbacks(this.tEw);
          paramView.setClickable(this.tEp);
          aIL();
          if (DEBUG)
          {
            w.i("MicroMsg.PressSpanTouchListener", "processPress action5 " + localMotionEvent.getAction());
            continue;
            aIL();
          }
        }
        else
        {
          if (j == 1) {
            this.tEr = false;
          }
          if (DEBUG) {
            w.i("MicroMsg.PressSpanTouchListener", "processPress action6 " + localMotionEvent.getAction());
          }
        }
      }
    }
  }
  
  public final void zF(int paramInt)
  {
    GMTrace.i(1205275197440L, 8980);
    if (this.view != null) {
      this.tEu.postDelayed(this.tEw, tEs - paramInt);
    }
    GMTrace.o(1205275197440L, 8980);
  }
  
  final class a
    implements Runnable
  {
    a()
    {
      GMTrace.i(1207691116544L, 8998);
      GMTrace.o(1207691116544L, 8998);
    }
    
    public final void run()
    {
      GMTrace.i(1207825334272L, 8999);
      if ((k.this.view != null) && (k.this.view.isPressed()))
      {
        w.d("MicroMsg.PressSpanTouchListener", "long pressed timeout");
        k.this.tEr = true;
        k.this.aIL();
      }
      GMTrace.o(1207825334272L, 8999);
    }
  }
  
  private final class b
    implements Runnable
  {
    public b()
    {
      GMTrace.i(1211046559744L, 9023);
      GMTrace.o(1211046559744L, 9023);
    }
    
    public final void run()
    {
      GMTrace.i(1211180777472L, 9024);
      k.this.zF(k.vU);
      GMTrace.o(1211180777472L, 9024);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\d\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */