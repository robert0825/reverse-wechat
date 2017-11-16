package com.tencent.mm.plugin.aa.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.aa.a.a.f;
import com.tencent.mm.protocal.c.i;
import com.tencent.mm.protocal.c.y;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;
import java.util.Map;

public final class k
  implements e
{
  public static String hoS;
  public static String hoT;
  public static String hoU;
  public static String hoV;
  public static String hoW;
  public static String hoX;
  public static String hoY;
  public static String hoZ;
  private static int hpa;
  private com.tencent.mm.vending.g.b gty;
  private boolean hpb;
  private Map<String, Object> hpc;
  private int mode;
  
  static
  {
    GMTrace.i(5582249525248L, 41591);
    hoS = "title";
    hoT = "totalPayAmount";
    hoU = "totalUserNumber";
    hoV = "perAmount";
    hoW = "chatRoomName";
    hoX = "launchScene";
    hoY = "payerlist";
    hoZ = "timestamp";
    hpa = 131100026;
    GMTrace.o(5582249525248L, 41591);
  }
  
  public k()
  {
    GMTrace.i(5581712654336L, 41587);
    this.hpb = false;
    this.mode = 0;
    GMTrace.o(5581712654336L, 41587);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(5582115307520L, 41590);
    w.d("MicroMsg.LaunchAALogic", "onSceneEnd, errType: %s, errCode: %s, scene: %s, mode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramk, Integer.valueOf(this.mode) });
    String str;
    boolean bool;
    if (paramk.getType() == 1624)
    {
      this.hpb = false;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramk = (f)paramk;
        paramString = paramk.hpk;
        paramInt1 = paramString.jWs;
        str = paramString.jWt;
        if (paramString.tMb == null)
        {
          bool = true;
          w.i("MicroMsg.LaunchAALogic", "launchAAByMoney, onSceneEnd, retCode: %s, retmsg: %s, msgXml==null: %s, billNo: %s", new Object[] { Integer.valueOf(paramInt1), str, Boolean.valueOf(bool), paramString.tLZ });
          if (paramString.jWs != 0) {
            break label257;
          }
          if (paramString.tMb == null) {
            break label227;
          }
          h.q(paramString.tLZ, paramk.chatroomName, paramString.tMb);
          com.tencent.mm.vending.g.g.a(this.gty, new Object[] { Boolean.valueOf(true) });
        }
        for (;;)
        {
          h.nt(paramk.chatroomName);
          com.tencent.mm.plugin.report.service.g.ork.a(407L, 0L, 1L, false);
          GMTrace.o(5582115307520L, 41590);
          return;
          bool = false;
          break;
          label227:
          h.a(paramString.tLZ, false, 0L);
          com.tencent.mm.vending.g.g.a(this.gty, new Object[] { Boolean.valueOf(true) });
        }
        label257:
        if (this.gty != null)
        {
          if (paramString.jWs <= 0) {
            break label366;
          }
          paramk = paramString.tMh;
          if ((paramk == null) || (paramk.tMT <= 0)) {
            break label324;
          }
          this.gty.bU(paramk);
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(407L, 2L, 1L, false);
          GMTrace.o(5582115307520L, 41590);
          return;
          label324:
          if (!bg.nm(paramString.jWt))
          {
            this.gty.bU(paramString.jWt);
          }
          else
          {
            this.gty.bU(Boolean.valueOf(false));
            continue;
            label366:
            this.gty.bU(Boolean.valueOf(false));
          }
        }
      }
      if (this.gty != null) {
        this.gty.bU(Boolean.valueOf(false));
      }
      com.tencent.mm.plugin.report.service.g.ork.a(407L, 1L, 1L, false);
      GMTrace.o(5582115307520L, 41590);
      return;
    }
    if (paramk.getType() == 1655)
    {
      this.hpb = false;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramk = (com.tencent.mm.plugin.aa.a.a.g)paramk;
        paramString = paramk.hpm;
        paramInt1 = paramString.jWs;
        str = paramString.jWt;
        if (paramString.tMb == null)
        {
          bool = true;
          w.i("MicroMsg.LaunchAALogic", "launchAAByPerson, onSceneEnd, retCode: %s, retmsg: %s, msgxml==null: %s", new Object[] { Integer.valueOf(paramInt1), str, Boolean.valueOf(bool) });
          w.d("MicroMsg.LaunchAALogic", "launchAAByPerson, onSceneEnd, retMsg: %s, billNo: %s", new Object[] { paramString.jWt, paramString.tLZ });
          if (paramString.jWs != 0) {
            break label666;
          }
          if (paramString.tMb == null) {
            break label629;
          }
          h.q(paramString.tLZ, paramk.chatroomName, paramString.tMb);
          com.tencent.mm.vending.g.g.a(this.gty, new Object[] { Boolean.valueOf(true), paramString.tLZ });
        }
        for (;;)
        {
          h.nt(paramk.chatroomName);
          com.tencent.mm.plugin.report.service.g.ork.a(407L, 3L, 1L, false);
          GMTrace.o(5582115307520L, 41590);
          return;
          bool = false;
          break;
          label629:
          h.a(paramString.tLZ, false, 0L);
          com.tencent.mm.vending.g.g.a(this.gty, new Object[] { Boolean.valueOf(true), paramString.tLZ });
        }
        label666:
        if (paramString.jWs > 0)
        {
          paramk = paramString.tMh;
          if ((paramk != null) && (paramk.tMT > 0)) {
            this.gty.bU(paramk);
          }
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(407L, 5L, 1L, false);
          GMTrace.o(5582115307520L, 41590);
          return;
          if (!bg.nm(paramString.jWt))
          {
            this.gty.bU(paramString.jWt);
          }
          else
          {
            this.gty.bU(Boolean.valueOf(false));
            continue;
            this.gty.bU(Boolean.valueOf(false));
          }
        }
      }
      if (this.gty != null) {
        this.gty.bU(Boolean.valueOf(false));
      }
      com.tencent.mm.plugin.report.service.g.ork.a(407L, 4L, 1L, false);
    }
    GMTrace.o(5582115307520L, 41590);
  }
  
  public final boolean d(int paramInt, Map<String, Object> paramMap)
  {
    GMTrace.i(5581846872064L, 41588);
    this.gty = com.tencent.mm.vending.g.g.ckh();
    if (this.hpb)
    {
      w.e("MicroMsg.LaunchAALogic", "launchAA, isLaunching!!! ignore it");
      this.gty.bU(Boolean.valueOf(false));
      GMTrace.o(5581846872064L, 41588);
      return false;
    }
    if ((paramMap == null) || (paramMap.size() == 0))
    {
      this.gty.bU(Boolean.valueOf(false));
      GMTrace.o(5581846872064L, 41588);
      return false;
    }
    w.i("MicroMsg.LaunchAALogic", "launchAAByMoney, data.keySet: %s", new Object[] { paramMap.keySet() });
    this.hpb = true;
    this.hpc = paramMap;
    this.mode = paramInt;
    long l1;
    Object localObject;
    long l2;
    if (paramInt == a.hnW)
    {
      if ((this.hpc.containsKey(hoS)) && (this.hpc.containsKey(hoV)) && (this.hpc.containsKey(hoU)) && (this.hpc.containsKey(hoX)) && (this.hpc.containsKey(hoW)) && (this.hpc.containsKey(hoZ))) {
        try
        {
          paramMap = (String)this.hpc.get(hoS);
          l1 = ((Long)this.hpc.get(hoV)).longValue();
          paramInt = ((Integer)this.hpc.get(hoU)).intValue();
          int i = ((Integer)this.hpc.get(hoX)).intValue();
          localObject = (String)this.hpc.get(hoW);
          l2 = ((Long)this.hpc.get(hoZ)).longValue();
          w.i("MicroMsg.LaunchAALogic", "launchAAByMoney");
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(new f(l1, paramMap, paramInt, i, l2, (String)localObject), 0);
          if ((paramInt > 0) && (paramInt <= 10)) {
            paramInt = 13;
          }
          for (;;)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(407L, paramInt, 1L, false);
            this.gty.ckg();
            GMTrace.o(5581846872064L, 41588);
            return true;
            if ((paramInt > 10) && (paramInt <= 20)) {
              paramInt = 14;
            } else if ((paramInt > 20) && (paramInt <= 50)) {
              paramInt = 15;
            } else {
              paramInt = 16;
            }
          }
          this.gty.bU(Boolean.valueOf(false));
        }
        catch (Exception paramMap)
        {
          w.e("MicroMsg.LaunchAALogic", "launchAAByMoney, without specific user error: %s", new Object[] { paramMap.getMessage() });
          this.gty.bU(Boolean.valueOf(false));
          this.hpb = false;
          GMTrace.o(5581846872064L, 41588);
          return false;
        }
      }
      this.hpb = false;
      GMTrace.o(5581846872064L, 41588);
      return false;
    }
    if (paramInt == a.hnX)
    {
      if ((this.hpc.containsKey(hoS)) && (this.hpc.containsKey(hoV)) && (this.hpc.containsKey(hoY)) && (this.hpc.containsKey(hoX)) && (this.hpc.containsKey(hoW)) && (this.hpc.containsKey(hoZ))) {
        try
        {
          paramMap = (String)this.hpc.get(hoS);
          l1 = ((Long)this.hpc.get(hoV)).longValue();
          localObject = (List)this.hpc.get(hoY);
          paramInt = ((Integer)this.hpc.get(hoX)).intValue();
          String str = (String)this.hpc.get(hoW);
          l2 = ((Long)this.hpc.get(hoZ)).longValue();
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(new f(l1, paramMap, (List)localObject, paramInt, l2, str), 0);
          paramInt = ((List)localObject).size();
          if ((paramInt > 0) && (paramInt <= 10)) {
            paramInt = 13;
          }
          for (;;)
          {
            com.tencent.mm.plugin.report.service.g.ork.a(407L, paramInt, 1L, false);
            this.gty.ckg();
            GMTrace.o(5581846872064L, 41588);
            return true;
            if ((paramInt > 10) && (paramInt <= 20)) {
              paramInt = 14;
            } else if ((paramInt > 20) && (paramInt <= 50)) {
              paramInt = 15;
            } else {
              paramInt = 16;
            }
          }
          this.gty.bU(Boolean.valueOf(false));
        }
        catch (Exception paramMap)
        {
          w.e("MicroMsg.LaunchAALogic", "launchAAByMoney, specific user error: %", new Object[] { paramMap.getMessage() });
          this.gty.bU(Boolean.valueOf(false));
          this.hpb = false;
          GMTrace.o(5581846872064L, 41588);
          return false;
        }
      }
      this.hpb = false;
      GMTrace.o(5581846872064L, 41588);
      return false;
    }
    GMTrace.o(5581846872064L, 41588);
    return false;
  }
  
  public final boolean p(Map<String, Object> paramMap)
  {
    GMTrace.i(5581981089792L, 41589);
    this.gty = com.tencent.mm.vending.g.g.ckh();
    w.i("MicroMsg.LaunchAALogic", "launchAAByPerson");
    if (this.hpb)
    {
      w.e("MicroMsg.LaunchAALogic", "launchAA, isLaunching!!! ignore it");
      this.gty.bU(Boolean.valueOf(false));
      GMTrace.o(5581981089792L, 41589);
      return false;
    }
    if ((paramMap == null) || (paramMap.size() == 0))
    {
      this.gty.bU(Boolean.valueOf(false));
      GMTrace.o(5581981089792L, 41589);
      return false;
    }
    this.hpb = true;
    this.hpc = paramMap;
    this.mode = a.hnY;
    if (this.mode != a.hnY)
    {
      this.gty.bU(Boolean.valueOf(false));
      GMTrace.o(5581981089792L, 41589);
      return false;
    }
    if ((this.hpc.containsKey(hoS)) && (this.hpc.containsKey(hoT)) && (this.hpc.containsKey(hoY)) && (this.hpc.containsKey(hoX)) && (this.hpc.containsKey(hoW)) && (this.hpc.containsKey(hoZ))) {
      try
      {
        paramMap = (String)this.hpc.get(hoS);
        long l1 = ((Long)this.hpc.get(hoT)).longValue();
        List localList = (List)this.hpc.get(hoY);
        int i = ((Integer)this.hpc.get(hoX)).intValue();
        String str = (String)this.hpc.get(hoW);
        long l2 = ((Long)this.hpc.get(hoZ)).longValue();
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.plugin.aa.a.a.g(paramMap, l1, localList, i, str, l2), 0);
        i = localList.size();
        if ((i > 0) && (i <= 10)) {
          i = 17;
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(407L, i, 1L, false);
          this.gty.ckg();
          GMTrace.o(5581981089792L, 41589);
          return true;
          if ((i > 10) && (i <= 20)) {
            i = 18;
          } else if ((i > 20) && (i <= 50)) {
            i = 19;
          } else {
            i = 20;
          }
        }
        this.gty.bU(Boolean.valueOf(false));
      }
      catch (Exception paramMap)
      {
        w.e("MicroMsg.LaunchAALogic", "launchAAByPerson error: %s", new Object[] { paramMap.getMessage() });
      }
    }
    this.hpb = false;
    GMTrace.o(5581981089792L, 41589);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */