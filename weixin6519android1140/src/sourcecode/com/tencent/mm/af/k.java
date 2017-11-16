package com.tencent.mm.af;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.protocal.c.nb;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.l;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public final class k
{
  private a.a fJt;
  public int gxg;
  private com.tencent.mm.modelgeo.c gxh;
  private int gxi;
  public int gxj;
  public boolean gxk;
  public m.b gxl;
  public String userName;
  
  protected k()
  {
    GMTrace.i(4530653626368L, 33756);
    this.userName = null;
    this.gxg = 0;
    this.gxi = 2;
    this.gxj = 10;
    this.gxk = false;
    this.gxl = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(4529445666816L, 33747);
        if ((paramAnonymousObject == null) || (!(paramAnonymousObject instanceof String)))
        {
          w.i("MicroMsg.ReportLocation", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousm, paramAnonymousObject });
          GMTrace.o(4529445666816L, 33747);
          return;
        }
        if ((k.this.userName.equals((String)paramAnonymousObject)) && (k.this.gxg == 1))
        {
          w.i("MicroMsg.ReportLocation", "contactStgUpdate, %s", new Object[] { k.this.userName });
          k.this.iW(k.this.userName);
          ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().b(k.this.gxl);
        }
        GMTrace.o(4529445666816L, 33747);
      }
    };
    this.fJt = new a.a()
    {
      long lastReportTime;
      
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15659719196672L, 116674);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15659719196672L, 116674);
          return true;
        }
        w.i("MicroMsg.ReportLocation", "LBSManager notify. lat:%f, lng:%f", new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1) });
        if (bg.Pu() >= this.lastReportTime + k.this.gxj)
        {
          k.a(k.this.userName, 11, 0, paramAnonymousFloat2, paramAnonymousFloat1, (int)paramAnonymousDouble2, null);
          this.lastReportTime = bg.Pu();
        }
        if (k.this.gxg == 2) {
          k.this.Fz();
        }
        if (!k.this.gxk)
        {
          k.this.gxk = true;
          com.tencent.mm.modelstat.n.a(2013, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
        }
        GMTrace.o(15659719196672L, 116674);
        return true;
      }
    };
    this.gxj = bg.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).uu().z("BrandService", "continueLocationReportInterval"), 5);
    if (this.gxj < this.gxi) {
      this.gxj = this.gxi;
    }
    w.i("MicroMsg.ReportLocation", "reportLocation interval %d", new Object[] { Integer.valueOf(this.gxj) });
    GMTrace.o(4530653626368L, 33756);
  }
  
  public static void a(String paramString, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, LinkedList<nb> paramLinkedList)
  {
    GMTrace.i(19905294368768L, 148306);
    if (paramInt2 == 3) {}
    for (String str = "<event></event>";; str = String.format("<event><location><errcode>%d</errcode><data><latitude>%f</latitude><longitude>%f</longitude><precision>%d</precision></data></location></event>", new Object[] { Integer.valueOf(paramInt2), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt3) }))
    {
      w.i("MicroMsg.ReportLocation", "doScene, info: %s", new Object[] { str });
      com.tencent.mm.kernel.h.xx().fYr.a(new q(paramString, paramInt1, str, paramLinkedList), 0);
      GMTrace.o(19905294368768L, 148306);
      return;
    }
  }
  
  public static void iV(String paramString)
  {
    GMTrace.i(4530922061824L, 33758);
    a(paramString, 12, 0, 0.0F, 0.0F, 0, null);
    GMTrace.o(4530922061824L, 33758);
  }
  
  public final void Fz()
  {
    GMTrace.i(4531190497280L, 33760);
    w.i("MicroMsg.ReportLocation", "Stop report");
    this.gxg = 0;
    if (this.gxh != null) {
      this.gxh.c(this.fJt);
    }
    if (com.tencent.mm.kernel.h.xw().wL()) {
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().b(this.gxl);
    }
    GMTrace.o(4531190497280L, 33760);
  }
  
  public final void b(final String paramString, final au paramau)
  {
    GMTrace.i(19905160151040L, 148305);
    if ((paramau == null) || (!paramau.bTs()))
    {
      a(paramString, 10, 0, 0.0F, 0.0F, 0, null);
      GMTrace.o(19905160151040L, 148305);
      return;
    }
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19905562804224L, 148308);
        LinkedList localLinkedList = new LinkedList();
        Object localObject1 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).tA(paramau.field_content);
        if ((localObject1 == null) || (bg.cc(((com.tencent.mm.x.k)localObject1).glr)))
        {
          k.a(paramString, 10, 0, 0.0F, 0.0F, 0, null);
          GMTrace.o(19905562804224L, 148308);
          return;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localObject1 = ((com.tencent.mm.x.k)localObject1).glr.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          String str = ((l)((Iterator)localObject1).next()).url;
          if (!bg.nm(str))
          {
            Object localObject2 = Uri.parse(str);
            try
            {
              str = ((Uri)localObject2).getQueryParameter("mid");
              localObject2 = ((Uri)localObject2).getQueryParameter("idx");
              nb localnb = new nb();
              localnb.udV = bg.getLong(str, 0L);
              localnb.oHp = bg.getInt((String)localObject2, 0);
              localLinkedList.add(localnb);
              localStringBuilder.append("mid:").append(str).append(",idx:").append((String)localObject2).append("; ");
            }
            catch (UnsupportedOperationException localUnsupportedOperationException)
            {
              w.w("MicroMsg.ReportLocation", "UnsupportedOperationException %s", new Object[] { localUnsupportedOperationException.getMessage() });
            }
          }
        }
        w.v("MicroMsg.ReportLocation", "click command : msgReport %s", new Object[] { localStringBuilder.toString() });
        k.a(paramString, 10, 0, 0.0F, 0.0F, 0, localLinkedList);
        GMTrace.o(19905562804224L, 148308);
      }
    });
    GMTrace.o(19905160151040L, 148305);
  }
  
  public final void iW(String paramString)
  {
    GMTrace.i(4531056279552L, 33759);
    w.i("MicroMsg.ReportLocation", "Start report");
    this.userName = paramString;
    Object localObject = f.iK(paramString);
    if (localObject == null)
    {
      GMTrace.o(4531056279552L, 33759);
      return;
    }
    if (this.gxg != 0) {
      Fz();
    }
    this.gxg = 0;
    if (((d)localObject).Ez())
    {
      w.i("MicroMsg.ReportLocation", "need update contact %s", new Object[] { paramString });
      com.tencent.mm.ac.b.hR(paramString);
    }
    d.b localb = ((d)localObject).bq(false);
    if (localb == null)
    {
      GMTrace.o(4531056279552L, 33759);
      return;
    }
    if ((localb.EB()) && (((d)localObject).Ey()))
    {
      this.gxh = com.tencent.mm.modelgeo.c.Ir();
      localObject = ((d)localObject).bq(false);
      boolean bool;
      if (((d.b)localObject).gvP != null)
      {
        if (bg.getInt(((d.b)localObject).gvP.optString("ReportLocationType"), 0) == 2)
        {
          bool = true;
          ((d.b)localObject).gwc = bool;
        }
      }
      else {
        if (!((d.b)localObject).gwc) {
          break label224;
        }
      }
      label224:
      for (int i = 3;; i = 2)
      {
        this.gxg = i;
        if ((!com.tencent.mm.modelgeo.c.Is()) && (!com.tencent.mm.modelgeo.c.It())) {
          break label229;
        }
        this.gxh.a(this.fJt, true);
        GMTrace.o(4531056279552L, 33759);
        return;
        bool = false;
        break;
      }
      label229:
      a(paramString, 11, 2, 0.0F, 0.0F, 0, null);
      GMTrace.o(4531056279552L, 33759);
      return;
    }
    if ((localb.EB()) && (!((d)localObject).Ey())) {
      a(paramString, 11, 1, 0.0F, 0.0F, 0, null);
    }
    GMTrace.o(4531056279552L, 33759);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */