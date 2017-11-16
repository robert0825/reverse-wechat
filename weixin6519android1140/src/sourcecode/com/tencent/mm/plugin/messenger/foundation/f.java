package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bz.b;
import com.tencent.mm.modelmulti.l;
import com.tencent.mm.modelmulti.r.c;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.messenger.foundation.a.p.a;
import com.tencent.mm.plugin.messenger.foundation.a.r;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.protocal.c.aqk;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.nl;
import com.tencent.mm.protocal.w.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
  implements com.tencent.mm.plugin.zero.a.f
{
  private r mUO;
  
  public f()
  {
    GMTrace.i(13234136416256L, 98602);
    GMTrace.o(13234136416256L, 98602);
  }
  
  public final void a(nk paramnk, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    GMTrace.i(13234404851712L, 98604);
    p localp = p.a.qp(paramnk.uei);
    if (localp != null) {
      try
      {
        localp.a(paramnk, paramArrayOfByte, paramBoolean, this.mUO);
        GMTrace.o(13234404851712L, 98604);
        return;
      }
      catch (IOException paramnk)
      {
        w.e("MicroMsg.SyncDoCmdExtensions", "docmd: parse protobuf error, " + paramnk.getMessage());
        throw new RuntimeException("docmd: parse protobuf error");
      }
    }
    w.w("MicroMsg.SyncDoCmdExtensions", "SyncDoCmdExtension for cmd id [%s] is null.", new Object[] { Integer.valueOf(paramnk.uei) });
    GMTrace.o(13234404851712L, 98604);
  }
  
  public final void bc(Object paramObject)
  {
    GMTrace.i(13234270633984L, 98603);
    b localb = com.tencent.mm.plugin.messenger.foundation.a.s.aOg();
    if (localb != null) {
      this.mUO = ((r)localb.get());
    }
    if (this.mUO == null) {
      this.mUO = new a();
    }
    if ((paramObject instanceof l))
    {
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().BW(((l)paramObject).TAG);
      GMTrace.o(13234270633984L, 98603);
      return;
    }
    if ((paramObject instanceof String))
    {
      if (paramObject.equals("NetSceneInit"))
      {
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().BW((String)paramObject);
        GMTrace.o(13234270633984L, 98603);
      }
    }
    else if ((paramObject instanceof r.c)) {
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().BW(paramObject.toString());
    }
    GMTrace.o(13234270633984L, 98603);
  }
  
  public final void bd(Object paramObject)
  {
    GMTrace.i(13234539069440L, 98605);
    if ((paramObject instanceof l))
    {
      this.mUO.agV();
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().BX(((l)paramObject).TAG);
      com.tencent.mm.sdk.platformtools.af localaf = com.tencent.mm.kernel.h.xB();
      String str = ((l)paramObject).TAG;
      com.tencent.mm.modelmulti.s locals = ((l)paramObject).gMM;
      paramObject = (l)paramObject;
      if ((((l)paramObject).gMU == null) || (((l)paramObject).gMU.tKU.tZD == null)) {}
      for (paramObject = null;; paramObject = ((l)paramObject).gMU.tKU.tZD.jhd)
      {
        localaf.A(new b(str, locals, (LinkedList)paramObject));
        GMTrace.o(13234539069440L, 98605);
        return;
      }
    }
    if (((paramObject instanceof String)) && (paramObject.equals("NetSceneInit")))
    {
      this.mUO.agV();
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().BX((String)paramObject);
      GMTrace.o(13234539069440L, 98605);
      return;
    }
    if ((paramObject instanceof r.c))
    {
      this.mUO.agV();
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().BX(paramObject.toString());
    }
    GMTrace.o(13234539069440L, 98605);
  }
  
  public final void be(Object paramObject)
  {
    GMTrace.i(13234673287168L, 98606);
    if ((paramObject instanceof l)) {
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().BX(((l)paramObject).TAG);
    }
    GMTrace.o(13234673287168L, 98606);
  }
  
  private static final class a
    implements r
  {
    public a()
    {
      GMTrace.i(13237626077184L, 98628);
      GMTrace.o(13237626077184L, 98628);
    }
    
    public final void a(au paramau, bu parambu)
    {
      GMTrace.i(13237894512640L, 98630);
      GMTrace.o(13237894512640L, 98630);
    }
    
    public final void agV()
    {
      GMTrace.i(13237760294912L, 98629);
      GMTrace.o(13237760294912L, 98629);
    }
  }
  
  static final class b
    implements Runnable
  {
    private String TAG;
    private final com.tencent.mm.modelmulti.s gMM;
    private final LinkedList<nk> lcw;
    private int mUP;
    
    public b(String paramString, com.tencent.mm.modelmulti.s params, LinkedList<nk> paramLinkedList)
    {
      GMTrace.i(13240847302656L, 98652);
      this.TAG = paramString;
      this.gMM = params;
      this.lcw = paramLinkedList;
      GMTrace.o(13240847302656L, 98652);
    }
    
    public final void run()
    {
      GMTrace.i(13240981520384L, 98653);
      int i;
      if (this.gMM != null)
      {
        i = this.gMM.gOG;
        if ((i == 3) || ((!this.gMM.gOF) && ((i == 1) || (i == 2) || (i == 8))))
        {
          this.mUP = 0;
          Iterator localIterator = this.lcw.iterator();
          while (localIterator.hasNext())
          {
            Object localObject1 = (nk)localIterator.next();
            Object localObject2 = n.a(((nk)localObject1).uej);
            if (((nk)localObject1).uei == 5) {
              try
              {
                localObject1 = ((bu)new bu().aD((byte[])localObject2)).tPW.toString();
                localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE((String)localObject1);
                if ((((String)localObject1).endsWith("@chatroom")) && (((com.tencent.mm.g.b.af)localObject2).fji == 0)) {
                  this.mUP += 1;
                }
              }
              catch (IOException localIOException)
              {
                w.e(this.TAG, "muteroom idkeyStat: docmd: parse from protobuf to addmsg error, " + localIOException.getMessage());
              }
            }
          }
          if (this.mUP > 0)
          {
            if (this.mUP > 5) {
              break label344;
            }
            d.oqe.a(202L, this.mUP, 1L, false);
            w.i(this.TAG, "muteroom idkeyStat:muteroomNotNotifyNum = " + this.mUP);
            switch (i)
            {
            }
          }
        }
      }
      for (;;)
      {
        w.i(this.TAG, "muteroom idkeyStat:aiScene = " + i);
        GMTrace.o(13240981520384L, 98653);
        return;
        label344:
        if (this.mUP <= 10)
        {
          d.oqe.a(202L, 6L, 1L, false);
          break;
        }
        if (this.mUP <= 15)
        {
          d.oqe.a(202L, 7L, 1L, false);
          break;
        }
        if (this.mUP <= 20)
        {
          d.oqe.a(202L, 8L, 1L, false);
          break;
        }
        d.oqe.a(202L, 9L, 1L, false);
        break;
        d.oqe.a(202L, 10L, 1L, false);
        continue;
        d.oqe.a(202L, 11L, 1L, false);
        continue;
        d.oqe.a(202L, 12L, 1L, false);
        continue;
        d.oqe.a(202L, 13L, 1L, false);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\messenger\foundation\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */