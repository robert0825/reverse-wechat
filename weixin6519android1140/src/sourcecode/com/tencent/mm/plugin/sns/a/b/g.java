package com.tencent.mm.plugin.sns.a.b;

import android.app.Activity;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.kc;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.plugin.sns.ui.bf;
import com.tencent.mm.protocal.c.bb;
import com.tencent.mm.protocal.c.be;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class g
  implements b
{
  public static Map<String, Integer> pnt;
  public Activity activity;
  public long jro;
  public int nvM;
  public int pmG;
  public HashMap<String, Long> pnk;
  public HashSet<Long> pnl;
  public Map<String, Long> pnm;
  public Map<String, Integer> pnn;
  public HashSet<Long> pno;
  public Map<Long, h> pnp;
  public Map<String, a> pnq;
  private LinkedList<String> pnr;
  private Map<String, Integer> pns;
  private int pnu;
  public View pnv;
  private a pnw;
  private int pnx;
  
  static
  {
    GMTrace.i(8170772627456L, 60877);
    pnt = new HashMap();
    GMTrace.o(8170772627456L, 60877);
  }
  
  public g(int paramInt)
  {
    GMTrace.i(8169027796992L, 60864);
    this.pnk = new HashMap();
    this.pnl = new HashSet();
    this.pnm = new HashMap();
    this.pnn = new HashMap();
    this.pno = new HashSet();
    this.pnp = new HashMap();
    this.pnq = new HashMap();
    this.nvM = 1;
    this.pnr = new LinkedList();
    this.pns = new HashMap();
    this.pnu = 0;
    this.pmG = 0;
    this.pnv = null;
    this.pnw = null;
    this.jro = 0L;
    this.pnx = -1;
    this.nvM = paramInt;
    GMTrace.o(8169027796992L, 60864);
  }
  
  public final void a(int paramInt1, String paramString1, String paramString2, boolean paramBoolean, View paramView, long paramLong, bf parambf, bfh parambfh, int paramInt2, int paramInt3)
  {
    GMTrace.i(15964125003776L, 118942);
    this.pnl.add(Long.valueOf(paramLong));
    this.pnk.put(paramString1, Long.valueOf(paramLong));
    if (this.pnx == -1) {
      if (this.activity != null) {
        break label89;
      }
    }
    m localm;
    label89:
    for (int i = -1;; i = com.tencent.mm.pluginsdk.e.dH(this.activity))
    {
      this.pnx = i;
      localm = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramString1);
      if (localm != null) {
        break;
      }
      w.w("MicroMsg.SnsAdStatistic", "snsinfo not found! skip onAdAdded logic!");
      GMTrace.o(15964125003776L, 118942);
      return;
    }
    long l;
    if ((this.pnw == null) && (paramView != null) && (com.tencent.mm.plugin.sns.model.ae.ptG))
    {
      if (parambf == null)
      {
        parambf = null;
        this.pnw = new a(parambf, paramLong, paramView, this.pmG, this.pnv, this.pnx, this.nvM, parambfh, paramInt1, localm.blz());
        paramView = this.pnw;
        paramView.pmP = System.currentTimeMillis();
        com.tencent.mm.plugin.sns.model.ae.aDa().post(new a.1(paramView));
      }
    }
    else
    {
      if (!this.pnm.containsKey(paramString1)) {
        break label361;
      }
      l = bg.aI(((Long)this.pnm.get(paramString1)).longValue());
      if (l >= 1200000L) {
        break label717;
      }
      if (!this.pnn.containsKey(paramString1)) {
        break label337;
      }
    }
    label337:
    for (i = ((Integer)this.pnn.get(paramString1)).intValue();; i = 0)
    {
      if (i < 2) {
        break label343;
      }
      w.i("MicroMsg.SnsAdStatistic", "passed localid " + paramString1 + " viewid " + paramString2 + " passedTime: " + l);
      GMTrace.o(15964125003776L, 118942);
      return;
      parambf = parambf.qjG;
      break;
    }
    label343:
    this.pnn.put(paramString1, Integer.valueOf(i + 1));
    label361:
    if (!this.pnq.containsKey(paramString1))
    {
      this.pnq.put(paramString1, new a(bg.Pw(), paramString1, paramInt1, paramString2, paramInt2, paramLong));
      w.i("MicroMsg.SnsAdStatistic", "onAdAdded " + paramInt1 + " " + paramString1 + "  isExposure: " + paramBoolean);
      if (paramInt2 == 9)
      {
        if (!this.pnp.containsKey(Long.valueOf(paramLong))) {
          break label752;
        }
        paramView = (h)this.pnp.get(Long.valueOf(paramLong));
        label488:
        paramView.pnF = bg.Pw();
        this.pnp.put(Long.valueOf(paramLong), paramView);
      }
      if (!this.pnr.contains(paramString1))
      {
        this.pnr.add(paramString1);
        w.i("MicroMsg.SnsAdStatistic", "exposures item " + paramString1);
        this.pns.put(paramString1, Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
      }
      parambf = localm.blz();
      parambfh = localm.blD();
      paramView = null;
      paramString1 = paramView;
      if (this.pnw != null)
      {
        paramString1 = paramView;
        if (com.tencent.mm.plugin.sns.model.ae.ptG) {
          paramString1 = this.pnw.bhF();
        }
      }
      paramView = localm.bmj();
      paramInt1 = 0;
      if (paramInt3 == 1)
      {
        paramInt1 = paramView.field_exposureCount + 1;
        paramView.field_exposureCount = paramInt1;
        com.tencent.mm.plugin.sns.model.ae.bjg().c(paramView, new String[0]);
      }
      if (!parambf.bkd()) {
        break label767;
      }
      paramString1 = new d(paramString2, this.nvM, paramString1, 3, paramInt1, localm.bml());
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(paramString1, 0);
      GMTrace.o(15964125003776L, 118942);
      return;
      label717:
      this.pnm.put(paramString1, Long.valueOf(bg.Pw()));
      this.pnn.put(paramString1, Integer.valueOf(0));
      break;
      label752:
      paramView = new h("timeline");
      break label488;
      label767:
      if (parambf.bke())
      {
        if ((parambfh != null) && (parambfh.uUc.ueV == 15) && (parambfh.uUj != 1)) {
          paramString1 = new d(paramString2, this.nvM, paramString1, 5, paramInt1, localm.bml());
        } else {
          paramString1 = new d(paramString2, this.nvM, paramString1, 4, paramInt1, localm.bml());
        }
      }
      else if (paramInt2 == 9) {
        paramString1 = new d(paramString2, this.nvM, paramString1, 2, paramInt1, localm.bml());
      } else {
        paramString1 = new d(paramString2, this.nvM, paramString1, 1, paramInt1, localm.bml());
      }
    }
  }
  
  public final void bhG()
  {
    GMTrace.i(8170504192000L, 60875);
    if ((this.pnw != null) && (com.tencent.mm.plugin.sns.model.ae.ptG)) {
      this.pnw.bhE();
    }
    GMTrace.o(8170504192000L, 60875);
  }
  
  public final void clear()
  {
    GMTrace.i(8170638409728L, 60876);
    w.i("MicroMsg.SnsAdStatistic", "clean the adRemove" + this.pnr.size());
    Object localObject1 = new LinkedList();
    Object localObject2 = this.pnq.keySet().iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((List)localObject1).add((String)((Iterator)localObject2).next());
    }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      localObject2 = (a)this.pnq.get(localObject2);
      r(((a)localObject2).position, ((a)localObject2).eUV, ((a)localObject2).gVs);
    }
    localObject1 = this.pnr.iterator();
    com.tencent.mm.plugin.sns.storage.e locale;
    m localm;
    int i;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      locale = com.tencent.mm.plugin.sns.model.ae.bjg().uW(u.IN((String)localObject2));
      if (locale != null)
      {
        localm = locale.blF();
        locale.field_localFlag |= 0x80;
        i = (int)(System.currentTimeMillis() / 1000L);
        if (!this.pns.containsKey(localObject2)) {
          break label336;
        }
        i = ((Integer)this.pns.get(localObject2)).intValue();
      }
    }
    label336:
    for (;;)
    {
      if (locale.field_exposureTime <= 0) {
        locale.field_exposureTime = i;
      }
      localm.field_localFlag |= 0x80;
      com.tencent.mm.plugin.sns.model.ae.bjd().b(localm.field_snsId, localm);
      com.tencent.mm.plugin.sns.model.ae.bjg().b(locale.field_snsId, locale);
      break;
      this.pnr.clear();
      this.pns.clear();
      GMTrace.o(8170638409728L, 60876);
      return;
    }
  }
  
  public final void d(long paramLong, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(8169564667904L, 60868);
    h localh;
    if (this.pnp.containsKey(Long.valueOf(paramLong)))
    {
      localh = (h)this.pnp.get(Long.valueOf(paramLong));
      if (paramInt > 0) {
        localh.pnK.poJ = paramInt;
      }
      if (!paramBoolean) {
        break label110;
      }
    }
    label110:
    for (paramInt = 1;; paramInt = 0)
    {
      localh.pnD = paramInt;
      this.pnp.put(Long.valueOf(paramLong), localh);
      GMTrace.o(8169564667904L, 60868);
      return;
      localh = new h("timeline");
      break;
    }
  }
  
  public final boolean dm(long paramLong)
  {
    GMTrace.i(8168893579264L, 60863);
    boolean bool = this.pnl.contains(Long.valueOf(paramLong));
    GMTrace.o(8168893579264L, 60863);
    return bool;
  }
  
  public final void dn(final long paramLong)
  {
    GMTrace.i(8169296232448L, 60866);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8161243168768L, 60806);
        g localg;
        long l;
        if (g.this.dm(paramLong))
        {
          localg = g.this;
          l = paramLong;
          if (!localg.pnp.containsKey(Long.valueOf(l))) {
            break label114;
          }
        }
        label114:
        for (h localh = (h)localg.pnp.get(Long.valueOf(l));; localh = new h("timeline"))
        {
          localh.pnD = 1;
          localh.pnK.poH += 1;
          localg.pnp.put(Long.valueOf(l), localh);
          GMTrace.o(8161243168768L, 60806);
          return;
        }
      }
    });
    GMTrace.o(8169296232448L, 60866);
  }
  
  public final boolean jdMethod_do(long paramLong)
  {
    GMTrace.i(8169967321088L, 60871);
    if (this.pno.contains(Long.valueOf(paramLong)))
    {
      GMTrace.o(8169967321088L, 60871);
      return true;
    }
    GMTrace.o(8169967321088L, 60871);
    return false;
  }
  
  public final void k(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(8169698885632L, 60869);
    h localh;
    if (this.pnp.containsKey(Long.valueOf(paramLong)))
    {
      localh = (h)this.pnp.get(Long.valueOf(paramLong));
      if (!paramBoolean) {
        break label106;
      }
    }
    label106:
    for (localh.pnK.poK = 2;; localh.pnK.poK = 1)
    {
      localh.pnK.poL = 1;
      this.pnp.put(Long.valueOf(paramLong), localh);
      GMTrace.o(8169698885632L, 60869);
      return;
      localh = new h("timeline");
      break;
    }
  }
  
  public final void onResume()
  {
    GMTrace.i(8169162014720L, 60865);
    if (this.jro <= 0L)
    {
      GMTrace.o(8169162014720L, 60865);
      return;
    }
    long l = bg.aI(this.jro);
    Iterator localIterator = this.pnq.keySet().iterator();
    Object localObject;
    a locala;
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      locala = (a)this.pnq.get(localObject);
      w.i("MicroMsg.SnsAdStatistic", "before Key " + (String)localObject + " " + locala.time);
    }
    localIterator = this.pnq.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      localObject = (a)this.pnq.get(localObject);
      ((a)localObject).time -= l;
    }
    localIterator = this.pnq.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      locala = (a)this.pnq.get(localObject);
      w.i("MicroMsg.SnsAdStatistic", "update Key " + (String)localObject + " " + locala.time);
    }
    GMTrace.o(8169162014720L, 60865);
  }
  
  public final void r(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(8170369974272L, 60874);
    long l;
    if (this.pnk.containsKey(paramString1))
    {
      l = ((Long)this.pnk.remove(paramString1)).longValue();
      this.pnl.remove(Long.valueOf(l));
    }
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject2 = localObject3;
    Object localObject1 = localObject4;
    if (this.pnw != null)
    {
      localObject2 = localObject3;
      localObject1 = localObject4;
      if (com.tencent.mm.plugin.sns.model.ae.ptG)
      {
        localObject1 = this.pnw;
        ((a)localObject1).jAg = true;
        ((a)localObject1).pmQ = System.currentTimeMillis();
        localObject1 = this.pnw;
        label138:
        label776:
        int i;
        if (((a)localObject1).pmL < 0)
        {
          ((a)localObject1).png = 2;
          if (((a)localObject1).pmN >= 0) {
            break label1128;
          }
          ((a)localObject1).pnh = 2;
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append(com.tencent.mm.plugin.sns.data.i.dt(((a)localObject1).gVt) + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).gVu + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).png + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pnh + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pnd + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pne + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pnf + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pmP + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pmQ + ",");
          if ((((a)localObject1).pmT > 0L) && (((a)localObject1).pmW == 0L)) {
            ((a)localObject1).pmW = System.currentTimeMillis();
          }
          ((StringBuilder)localObject3).append(((a)localObject1).pmT + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pmW + ",");
          if ((((a)localObject1).pmZ > 0L) && (((a)localObject1).pnc == 0L)) {
            ((a)localObject1).pnc = System.currentTimeMillis();
          }
          ((StringBuilder)localObject3).append(((a)localObject1).pmZ + ",");
          ((StringBuilder)localObject3).append(((a)localObject1).pnc);
          f.a(((a)localObject1).gVt, (StringBuilder)localObject3);
          w.i("MicroMsg.AdViewStatic", "report " + ((StringBuilder)localObject3).toString());
          localObject2 = new bb();
          ((bb)localObject2).tPq = ((a)localObject1).pmZ;
          ((bb)localObject2).tPr = ((a)localObject1).pnc;
          ((bb)localObject2).png = ((a)localObject1).png;
          ((bb)localObject2).pnh = ((a)localObject1).pnh;
          ((bb)localObject2).tPl = ((a)localObject1).pnd;
          ((bb)localObject2).tPm = ((a)localObject1).pne;
          ((bb)localObject2).tPn = ((a)localObject1).pnf;
          ((bb)localObject2).tPo = ((a)localObject1).pmT;
          ((bb)localObject2).tPp = ((a)localObject1).pmW;
          ((bb)localObject2).startTime = ((a)localObject1).pmP;
          ((bb)localObject2).endTime = ((a)localObject1).pmQ;
          if ((((a)localObject1).pmK == null) || (!((a)localObject1).pmK.bkj())) {
            break label1137;
          }
          com.tencent.mm.plugin.sns.model.ae.biX().i(14648, new Object[] { ((StringBuilder)localObject3).toString() });
          localObject4 = com.tencent.mm.modelsns.b.ha(730);
          ((com.tencent.mm.modelsns.b)localObject4).lu(com.tencent.mm.plugin.sns.data.i.dt(((a)localObject1).gVt)).lu(((a)localObject1).gVu).hd(((a)localObject1).png).hd(((a)localObject1).pnh).hd(((a)localObject1).pnd).hd(((a)localObject1).pne).hd(((a)localObject1).pnf).lu(((a)localObject1).pmP).lu(((a)localObject1).pmQ).lu(((a)localObject1).pmT).lu(((a)localObject1).pmW).lu(((a)localObject1).pmZ).lu(((a)localObject1).pnc);
          ((com.tencent.mm.modelsns.b)localObject4).LR();
          localObject4 = new kc();
          ((kc)localObject4).eOt.position = ((a)localObject1).position;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject4);
          if (!r.hkO) {
            break label1185;
          }
          int j = new Random(System.currentTimeMillis()).nextInt(2000) + 10;
          w.i("MicroMsg.AdViewStatic", "run on test kv " + j);
          i = 0;
          label1063:
          if (i >= j) {
            break label1185;
          }
          if ((((a)localObject1).pmK == null) || (!((a)localObject1).pmK.bkj())) {
            break label1161;
          }
          com.tencent.mm.plugin.sns.model.ae.biX().i(14648, new Object[] { ((StringBuilder)localObject3).toString() });
        }
        for (;;)
        {
          i += 1;
          break label1063;
          ((a)localObject1).png = 1;
          break;
          label1128:
          ((a)localObject1).pnh = 1;
          break label138;
          label1137:
          com.tencent.mm.plugin.sns.model.ae.biX().i(12010, new Object[] { ((StringBuilder)localObject3).toString() });
          break label776;
          label1161:
          com.tencent.mm.plugin.sns.model.ae.biX().i(12010, new Object[] { ((StringBuilder)localObject3).toString() });
        }
        label1185:
        localObject1 = this.pnw.bhF();
        this.pnw = null;
      }
    }
    Object localObject5;
    if (this.pnq.containsKey(paramString1))
    {
      localObject4 = (a)this.pnq.remove(paramString1);
      this.pnm.put(paramString1, Long.valueOf(bg.Pw()));
      if (localObject4 == null)
      {
        GMTrace.o(8170369974272L, 60874);
        return;
      }
      l = bg.aI(((a)localObject4).time);
      w.i("MicroMsg.SnsAdStatistic", "onAdRemoved " + paramInt + " " + paramString1 + " " + l + " ");
      localObject3 = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramString1);
      if (localObject3 == null)
      {
        GMTrace.o(8170369974272L, 60874);
        return;
      }
      paramString1 = "";
      localObject5 = ((m)localObject3).blD();
      com.tencent.mm.plugin.sns.storage.b localb = ((m)localObject3).blz();
      if (localb.bkd())
      {
        paramInt = 3;
        paramString1 = "";
        paramString1 = new d(paramString2, this.nvM, 2, (int)l, (bb)localObject2, (be)localObject1, paramInt, paramString1, -1, ((m)localObject3).bml());
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(paramString1, 0);
        GMTrace.o(8170369974272L, 60874);
        return;
      }
      if (localb.bke()) {
        if ((localObject5 != null) && (((biz)localObject5).uUc.ueV == 15) && (((biz)localObject5).uUj != 1))
        {
          paramInt = 5;
          paramString1 = (h)this.pnp.remove(Long.valueOf(((a)localObject4).gVt));
          if (paramString1 == null) {
            break label1650;
          }
          paramString1.ud(0);
        }
      }
    }
    label1650:
    for (paramString1 = paramString1.bhH();; paramString1 = "")
    {
      this.pno.remove(Long.valueOf(((a)localObject4).gVt));
      break;
      paramInt = 4;
      paramString1 = "";
      break;
      if (((a)localObject4).jHw == 9)
      {
        paramInt = 2;
        localObject5 = (h)this.pnp.remove(Long.valueOf(((a)localObject4).gVt));
        if (localObject5 != null)
        {
          ((h)localObject5).ud(0);
          paramString1 = ((h)localObject5).bhH();
        }
        this.pno.remove(Long.valueOf(((a)localObject4).gVt));
        break;
      }
      paramInt = 1;
      paramString1 = "";
      break;
      w.i("MicroMsg.SnsAdStatistic", "can not find onAdRemoved " + paramInt + " " + paramString1);
      GMTrace.o(8170369974272L, 60874);
      return;
    }
  }
  
  public final void s(final long paramLong1, long paramLong2)
  {
    GMTrace.i(8169833103360L, 60870);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8161780039680L, 60810);
        if (g.this.dm(paramLong1))
        {
          g localg = g.this;
          long l = this.pnB;
          if (!localg.pno.contains(Long.valueOf(l))) {
            localg.pno.add(Long.valueOf(l));
          }
        }
        GMTrace.o(8161780039680L, 60810);
      }
    });
    GMTrace.o(8169833103360L, 60870);
  }
  
  public final void t(final long paramLong1, long paramLong2)
  {
    GMTrace.i(8170101538816L, 60872);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8171041062912L, 60879);
        g localg;
        long l1;
        long l2;
        if (g.this.dm(paramLong1))
        {
          localg = g.this;
          l1 = paramLong1;
          l2 = this.pnC;
          if (!localg.pnp.containsKey(Long.valueOf(l1))) {
            break label122;
          }
        }
        label122:
        for (h localh = (h)localg.pnp.get(Long.valueOf(l1));; localh = new h("timeline"))
        {
          if (localh.pnK.poM == 0L) {
            localh.pnK.poM = l2;
          }
          localg.pnp.put(Long.valueOf(l1), localh);
          GMTrace.o(8171041062912L, 60879);
          return;
        }
      }
    });
    GMTrace.o(8170101538816L, 60872);
  }
  
  public final void u(final long paramLong, int paramInt)
  {
    GMTrace.i(8169430450176L, 60867);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8162048475136L, 60812);
        g.this.d(paramLong, this.ikz, this.pnA);
        GMTrace.o(8162048475136L, 60812);
      }
    });
    GMTrace.o(8169430450176L, 60867);
  }
  
  static final class a
  {
    public String eUV;
    public String gVs;
    public long gVt;
    public int jHw;
    public int position;
    public long time;
    
    public a(long paramLong1, String paramString1, int paramInt1, String paramString2, int paramInt2, long paramLong2)
    {
      GMTrace.i(8165940789248L, 60841);
      this.time = paramLong1;
      this.eUV = paramString1;
      this.position = paramInt1;
      this.gVs = paramString2;
      this.gVt = paramLong2;
      this.jHw = paramInt2;
      GMTrace.o(8165940789248L, 60841);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\a\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */