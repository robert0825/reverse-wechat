package com.tencent.mm.plugin.sns.storage;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a
{
  public static int pBX;
  public static int pBY;
  public String ePi;
  public String hTy;
  public int pBZ;
  public long pCa;
  public long pCb;
  public int pCc;
  public String pCd;
  public String pCe;
  public String pCf;
  public String pCg;
  public int pCh;
  public String pCi;
  public String pCj;
  public String pCk;
  public int pCl;
  public String pCm;
  public String pCn;
  public LinkedList<String> pCo;
  boolean pCp;
  public String pCq;
  public String pCr;
  public HashMap<String, String> pCs;
  public a pCt;
  public b pCu;
  public String pCv;
  public String pCw;
  public String pCx;
  public String pyc;
  
  static
  {
    GMTrace.i(8303916613632L, 61869);
    pBX = 0;
    pBY = 1;
    GMTrace.o(8303916613632L, 61869);
  }
  
  public a()
  {
    GMTrace.i(8303513960448L, 61866);
    this.ePi = "";
    this.pyc = "";
    this.pCc = 0;
    this.pCd = "";
    this.pCe = "";
    this.pCf = "";
    this.pCg = "";
    this.pCh = 0;
    this.pCi = "";
    this.pCj = "";
    this.pCk = "";
    this.pCl = pBX;
    this.pCm = "";
    this.pCn = "";
    this.pCo = new LinkedList();
    this.pCu = new b();
    this.pCv = "";
    this.pCw = "";
    this.pCx = "";
    GMTrace.o(8303513960448L, 61866);
  }
  
  public a(String paramString)
  {
    GMTrace.i(8303648178176L, 61867);
    this.ePi = "";
    this.pyc = "";
    this.pCc = 0;
    this.pCd = "";
    this.pCe = "";
    this.pCf = "";
    this.pCg = "";
    this.pCh = 0;
    this.pCi = "";
    this.pCj = "";
    this.pCk = "";
    this.pCl = pBX;
    this.pCm = "";
    this.pCn = "";
    this.pCo = new LinkedList();
    this.pCu = new b();
    this.pCv = "";
    this.pCw = "";
    this.pCx = "";
    this.pCp = false;
    Ie(paramString);
    GMTrace.o(8303648178176L, 61867);
  }
  
  private void Ie(String paramString)
  {
    int j = 0;
    GMTrace.i(8303782395904L, 61868);
    if (bg.nm(paramString))
    {
      GMTrace.o(8303782395904L, 61868);
      return;
    }
    w.i("MicroMsg.ADInfo", "feed xml %s", new Object[] { paramString });
    Map localMap = bh.q(paramString, "ADInfo");
    if (localMap == null)
    {
      GMTrace.o(8303782395904L, 61868);
      return;
    }
    this.hTy = bg.aq((String)localMap.get(".ADInfo.viewid"), "");
    if (localMap.get(".ADInfo.ad_sns_pos") == null)
    {
      GMTrace.o(8303782395904L, 61868);
      return;
    }
    this.pBZ = bg.Sy((String)localMap.get(".ADInfo.ad_sns_pos"));
    this.pCa = bg.Sz((String)localMap.get(".ADInfo.noExposureExpireTime"));
    this.pCb = bg.Sz((String)localMap.get(".ADInfo.exposureNoActionExpireTime"));
    this.pyc = bg.aq((String)localMap.get(".ADInfo.uxInfo"), "");
    this.pCc = bg.Sy((String)localMap.get(".ADInfo.adActionType"));
    this.pCd = bg.aq((String)localMap.get(".ADInfo.adActionCardTitle"), "");
    this.pCe = bg.aq((String)localMap.get(".ADInfo.adActionCardTpId"), "");
    this.pCf = bg.aq((String)localMap.get(".ADInfo.adActionCardExt"), "");
    this.pCg = bg.aq((String)localMap.get(".ADInfo.adActionLink"), "");
    this.pCh = bg.Sy((String)localMap.get(".ADInfo.adActionExt.adActionExtPOI.POIType"));
    this.pCi = bg.aq((String)localMap.get(".ADInfo.adActionExt.adActionExtPOI.POIId"), "");
    this.pCj = bg.aq((String)localMap.get(".ADInfo.adActionExt.adActionExtPOI.POIName"), "");
    this.pCk = bg.aq((String)localMap.get(".ADInfo.adActionExt.adActionExtPOI.POILink"), "");
    String str1 = bg.aq((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.Wording"), "");
    this.pCl = bg.Sy((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.WordingType"));
    int i;
    if (this.pCl == pBY)
    {
      this.pCn = bg.aq((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.WordingLink"), "");
      String str2 = bg.aq((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.WordingRepAndroid"), "");
      this.pCo.clear();
      i = 0;
      if (i == 0) {}
      for (paramString = bg.aq((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.UserNameList.UserName"), "");; paramString = bg.aq((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.UserNameList.UserName" + i), ""))
      {
        if (bg.nm(paramString)) {
          break label550;
        }
        this.pCo.add(paramString);
        i = i + 1 + 1;
        break;
      }
      label550:
      if (str2.indexOf("%s") >= 0)
      {
        i = 1;
        int k = str2.indexOf("%");
        int m = str2.lastIndexOf("%");
        if ((bg.nm(str2)) || (i == 0) || (k != m)) {
          break label767;
        }
        this.pCm = str2;
        label605:
        this.pCp = localMap.containsKey(".ADInfo.adCanvasInfo");
        this.pCr = ((String)localMap.get(".ADInfo.session_data.aid"));
        this.pCq = ((String)localMap.get(".ADInfo.session_data.trace_id"));
        this.pCs = new HashMap();
        i = j;
        label665:
        if (i != 0) {
          break label799;
        }
      }
    }
    label767:
    label799:
    for (paramString = ".ADInfo.adCanvasExt.adCardItemList.cardItem";; paramString = ".ADInfo.adCanvasExt.adCardItemList.cardItem" + i)
    {
      str1 = (String)localMap.get(paramString + ".cardTpId");
      paramString = (String)localMap.get(paramString + ".cardExt");
      if (bg.nm(str1)) {
        break label823;
      }
      this.pCs.put(str1, paramString);
      i += 1;
      break label665;
      i = 0;
      break;
      this.pCm = str1;
      this.pCl = pBX;
      break label605;
      this.pCm = str1;
      this.pCl = pBX;
      break label605;
    }
    label823:
    paramString = (String)localMap.get(".ADInfo.adActionExt.adActionExtWeApp.appUserName");
    if (!TextUtils.isEmpty(paramString))
    {
      this.pCt = new a();
      this.pCt.eIH = paramString;
      this.pCt.aKw = ((String)localMap.get(".ADInfo.adActionExt.adActionExtWeApp.appVersion"));
      this.pCt.eAw = ((String)localMap.get(".ADInfo.adActionExt.adActionExtWeApp.relativePagePath"));
    }
    this.pCu = new b(localMap, ".ADInfo");
    this.pCv = bg.aq((String)localMap.get(".ADInfo.dislikeInfo.Title.zh"), "");
    this.pCx = bg.aq((String)localMap.get(".ADInfo.dislikeInfo.Title.tw"), "");
    this.pCw = bg.aq((String)localMap.get(".ADInfo.dislikeInfo.Title.en"), "");
    GMTrace.o(8303782395904L, 61868);
  }
  
  public static final class a
  {
    public String aKw;
    public String eAw;
    public String eIH;
    
    public a()
    {
      GMTrace.i(14313783820288L, 106646);
      GMTrace.o(14313783820288L, 106646);
    }
  }
  
  public static final class b
  {
    private List<a> pCy;
    public Map<String, List<a>> pCz;
    
    public b()
    {
      GMTrace.i(20834483699712L, 155229);
      this.pCy = new ArrayList();
      this.pCz = new HashMap();
      GMTrace.o(20834483699712L, 155229);
    }
    
    public b(Map<String, String> paramMap, String paramString)
    {
      GMTrace.i(20834617917440L, 155230);
      this.pCy = new ArrayList();
      this.pCz = new HashMap();
      String str = paramString + ".dislikeInfo.ReasonList";
      int i = 0;
      paramString = str + ".Reason";
      if (i > 0) {
        paramString = paramString + i;
      }
      for (;;)
      {
        if (paramMap.get(paramString + ".ReasonId") != null)
        {
          this.pCy.add(new a(bg.aq((String)paramMap.get(paramString + ".Wording.zh"), ""), bg.aq((String)paramMap.get(paramString + ".Wording.tw"), ""), bg.aq((String)paramMap.get(paramString + ".Wording.en"), ""), bg.Sy((String)paramMap.get(paramString + ".ReasonId"))));
          i += 1;
          break;
        }
        GMTrace.o(20834617917440L, 155230);
        return;
      }
    }
    
    public final List<a> bjZ()
    {
      GMTrace.i(20834349481984L, 155228);
      Object localObject = v.eq(ab.getContext());
      if ((!"zh_CN".equals(localObject)) && (!"zh_TW".equals(localObject)) && (!"zh_HK".equals(localObject))) {
        localObject = "en";
      }
      for (;;)
      {
        if (!this.pCz.containsKey(localObject))
        {
          ArrayList localArrayList = new ArrayList();
          Iterator localIterator = this.pCy.iterator();
          while (localIterator.hasNext())
          {
            a locala = (a)localIterator.next();
            if (("zh_CN".equals(localObject)) && (!bg.nm(locala.pCB))) {
              localArrayList.add(locala);
            } else if ((("zh_TW".equals(localObject)) || ("zh_HK".equals(localObject))) && (!bg.nm(locala.pCC))) {
              localArrayList.add(locala);
            } else if (("en".equals(localObject)) && (!bg.nm(locala.pCD))) {
              localArrayList.add(locala);
            }
          }
          this.pCz.put(localObject, localArrayList);
        }
        localObject = (List)this.pCz.get(localObject);
        GMTrace.o(20834349481984L, 155228);
        return (List<a>)localObject;
      }
    }
    
    public static final class a
    {
      public static int pCA;
      public String pCB;
      public String pCC;
      public String pCD;
      public int pCE;
      public long pCF;
      public long ppa;
      
      static
      {
        GMTrace.i(20838912884736L, 155262);
        pCA = 101;
        GMTrace.o(20838912884736L, 155262);
      }
      
      public a()
      {
        GMTrace.i(20838778667008L, 155261);
        this.pCB = "";
        this.pCC = "";
        this.pCD = "";
        this.pCE = 0;
        this.ppa = 0L;
        this.pCF = 0L;
        GMTrace.o(20838778667008L, 155261);
      }
      
      public a(String paramString1, String paramString2, String paramString3, int paramInt)
      {
        GMTrace.i(20838644449280L, 155260);
        this.pCB = "";
        this.pCC = "";
        this.pCD = "";
        this.pCE = 0;
        this.ppa = 0L;
        this.pCF = 0L;
        this.pCB = paramString1;
        this.pCC = paramString2;
        this.pCD = paramString3;
        this.pCE = paramInt;
        GMTrace.o(20838644449280L, 155260);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */