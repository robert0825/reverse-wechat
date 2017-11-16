package com.tencent.mm.ui.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.modelappbrand.a.b.h;
import com.tencent.mm.plugin.appbrand.n.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.q;

public final class c
  implements b.h
{
  private Bitmap bitmap;
  private Context context;
  private ImageView eKZ;
  private ProgressBar eLb;
  private View hqF;
  private View mBA;
  private View pKI;
  private TextView qeG;
  private TextView qeH;
  public q tAS;
  public boolean tAT;
  private long vXp;
  private ImageView vXq;
  private String vXr;
  private boolean vXs;
  private boolean vXt;
  public a vXu;
  public ae vXv;
  
  public c(Context paramContext, View paramView1, View paramView2, boolean paramBoolean)
  {
    GMTrace.i(18814372675584L, 140178);
    this.vXp = 10000L;
    this.hqF = null;
    this.qeG = null;
    this.qeH = null;
    this.eKZ = null;
    this.vXq = null;
    this.eLb = null;
    this.vXr = null;
    this.bitmap = null;
    this.tAT = true;
    this.vXs = false;
    this.vXt = false;
    this.vXv = null;
    this.context = paramContext;
    this.pKI = paramView1;
    this.mBA = paramView2;
    this.vXt = paramBoolean;
    this.hqF = View.inflate(this.context, R.i.crV, null);
    this.qeG = ((TextView)this.hqF.findViewById(R.h.bHa));
    this.qeH = ((TextView)this.hqF.findViewById(R.h.bHb));
    this.eKZ = ((ImageView)this.hqF.findViewById(R.h.bGN));
    this.vXq = ((ImageView)this.hqF.findViewById(R.h.bxe));
    this.eLb = ((ProgressBar)this.hqF.findViewById(R.h.bGW));
    this.tAS = new q(this.hqF, -2, -2, true);
    this.tAS.setBackgroundDrawable(new ColorDrawable(0));
    this.tAS.setOutsideTouchable(true);
    this.tAS.setFocusable(false);
    this.hqF.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17887196610560L, 133270);
        if (c.this.vXu != null) {
          c.this.vXu.bZm();
        }
        c.this.tAS.dismiss();
        GMTrace.o(17887196610560L, 133270);
      }
    });
    this.vXv = new ae(this.context.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(17882096336896L, 133232);
        c.this.bZl();
        GMTrace.o(17882096336896L, 133232);
      }
    };
    GMTrace.o(18814372675584L, 140178);
  }
  
  public final void CV()
  {
    GMTrace.i(17881156812800L, 133225);
    w.d("MicroMsg.AppBrandServiceImageBubble", "beforeLoadBitmap");
    this.eLb.setVisibility(0);
    this.eKZ.setVisibility(8);
    this.vXq.setVisibility(8);
    GMTrace.o(17881156812800L, 133225);
  }
  
  public final void CW()
  {
    GMTrace.i(17881425248256L, 133227);
    w.i("MicroMsg.AppBrandServiceImageBubble", "onLoadFailed");
    this.vXq.setVisibility(0);
    this.eLb.setVisibility(8);
    this.eKZ.setVisibility(8);
    GMTrace.o(17881425248256L, 133227);
  }
  
  public final String CX()
  {
    GMTrace.i(17881559465984L, 133228);
    String str = g.aQ(this);
    GMTrace.o(17881559465984L, 133228);
    return str;
  }
  
  public final void bZl()
  {
    GMTrace.i(17881827901440L, 133230);
    if ((this.eKZ == null) || (this.tAS == null) || (this.pKI == null) || (this.mBA == null))
    {
      w.e("MicroMsg.AppBrandServiceImageBubble", "these references include null reference");
      GMTrace.o(17881827901440L, 133230);
      return;
    }
    int i;
    label76:
    int k;
    label86:
    int j;
    label95:
    int n;
    int m;
    Object localObject;
    if (this.bitmap != null)
    {
      w.d("MicroMsg.AppBrandServiceImageBubble", "bitmap is null,return");
      i = 1;
      if (i != 0) {
        break label284;
      }
      CV();
      if (!this.tAT) {
        break label295;
      }
      k = 83;
      if (!this.tAT) {
        break label301;
      }
      j = 0;
      n = j.aL(this.context);
      m = this.mBA.getHeight();
      i = m;
      if (this.vXt)
      {
        i = m;
        if (m < n) {
          i = m + n;
        }
      }
      n = j;
      m = i;
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject = ad.bYm();
        if (!this.tAT) {
          break label307;
        }
        j = 0;
      }
    }
    for (;;)
    {
      m = i + ((Rect)localObject).bottom;
      w.i("MicroMsg.AppBrandServiceImageBubble", "bubble navbar height %s %s", new Object[] { Integer.valueOf(((Rect)localObject).right), Integer.valueOf(((Rect)localObject).bottom) });
      n = j;
      this.tAS.showAtLocation(this.pKI, k, n, m);
      if (this.vXp > 0L)
      {
        localObject = new aj(new aj.a()
        {
          public final boolean pM()
          {
            GMTrace.i(17884780691456L, 133252);
            c localc = c.this;
            w.d("MicroMsg.AppBrandServiceImageBubble", "hide");
            if (localc.tAS != null) {
              localc.tAS.dismiss();
            }
            GMTrace.o(17884780691456L, 133252);
            return false;
          }
        }, false);
        long l = this.vXp;
        ((aj)localObject).z(l, l);
      }
      GMTrace.o(17881827901440L, 133230);
      return;
      i = 0;
      break;
      label284:
      j(this.bitmap);
      break label76;
      label295:
      k = 85;
      break label86;
      label301:
      j = 10;
      break label95;
      label307:
      j += ((Rect)localObject).right;
    }
  }
  
  public final void j(Bitmap paramBitmap)
  {
    GMTrace.i(17881291030528L, 133226);
    w.d("MicroMsg.AppBrandServiceImageBubble", "onBitmapLoaded");
    if (paramBitmap == null)
    {
      w.w("MicroMsg.AppBrandServiceImageBubble", "bitmap is null");
      GMTrace.o(17881291030528L, 133226);
      return;
    }
    this.bitmap = paramBitmap;
    this.eLb.setVisibility(8);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.eKZ.setVisibility(0);
      this.eKZ.setImageBitmap(paramBitmap);
      this.vXq.setVisibility(8);
      GMTrace.o(17881291030528L, 133226);
      return;
    }
    this.vXq.setVisibility(0);
    this.eKZ.setVisibility(8);
    GMTrace.o(17881291030528L, 133226);
  }
  
  public static abstract interface a
  {
    public abstract void bZm();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */