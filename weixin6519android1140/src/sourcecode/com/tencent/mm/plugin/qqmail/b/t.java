package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public final class t
{
  public ArrayList<u> nTk;
  public v nTl;
  public s nTm;
  public boolean nTn;
  public v.f nTo;
  public v.e nTp;
  
  public t()
  {
    GMTrace.i(5472190988288L, 40771);
    this.nTk = new ArrayList();
    this.nTl = w.aYF();
    this.nTm = null;
    this.nTn = false;
    this.nTo = new v.f()
    {
      public final void L(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(5474472689664L, 40788);
        if (paramAnonymousInt1 == paramAnonymousInt2)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShareMailQueue", "finished one job, queue.size = %d", new Object[] { Integer.valueOf(t.this.nTk.size()) });
          if (t.this.nTm != null) {
            t.this.nTm.EZ(paramAnonymousString);
          }
          if (t.this.nTk.size() > 0)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShareMailQueue", "continue to send next mail");
            paramAnonymousString = (u)t.this.nTk.remove(0);
            t.this.b(paramAnonymousString);
            t.this.nTl.a(this, t.this.nTp);
            GMTrace.o(5474472689664L, 40788);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShareMailQueue", "finished sent all mails");
          t.this.nTn = false;
        }
        GMTrace.o(5474472689664L, 40788);
      }
    };
    this.nTp = new v.e()
    {
      public final void Fb(String paramAnonymousString)
      {
        GMTrace.i(5461453570048L, 40691);
        s locals;
        if (t.this.nTm != null)
        {
          locals = t.this.nTm;
          if (!bg.nm(paramAnonymousString)) {
            break label110;
          }
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ShareMailInfoMgr", "notify fail error, subject is null");
        }
        while (t.this.nTk.size() > 0)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShareMailQueue", "continue to send next mail");
          paramAnonymousString = (u)t.this.nTk.remove(0);
          t.this.b(paramAnonymousString);
          t.this.nTl.a(t.this.nTo, this);
          GMTrace.o(5461453570048L, 40691);
          return;
          label110:
          s.Fa(paramAnonymousString);
          locals.EZ(paramAnonymousString);
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShareMailQueue", "final job fail");
        t.this.nTn = false;
        GMTrace.o(5461453570048L, 40691);
      }
    };
    GMTrace.o(5472190988288L, 40771);
  }
  
  public final void a(u paramu)
  {
    GMTrace.i(5472325206016L, 40772);
    if (!at.AU())
    {
      GMTrace.o(5472325206016L, 40772);
      return;
    }
    if (this.nTm == null) {
      this.nTm = new s();
    }
    s locals = this.nTm;
    String str = paramu.nSb;
    if (bg.nm(str)) {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ShareMailInfoMgr", "add info fail, info is null");
    }
    for (;;)
    {
      this.nTk.add(paramu);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ShareMailQueue", "add a new job, queue.size: %d", new Object[] { Integer.valueOf(this.nTk.size()) });
      if (!this.nTn)
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ShareMailQueue", "start execute");
        if (this.nTk.size() > 0)
        {
          this.nTn = true;
          b((u)this.nTk.remove(0));
          this.nTl.a(this.nTo, this.nTp);
        }
      }
      GMTrace.o(5472325206016L, 40772);
      return;
      q localq = new q();
      localq.nSb = str;
      locals.nTj.mTh.add(localq);
      locals.save();
    }
  }
  
  public final void b(u paramu)
  {
    GMTrace.i(5472459423744L, 40773);
    v localv = this.nTl;
    localv.nTA.clear();
    localv.nSG = null;
    localv.nTC = 0;
    localv.nTE = null;
    localv.nTF = null;
    localv.nTG.clear();
    localv.nTD.clear();
    localv.eMI = null;
    localv.nTz.clear();
    localv.nTs.clear();
    localv.nTr = null;
    localv.nSb = null;
    localv.nTJ = 0;
    localv.nSE = null;
    localv.nTt.clear();
    localv.nTx.clear();
    localv.nTB.clear();
    localv.nTy = null;
    localv.nTp = null;
    this.nTl.eMI = paramu.eMI;
    this.nTl.nSb = paramu.nSb;
    this.nTl.nSE = paramu.nSE;
    this.nTl.nSF = paramu.nSF;
    this.nTl.nTr = paramu.nTr;
    localv = this.nTl;
    Map localMap = paramu.nTs;
    localv.nTs = new HashMap();
    localv.nTs.putAll(localMap);
    localv = this.nTl;
    localMap = paramu.nTt;
    localv.nTt = new LinkedHashMap();
    localv.nTt.putAll(localMap);
    localv = this.nTl;
    paramu = paramu.nTu;
    localv.nTu = new LinkedHashMap();
    localv.nTu.putAll(paramu);
    GMTrace.o(5472459423744L, 40773);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */