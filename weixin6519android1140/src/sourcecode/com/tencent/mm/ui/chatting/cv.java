package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.bc.i;
import com.tencent.mm.modelstat.b.b;
import com.tencent.mm.modelvideo.s.a;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.pluginsdk.model.app.j.a;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.v;
import com.tencent.mm.x.f.a;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import junit.framework.Assert;

public final class cv
  extends com.tencent.mm.ui.o<com.tencent.mm.storage.au>
  implements com.tencent.mm.ad.e, s.a, j.a
{
  private static Map<String, Integer> wzB;
  private static HashMap<String, com.tencent.mm.pluginsdk.ui.e> wzH;
  protected String eDs;
  private int eLN;
  boolean esP;
  public int gQB;
  protected String gtf;
  protected com.tencent.mm.ao.a.a.c jQF;
  public int jRt;
  protected long juT;
  ae krX;
  private LayoutInflater lVD;
  private short[] mTD;
  protected com.tencent.mm.pluginsdk.ui.e ocR;
  protected View.OnCreateContextMenuListener odu;
  private HashMap<Integer, ah> qgI;
  private boolean tIv;
  private boolean txk;
  com.tencent.mm.pluginsdk.ui.d.e wrr;
  protected En_5b8fbb1e.a wve;
  private short[] wyP;
  public long wyQ;
  private HashSet<Long> wyR;
  protected p wyS;
  private String wyT;
  private final int wyU;
  private final int wyV;
  public cw wyW;
  private cw wyX;
  protected cy wyY;
  private cy wyZ;
  private List<Long> wzA;
  com.tencent.mm.storage.au wzC;
  private boolean wzD;
  private boolean wzE;
  public boolean wzF;
  View.OnClickListener wzG;
  private long wzI;
  protected cz wza;
  private cz wzb;
  protected cx wzc;
  private cx wzd;
  protected com.tencent.mm.pluginsdk.ui.chat.l wze;
  private com.tencent.mm.pluginsdk.ui.chat.l wzf;
  protected a wzg;
  private a wzh;
  protected o wzi;
  private o wzj;
  private View.OnCreateContextMenuListener wzk;
  private long wzl;
  private long wzm;
  private long wzn;
  private int wzo;
  private int wzp;
  boolean wzq;
  boolean wzr;
  private boolean wzs;
  boolean wzt;
  boolean wzu;
  boolean wzv;
  public TreeSet<Long> wzw;
  long wzx;
  public Map<Long, View> wzy;
  public Map<Long, Integer> wzz;
  
  static
  {
    GMTrace.i(2405986992128L, 17926);
    HashMap localHashMap = new HashMap();
    wzB = localHashMap;
    localHashMap.put("T49S", Integer.valueOf(19));
    wzB.put("T49R", Integer.valueOf(18));
    wzB.put("T268435505S", Integer.valueOf(21));
    wzB.put("T268435505R", Integer.valueOf(20));
    wzB.put("T1048625S", Integer.valueOf(30));
    wzB.put("T1048625R", Integer.valueOf(29));
    wzB.put("T369098801S", Integer.valueOf(47));
    wzB.put("T369098801R", Integer.valueOf(46));
    wzB.put("T335544369S", Integer.valueOf(42));
    wzB.put("T335544369R", Integer.valueOf(41));
    wzB.put("T402653233S", Integer.valueOf(45));
    wzB.put("T402653233R", Integer.valueOf(44));
    wzB.put("T16777265S", Integer.valueOf(23));
    wzB.put("T16777265R", Integer.valueOf(22));
    wzB.put("T10000R", Integer.valueOf(5));
    wzB.put("T10000S", Integer.valueOf(5));
    wzB.put("T10002R", Integer.valueOf(5));
    wzB.put("T64R", Integer.valueOf(5));
    wzB.put("T39S", Integer.valueOf(3));
    wzB.put("T39R", Integer.valueOf(1));
    wzB.put("T3S", Integer.valueOf(3));
    wzB.put("T3R", Integer.valueOf(1));
    wzB.put("T23S", Integer.valueOf(3));
    wzB.put("T23R", Integer.valueOf(1));
    wzB.put("T47S", Integer.valueOf(15));
    wzB.put("T47R", Integer.valueOf(14));
    wzB.put("T34S", Integer.valueOf(7));
    wzB.put("T34R", Integer.valueOf(6));
    wzB.put("T35R", Integer.valueOf(8));
    wzB.put("T42S", Integer.valueOf(13));
    wzB.put("T42R", Integer.valueOf(12));
    wzB.put("T37R", Integer.valueOf(9));
    wzB.put("T40R", Integer.valueOf(9));
    wzB.put("T43S", Integer.valueOf(11));
    wzB.put("T43R", Integer.valueOf(10));
    wzB.put("T48S", Integer.valueOf(17));
    wzB.put("T48R", Integer.valueOf(16));
    wzB.put("T52R", Integer.valueOf(25));
    wzB.put("T50R", Integer.valueOf(24));
    wzB.put("T50S", Integer.valueOf(43));
    wzB.put("T285212721R", Integer.valueOf(26));
    wzB.put("T301989937S", Integer.valueOf(32));
    wzB.put("T301989937R", Integer.valueOf(31));
    wzB.put("T1S", Integer.valueOf(4));
    wzB.put("T1R", Integer.valueOf(2));
    wzB.put("T11S", Integer.valueOf(4));
    wzB.put("T11R", Integer.valueOf(2));
    wzB.put("T13S", Integer.valueOf(3));
    wzB.put("T13R", Integer.valueOf(1));
    wzB.put("T21S", Integer.valueOf(4));
    wzB.put("T21R", Integer.valueOf(2));
    wzB.put("T31S", Integer.valueOf(4));
    wzB.put("T31R", Integer.valueOf(2));
    wzB.put("T36S", Integer.valueOf(4));
    wzB.put("T36R", Integer.valueOf(2));
    wzB.put("T53R", Integer.valueOf(27));
    wzB.put("T53S", Integer.valueOf(28));
    wzB.put("T55R", Integer.valueOf(36));
    wzB.put("T55S", Integer.valueOf(37));
    wzB.put("T57R", Integer.valueOf(36));
    wzB.put("T57S", Integer.valueOf(37));
    wzB.put("T-1879048191R", Integer.valueOf(33));
    wzB.put("T-1879048189R", Integer.valueOf(34));
    wzB.put("T-1879048190R", Integer.valueOf(35));
    wzB.put("T-1879048188R", Integer.valueOf(38));
    wzB.put("T-1879048187R", Integer.valueOf(39));
    wzB.put("T318767153R", Integer.valueOf(40));
    wzB.put("T486539313R", Integer.valueOf(65));
    wzB.put("T-1879048186R", Integer.valueOf(48));
    wzB.put("T-1879048186S", Integer.valueOf(49));
    wzB.put("T-1879048185R", Integer.valueOf(52));
    wzB.put("T-1879048185S", Integer.valueOf(52));
    wzB.put("T-1879048183R", Integer.valueOf(57));
    wzB.put("T-1879048183S", Integer.valueOf(57));
    wzB.put("T-1879048176R", Integer.valueOf(58));
    wzB.put("T-1879048176S", Integer.valueOf(58));
    wzB.put("T419430449R", Integer.valueOf(53));
    wzB.put("T419430449S", Integer.valueOf(54));
    wzB.put("T436207665R", Integer.valueOf(59));
    wzB.put("T436207665S", Integer.valueOf(60));
    wzB.put("T62R", Integer.valueOf(55));
    wzB.put("T62S", Integer.valueOf(56));
    wzB.put("T452984881R", Integer.valueOf(61));
    wzB.put("T452984881S", Integer.valueOf(62));
    wzB.put("T469762097R", Integer.valueOf(63));
    wzB.put("T469762097S", Integer.valueOf(64));
    wzB.put("T503316529R", Integer.valueOf(66));
    wzB.put("T503316529S", Integer.valueOf(67));
    wzB.put("T520093745R", Integer.valueOf(68));
    wzB.put("T520093745S", Integer.valueOf(69));
    wzB.put("T553648177R", Integer.valueOf(72));
    wzB.put("T553648177S", Integer.valueOf(73));
    wzH = new HashMap();
    GMTrace.o(2405986992128L, 17926);
  }
  
  public cv(final En_5b8fbb1e.a parama, com.tencent.mm.storage.au paramau, final String paramString1, String paramString2, p paramp, View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
    super(parama.vKB.vKW, paramau);
    GMTrace.i(2401423589376L, 17892);
    this.wyQ = -1L;
    this.esP = true;
    this.wyR = new HashSet();
    this.wzl = -1L;
    this.wzm = -1L;
    this.wzn = -1L;
    this.wzo = 0;
    this.wzp = 0;
    this.wzq = false;
    this.wzr = false;
    this.wzs = false;
    this.wzt = false;
    this.wzu = false;
    this.wzv = false;
    this.wzx = -1L;
    this.qgI = new HashMap();
    this.qgI.put(Integer.valueOf(19), new ba(19));
    this.qgI.put(Integer.valueOf(18), new as(18));
    this.qgI.put(Integer.valueOf(21), new bb());
    this.qgI.put(Integer.valueOf(20), new at());
    this.qgI.put(Integer.valueOf(23), new az());
    this.qgI.put(Integer.valueOf(22), new ay());
    this.qgI.put(Integer.valueOf(30), new ar());
    this.qgI.put(Integer.valueOf(29), new aq());
    this.qgI.put(Integer.valueOf(47), new ba(47));
    this.qgI.put(Integer.valueOf(46), new as(46));
    this.qgI.put(Integer.valueOf(42), new ba(42));
    this.qgI.put(Integer.valueOf(41), new as(41));
    this.qgI.put(Integer.valueOf(45), new ba(45));
    this.qgI.put(Integer.valueOf(44), new as(44));
    this.qgI.put(Integer.valueOf(5), new ca());
    this.qgI.put(Integer.valueOf(3), new bt());
    this.qgI.put(Integer.valueOf(1), new bs());
    this.qgI.put(Integer.valueOf(15), new bn());
    this.qgI.put(Integer.valueOf(14), new bm());
    this.qgI.put(Integer.valueOf(7), new cg.b());
    this.qgI.put(Integer.valueOf(6), new cg.a());
    this.qgI.put(Integer.valueOf(8), new bw());
    this.qgI.put(Integer.valueOf(13), new bi());
    this.qgI.put(Integer.valueOf(12), new bh());
    this.qgI.put(Integer.valueOf(9), new bo());
    this.qgI.put(Integer.valueOf(11), new cf(11));
    this.qgI.put(Integer.valueOf(10), new ce(10));
    this.qgI.put(Integer.valueOf(17), new bv());
    this.qgI.put(Integer.valueOf(16), new bu());
    this.qgI.put(Integer.valueOf(25), new cp());
    this.qgI.put(Integer.valueOf(24), new cm());
    this.qgI.put(Integer.valueOf(43), new cq());
    this.qgI.put(Integer.valueOf(4), new cd(4));
    this.qgI.put(Integer.valueOf(2), new cc(2));
    this.qgI.put(Integer.valueOf(26), new bf());
    this.qgI.put(Integer.valueOf(27), new cn());
    this.qgI.put(Integer.valueOf(28), new co());
    this.qgI.put(Integer.valueOf(31), new cc(2));
    this.qgI.put(Integer.valueOf(32), new cd(4));
    this.qgI.put(Integer.valueOf(33), new cj());
    this.qgI.put(Integer.valueOf(34), new ch());
    this.qgI.put(Integer.valueOf(35), new ci());
    this.qgI.put(Integer.valueOf(36), new by());
    this.qgI.put(Integer.valueOf(37), new bz());
    this.qgI.put(Integer.valueOf(38), new ct());
    this.qgI.put(Integer.valueOf(39), new cs());
    this.qgI.put(Integer.valueOf(40), new bk());
    this.qgI.put(Integer.valueOf(65), new bg());
    this.qgI.put(Integer.valueOf(48), new au());
    this.qgI.put(Integer.valueOf(49), new av());
    this.qgI.put(Integer.valueOf(52), new bp());
    this.qgI.put(Integer.valueOf(57), new bq());
    this.qgI.put(Integer.valueOf(58), new br());
    this.qgI.put(Integer.valueOf(54), new ax());
    this.qgI.put(Integer.valueOf(53), new aw());
    this.qgI.put(Integer.valueOf(60), new al());
    this.qgI.put(Integer.valueOf(59), new ai());
    this.qgI.put(Integer.valueOf(56), new cf(56));
    this.qgI.put(Integer.valueOf(55), new ce(55));
    this.qgI.put(Integer.valueOf(62), new ap());
    this.qgI.put(Integer.valueOf(61), new ao());
    this.qgI.put(Integer.valueOf(64), new ak());
    this.qgI.put(Integer.valueOf(63), new aj());
    this.qgI.put(Integer.valueOf(67), new an());
    this.qgI.put(Integer.valueOf(66), new am());
    this.qgI.put(Integer.valueOf(69), new ap());
    this.qgI.put(Integer.valueOf(68), new ao());
    this.qgI.put(Integer.valueOf(73), new bd());
    this.qgI.put(Integer.valueOf(72), new bc());
    this.wzC = new com.tencent.mm.storage.au();
    this.txk = false;
    this.wzD = false;
    this.wzE = false;
    this.wzF = false;
    this.wzG = null;
    this.ocR = null;
    this.tIv = false;
    this.wzI = 0L;
    this.jQF = null;
    this.wzx = -1L;
    this.wve = parama;
    this.eLN = 211;
    this.wyU = parama.getResources().getDimensionPixelSize(R.f.aQQ);
    this.wyV = parama.getResources().getDimensionPixelSize(R.f.aQu);
    this.wrr = new com.tencent.mm.pluginsdk.ui.d.e()
    {
      public final Object a(com.tencent.mm.pluginsdk.ui.applet.k paramAnonymousk)
      {
        GMTrace.i(2237812178944L, 16673);
        com.tencent.mm.pluginsdk.wallet.h.zJ(6);
        switch (paramAnonymousk.type)
        {
        case 3: 
        case 5: 
        case 8: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 19: 
        case 24: 
        case 26: 
        case 27: 
        case 28: 
        case 29: 
        default: 
        case 4: 
        case 2: 
        case 6: 
        case 7: 
        case 9: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
          for (;;)
          {
            GMTrace.o(2237812178944L, 16673);
            return null;
            cv.a(cv.this, paramAnonymousk);
            continue;
            parama.finish();
          }
        case 25: 
        case 30: 
        case 31: 
          paramAnonymousk = cv.a(cv.this);
          GMTrace.o(2237812178944L, 16673);
          return paramAnonymousk;
        }
        paramAnonymousk = cv.a(cv.this);
        GMTrace.o(2237812178944L, 16673);
        return paramAnonymousk;
      }
      
      public final Object b(com.tencent.mm.pluginsdk.ui.applet.k paramAnonymousk)
      {
        GMTrace.i(19184813604864L, 142938);
        switch (paramAnonymousk.type)
        {
        }
        for (;;)
        {
          GMTrace.o(19184813604864L, 142938);
          return null;
          if (com.tencent.mm.y.at.AU())
          {
            if (com.tencent.mm.af.f.dL(paramString1))
            {
              GMTrace.o(19184813604864L, 142938);
              return null;
            }
            if (com.tencent.mm.af.f.iP(paramString1))
            {
              GMTrace.o(19184813604864L, 142938);
              return null;
            }
            if (com.tencent.mm.af.f.iO(paramString1))
            {
              GMTrace.o(19184813604864L, 142938);
              return null;
            }
          }
          String str = new String(Base64.decode(paramAnonymousk.url, 0));
          paramAnonymousk = new String(Base64.decode(com.tencent.mm.sdk.platformtools.bg.aq((String)paramAnonymousk.t(String.class), ""), 0));
          w.i("MicroMsg.ChattingListAdapter", "appId:%s,path:%s", new Object[] { str, paramAnonymousk });
          AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
          localAppBrandStatObject.scene = 1082;
          localAppBrandStatObject.eAv = paramString1;
          ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(parama.vKB.vKW, null, str, 0, 0, paramAnonymousk, localAppBrandStatObject);
        }
      }
    };
    this.wzk = paramOnCreateContextMenuListener;
    this.odu = paramOnCreateContextMenuListener;
    paramau = new cy(paramOnCreateContextMenuListener, parama);
    this.wyZ = paramau;
    this.wyY = paramau;
    paramau = new cz();
    this.wzb = paramau;
    this.wza = paramau;
    paramau = new cx(parama);
    this.wzd = paramau;
    this.wzc = paramau;
    paramau = new com.tencent.mm.pluginsdk.ui.chat.l(parama.vKB.vKW);
    this.wzf = paramau;
    this.wze = paramau;
    paramau = new a();
    this.wzh = paramau;
    this.wzg = paramau;
    paramau = new o(parama);
    this.wzj = paramau;
    this.wzi = paramau;
    paramau = this.qgI.keySet().iterator();
    while (paramau.hasNext())
    {
      paramOnCreateContextMenuListener = (Integer)paramau.next();
      ((ah)this.qgI.get(paramOnCreateContextMenuListener)).wqK = parama.wqK;
    }
    a(paramString1, paramp, paramString2);
    this.wzy = new HashMap();
    this.wzz = new HashMap();
    this.wzA = new ArrayList();
    if (this.jQF == null)
    {
      parama = new c.a();
      parama.gKF = com.tencent.mm.af.a.e.jm(this.wve.cci());
      parama.gKC = true;
      parama.gKY = true;
      parama.gKR = R.k.aVS;
      this.jQF = parama.Jn();
    }
    GMTrace.o(2401423589376L, 17892);
  }
  
  public static void Y(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(2405450121216L, 17922);
    h.i(paramString, paramInt1, paramInt2);
    GMTrace.o(2405450121216L, 17922);
  }
  
  static com.tencent.mm.storage.au a(com.tencent.mm.storage.au paramau, Cursor paramCursor)
  {
    GMTrace.i(2401960460288L, 17896);
    com.tencent.mm.storage.au localau = paramau;
    if (paramau == null) {
      localau = new com.tencent.mm.storage.au();
    }
    localau.b(paramCursor);
    GMTrace.o(2401960460288L, 17896);
    return localau;
  }
  
  private static short ax(com.tencent.mm.storage.au paramau)
  {
    int m = 0;
    int k = 1;
    GMTrace.i(2403034202112L, 17904);
    int j;
    if (paramau.field_isSend == 1)
    {
      i = 1;
      if (paramau.field_type != 49) {
        break label186;
      }
      localObject1 = com.tencent.mm.sdk.platformtools.bg.Sx(paramau.field_content);
      j = m;
      if (localObject1 != null)
      {
        localObject1 = f.a.C((String)localObject1, paramau.field_reserved);
        j = m;
        if (localObject1 != null)
        {
          j = m;
          if (((f.a)localObject1).type == 2000)
          {
            paramau.setType(419430449);
            com.tencent.mm.y.at.AR();
            com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
            j = 1;
          }
        }
      }
      if (j == 0) {
        break label186;
      }
      localObject1 = wzB;
      localObject2 = new StringBuilder("T419430449");
      if (i == 0) {
        break label179;
      }
    }
    short s;
    label179:
    for (paramau = "S";; paramau = "R")
    {
      s = (short)com.tencent.mm.sdk.platformtools.bg.e((Integer)((Map)localObject1).get(paramau));
      GMTrace.o(2403034202112L, 17904);
      return s;
      i = 0;
      break;
    }
    label186:
    Object localObject2 = wzB;
    StringBuilder localStringBuilder = new StringBuilder("T").append(paramau.field_type);
    if (i != 0) {}
    for (Object localObject1 = "S";; localObject1 = "R")
    {
      j = com.tencent.mm.sdk.platformtools.bg.e((Integer)((Map)localObject2).get((String)localObject1));
      if (j <= 0) {
        break;
      }
      s = (short)j;
      GMTrace.o(2403034202112L, 17904);
      return s;
    }
    boolean bool1 = paramau.bTC();
    boolean bool2 = paramau.bTu();
    if (bool1)
    {
      j = k;
      if (i != 0) {
        j = 3;
      }
      s = (short)j;
      GMTrace.o(2403034202112L, 17904);
      return s;
    }
    if (bool2)
    {
      if (i != 0) {}
      for (i = 7;; i = 6)
      {
        s = (short)i;
        GMTrace.o(2403034202112L, 17904);
        return s;
      }
    }
    if (paramau.bTI())
    {
      if (i != 0) {}
      for (i = 15;; i = 14)
      {
        s = (short)i;
        GMTrace.o(2403034202112L, 17904);
        return s;
      }
    }
    if (i != 0) {}
    for (int i = 4;; i = 2)
    {
      s = (short)i;
      GMTrace.o(2403034202112L, 17904);
      return s;
    }
  }
  
  public final int CJ(int paramInt)
  {
    GMTrace.i(2403302637568L, 17906);
    if (this.wzs)
    {
      paramInt = this.wzo;
      GMTrace.o(2403302637568L, 17906);
      return paramInt;
    }
    if (paramInt <= 0)
    {
      GMTrace.o(2403302637568L, 17906);
      return 0;
    }
    if (this.jRt < paramInt) {
      paramInt = this.jRt;
    }
    for (this.jRt = 0;; this.jRt -= paramInt)
    {
      GMTrace.o(2403302637568L, 17906);
      return paramInt;
    }
  }
  
  public final void CK(int paramInt)
  {
    GMTrace.i(2404510597120L, 17915);
    com.tencent.mm.storage.au localau = (com.tencent.mm.storage.au)getItem(paramInt);
    if ((localau != null) && (localau.field_msgId != 0L)) {
      this.wyR.add(Long.valueOf(localau.field_msgId));
    }
    GMTrace.o(2404510597120L, 17915);
  }
  
  public final void QF()
  {
    GMTrace.i(2402363113472L, 17899);
    long l1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).zv().BV(this.eDs);
    label96:
    boolean bool1;
    Object localObject;
    if ((this.juT != -1L) && (this.wve.txk))
    {
      this.txk = true;
      if (this.wzs) {
        break label1474;
      }
      if (!this.txk) {
        break label365;
      }
      com.tencent.mm.y.at.AR();
      this.gQB = com.tencent.mm.y.c.yN().aj(this.eDs, this.juT);
      bool1 = false;
      if ((this.jRt < 0) || (this.jRt > this.gQB))
      {
        bool1 = true;
        this.jRt = (this.gQB - 18);
      }
      w.i("MicroMsg.ChattingListAdapter", "summerbadcr summerdel resetCursor restart:%b fromCount:%d totalcount:%d limit:%d, talker:%s isBizChat:%b, createTime:%s", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(this.jRt), Integer.valueOf(this.gQB), Integer.valueOf(this.gQB - this.jRt), this.eDs, Boolean.valueOf(this.txk), Long.valueOf(l1) });
      if (!this.txk) {
        break label388;
      }
      com.tencent.mm.y.at.AR();
      localObject = com.tencent.mm.y.c.yN().i(this.eDs, this.juT, this.gQB - this.jRt);
      label250:
      if ((localObject != null) && (!((Cursor)localObject).isClosed())) {
        break label1363;
      }
      w.w("MicroMsg.ChattingListAdapter", "update pos fail, cursor is null");
      label274:
      setCursor((Cursor)localObject);
    }
    for (;;)
    {
      int i = getCount();
      if (i > 0)
      {
        this.wyP = new short[i];
        this.mTD = new short[i];
      }
      this.wzy.clear();
      this.wzz.clear();
      this.wzA.clear();
      super.notifyDataSetChanged();
      if (this.wzv) {
        com.tencent.mm.bc.l.MM().MG();
      }
      GMTrace.o(2402363113472L, 17899);
      return;
      this.txk = false;
      break;
      label365:
      com.tencent.mm.y.at.AR();
      this.gQB = com.tencent.mm.y.c.yM().Cp(this.eDs);
      break label96;
      label388:
      if (!this.wve.wvi)
      {
        com.tencent.mm.y.at.AR();
        localObject = com.tencent.mm.y.c.yM().g(this.eDs, this.gQB - this.jRt, l1);
        break label250;
      }
      com.tencent.mm.y.at.AR();
      Cursor localCursor = com.tencent.mm.y.c.yM().g(this.eDs, this.gQB - this.jRt, l1);
      localObject = localCursor;
      if (!this.wve.wCo.wCJ) {
        break label250;
      }
      label483:
      label533:
      int k;
      label563:
      int j;
      if (localCursor == null)
      {
        i = -1;
        w.i("MicroMsg.ChattingListAdapter", "summerbadcr resetCursor check fault count[%d], talker[%s]", new Object[] { Integer.valueOf(i), this.eDs });
        localObject = localCursor;
        if (i <= 0) {
          break label250;
        }
        if (!bool1) {
          break label745;
        }
        if (!localCursor.moveToLast()) {
          break label755;
        }
        l1 = System.currentTimeMillis();
        com.tencent.mm.y.at.AR();
        localObject = com.tencent.mm.y.c.yP().TO(this.eDs);
        if (localObject != null) {
          break label762;
        }
        k = 0;
        w.i("MicroMsg.ChattingListAdapter", "summerbadcr revisedCursor check fault first/last seq[%d], restart[%b], undeliver[%d]", new Object[] { Integer.valueOf(localCursor.getInt(localCursor.getColumnIndex("msgSeq"))), Boolean.valueOf(bool1), Integer.valueOf(k) });
        j = 0;
        label616:
        label664:
        do
        {
          i = localCursor.getInt(localCursor.getColumnIndex("flag"));
          if (((i & 0x2) != 0) || (localCursor.getInt(localCursor.getColumnIndex("isSend")) == 0)) {
            break;
          }
          i = j + 1;
          if (!bool1) {
            break label1348;
          }
          j = i;
        } while (localCursor.moveToPrevious());
      }
      for (;;)
      {
        k = 1;
        j = i;
        for (i = k;; i = 0)
        {
          localObject = localCursor;
          if (i != 0) {
            w.i("MicroMsg.ChattingListAdapter", "summerbadcr resetCursor check fault traversal all not found take time[%d]ms, cursor index:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1), Integer.valueOf(j) });
          }
          label745:
          label755:
          for (localObject = localCursor;; localObject = localCursor)
          {
            break;
            i = localCursor.getCount();
            break label483;
            if (localCursor.moveToFirst()) {
              break label533;
            }
          }
          label762:
          k = ((com.tencent.mm.g.b.aj)localObject).field_UnDeliverCount;
          break label563;
          if ((k != 0) || ((i & 0x2) != 0)) {
            break label957;
          }
          i = localCursor.getInt(localCursor.getColumnIndex("type"));
          if ((i > 50) || (i < 0))
          {
            i = j + 1;
            break label664;
          }
          this.wve.wCo.wCJ = false;
          localObject = new com.tencent.mm.storage.au();
          ((com.tencent.mm.storage.au)localObject).b(localCursor);
          localCursor.moveToFirst();
          w.i("MicroMsg.ChattingListAdapter", "summerbadcr revisedCursor check fault but not needCheckFault more break[%d, %d, %d, %d, %d, %d] take time[%d]ms, cursor index:%d", new Object[] { Integer.valueOf(((com.tencent.mm.g.b.ce)localObject).field_flag), Integer.valueOf(((com.tencent.mm.g.b.ce)localObject).field_isSend), Long.valueOf(((com.tencent.mm.g.b.ce)localObject).field_msgId), Long.valueOf(((com.tencent.mm.g.b.ce)localObject).field_msgSvrId), Long.valueOf(((com.tencent.mm.g.b.ce)localObject).field_msgSeq), Integer.valueOf(((com.tencent.mm.g.b.ce)localObject).field_type), Long.valueOf(System.currentTimeMillis() - l1), Integer.valueOf(j) });
        }
        label957:
        if ((i & 0x1) == 0)
        {
          i = j + 1;
          break label664;
        }
        if (j == 0)
        {
          i = j + 1;
          w.i("MicroMsg.ChattingListAdapter", "summerbadcr revisedCursor check fault index == 0 continue");
          break label664;
        }
        boolean bool2;
        label999:
        label1067:
        int m;
        long l2;
        long l3;
        long l4;
        int n;
        long l5;
        long l6;
        if ((i & 0x4) != 0)
        {
          bool2 = true;
          localObject = new com.tencent.mm.storage.au();
          ((com.tencent.mm.storage.au)localObject).b(localCursor);
          localCursor.close();
          if (!bool1) {
            break label1256;
          }
          this.jRt = (this.gQB - j - 1);
          com.tencent.mm.y.at.AR();
          localCursor = com.tencent.mm.y.c.yM().g(this.eDs, this.gQB - this.jRt, 0L);
          k = ((com.tencent.mm.g.b.ce)localObject).field_flag;
          m = ((com.tencent.mm.g.b.ce)localObject).field_isSend;
          l2 = ((com.tencent.mm.g.b.ce)localObject).field_msgId;
          l3 = ((com.tencent.mm.g.b.ce)localObject).field_msgSvrId;
          l4 = ((com.tencent.mm.g.b.ce)localObject).field_msgSeq;
          n = ((com.tencent.mm.g.b.ce)localObject).field_type;
          l5 = ((com.tencent.mm.g.b.ce)localObject).field_createTime;
          l6 = System.currentTimeMillis();
          if (localCursor != null) {
            break label1337;
          }
        }
        label1256:
        label1337:
        for (i = -1;; i = localCursor.getCount())
        {
          w.i("MicroMsg.ChattingListAdapter", "summerbadcr revisedCursor check fault faultUp[%b]  break[%d, %d, %d, %d, %d, %d, %d] take time[%d]ms, cursor index:%d, nowCount:%d, fromCount:%d", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(k), Integer.valueOf(m), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Integer.valueOf(n), Long.valueOf(l5), Long.valueOf(l6 - l1), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(this.jRt) });
          i = 0;
          break;
          bool2 = false;
          break label999;
          if (bool2)
          {
            this.jRt += j;
            com.tencent.mm.y.at.AR();
            localCursor = com.tencent.mm.y.c.yM().g(this.eDs, this.gQB - this.jRt, 0L);
            break label1067;
          }
          com.tencent.mm.y.at.AR();
          localCursor = com.tencent.mm.y.c.yM().h(this.eDs, this.gQB - this.jRt, ((com.tencent.mm.g.b.ce)localObject).field_createTime);
          break label1067;
        }
        label1348:
        j = i;
        if (localCursor.moveToNext()) {
          break label616;
        }
      }
      label1363:
      if (((Cursor)localObject).moveToLast())
      {
        this.wzC = a(this.wzC, (Cursor)localObject);
        this.wzm = this.wzC.field_createTime;
      }
      this.wzx = -1L;
      if (((Cursor)localObject).moveToFirst())
      {
        this.wzC = a(this.wzC, (Cursor)localObject);
        this.wzl = this.wzC.field_createTime;
      }
      w.d("MicroMsg.ChattingListAdapter", "update pos topCreateTime[%d] downCreateTime[%d]", new Object[] { Long.valueOf(this.wzl), Long.valueOf(this.wzm) });
      break label274;
      label1474:
      w.i("MicroMsg.ChattingListAdapter", "topLoadMore[%B] downLoadMore[%B]", new Object[] { Boolean.valueOf(this.wzq), Boolean.valueOf(this.wzr) });
      if ((!this.wzq) && (!this.wzr) && (this.wzm >= this.wzn))
      {
        if (this.txk)
        {
          com.tencent.mm.y.at.AR();
          this.wzn = com.tencent.mm.y.c.yN().am(this.eDs, this.juT);
          com.tencent.mm.y.at.AR();
          this.wzp = Math.max(0, com.tencent.mm.y.c.yN().b(this.eDs, this.juT, this.wzm, this.wzn) - 1);
          label1598:
          this.wzm = this.wzn;
        }
      }
      else
      {
        if (this.wzq)
        {
          this.wzq = false;
          if (!this.txk) {
            break label1984;
          }
          com.tencent.mm.y.at.AR();
          l1 = com.tencent.mm.y.c.yN().r(this.eDs, this.juT, this.wzl);
          com.tencent.mm.y.at.AR();
          this.wzo = Math.max(0, com.tencent.mm.y.c.yN().b(this.eDs, this.juT, l1, this.wzl) - 1);
          label1683:
          this.wzl = l1;
        }
        if (this.wzr)
        {
          this.wzr = false;
          if (!this.txk) {
            break label2041;
          }
          com.tencent.mm.y.at.AR();
          l1 = com.tencent.mm.y.c.yN().s(this.eDs, this.juT, this.wzm);
          com.tencent.mm.y.at.AR();
        }
      }
      for (this.wzp = Math.max(0, com.tencent.mm.y.c.yN().b(this.eDs, this.juT, this.wzm, l1) - 1);; this.wzp = Math.max(0, com.tencent.mm.y.c.yM().k(this.eDs, this.wzm, l1) - 1))
      {
        this.wzm = l1;
        w.v("MicroMsg.ChattingListAdapter", "query topCreateTime[%d] downCreateTime[%d], lastCreateTime[%d], topInc[%d], bottomInc[%d]", new Object[] { Long.valueOf(this.wzl), Long.valueOf(this.wzm), Long.valueOf(this.wzn), Integer.valueOf(this.wzo), Integer.valueOf(this.wzp) });
        if (!this.txk) {
          break label2098;
        }
        com.tencent.mm.y.at.AR();
        w.v("MicroMsg.ChattingListAdapter", "count([top, down]) = %d", new Object[] { Integer.valueOf(com.tencent.mm.y.c.yN().b(this.eDs, this.juT, this.wzl, this.wzm)) });
        com.tencent.mm.y.at.AR();
        setCursor(com.tencent.mm.y.c.yN().c(this.eDs, this.juT, this.wzl, this.wzm));
        break;
        this.wzn = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cv(this.eDs);
        com.tencent.mm.y.at.AR();
        this.wzp = Math.max(0, com.tencent.mm.y.c.yM().k(this.eDs, this.wzm, this.wzn) - 1);
        break label1598;
        label1984:
        com.tencent.mm.y.at.AR();
        l1 = com.tencent.mm.y.c.yM().N(this.eDs, this.wzl);
        com.tencent.mm.y.at.AR();
        this.wzo = Math.max(0, com.tencent.mm.y.c.yM().k(this.eDs, l1, this.wzl) - 1);
        break label1683;
        label2041:
        com.tencent.mm.y.at.AR();
        l1 = com.tencent.mm.y.c.yM().O(this.eDs, this.wzm);
        com.tencent.mm.y.at.AR();
      }
      label2098:
      com.tencent.mm.y.at.AR();
      w.v("MicroMsg.ChattingListAdapter", "count([top, down]) = %d", new Object[] { Integer.valueOf(com.tencent.mm.y.c.yM().k(this.eDs, this.wzl, this.wzm)) });
      com.tencent.mm.y.at.AR();
      setCursor(com.tencent.mm.y.c.yM().l(this.eDs, this.wzl, this.wzm));
    }
  }
  
  protected final void QG()
  {
    GMTrace.i(2402228895744L, 17898);
    com.tencent.mm.y.at.AR();
    setCursor(com.tencent.mm.y.c.yM().aOp());
    GMTrace.o(2402228895744L, 17898);
  }
  
  public final boolean Wc(String paramString)
  {
    GMTrace.i(2404644814848L, 17916);
    try
    {
      this.ocR = new com.tencent.mm.pluginsdk.ui.e(com.tencent.mm.sdk.platformtools.bg.convertStreamToString(new FileInputStream(paramString)));
      GMTrace.o(2404644814848L, 17916);
      return true;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.ChattingListAdapter", paramString, "", new Object[0]);
      this.ocR = null;
      GMTrace.o(2404644814848L, 17916);
    }
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(2404913250304L, 17918);
    if (this.krX != null) {
      this.krX.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2236067348480L, 16660);
          cv.this.notifyDataSetChanged();
          GMTrace.o(2236067348480L, 16660);
        }
      });
    }
    GMTrace.o(2404913250304L, 17918);
  }
  
  public final void a(long paramLong, com.tencent.mm.storage.au paramau, boolean paramBoolean)
  {
    GMTrace.i(2405047468032L, 17919);
    if ((!this.wzy.containsKey(Long.valueOf(paramLong))) || (!this.wzz.containsKey(Long.valueOf(paramLong))))
    {
      w.d("MicroMsg.ChattingListAdapter", "msg not display, " + paramLong);
      GMTrace.o(2405047468032L, 17919);
      return;
    }
    Object localObject1 = (ah.a)((View)this.wzy.get(Long.valueOf(paramLong))).getTag();
    if (((Integer)this.wzz.get(Long.valueOf(paramLong))).intValue() == 1) {}
    for (boolean bool = true;; bool = false)
    {
      Object localObject2 = ac(3, bool);
      if ((localObject2 instanceof bs))
      {
        localObject2 = (bs)localObject2;
        if ((localObject2 != null) && (true == paramBoolean))
        {
          localObject1 = (dq)localObject1;
          com.tencent.mm.ao.n.IZ().a(((dq)localObject1).wrU, paramau.field_imgPath, com.tencent.mm.br.a.getDensity(((bs)localObject2).wvE.vKB.vKW), paramau.fww, paramau.fwx, R.g.aVi, ((dq)localObject1).wFt, R.g.aVj, 1, null);
        }
      }
      GMTrace.o(2405047468032L, 17919);
      return;
    }
  }
  
  public final void a(s.a.a parama)
  {
    GMTrace.i(2405315903488L, 17921);
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (parama != null)
    {
      if (parama.hcC != 3) {
        break label55;
      }
      bool1 = eh.b(parama);
    }
    for (;;)
    {
      if (!bool1) {
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2492960079872L, 18574);
            cv.this.a(null, null);
            GMTrace.o(2492960079872L, 18574);
          }
        });
      }
      GMTrace.o(2405315903488L, 17921);
      return;
      label55:
      if ((parama.hcC != 2) && (parama.hcC != -1))
      {
        bool1 = bool2;
        if (parama.hcC != 1) {}
      }
      else
      {
        bool1 = el.b(parama);
      }
    }
  }
  
  public final void a(p paramp)
  {
    GMTrace.i(19219441778688L, 143196);
    this.wyS = paramp;
    GMTrace.o(19219441778688L, 143196);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(2402765766656L, 17902);
    if (this.wzF)
    {
      this.wzF = false;
      GMTrace.o(2402765766656L, 17902);
      return;
    }
    if (this.wzD)
    {
      this.wzE = true;
      GMTrace.o(2402765766656L, 17902);
      return;
    }
    if (this.eDs == null)
    {
      GMTrace.o(2402765766656L, 17902);
      return;
    }
    if (!this.esP)
    {
      w.i("MicroMsg.ChattingListAdapter", "is not resumeState ");
      GMTrace.o(2402765766656L, 17902);
      return;
    }
    super.a(paramString, paraml);
    GMTrace.o(2402765766656L, 17902);
  }
  
  public final void a(String paramString1, p paramp, String paramString2)
  {
    GMTrace.i(2401557807104L, 17893);
    this.wzw = new TreeSet();
    this.wyT = paramString1;
    if (x.fw(paramString1)) {}
    for (this.gtf = x.Tt(paramString2);; this.gtf = paramString2)
    {
      this.wyS = paramp;
      paramp = new cw(this.wve, paramString1);
      this.wyX = paramp;
      this.wyW = paramp;
      this.eDs = paramString1;
      this.juT = this.wve.cej();
      ccx();
      GMTrace.o(2401557807104L, 17893);
      return;
    }
  }
  
  public final ah ac(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(2404376379392L, 17914);
    Map localMap = wzB;
    StringBuilder localStringBuilder = new StringBuilder("T").append(paramInt);
    if (paramBoolean)
    {
      localObject = "S";
      int i = com.tencent.mm.sdk.platformtools.bg.e((Integer)localMap.get((String)localObject));
      paramInt = i;
      if (i == 0)
      {
        localMap = wzB;
        localStringBuilder = new StringBuilder("T1");
        if (!paramBoolean) {
          break label155;
        }
      }
    }
    label155:
    for (Object localObject = "S";; localObject = "R")
    {
      paramInt = com.tencent.mm.sdk.platformtools.bg.e((Integer)localMap.get((String)localObject));
      localObject = (ah)this.qgI.get(Integer.valueOf(paramInt));
      GMTrace.o(2404376379392L, 17914);
      return (ah)localObject;
      localObject = "R";
      break;
    }
  }
  
  public final void ayJ()
  {
    GMTrace.i(2404242161664L, 17913);
    this.wzt = false;
    notifyDataSetChanged();
    w.d("MicroMsg.ChattingListAdapter", "enable ClickListener");
    this.wyW = this.wyX;
    this.wyY = this.wyZ;
    this.wza = this.wzb;
    this.wzc = this.wzd;
    this.wze = this.wzf;
    this.wzg = this.wzh;
    this.wzi = this.wzj;
    this.wve.cek();
    GMTrace.o(2404242161664L, 17913);
  }
  
  public final void bJB()
  {
    GMTrace.i(2405181685760L, 17920);
    if (this.krX != null) {
      this.krX.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2169898008576L, 16167);
          cv.this.notifyDataSetChanged();
          GMTrace.o(2169898008576L, 16167);
        }
      });
    }
    GMTrace.o(2405181685760L, 17920);
  }
  
  public final boolean bo(Context paramContext, String paramString)
  {
    GMTrace.i(2404779032576L, 17917);
    if (wzH.containsKey(paramString))
    {
      this.ocR = ((com.tencent.mm.pluginsdk.ui.e)wzH.get(paramString));
      GMTrace.o(2404779032576L, 17917);
      return true;
    }
    try
    {
      this.ocR = new com.tencent.mm.pluginsdk.ui.e(com.tencent.mm.sdk.platformtools.bg.convertStreamToString(paramContext.getAssets().open(paramString)));
      wzH.put(paramString, this.ocR);
      GMTrace.o(2404779032576L, 17917);
      return true;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.ChattingListAdapter", paramContext, "", new Object[0]);
      GMTrace.o(2404779032576L, 17917);
    }
    return false;
  }
  
  public final boolean ccA()
  {
    GMTrace.i(2403436855296L, 17907);
    if (!this.wzs)
    {
      if (this.jRt <= 0)
      {
        GMTrace.o(2403436855296L, 17907);
        return true;
      }
      GMTrace.o(2403436855296L, 17907);
      return false;
    }
    long l = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cu(this.eDs);
    if (this.wzl <= l)
    {
      GMTrace.o(2403436855296L, 17907);
      return true;
    }
    GMTrace.o(2403436855296L, 17907);
    return false;
  }
  
  public final boolean ccB()
  {
    GMTrace.i(2403571073024L, 17908);
    if (!this.wzs)
    {
      GMTrace.o(2403571073024L, 17908);
      return true;
    }
    long l = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cv(this.eDs);
    if (this.wzm >= l)
    {
      GMTrace.o(2403571073024L, 17908);
      return true;
    }
    GMTrace.o(2403571073024L, 17908);
    return false;
  }
  
  final void ccC()
  {
    GMTrace.i(2403973726208L, 17911);
    w.d("MicroMsg.ChattingListAdapter", "disable clickListener");
    this.wyW = null;
    this.wyY = null;
    this.wza = null;
    this.wzc = null;
    this.wze = null;
    this.wzg = null;
    this.wzi = null;
    GMTrace.o(2403973726208L, 17911);
  }
  
  public final void ccD()
  {
    GMTrace.i(2404107943936L, 17912);
    this.wzt = true;
    notifyDataSetChanged();
    ccC();
    GMTrace.o(2404107943936L, 17912);
  }
  
  public final void ccx()
  {
    GMTrace.i(2401692024832L, 17894);
    if (this.wzw != null) {
      this.wzw.clear();
    }
    this.gQB = 0;
    this.jRt = -1;
    this.wzl = -1L;
    this.wzm = -1L;
    this.wzn = -1L;
    this.wyQ = -1L;
    this.wzo = 0;
    this.wzp = 0;
    this.wzq = false;
    this.wzr = false;
    this.wzs = false;
    this.wzt = false;
    GMTrace.o(2401692024832L, 17894);
  }
  
  public final boolean ccy()
  {
    GMTrace.i(2402094678016L, 17897);
    if (this.wzs)
    {
      this.wzn = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cv(this.eDs);
      if (this.wzn >= this.wzm)
      {
        this.wzm = this.wzn;
        QF();
        GMTrace.o(2402094678016L, 17897);
        return true;
      }
    }
    GMTrace.o(2402094678016L, 17897);
    return false;
  }
  
  public final void ccz()
  {
    GMTrace.i(2402631548928L, 17901);
    this.wzE = false;
    this.wzD = false;
    this.wzF = false;
    a(null, null);
    GMTrace.o(2402631548928L, 17901);
  }
  
  public final boolean eX(long paramLong)
  {
    GMTrace.i(2403839508480L, 17910);
    if (this.wzw.contains(Long.valueOf(paramLong)))
    {
      w.d("MicroMsg.ChattingListAdapter", "remove select item, msgId = %d", new Object[] { Long.valueOf(paramLong) });
      this.wzw.remove(Long.valueOf(paramLong));
    }
    for (;;)
    {
      a(null, null);
      GMTrace.o(2403839508480L, 17910);
      return true;
      w.d("MicroMsg.ChattingListAdapter", "add select item, msgId = %d", new Object[] { Long.valueOf(paramLong) });
      if (this.wzw.size() >= 100)
      {
        com.tencent.mm.ui.base.h.b(this.wve.vKB.vKW, this.wve.getString(R.l.dqx, new Object[] { Integer.valueOf(100) }), "", true);
        GMTrace.o(2403839508480L, 17910);
        return false;
      }
      this.wzw.add(Long.valueOf(paramLong));
    }
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(2402899984384L, 17903);
    paramInt = ax((com.tencent.mm.storage.au)getItem(paramInt));
    GMTrace.o(2402899984384L, 17903);
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(2403705290752L, 17909);
    com.tencent.mm.storage.au localau = (com.tencent.mm.storage.au)getItem(paramInt);
    w.i("MicroMsg.ChattingListAdapter", "shwen getview:%d, msgId %d, svrId %d, type:%d, send:%d, talker:%s", new Object[] { Integer.valueOf(paramInt), Long.valueOf(localau.field_msgId), Long.valueOf(localau.field_msgSvrId), Integer.valueOf(localau.field_type), Integer.valueOf(localau.field_isSend), localau.field_talker });
    if (paramInt == 0) {
      this.wve.cdH();
    }
    long l1;
    long l2;
    int i;
    if ((paramInt != 0) && ((this.mTD[paramInt] == 0) || (this.wyP[(paramInt - 1)] == 0)))
    {
      paramViewGroup = (com.tencent.mm.storage.au)getItem(paramInt - 1);
      l1 = paramViewGroup.field_createTime;
      l2 = localau.field_createTime;
      if (l2 - l1 >= 60000L) {
        break label1076;
      }
      i = 1;
    }
    for (;;)
    {
      int j;
      label183:
      label200:
      label259:
      label275:
      int k;
      boolean bool;
      label294:
      Object localObject1;
      label438:
      label483:
      label503:
      Object localObject2;
      if ((l2 - l1) / 180000L < 1L)
      {
        j = 1;
        if ((i == 0) && (j == 0)) {
          break label1088;
        }
        this.mTD[paramInt] = 2;
        this.wyP[(paramInt - 1)] = ax(paramViewGroup);
        if (((this.mTD[paramInt] != 1) && (paramInt != 0) && (!this.wyR.contains(Long.valueOf(localau.field_msgId)))) || (localau.field_createTime <= 1000L)) {
          break label1098;
        }
        i = 1;
        if (localau.field_msgId != this.wyQ) {
          break label1104;
        }
        j = 1;
        k = localau.field_type;
        if (localau.field_isSend != 1) {
          break label1110;
        }
        bool = true;
        localObject1 = ac(k, bool);
        if (localObject1 != null) {
          this.wyP[paramInt] = ((short)((ah)localObject1).ccq());
        }
        if ((localObject1 == null) && (paramView == null)) {
          w.e("MicroMsg.ChattingListAdapter", "inflating fail, item & convertView both are null, msgtype = " + localau.field_type + ", isSend = " + localau.field_isSend);
        }
        paramViewGroup = paramView;
        if (paramView == null)
        {
          if (this.lVD == null) {
            this.lVD = v.fb(this.wve.vKB.vKW);
          }
          paramViewGroup = ((ah)localObject1).a(this.lVD, paramView);
        }
        paramView = (ah.a)paramViewGroup.getTag();
        Assert.assertNotNull(paramViewGroup);
        Assert.assertNotNull(paramView);
        if (!this.wzt) {
          break label1116;
        }
        k = 1;
        paramView.wvB = k;
        if (i == 0) {
          break label1122;
        }
        paramView.jRw.setVisibility(0);
        paramView.jRw.setText(com.tencent.mm.pluginsdk.i.n.c(this.wve.vKB.vKW, localau.field_createTime, false));
        if (paramView.wvz != null)
        {
          if (j == 0) {
            break label1134;
          }
          paramView.wvz.setVisibility(0);
        }
        i = localau.field_type;
        if (localau.field_isSend != 1) {
          break label1146;
        }
        bool = true;
        localObject1 = ac(i, bool);
        if (localObject1 != null)
        {
          this.wyP[paramInt] = ((short)((ah)localObject1).ccq());
          paramView.wvC = 0L;
          localObject2 = com.tencent.mm.at.b.JS();
          if ((localObject2 == null) || (((apv)localObject2).ucY == null) || (((apv)localObject2).uFq != 0) || (!com.tencent.mm.at.b.JQ())) {}
        }
      }
      try
      {
        paramView.wvC = com.tencent.mm.sdk.platformtools.bg.getLong(((apv)localObject2).ucY, 0L);
        localObject2 = this.wve;
        l1 = this.wzI;
        l2 = System.currentTimeMillis();
        this.wzI = l2;
        if (l1 + 30000L < l2)
        {
          com.tencent.mm.y.at.AR();
          this.tIv = com.tencent.mm.y.c.isSDCardAvailable();
        }
        ((ah)localObject1).a(paramView, paramInt, (En_5b8fbb1e.a)localObject2, localau, this.tIv);
        if ((paramView.jRw.getVisibility() == 0) && (this.ocR != null))
        {
          paramView.jRw.setTextColor(this.ocR.tsS);
          if (this.ocR.tsT)
          {
            paramView.jRw.setShadowLayer(2.0F, 1.2F, 1.2F, this.ocR.tsU);
            if (!this.ocR.tsV) {
              break label1176;
            }
            paramView.jRw.setBackgroundResource(R.g.aVr);
            paramView.jRw.setPadding(this.wyV, this.wyU, this.wyV, this.wyU);
          }
        }
        else
        {
          if ((paramView.oGJ != null) && (paramView.oGJ.getVisibility() == 0) && (this.ocR != null) && (!this.eDs.equals("qqmail")) && (ax(localau) != 40))
          {
            paramView.oGJ.setTextColor(this.ocR.tsW);
            paramView.oGJ.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
          }
          if (this.wzt)
          {
            if (!localau.isSystem()) {
              break label1187;
            }
            paramInt = 0;
            if (paramInt != 0) {}
          }
          else
          {
            if (!this.wzu) {
              break label1192;
            }
          }
          if (paramView.lCA != null) {
            paramView.lCA.setChecked(this.wzw.contains(Long.valueOf(localau.field_msgId)));
          }
          if (paramView.npf != null)
          {
            paramView.npf.setTag(Long.valueOf(localau.field_msgId));
            paramView.npf.setOnClickListener(this.wzG);
          }
          paramView.lY(true);
          paramView = this.wzy.entrySet().iterator();
          while (paramView.hasNext())
          {
            localObject1 = (Map.Entry)paramView.next();
            if (((Map.Entry)localObject1).getValue() == paramViewGroup)
            {
              this.wzy.remove(((Map.Entry)localObject1).getKey());
              this.wzz.remove(((Map.Entry)localObject1).getKey());
            }
          }
          this.wzy.put(Long.valueOf(localau.field_msgId), paramViewGroup);
          if (localau.bTC()) {
            this.wzz.put(Long.valueOf(localau.field_msgId), Integer.valueOf(localau.field_isSend));
          }
          GMTrace.o(2403705290752L, 17909);
          return paramViewGroup;
          label1076:
          i = 0;
          continue;
          j = 0;
          break label183;
          label1088:
          this.mTD[paramInt] = 1;
          break label200;
          label1098:
          i = 0;
          break label259;
          label1104:
          j = 0;
          break label275;
          label1110:
          bool = false;
          break label294;
          label1116:
          k = 0;
          break label438;
          label1122:
          paramView.jRw.setVisibility(8);
          break label483;
          label1134:
          paramView.wvz.setVisibility(8);
          break label503;
          label1146:
          bool = false;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          paramView.wvC = 0L;
          continue;
          paramView.jRw.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
          continue;
          label1176:
          paramView.jRw.setBackgroundColor(0);
          continue;
          label1187:
          paramInt = 1;
          continue;
          label1192:
          paramView.lY(false);
        }
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(2403168419840L, 17905);
    GMTrace.o(2403168419840L, 17905);
    return 75;
  }
  
  public final void lZ(boolean paramBoolean)
  {
    GMTrace.i(2402497331200L, 17900);
    this.wzD = paramBoolean;
    if (!paramBoolean) {
      this.wzF = false;
    }
    if ((!paramBoolean) && (this.wzE))
    {
      a(null, null);
      this.wzE = false;
    }
    GMTrace.o(2402497331200L, 17900);
  }
  
  public final int m(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(2401826242560L, 17895);
    com.tencent.mm.y.at.AR();
    com.tencent.mm.storage.au localau = com.tencent.mm.y.c.yM().cM(paramLong);
    if (localau.field_msgId != paramLong)
    {
      w.w("MicroMsg.ChattingListAdapter", "get msg info by id %d error", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(2401826242560L, 17895);
      return 0;
    }
    long l = localau.field_createTime;
    int i;
    if ((l < this.wzl) || (l > this.wzm))
    {
      this.wzl = l;
      this.wzn = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Cv(this.eDs);
      if (paramBoolean)
      {
        this.wzm = this.wzn;
        this.wzs = true;
        com.tencent.mm.y.at.AR();
        i = com.tencent.mm.y.c.yM().k(this.eDs, this.wzl, this.wzm);
        w.v("MicroMsg.ChattingListAdapter", "reset position, reload count %d", new Object[] { Integer.valueOf(i) });
        if (i >= 18) {
          break label396;
        }
        w.d("MicroMsg.ChattingListAdapter", "reload count less than on scene, bottom not more data, try up to load more data, and reset selection, old top msg create time %d, old selection %d", new Object[] { Long.valueOf(this.wzl), Integer.valueOf(0) });
        com.tencent.mm.y.at.AR();
        this.wzl = com.tencent.mm.y.c.yM().N(this.eDs, this.wzl);
        com.tencent.mm.y.at.AR();
        i = com.tencent.mm.y.c.yM().k(this.eDs, this.wzl, l);
      }
    }
    for (;;)
    {
      w.v("MicroMsg.ChattingListAdapter", "set local message id, id[%d] top create time[%d] bottom create time[%d] last create time[%d] selection[%d]", new Object[] { Long.valueOf(paramLong), Long.valueOf(this.wzl), Long.valueOf(this.wzm), Long.valueOf(this.wzn), Integer.valueOf(i) });
      GMTrace.o(2401826242560L, 17895);
      return i;
      com.tencent.mm.y.at.AR();
      this.wzm = com.tencent.mm.y.c.yM().O(this.eDs, l);
      break;
      com.tencent.mm.y.at.AR();
      i = com.tencent.mm.y.c.yM().k(this.eDs, this.wzl, l);
      continue;
      label396:
      i = 0;
    }
  }
  
  final class a
    implements View.OnClickListener
  {
    a()
    {
      GMTrace.i(2155134058496L, 16057);
      GMTrace.o(2155134058496L, 16057);
    }
    
    private static boolean eY(long paramLong)
    {
      GMTrace.i(2155402493952L, 16059);
      apv localapv = com.tencent.mm.at.b.JS();
      if ((localapv != null) && (localapv.ucY != null) && (localapv.uFq == 0) && (com.tencent.mm.at.b.JQ())) {
        try
        {
          long l = Long.parseLong(localapv.ucY);
          if (paramLong == l)
          {
            GMTrace.o(2155402493952L, 16059);
            return true;
          }
        }
        catch (Exception localException)
        {
          GMTrace.o(2155402493952L, 16059);
          return false;
        }
      }
      GMTrace.o(2155402493952L, 16059);
      return false;
    }
    
    public final void onClick(View paramView)
    {
      int j = 0;
      GMTrace.i(2155268276224L, 16058);
      long l1;
      com.tencent.mm.storage.au localau;
      int i;
      if ((paramView.getTag() instanceof cv.b))
      {
        paramView = (cv.b)paramView.getTag();
        l1 = paramView.eDr;
        com.tencent.mm.y.at.AR();
        localau = com.tencent.mm.y.c.yM().cM(paramView.eDr);
        if (!eY(l1)) {
          break label144;
        }
        com.tencent.mm.plugin.report.service.g.ork.A(10231, "1");
        com.tencent.mm.at.b.JO();
        if (localau.field_msgId == l1)
        {
          paramView = com.tencent.mm.modelstat.b.gWv;
          i = com.tencent.mm.x.g.g(localau);
          if (paramView.Mg()) {
            if (j == 0) {
              break label259;
            }
          }
        }
      }
      label144:
      label259:
      for (Object localObject = b.b.gWQ;; localObject = b.b.gWR)
      {
        paramView.a(localau, (b.b)localObject, i);
        do
        {
          cv.this.wve.wvd.notifyDataSetChanged();
          GMTrace.o(2155268276224L, 16058);
          return;
          localObject = f.a.eS(paramView.ePi);
          if (localObject != null)
          {
            com.tencent.mm.plugin.report.service.g.ork.A(10090, "0,1");
            com.tencent.mm.at.a.a locala = (com.tencent.mm.at.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.at.a.a.class);
            long l2 = paramView.eDr;
            String str = paramView.eMk;
            com.tencent.mm.y.at.AR();
            com.tencent.mm.at.b.b(locala.a((f.a)localObject, String.valueOf(l2), str, com.tencent.mm.y.c.zo(), paramView.eMk));
          }
        } while (localau.field_msgId != l1);
        paramView = com.tencent.mm.modelstat.b.gWv;
        if (localObject != null)
        {
          i = ((f.a)localObject).type;
          j = 1;
          break;
        }
        i = 0;
        j = 1;
        break;
      }
    }
  }
  
  static final class b
  {
    public long eDr;
    public String eMk;
    public String ePi;
    
    b()
    {
      GMTrace.i(2204794617856L, 16427);
      GMTrace.o(2204794617856L, 16427);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */