package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.wear.model.g;
import com.tencent.mm.protocal.c.bsn;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public final class k
  extends a
{
  public k()
  {
    GMTrace.i(9205322874880L, 68585);
    GMTrace.o(9205322874880L, 68585);
  }
  
  public final List<Integer> bBA()
  {
    GMTrace.i(9205457092608L, 68586);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11011));
    localArrayList.add(Integer.valueOf(11010));
    GMTrace.o(9205457092608L, 68586);
    return localArrayList;
  }
  
  protected final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(9205591310336L, 68587);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(9205591310336L, 68587);
      return null;
      Object localObject = new bsn();
      try
      {
        ((bsn)localObject).aD(paramArrayOfByte);
        com.tencent.mm.plugin.wear.model.a.bBm().rzv.cf(((bsn)localObject).vbv, ((bsn)localObject).vbH);
        GMTrace.o(9205591310336L, 68587);
        return null;
        try
        {
          paramArrayOfByte = new String(paramArrayOfByte, "utf8");
          at.AR();
          localObject = c.yK().TE(paramArrayOfByte);
          if (s.eb(paramArrayOfByte))
          {
            at.AR();
            localObject = c.yK().TE(paramArrayOfByte);
            ((x)localObject).ds(0);
            at.AR();
            c.yK().a(paramArrayOfByte, (x)localObject);
            at.AR();
            c.yJ().b(new com.tencent.mm.av.k(paramArrayOfByte, 0));
            com.tencent.mm.plugin.wear.model.c.a.dC(4, 0);
          }
        }
        catch (UnsupportedEncodingException paramArrayOfByte)
        {
          for (;;)
          {
            paramArrayOfByte = "";
            continue;
            s.n((x)localObject);
          }
        }
      }
      catch (IOException paramArrayOfByte)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */