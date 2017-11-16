package com.tencent.mm.plugin.qqmail.b;

import android.content.Context;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import java.io.IOException;
import java.util.LinkedList;

public final class s
{
  r nTj;
  
  public s()
  {
    GMTrace.i(5453668941824L, 40633);
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(282625, "");
    try
    {
      this.nTj = new r();
      this.nTj.aD(Base64.decode(str, 0));
      GMTrace.o(5453668941824L, 40633);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.ShareMailInfoMgr", localException, "", new Object[0]);
      w.w("MicroMsg.ShareMailInfoMgr", "parse from config fail");
      this.nTj = new r();
      GMTrace.o(5453668941824L, 40633);
    }
  }
  
  static void Fa(String paramString)
  {
    GMTrace.i(5453937377280L, 40635);
    au localau = new au();
    localau.db("qqmail");
    localau.E(bc.gR("qqmail"));
    localau.dC(0);
    localau.setContent(String.format(ab.getContext().getString(R.l.dXv), new Object[] { paramString }));
    localau.setType(1);
    localau.dB(3);
    at.AR();
    w.d("MicroMsg.ShareMailInfoMgr", "send mail fail, publish fail message, id: %d", new Object[] { Long.valueOf(com.tencent.mm.y.c.yM().P(localau)) });
    GMTrace.o(5453937377280L, 40635);
  }
  
  public final void EZ(String paramString)
  {
    GMTrace.i(5453803159552L, 40634);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.ShareMailInfoMgr", "remove info fail, info is null");
      GMTrace.o(5453803159552L, 40634);
      return;
    }
    int i = 0;
    for (;;)
    {
      if (i < this.nTj.mTh.size())
      {
        if (((q)this.nTj.mTh.get(i)).nSb.equals(paramString)) {
          this.nTj.mTh.remove(i);
        }
      }
      else
      {
        save();
        GMTrace.o(5453803159552L, 40634);
        return;
      }
      i += 1;
    }
  }
  
  final void save()
  {
    GMTrace.i(5454071595008L, 40636);
    try
    {
      String str = Base64.encodeToString(this.nTj.toByteArray(), 0);
      w.d("MicroMsg.ShareMailInfoMgr", "save %s", new Object[] { str });
      at.AR();
      com.tencent.mm.y.c.xh().set(282625, str);
      GMTrace.o(5454071595008L, 40636);
      return;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.ShareMailInfoMgr", localIOException, "", new Object[0]);
      w.w("MicroMsg.ShareMailInfoMgr", "save to config fail");
      GMTrace.o(5454071595008L, 40636);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */