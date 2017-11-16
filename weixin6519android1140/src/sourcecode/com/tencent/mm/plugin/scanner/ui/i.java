package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.scanner.util.b;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public abstract class i
{
  protected ProgressDialog htG;
  protected TextView iuc;
  protected Point kTE;
  public GestureDetector mHA;
  protected boolean oxI;
  protected Rect oxJ;
  protected b oxK;
  protected Point oxL;
  protected int oxM;
  protected int oxN;
  protected int oxO;
  protected int oxP;
  protected b oxQ;
  protected int oxR;
  protected boolean oxS;
  protected ae oxT;
  
  public i(b paramb, Point paramPoint)
  {
    GMTrace.i(6138179354624L, 45733);
    this.oxI = true;
    this.oxO = 40;
    this.oxP = 20;
    this.htG = null;
    this.oxT = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(6084089610240L, 45330);
        if ((paramAnonymousMessage != null) && (paramAnonymousMessage.what == 1) && (i.this.iuc != null)) {
          i.this.iuc.setVisibility(0);
        }
        GMTrace.o(6084089610240L, 45330);
      }
    };
    this.oxQ = paramb;
    this.oxL = paramPoint;
    GMTrace.o(6138179354624L, 45733);
  }
  
  public i(b paramb, Point paramPoint, byte paramByte)
  {
    GMTrace.i(6138313572352L, 45734);
    this.oxI = true;
    this.oxO = 40;
    this.oxP = 20;
    this.htG = null;
    this.oxT = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(6084089610240L, 45330);
        if ((paramAnonymousMessage != null) && (paramAnonymousMessage.what == 1) && (i.this.iuc != null)) {
          i.this.iuc.setVisibility(0);
        }
        GMTrace.o(6084089610240L, 45330);
      }
    };
    this.oxQ = paramb;
    this.oxL = paramPoint;
    this.oxO = 50;
    GMTrace.o(6138313572352L, 45734);
  }
  
  protected abstract int bcA();
  
  protected abstract void bcB();
  
  protected abstract boolean bcC();
  
  protected abstract boolean bcD();
  
  protected abstract void bcx();
  
  protected abstract b bcy();
  
  protected abstract int bcz();
  
  public final b bdc()
  {
    GMTrace.i(6137910919168L, 45731);
    b localb = this.oxQ;
    GMTrace.o(6137910919168L, 45731);
    return localb;
  }
  
  public final void c(Point paramPoint)
  {
    GMTrace.i(19010330558464L, 141638);
    this.oxL = paramPoint;
    GMTrace.o(19010330558464L, 141638);
  }
  
  protected final double cP(int paramInt1, int paramInt2)
  {
    GMTrace.i(6139924185088L, 45746);
    Activity localActivity = this.oxQ.bcT();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)localActivity.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    double d = localDisplayMetrics.densityDpi / 160.0D;
    w.d("MicroMsg.scanner.ScanMode", "dpiLevel [%s]", new Object[] { Double.valueOf(d) });
    if (d > 1.2D) {
      if ((this.oxL.x + this.oxL.y > 3000) && (d < 2.4D))
      {
        this.oxM = BackwardSupportUtil.b.a(this.oxQ.bcT(), paramInt1 * 1.6F);
        this.oxN = BackwardSupportUtil.b.a(this.oxQ.bcT(), paramInt2 * 1.6F);
        if ((this instanceof j))
        {
          int i = (int)(this.oxL.y * 0.8D);
          int j = (int)(this.oxL.x * 0.8D);
          if ((this.oxM > i) && (this.oxN > j))
          {
            for (float f = 1.5F; (this.oxM > i) && (this.oxN > j); f -= 0.1F)
            {
              this.oxM = BackwardSupportUtil.b.a(this.oxQ.bcT(), paramInt1 * f);
              this.oxN = BackwardSupportUtil.b.a(this.oxQ.bcT(), paramInt2 * f);
            }
            w.i("MicroMsg.scanner.ScanMode", "final adjust ratio: %s", new Object[] { Float.valueOf(f) });
          }
        }
      }
    }
    for (;;)
    {
      if (this.oxM % 2 == 1) {
        this.oxM += 1;
      }
      if (this.oxN % 2 == 1) {
        this.oxN += 1;
      }
      w.d("MicroMsg.scanner.ScanMode", "frame, width:%d, height:%d, visDisplayFrameRes:%s", new Object[] { Integer.valueOf(this.oxM), Integer.valueOf(this.oxN), this.oxL });
      GMTrace.o(6139924185088L, 45746);
      return d;
      this.oxM = BackwardSupportUtil.b.a(this.oxQ.bcT(), paramInt1);
      this.oxN = BackwardSupportUtil.b.a(this.oxQ.bcT(), paramInt2);
      continue;
      if ((this.oxL != null) && (this.oxL.x + this.oxL.y > 1560))
      {
        this.oxM = BackwardSupportUtil.b.a(this.oxQ.bcT(), paramInt1 * 1.7F);
        this.oxN = BackwardSupportUtil.b.a(this.oxQ.bcT(), paramInt2 * 1.7F);
      }
      else if ((this.oxL != null) && (this.oxL.x + this.oxL.y > 1460))
      {
        this.oxM = BackwardSupportUtil.b.a(this.oxQ.bcT(), paramInt1 * 1.1F);
        this.oxN = BackwardSupportUtil.b.a(this.oxQ.bcT(), paramInt2 * 1.1F);
      }
      else
      {
        this.oxM = BackwardSupportUtil.b.a(this.oxQ.bcT(), paramInt1 / 1.1F);
        this.oxN = BackwardSupportUtil.b.a(this.oxQ.bcT(), paramInt2 / 1.1F);
      }
    }
  }
  
  protected void co(View paramView)
  {
    GMTrace.i(6139387314176L, 45742);
    GMTrace.o(6139387314176L, 45742);
  }
  
  protected void d(Point paramPoint)
  {
    GMTrace.i(6140326838272L, 45749);
    this.kTE = paramPoint;
    GMTrace.o(6140326838272L, 45749);
  }
  
  protected abstract void h(Rect paramRect);
  
  protected final void hb(boolean paramBoolean)
  {
    GMTrace.i(6138045136896L, 45732);
    if (this.iuc == null)
    {
      GMTrace.o(6138045136896L, 45732);
      return;
    }
    if (paramBoolean)
    {
      this.iuc.setVisibility(4);
      this.oxT.sendEmptyMessageDelayed(1, 210L);
      GMTrace.o(6138045136896L, 45732);
      return;
    }
    this.oxT.removeMessages(1);
    this.iuc.setVisibility(4);
    GMTrace.o(6138045136896L, 45732);
  }
  
  protected Rect hc(boolean paramBoolean)
  {
    GMTrace.i(6140192620544L, 45748);
    Rect localRect = s(true, paramBoolean);
    GMTrace.o(6140192620544L, 45748);
    return localRect;
  }
  
  public final void hd(boolean paramBoolean)
  {
    GMTrace.i(6140595273728L, 45751);
    TextView localTextView;
    if (this.iuc != null)
    {
      localTextView = this.iuc;
      if (!paramBoolean) {
        break label40;
      }
    }
    label40:
    for (int i = 0;; i = 4)
    {
      localTextView.setVisibility(i);
      GMTrace.o(6140595273728L, 45751);
      return;
    }
  }
  
  public boolean isPause()
  {
    GMTrace.i(6140461056000L, 45750);
    GMTrace.o(6140461056000L, 45750);
    return false;
  }
  
  protected void onPause()
  {
    GMTrace.i(6138582007808L, 45736);
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    GMTrace.o(6138582007808L, 45736);
  }
  
  protected abstract void onResume();
  
  protected final Rect s(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(6140058402816L, 45747);
    int i1;
    int i2;
    int j;
    if ((this.oxJ == null) || (paramBoolean1))
    {
      i1 = this.oxL.x;
      i2 = this.oxL.y;
      j = BackwardSupportUtil.b.a(this.oxQ.bcT(), this.oxO);
      if (this.oxQ.bcP()) {
        break label363;
      }
      j = 0;
    }
    label363:
    for (;;)
    {
      int m;
      int i;
      int k;
      if (!paramBoolean2)
      {
        m = i1 / 2 - this.oxM / 2;
        i = i1 / 2;
        int n = this.oxM / 2 + i;
        k = i2 / 2 - this.oxN / 2;
        i = k;
        if (k - j > 0) {
          i = k - j;
        }
        k = this.oxN + i;
        j = n;
      }
      for (;;)
      {
        w.d("MicroMsg.scanner.ScanMode", "framingRect: width = %s, height = %s; left = %s, right = %s, top = %s, bottom = %s", new Object[] { Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k) });
        this.oxJ = new Rect(m, i, j, k);
        Rect localRect = this.oxJ;
        GMTrace.o(6140058402816L, 45747);
        return localRect;
        if (i1 < i2)
        {
          m = i2 / 2 - this.oxM / 2;
          i = i2 / 2;
          j = this.oxM / 2 + i;
          i = BackwardSupportUtil.b.a(this.oxQ.bcT(), this.oxP);
          k = this.oxN + i;
        }
        else
        {
          m = i1 / 2 - this.oxM / 2;
          i = i1 / 2;
          j = this.oxM / 2 + i;
          i = BackwardSupportUtil.b.a(this.oxQ.bcT(), this.oxP);
          k = this.oxN + i;
        }
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void b(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent);
  }
  
  public static abstract interface b
  {
    public abstract void N(int paramInt1, int paramInt2, int paramInt3);
    
    public abstract void a(i.a parama);
    
    public abstract void a(String paramString, int paramInt1, int paramInt2, int paramInt3, e.a parama);
    
    public abstract void b(int paramInt, View.OnClickListener paramOnClickListener);
    
    public abstract void bcH();
    
    public abstract void bcO();
    
    public abstract boolean bcP();
    
    public abstract void bcQ();
    
    public abstract void bcR();
    
    public abstract Activity bcT();
    
    public abstract void dk(long paramLong);
    
    public abstract View findViewById(int paramInt);
    
    public abstract void gZ(boolean paramBoolean);
    
    public abstract void i(long paramLong, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */