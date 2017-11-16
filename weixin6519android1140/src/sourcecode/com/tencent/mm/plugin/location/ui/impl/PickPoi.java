package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.b;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.sdk.platformtools.w;

public class PickPoi
  extends RelativeLayout
{
  private Context context;
  protected b mCj;
  public b.a mCr;
  private double mDA;
  f mDC;
  boolean mDD;
  e mDE;
  private double mDz;
  Animation myI;
  View myJ;
  
  public PickPoi(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(9685822341120L, 72165);
    this.mDC = new f();
    this.mDD = true;
    this.mDE = null;
    this.mCr = new b.a()
    {
      public final void b(Addr paramAnonymousAddr)
      {
        GMTrace.i(9705955000320L, 72315);
        w.d("MicroMsg.PickPoi", "onGetAddrss  %s", new Object[] { paramAnonymousAddr.toString() });
        if (PickPoi.a(PickPoi.this) == null)
        {
          w.i("MicroMsg.PickPoi", "error, empty poi!");
          GMTrace.o(9705955000320L, 72315);
          return;
        }
        f localf = PickPoi.a(PickPoi.this);
        localf.mDX = paramAnonymousAddr;
        localf.mDN = paramAnonymousAddr.gEy;
        localf.aED = paramAnonymousAddr.gEJ;
        localf.aEE = paramAnonymousAddr.gEK;
        localf.mDR = paramAnonymousAddr.gEz;
        localf.mDS = paramAnonymousAddr.gEA;
        localf.mDU = paramAnonymousAddr.gEE;
        localf.mDW = paramAnonymousAddr.gEG;
        localf.mDZ = paramAnonymousAddr.gEI;
        w.d("poidata", "roughAddr %s", new Object[] { paramAnonymousAddr.toString() });
        if (PickPoi.b(PickPoi.this) != null) {
          PickPoi.b(PickPoi.this).notifyDataSetChanged();
        }
        GMTrace.o(9705955000320L, 72315);
      }
    };
    this.context = paramContext;
    init();
    GMTrace.o(9685822341120L, 72165);
  }
  
  public PickPoi(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9685956558848L, 72166);
    this.mDC = new f();
    this.mDD = true;
    this.mDE = null;
    this.mCr = new b.a()
    {
      public final void b(Addr paramAnonymousAddr)
      {
        GMTrace.i(9705955000320L, 72315);
        w.d("MicroMsg.PickPoi", "onGetAddrss  %s", new Object[] { paramAnonymousAddr.toString() });
        if (PickPoi.a(PickPoi.this) == null)
        {
          w.i("MicroMsg.PickPoi", "error, empty poi!");
          GMTrace.o(9705955000320L, 72315);
          return;
        }
        f localf = PickPoi.a(PickPoi.this);
        localf.mDX = paramAnonymousAddr;
        localf.mDN = paramAnonymousAddr.gEy;
        localf.aED = paramAnonymousAddr.gEJ;
        localf.aEE = paramAnonymousAddr.gEK;
        localf.mDR = paramAnonymousAddr.gEz;
        localf.mDS = paramAnonymousAddr.gEA;
        localf.mDU = paramAnonymousAddr.gEE;
        localf.mDW = paramAnonymousAddr.gEG;
        localf.mDZ = paramAnonymousAddr.gEI;
        w.d("poidata", "roughAddr %s", new Object[] { paramAnonymousAddr.toString() });
        if (PickPoi.b(PickPoi.this) != null) {
          PickPoi.b(PickPoi.this).notifyDataSetChanged();
        }
        GMTrace.o(9705955000320L, 72315);
      }
    };
    this.context = paramContext;
    init();
    GMTrace.o(9685956558848L, 72166);
  }
  
  public PickPoi(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9686090776576L, 72167);
    this.mDC = new f();
    this.mDD = true;
    this.mDE = null;
    this.mCr = new b.a()
    {
      public final void b(Addr paramAnonymousAddr)
      {
        GMTrace.i(9705955000320L, 72315);
        w.d("MicroMsg.PickPoi", "onGetAddrss  %s", new Object[] { paramAnonymousAddr.toString() });
        if (PickPoi.a(PickPoi.this) == null)
        {
          w.i("MicroMsg.PickPoi", "error, empty poi!");
          GMTrace.o(9705955000320L, 72315);
          return;
        }
        f localf = PickPoi.a(PickPoi.this);
        localf.mDX = paramAnonymousAddr;
        localf.mDN = paramAnonymousAddr.gEy;
        localf.aED = paramAnonymousAddr.gEJ;
        localf.aEE = paramAnonymousAddr.gEK;
        localf.mDR = paramAnonymousAddr.gEz;
        localf.mDS = paramAnonymousAddr.gEA;
        localf.mDU = paramAnonymousAddr.gEE;
        localf.mDW = paramAnonymousAddr.gEG;
        localf.mDZ = paramAnonymousAddr.gEI;
        w.d("poidata", "roughAddr %s", new Object[] { paramAnonymousAddr.toString() });
        if (PickPoi.b(PickPoi.this) != null) {
          PickPoi.b(PickPoi.this).notifyDataSetChanged();
        }
        GMTrace.o(9705955000320L, 72315);
      }
    };
    this.context = paramContext;
    init();
    GMTrace.o(9686090776576L, 72167);
  }
  
  private void init()
  {
    GMTrace.i(9686224994304L, 72168);
    this.mCj = b.Ip();
    this.myI = AnimationUtils.loadAnimation(this.context, R.a.aMg);
    this.myJ = LayoutInflater.from(this.context).inflate(R.i.cAP, this, true).findViewById(R.h.bKU);
    GMTrace.o(9686224994304L, 72168);
  }
  
  public final void k(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(9686359212032L, 72169);
    this.mDz = paramDouble1;
    this.mDA = paramDouble2;
    this.mDC = new f();
    this.mDC.type = 3;
    this.mDC.mName = this.context.getResources().getString(R.l.dGL);
    this.mDC.aED = paramDouble1;
    this.mDC.aEE = paramDouble2;
    this.mDC.mDN = "";
    this.mCj.a(this.mCr);
    this.mCj.a(paramDouble1, paramDouble2, this.mCr);
    this.mDD = true;
    GMTrace.o(9686359212032L, 72169);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\impl\PickPoi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */