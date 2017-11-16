package com.tencent.mm.plugin.appbrand.dynamic.i;

import android.webkit.URLUtil;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgItemInfo;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.o;
import com.tencent.mm.plugin.appbrand.appcache.p;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetContext;
import com.tencent.mm.plugin.appbrand.dynamic.h;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.pluginsdk.ui.tools.s.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.k;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class c
{
  private static WxaPkgWrappingInfo a(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    GMTrace.i(17721169281024L, 132033);
    if (paramWxaPkgWrappingInfo == null)
    {
      GMTrace.o(17721169281024L, 132033);
      return null;
    }
    if ((paramWxaPkgWrappingInfo.hKE) || (bg.cc(paramWxaPkgWrappingInfo.hKH)))
    {
      GMTrace.o(17721169281024L, 132033);
      return paramWxaPkgWrappingInfo;
    }
    if (paramWxaPkgWrappingInfo.hKG != null)
    {
      GMTrace.o(17721169281024L, 132033);
      return paramWxaPkgWrappingInfo;
    }
    try
    {
      if (paramWxaPkgWrappingInfo.hKG == null)
      {
        paramWxaPkgWrappingInfo.hKG = new HashMap(paramWxaPkgWrappingInfo.hKH.size());
        Iterator localIterator = paramWxaPkgWrappingInfo.hKH.iterator();
        while (localIterator.hasNext())
        {
          WxaPkgItemInfo localWxaPkgItemInfo = (WxaPkgItemInfo)localIterator.next();
          paramWxaPkgWrappingInfo.hKG.put(localWxaPkgItemInfo.euR, localWxaPkgItemInfo);
        }
      }
    }
    finally {}
    GMTrace.o(17721169281024L, 132033);
    return paramWxaPkgWrappingInfo;
  }
  
  private static k a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    GMTrace.i(19984214392832L, 148894);
    for (;;)
    {
      Object localObject;
      try
      {
        localObject = new RandomAccessFile(new File(paramString1), "r").getChannel().map(FileChannel.MapMode.READ_ONLY, paramInt1, paramInt2);
        ((MappedByteBuffer)localObject).order(p.hJk);
        ((MappedByteBuffer)localObject).limit(paramInt2);
        com.tencent.mm.plugin.appbrand.i.a locala = new com.tencent.mm.plugin.appbrand.i.a((ByteBuffer)localObject);
        paramString2 = s.PQ(paramString2);
        localObject = "UTF-8";
        paramString3 = s.a.PS(paramString3);
        if (paramString3 == null)
        {
          break label161;
          paramString2 = new k(paramString2, paramString3, locala);
          GMTrace.o(19984214392832L, 148894);
          return paramString2;
        }
        else
        {
          paramString2 = paramString3.mimeType;
        }
      }
      catch (IOException paramString2)
      {
        w.e("MicroMsg.ResPkgReader", "tryHitWxaPkgFile with pkgPath(%s), exp = %s", new Object[] { paramString1, bg.f(paramString2) });
        GMTrace.o(19984214392832L, 148894);
        return null;
      }
      paramString3 = paramString3.charset;
      continue;
      label161:
      if (paramString3 == null) {
        paramString3 = (String)localObject;
      }
    }
  }
  
  public static String aW(String paramString1, String paramString2)
  {
    GMTrace.i(17721437716480L, 132035);
    if (bg.nm(paramString2))
    {
      GMTrace.o(17721437716480L, 132035);
      return "";
    }
    k localk = aX(paramString1, paramString2);
    if (localk != null) {
      try
      {
        w.d("MicroMsg.ResPkgReader", "getCacheContent, dataStream available = %d, url = %s", new Object[] { Integer.valueOf(localk.mInputStream.available()), paramString2 });
        paramString1 = convertStreamToString(localk.mInputStream);
        GMTrace.o(17721437716480L, 132035);
        return paramString1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.ResPkgReader", "getCacheContent exp = %s, id = %s, url = %s", new Object[] { localException, paramString1, paramString2 });
        }
      }
    }
    w.e("MicroMsg.ResPkgReader", "get cache content for id : %s from url : %s, failed", new Object[] { paramString1, paramString2 });
    GMTrace.o(17721437716480L, 132035);
    return "";
  }
  
  public static k aX(String paramString1, String paramString2)
  {
    GMTrace.i(19984348610560L, 148895);
    w.i("MicroMsg.ResPkgReader", "getCacheResource called, id = %s, reqURL = %s", new Object[] { paramString1, paramString2 });
    if (bg.nm(paramString2))
    {
      GMTrace.o(19984348610560L, 148895);
      return null;
    }
    if (s.eK(paramString2, "about:blank"))
    {
      GMTrace.o(19984348610560L, 148895);
      return null;
    }
    int i;
    Object localObject2;
    Object localObject1;
    if ((!bg.nm(paramString2)) && ((URLUtil.isHttpsUrl(paramString2)) || (URLUtil.isHttpUrl(paramString2))))
    {
      i = 1;
      if (i != 0) {
        break label594;
      }
      localObject2 = com.tencent.mm.plugin.appbrand.appcache.a.ok(paramString2);
      localObject1 = h.pI(paramString1);
      if (localObject1 == null) {
        break label186;
      }
      localObject1 = a(((WxaWidgetContext)localObject1).UQ());
      label115:
      if (localObject1 != null) {
        break label191;
      }
      w.e("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, get null appInfo by id %s", new Object[] { paramString1 });
      localObject2 = null;
      label138:
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = h.pI(paramString1);
        if (localObject1 == null) {
          break label387;
        }
        localObject1 = a(((WxaWidgetContext)localObject1).UR());
        label165:
        if (localObject1 != null) {
          break label392;
        }
        localObject1 = null;
      }
    }
    for (;;)
    {
      GMTrace.o(19984348610560L, 148895);
      return (k)localObject1;
      i = 0;
      break;
      label186:
      localObject1 = null;
      break label115;
      label191:
      if ((bg.nm(((WxaPkgWrappingInfo)localObject1).hKI)) || (((WxaPkgWrappingInfo)localObject1).hKG == null))
      {
        w.e("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, get Null Or Nil pkgPath[%s] pkgFileInfoMap[%s] by appId %s", new Object[] { ((WxaPkgWrappingInfo)localObject1).hKI, ((WxaPkgWrappingInfo)localObject1).hKG, paramString1 });
        localObject2 = null;
        break label138;
      }
      WxaPkgItemInfo localWxaPkgItemInfo = (WxaPkgItemInfo)((WxaPkgWrappingInfo)localObject1).hKG.get(localObject2);
      if (localWxaPkgItemInfo == null)
      {
        w.v("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, fileInfo not found with id(%s), fileName(%s)", new Object[] { paramString1, localObject2 });
        localObject2 = null;
        break label138;
      }
      localObject1 = ((WxaPkgWrappingInfo)localObject1).hKI;
      if (bg.nm((String)localObject1))
      {
        w.e("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, get null or nil pkgLocalPath");
        localObject2 = null;
        break label138;
      }
      w.d("MicroMsg.ResPkgReader", "tryHitWxaPkgFile, id(%s), fileName(%s), offset = %d, length = %d", new Object[] { paramString1, localObject2, Integer.valueOf(localWxaPkgItemInfo.hJU), Integer.valueOf(localWxaPkgItemInfo.hJT) });
      localObject2 = a((String)localObject1, (String)localObject2, localWxaPkgItemInfo.eYU, localWxaPkgItemInfo.hJU, localWxaPkgItemInfo.hJT);
      break label138;
      label387:
      localObject1 = null;
      break label165;
      label392:
      if (((WxaPkgWrappingInfo)localObject1).hKE)
      {
        paramString1 = o.openRead(paramString2);
        if (paramString1 != null) {
          localObject1 = new k(s.PQ(paramString2), "UTF-8", paramString1);
        } else {
          localObject1 = null;
        }
      }
      else if ((bg.nm(((WxaPkgWrappingInfo)localObject1).hKI)) || (((WxaPkgWrappingInfo)localObject1).hKG == null))
      {
        w.e("MicroMsg.ResPkgReader", "tryHitLibWxaPkgFile, pkgPath[%s] or pkgFileInfoMap[%s] is Null Or Nil", new Object[] { ((WxaPkgWrappingInfo)localObject1).hKI, ((WxaPkgWrappingInfo)localObject1).hKG });
        localObject1 = null;
      }
      else
      {
        paramString2 = com.tencent.mm.plugin.appbrand.appcache.a.ok(paramString2);
        localObject2 = (WxaPkgItemInfo)((WxaPkgWrappingInfo)localObject1).hKG.get(paramString2);
        if (localObject2 == null)
        {
          w.v("MicroMsg.ResPkgReader", "tryHitLibWxaPkgFile, fileInfo not found with fileName(%s)", new Object[] { paramString2 });
          localObject1 = null;
        }
        else
        {
          w.d("MicroMsg.ResPkgReader", "tryHitLibWxaPkgFile, id(%s), fileName(%s), offset = %d, length = %d", new Object[] { paramString1, paramString2, Integer.valueOf(((WxaPkgItemInfo)localObject2).hJU), Integer.valueOf(((WxaPkgItemInfo)localObject2).hJT) });
          localObject1 = a(((WxaPkgWrappingInfo)localObject1).hKI, paramString2, ((WxaPkgItemInfo)localObject2).eYU, ((WxaPkgItemInfo)localObject2).hJU, ((WxaPkgItemInfo)localObject2).hJT);
        }
      }
    }
    label594:
    GMTrace.o(19984348610560L, 148895);
    return null;
  }
  
  public static String convertStreamToString(InputStream paramInputStream)
  {
    GMTrace.i(17721706151936L, 132037);
    if (paramInputStream == null)
    {
      GMTrace.o(17721706151936L, 132037);
      return "";
    }
    paramInputStream = new InputStreamReader(paramInputStream);
    char[] arrayOfChar = new char['က'];
    StringWriter localStringWriter = new StringWriter();
    try
    {
      for (;;)
      {
        int i = paramInputStream.read(arrayOfChar);
        if (-1 == i) {
          break;
        }
        localStringWriter.write(arrayOfChar, 0, i);
      }
      try
      {
        paramInputStream.close();
        throw ((Throwable)localObject);
      }
      catch (Exception paramInputStream)
      {
        for (;;)
        {
          w.e("MicroMsg.ResPkgReader", "convertStreamToString: close, %s", new Object[] { paramInputStream.getMessage() });
        }
      }
    }
    catch (Exception localException)
    {
      localException = localException;
      w.e("MicroMsg.ResPkgReader", "convertStreamToString: read, %s", new Object[] { localException.getMessage() });
      try
      {
        paramInputStream.close();
        GMTrace.o(17721706151936L, 132037);
        return "";
        try
        {
          paramInputStream.close();
          paramInputStream = localException.toString();
          GMTrace.o(17721706151936L, 132037);
          return paramInputStream;
        }
        catch (Exception paramInputStream)
        {
          for (;;)
          {
            w.e("MicroMsg.ResPkgReader", "convertStreamToString: close, %s", new Object[] { paramInputStream.getMessage() });
          }
        }
      }
      catch (Exception paramInputStream)
      {
        for (;;)
        {
          w.e("MicroMsg.ResPkgReader", "convertStreamToString: close, %s", new Object[] { paramInputStream.getMessage() });
        }
      }
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\i\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */