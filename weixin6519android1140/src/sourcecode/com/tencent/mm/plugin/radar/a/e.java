package com.tencent.mm.plugin.radar.a;

import android.content.Context;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.pluginsdk.model.lbs.Location;
import com.tencent.mm.protocal.c.awu;
import com.tencent.mm.protocal.c.awv;
import com.tencent.mm.protocal.c.aww;
import com.tencent.mm.protocal.c.awx;
import com.tencent.mm.protocal.c.awz;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.g;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class e
  implements com.tencent.mm.ad.e
{
  private Context context;
  private String eEU;
  public a.a fJt;
  private LinkedList<awx> gPh;
  public boolean guN;
  public com.tencent.mm.modelgeo.c gxh;
  public Location nZG;
  public b nZH;
  private a nZI;
  c nZJ;
  public e nZK;
  public LinkedList<awv> nZL;
  private HashMap<String, String> nZM;
  private Map<String, c.d> nZN;
  private Map<String, c.d> nZO;
  private Map<Long, b> nZP;
  private Map<String, a> nZQ;
  public aj nZR;
  private ae nZS;
  
  public e(c paramc, Context paramContext)
  {
    GMTrace.i(8893400875008L, 66261);
    this.guN = false;
    this.nZG = null;
    this.nZH = null;
    this.nZI = null;
    this.nZJ = null;
    this.context = null;
    this.nZK = e.oag;
    this.gPh = new LinkedList();
    this.nZM = new HashMap();
    this.nZN = new HashMap();
    this.nZO = new HashMap();
    this.nZP = new HashMap();
    this.nZQ = new HashMap();
    this.nZR = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(8899440672768L, 66306);
        if (!e.this.guN)
        {
          e.this.nZK = e.e.oai;
          w.d("MicroMsg.Radar.RadarManager", "status: %s", new Object[] { e.this.nZK });
          if ((e.this.nZG == null) || (e.this.nZG.bJM()))
          {
            w.e("MicroMsg.Radar.RadarManager", "error! location is null!");
            GMTrace.o(8899440672768L, 66306);
            return false;
          }
          w.d("MicroMsg.Radar.RadarManager", "do once search");
          e.this.nZH = new b(1, e.this.nZG.gEJ, e.this.nZG.gEK, e.this.nZG.accuracy, e.this.nZG.eNT, e.this.nZG.mac, e.this.nZG.eNV);
          at.wS().a(e.this.nZH, 0);
        }
        for (;;)
        {
          GMTrace.o(8899440672768L, 66306);
          return false;
          w.d("MicroMsg.Radar.RadarManager", "cancel radar searching");
        }
      }
    }, false);
    this.nZS = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(8890716520448L, 66241);
        if (paramAnonymousMessage.what == 1) {
          at.wS().a(new b(), 0);
        }
        GMTrace.o(8890716520448L, 66241);
      }
    };
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15402960683008L, 114761);
        if (e.this.guN)
        {
          w.d("MicroMsg.Radar.RadarManager", "cancel location");
          GMTrace.o(15402960683008L, 114761);
          return false;
        }
        if (e.this.nZG != null)
        {
          GMTrace.o(15402960683008L, 114761);
          return false;
        }
        if (paramAnonymousBoolean)
        {
          com.tencent.mm.modelstat.n.a(2006, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
          w.d("MicroMsg.Radar.RadarManager", "lat:%f lng:%f accuracy:%f", new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1), Double.valueOf(paramAnonymousDouble2) });
          e.this.nZG = new Location(paramAnonymousFloat2, paramAnonymousFloat1, (int)paramAnonymousDouble2, paramAnonymousInt, "", "");
          e.this.nZR.z(0L, 0L);
        }
        for (;;)
        {
          e locale = e.this;
          if (locale.nZJ != null) {
            locale.nZJ.gM(true);
          }
          GMTrace.o(15402960683008L, 114761);
          return false;
          e.this.stop();
        }
      }
    };
    this.nZJ = paramc;
    this.context = paramContext;
    GMTrace.o(8893400875008L, 66261);
  }
  
  private void a(int paramInt1, int paramInt2, LinkedList<awx> paramLinkedList)
  {
    GMTrace.i(8894071963648L, 66266);
    if (this.nZJ != null) {
      this.nZJ.a(paramInt1, paramInt2, paramLinkedList);
    }
    GMTrace.o(8894071963648L, 66266);
  }
  
  private void aZJ()
  {
    GMTrace.i(8893803528192L, 66264);
    this.nZS.sendEmptyMessageDelayed(1, 5000L);
    GMTrace.o(8893803528192L, 66264);
  }
  
  private Map<String, c.d> aZM()
  {
    GMTrace.i(8894743052288L, 66271);
    if (this.nZN == null) {
      this.nZN = new HashMap();
    }
    Map localMap = this.nZN;
    GMTrace.o(8894743052288L, 66271);
    return localMap;
  }
  
  private Map<String, c.d> aZN()
  {
    GMTrace.i(8894877270016L, 66272);
    if (this.nZO == null) {
      this.nZO = new HashMap();
    }
    Map localMap = this.nZO;
    GMTrace.o(8894877270016L, 66272);
    return localMap;
  }
  
  private void b(int paramInt1, int paramInt2, LinkedList<awu> paramLinkedList)
  {
    GMTrace.i(8894206181376L, 66267);
    if (this.nZJ != null) {
      this.nZJ.b(paramInt1, paramInt2, paramLinkedList);
    }
    GMTrace.o(8894206181376L, 66267);
  }
  
  public final c.d a(awx paramawx, boolean paramBoolean)
  {
    GMTrace.i(8895414140928L, 66276);
    c.d locald2 = an(paramawx.jhi, paramBoolean);
    c.d locald1 = locald2;
    if (locald2 == null) {
      locald1 = an(paramawx.ujf, paramBoolean);
    }
    GMTrace.o(8895414140928L, 66276);
    return locald1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8894340399104L, 66268);
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(8894340399104L, 66268);
      return;
      if (this.nZH == paramk)
      {
        paramString = (b)paramk;
        if (paramString.eHz == 1)
        {
          this.nZK = e.oaj;
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            w.d("MicroMsg.Radar.RadarManager", "rader members count: %s ticket: %s", new Object[] { Integer.valueOf(paramString.aZF()), this.eEU });
            this.nZR.z(3000L, 3000L);
            paramk = ((awz)paramString.fUa.gtD.gtK).tPE;
            if (paramk != null)
            {
              Iterator localIterator = paramk.iterator();
              while (localIterator.hasNext())
              {
                awx localawx = (awx)localIterator.next();
                at.AR();
                com.tencent.mm.y.c.zu().fd(localawx.jhi, localawx.uoe);
              }
            }
            this.gPh.clear();
            this.gPh.addAll(paramk);
            paramk = this.gPh;
            paramString.aZF();
            a(paramInt1, paramInt2, paramk);
            w.d("MicroMsg.Radar.RadarManager", "status: %s", new Object[] { this.nZK });
            GMTrace.o(8894340399104L, 66268);
            return;
          }
          stop();
          a(paramInt1, paramInt2, null);
          GMTrace.o(8894340399104L, 66268);
          return;
        }
        a(paramInt1, paramInt2, null);
        GMTrace.o(8894340399104L, 66268);
        return;
        w.d("MicroMsg.Radar.RadarManager", " MMFunc_MMRadarRelationChain ");
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = (aww)((a)paramk).fUa.gtD.gtK;
          this.eEU = paramString.ugx;
          if (paramString.jNj > 0)
          {
            paramk = paramString.tPE;
            int i = paramString.jNj;
            b(paramInt1, paramInt2, paramk);
            GMTrace.o(8894340399104L, 66268);
            return;
          }
          b(paramInt1, paramInt2, null);
          GMTrace.o(8894340399104L, 66268);
          return;
        }
        b(paramInt1, paramInt2, null);
      }
    }
  }
  
  public final void a(awx paramawx)
  {
    GMTrace.i(8895682576384L, 66278);
    if ((aZO() != null) && (paramawx != null))
    {
      paramawx = com.tencent.mm.plugin.radar.ui.c.b(paramawx);
      if (aZO().containsKey(paramawx))
      {
        aZO().remove(paramawx);
        GMTrace.o(8895682576384L, 66278);
        return;
      }
      aZO().put(paramawx, a.nZV);
    }
    GMTrace.o(8895682576384L, 66278);
  }
  
  public final void a(String paramString, c.d paramd)
  {
    GMTrace.i(8895145705472L, 66274);
    c.d locald = (c.d)aZM().get(paramString);
    if ((locald != null) && (locald != paramd)) {
      aZN().put(paramString, locald);
    }
    GMTrace.o(8895145705472L, 66274);
  }
  
  public final void aZH()
  {
    GMTrace.i(8893535092736L, 66262);
    aZI();
    this.guN = false;
    this.nZG = null;
    this.nZK = e.oag;
    this.nZR.stopTimer();
    w.d("MicroMsg.Radar.RadarManager", "start radar");
    if (this.gxh == null) {
      this.gxh = com.tencent.mm.modelgeo.c.Ir();
    }
    this.nZK = e.oah;
    this.gxh.a(this.fJt, true);
    w.d("MicroMsg.Radar.RadarManager", "status: %s", new Object[] { this.nZK });
    GMTrace.o(8893535092736L, 66262);
  }
  
  public final void aZI()
  {
    GMTrace.i(8893669310464L, 66263);
    switch (4.nZU[this.nZK.ordinal()])
    {
    }
    for (;;)
    {
      w.d("MicroMsg.Radar.RadarManager", "stop radar");
      GMTrace.o(8893669310464L, 66263);
      return;
      GMTrace.o(8893669310464L, 66263);
      return;
      stop();
      GMTrace.o(8893669310464L, 66263);
      return;
      if (this.nZH != null)
      {
        stop();
        at.wS().c(this.nZH);
        aZJ();
      }
      GMTrace.o(8893669310464L, 66263);
      return;
      stop();
      aZJ();
    }
  }
  
  public final HashMap<String, String> aZK()
  {
    GMTrace.i(8894474616832L, 66269);
    if (this.nZM == null) {
      this.nZM = new HashMap();
    }
    HashMap localHashMap = this.nZM;
    GMTrace.o(8894474616832L, 66269);
    return localHashMap;
  }
  
  public final Map<Long, b> aZL()
  {
    GMTrace.i(8894608834560L, 66270);
    if (this.nZP == null) {
      this.nZP = new HashMap();
    }
    Map localMap = this.nZP;
    GMTrace.o(8894608834560L, 66270);
    return localMap;
  }
  
  public final Map<String, a> aZO()
  {
    GMTrace.i(8895011487744L, 66273);
    if (this.nZQ == null) {
      this.nZQ = new HashMap();
    }
    Map localMap = this.nZQ;
    GMTrace.o(8895011487744L, 66273);
    return localMap;
  }
  
  public final c.d an(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8895548358656L, 66277);
    Map localMap;
    if (!paramBoolean)
    {
      localMap = aZM();
      if (bg.nl(paramString).equals("")) {
        break label61;
      }
    }
    label61:
    for (paramString = (c.d)localMap.get(paramString);; paramString = null)
    {
      GMTrace.o(8895548358656L, 66277);
      return paramString;
      localMap = aZN();
      break;
    }
  }
  
  public final void b(String paramString, c.d paramd)
  {
    GMTrace.i(8895279923200L, 66275);
    if (!bg.nl(paramString).equals(""))
    {
      a(paramString, paramd);
      aZM().put(paramString, paramd);
    }
    GMTrace.o(8895279923200L, 66275);
  }
  
  public final void stop()
  {
    GMTrace.i(8893937745920L, 66265);
    this.guN = true;
    this.nZK = e.oag;
    this.nZR.stopTimer();
    GMTrace.o(8893937745920L, 66265);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(8896487882752L, 66284);
      nZV = new a("Selected", 0);
      nZW = new a("UnSelected", 1);
      nZX = new a[] { nZV, nZW };
      GMTrace.o(8896487882752L, 66284);
    }
    
    private a()
    {
      GMTrace.i(8896353665024L, 66283);
      GMTrace.o(8896353665024L, 66283);
    }
  }
  
  public static final class b
  {
    public awx nZY;
    public c.d nZZ;
    
    public b(awx paramawx, c.d paramd)
    {
      GMTrace.i(8889105907712L, 66229);
      this.nZY = paramawx;
      this.nZZ = paramd;
      GMTrace.o(8889105907712L, 66229);
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(int paramInt1, int paramInt2, LinkedList<awx> paramLinkedList);
    
    public abstract void b(int paramInt1, int paramInt2, LinkedList<awu> paramLinkedList);
    
    public abstract void gM(boolean paramBoolean);
  }
  
  public static enum d
  {
    static
    {
      GMTrace.i(8890448084992L, 66239);
      oaa = new d("SEARCHING", 0);
      oab = new d("SEARCH_RETRUN", 1);
      oac = new d("RALATIONCHAIN", 2);
      oad = new d("RALATIONCHAIN_RETRUN", 3);
      oae = new d("CREATING_CHAT", 4);
      oaf = new d[] { oaa, oab, oac, oad, oae };
      GMTrace.o(8890448084992L, 66239);
    }
    
    private d()
    {
      GMTrace.i(8890313867264L, 66238);
      GMTrace.o(8890313867264L, 66238);
    }
  }
  
  private static enum e
  {
    static
    {
      GMTrace.i(8891253391360L, 66245);
      oag = new e("Stopped", 0);
      oah = new e("Locating", 1);
      oai = new e("RadarSearching", 2);
      oaj = new e("Waiting", 3);
      oak = new e[] { oag, oah, oai, oaj };
      GMTrace.o(8891253391360L, 66245);
    }
    
    private e()
    {
      GMTrace.i(8891119173632L, 66244);
      GMTrace.o(8891119173632L, 66244);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */