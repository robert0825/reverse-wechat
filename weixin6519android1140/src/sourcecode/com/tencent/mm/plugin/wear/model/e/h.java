package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.protocal.c.bsa;
import com.tencent.mm.protocal.c.bsb;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class h
  extends a
{
  public h()
  {
    GMTrace.i(9199551512576L, 68542);
    GMTrace.o(9199551512576L, 68542);
  }
  
  public final List<Integer> bBA()
  {
    GMTrace.i(9199685730304L, 68543);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11000));
    localArrayList.add(Integer.valueOf(11003));
    localArrayList.add(Integer.valueOf(11035));
    GMTrace.o(9199685730304L, 68543);
    return localArrayList;
  }
  
  public final boolean bBB()
  {
    GMTrace.i(18826452271104L, 140268);
    GMTrace.o(18826452271104L, 140268);
    return false;
  }
  
  protected final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    int i = 0;
    GMTrace.i(9199954165760L, 68545);
    String str;
    if (paramInt == 11000)
    {
      str = new String(paramArrayOfByte);
      paramArrayOfByte = "";
      try
      {
        localObject1 = FileOp.be(str);
        paramArrayOfByte = (byte[])localObject1;
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          Object localObject1;
          w.printErrStackTrace("MicroMsg.Wear.HttpLogServer", localIOException1, "handleData", new Object[0]);
        }
        if (paramArrayOfByte.size() <= 0) {
          break label153;
        }
        localObject2 = g.ork;
        g.k("WearCrash", paramArrayOfByte);
        paramArrayOfByte.clear();
        new File(str).delete();
      }
      localObject1 = paramArrayOfByte.split("​​");
      paramArrayOfByte = new ArrayList();
      paramInt = 0;
      while (paramInt < localObject1.length)
      {
        paramArrayOfByte.add(localObject1[paramInt]);
        if (paramInt % 50 == 9)
        {
          g localg = g.ork;
          g.k("WearCrash", paramArrayOfByte);
          paramArrayOfByte.clear();
        }
        paramInt += 1;
      }
    }
    for (;;)
    {
      Object localObject2;
      label153:
      GMTrace.o(9199954165760L, 68545);
      return null;
      if (paramInt == 11003)
      {
        str = new String(paramArrayOfByte);
        paramArrayOfByte = "";
        try
        {
          localObject2 = FileOp.be(str);
          paramArrayOfByte = (byte[])localObject2;
        }
        catch (IOException localIOException2)
        {
          for (;;)
          {
            int j;
            w.printErrStackTrace("MicroMsg.Wear.HttpLogServer", localIOException2, "handleData", new Object[0]);
          }
          new File(str).delete();
        }
        paramArrayOfByte = paramArrayOfByte.split("​​");
        j = paramArrayOfByte.length;
        paramInt = i;
        while (paramInt < j)
        {
          w.i("MicroMsg.Wear.LOG", paramArrayOfByte[paramInt]);
          paramInt += 1;
        }
        continue;
      }
      if (paramInt != 11035) {
        continue;
      }
      bsa localbsa = new bsa();
      try
      {
        localbsa.aD(paramArrayOfByte);
        paramArrayOfByte = com.tencent.mm.plugin.wear.model.a.bBm().rzt.rzK.rAy;
        if (paramArrayOfByte == null) {
          continue;
        }
        w.v("MicroMsg.Wear.HttpLogServer", "report kv id=%d %s %s %s %s data=%s", new Object[] { Integer.valueOf(localbsa.lSW), paramArrayOfByte.jhn, paramArrayOfByte.vbo, Integer.valueOf(paramArrayOfByte.tQM), paramArrayOfByte.vbp, localbsa.uYN });
        g.ork.i(localbsa.lSW, new Object[] { paramArrayOfByte.jhn, paramArrayOfByte.vbo, Integer.valueOf(paramArrayOfByte.tQM), paramArrayOfByte.vbp, localbsa.uYN });
      }
      catch (IOException paramArrayOfByte)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */