package com.tencent.mm.plugin.collect.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qbar.QbarNative;

public final class b
{
  public static Bitmap a(Context paramContext, String paramString1, String paramString2, int paramInt1, String paramString3, boolean paramBoolean, int paramInt2, j.a parama)
  {
    GMTrace.i(20347004911616L, 151597);
    int i = (int)(paramInt2 * 0.26F);
    int j = (int)(paramInt2 * 0.22F);
    paramInt2 = (int)(paramInt2 * 0.076F);
    for (;;)
    {
      try
      {
        Paint localPaint = new Paint();
        localPaint.setAntiAlias(true);
        w.i("MicroMsg.CollectBitmapFactory", "createCollectQrcode size avatarSize %s dpCanvas %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        Bitmap localBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Object localObject2 = null;
        Object localObject1 = localObject2;
        if (paramInt1 == 1)
        {
          localObject1 = localObject2;
          if (!bg.nm(paramString3))
          {
            localObject1 = j.a(new c(paramString3));
            j.b(parama);
          }
        }
        paramString3 = (String)localObject1;
        if (localObject1 == null) {
          paramString3 = com.tencent.mm.ac.b.c(paramString2, j, j, (int)(j * 0.06F));
        }
        paramString2 = paramString3;
        if (paramString3 == null)
        {
          paramString2 = BackwardSupportUtil.b.a(ab.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.br.a.getDensity(null));
          paramString2 = d.a(paramString2, false, 0.06F * paramString2.getWidth());
        }
        paramString3 = new Canvas(localBitmap);
        paramInt1 = (i - j) / 2;
        paramString3.drawBitmap(paramString2, null, new Rect(paramInt1, paramInt1, i - paramInt1, i - paramInt1), localPaint);
        if (paramBoolean) {
          paramString3.drawBitmap(MMBitmapFactory.decodeStream(paramContext.getResources().openRawResource(a.e.snO)), null, new Rect(i - paramInt2, i - paramInt2, i, i), localPaint);
        }
        paramString2 = new byte[40000];
        paramString3 = new int[2];
        paramInt1 = QbarNative.a(paramString2, paramString3, paramString1, 0, 3, "UTF-8");
        QbarNative.nativeRelease();
        if (paramInt1 > 0)
        {
          paramContext = com.tencent.mm.bo.a.a.a(paramContext, localBitmap, paramString2, paramString3, 0);
          if (paramContext == null)
          {
            w.i("MicroMsg.QRCodeBitmapFactory", "createBitmap bm is error result %d %s", new Object[] { Integer.valueOf(paramInt1), bg.bQW().toString() });
            localBitmap.recycle();
            GMTrace.o(20347004911616L, 151597);
            return paramContext;
          }
          w.i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", new Object[] { paramContext });
          continue;
        }
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("MicroMsg.CollectBitmapFactory", paramContext, "", new Object[0]);
        GMTrace.o(20347004911616L, 151597);
        return null;
      }
      tmp428_425[0] = Integer.valueOf(paramInt1);
      Object[] tmp435_428 = tmp428_425;
      tmp435_428[1] = bg.bQW().toString();
      w.i("MicroMsg.QRCodeBitmapFactory", "result %d %s", tmp435_428);
      paramContext = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */