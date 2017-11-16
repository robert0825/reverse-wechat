package com.tencent.mm.plugin.sns.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

public final class f
  extends b
{
  public f(b.a parama, a parama1)
  {
    super(parama, parama1);
    GMTrace.i(8065411710976L, 60092);
    GMTrace.o(8065411710976L, 60092);
  }
  
  public final String HU(String paramString)
  {
    GMTrace.i(8065545928704L, 60093);
    GMTrace.o(8065545928704L, 60093);
    return paramString;
  }
  
  public final boolean a(InputStream paramInputStream, Map<String, List<String>> paramMap)
  {
    GMTrace.i(8065680146432L, 60094);
    w.i("MicroMsg.SnsDownloadSight", "download sight. %s ", new Object[] { com.tencent.mm.modelsfs.f.lf(this.pwX.getPath() + this.pwX.bjO()) });
    Object localObject2 = null;
    OutputStream localOutputStream = null;
    paramMap = localOutputStream;
    Object localObject1 = localObject2;
    try
    {
      byte[] arrayOfByte = new byte['Ѐ'];
      paramMap = localOutputStream;
      localObject1 = localObject2;
      localOutputStream = FileOp.hA(com.tencent.mm.modelsfs.f.lf(this.pwX.getPath() + this.pwX.bjO()));
      paramMap = localOutputStream;
      localObject1 = localOutputStream;
      long l = System.currentTimeMillis();
      paramMap = localOutputStream;
      localObject1 = localOutputStream;
      this.pxi.value = "";
      int i = 0;
      for (;;)
      {
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        int j = paramInputStream.read(arrayOfByte);
        if (j == -1) {
          break;
        }
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        if (j > this.pxj)
        {
          paramMap = localOutputStream;
          localObject1 = localOutputStream;
          this.pxj = j;
          paramMap = localOutputStream;
          localObject1 = localOutputStream;
          this.pxk = bg.Pu();
        }
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        if (this.pxl == 0L)
        {
          paramMap = localOutputStream;
          localObject1 = localOutputStream;
          this.pxl = bg.aH(this.pxm);
        }
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        if (!i.GY(ae.zo()))
        {
          paramMap = localOutputStream;
          localObject1 = localOutputStream;
          localOutputStream.close();
          paramMap = localOutputStream;
          localObject1 = localOutputStream;
          paramInputStream.close();
          if (localOutputStream != null) {}
          try
          {
            localOutputStream.close();
            GMTrace.o(8065680146432L, 60094);
            return false;
          }
          catch (IOException paramInputStream)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.SnsDownloadSight", paramInputStream, "", new Object[0]);
            }
          }
        }
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        localOutputStream.write(arrayOfByte, 0, j);
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        this.pxr += j;
        i = 1;
        paramMap = localOutputStream;
        localObject1 = localOutputStream;
        if (a(this.pxr, l, this.pxi))
        {
          paramMap = localOutputStream;
          localObject1 = localOutputStream;
          l = System.currentTimeMillis();
          i = 0;
        }
      }
      paramMap = localOutputStream;
      localObject1 = localOutputStream;
      localOutputStream.close();
      localObject1 = null;
      paramMap = null;
      if (i != 0) {
        a(this.pxr, 0L, this.pxi);
      }
      GMTrace.o(8065680146432L, 60094);
      return true;
    }
    catch (Exception paramInputStream)
    {
      localObject1 = paramMap;
      w.printErrStackTrace("MicroMsg.SnsDownloadSight", paramInputStream, "snscdndownload fail : " + paramInputStream.getMessage(), new Object[0]);
      localObject1 = paramMap;
      w.printErrStackTrace("MicroMsg.SnsDownloadSight", paramInputStream, "", new Object[0]);
      if (paramMap != null) {}
      try
      {
        paramMap.close();
        GMTrace.o(8065680146432L, 60094);
        return false;
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SnsDownloadSight", paramInputStream, "", new Object[0]);
        }
      }
    }
    finally
    {
      if (localObject1 == null) {}
    }
    try
    {
      ((OutputStream)localObject1).close();
      throw paramInputStream;
    }
    catch (IOException paramMap)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.SnsDownloadSight", paramMap, "", new Object[0]);
      }
    }
  }
  
  public final boolean bjQ()
  {
    GMTrace.i(8065814364160L, 60095);
    String str = i.j(this.eUs);
    FileOp.g(this.pwX.getPath(), this.pwX.bjO(), str);
    GMTrace.o(8065814364160L, 60095);
    return true;
  }
  
  protected final int bjR()
  {
    GMTrace.i(8065948581888L, 60096);
    GMTrace.o(8065948581888L, 60096);
    return 2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */