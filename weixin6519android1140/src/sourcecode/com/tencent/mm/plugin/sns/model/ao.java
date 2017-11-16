package com.tencent.mm.plugin.sns.model;

import android.view.Menu;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.g.a.qc;
import com.tencent.mm.g.a.qd;
import com.tencent.mm.g.a.rg;
import com.tencent.mm.g.a.ri;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class ao
{
  private static HashMap<String, b> pvN;
  public static LinkedList<a> pvO;
  private static c pvP;
  
  static
  {
    GMTrace.i(8088228724736L, 60262);
    pvN = new HashMap();
    pvO = new LinkedList();
    pvP = new c() {};
    GMTrace.o(8088228724736L, 60262);
  }
  
  public static b HA(String paramString)
  {
    GMTrace.i(8087691853824L, 60258);
    if (pvN.containsKey(paramString))
    {
      paramString = (b)pvN.get(paramString);
      GMTrace.o(8087691853824L, 60258);
      return paramString;
    }
    GMTrace.o(8087691853824L, 60258);
    return null;
  }
  
  public static void a(Menu paramMenu, boolean paramBoolean)
  {
    GMTrace.i(8085544370176L, 60242);
    if (pH())
    {
      if (paramBoolean)
      {
        paramMenu.add(0, 14, 0, i.j.pkY);
        GMTrace.o(8085544370176L, 60242);
        return;
      }
      paramMenu.add(0, 15, 0, i.j.pkY);
    }
    GMTrace.o(8085544370176L, 60242);
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(8085947023360L, 60245);
    if ((paramb.fje & 0x2) != 0) {
      paramb.pvS = false;
    }
    for (;;)
    {
      pvN.put(paramb.id, paramb);
      GMTrace.o(8085947023360L, 60245);
      return;
      if ((paramb.fje & 0x4) != 0) {
        paramb.pvT = false;
      }
    }
  }
  
  public static void a(com.tencent.mm.plugin.sns.ui.m paramm)
  {
    GMTrace.i(8086349676544L, 60248);
    if ((paramm != null) && (paramm.pso != null))
    {
      String str = paramm.nIp;
      Object localObject = new StringBuilder();
      if (paramm.pso.uQm != 0) {}
      for (long l = paramm.pso.uQm;; l = paramm.pso.uQp)
      {
        localObject = l;
        paramm = dF(paramm.pPG, (String)localObject);
        if (!pvN.containsKey(paramm)) {
          break label176;
        }
        localObject = (b)pvN.get(paramm);
        if ((!((b)localObject).gpJ) || (bg.nm(((b)localObject).result))) {
          break;
        }
        w.d("MicroMsg.SnsTranslateManager", "translateComment, get from cache, id:%s", new Object[] { paramm });
        e(((b)localObject).id, 2, ((b)localObject).result, ((b)localObject).gxw);
        GMTrace.o(8086349676544L, 60248);
        return;
      }
      pvN.remove(paramm);
      label176:
      localObject = new rg();
      ((rg)localObject).eWf.id = paramm;
      ((rg)localObject).eWf.eWg = str;
      ((rg)localObject).eWf.type = 3;
      a.vgX.m((b)localObject);
      bM(paramm, 2);
      localObject = new a();
      ((a)localObject).id = paramm;
      ((a)localObject).pvQ = str;
      ((a)localObject).type = 3;
      pvO.add(localObject);
      w.d("MicroMsg.SnsTranslateManager", "translateComment, id:%s", new Object[] { ((a)localObject).id });
    }
    GMTrace.o(8086349676544L, 60248);
  }
  
  public static void b(Menu paramMenu, boolean paramBoolean)
  {
    GMTrace.i(8085678587904L, 60243);
    if (pH())
    {
      if (paramBoolean)
      {
        paramMenu.add(0, 16, 0, i.j.pla);
        GMTrace.o(8085678587904L, 60243);
        return;
      }
      paramMenu.add(0, 17, 0, i.j.pla);
    }
    GMTrace.o(8085678587904L, 60243);
  }
  
  private static void b(b paramb)
  {
    GMTrace.i(8086081241088L, 60246);
    if ((paramb.fje & 0x2) != 0) {
      paramb.pvS = true;
    }
    for (;;)
    {
      pvN.put(paramb.id, paramb);
      GMTrace.o(8086081241088L, 60246);
      return;
      if ((paramb.fje & 0x4) != 0) {
        paramb.pvT = true;
      }
    }
  }
  
  public static void b(com.tencent.mm.plugin.sns.ui.m paramm)
  {
    GMTrace.i(8086483894272L, 60249);
    Object localObject;
    if (paramm != null)
    {
      localObject = new StringBuilder();
      if (paramm.pso.uQm == 0) {
        break label120;
      }
    }
    label120:
    for (long l = paramm.pso.uQm;; l = paramm.pso.uQp)
    {
      localObject = l;
      paramm = dF(paramm.pPG, (String)localObject);
      b(HA(paramm));
      localObject = new qd();
      ((qd)localObject).eUN.type = 2;
      ((qd)localObject).eUN.id = paramm;
      a.vgX.m((b)localObject);
      w.d("MicroMsg.SnsTranslateManager", "unTranslateComment, id:%s", new Object[] { paramm });
      GMTrace.o(8086483894272L, 60249);
      return;
    }
  }
  
  public static a bL(String paramString, int paramInt)
  {
    GMTrace.i(16041568632832L, 119519);
    Iterator localIterator = pvO.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if ((locala.type == paramInt) && (!bg.nm(paramString)) && (!bg.nm(locala.id)) && (paramString.equals(locala.id)))
      {
        GMTrace.o(16041568632832L, 119519);
        return locala;
      }
    }
    GMTrace.o(16041568632832L, 119519);
    return null;
  }
  
  private static void bM(String paramString, int paramInt)
  {
    GMTrace.i(8086618112000L, 60250);
    if (!pvN.containsKey(paramString))
    {
      localObject = new b();
      ((b)localObject).id = paramString;
      ((b)localObject).gxw = null;
      ((b)localObject).result = null;
      ((b)localObject).gpJ = false;
      ((b)localObject).gsF = false;
      ((b)localObject).pvT = true;
      ((b)localObject).pvS = true;
      pvN.put(paramString, localObject);
    }
    Object localObject = new qc();
    ((qc)localObject).eUM.type = paramInt;
    ((qc)localObject).eUM.id = paramString;
    a.vgX.m((b)localObject);
    GMTrace.o(8086618112000L, 60250);
  }
  
  public static void bN(String paramString, int paramInt)
  {
    GMTrace.i(8087154982912L, 60254);
    if (pvN.containsKey(paramString))
    {
      b localb = (b)pvN.get(paramString);
      localb.fje |= paramInt;
      pvN.put(paramString, localb);
    }
    GMTrace.o(8087154982912L, 60254);
  }
  
  public static void bO(String paramString, int paramInt)
  {
    GMTrace.i(8087289200640L, 60255);
    if (pvN.containsKey(paramString))
    {
      b localb = (b)pvN.get(paramString);
      localb.fje &= (paramInt ^ 0xFFFFFFFF);
      if ((paramInt != 2) && (paramInt == 4)) {
        localb.pvT = true;
      }
      pvN.put(paramString, localb);
    }
    GMTrace.o(8087289200640L, 60255);
  }
  
  public static boolean bP(String paramString, int paramInt)
  {
    GMTrace.i(8087423418368L, 60256);
    if (pvN.containsKey(paramString))
    {
      if ((((b)pvN.get(paramString)).fje & paramInt) != 0)
      {
        GMTrace.o(8087423418368L, 60256);
        return true;
      }
      GMTrace.o(8087423418368L, 60256);
      return false;
    }
    GMTrace.o(8087423418368L, 60256);
    return false;
  }
  
  public static HashMap<String, b> bjG()
  {
    GMTrace.i(8087020765184L, 60253);
    HashMap localHashMap = pvN;
    GMTrace.o(8087020765184L, 60253);
    return localHashMap;
  }
  
  public static boolean c(b paramb)
  {
    GMTrace.i(8087557636096L, 60257);
    if (paramb != null)
    {
      if ((paramb.fje & 0x2) != 0)
      {
        GMTrace.o(8087557636096L, 60257);
        return true;
      }
      GMTrace.o(8087557636096L, 60257);
      return false;
    }
    GMTrace.o(8087557636096L, 60257);
    return false;
  }
  
  public static String dF(String paramString1, String paramString2)
  {
    GMTrace.i(8086886547456L, 60252);
    paramString1 = paramString1 + ";" + paramString2;
    GMTrace.o(8086886547456L, 60252);
    return paramString1;
  }
  
  public static void e(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(8086752329728L, 60251);
    if (pvN.containsKey(paramString1))
    {
      localObject = (b)pvN.get(paramString1);
      ((b)localObject).gxw = paramString3;
      ((b)localObject).result = paramString2;
      ((b)localObject).gpJ = true;
      ((b)localObject).gsF = bg.nm(paramString2);
      pvN.put(paramString1, localObject);
    }
    if (bg.nm(paramString2)) {
      Toast.makeText(ab.getContext(), i.j.pkZ, 1).show();
    }
    Object localObject = new qb();
    ((qb)localObject).eUK.type = paramInt;
    ((qb)localObject).eUK.id = paramString1;
    ((qb)localObject).eUK.result = paramString2;
    ((qb)localObject).eUK.eUL = paramString3;
    a.vgX.m((b)localObject);
    GMTrace.o(8086752329728L, 60251);
  }
  
  public static void init()
  {
    GMTrace.i(8085141716992L, 60239);
    a.vgX.b(pvP);
    GMTrace.o(8085141716992L, 60239);
  }
  
  public static void o(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8085812805632L, 60244);
    if (paramm != null)
    {
      String str = paramm.blE();
      w.d("MicroMsg.SnsTranslateManager", "translatePost, id:%s", new Object[] { str });
      if (paramm.field_snsId == 0L)
      {
        w.d("MicroMsg.SnsTranslateManager", "translatePost, the id is null or zero");
        pvN.remove(str);
        e(str, 1, null, null);
        GMTrace.o(8085812805632L, 60244);
        return;
      }
      Object localObject;
      if (pvN.containsKey(str))
      {
        localObject = (b)pvN.get(str);
        if ((((b)localObject).gpJ) && (!((b)localObject).gsF))
        {
          w.d("MicroMsg.SnsTranslateManager", "translatePost, get from cache, id:%s", new Object[] { str });
          e(((b)localObject).id, 1, ((b)localObject).result, ((b)localObject).gxw);
          GMTrace.o(8085812805632L, 60244);
          return;
        }
        pvN.remove(str);
      }
      if (paramm.blD() != null)
      {
        localObject = paramm.blD().uTZ;
        rg localrg = new rg();
        localrg.eWf.id = str;
        localrg.eWf.eWg = ((String)localObject);
        localrg.eWf.type = 2;
        a.vgX.m(localrg);
        bM(paramm.blE(), 1);
        paramm = new a();
        paramm.id = str;
        paramm.pvQ = ((String)localObject);
        paramm.type = 2;
        pvO.add(paramm);
      }
    }
    GMTrace.o(8085812805632L, 60244);
  }
  
  public static void p(com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8086215458816L, 60247);
    if (paramm != null)
    {
      paramm = paramm.blE();
      b(HA(paramm));
      qd localqd = new qd();
      localqd.eUN.type = 1;
      localqd.eUN.id = paramm;
      a.vgX.m(localqd);
      w.d("MicroMsg.SnsTranslateManager", "unTranslatePost, id:%s", new Object[] { paramm });
    }
    GMTrace.o(8086215458816L, 60247);
  }
  
  private static boolean pH()
  {
    GMTrace.i(8085410152448L, 60241);
    if (!d.LL("translate"))
    {
      GMTrace.o(8085410152448L, 60241);
      return false;
    }
    String str = g.ut().getValue("TranslateSnsOff");
    if (bg.nm(str))
    {
      GMTrace.o(8085410152448L, 60241);
      return true;
    }
    if (bg.Sy(str) != 0)
    {
      GMTrace.o(8085410152448L, 60241);
      return false;
    }
    GMTrace.o(8085410152448L, 60241);
    return true;
  }
  
  public static void unInit()
  {
    GMTrace.i(8085275934720L, 60240);
    a.vgX.c(pvP);
    GMTrace.o(8085275934720L, 60240);
  }
  
  private static final class a
  {
    String eUL;
    String id;
    String pvQ;
    String pvR;
    int type;
    
    public a()
    {
      GMTrace.i(8152787451904L, 60743);
      GMTrace.o(8152787451904L, 60743);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(8152921669632L, 60744);
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((this.id.equals(((a)paramObject).id)) && (this.type == ((a)paramObject).type))
        {
          GMTrace.o(8152921669632L, 60744);
          return true;
        }
        GMTrace.o(8152921669632L, 60744);
        return false;
      }
      boolean bool = super.equals(paramObject);
      GMTrace.o(8152921669632L, 60744);
      return bool;
    }
  }
  
  public static final class b
  {
    public int fje;
    public boolean gpJ;
    public boolean gsF;
    public String gxw;
    public String id;
    public boolean pvS;
    public boolean pvT;
    public String result;
    
    public b()
    {
      GMTrace.i(8112924786688L, 60446);
      GMTrace.o(8112924786688L, 60446);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */