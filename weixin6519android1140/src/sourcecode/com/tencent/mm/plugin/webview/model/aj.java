package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.plugin.webview.ui.tools.a;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class aj
{
  public static int lIF;
  public static int rEZ;
  public l rEN;
  public j rEO;
  public k rEP;
  public i rEQ;
  public e rER;
  public a rES;
  public f rET;
  public c rEU;
  private d rEV;
  private h rEW;
  private g rEX;
  private b rEY;
  
  static
  {
    GMTrace.i(12016378970112L, 89529);
    lIF = 0;
    rEZ = 0;
    GMTrace.o(12016378970112L, 89529);
  }
  
  public aj()
  {
    GMTrace.i(12014097268736L, 89512);
    GMTrace.o(12014097268736L, 89512);
  }
  
  public static void A(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(12015842099200L, 89525);
    if (paramBoolean1) {}
    for (lIF = 1; paramBoolean2; lIF = 0)
    {
      rEZ = 1;
      GMTrace.o(12015842099200L, 89525);
      return;
    }
    rEZ = 0;
    GMTrace.o(12015842099200L, 89525);
  }
  
  public static void a(com.tencent.mm.plugin.webview.stub.d paramd, String paramString, Object... paramVarArgs)
  {
    GMTrace.i(21050574241792L, 156839);
    if (paramd == null)
    {
      GMTrace.o(21050574241792L, 156839);
      return;
    }
    com.tencent.mm.plugin.webview.ui.tools.d.a(paramd, 11215, paramVarArgs);
    if ((paramString != null) && (paramString.startsWith("official_mall"))) {
      com.tencent.mm.plugin.webview.ui.tools.d.a(paramd, 14919, paramVarArgs);
    }
    GMTrace.o(21050574241792L, 156839);
  }
  
  public static int bCs()
  {
    GMTrace.i(12013828833280L, 89510);
    switch (am.getNetType(ab.getContext()))
    {
    case 9: 
    default: 
      GMTrace.o(12013828833280L, 89510);
      return 6;
    case -1: 
      GMTrace.o(12013828833280L, 89510);
      return 255;
    case 0: 
      GMTrace.o(12013828833280L, 89510);
      return 1;
    case 3: 
    case 4: 
      GMTrace.o(12013828833280L, 89510);
      return 4;
    case 2: 
    case 5: 
    case 7: 
      GMTrace.o(12013828833280L, 89510);
      return 2;
    case 1: 
    case 6: 
    case 8: 
      GMTrace.o(12013828833280L, 89510);
      return 3;
    }
    GMTrace.o(12013828833280L, 89510);
    return 5;
  }
  
  public static String bCt()
  {
    GMTrace.i(12013963051008L, 89511);
    Object localObject = (ConnectivityManager)ab.getContext().getSystemService("connectivity");
    if (localObject == null)
    {
      GMTrace.o(12013963051008L, 89511);
      return "no";
    }
    localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    if (localObject == null)
    {
      GMTrace.o(12013963051008L, 89511);
      return "no";
    }
    if (((NetworkInfo)localObject).getType() == 1)
    {
      GMTrace.o(12013963051008L, 89511);
      return "WIFI";
    }
    w.d("MicroMsg.WebviewReporter", "activeNetInfo extra=%s, type=%d, %s", new Object[] { ((NetworkInfo)localObject).getExtraInfo(), Integer.valueOf(((NetworkInfo)localObject).getType()), ((NetworkInfo)localObject).getExtraInfo() });
    if (((NetworkInfo)localObject).getExtraInfo() != null)
    {
      localObject = ((NetworkInfo)localObject).getExtraInfo().toLowerCase();
      GMTrace.o(12013963051008L, 89511);
      return (String)localObject;
    }
    GMTrace.o(12013963051008L, 89511);
    return "no";
  }
  
  public final void b(com.tencent.mm.plugin.webview.stub.d paramd)
  {
    GMTrace.i(12015976316928L, 89526);
    Object localObject3 = bCw();
    Object localObject4;
    Object localObject1;
    if (paramd != null)
    {
      i = bCs();
      localObject4 = ((k)localObject3).rFv.entrySet().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject1 = (Map.Entry)((Iterator)localObject4).next();
        localObject2 = (String)((Map.Entry)localObject1).getKey();
        l1 = ((Long)((Map.Entry)localObject1).getValue()).longValue();
        g.ork.a(32L, 0L, 1L, true);
        if ((l1 >= 0L) && (l1 <= 180000L))
        {
          localObject5 = ((k)localObject3).rFi;
          if (localObject2 == null) {}
          for (localObject1 = localObject2;; localObject1 = ((String)localObject2).replace(",", "!"))
          {
            a(paramd, (String)localObject5, new Object[] { Integer.valueOf(3), Long.valueOf(l1), Integer.valueOf(i), localObject1, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(lIF), Integer.valueOf(rEZ), Integer.valueOf(((k)localObject3).eZk), ((k)localObject3).rFi });
            g.ork.a(160L, 0L, 1L, false);
            if (-1 != a.em(l1)) {
              g.ork.a(160L, a.em(l1), 1L, false);
            }
            g.ork.a(32L, 3L, 1L, true);
            g.ork.a(32L, 7L, l1, true);
            if (rEZ == 1)
            {
              g.ork.a(32L, 16L, 1L, true);
              g.ork.a(32L, 17L, l1, true);
            }
            w.i("MicroMsg.WebviewReporter", "WebviewOpenUrlReporter.report url : %s, cost time : %d, netType : %d, %d, %d, getA8KeyScene:%d, prePublishid:%s", new Object[] { localObject2, Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(lIF), Integer.valueOf(rEZ), Integer.valueOf(((k)localObject3).eZk), ((k)localObject3).rFi });
            break;
          }
        }
      }
    }
    Object localObject5 = bCy();
    if (!bg.nm(((i)localObject5).rFm)) {
      w.d("MicroMsg.WebviewReporter", "WebViewVisitReporter report viewID = %s", new Object[] { ((i)localObject5).rFm });
    }
    if (paramd != null) {
      localObject1 = "";
    }
    try
    {
      localObject2 = paramd.d(23, new Bundle(0));
      if (localObject2 != null) {
        localObject1 = ((Bundle)localObject2).getString("config_info_username");
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        PString localPString;
        String str3;
        w.w("MicroMsg.WebviewReporter", "invokeAsResult error, %s", new Object[] { localRemoteException });
        str1 = "";
      }
    }
    localPString = new PString();
    str3 = ((i)h.h(i.class)).a(((i)localObject5).pTh, localPString);
    w.d("MicroMsg.WebviewReporter", "report 10643(%s), username : %s, msgId : %s, msgIndex : %s, scene : %s, enterTime : %s, stayTime : %s, rawUrl : %s, publisher : %s, viewId : %s, publishId : %s,appId : %s, newMsgId : %s, preUsername : %s, curUsername : %s, referUrl : %s, statExtStr:%s(%s), chatType:%d, title:%s, expidstr[chatting_exp]:%s, sourceAppId:%s", new Object[] { Integer.valueOf(10643), ((i)localObject5).username, Long.valueOf(((i)localObject5).rFn), Integer.valueOf(((i)localObject5).rFo), Integer.valueOf(((i)localObject5).scene), Long.valueOf(((i)localObject5).fKc), Long.valueOf(((i)localObject5).iyB), ((i)localObject5).eVw, ((i)localObject5).rFl, ((i)localObject5).rFm, ((i)localObject5).lHK, ((i)localObject5).appId, ((i)localObject5).rFp, ((i)localObject5).rFq, localObject1, ((i)localObject5).rFr, ((i)localObject5).pTh, str3, Integer.valueOf(((i)localObject5).rFs), ((i)localObject5).title, ((i)localObject5).fwE, localPString.value });
    Object localObject2 = ((i)localObject5).title;
    try
    {
      localObject3 = URLEncoder.encode(((i)localObject5).title, "UTF-8");
      localObject2 = localObject3;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str4;
        int j;
        long l2;
        long l3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        w.printErrStackTrace("MicroMsg.WebviewReporter", localException, "", new Object[0]);
        continue;
        String str2 = ((i)localObject5).eVw.replace(",", "!");
        continue;
        localObject4 = ((i)localObject5).rFr.replace(",", "!");
      }
      com.tencent.mm.plugin.webview.ui.tools.d.a(paramd, 11575, new Object[] { str1.eVw, Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(i) });
      GMTrace.o(12015976316928L, 89526);
      return;
    }
    str4 = ((i)localObject5).username;
    long l1 = ((i)localObject5).rFn;
    int i = ((i)localObject5).rFo;
    j = ((i)localObject5).scene;
    l2 = ((i)localObject5).fKc;
    l3 = ((i)localObject5).iyB;
    if (((i)localObject5).eVw == null)
    {
      localObject3 = ((i)localObject5).eVw;
      str5 = ((i)localObject5).rFl;
      str6 = ((i)localObject5).rFm;
      str7 = ((i)localObject5).lHK;
      str8 = ((i)localObject5).appId;
      str9 = ((i)localObject5).rFp;
      str10 = ((i)localObject5).rFq;
      if (((i)localObject5).rFr != null) {
        break label1200;
      }
      localObject4 = ((i)localObject5).rFr;
      com.tencent.mm.plugin.webview.ui.tools.d.a(paramd, 10643, new Object[] { str4, Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(l2), Long.valueOf(l3), localObject3, str5, str6, str7, str8, str9, str10, localObject1, localObject4, str3, Integer.valueOf(((i)localObject5).rFs), localObject2, ((i)localObject5).fwE, localPString.value });
      bCv().b(paramd);
      bCx().b(paramd);
      localObject1 = bCA();
      if (paramd == null) {
        break label1308;
      }
      i = bCs();
      if (!((a)localObject1).rFb) {
        break label1268;
      }
      if (!((a)localObject1).rFa) {
        break label1219;
      }
      com.tencent.mm.plugin.webview.ui.tools.d.a(paramd, 11575, new Object[] { ((a)localObject1).eVw, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(i) });
      GMTrace.o(12015976316928L, 89526);
    }
    String str1;
    label1200:
    label1219:
    label1268:
    com.tencent.mm.plugin.webview.ui.tools.d.a(paramd, 11575, new Object[] { str1.eVw, Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(i) });
    label1308:
    GMTrace.o(12015976316928L, 89526);
  }
  
  public final a bCA()
  {
    GMTrace.i(12015036792832L, 89519);
    if (this.rES == null) {
      this.rES = new a();
    }
    a locala = this.rES;
    GMTrace.o(12015036792832L, 89519);
    return locala;
  }
  
  public final f bCB()
  {
    GMTrace.i(12015171010560L, 89520);
    if (this.rET == null) {
      this.rET = new f();
    }
    f localf = this.rET;
    GMTrace.o(12015171010560L, 89520);
    return localf;
  }
  
  public final c bCC()
  {
    GMTrace.i(12015305228288L, 89521);
    if (this.rEU == null) {
      this.rEU = new c();
    }
    c localc = this.rEU;
    GMTrace.o(12015305228288L, 89521);
    return localc;
  }
  
  public final h bCD()
  {
    GMTrace.i(12015439446016L, 89522);
    if (this.rEW == null) {
      this.rEW = new h();
    }
    h localh = this.rEW;
    GMTrace.o(12015439446016L, 89522);
    return localh;
  }
  
  public final g bCE()
  {
    GMTrace.i(12015573663744L, 89523);
    if (this.rEX == null) {
      this.rEX = new g();
    }
    g localg = this.rEX;
    GMTrace.o(12015573663744L, 89523);
    return localg;
  }
  
  public final b bCF()
  {
    GMTrace.i(12015707881472L, 89524);
    if (this.rEY == null) {
      this.rEY = new b();
    }
    b localb = this.rEY;
    GMTrace.o(12015707881472L, 89524);
    return localb;
  }
  
  public final l bCu()
  {
    GMTrace.i(12014231486464L, 89513);
    if (this.rEN == null) {
      this.rEN = new l();
    }
    l locall = this.rEN;
    GMTrace.o(12014231486464L, 89513);
    return locall;
  }
  
  public final j bCv()
  {
    GMTrace.i(12014365704192L, 89514);
    if (this.rEO == null) {
      this.rEO = new j();
    }
    j localj = this.rEO;
    GMTrace.o(12014365704192L, 89514);
    return localj;
  }
  
  public final k bCw()
  {
    GMTrace.i(12014499921920L, 89515);
    if (this.rEP == null) {
      this.rEP = new k();
    }
    k localk = this.rEP;
    GMTrace.o(12014499921920L, 89515);
    return localk;
  }
  
  public final d bCx()
  {
    GMTrace.i(12014634139648L, 89516);
    if (this.rEV == null) {
      this.rEV = new d();
    }
    d locald = this.rEV;
    GMTrace.o(12014634139648L, 89516);
    return locald;
  }
  
  public final i bCy()
  {
    GMTrace.i(12014768357376L, 89517);
    if (this.rEQ == null) {
      this.rEQ = new i();
    }
    i locali = this.rEQ;
    GMTrace.o(12014768357376L, 89517);
    return locali;
  }
  
  public final e bCz()
  {
    GMTrace.i(12014902575104L, 89518);
    if (this.rER == null) {
      this.rER = new e();
    }
    e locale = this.rER;
    GMTrace.o(12014902575104L, 89518);
    return locale;
  }
  
  public static final class a
  {
    public String eVw;
    public boolean rFa;
    public boolean rFb;
    
    public a()
    {
      GMTrace.i(12003762503680L, 89435);
      this.rFa = false;
      this.rFb = false;
      GMTrace.o(12003762503680L, 89435);
    }
  }
  
  public static final class b
  {
    public boolean rFc;
    public boolean rFd;
    
    public b()
    {
      GMTrace.i(11997320052736L, 89387);
      this.rFc = false;
      this.rFd = false;
      GMTrace.o(11997320052736L, 89387);
    }
  }
  
  public static final class c
  {
    public Object[] rFe;
    
    public c()
    {
      GMTrace.i(12011144478720L, 89490);
      this.rFe = null;
      GMTrace.o(12011144478720L, 89490);
    }
    
    public final void b(com.tencent.mm.plugin.webview.stub.d paramd)
    {
      GMTrace.i(12011278696448L, 89491);
      if (paramd != null) {
        com.tencent.mm.plugin.webview.ui.tools.d.a(paramd, 11577, this.rFe);
      }
      GMTrace.o(12011278696448L, 89491);
    }
  }
  
  public final class d
  {
    public int eZk;
    public String lHJ;
    public HashMap<String, Long> rFf;
    public HashMap<String, Long> rFg;
    public boolean rFh;
    public String rFi;
    
    public d()
    {
      GMTrace.i(12008460124160L, 89470);
      this.lHJ = "";
      this.rFh = true;
      this.rFf = new HashMap();
      this.rFg = new HashMap();
      GMTrace.o(12008460124160L, 89470);
    }
    
    public final void b(com.tencent.mm.plugin.webview.stub.d paramd)
    {
      GMTrace.i(12008594341888L, 89471);
      if (paramd != null)
      {
        int i = aj.bCs();
        Iterator localIterator = this.rFf.entrySet().iterator();
        Object localObject;
        String str;
        long l;
        if (localIterator.hasNext())
        {
          localObject = (Map.Entry)localIterator.next();
          str = (String)((Map.Entry)localObject).getKey();
          l = ((Long)((Map.Entry)localObject).getValue()).longValue();
          if ((l < 0L) || (l > 180000L))
          {
            GMTrace.o(12008594341888L, 89471);
            return;
          }
          localObject = this.rFi;
          if (str == null) {}
          for (;;)
          {
            aj.a(paramd, (String)localObject, new Object[] { Integer.valueOf(5), Long.valueOf(l), Integer.valueOf(i), str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aj.lIF), Integer.valueOf(aj.rEZ), Integer.valueOf(this.eZk), this.rFi });
            if (aj.lIF == 1)
            {
              g.ork.a(32L, 18L, 1L, true);
              g.ork.a(32L, 19L, l, true);
            }
            g.ork.a(32L, 8L, 1L, true);
            g.ork.a(32L, 9L, l, true);
            w.i("MicroMsg.WebviewReporter", "WebViewRenderReporter.report DomReady cost time : %d, netType : %d, coreType %d, httpType %d, getA8KeyScene:%d, prePublishid:%s", new Object[] { Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(aj.lIF), Integer.valueOf(aj.rEZ), Integer.valueOf(this.eZk), this.rFi });
            break;
            str = str.replace(",", "!");
          }
        }
        localIterator = this.rFg.entrySet().iterator();
        if (localIterator.hasNext())
        {
          localObject = (Map.Entry)localIterator.next();
          str = (String)((Map.Entry)localObject).getKey();
          l = ((Long)((Map.Entry)localObject).getValue()).longValue();
          if ((l < 0L) || (l > 180000L))
          {
            GMTrace.o(12008594341888L, 89471);
            return;
          }
          localObject = this.rFi;
          if (str == null) {}
          for (;;)
          {
            aj.a(paramd, (String)localObject, new Object[] { Integer.valueOf(6), Long.valueOf(l), Integer.valueOf(i), str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aj.lIF), Integer.valueOf(aj.rEZ), Integer.valueOf(this.eZk), this.rFi });
            if (aj.lIF == 1)
            {
              g.ork.a(32L, 20L, 1L, true);
              g.ork.a(32L, 21L, l, true);
            }
            g.ork.a(32L, 10L, 1L, true);
            g.ork.a(32L, 11L, l, true);
            w.i("MicroMsg.WebviewReporter", "WebViewRenderReporter.report Render cost time : %d, netType : %d, coreType %d, httpType %d, getA8KeyScene:%d, prePublishid:%s", new Object[] { Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(aj.lIF), Integer.valueOf(aj.rEZ), Integer.valueOf(this.eZk), this.rFi });
            break;
            str = str.replace(",", "!");
          }
        }
      }
      GMTrace.o(12008594341888L, 89471);
    }
  }
  
  public final class e
  {
    public int eZk;
    public boolean juz;
    public String rFi;
    public long startTime;
    public String url;
    
    public e()
    {
      GMTrace.i(12004433592320L, 89440);
      this.juz = false;
      this.startTime = bg.Pv();
      GMTrace.o(12004433592320L, 89440);
    }
  }
  
  public static final class f
  {
    public Object[] rFe;
    
    public f()
    {
      GMTrace.i(11996514746368L, 89381);
      this.rFe = null;
      GMTrace.o(11996514746368L, 89381);
    }
    
    public final void b(com.tencent.mm.plugin.webview.stub.d paramd)
    {
      GMTrace.i(11996648964096L, 89382);
      if (paramd != null) {
        com.tencent.mm.plugin.webview.ui.tools.d.a(paramd, 11576, this.rFe);
      }
      GMTrace.o(11996648964096L, 89382);
    }
  }
  
  public static final class g
  {
    public List<String> rFk;
    
    public g()
    {
      GMTrace.i(12003896721408L, 89436);
      GMTrace.o(12003896721408L, 89436);
    }
  }
  
  public static final class h
  {
    public List<String> rFk;
    
    public h()
    {
      GMTrace.i(12002286108672L, 89424);
      GMTrace.o(12002286108672L, 89424);
    }
  }
  
  public static final class i
  {
    public String appId;
    public String eVw;
    long fKc;
    public String fwE;
    public long iyB;
    public String lHK;
    public String pTh;
    public String rFl;
    public String rFm;
    public long rFn;
    public int rFo;
    public String rFp;
    public String rFq;
    public String rFr;
    public int rFs;
    public long rFt;
    public int scene;
    public String title;
    public String username;
    
    public i()
    {
      GMTrace.i(12007386382336L, 89462);
      this.rFt = -1L;
      this.fKc = (System.currentTimeMillis() / 1000L);
      GMTrace.o(12007386382336L, 89462);
    }
  }
  
  public final class j
  {
    public int eZk;
    public String rFi;
    public HashMap<String, Long> rFu;
    
    public j()
    {
      GMTrace.i(12002688761856L, 89427);
      this.rFu = new HashMap();
      GMTrace.o(12002688761856L, 89427);
    }
    
    public final void aE(String paramString, boolean paramBoolean)
    {
      GMTrace.i(12002822979584L, 89428);
      if (bg.nm(paramString))
      {
        w.e("MicroMsg.WebviewReporter", "WebviewOpenUrl.stopLoadUrl failed, url is null");
        GMTrace.o(12002822979584L, 89428);
        return;
      }
      if (this.rFu.containsKey(paramString))
      {
        if (paramBoolean)
        {
          long l1 = ((Long)this.rFu.get(paramString)).longValue();
          long l2 = bg.Pv();
          this.rFu.put(paramString, Long.valueOf(l2 - l1));
          GMTrace.o(12002822979584L, 89428);
          return;
        }
        this.rFu.put(paramString, Long.valueOf(-1L));
      }
      GMTrace.o(12002822979584L, 89428);
    }
    
    public final void b(com.tencent.mm.plugin.webview.stub.d paramd)
    {
      GMTrace.i(12002957197312L, 89429);
      if (paramd == null)
      {
        GMTrace.o(12002957197312L, 89429);
        return;
      }
      int i = aj.bCs();
      Iterator localIterator = this.rFu.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (Map.Entry)localIterator.next();
        String str1 = (String)((Map.Entry)localObject).getKey();
        long l = ((Long)((Map.Entry)localObject).getValue()).longValue();
        g.ork.a(32L, 2L, 1L, true);
        if (l == -1L)
        {
          g.ork.a(32L, 13L, 1L, true);
          w.i("MicroMsg.WebviewReporter", "WebviewGetA8keyReporter.report fail url : %s, netType : %d", new Object[] { str1, Integer.valueOf(i) });
        }
        if ((l >= 0L) && (l <= 60000L))
        {
          String str2 = this.rFi;
          if (str1 == null) {}
          for (localObject = str1;; localObject = str1.replace(",", "!"))
          {
            aj.a(paramd, str2, new Object[] { Integer.valueOf(2), Long.valueOf(l), Integer.valueOf(i), localObject, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aj.lIF), Integer.valueOf(aj.rEZ), Integer.valueOf(this.eZk), this.rFi });
            w.i("MicroMsg.WebviewReporter", "WebviewGetA8keyReporter.report url : %s, cost time : %d, netType : %d, getA8KeyScene:%d, prePublishid:%s", new Object[] { str1, Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(this.eZk), this.rFi });
            g.ork.a(32L, 6L, l, true);
            break;
          }
        }
      }
      GMTrace.o(12002957197312L, 89429);
    }
  }
  
  public final class k
  {
    public int eZk;
    public String rFi;
    public HashMap<String, Long> rFv;
    
    public k()
    {
      GMTrace.i(12020673937408L, 89561);
      this.rFv = new HashMap();
      GMTrace.o(12020673937408L, 89561);
    }
  }
  
  public final class l
  {
    public boolean eFN;
    public int eZk;
    public long iyA;
    public String rFi;
    public String url;
    
    public l()
    {
      GMTrace.i(11994635698176L, 89367);
      this.eFN = true;
      GMTrace.o(11994635698176L, 89367);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */