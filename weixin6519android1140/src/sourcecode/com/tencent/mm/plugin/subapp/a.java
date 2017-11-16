package com.tencent.mm.plugin.subapp;

import android.annotation.SuppressLint;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.ff;
import com.tencent.mm.g.a.ff.a;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.p.k;
import com.tencent.mm.protocal.c.awj;
import com.tencent.mm.protocal.c.bmk;
import com.tencent.mm.protocal.c.boa;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.bf;
import com.tencent.mm.y.ak.f;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.ar;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  implements aq, ar
{
  public static bf qrc;
  private Map<String, aq> gpi;
  private a qrd;
  
  public a()
  {
    GMTrace.i(5848940150784L, 43578);
    this.gpi = new HashMap();
    w.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp constructor: " + System.currentTimeMillis());
    this.gpi = pE();
    GMTrace.o(5848940150784L, 43578);
  }
  
  public final aq Jv(String paramString)
  {
    GMTrace.i(5849879674880L, 43585);
    paramString = (aq)this.gpi.get(paramString);
    GMTrace.o(5849879674880L, 43585);
    return paramString;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5849342803968L, 43581);
    w.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp onAccountPostReset: " + System.currentTimeMillis());
    Iterator localIterator = this.gpi.entrySet().iterator();
    while (localIterator.hasNext()) {
      ((aq)((Map.Entry)localIterator.next()).getValue()).aX(paramBoolean);
    }
    if (this.qrd == null) {
      this.qrd = new a();
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.qrd);
    GMTrace.o(5849342803968L, 43581);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(5849477021696L, 43582);
    w.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp onSdcardMount: " + System.currentTimeMillis());
    Iterator localIterator = this.gpi.entrySet().iterator();
    while (localIterator.hasNext()) {
      ((aq)((Map.Entry)localIterator.next()).getValue()).aY(paramBoolean);
    }
    GMTrace.o(5849477021696L, 43582);
  }
  
  public final void b(String paramString, aq paramaq)
  {
    GMTrace.i(5850013892608L, 43586);
    this.gpi.put(paramString, paramaq);
    GMTrace.o(5850013892608L, 43586);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5849208586240L, 43580);
    w.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp clearPluginData: " + System.currentTimeMillis());
    Iterator localIterator = this.gpi.entrySet().iterator();
    while (localIterator.hasNext()) {
      ((aq)((Map.Entry)localIterator.next()).getValue()).eI(paramInt);
    }
    GMTrace.o(5849208586240L, 43580);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5849611239424L, 43583);
    w.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp onAccountRelease: " + System.currentTimeMillis());
    Iterator localIterator = this.gpi.entrySet().iterator();
    while (localIterator.hasNext()) {
      ((aq)((Map.Entry)localIterator.next()).getValue()).onAccountRelease();
    }
    if (this.qrd != null) {
      com.tencent.mm.sdk.b.a.vgX.c(this.qrd);
    }
    GMTrace.o(5849611239424L, 43583);
  }
  
  public final Map<String, aq> pE()
  {
    GMTrace.i(5849745457152L, 43584);
    w.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp getSubCoreMap: " + System.currentTimeMillis());
    HashMap localHashMap = new HashMap();
    localHashMap.put(com.tencent.mm.al.d.class.getName(), new com.tencent.mm.al.d());
    localHashMap.put(com.tencent.mm.plugin.subapp.b.c.class.getName(), new com.tencent.mm.plugin.subapp.b.c());
    localHashMap.put(com.tencent.mm.plugin.subapp.a.c.class.getName(), new com.tencent.mm.plugin.subapp.a.c());
    Object localObject = new com.tencent.mm.plugin.subapp.c.d();
    com.tencent.mm.y.ak.a.gna = (ak.f)localObject;
    localHashMap.put(com.tencent.mm.plugin.subapp.c.d.class.getName(), localObject);
    localObject = new com.tencent.mm.plugin.subapp.jdbiz.c();
    localHashMap.put(com.tencent.mm.plugin.subapp.jdbiz.c.class.getName(), localObject);
    com.tencent.mm.pluginsdk.p.z.tmj = (p.k)localObject;
    localObject = new com.tencent.mm.modelmulti.p();
    localHashMap.put(com.tencent.mm.modelmulti.p.class.getName(), localObject);
    GMTrace.o(5849745457152L, 43584);
    return localHashMap;
  }
  
  @SuppressLint({"UseSparseArrays"})
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(5849074368512L, 43579);
    w.i("MicroMsg.SubCoreSubapp", "SubCoreSubapp getBaseDBFactories: " + System.currentTimeMillis());
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.gpi.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((aq)localEntry.getValue()).vH() != null) {
        localHashMap.putAll(((aq)localEntry.getValue()).vH());
      }
    }
    GMTrace.o(5849074368512L, 43579);
    return localHashMap;
  }
  
  public static final class a
    extends com.tencent.mm.sdk.b.c<ff>
    implements e
  {
    private com.tencent.mm.plugin.subapp.ui.voicetranstext.a qrf;
    private com.tencent.mm.plugin.subapp.ui.voicetranstext.c qrg;
    private com.tencent.mm.plugin.subapp.ui.voicetranstext.b qrh;
    private com.tencent.mm.modelvoice.b qri;
    private com.tencent.mm.modelvoice.p qrj;
    private volatile boolean qrk;
    public boolean qrl;
    private aj qrm;
    private ff qrn;
    private boolean qro;
    private int qrp;
    private Map<String, String> qrq;
    
    public a()
    {
      GMTrace.i(5757672095744L, 42898);
      this.qrk = false;
      this.qrl = false;
      this.qrq = new HashMap();
      this.vhf = ff.class.getName().hashCode();
      GMTrace.o(5757672095744L, 42898);
    }
    
    private void a(String paramString, a parama)
    {
      GMTrace.i(14524774088704L, 108218);
      w.i("MicroMsg.SubCoreSubapp", "finishWithResult mstate:%s", new Object[] { parama });
      if (this.qrm != null) {
        this.qrm.stopTimer();
      }
      at.wS().b(546, this);
      at.wS().b(547, this);
      at.wS().b(548, this);
      if (this.qrn != null)
      {
        if (com.tencent.mm.sdk.platformtools.bg.nm(paramString)) {
          break label434;
        }
        this.qrq.put(this.qrn.eHw.euR, paramString);
        if (((a.qrc == null) || (com.tencent.mm.sdk.platformtools.bg.nm(a.qrc.field_content))) && (this.qrn.eHw.eDj == 1))
        {
          com.tencent.mm.storage.bg localbg = m.NL();
          w.i("MicroMsg.SubCoreSubapp", "createVoiceTT localId(%s) , fileName(%s).", new Object[] { this.qrn.eHw.eHy, this.qrn.eHw.euR });
          bf localbf = new bf();
          localbf.field_msgId = Long.valueOf(this.qrn.eHw.eHy).longValue();
          localbf.UD(this.qrn.eHw.euR);
          localbf.field_content = paramString;
          localbg.a(localbf);
          g.ork.i(14220, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
        }
        this.qrn.eHx.eFp = true;
        this.qrn.eHx.content = paramString;
        if (parama != a.qrz) {
          break label479;
        }
        this.qrn.eHx.state = 1;
      }
      for (;;)
      {
        w.d("MicroMsg.SubCoreSubapp", "finishWithResult result : %s", new Object[] { paramString });
        if (this.qrn.eHw.eHA != null) {
          this.qrn.eHw.eHA.run();
        }
        this.qrf = null;
        this.qrg = null;
        this.qrh = null;
        this.qrn = null;
        this.qro = false;
        this.qrl = false;
        this.qrk = false;
        this.qrp = 20;
        a.qrc = null;
        GMTrace.o(14524774088704L, 108218);
        return;
        label434:
        if (parama != a.qrx) {
          break;
        }
        w.i("MicroMsg.SubCoreSubapp", "finishWithResult State.FINISH id:%s", new Object[] { this.qrn.eHw.eHy });
        this.qrn.eHx.state = 2;
        break;
        label479:
        if (parama == a.qry) {
          this.qrn.eHx.state = 2;
        }
      }
    }
    
    public final void a(final int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(5758074748928L, 42901);
      w.i("MicroMsg.SubCoreSubapp", "onSceneEnd errType(%d) , errCode(%d).", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if ((paramInt1 == 0) && (paramInt2 == 0)) {}
      switch (paramk.getType())
      {
      default: 
        GMTrace.o(5758074748928L, 42901);
        return;
      case 546: 
        if (this.qrf.mState == com.tencent.mm.plugin.subapp.ui.voicetranstext.a.quV)
        {
          w.i("MicroMsg.SubCoreSubapp", "check result: done");
          a(a.qrx);
          if (this.qrf.brN()) {}
          for (paramString = this.qrf.quW.uXN;; paramString = null)
          {
            a(paramString, a.qrx);
            GMTrace.o(5758074748928L, 42901);
            return;
          }
        }
        if (this.qrf.mState == com.tencent.mm.plugin.subapp.ui.voicetranstext.a.quU)
        {
          if (this.qrf.quW != null) {
            com.tencent.mm.sdk.platformtools.bg.nm(this.qrf.quW.uXN);
          }
          w.i("MicroMsg.SubCoreSubapp", "check result: processing");
          a(a.qrw);
          GMTrace.o(5758074748928L, 42901);
          return;
        }
        if (this.qrf.mState == com.tencent.mm.plugin.subapp.ui.voicetranstext.a.quT)
        {
          w.i("MicroMsg.SubCoreSubapp", "check result: not exist");
          a(a.qru);
          GMTrace.o(5758074748928L, 42901);
          return;
        }
        if (this.qrf.quY != null)
        {
          paramInt1 = this.qrf.quY.uLD;
          GMTrace.o(5758074748928L, 42901);
          return;
        }
        break;
      case 547: 
        if (this.qrg.brP())
        {
          w.i("MicroMsg.SubCoreSubapp", "succeed upload");
          a(a.qrw);
          GMTrace.o(5758074748928L, 42901);
          return;
        }
        w.d("MicroMsg.SubCoreSubapp", "start upload more: start:%d, len:%d", new Object[] { Integer.valueOf(this.qrg.quX.tRD), Integer.valueOf(this.qrg.quX.tRE) });
        a(a.qrv);
        GMTrace.o(5758074748928L, 42901);
        return;
      case 548: 
        paramInt1 = this.qrh.qva;
        w.i("MicroMsg.SubCoreSubapp", "get mIntervalSec:%ds", new Object[] { Integer.valueOf(paramInt1) });
        this.qrk = false;
        if ((!this.qrh.isComplete()) && (this.qrh.brN()))
        {
          w.i("MicroMsg.SubCoreSubapp", "refreshResult result");
          paramString = this.qrh.quW.uXN;
          if (this.qrn != null)
          {
            this.qrn.eHx.eFp = false;
            this.qrn.eHx.content = paramString;
            w.i("MicroMsg.SubCoreSubapp", "refreshResult result is null ? : %s", new Object[] { Boolean.valueOf(com.tencent.mm.sdk.platformtools.bg.nm(paramString)) });
            if (this.qrn.eHw.eHA != null) {
              this.qrn.eHw.eHA.run();
            }
          }
          if (!this.qrh.isComplete()) {
            break label613;
          }
          w.i("MicroMsg.SubCoreSubapp", "succeed get");
          if (!this.qrh.brN()) {
            break label608;
          }
        }
        label608:
        for (paramString = this.qrh.quW.uXN;; paramString = null)
        {
          a(a.qrx);
          a(paramString, a.qrx);
          GMTrace.o(5758074748928L, 42901);
          return;
          if (this.qrh.brN()) {
            break;
          }
          w.d("MicroMsg.SubCoreSubapp", "result not valid");
          break;
        }
        label613:
        w.i("MicroMsg.SubCoreSubapp", "do get again after:%ds", new Object[] { Integer.valueOf(paramInt1) });
        if (!this.qrl)
        {
          paramInt2 = this.qrp - 1;
          this.qrp = paramInt2;
          if (paramInt2 < 0)
          {
            w.e("MicroMsg.SubCoreSubapp", "Has try to translate delay for %d times.", new Object[] { Integer.valueOf(20) });
            a(a.qry);
            g.ork.i(14220, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
            GMTrace.o(5758074748928L, 42901);
            return;
          }
          if (this.qrm == null) {
            this.qrm = new aj(new aj.a()
            {
              public final boolean pM()
              {
                GMTrace.i(5857798520832L, 43644);
                if (a.a.this.qrl)
                {
                  GMTrace.o(5857798520832L, 43644);
                  return false;
                }
                w.d("MicroMsg.SubCoreSubapp", "timmer get, delay:%d", new Object[] { Integer.valueOf(paramInt1) });
                a.a.this.a(a.a.a.qrw);
                GMTrace.o(5857798520832L, 43644);
                return false;
              }
            }, false);
          }
          paramString = this.qrm;
          long l = paramInt1 * 1000;
          paramString.z(l, l);
        }
        GMTrace.o(5758074748928L, 42901);
        return;
        a(a.qry);
        g.ork.i(14220, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
      }
      GMTrace.o(5758074748928L, 42901);
    }
    
    public final void a(a parama)
    {
      GMTrace.i(14524639870976L, 108217);
      switch (a.1.qre[parama.ordinal()])
      {
      }
      for (;;)
      {
        GMTrace.o(14524639870976L, 108217);
        return;
        w.i("MicroMsg.SubCoreSubapp", "net check");
        if (this.qrj.eSf > 0L) {
          w.i("MicroMsg.SubCoreSubapp", "has msg svr id: %d", new Object[] { Long.valueOf(this.qrj.eSf) });
        }
        for (this.qrf = new com.tencent.mm.plugin.subapp.ui.voicetranstext.a(this.qrj.clientId, this.qrj.gsL, this.qri.getFormat(), this.qrj.eSf, this.qrj.euR);; this.qrf = new com.tencent.mm.plugin.subapp.ui.voicetranstext.a(this.qrj.clientId, this.qrj.gsL, this.qrj.euR))
        {
          at.wS().a(this.qrf, 0);
          at.wS().a(this.qrf.getType(), this);
          GMTrace.o(14524639870976L, 108217);
          return;
          w.i("MicroMsg.SubCoreSubapp", "not existex msg svr id: %d", new Object[] { Long.valueOf(this.qrj.eSf) });
        }
        w.i("MicroMsg.SubCoreSubapp", "net upload");
        if (this.qrf == null)
        {
          w.w("MicroMsg.SubCoreSubapp", "request upload must after check!");
          GMTrace.o(14524639870976L, 108217);
          return;
        }
        this.qrg = new com.tencent.mm.plugin.subapp.ui.voicetranstext.c(this.qrj.clientId, this.qrf.quX, this.qri.getFormat(), this.qrj.euR);
        at.wS().a(this.qrg, 0);
        at.wS().a(this.qrg.getType(), this);
        GMTrace.o(14524639870976L, 108217);
        return;
        w.i("MicroMsg.SubCoreSubapp", "net upload more");
        if (this.qrg == null)
        {
          w.w("MicroMsg.SubCoreSubapp", "upload more need has upload netScene!");
          GMTrace.o(14524639870976L, 108217);
          return;
        }
        this.qrg = new com.tencent.mm.plugin.subapp.ui.voicetranstext.c(this.qrg);
        at.wS().a(this.qrg, 0);
        at.wS().a(this.qrg.getType(), this);
        GMTrace.o(14524639870976L, 108217);
        return;
        if (this.qrk)
        {
          w.i("MicroMsg.SubCoreSubapp", "pulling so pass");
          GMTrace.o(14524639870976L, 108217);
          return;
        }
        w.i("MicroMsg.SubCoreSubapp", "net get");
        if (this.qrf == null)
        {
          w.w("MicroMsg.SubCoreSubapp", "request get must after check!");
          GMTrace.o(14524639870976L, 108217);
          return;
        }
        this.qrk = true;
        this.qrh = new com.tencent.mm.plugin.subapp.ui.voicetranstext.b(this.qrj.clientId);
        at.wS().a(this.qrh, 0);
        at.wS().a(this.qrh.getType(), this);
        GMTrace.o(14524639870976L, 108217);
        return;
        this.qrl = true;
        GMTrace.o(14524639870976L, 108217);
        return;
        at.wS().c(this.qrf);
        at.wS().c(this.qrg);
        at.wS().c(this.qrh);
        a(null, a.qrz);
        GMTrace.o(14524639870976L, 108217);
        return;
        a(null, a.qry);
      }
    }
    
    private static enum a
    {
      static
      {
        GMTrace.i(5758611619840L, 42905);
        qrt = new a("CHECK", 0);
        qru = new a("UPLOAD", 1);
        qrv = new a("UPLOAD_MORE", 2);
        qrw = new a("GET", 3);
        qrx = new a("FINISH", 4);
        qry = new a("ERROR", 5);
        qrz = new a("CANCEL", 6);
        qrA = new a[] { qrt, qru, qrv, qrw, qrx, qry, qrz };
        GMTrace.o(5758611619840L, 42905);
      }
      
      private a()
      {
        GMTrace.i(14525176741888L, 108221);
        GMTrace.o(14525176741888L, 108221);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */