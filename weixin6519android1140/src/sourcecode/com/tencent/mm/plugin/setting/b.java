package com.tencent.mm.plugin.setting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.protocal.c.atw;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.e.f;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.q;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class b
  implements aq
{
  private m.b oFP;
  private bt.a oFQ;
  private com.tencent.mm.plugin.messenger.foundation.a.m oFR;
  private bt.a oFS;
  
  public b()
  {
    GMTrace.i(4735872532480L, 35285);
    this.oFP = new m.b()
    {
      public final void a(int paramAnonymousInt, final com.tencent.mm.sdk.e.m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(19532705955840L, 145530);
        if (paramAnonymousInt == 2)
        {
          paramAnonymousm = (String)paramAnonymousObject;
          at.AR();
          paramAnonymousObject = com.tencent.mm.y.c.yK().Tz(paramAnonymousm);
          if ((paramAnonymousObject != null) && (!com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)paramAnonymousObject).field_type)) && (((x)paramAnonymousObject).uX()) && (!((x)paramAnonymousObject).uY())) {
            at.xB().h(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19534719221760L, 145545);
                at.AR();
                Object localObject = com.tencent.mm.y.c.yK().TE(paramAnonymousm);
                if ((localObject != null) && (!com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject).field_type)) && (((x)localObject).uX()) && (!((x)localObject).uY()))
                {
                  localObject = new au();
                  ((au)localObject).dC(0);
                  ((au)localObject).db(paramAnonymousm);
                  ((au)localObject).dB(6);
                  ((au)localObject).setContent(ab.getContext().getString(R.l.dZa));
                  ((au)localObject).E(bc.k(paramAnonymousm, System.currentTimeMillis() / 1000L));
                  ((au)localObject).setType(10000);
                  at.AR();
                  com.tencent.mm.y.c.yM().P((au)localObject);
                  w.i("MicroMsg.SubCoreSetting", "insert chatcontact verify sysmsg. %s", new Object[] { paramAnonymousm });
                }
                GMTrace.o(19534719221760L, 145545);
              }
            }, 5000L);
          }
        }
        GMTrace.o(19532705955840L, 145530);
      }
    };
    this.oFQ = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(19532571738112L, 145529);
        paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        if ((paramAnonymousa == null) || (paramAnonymousa.length() == 0))
        {
          w.e("MicroMsg.SubCoreSetting", "onReceiveMsg, ShakeCardRedDotMsg msgContent is null");
          GMTrace.o(19532571738112L, 145529);
          return;
        }
        paramAnonymousa = bh.q(paramAnonymousa, "sysmsg");
        if (paramAnonymousa == null)
        {
          GMTrace.o(19532571738112L, 145529);
          return;
        }
        String str = bg.aq((String)paramAnonymousa.get(".sysmsg.RedPoints.redPoint.path"), "");
        int i = bg.Sy(bg.aq((String)paramAnonymousa.get(".sysmsg.RedPoints.redPoint.redPointId"), ""));
        bg.Sy(bg.aq((String)paramAnonymousa.get(".sysmsg.RedPoints.redPoint.mustClearInSameTime"), ""));
        if (bg.nm(str))
        {
          GMTrace.o(19532571738112L, 145529);
          return;
        }
        if (str.equals("my_setting_privaty_recentOption"))
        {
          at.AR();
          if (((Integer)com.tencent.mm.y.c.xh().get(w.a.vwT, Integer.valueOf(0))).intValue() >= i)
          {
            GMTrace.o(19532571738112L, 145529);
            return;
          }
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vwT, Integer.valueOf(i));
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vwU, Integer.valueOf(i));
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vwW, Integer.valueOf(i));
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vwY, Integer.valueOf(i));
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vxa, Integer.valueOf(i));
          com.tencent.mm.s.c.vK().l(266260, true);
          GMTrace.o(19532571738112L, 145529);
          return;
        }
        if (str.equals("my_setting_plugin_switch"))
        {
          paramAnonymousa = bg.aq((String)paramAnonymousa.get(".sysmsg.RedPoints.redPoint.ext"), "");
          if (bg.nm(paramAnonymousa))
          {
            GMTrace.o(19532571738112L, 145529);
            return;
          }
          at.AR();
          if (((Integer)com.tencent.mm.y.c.xh().get(w.a.vxR, Integer.valueOf(0))).intValue() >= i)
          {
            GMTrace.o(19532571738112L, 145529);
            return;
          }
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vxR, Integer.valueOf(i));
          at.AR();
          str = (String)com.tencent.mm.y.c.xh().get(w.a.vxS, "");
          if (bg.nm(str)) {
            break label451;
          }
          paramAnonymousa = paramAnonymousa.concat(",").concat(str);
        }
        label451:
        for (;;)
        {
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vxS, paramAnonymousa);
          com.tencent.mm.s.c.vK().l(262158, true);
          GMTrace.o(19532571738112L, 145529);
          return;
        }
      }
    };
    this.oFR = new com.tencent.mm.plugin.messenger.foundation.a.m()
    {
      public final void b(String paramAnonymousString, Map<String, String> paramAnonymousMap)
      {
        GMTrace.i(19534450786304L, 145543);
        if (paramAnonymousMap != null)
        {
          paramAnonymousString = (String)paramAnonymousMap.get(".sysmsg.showtrustedfriends.wording");
          if (!bg.nm(paramAnonymousString))
          {
            paramAnonymousMap = new Intent();
            paramAnonymousMap.putExtra(e.f.vGJ, paramAnonymousString);
            com.tencent.mm.bj.d.b(ab.getContext(), "setting", ".ui.setting.SettingsTrustFriendUI", paramAnonymousMap);
          }
        }
        GMTrace.o(19534450786304L, 145543);
      }
    };
    this.oFS = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(19534316568576L, 145542);
        paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        if ((paramAnonymousa == null) || (paramAnonymousa.length() == 0))
        {
          w.e("MicroMsg.SubCoreSetting", "onReceiveMsg, crowdtest msgContent is null");
          GMTrace.o(19534316568576L, 145542);
          return;
        }
        paramAnonymousa = bh.q(paramAnonymousa, "sysmsg");
        if (paramAnonymousa == null)
        {
          GMTrace.o(19534316568576L, 145542);
          return;
        }
        int i = bg.getInt((String)paramAnonymousa.get(".sysmsg.crowdtest.$clientversion"), 0);
        if (i <= com.tencent.mm.protocal.d.tJC)
        {
          GMTrace.o(19534316568576L, 145542);
          return;
        }
        long l1 = 0L;
        try
        {
          str1 = (String)paramAnonymousa.get(".sysmsg.crowdtest.apply.$expire");
          long l2 = new SimpleDateFormat("yyyy-MM-dd").parse(str1).getTime();
          l1 = l2;
        }
        catch (Exception localException)
        {
          String str1;
          String str2;
          boolean bool;
          for (;;) {}
        }
        if (l1 < System.currentTimeMillis())
        {
          b.bee();
          GMTrace.o(19534316568576L, 145542);
          return;
        }
        str1 = (String)paramAnonymousa.get(".sysmsg.crowdtest.apply.link");
        str2 = (String)paramAnonymousa.get(".sysmsg.crowdtest.feedback.link");
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vxN, Integer.valueOf(i));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vxO, Long.valueOf(l1));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vxP, str1);
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vxQ, str2);
        i = bg.getInt((String)paramAnonymousa.get(".sysmsg.crowdtest.apply.reddotlevel"), 0);
        paramAnonymousa = com.tencent.mm.s.c.vK();
        if (i > 0) {}
        for (bool = true;; bool = false)
        {
          paramAnonymousa.l(262157, bool);
          if (i < 3) {
            com.tencent.mm.s.c.vK().aF(262157, 266261);
          }
          if (i < 2) {
            com.tencent.mm.s.c.vK().aF(262157, 266262);
          }
          GMTrace.o(19534316568576L, 145542);
          return;
        }
      }
    };
    w.i("MicroMsg.SubCoreSetting", "SubCoreSetting constructor: " + System.currentTimeMillis());
    GMTrace.o(4735872532480L, 35285);
  }
  
  public static void bee()
  {
    GMTrace.i(16136863219712L, 120229);
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vxO, Long.valueOf(0L));
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vxP, "");
    com.tencent.mm.s.c.vK().l(262157, false);
    GMTrace.o(16136863219712L, 120229);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(4736275185664L, 35288);
    w.i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountPostReset: " + System.currentTimeMillis());
    at.getSysCmdMsgExtension().a("redpointinfo", this.oFQ, true);
    at.getSysCmdMsgExtension().a("crowdtest", this.oFS, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("showtrustedfriends", this.oFR);
    at.AR();
    int i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vxN, Integer.valueOf(com.tencent.mm.protocal.d.tJC))).intValue();
    at.AR();
    long l = ((Long)com.tencent.mm.y.c.xh().get(w.a.vxO, Long.valueOf(0L))).longValue();
    if ((i <= com.tencent.mm.protocal.d.tJC) || (l < System.currentTimeMillis())) {
      bee();
    }
    if (paramBoolean)
    {
      i = q.zP();
      at.AR();
      com.tencent.mm.y.c.xh().set(34, Integer.valueOf(i & 0xFFEFFFFF & 0xFFBFFFFF));
      atw localatw = new atw();
      localatw.tOv = 1048576;
      localatw.uJr = 0;
      at.AR();
      com.tencent.mm.y.c.yJ().b(new e.a(39, localatw));
      localatw = new atw();
      localatw.tOv = 4194304;
      localatw.uJr = 0;
      at.AR();
      com.tencent.mm.y.c.yJ().b(new e.a(39, localatw));
      w.i("MicroMsg.SubCoreSetting", "set void default open");
    }
    if ((g.ut().getInt("ShowTurnOnFriendVerificationSysmsgSwitch", 0) == 1) && ((q.zI() & 0x20) == 0))
    {
      at.AR();
      com.tencent.mm.y.c.yK().a(this.oFP);
    }
    GMTrace.o(4736275185664L, 35288);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(4736409403392L, 35289);
    w.i("MicroMsg.SubCoreSetting", "SubCoreSetting onSdcardMount: " + System.currentTimeMillis());
    GMTrace.o(4736409403392L, 35289);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(4736140967936L, 35287);
    w.i("MicroMsg.SubCoreSetting", "SubCoreSetting clearPluginData: " + System.currentTimeMillis());
    GMTrace.o(4736140967936L, 35287);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(4736543621120L, 35290);
    w.i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountRelease: " + System.currentTimeMillis());
    at.getSysCmdMsgExtension().b("redpointinfo", this.oFQ, true);
    at.getSysCmdMsgExtension().b("crowdtest", this.oFS, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("showtrustedfriends", this.oFR);
    at.AR();
    com.tencent.mm.y.c.yK().b(this.oFP);
    GMTrace.o(4736543621120L, 35290);
  }
  
  @SuppressLint({"UseSparseArrays"})
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(4736006750208L, 35286);
    GMTrace.o(4736006750208L, 35286);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */