package com.tencent.mm.plugin.sns.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
  private static Map<String, a> pBI;
  private static volatile long pBJ;
  
  static
  {
    GMTrace.i(8886824206336L, 66212);
    pBI = new ConcurrentHashMap();
    pBJ = 0L;
    GMTrace.o(8886824206336L, 66212);
  }
  
  private static String Ic(String paramString)
  {
    GMTrace.i(8886287335424L, 66208);
    int i = paramString.indexOf('?');
    String str = paramString;
    if (i >= 0) {
      str = paramString.substring(0, i);
    }
    i = str.indexOf("://");
    paramString = str;
    if (i >= 0) {
      paramString = str.substring(i + 3);
    }
    i = paramString.indexOf('/');
    if (i >= 0)
    {
      paramString = paramString.substring(i + 1);
      GMTrace.o(8886287335424L, 66208);
      return paramString;
    }
    GMTrace.o(8886287335424L, 66208);
    return paramString;
  }
  
  public static void V(String paramString, long paramLong)
  {
    GMTrace.i(8886689988608L, 66211);
    try
    {
      paramString = (a)pBI.remove(paramString);
      if (paramString == null)
      {
        bjY();
        GMTrace.o(8886689988608L, 66211);
        return;
      }
      paramString.pBP = paramLong;
      StringBuilder localStringBuilder = new StringBuilder(1024);
      localStringBuilder.append(paramString.pBK).append(',').append(paramString.pBL).append(',').append(paramString.mMimeType).append(',').append(paramString.mWidth).append(',').append(paramString.mHeight).append(',').append(paramString.pBM).append(',').append(paramString.pBN).append(',').append(paramString.pBO).append(',').append(paramString.pBP);
      paramString = localStringBuilder.toString();
      w.i("MicroMsg.SnsImgStats", "report dl: " + paramString);
      g.ork.A(13513, paramString);
      bjY();
      GMTrace.o(8886689988608L, 66211);
      return;
    }
    catch (Exception paramString)
    {
      bjY();
      GMTrace.o(8886689988608L, 66211);
      return;
    }
    finally
    {
      bjY();
    }
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    GMTrace.i(8886421553152L, 66209);
    try
    {
      b localb = new b();
      localb.pBK = Ic(paramString1);
      localb.mMimeType = paramString2;
      localb.mWidth = paramInt1;
      localb.mHeight = paramInt2;
      localb.pBM = paramInt3;
      localb.pBN = paramLong;
      paramString1 = new StringBuilder(1024);
      paramString1.append(localb.pBK).append(',').append(localb.mMimeType).append(',').append(localb.mWidth).append(',').append(localb.mHeight).append(',').append(localb.pBM).append(',').append(localb.pBN);
      paramString1 = paramString1.toString();
      w.i("MicroMsg.SnsImgStats", "report up: " + paramString1);
      g.ork.A(13512, paramString1);
      GMTrace.o(8886421553152L, 66209);
      return;
    }
    catch (Exception paramString1)
    {
      GMTrace.o(8886421553152L, 66209);
    }
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2)
  {
    GMTrace.i(8886555770880L, 66210);
    try
    {
      a locala = new a();
      locala.pBK = Ic(paramString2);
      locala.pBL = paramInt1;
      locala.mMimeType = paramString3;
      locala.mWidth = paramInt2;
      locala.mHeight = paramInt3;
      locala.pBM = paramInt4;
      locala.pBN = paramLong1;
      locala.pBO = paramLong2;
      pBI.put(paramString1, locala);
      GMTrace.o(8886555770880L, 66210);
      return;
    }
    catch (Exception paramString1)
    {
      GMTrace.o(8886555770880L, 66210);
    }
  }
  
  private static void bjY()
  {
    GMTrace.i(8886153117696L, 66207);
    synchronized (pBI)
    {
      if (bg.aI(pBJ) <= 120000L)
      {
        GMTrace.o(8886153117696L, 66207);
        return;
      }
      pBJ = bg.Pw();
      pBI.clear();
      GMTrace.o(8886153117696L, 66207);
      return;
    }
  }
  
  private static final class a
  {
    public int mHeight;
    public String mMimeType;
    public int mWidth;
    public String pBK;
    public int pBL;
    public int pBM;
    public long pBN;
    public long pBO;
    public long pBP;
    
    public a()
    {
      GMTrace.i(8885750464512L, 66204);
      this.pBK = "";
      this.pBL = 0;
      this.mMimeType = "";
      this.mWidth = -1;
      this.mHeight = -1;
      this.pBM = -1;
      this.pBN = -1L;
      this.pBO = -1L;
      this.pBP = -1L;
      GMTrace.o(8885750464512L, 66204);
    }
  }
  
  private static final class b
  {
    public int mHeight;
    public String mMimeType;
    public int mWidth;
    public String pBK;
    public int pBM;
    public long pBN;
    
    public b()
    {
      GMTrace.i(8880650190848L, 66166);
      this.pBK = "";
      this.mMimeType = "";
      this.mWidth = -1;
      this.mHeight = -1;
      this.pBM = -1;
      this.pBN = -1L;
      GMTrace.o(8880650190848L, 66166);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\h\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */