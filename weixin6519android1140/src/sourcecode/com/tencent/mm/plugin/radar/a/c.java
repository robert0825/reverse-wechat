package com.tencent.mm.plugin.radar.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.fj;
import com.tencent.mm.g.a.lz;
import com.tencent.mm.g.b.af;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import junit.framework.Assert;

public final class c
  implements m.b
{
  public Context context;
  ae handler;
  public bt.a kAP;
  public LinkedList<String> nZf;
  public HashMap<String, String> nZg;
  public b nZh;
  public com.tencent.mm.sdk.b.c nZi;
  
  public c(b paramb, Context paramContext)
  {
    GMTrace.i(8899843325952L, 66309);
    this.nZf = new LinkedList();
    this.nZg = new HashMap();
    this.context = null;
    this.nZh = null;
    this.nZi = new com.tencent.mm.sdk.b.c() {};
    this.kAP = new bt.a()
    {
      final String nZk;
      final String nZl;
      final String nZm;
      
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(8892864004096L, 66257);
        Object localObject1 = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        Object localObject2 = bh.q((String)localObject1, "sysmsg");
        if (((String)((Map)localObject2).get(".sysmsg.addcontact.type")).equals("1"))
        {
          paramAnonymousa = (String)((Map)localObject2).get(".sysmsg.addcontact.username");
          localObject2 = (String)((Map)localObject2).get(".sysmsg.addcontact.encryptusername");
          if ((paramAnonymousa == null) || (paramAnonymousa.equals("")) || (localObject2 == null) || (((String)localObject2).equals("")))
          {
            w.e("MicroMsg.RadarAddContact", "error! server return incorrect content! : %s", new Object[] { localObject1 });
            GMTrace.o(8892864004096L, 66257);
            return;
          }
          localObject1 = new x();
          ((x)localObject1).setUsername(paramAnonymousa);
          ((x)localObject1).cr((String)localObject2);
          c.this.I((x)localObject1);
          w.d("MicroMsg.RadarAddContact", "receive contact added system message useranme %s, encypt %s", new Object[] { ((af)localObject1).field_username, ((af)localObject1).field_encryptUsername });
        }
        GMTrace.o(8892864004096L, 66257);
      }
    };
    this.handler = new ae();
    this.context = paramContext;
    this.nZh = paramb;
    GMTrace.o(8899843325952L, 66309);
  }
  
  public static x a(au.d paramd)
  {
    GMTrace.i(16047876866048L, 119566);
    x localx = new x();
    if (paramd != null)
    {
      localx.setUsername(paramd.rAP);
      localx.cr(paramd.vBE);
      localx.ci(paramd.fsF);
      localx.cl(paramd.eCQ);
      localx.cm(paramd.gDY);
      localx.cn(paramd.gDZ);
      localx.jdMethod_do(paramd.fja);
      localx.cy(paramd.signature);
      localx.cz(paramd.getProvince());
      localx.cA(paramd.getCity());
    }
    for (;;)
    {
      GMTrace.o(16047876866048L, 119566);
      return localx;
      w.e("MicroMsg.RadarAddContact", "verify is null! must be parsed error before!");
    }
  }
  
  public static void bF(String paramString, int paramInt)
  {
    GMTrace.i(16047742648320L, 119565);
    fj localfj = new fj();
    localfj.eHH.eHJ = 0;
    localfj.eHH.eDs = paramString;
    localfj.eHH.state = paramInt;
    com.tencent.mm.sdk.b.a.vgX.m(localfj);
    GMTrace.o(16047742648320L, 119565);
  }
  
  public final long Fl(final String paramString)
  {
    GMTrace.i(8899977543680L, 66310);
    final long l = System.currentTimeMillis();
    a locala = new a(new c()
    {
      public final void a(boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(8893266657280L, 66260);
        Object localObject;
        if (paramAnonymousBoolean1)
        {
          at.AR();
          localObject = com.tencent.mm.y.c.yK().TE(paramAnonymousString1);
          if ((int)((com.tencent.mm.l.a)localObject).fTq > 0) {
            s.p((x)localObject);
          }
          c.bF(paramAnonymousString1, 1);
          if (c.this.nZf.contains(paramAnonymousString1)) {
            c.this.nZf.remove(paramAnonymousString1);
          }
          w.d("MicroMsg.RadarAddContact", "addContact %s return ok", new Object[] { paramString });
        }
        for (;;)
        {
          localObject = c.this;
          long l = l;
          if (((c)localObject).nZh != null) {
            ((c)localObject).handler.post(new c.7((c)localObject, paramAnonymousBoolean1, paramAnonymousBoolean2, paramAnonymousString2, paramAnonymousString1, l));
          }
          GMTrace.o(8893266657280L, 66260);
          return;
          if (paramAnonymousBoolean2)
          {
            if (!c.this.nZf.contains(paramAnonymousString1)) {
              c.this.nZf.add(paramAnonymousString1);
            }
            c.bF(paramAnonymousString1, 2);
            w.d("MicroMsg.RadarAddContact", "addContact has sent verify to %s", new Object[] { paramString });
          }
          else
          {
            w.d("MicroMsg.RadarAddContact", "addContact return not ok, user canceled or error");
          }
        }
      }
    });
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(Integer.valueOf(48));
    if ((paramString != null) && (paramString.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      Assert.assertTrue(true);
      locala.onStart();
      locala.nZt = localLinkedList;
      locala.iAx = paramString;
      locala.nZs.add(paramString);
      at.wS().a(new com.tencent.mm.pluginsdk.model.n(2, locala.nZs, localLinkedList, "", ""), 0);
      GMTrace.o(8899977543680L, 66310);
      return l;
    }
  }
  
  public final d Fm(String paramString)
  {
    GMTrace.i(8900111761408L, 66311);
    Object localObject = d.nZu;
    at.AR();
    localObject = com.tencent.mm.y.c.yK().TE(paramString);
    if ((localObject == null) || ((int)((com.tencent.mm.l.a)localObject).fTq == 0)) {
      if (this.nZf.contains(paramString)) {
        localObject = d.nZv;
      }
    }
    for (;;)
    {
      w.d("MicroMsg.RadarAddContact", "query username(%s) status %s", new Object[] { paramString, localObject });
      GMTrace.o(8900111761408L, 66311);
      return (d)localObject;
      localObject = d.nZu;
      continue;
      if (com.tencent.mm.l.a.eE(((af)localObject).field_type)) {
        localObject = d.nZw;
      } else if (this.nZg.containsKey(paramString)) {
        localObject = d.nZx;
      } else if (this.nZf.contains(paramString)) {
        localObject = d.nZv;
      } else {
        localObject = d.nZu;
      }
    }
  }
  
  public final void H(x paramx)
  {
    GMTrace.i(8900245979136L, 66312);
    if (this.nZf.contains(paramx.field_username)) {
      this.nZf.remove(paramx.field_username);
    }
    if (this.nZf.contains(paramx.field_encryptUsername)) {
      this.nZf.remove(paramx.field_encryptUsername);
    }
    GMTrace.o(8900245979136L, 66312);
  }
  
  public final void I(final x paramx)
  {
    GMTrace.i(8900514414592L, 66314);
    H(paramx);
    this.nZg.remove(paramx.field_username);
    this.nZg.remove(paramx.field_encryptUsername);
    if (this.nZh != null) {
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8895951011840L, 66280);
          c.this.nZh.I(paramx);
          GMTrace.o(8895951011840L, 66280);
        }
      });
    }
    GMTrace.o(8900514414592L, 66314);
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(8900380196864L, 66313);
    w.d("MicroMsg.RadarAddContact", "onNotifyChange event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.e("MicroMsg.RadarAddContact", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(8900380196864L, 66313);
      return;
    }
    paramm = (String)paramObject;
    at.AR();
    paramObject = com.tencent.mm.y.c.yK().TE(paramm);
    if ((paramObject != null) && (com.tencent.mm.l.a.eE(((af)paramObject).field_type)))
    {
      w.d("MicroMsg.RadarAddContact", "ContactStg onNotifyChange %s", new Object[] { paramm });
      I((x)paramObject);
    }
    GMTrace.o(8900380196864L, 66313);
  }
  
  public final class a
    implements e
  {
    String iAx;
    private c.c nZr;
    LinkedList<String> nZs;
    LinkedList<Integer> nZt;
    
    public a(c.c paramc)
    {
      GMTrace.i(8898769584128L, 66301);
      this.nZr = paramc;
      this.nZs = new LinkedList();
      GMTrace.o(8898769584128L, 66301);
    }
    
    private void b(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
    {
      GMTrace.i(8899038019584L, 66303);
      at.wS().b(30, this);
      if (this.nZr != null) {
        this.nZr.a(paramBoolean1, paramBoolean2, paramString1, paramString2);
      }
      GMTrace.o(8899038019584L, 66303);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(8899172237312L, 66304);
      w.d("MicroMsg.RadarAddContact", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
      if (paramk.getType() != 30)
      {
        w.w("MicroMsg.RadarAddContact", "not expected scene,  type = " + paramk.getType());
        GMTrace.o(8899172237312L, 66304);
        return;
      }
      if (((com.tencent.mm.pluginsdk.model.n)paramk).eHJ == 2)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          b(false, true, this.iAx, "");
          GMTrace.o(8899172237312L, 66304);
          return;
        }
        if ((paramInt1 == 4) && (paramInt2 == -34)) {
          paramk = c.this.context.getString(R.l.dwo);
        }
        for (;;)
        {
          b(false, false, this.iAx, paramk);
          GMTrace.o(8899172237312L, 66304);
          return;
          if ((paramInt1 == 4) && (paramInt2 == -94))
          {
            paramk = c.this.context.getString(R.l.dwp);
          }
          else if ((paramInt1 == 4) && ((paramInt2 == -24) || (paramInt2 == -101)))
          {
            paramk = paramString;
            if (!bg.nm(paramString)) {}
          }
          else
          {
            paramk = c.this.context.getString(R.l.dXF);
          }
        }
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        b(true, false, this.iAx, "");
        GMTrace.o(8899172237312L, 66304);
        return;
      }
      if (paramInt2 == -44)
      {
        at.wS().a(new com.tencent.mm.pluginsdk.model.n(2, this.nZs, this.nZt, "", ""), 0);
        GMTrace.o(8899172237312L, 66304);
        return;
      }
      if (paramInt2 == -87)
      {
        b(false, false, this.iAx, c.this.context.getString(R.l.diR));
        GMTrace.o(8899172237312L, 66304);
        return;
      }
      if ((paramInt2 == -24) && (!bg.nm(paramString)))
      {
        b(false, false, this.iAx, paramString);
        GMTrace.o(8899172237312L, 66304);
        return;
      }
      if ((paramInt1 == 4) && (paramInt2 == -22)) {}
      for (paramString = c.this.context.getString(R.l.cQE);; paramString = c.this.context.getString(R.l.cQD))
      {
        b(false, false, this.iAx, paramString);
        GMTrace.o(8899172237312L, 66304);
        return;
      }
    }
    
    public final void onStart()
    {
      GMTrace.i(8898903801856L, 66302);
      at.wS().a(30, this);
      GMTrace.o(8898903801856L, 66302);
    }
  }
  
  public static abstract interface b
  {
    public abstract void I(x paramx);
    
    public abstract void J(x paramx);
    
    public abstract void a(boolean paramBoolean, String paramString1, String paramString2, long paramLong);
    
    public abstract void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, long paramLong);
  }
  
  static abstract interface c
  {
    public abstract void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2);
  }
  
  public static enum d
  {
    static
    {
      GMTrace.i(8892595568640L, 66255);
      nZu = new d("Stranger", 0);
      nZv = new d("Verifying", 1);
      nZw = new d("Added", 2);
      nZx = new d("NeedVerify", 3);
      nZy = new d[] { nZu, nZv, nZw, nZx };
      GMTrace.o(8892595568640L, 66255);
    }
    
    private d()
    {
      GMTrace.i(8892461350912L, 66254);
      GMTrace.o(8892461350912L, 66254);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */