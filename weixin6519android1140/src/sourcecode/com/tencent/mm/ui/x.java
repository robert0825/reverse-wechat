package com.tencent.mm.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.az.p;
import com.tencent.mm.bc.i;
import com.tencent.mm.bc.l;
import com.tencent.mm.g.a.ii;
import com.tencent.mm.g.a.rn;
import com.tencent.mm.k.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.b.d;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.p.c;
import com.tencent.mm.pluginsdk.p.d;
import com.tencent.mm.pluginsdk.p.i;
import com.tencent.mm.pluginsdk.p.k;
import com.tencent.mm.pluginsdk.p.z;
import com.tencent.mm.s.a.a;
import com.tencent.mm.s.b;
import com.tencent.mm.s.b.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;

public final class x
  implements m.b
{
  MMFragmentActivity vFP;
  com.tencent.mm.sdk.b.c vHE;
  LauncherUI.c vNf;
  public c vNg;
  public boolean vNh;
  public Runnable vNi;
  a.a vNj;
  m.b vNk;
  com.tencent.mm.sdk.b.c vNl;
  
  public x()
  {
    GMTrace.i(19040261111808L, 141861);
    this.vNi = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19037845192704L, 141843);
        if (!h.xw().wL())
        {
          w.e("MicroMsg.LauncherUI.MainTabUnreadMgr", "Account not Ready!!!");
          GMTrace.o(19037845192704L, 141843);
          return;
        }
        if (x.this.vNg == null)
        {
          w.w("MicroMsg.LauncherUI.MainTabUnreadMgr", "set tag job, but tab view is null");
          GMTrace.o(19037845192704L, 141843);
          return;
        }
        int i;
        if (!at.AU())
        {
          w.w("MicroMsg.UnreadCountHelper", "getFindTabUnreadCount, but mmcore not ready");
          i = 0;
          x.this.vNg.kR(false);
          x.this.vNg.AO(i);
          if ((i <= 0) && (com.tencent.mm.bh.a.bIM()) && (l.MM().ME() > 0)) {
            x.this.vNg.kR(true);
          }
          if ((i <= 0) && ((q.zP() & 0x8000) == 0))
          {
            at.AR();
            if (com.tencent.mm.platformtools.t.c((Boolean)com.tencent.mm.y.c.xh().get(68384, null)))
            {
              at.AR();
              if (!com.tencent.mm.platformtools.t.nm((String)com.tencent.mm.y.c.xh().get(68377, null)))
              {
                x.this.vNg.kR(true);
                GMTrace.o(19037845192704L, 141843);
              }
            }
          }
        }
        else
        {
          if ((q.zI() & 0x8000) != 0) {
            break label935;
          }
        }
        label766:
        label914:
        label925:
        label935:
        for (int j = com.tencent.mm.y.k.zB() + 0;; j = 0)
        {
          if (((q.zP() & 0x200) == 0) && (!com.tencent.mm.bh.a.bIM())) {}
          for (i = l.MM().ME() + 0;; i = 0)
          {
            int k = i;
            Object localObject;
            if ((q.zP() & 0x100) == 0)
            {
              localObject = l.MN();
              k = i;
              if (localObject != null) {
                k = i + ((com.tencent.mm.bc.k)localObject).ME();
              }
              k += com.tencent.mm.pluginsdk.p.a.bIQ().bfd();
            }
            j += k;
            i = j;
            if ((q.zP() & 0x8000) == 0)
            {
              i = j;
              if (n.poQ != null) {
                i = j + n.poQ.ME();
              }
            }
            break;
            boolean bool;
            if (i <= 0)
            {
              localObject = g.ut().getValue("JDEntranceConfigName");
              String str1 = g.ut().getValue("JDEntranceConfigIconUrl");
              String str2 = g.ut().getValue("JDEntranceConfigJumpUrl");
              w.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "jd tryshow configName " + (String)localObject + " iconUrl " + str1 + " jumpUrl " + str2);
              if ((!com.tencent.mm.platformtools.t.nm((String)localObject)) && (!com.tencent.mm.platformtools.t.nm(str1)) && (!com.tencent.mm.platformtools.t.nm(str2)))
              {
                localObject = p.z.tmj;
                if (localObject != null)
                {
                  bool = ((p.k)localObject).brt();
                  w.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "jdshowFriend " + bool);
                  if (bool)
                  {
                    localObject = ((p.k)localObject).brB();
                    if ((((p.d)localObject).aCe()) && (!((p.d)localObject).brk()))
                    {
                      x.this.vNg.kR(true);
                      GMTrace.o(19037845192704L, 141843);
                      return;
                    }
                    w.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "jd time is not start or jd time isExpire");
                  }
                }
              }
            }
            at.AR();
            if (((Boolean)com.tencent.mm.y.c.xh().get(589825, Boolean.valueOf(false))).booleanValue()) {
              x.this.vNg.kR(true);
            }
            if (g.ut().getInt("WCOEntranceSwitch", 0) > 0)
            {
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsi, Boolean.valueOf(true));
              if ((!x.this.vNg.bWb()) && (i <= 0))
              {
                at.AR();
                if (((Integer)com.tencent.mm.y.c.xh().get(w.a.vsj, Integer.valueOf(0))).intValue() >= g.ut().getInt("WCOEntranceRedDot", 0))
                {
                  at.AR();
                  if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsl, Boolean.valueOf(false))).booleanValue() != true) {}
                }
                else
                {
                  x.this.vNg.kR(true);
                }
              }
              if ((i <= 0) && (((Boolean)h.xy().xh().get(w.a.vuM, Boolean.valueOf(false))).booleanValue())) {
                x.this.vNg.kR(true);
              }
              localObject = p.KH();
              if ((!((p)localObject).valid()) || (((p)localObject).gSg.gSi != 1)) {
                break label914;
              }
              i = 1;
              if (i != 0) {
                x.this.vNg.kR(true);
              }
              at.AR();
              if ((com.tencent.mm.y.c.xh().getInt(40, 0) & 0x20000) != 0) {
                break label925;
              }
            }
            for (i = 1;; i = 0)
            {
              if (bg.getInt(g.ut().getValue("VoiceprintEntry"), 0) == 1) {
                at.AR();
              }
              for (bool = ((Boolean)com.tencent.mm.y.c.xh().get(w.a.vqx, Boolean.valueOf(true))).booleanValue();; bool = false)
              {
                if ((bool) && (i != 0))
                {
                  w.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "show voiceprint dot");
                  x.this.vNg.kS(true);
                }
                x.this.vNh = false;
                GMTrace.o(19037845192704L, 141843);
                return;
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vsi, Boolean.valueOf(false));
                break;
                i = 0;
                break label766;
              }
            }
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(19037979410432L, 141844);
        String str = super.toString() + "|setTagRunnable";
        GMTrace.o(19037979410432L, 141844);
        return str;
      }
    };
    this.vHE = new com.tencent.mm.sdk.b.c() {};
    this.vNj = new a.a()
    {
      public final void a(w.a paramAnonymousa)
      {
        GMTrace.i(19037442539520L, 141840);
        GMTrace.o(19037442539520L, 141840);
      }
      
      public final void eJ(int paramAnonymousInt)
      {
        GMTrace.i(19037174104064L, 141838);
        if ((paramAnonymousInt == 262145) || (paramAnonymousInt == 262156) || (paramAnonymousInt == 262152) || (paramAnonymousInt == 266260) || (paramAnonymousInt == 266267)) {
          x.this.bXZ();
        }
        if ((paramAnonymousInt == 262147) || (paramAnonymousInt == 262149)) {
          x.this.bXZ();
        }
        GMTrace.o(19037174104064L, 141838);
      }
      
      public final void eK(int paramAnonymousInt)
      {
        GMTrace.i(19037308321792L, 141839);
        if (paramAnonymousInt == 266241) {
          x.this.bXZ();
        }
        if (paramAnonymousInt == 266244)
        {
          com.tencent.mm.s.c.vK().aF(262147, 266241);
          com.tencent.mm.s.c.vK().aF(262149, 266241);
          x.this.bXZ();
        }
        GMTrace.o(19037308321792L, 141839);
      }
    };
    this.vNk = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(19032342265856L, 141802);
        int i = com.tencent.mm.platformtools.t.aG(paramAnonymousObject);
        w.d("MicroMsg.LauncherUI.MainTabUnreadMgr", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(i), paramAnonymousm });
        at.AR();
        if ((paramAnonymousm != com.tencent.mm.y.c.xh()) || (i <= 0))
        {
          w.e("MicroMsg.LauncherUI.MainTabUnreadMgr", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramAnonymousm });
          GMTrace.o(19032342265856L, 141802);
          return;
        }
        x.this.bXW();
        if (i == 143618)
        {
          x.this.bYa();
          GMTrace.o(19032342265856L, 141802);
          return;
        }
        if ((i == 204817) || (i == 204820)) {
          x.this.bXZ();
        }
        GMTrace.o(19032342265856L, 141802);
      }
    };
    this.vNl = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(19040261111808L, 141861);
  }
  
  public final void Bl(int paramInt)
  {
    GMTrace.i(19040932200448L, 141866);
    if (this.vNg != null)
    {
      this.vNg.AM(paramInt);
      this.vNf.bXb();
    }
    GMTrace.o(19040932200448L, 141866);
  }
  
  public final void Bm(int paramInt)
  {
    GMTrace.i(19041334853632L, 141869);
    if (this.vNg != null) {
      this.vNg.mR(paramInt);
    }
    GMTrace.o(19041334853632L, 141869);
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(19041200635904L, 141868);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.d("MicroMsg.LauncherUI.MainTabUnreadMgr", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(19041200635904L, 141868);
      return;
    }
    at.AR();
    if (paramm == com.tencent.mm.y.c.yP())
    {
      w.d("MicroMsg.LauncherUI.MainTabUnreadMgr", "Launcherui onNotifyChange event type %d, username %s", new Object[] { Integer.valueOf(paramInt), paramObject });
      if (com.tencent.mm.storage.x.fw((String)paramObject)) {
        bXW();
      }
      GMTrace.o(19041200635904L, 141868);
      return;
    }
    GMTrace.o(19041200635904L, 141868);
  }
  
  protected final void bXU()
  {
    GMTrace.i(19040663764992L, 141864);
    if (this.vNh)
    {
      w.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "remove setTagRunnable");
      af.F(this.vNi);
    }
    GMTrace.o(19040663764992L, 141864);
  }
  
  protected final void bXW()
  {
    GMTrace.i(19040529547264L, 141863);
    this.vNh = true;
    af.F(this.vNi);
    af.i(this.vNi, 300L);
    GMTrace.o(19040529547264L, 141863);
  }
  
  void bXY()
  {
    GMTrace.i(19040395329536L, 141862);
    this.vNh = true;
    af.F(this.vNi);
    af.t(this.vNi);
    GMTrace.o(19040395329536L, 141862);
  }
  
  public final void bXZ()
  {
    GMTrace.i(19040797982720L, 141865);
    if (!at.AU())
    {
      w.w("MicroMsg.LauncherUI.MainTabUnreadMgr", "want update more menu new tips, but mmcore not ready");
      GMTrace.o(19040797982720L, 141865);
      return;
    }
    boolean bool3 = com.tencent.mm.s.c.vK().aD(262156, 266241);
    boolean bool4 = com.tencent.mm.s.c.vK().aE(262156, 266241);
    w.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "hasMallNew: %s, hasMallDot: %s", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
    boolean bool2;
    boolean bool1;
    if (!bool3)
    {
      bool2 = bool4;
      bool1 = bool3;
      if (!bool4) {}
    }
    else
    {
      at.AR();
      long l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vyy, Long.valueOf(-1L))).longValue();
      long l2 = com.tencent.mm.platformtools.t.nn(g.ut().getValue("PayWalletRedDotExpire"));
      long l3 = System.currentTimeMillis();
      double d = (l3 - l1) / 8.64E7D;
      w.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "pushTick: %s, expireTime: %s, expireTick: %s, currentTick: %s, passDay: %s", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(86400000L * l2), Long.valueOf(l3), Double.valueOf(d) });
      bool2 = bool4;
      bool1 = bool3;
      if (l1 > 0L)
      {
        bool2 = bool4;
        bool1 = bool3;
        if (l2 > 0L)
        {
          bool2 = bool4;
          bool1 = bool3;
          if (d >= l2)
          {
            com.tencent.mm.s.c.vK().k(262156, false);
            bool1 = false;
            bool2 = false;
          }
        }
      }
    }
    w.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "after check, hasMallNew: %s, hasMallDot: %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
    bool3 = com.tencent.mm.s.c.vK().aD(262145, 266241);
    bool4 = com.tencent.mm.s.c.vK().aE(266260, 266241);
    boolean bool5 = com.tencent.mm.s.c.vK().aD(262147, 266241);
    boolean bool6 = com.tencent.mm.s.c.vK().aD(262149, 266241);
    boolean bool7 = com.tencent.mm.s.c.vK().aE(262152, 266256);
    boolean bool8 = com.tencent.mm.s.c.vK().aD(262152, 266256);
    Object localObject = (com.tencent.mm.plugin.welab.a.a.c)h.h(com.tencent.mm.plugin.welab.a.a.c.class);
    int i;
    if (localObject != null) {
      if ((((com.tencent.mm.plugin.welab.a.a.c)localObject).bGy()) || (((com.tencent.mm.plugin.welab.a.a.c)localObject).bGz())) {
        i = 1;
      }
    }
    for (;;)
    {
      localObject = com.tencent.mm.s.c.vK();
      label443:
      int k;
      if (!((com.tencent.mm.s.a)localObject).fUo)
      {
        w.w("MicroMsg.NewBadge", "hasUnreadNum NewBadge has not initialized");
        j = 0;
        localObject = com.tencent.mm.pluginsdk.p.a.tlZ;
        if ((localObject == null) || ((!((p.c)localObject).ajW()) && (!((p.c)localObject).ajX()))) {
          break label603;
        }
        k = 1;
        label476:
        if ((k == 0) || ((!bool7) && (!bool8) && (j <= 0))) {
          break label609;
        }
      }
      label603:
      label609:
      for (int j = 1;; j = 0)
      {
        if ((!bool2) && (!bool1) && (!bool3) && (j == 0) && (!bool5) && (!bool6) && (!bool4) && (i == 0)) {
          break label615;
        }
        this.vNg.kS(true);
        GMTrace.o(19040797982720L, 141865);
        return;
        i = 0;
        break;
        localObject = ((com.tencent.mm.s.a)localObject).fUm.p(262152, 266256, 4);
        if (localObject == null)
        {
          j = 0;
          break label443;
        }
        j = com.tencent.mm.s.a.parseInt(((b.a)localObject).value);
        break label443;
        k = 0;
        break label476;
      }
      label615:
      this.vNg.kS(false);
      GMTrace.o(19040797982720L, 141865);
      return;
      i = 0;
    }
  }
  
  public final void bYa()
  {
    GMTrace.i(19041066418176L, 141867);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19035966144512L, 141829);
        if (!at.AU()) {
          w.w("MicroMsg.UnreadCountHelper", "getAddrTabUnreadCount, but mmcore not ready");
        }
        for (int i = 0;; i = com.tencent.mm.platformtools.t.e((Integer)com.tencent.mm.y.c.xh().get(143618, null)))
        {
          if (x.this.vNg != null) {
            x.this.vNg.AN(i);
          }
          GMTrace.o(19035966144512L, 141829);
          return;
          at.AR();
        }
      }
      
      public final String toString()
      {
        GMTrace.i(19036100362240L, 141830);
        String str = super.toString() + "|setAddressTagUnread";
        GMTrace.o(19036100362240L, 141830);
        return str;
      }
    });
    GMTrace.o(19041066418176L, 141867);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */