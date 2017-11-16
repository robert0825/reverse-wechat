package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends ImageView
{
  private static int mzi;
  private final String TAG;
  private boolean aDI;
  private double aEH;
  public a.a fJt;
  private Activity mActivity;
  private a.a myZ;
  private Bitmap mza;
  private boolean mzb;
  private double mzc;
  private double mzd;
  public c mze;
  private com.tencent.mm.plugin.p.d mzf;
  private boolean mzg;
  private final int mzh;
  private boolean mzj;
  
  public e(Activity paramActivity, int paramInt, com.tencent.mm.plugin.p.d paramd)
  {
    super(paramActivity);
    GMTrace.i(9713739628544L, 72373);
    this.TAG = "MicroMsg.MyPoiPoint";
    this.mzg = false;
    this.mzh = 689208551;
    this.mzj = false;
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15405242384384L, 114778);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15405242384384L, 114778);
          return false;
        }
        if (e.a(e.this))
        {
          GMTrace.o(15405242384384L, 114778);
          return false;
        }
        w.d("MicroMsg.MyPoiPoint", "new location comes! slat : %f, slng: %f", new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1) });
        e.b(e.this);
        e.a(e.this, paramAnonymousDouble2);
        e.b(e.this, paramAnonymousFloat2);
        e.c(e.this, paramAnonymousFloat1);
        if (e.c(e.this) != null)
        {
          if (e.d(e.this)) {
            break label238;
          }
          e.e(e.this);
          e.c(e.this).addView(e.this, e.f(e.this), e.g(e.this), -2);
        }
        for (;;)
        {
          if (e.h(e.this) != null) {
            e.h(e.this).a(paramAnonymousBoolean, paramAnonymousFloat1, paramAnonymousFloat2, paramAnonymousInt, paramAnonymousDouble1, paramAnonymousDouble2, paramAnonymousDouble3);
          }
          e.this.invalidate();
          e.this.postInvalidate();
          e.this.requestLayout();
          e.i(e.this);
          GMTrace.o(15405242384384L, 114778);
          return true;
          label238:
          e.c(e.this).updateViewLayout(e.this, e.f(e.this), e.g(e.this), -2);
        }
      }
    };
    this.mzf = paramd;
    this.myZ = null;
    this.mActivity = paramActivity;
    this.mza = com.tencent.mm.sdk.platformtools.d.Ag(paramInt);
    this.aDI = false;
    this.mzb = false;
    this.mze = c.Ir();
    mzi = BackwardSupportUtil.b.a(paramActivity, 80.0F);
    setImageResource(paramInt);
    setScaleType(ImageView.ScaleType.FIT_CENTER);
    w.d("MicroMsg.MyPoiPoint", "enableLocation");
    this.aDI = true;
    this.mze.a(this.fJt);
    GMTrace.o(9713739628544L, 72373);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(9713873846272L, 72374);
    super.onDraw(paramCanvas);
    w.d("MicroMsg.MyPoiPoint", "onDraw");
    GMTrace.o(9713873846272L, 72374);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */