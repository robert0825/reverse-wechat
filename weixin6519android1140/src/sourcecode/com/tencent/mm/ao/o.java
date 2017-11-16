package com.tencent.mm.ao;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.AsyncTask;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class o
  implements b.c
{
  List<c> gJM;
  public c gJN;
  public boolean gJO;
  
  public o()
  {
    GMTrace.i(3528181415936L, 26287);
    this.gJM = new LinkedList();
    this.gJN = null;
    this.gJO = false;
    GMTrace.o(3528181415936L, 26287);
  }
  
  public static String km(String paramString)
  {
    GMTrace.i(3528584069120L, 26290);
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      if (bg.nm(str))
      {
        w.e("MicroMsg.UrlImageCacheService", "encode result is null: " + paramString);
        GMTrace.o(3528584069120L, 26290);
        return null;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      w.e("MicroMsg.UrlImageCacheService", "try encode unsupport character: " + paramString);
      GMTrace.o(3528584069120L, 26290);
      return null;
    }
    paramString = new StringBuilder();
    paramString.append(e.fRY);
    int j = localUnsupportedEncodingException.length();
    int i = 0;
    while (i < j)
    {
      paramString.append('/');
      if (i + 20 < j)
      {
        paramString.append(localUnsupportedEncodingException.substring(i, i + 20));
        i += 20;
      }
      else
      {
        paramString.append(localUnsupportedEncodingException.substring(i, j));
        i = j;
      }
    }
    paramString = paramString.toString();
    GMTrace.o(3528584069120L, 26290);
    return paramString;
  }
  
  public final void Jg()
  {
    GMTrace.i(3528449851392L, 26289);
    for (;;)
    {
      if ((this.gJN != null) || (this.gJM.size() == 0))
      {
        w.d("MicroMsg.UrlImageCacheService", "task is downing or no more task");
        GMTrace.o(3528449851392L, 26289);
        return;
      }
      this.gJN = ((c)this.gJM.get(0));
      this.gJM.remove(0);
      this.gJO = false;
      n.IY();
      Bitmap localBitmap = b.hC(this.gJN.url);
      if (localBitmap == null) {
        break;
      }
      w.d("MicroMsg.UrlImageCacheService", "find bitmap in cache of " + this.gJN.url);
      if (!this.gJO) {
        this.gJN.gJQ.g(this.gJN.url, localBitmap);
      }
      this.gJN = null;
    }
    new AsyncTask() {}.execute(new String[] { this.gJN.url });
    GMTrace.o(3528449851392L, 26289);
  }
  
  public final void a(String paramString, a parama)
  {
    GMTrace.i(3528315633664L, 26288);
    if ((bg.nm(paramString)) || (parama == null))
    {
      w.e("MicroMsg.UrlImageCacheService", "url is null or nil, or callback is null");
      GMTrace.o(3528315633664L, 26288);
      return;
    }
    if ((this.gJN != null) && (this.gJN.url.equals(paramString)) && (this.gJN.gJQ == parama))
    {
      w.e("MicroMsg.UrlImageCacheService", "url and callback is loading");
      GMTrace.o(3528315633664L, 26288);
      return;
    }
    Iterator localIterator = this.gJM.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if ((localc.url.equals(paramString)) && (localc.gJQ == parama))
      {
        w.e("MicroMsg.UrlImageCacheService", "url and callback is loading");
        GMTrace.o(3528315633664L, 26288);
        return;
      }
    }
    this.gJM.add(new c(paramString, parama));
    Jg();
    GMTrace.o(3528315633664L, 26288);
  }
  
  public final void n(Bitmap paramBitmap)
  {
    GMTrace.i(3528718286848L, 26291);
    if (paramBitmap == null)
    {
      w.e("MicroMsg.UrlImageCacheService", "load from url failed: " + this.gJN.url);
      this.gJN = null;
      Jg();
      GMTrace.o(3528718286848L, 26291);
      return;
    }
    w.i("MicroMsg.UrlImageCacheService", "load from %s successed", new Object[] { this.gJN.url });
    new AsyncTask()new b
    {
      private static Integer a(o.b... paramAnonymousVarArgs)
      {
        GMTrace.i(3512880594944L, 26173);
        if ((paramAnonymousVarArgs.length == 0) || (bg.nm(paramAnonymousVarArgs[0].path)) || (paramAnonymousVarArgs[0].bitmap == null))
        {
          w.e("MicroMsg.UrlImageCacheService", "nothing to save");
          GMTrace.o(3512880594944L, 26173);
          return null;
        }
        try
        {
          d.a(paramAnonymousVarArgs[0].bitmap, 100, Bitmap.CompressFormat.PNG, paramAnonymousVarArgs[0].path, false);
          GMTrace.o(3512880594944L, 26173);
          return null;
        }
        catch (IOException paramAnonymousVarArgs)
        {
          for (;;)
          {
            w.e("MicroMsg.UrlImageCacheService", "save bitmap to image failed: " + paramAnonymousVarArgs.toString());
          }
        }
      }
    }.execute(new b[] { new b(km(this.gJN.url), paramBitmap) });
    if (!this.gJO)
    {
      n.IY();
      b.f(this.gJN.url, paramBitmap);
      this.gJN.gJQ.g(this.gJN.url, paramBitmap);
    }
    this.gJN = null;
    Jg();
    GMTrace.o(3528718286848L, 26291);
  }
  
  public static abstract interface a
  {
    public abstract void g(String paramString, Bitmap paramBitmap);
  }
  
  private static final class b
  {
    public Bitmap bitmap;
    public String path;
    
    public b(String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(3541468971008L, 26386);
      this.path = paramString;
      this.bitmap = paramBitmap;
      GMTrace.o(3541468971008L, 26386);
    }
  }
  
  private static final class c
  {
    public o.a gJQ;
    public String url;
    
    public c(String paramString, o.a parama)
    {
      GMTrace.i(3519054610432L, 26219);
      this.url = paramString;
      this.gJQ = parama;
      GMTrace.o(3519054610432L, 26219);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */