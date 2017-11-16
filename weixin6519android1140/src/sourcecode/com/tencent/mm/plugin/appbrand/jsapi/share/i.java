package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.o;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class i
{
  public static String a(final AppBrandPageView paramAppBrandPageView, String paramString)
  {
    String str2 = null;
    GMTrace.i(18230525558784L, 135828);
    if (paramAppBrandPageView == null)
    {
      GMTrace.o(18230525558784L, 135828);
      return null;
    }
    String str3 = paramAppBrandPageView.hyD;
    final String str1;
    if (bg.nm(paramString))
    {
      str1 = com.tencent.mm.plugin.appbrand.appstorage.c.aE(str3, "share_" + System.currentTimeMillis());
      com.tencent.mm.plugin.appbrand.c.a(str3, new c.b()
      {
        public final void a(c.c paramAnonymousc)
        {
          GMTrace.i(19815234273280L, 147635);
          com.tencent.mm.plugin.appbrand.c.b(this.eud, this);
          paramAnonymousc = i.b(paramAppBrandPageView);
          if (paramAnonymousc != null) {}
          try
          {
            if (!paramAnonymousc.isRecycled())
            {
              d.a(paramAnonymousc, 100, Bitmap.CompressFormat.PNG, str1, true);
              final Bundle localBundle = new Bundle();
              localBundle.putString("delay_load_img_path", "file://" + str1);
              com.tencent.mm.bv.a.post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(19814965837824L, 147633);
                  e.a("com.tencent.mm", localBundle, a.class, null);
                  GMTrace.o(19814965837824L, 147633);
                }
              });
            }
            if ((paramAnonymousc != null) && (!paramAnonymousc.isRecycled()))
            {
              paramAnonymousc.recycle();
              GMTrace.o(19815234273280L, 147635);
              return;
            }
          }
          catch (IOException localIOException)
          {
            w.w("MicroMsg.ShareHelper", "save temp bitmap to file failed, . exception : %s", new Object[] { localIOException });
            if ((paramAnonymousc != null) && (!paramAnonymousc.isRecycled()))
            {
              paramAnonymousc.recycle();
              GMTrace.o(19815234273280L, 147635);
              return;
            }
          }
          catch (Exception localException)
          {
            w.w("MicroMsg.ShareHelper", "save temp bitmap to file failed, . exception : %s", new Object[] { localException });
            if ((paramAnonymousc != null) && (!paramAnonymousc.isRecycled()))
            {
              paramAnonymousc.recycle();
              GMTrace.o(19815234273280L, 147635);
              return;
            }
          }
          finally
          {
            if ((paramAnonymousc != null) && (!paramAnonymousc.isRecycled())) {
              paramAnonymousc.recycle();
            }
          }
          GMTrace.o(19815234273280L, 147635);
        }
      });
    }
    for (;;)
    {
      GMTrace.o(18230525558784L, 135828);
      return str1;
      if (paramString.startsWith("wxfile://"))
      {
        paramAppBrandPageView = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(str3, paramString);
        str1 = str2;
        if (paramAppBrandPageView == null) {
          continue;
        }
        str1 = str2;
        if (TextUtils.isEmpty(paramAppBrandPageView.gpy)) {
          continue;
        }
        str1 = paramAppBrandPageView.gpy;
        continue;
      }
      str1 = str2;
      if (paramString.startsWith("http://")) {
        continue;
      }
      str1 = str2;
      if (paramString.startsWith("https://")) {
        continue;
      }
      str2 = com.tencent.mm.plugin.appbrand.appstorage.c.aE(str3, "share_" + System.currentTimeMillis());
      paramAppBrandPageView = o.g(paramAppBrandPageView.hzM, paramString);
      str1 = str2;
      if (paramAppBrandPageView == null) {
        continue;
      }
      str1 = str2;
      if (paramAppBrandPageView.isRecycled()) {
        continue;
      }
      try
      {
        d.a(paramAppBrandPageView, 100, Bitmap.CompressFormat.PNG, str2, true);
        str1 = str2;
        if (paramAppBrandPageView == null) {
          continue;
        }
        str1 = str2;
        if (paramAppBrandPageView.isRecycled()) {
          continue;
        }
        paramAppBrandPageView.recycle();
        str1 = str2;
      }
      catch (IOException paramString)
      {
        w.w("MicroMsg.ShareHelper", "save temp bitmap to file failed, . exception : %s", new Object[] { paramString });
        str1 = str2;
        if (paramAppBrandPageView == null) {
          continue;
        }
        str1 = str2;
        if (paramAppBrandPageView.isRecycled()) {
          continue;
        }
        paramAppBrandPageView.recycle();
        str1 = str2;
      }
      finally
      {
        if ((paramAppBrandPageView != null) && (!paramAppBrandPageView.isRecycled())) {
          paramAppBrandPageView.recycle();
        }
      }
    }
  }
  
  public static Bitmap b(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(18230391341056L, 135827);
    if (paramAppBrandPageView == null)
    {
      GMTrace.o(18230391341056L, 135827);
      return null;
    }
    paramAppBrandPageView = paramAppBrandPageView.ivj;
    View localView = paramAppBrandPageView.getView();
    if (localView == null)
    {
      GMTrace.o(18230391341056L, 135827);
      return null;
    }
    int i = localView.getWidth();
    int j = localView.getHeight();
    final int k = localView.getScrollX();
    final int m = localView.getScrollY();
    if ((i == 0) || (j == 0))
    {
      GMTrace.o(18230391341056L, 135827);
      return null;
    }
    localView.scrollTo(0, 0);
    Bitmap localBitmap;
    if (paramAppBrandPageView.isXWalkKernel())
    {
      localBitmap = paramAppBrandPageView.getBitmap();
      paramAppBrandPageView = Bitmap.createBitmap(localBitmap, 0, 0, i, j);
      localBitmap.recycle();
      localView.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19814697402368L, 147631);
          this.yV.scrollTo(k, m);
          GMTrace.o(19814697402368L, 147631);
        }
      }, 500L);
    }
    for (;;)
    {
      w.v("MicroMsg.ShareHelper", "crop cover(w : %s, h : %s, x : %s, y : %s)", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
      GMTrace.o(18230391341056L, 135827);
      return paramAppBrandPageView;
      localBitmap = d.cZ(localView);
      paramAppBrandPageView = Bitmap.createBitmap(localBitmap, 0, 0, i, j);
      localBitmap.recycle();
      localView.scrollTo(k, m);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\share\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */