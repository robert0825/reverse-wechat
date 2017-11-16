package com.tencent.mm.pluginsdk.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.m;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.e.b;
import com.tencent.mm.ac.n;
import com.tencent.mm.af.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class f
{
  private static final Drawable mQk;
  private Activity activity;
  private String hSb;
  public q mQj;
  private GetHdHeadImageGalleryView mQl;
  public e oGW;
  private String tto;
  public b ttp;
  private int ttq;
  public String username;
  
  static
  {
    GMTrace.i(1182592401408L, 8811);
    mQk = new ColorDrawable();
    GMTrace.o(1182592401408L, 8811);
  }
  
  public f(Activity paramActivity, String paramString)
  {
    this(paramActivity, paramString, null);
    GMTrace.i(1181250224128L, 8801);
    GMTrace.o(1181250224128L, 8801);
  }
  
  public f(Activity paramActivity, String paramString1, String paramString2)
  {
    this(paramActivity, paramString1, paramString2, a.ttt);
    GMTrace.i(1181384441856L, 8802);
    GMTrace.o(1181384441856L, 8802);
  }
  
  public f(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    this(paramActivity, paramString1, paramString2, paramInt, (byte)0);
    GMTrace.i(1181518659584L, 8803);
    GMTrace.o(1181518659584L, 8803);
  }
  
  private f(Activity paramActivity, String paramString1, String paramString2, int paramInt, byte paramByte)
  {
    GMTrace.i(1181652877312L, 8804);
    this.tto = null;
    this.hSb = null;
    this.activity = paramActivity;
    this.username = paramString1;
    this.hSb = paramString2;
    this.ttp = null;
    this.ttq = paramInt;
    GMTrace.o(1181652877312L, 8804);
  }
  
  public final void bKN()
  {
    GMTrace.i(1181787095040L, 8805);
    Object localObject1 = LayoutInflater.from(this.activity).inflate(R.i.czC, null);
    this.mQj = new q((View)localObject1, -1, -1);
    switch (2.tts[(this.ttq - 1)])
    {
    }
    for (;;)
    {
      this.mQj.setFocusable(true);
      this.mQj.setOutsideTouchable(true);
      this.mQj.setBackgroundDrawable(mQk);
      this.mQj.showAtLocation(this.activity.getWindow().getDecorView(), 49, 0, 0);
      this.mQl = ((GetHdHeadImageGalleryView)((View)localObject1).findViewById(R.h.bCs));
      this.mQl.ttg = this.mQj;
      this.mQl.username = this.username;
      at.AR();
      if (c.isSDCardAvailable()) {
        break;
      }
      u.fo(this.activity);
      d(n.Dh().ba(this.activity), null);
      GMTrace.o(1181787095040L, 8805);
      return;
      this.mQj.setAnimationStyle(R.m.ema);
      continue;
      this.mQj.setAnimationStyle(R.m.emb);
      continue;
      this.mQj.setAnimationStyle(R.m.elZ);
    }
    final Object localObject2;
    if (!bg.nm(this.hSb))
    {
      localObject1 = m.d(this.username, this.hSb, R.g.aYx);
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = BitmapFactory.decodeResource(this.activity.getResources(), R.g.aVS);
      }
      if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled())) {
        break label422;
      }
      w.i("MicroMsg.GetHdHeadImg", "The avatar of %s is in the cache", new Object[] { this.username });
      this.mQl.setThumbImage((Bitmap)localObject2);
    }
    for (;;)
    {
      if (!bg.nm(this.tto)) {
        this.username = this.tto;
      }
      n.Dh();
      localObject1 = d.hY(this.username);
      if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
        break label444;
      }
      w.i("MicroMsg.GetHdHeadImg", "The HDAvatar of %s is already exists", new Object[] { this.username });
      n.Dh();
      d((Bitmap)localObject1, d.t(this.username, true));
      GMTrace.o(1181787095040L, 8805);
      return;
      localObject1 = b.a(this.username, true, -1);
      break;
      label422:
      w.i("MicroMsg.GetHdHeadImg", "The avatar of %s is not in the cache, use default avatar", new Object[] { this.username });
    }
    label444:
    this.oGW = new e();
    this.oGW.a(this.username, new e.b()
    {
      public final int aN(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(1035221336064L, 7713);
        f.this.oGW.Dl();
        w.i("MicroMsg.GetHdHeadImg", "onSceneEnd: errType=%d, errCode=%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        Object localObject;
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          n.Dh();
          localObject = d.hY(f.this.username);
          if (localObject != null)
          {
            f localf = f.this;
            n.Dh();
            localf.d((Bitmap)localObject, d.t(f.this.username, true));
          }
          for (;;)
          {
            if (f.this.ttp != null)
            {
              localObject = f.this.ttp;
              localObject = f.this.username;
            }
            GMTrace.o(1035221336064L, 7713);
            return 0;
            f.this.d(localObject2, null);
          }
        }
        f.this.d(localObject2, null);
        if (f.this.ttp != null)
        {
          localObject = f.this.ttp;
          localObject = f.this.username;
        }
        GMTrace.o(1035221336064L, 7713);
        return 0;
      }
    });
    GMTrace.o(1181787095040L, 8805);
  }
  
  public final void d(Bitmap paramBitmap, String paramString)
  {
    GMTrace.i(1181921312768L, 8806);
    for (;;)
    {
      try
      {
        if (paramBitmap.getWidth() < 480)
        {
          float f = 480 / paramBitmap.getWidth();
          localObject = new Matrix();
          ((Matrix)localObject).postScale(f, f);
          localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
          w.d("MicroMsg.GetHdHeadImg", "dkhdbm old[%d %d] new[%d %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(((Bitmap)localObject).getHeight()) });
          this.mQl.L((Bitmap)localObject);
          this.mQl.oGX = paramString;
          GMTrace.o(1181921312768L, 8806);
          return;
        }
      }
      catch (Exception paramBitmap)
      {
        w.printErrStackTrace("MicroMsg.GetHdHeadImg", paramBitmap, "", new Object[0]);
        GMTrace.o(1181921312768L, 8806);
        return;
      }
      Object localObject = paramBitmap;
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(1156419944448L, 8616);
      ttt = 1;
      ttu = 2;
      ttv = 3;
      ttw = new int[] { ttt, ttu, ttv };
      GMTrace.o(1156419944448L, 8616);
    }
    
    public static int[] bKO()
    {
      GMTrace.i(1156285726720L, 8615);
      int[] arrayOfInt = (int[])ttw.clone();
      GMTrace.o(1156285726720L, 8615);
      return arrayOfInt;
    }
  }
  
  public static abstract interface b {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */