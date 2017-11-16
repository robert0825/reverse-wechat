package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.kernel.e;
import com.tencent.mm.platformtools.d;
import com.tencent.mm.plugin.luckymoney.b.n;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.tools.MMGestureGallery.c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class h
{
  private static final Drawable mQk;
  public Activity activity;
  public String imagePath;
  private q mQj;
  private GetHdHeadImageGalleryView mQl;
  private int mQm;
  public int mQn;
  private String username;
  
  static
  {
    GMTrace.i(9796149313536L, 72987);
    mQk = new ColorDrawable();
    GMTrace.o(9796149313536L, 72987);
  }
  
  public h(Activity paramActivity, String paramString1, String paramString2)
  {
    this(paramActivity, paramString1, paramString2, a.mQp);
    GMTrace.i(9795075571712L, 72979);
    GMTrace.o(9795075571712L, 72979);
  }
  
  private h(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(9795209789440L, 72980);
    this.mQn = 1;
    this.activity = paramActivity;
    this.username = paramString1;
    this.imagePath = paramString2;
    this.mQm = paramInt;
    GMTrace.o(9795209789440L, 72980);
  }
  
  public final void n(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(9795344007168L, 72981);
    w.i("MicroMsg.LuckyMoneyPreviewImgGallaryView", "previewImg readImgFromCache:" + paramBoolean + ", sceneFromUI:" + paramInt);
    Object localObject1 = LayoutInflater.from(this.activity).inflate(a.g.sPs, null);
    this.mQj = new q((View)localObject1, -1, -1);
    this.mQj.setFocusable(true);
    this.mQj.setOutsideTouchable(true);
    this.mQj.setBackgroundDrawable(mQk);
    this.mQj.showAtLocation(this.activity.getWindow().getDecorView(), 49, 0, 0);
    this.mQl = ((GetHdHeadImageGalleryView)((View)localObject1).findViewById(a.f.bCs));
    this.mQl.ttg = this.mQj;
    this.mQl.username = this.username;
    this.mQl.oGX = this.imagePath;
    this.mQn = paramInt;
    com.tencent.mm.kernel.h.xz();
    Bitmap localBitmap;
    if (!com.tencent.mm.kernel.h.xy().isSDCardAvailable())
    {
      w.i("MicroMsg.LuckyMoneyPreviewImgGallaryView", "previewImg sdcard is not available!");
      u.fo(this.activity);
      localBitmap = BitmapFactory.decodeResource(ab.getContext().getResources(), a.e.aYv);
    }
    for (;;)
    {
      try
      {
        if ((localBitmap.getWidth() >= 480) || (localBitmap.getWidth() <= 0)) {
          break label481;
        }
        float f = 480.0F / localBitmap.getWidth();
        localObject1 = new Matrix();
        ((Matrix)localObject1).postScale(f, f);
        localObject1 = Bitmap.createBitmap(localBitmap, 0, 0, localBitmap.getWidth(), localBitmap.getHeight(), (Matrix)localObject1, true);
        w.d("MicroMsg.LuckyMoneyPreviewImgGallaryView", "dkhdbm old[%d %d] new[%d %d]", new Object[] { Integer.valueOf(localBitmap.getWidth()), Integer.valueOf(localBitmap.getHeight()), Integer.valueOf(((Bitmap)localObject1).getWidth()), Integer.valueOf(((Bitmap)localObject1).getHeight()) });
        this.mQl.L((Bitmap)localObject1);
        this.mQl.oGX = null;
        GMTrace.o(9795344007168L, 72981);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.LuckyMoneyPreviewImgGallaryView", localException, "", new Object[0]);
        GMTrace.o(9795344007168L, 72981);
        return;
      }
      Object localObject2 = n.ag(this.imagePath, paramBoolean);
      if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
      {
        w.i("MicroMsg.LuckyMoneyPreviewImgGallaryView", "The image of %s is in the cache", new Object[] { this.username });
        this.mQl.L((Bitmap)localObject2);
      }
      for (;;)
      {
        this.mQl.xhG = new MMGestureGallery.c()
        {
          public final void ayF()
          {
            GMTrace.i(9873458724864L, 73563);
            h localh = h.this;
            ArrayList localArrayList = new ArrayList();
            localArrayList.add(localh.activity.getString(a.i.dSm));
            localArrayList.add(localh.activity.getString(a.i.dUM));
            localArrayList.add(localh.activity.getString(a.i.dNH));
            com.tencent.mm.ui.base.h.a(localh.activity, null, (String[])localArrayList.toArray(new String[localArrayList.size()]), "", new h.2(localh));
            GMTrace.o(9873458724864L, 73563);
          }
        };
        GMTrace.o(9795344007168L, 72981);
        return;
        w.i("MicroMsg.LuckyMoneyPreviewImgGallaryView", "The image of %s is not in the cache, use default avatar", new Object[] { this.username });
      }
      label481:
      localObject2 = localBitmap;
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(9834669801472L, 73274);
      mQp = 1;
      mQq = 2;
      mQr = 3;
      mQs = new int[] { mQp, mQq, mQr };
      GMTrace.o(9834669801472L, 73274);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */