package com.tencent.mm.plugin.wear.model;

import android.os.Looper;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.af.f;
import com.tencent.mm.g.a.te;
import com.tencent.mm.g.a.te.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.protocal.c.bsb;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.LinkedList;
import java.util.List;

public final class b
  implements com.tencent.mm.ad.e
{
  m.b lxD;
  public boolean rzD;
  com.tencent.mm.sdk.b.c rzE;
  aj rzF;
  
  public b()
  {
    GMTrace.i(9208409882624L, 68608);
    this.rzE = new com.tencent.mm.sdk.b.c() {};
    this.lxD = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(9179284635648L, 68391);
        if ((paramAnonymousObject == null) || (!(paramAnonymousObject instanceof String)))
        {
          w.d("MicroMsg.Wear.WearBizLogic", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousm, paramAnonymousObject });
          GMTrace.o(9179284635648L, 68391);
          return;
        }
        paramAnonymousm = (String)paramAnonymousObject;
        if ((paramAnonymousm != null) && (paramAnonymousm.equals("gh_43f2581f6fd6")))
        {
          if ((!b.bBn()) && (b.this.rzD))
          {
            b.this.rzD = false;
            GMTrace.o(9179284635648L, 68391);
            return;
          }
          if ((b.bBn()) && (!b.this.rzD)) {
            b.this.connect();
          }
        }
        GMTrace.o(9179284635648L, 68391);
      }
    };
    this.rzF = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(9180089942016L, 68397);
        b.a(a.bBm().rzt.rzK.rAy);
        GMTrace.o(9180089942016L, 68397);
        return true;
      }
    }, true);
    com.tencent.mm.sdk.b.a.vgX.b(this.rzE);
    at.AR();
    com.tencent.mm.y.c.yK().a(this.lxD);
    GMTrace.o(9208409882624L, 68608);
  }
  
  static boolean KR(String paramString)
  {
    GMTrace.i(9208812535808L, 68611);
    te localte = new te();
    localte.eYK.eCx = 3;
    localte.eYK.esG = paramString;
    localte.eYK.eEl = "gh_43f2581f6fd6";
    com.tencent.mm.sdk.b.a.vgX.m(localte);
    w.i("MicroMsg.Wear.WearBizLogic", "isRegister: %b", new Object[] { Boolean.valueOf(localte.eYK.eFN) });
    boolean bool = localte.eYK.eFN;
    GMTrace.o(9208812535808L, 68611);
    return bool;
  }
  
  public static void a(bsb parambsb)
  {
    GMTrace.i(9209080971264L, 68613);
    if (parambsb != null)
    {
      te localte = new te();
      localte.eYK.eCx = 6;
      localte.eYK.esG = parambsb.vbo;
      com.tencent.mm.sdk.b.a.vgX.m(localte);
      GMTrace.o(9209080971264L, 68613);
      return;
    }
    w.i("MicroMsg.Wear.WearBizLogic", "request is null");
    GMTrace.o(9209080971264L, 68613);
  }
  
  public static boolean bBn()
  {
    GMTrace.i(9208946753536L, 68612);
    at.AR();
    boolean bool = com.tencent.mm.l.a.eE(com.tencent.mm.y.c.yK().TE("gh_43f2581f6fd6").field_type);
    GMTrace.o(9208946753536L, 68612);
    return bool;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9208678318080L, 68610);
    Object localObject;
    if ((paramk instanceof com.tencent.mm.plugin.wear.model.d.a))
    {
      at.wS().b(1091, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.Wear.WearBizLogic", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        GMTrace.o(9208678318080L, 68610);
        return;
      }
      paramk = (com.tencent.mm.plugin.wear.model.d.a)paramk;
      paramString = paramk.esG;
      paramk = paramk.eEl;
      localObject = new te();
      ((te)localObject).eYK.eCx = 1;
      ((te)localObject).eYK.esG = paramString;
      ((te)localObject).eYK.eEl = paramk;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(9208678318080L, 68610);
      return;
    }
    if ((paramk instanceof com.tencent.mm.pluginsdk.model.n))
    {
      at.wS().b(30, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.Wear.WearBizLogic", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        if ((paramInt1 == 4) && (paramInt2 == -24) && (!bg.nm(paramString)))
        {
          Toast.makeText(ab.getContext(), paramString, 1).show();
          GMTrace.o(9208678318080L, 68610);
        }
      }
      else
      {
        localObject = ((com.tencent.mm.pluginsdk.model.n)paramk).bJk();
        w.i("MicroMsg.Wear.WearBizLogic", "bind fitness contact %s success", new Object[] { localObject });
        at.AR();
        paramk = com.tencent.mm.y.c.yK().TE("gh_43f2581f6fd6");
        if ((paramk != null) && (!bg.nm((String)localObject))) {
          break label376;
        }
        w.e("MicroMsg.Wear.WearBizLogic", "respUsername == " + (String)localObject + ", contact = " + paramk);
      }
    }
    for (;;)
    {
      paramString = com.tencent.mm.af.x.FG().iC(paramk.field_username);
      com.tencent.mm.af.x.FG().e(paramString);
      at.AR();
      com.tencent.mm.y.c.xh().set(327825, Boolean.valueOf(true));
      connect();
      GMTrace.o(9208678318080L, 68610);
      return;
      label376:
      paramString = null;
      if (s.fB(paramk.field_username))
      {
        String str = bg.nl(paramk.field_username);
        paramString = f.iK(str);
        if (paramString != null) {
          paramString.field_username = ((String)localObject);
        }
        com.tencent.mm.af.x.FG().iD(str);
        paramk.cr(str);
      }
      paramk.setUsername((String)localObject);
      if ((int)paramk.fTq == 0)
      {
        at.AR();
        com.tencent.mm.y.c.yK().S(paramk);
      }
      if ((int)paramk.fTq <= 0)
      {
        w.e("MicroMsg.Wear.WearBizLogic", "addContact : insert contact failed");
      }
      else
      {
        s.p(paramk);
        at.AR();
        localObject = com.tencent.mm.y.c.yK().TE(paramk.field_username);
        if (paramString != null)
        {
          com.tencent.mm.af.x.FG().d(paramString);
        }
        else
        {
          paramString = f.iK(((af)localObject).field_username);
          if ((paramString == null) || (paramString.Ez()))
          {
            w.d("MicroMsg.Wear.WearBizLogic", "shouldUpdate");
            ak.a.gmX.K(((af)localObject).field_username, "");
            com.tencent.mm.ac.b.hR(((af)localObject).field_username);
          }
          else if (((com.tencent.mm.storage.x)localObject).needUpdate())
          {
            w.d("MicroMsg.Wear.WearBizLogic", "update contact, last check time=%d", new Object[] { Integer.valueOf(((af)localObject).fjr) });
            ak.a.gmX.K(((af)localObject).field_username, "");
            com.tencent.mm.ac.b.hR(((af)localObject).field_username);
          }
        }
      }
    }
  }
  
  public final void connect()
  {
    GMTrace.i(9208544100352L, 68609);
    Object localObject = a.bBm().rzt.rzK.rAy;
    if (localObject == null)
    {
      w.e("MicroMsg.Wear.WearBizLogic", "get connect wear data error");
      GMTrace.o(9208544100352L, 68609);
      return;
    }
    if (!bBn())
    {
      at.AR();
      boolean bool = ((Boolean)com.tencent.mm.y.c.xh().get(327825, Boolean.valueOf(false))).booleanValue();
      w.i("MicroMsg.Wear.WearBizLogic", "auto focus biz contact %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        if (bg.Jw())
        {
          w.i("MicroMsg.Wear.WearBizLogic", "oversea user, forbid biz auto focus logic");
          GMTrace.o(9208544100352L, 68609);
          return;
        }
        a.bBm().rzz.a(new a());
        a.bBm().rzz.a(new b((bsb)localObject));
      }
      GMTrace.o(9208544100352L, 68609);
      return;
    }
    if (!KR(((bsb)localObject).vbo))
    {
      w.i("MicroMsg.Wear.WearBizLogic", "start to register device %s", new Object[] { ((bsb)localObject).vbo });
      a.bBm().rzz.a(new b((bsb)localObject));
      GMTrace.o(9208544100352L, 68609);
      return;
    }
    if (!this.rzD)
    {
      w.i("MicroMsg.Wear.WearBizLogic", "start to auth device %s", new Object[] { ((bsb)localObject).vbo });
      localObject = ((bsb)localObject).vbo;
      if ((!this.rzD) && (KR((String)localObject)))
      {
        w.i("MicroMsg.Wear.WearBizLogic", "auth device, deviceId=%s | deviceType=%s", new Object[] { localObject, "gh_43f2581f6fd6" });
        te localte = new te();
        localte.eYK.eCx = 7;
        localte.eYK.esG = ((String)localObject);
        localte.eYK.eEl = "gh_43f2581f6fd6";
        com.tencent.mm.sdk.b.a.vgX.m(localte);
      }
      GMTrace.o(9208544100352L, 68609);
      return;
    }
    if (this.rzF.bQn())
    {
      w.i("MicroMsg.Wear.WearBizLogic", "start step count timer");
      this.rzF.z(3600000L, 3600000L);
    }
    for (;;)
    {
      a((bsb)localObject);
      GMTrace.o(9208544100352L, 68609);
      return;
      w.i("MicroMsg.Wear.WearBizLogic", "stop timer and restart step count timer");
      this.rzF.stopTimer();
      this.rzF.z(3600000L, 3600000L);
    }
  }
  
  private final class a
    extends com.tencent.mm.plugin.wear.model.f.d
  {
    public a()
    {
      GMTrace.i(9209617842176L, 68617);
      GMTrace.o(9209617842176L, 68617);
    }
    
    public final void execute()
    {
      GMTrace.i(9209752059904L, 68618);
      at.wS().a(30, b.this);
      Object localObject = new LinkedList();
      ((LinkedList)localObject).add("gh_43f2581f6fd6");
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(Integer.valueOf(1));
      localObject = new com.tencent.mm.pluginsdk.model.n(1, (List)localObject, localLinkedList, "", "");
      at.wS().a((k)localObject, 0);
      GMTrace.o(9209752059904L, 68618);
    }
    
    public final String getName()
    {
      GMTrace.i(9209886277632L, 68619);
      GMTrace.o(9209886277632L, 68619);
      return "AddContactTask";
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.wear.model.f.d
  {
    private bsb rzH;
    
    public b(bsb parambsb)
    {
      GMTrace.i(9178747764736L, 68387);
      this.rzH = parambsb;
      GMTrace.o(9178747764736L, 68387);
    }
    
    public final void execute()
    {
      GMTrace.i(9178881982464L, 68388);
      at.wS().a(1091, b.this);
      com.tencent.mm.plugin.wear.model.d.a locala = new com.tencent.mm.plugin.wear.model.d.a(this.rzH.vbo, "gh_43f2581f6fd6");
      at.wS().a(locala, 0);
      GMTrace.o(9178881982464L, 68388);
    }
    
    public final String getName()
    {
      GMTrace.i(9179016200192L, 68389);
      GMTrace.o(9179016200192L, 68389);
      return "RegisterDeviceTask";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */