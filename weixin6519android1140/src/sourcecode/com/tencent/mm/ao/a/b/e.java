package com.tencent.mm.ao.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ao.a.c.k;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class e
  implements k
{
  public e()
  {
    GMTrace.i(13719199285248L, 102216);
    GMTrace.o(13719199285248L, 102216);
  }
  
  public static byte[] a(InputStream paramInputStream, boolean paramBoolean)
  {
    GMTrace.i(13719870373888L, 102221);
    byte[] arrayOfByte = new byte['Ѐ'];
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    arrayOfByte = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.close();
    if (!paramBoolean) {
      paramInputStream.close();
    }
    GMTrace.o(13719870373888L, 102221);
    return arrayOfByte;
  }
  
  public static byte[] h(InputStream paramInputStream)
  {
    GMTrace.i(13719736156160L, 102220);
    paramInputStream = a(paramInputStream, false);
    GMTrace.o(13719736156160L, 102220);
    return paramInputStream;
  }
  
  public final boolean a(String paramString, InputStream paramInputStream)
  {
    GMTrace.i(13719601938432L, 102219);
    if (paramInputStream == null)
    {
      w.w("MicroMsg.DefaultImageMD5CheckListener", "hy: inputStream is null. check failed");
      GMTrace.o(13719601938432L, 102219);
      return false;
    }
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
      GMTrace.o(13719601938432L, 102219);
      return false;
    }
    try
    {
      paramInputStream = aa.bn(a(paramInputStream, true));
      if ((!bg.nm(paramInputStream)) && (paramInputStream.equals(paramString)))
      {
        w.i("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check success");
        GMTrace.o(13719601938432L, 102219);
        return true;
      }
      w.w("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", new Object[] { paramInputStream, paramString });
      GMTrace.o(13719601938432L, 102219);
      return false;
    }
    catch (Exception paramString)
    {
      w.w("MicroMsg.DefaultImageMD5CheckListener", "hy: exception: " + paramString.toString());
      GMTrace.o(13719601938432L, 102219);
    }
    return false;
  }
  
  public final boolean ae(String paramString1, String paramString2)
  {
    GMTrace.i(13719333502976L, 102217);
    if (bg.nm(paramString2))
    {
      w.w("MicroMsg.DefaultImageMD5CheckListener", "hy: filePath is null. check failed");
      GMTrace.o(13719333502976L, 102217);
      return false;
    }
    if (bg.nm(paramString1))
    {
      w.w("MicroMsg.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
      GMTrace.o(13719333502976L, 102217);
      return false;
    }
    paramString2 = g.bg(paramString2);
    if ((!bg.nm(paramString2)) && (paramString2.equals(paramString1)))
    {
      w.i("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check success");
      GMTrace.o(13719333502976L, 102217);
      return true;
    }
    w.w("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", new Object[] { paramString2, paramString1 });
    GMTrace.o(13719333502976L, 102217);
    return false;
  }
  
  public final boolean i(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(13719467720704L, 102218);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
      GMTrace.o(13719467720704L, 102218);
      return false;
    }
    paramArrayOfByte = aa.bn(paramArrayOfByte);
    if ((!bg.nm(paramArrayOfByte)) && (paramArrayOfByte.equals(paramString)))
    {
      w.i("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check success");
      GMTrace.o(13719467720704L, 102218);
      return true;
    }
    w.w("MicroMsg.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", new Object[] { paramArrayOfByte, paramString });
    GMTrace.o(13719467720704L, 102218);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */