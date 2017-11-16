package com.tencent.mm.y.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class b
{
  private boolean gpP;
  public ArrayList<a> mListeners;
  
  public b()
  {
    GMTrace.i(16261014618112L, 121154);
    this.mListeners = new ArrayList();
    this.gpP = false;
    GMTrace.o(16261014618112L, 121154);
  }
  
  public static String Cb()
  {
    GMTrace.i(16261148835840L, 121155);
    at.AR();
    String str = (String)c.xh().get(w.a.vyp, "");
    GMTrace.o(16261148835840L, 121155);
    return str;
  }
  
  public static String Cc()
  {
    GMTrace.i(16261283053568L, 121156);
    at.AR();
    String str = (String)c.xh().get(w.a.vyq, "");
    GMTrace.o(16261283053568L, 121156);
    return str;
  }
  
  public static boolean Cd()
  {
    GMTrace.i(16261417271296L, 121157);
    at.AR();
    boolean bool = ((Boolean)c.xh().get(w.a.vys, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(16261417271296L, 121157);
    return bool;
  }
  
  public static String Ce()
  {
    GMTrace.i(16261551489024L, 121158);
    at.AR();
    String str = (String)c.xh().get(w.a.vyj, "");
    GMTrace.o(16261551489024L, 121158);
    return str;
  }
  
  public static String Cf()
  {
    GMTrace.i(16261685706752L, 121159);
    at.AR();
    String str = (String)c.xh().get(w.a.vyk, "");
    GMTrace.o(16261685706752L, 121159);
    return str;
  }
  
  public static boolean Cg()
  {
    GMTrace.i(16261819924480L, 121160);
    at.AR();
    boolean bool = ((Boolean)c.xh().get(w.a.vym, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(16261819924480L, 121160);
    return bool;
  }
  
  private static boolean Ch()
  {
    GMTrace.i(17812974206976L, 132717);
    at.AR();
    boolean bool = ((Boolean)c.xh().get(w.a.vyn, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(17812974206976L, 132717);
    return bool;
  }
  
  private static boolean Ci()
  {
    GMTrace.i(16261954142208L, 121161);
    at.AR();
    boolean bool = ((Boolean)c.xh().get(w.a.vyw, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(16261954142208L, 121161);
    return bool;
  }
  
  private void Cj()
  {
    GMTrace.i(16262356795392L, 121164);
    try
    {
      Iterator localIterator = this.mListeners.iterator();
      while (localIterator.hasNext()) {
        ((a)localIterator.next()).Cl();
      }
    }
    finally {}
    GMTrace.o(16262356795392L, 121164);
  }
  
  public static boolean a(b paramb)
  {
    GMTrace.i(16262222577664L, 121163);
    w.d("MicroMsg.ChattingMonitoredBannerStorage", "hy: is checking monitor banner scene: %s", new Object[] { paramb });
    long l2 = bg.Pu();
    at.AR();
    long l3 = ((Long)c.xh().get(w.a.vyv, Long.valueOf(-1L))).longValue();
    long l1;
    boolean bool2;
    boolean bool1;
    if (paramb == b.gpR)
    {
      at.AR();
      l1 = ((Long)c.xh().get(w.a.vyl, Long.valueOf(0L))).longValue();
      at.AR();
      bool2 = ((Boolean)c.xh().get(w.a.vyo, Boolean.valueOf(false))).booleanValue();
      bool1 = Ch();
    }
    for (paramb = Ce(); bg.nm(paramb); paramb = Cb())
    {
      w.d("MicroMsg.ChattingMonitoredBannerStorage", "hy: not get wording");
      GMTrace.o(16262222577664L, 121163);
      return false;
      at.AR();
      l1 = ((Long)c.xh().get(w.a.vyr, Long.valueOf(0L))).longValue();
      at.AR();
      bool2 = ((Boolean)c.xh().get(w.a.vyu, Boolean.valueOf(false))).booleanValue();
      at.AR();
      bool1 = ((Boolean)c.xh().get(w.a.vyt, Boolean.valueOf(false))).booleanValue();
    }
    if (bool2)
    {
      w.d("MicroMsg.ChattingMonitoredBannerStorage", "hy: not check trigger and already closed");
      GMTrace.o(16262222577664L, 121163);
      return false;
    }
    if (l3 < 0L)
    {
      w.d("MicroMsg.ChattingMonitoredBannerStorage", "hy: no msg occurs");
      GMTrace.o(16262222577664L, 121163);
      return false;
    }
    if ((bool1) && (!Ci()))
    {
      w.d("MicroMsg.ChattingMonitoredBannerStorage", "hy: should check triggered but not triggered");
      GMTrace.o(16262222577664L, 121163);
      return false;
    }
    if (l1 == -1L)
    {
      w.i("MicroMsg.ChattingMonitoredBannerStorage", "hy: should always show");
      GMTrace.o(16262222577664L, 121163);
      return true;
    }
    if (l3 + l1 > l2)
    {
      w.i("MicroMsg.ChattingMonitoredBannerStorage", "hy: still in show time. show banner");
      GMTrace.o(16262222577664L, 121163);
      return true;
    }
    w.i("MicroMsg.ChattingMonitoredBannerStorage", "hy: expired.");
    GMTrace.o(16262222577664L, 121163);
    return false;
  }
  
  public final void Ck()
  {
    GMTrace.i(16262491013120L, 121165);
    if (Ci() != true)
    {
      w.d("MicroMsg.ChattingMonitoredBannerStorage", "hy: monitored illegal set text. mark now as the start time ");
      at.AR();
      c.xh().a(w.a.vyv, Long.valueOf(bg.Pu()));
      at.AR();
      c.xh().a(w.a.vyw, Boolean.valueOf(true));
      Cj();
    }
    GMTrace.o(16262491013120L, 121165);
  }
  
  public final void b(b paramb)
  {
    GMTrace.i(17813108424704L, 132718);
    if (paramb == b.gpQ)
    {
      at.AR();
      c.xh().a(w.a.vyu, Boolean.valueOf(false));
    }
    for (;;)
    {
      Cj();
      GMTrace.o(17813108424704L, 132718);
      return;
      at.AR();
      c.xh().a(w.a.vyo, Boolean.valueOf(false));
    }
  }
  
  public final void c(b paramb)
  {
    GMTrace.i(19254606823424L, 143458);
    if (paramb == b.gpQ)
    {
      at.AR();
      c.xh().a(w.a.vyr, Long.valueOf(0L));
    }
    for (;;)
    {
      Cj();
      do
      {
        GMTrace.o(19254606823424L, 143458);
        return;
      } while (paramb != b.gpR);
      if (!Ch())
      {
        at.AR();
        c.xh().a(w.a.vyl, Long.valueOf(0L));
      }
      else
      {
        at.AR();
        c.xh().a(w.a.vyo, Boolean.valueOf(true));
      }
    }
  }
  
  public final void l(Map<String, String> paramMap)
  {
    GMTrace.i(16262088359936L, 121162);
    if (paramMap == null)
    {
      GMTrace.o(16262088359936L, 121162);
      return;
    }
    g.ork.a(633L, 3L, 1L, false);
    String str1 = bg.nl((String)paramMap.get(".sysmsg.banner.monitorbanner_n.mainframe.url"));
    String str2 = bg.nl((String)paramMap.get(".sysmsg.banner.monitorbanner_n.mainframe.wording"));
    long l1 = bg.getLong((String)paramMap.get(".sysmsg.banner.monitorbanner_n.mainframe.duration"), 0L);
    boolean bool1;
    boolean bool2;
    label134:
    String str3;
    String str4;
    long l2;
    boolean bool3;
    if (bg.getInt((String)paramMap.get(".sysmsg.banner.monitorbanner_n.mainframe.autotrigger"), 0) == 1)
    {
      bool1 = true;
      if (bg.getInt((String)paramMap.get(".sysmsg.banner.monitorbanner_n.mainframe.closable"), 0) != 1) {
        break label516;
      }
      bool2 = true;
      str3 = bg.nl((String)paramMap.get(".sysmsg.banner.monitorbanner_n.chatting.url"));
      str4 = bg.nl((String)paramMap.get(".sysmsg.banner.monitorbanner_n.chatting.wording"));
      l2 = bg.getLong((String)paramMap.get(".sysmsg.banner.monitorbanner_n.chatting.duration"), 0L);
      if (bg.getInt((String)paramMap.get(".sysmsg.banner.monitorbanner_n.chatting.autotrigger"), 0) != 1) {
        break label522;
      }
      bool3 = true;
      label209:
      if (bg.getInt((String)paramMap.get(".sysmsg.banner.monitorbanner_n.chatting.closable"), 0) != 1) {
        break label528;
      }
    }
    label516:
    label522:
    label528:
    for (boolean bool4 = true;; bool4 = false)
    {
      if ((!bg.nm(str2)) || (!bg.nm(str4)))
      {
        at.AR();
        c.xh().a(w.a.vyj, str4);
        at.AR();
        c.xh().a(w.a.vyk, str3);
        at.AR();
        c.xh().a(w.a.vyl, Long.valueOf(l2));
        at.AR();
        c.xh().a(w.a.vym, Boolean.valueOf(bool4));
        at.AR();
        c.xh().a(w.a.vyn, Boolean.valueOf(bool3));
        at.AR();
        c.xh().a(w.a.vyp, str2);
        at.AR();
        c.xh().a(w.a.vyq, str1);
        at.AR();
        c.xh().a(w.a.vyr, Long.valueOf(l1));
        at.AR();
        c.xh().a(w.a.vys, Boolean.valueOf(bool2));
        at.AR();
        c.xh().a(w.a.vyt, Boolean.valueOf(bool1));
        at.AR();
        c.xh().a(w.a.vyv, Long.valueOf(bg.Pu()));
        at.AR();
        c.xh().a(w.a.vyo, Boolean.valueOf(false));
        at.AR();
        c.xh().a(w.a.vyu, Boolean.valueOf(false));
        at.AR();
        c.xh().a(w.a.vyw, Boolean.valueOf(false));
        at.AR();
        c.xh().kL(true);
        Cj();
      }
      GMTrace.o(16262088359936L, 121162);
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label134;
      bool3 = false;
      break label209;
    }
  }
  
  public static abstract interface a
  {
    public abstract void Cl();
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(16260746182656L, 121152);
      gpQ = new b("Main", 0);
      gpR = new b("Chatting", 1);
      gpS = new b[] { gpQ, gpR };
      GMTrace.o(16260746182656L, 121152);
    }
    
    private b()
    {
      GMTrace.i(16260611964928L, 121151);
      GMTrace.o(16260611964928L, 121151);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */