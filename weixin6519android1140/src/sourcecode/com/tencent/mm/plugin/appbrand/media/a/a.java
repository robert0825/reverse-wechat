package com.tencent.mm.plugin.appbrand.media.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ab.d;
import com.tencent.mm.plugin.appbrand.appcache.p;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class a
  implements d
{
  private long currentPosition;
  private String filePath;
  private String hKI;
  public com.tencent.mm.plugin.appbrand.i.a irK;
  
  public a(String paramString1, String paramString2)
  {
    GMTrace.i(20748450136064L, 154588);
    this.irK = null;
    this.filePath = paramString1;
    this.hKI = paramString2;
    this.irK = bf(paramString1, paramString2);
    GMTrace.o(20748450136064L, 154588);
  }
  
  private static com.tencent.mm.plugin.appbrand.i.a bf(String paramString1, String paramString2)
  {
    GMTrace.i(20748718571520L, 154590);
    long l = System.nanoTime();
    if (bg.nm(paramString2))
    {
      w.e("MicroMsg.WxaAudioDataSource", "pkgpath is null, return");
      GMTrace.o(20748718571520L, 154590);
      return null;
    }
    paramString2 = new p(new File(paramString2));
    if (!paramString2.hJn)
    {
      paramString2.close();
      w.e("MicroMsg.WxaAudioDataSource", "pkg invalid");
      GMTrace.o(20748718571520L, 154590);
      return null;
    }
    if (!paramString2.SH())
    {
      paramString2.close();
      w.e("MicroMsg.WxaAudioDataSource", "pkg readInfo failed");
      GMTrace.o(20748718571520L, 154590);
      return null;
    }
    InputStream localInputStream = paramString2.op(paramString1);
    if (localInputStream == null)
    {
      paramString2.close();
      w.e("MicroMsg.WxaAudioDataSource", "inputstream for %s is null", new Object[] { paramString1 });
      GMTrace.o(20748718571520L, 154590);
      return null;
    }
    paramString2.close();
    w.e("MicroMsg.WxaAudioDataSource", "time:%d", new Object[] { Long.valueOf(System.nanoTime() - l) });
    paramString1 = (com.tencent.mm.plugin.appbrand.i.a)localInputStream;
    GMTrace.o(20748718571520L, 154590);
    return paramString1;
  }
  
  public final void close()
  {
    GMTrace.i(20749255442432L, 154594);
    w.i("MicroMsg.WxaAudioDataSource", "close");
    if (this.irK != null)
    {
      this.irK.close();
      this.irK = null;
    }
    GMTrace.o(20749255442432L, 154594);
  }
  
  public final int getAudioType()
  {
    GMTrace.i(20749121224704L, 154593);
    if (this.irK == null) {
      this.irK = bf(this.filePath, this.hKI);
    }
    if (this.irK == null)
    {
      w.e("MicroMsg.WxaAudioDataSource", "[getAudioType] inputStream is null");
      GMTrace.o(20749121224704L, 154593);
      return 0;
    }
    if (this.filePath.toLowerCase().endsWith(".mp3"))
    {
      w.d("MicroMsg.WxaAudioDataSource", "[getAudioType] mp3");
      GMTrace.o(20749121224704L, 154593);
      return 2;
    }
    try
    {
      localObject1 = new byte[64];
      this.irK.mark(0);
      this.irK.reset();
      this.irK.read((byte[])localObject1);
      localObject1 = new String((byte[])localObject1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        w.e("MicroMsg.WxaAudioDataSource", "getAudioType", new Object[] { localException });
        this.irK.reset();
        Object localObject2 = null;
      }
    }
    finally
    {
      this.irK.reset();
    }
    if ((localObject1 != null) && (((String)localObject1).contains("ftyp")))
    {
      w.d("MicroMsg.WxaAudioDataSource", "[getAudioType] aac");
      GMTrace.o(20749121224704L, 154593);
      return 1;
    }
    GMTrace.o(20749121224704L, 154593);
    return 0;
  }
  
  public final long getSize()
  {
    GMTrace.i(20748987006976L, 154592);
    if (this.irK == null)
    {
      w.e("MicroMsg.WxaAudioDataSource", "[getSize] inputStream is null");
      GMTrace.o(20748987006976L, 154592);
      return 0L;
    }
    com.tencent.mm.plugin.appbrand.i.a locala = this.irK;
    if (locala.ixV.hasRemaining())
    {
      long l = locala.ixV.limit();
      GMTrace.o(20748987006976L, 154592);
      return l;
    }
    GMTrace.o(20748987006976L, 154592);
    return -1L;
  }
  
  public final void open()
  {
    GMTrace.i(20748584353792L, 154589);
    w.i("MicroMsg.WxaAudioDataSource", "open");
    if (this.irK == null) {
      this.irK = bf(this.filePath, this.hKI);
    }
    this.currentPosition = 0L;
    if (this.irK != null)
    {
      this.irK.mark(0);
      this.irK.reset();
    }
    GMTrace.o(20748584353792L, 154589);
  }
  
  public final int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    GMTrace.i(20748852789248L, 154591);
    if (this.irK == null)
    {
      w.e("MicroMsg.WxaAudioDataSource", "[readAt]inputstream is null");
      GMTrace.o(20748852789248L, 154591);
      return -1;
    }
    if (this.currentPosition != paramLong)
    {
      this.irK.mark((int)paramLong);
      this.irK.reset();
      this.currentPosition = paramLong;
    }
    paramInt1 = this.irK.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 >= 0) {
      this.currentPosition += paramInt1;
    }
    GMTrace.o(20748852789248L, 154591);
    return paramInt1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\media\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */