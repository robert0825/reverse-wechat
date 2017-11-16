package com.tencent.mm.plugin.sns.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.f;
import com.tencent.mm.network.u;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.b.3;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

public final class c
  extends b
{
  private long pxs;
  private int pxt;
  
  public c(b.a parama, a parama1)
  {
    super(parama, parama1);
    GMTrace.i(8066485452800L, 60100);
    this.pxs = 0L;
    this.pxt = 0;
    GMTrace.o(8066485452800L, 60100);
  }
  
  public final String HU(String paramString)
  {
    GMTrace.i(8066619670528L, 60101);
    GMTrace.o(8066619670528L, 60101);
    return paramString;
  }
  
  public final boolean a(InputStream paramInputStream, Map<String, List<String>> paramMap)
  {
    GMTrace.i(8067022323712L, 60104);
    com.tencent.mm.plugin.sns.model.b localb = null;
    OutputStream localOutputStream = null;
    paramMap = localOutputStream;
    Object localObject = localb;
    try
    {
      byte[] arrayOfByte = new byte['Ѐ'];
      paramMap = localOutputStream;
      localObject = localb;
      String str1 = this.pwX.getPath() + this.pwX.bjO();
      paramMap = localOutputStream;
      localObject = localb;
      long l = FileOp.kX(f.lf(str1));
      paramMap = localOutputStream;
      localObject = localb;
      w.i("MicroMsg.SnsDownloadAdSight", "getdatabegin " + l);
      paramMap = localOutputStream;
      localObject = localb;
      localOutputStream = FileOp.kV(str1);
      paramMap = localOutputStream;
      localObject = localOutputStream;
      l = System.currentTimeMillis();
      paramMap = localOutputStream;
      localObject = localOutputStream;
      this.pxi.value = "";
      int j = 1;
      int i = 0;
      for (;;)
      {
        paramMap = localOutputStream;
        localObject = localOutputStream;
        int k = paramInputStream.read(arrayOfByte);
        if (k == -1) {
          break;
        }
        paramMap = localOutputStream;
        localObject = localOutputStream;
        if (this.pxl == 0L)
        {
          paramMap = localOutputStream;
          localObject = localOutputStream;
          this.pxl = bg.aH(this.pxm);
        }
        paramMap = localOutputStream;
        localObject = localOutputStream;
        if (k > this.pxj)
        {
          paramMap = localOutputStream;
          localObject = localOutputStream;
          this.pxj = k;
          paramMap = localOutputStream;
          localObject = localOutputStream;
          this.pxk = bg.Pu();
        }
        paramMap = localOutputStream;
        localObject = localOutputStream;
        if (!i.GY(com.tencent.mm.plugin.sns.model.ae.zo()))
        {
          paramMap = localOutputStream;
          localObject = localOutputStream;
          w.i("MicroMsg.SnsDownloadAdSight", "read data");
          paramMap = localOutputStream;
          localObject = localOutputStream;
          localOutputStream.close();
          paramMap = localOutputStream;
          localObject = localOutputStream;
          paramInputStream.close();
          if (localOutputStream != null) {}
          try
          {
            localOutputStream.close();
            GMTrace.o(8067022323712L, 60104);
            return false;
          }
          catch (IOException paramInputStream)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "", new Object[0]);
            }
          }
        }
        paramMap = localOutputStream;
        localObject = localOutputStream;
        localOutputStream.write(arrayOfByte, 0, k);
        paramMap = localOutputStream;
        localObject = localOutputStream;
        this.pxr += k;
        k = j;
        paramMap = localOutputStream;
        localObject = localOutputStream;
        if (this.pxr - this.pxt > 409600 * j)
        {
          paramMap = localOutputStream;
          localObject = localOutputStream;
          localb = com.tencent.mm.plugin.sns.model.ae.biY();
          paramMap = localOutputStream;
          localObject = localOutputStream;
          String str2 = this.pwX.mediaId;
          paramMap = localOutputStream;
          localObject = localOutputStream;
          com.tencent.mm.plugin.sns.model.ae.aDa().post(new b.3(localb, str2, str1));
          paramMap = localOutputStream;
          localObject = localOutputStream;
          this.pxt = this.pxr;
          k = j + 1;
        }
        i = 1;
        j = k;
        paramMap = localOutputStream;
        localObject = localOutputStream;
        if (a(this.pxr, l, this.pxi))
        {
          paramMap = localOutputStream;
          localObject = localOutputStream;
          l = System.currentTimeMillis();
          i = 0;
          j = k;
        }
      }
      paramMap = localOutputStream;
      localObject = localOutputStream;
      localOutputStream.close();
      localObject = null;
      paramMap = null;
      if (i != 0) {
        a(this.pxr, 0L, this.pxi);
      }
      l = FileOp.kX(this.pwX.getPath() + this.pwX.bjO());
      w.i("MicroMsg.SnsDownloadAdSight", "getdataend2  " + l);
      GMTrace.o(8067022323712L, 60104);
      return true;
    }
    catch (Exception paramInputStream)
    {
      localObject = paramMap;
      w.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "snscdndownload fail : " + paramInputStream.getMessage(), new Object[0]);
      localObject = paramMap;
      w.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "", new Object[0]);
      if (paramMap != null) {}
      try
      {
        paramMap.close();
        GMTrace.o(8067022323712L, 60104);
        return false;
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramInputStream, "", new Object[0]);
        }
      }
    }
    finally
    {
      if (localObject == null) {}
    }
    try
    {
      ((OutputStream)localObject).close();
      throw paramInputStream;
    }
    catch (IOException paramMap)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.SnsDownloadAdSight", paramMap, "", new Object[0]);
      }
    }
  }
  
  public final u b(u paramu)
  {
    GMTrace.i(8066888105984L, 60103);
    this.pxs = FileOp.kX(this.pwX.getPath() + this.pwX.bjO());
    if (this.pxs > 0L)
    {
      w.i("MicroMsg.SnsDownloadAdSight", "appendHttpArg range " + this.pxs);
      paramu.setRequestProperty("RANGE", "bytes=" + this.pxs + "-");
    }
    GMTrace.o(8066888105984L, 60103);
    return paramu;
  }
  
  public final boolean bjP()
  {
    GMTrace.i(8066753888256L, 60102);
    GMTrace.o(8066753888256L, 60102);
    return false;
  }
  
  public final boolean bjQ()
  {
    GMTrace.i(8067156541440L, 60105);
    long l = FileOp.kX(this.pwX.getPath() + this.pwX.bjO());
    w.i("MicroMsg.SnsDownloadAdSight", "preceeData  downloadLen " + l + " " + this.pxo);
    if (l < this.pxo + this.pxs)
    {
      GMTrace.o(8067156541440L, 60105);
      return false;
    }
    String str = i.k(this.eUs);
    FileOp.g(this.pwX.getPath(), this.pwX.bjO(), str);
    GMTrace.o(8067156541440L, 60105);
    return true;
  }
  
  protected final int bjR()
  {
    GMTrace.i(8067290759168L, 60106);
    GMTrace.o(8067290759168L, 60106);
    return 4;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */