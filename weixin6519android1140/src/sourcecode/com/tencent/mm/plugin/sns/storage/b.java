package com.tencent.mm.plugin.sns.storage;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.c.f;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  public static String pDf;
  public String eCQ;
  public String ePi;
  public int gVx;
  public String pCG;
  public int pCH;
  public int pCI;
  public String pCJ;
  public String pCK;
  public String pCL;
  public String pCM;
  public String pCN;
  public int pCO;
  public String pCP;
  public String pCQ;
  public int pCR;
  public String pCS;
  public int pCT;
  public String pCU;
  public String pCV;
  public String pCW;
  public String pCX;
  public String pCY;
  public String pCZ;
  public String pCg;
  public boolean pCp;
  public int pDa;
  public int pDb;
  public int pDc;
  public long pDd;
  public Map<String, String> pDe;
  public int pDg;
  public int pDh;
  public float pDi;
  public float pDj;
  public int pDk;
  public int pDl;
  public int pDm;
  public String pDn;
  public float pDo;
  public float pDp;
  public float pDq;
  public float pDr;
  public int pDs;
  public String pDt;
  public String pDu;
  private a pDv;
  public b pDw;
  
  static
  {
    GMTrace.i(8309553758208L, 61911);
    pDf = ".adxml.adArgs.arg";
    GMTrace.o(8309553758208L, 61911);
  }
  
  public b(String paramString)
  {
    GMTrace.i(8309016887296L, 61907);
    this.ePi = "";
    this.pCH = 0;
    this.pCI = 0;
    this.pCJ = "";
    this.pCK = "";
    this.pCL = "";
    this.pCM = "";
    this.pCN = "";
    this.pCO = 0;
    this.pCP = "";
    this.pCQ = "";
    this.pCR = 0;
    this.pCS = "";
    this.pCT = 0;
    this.pCU = "";
    this.pCV = "";
    this.pCW = "";
    this.pCX = "";
    this.pCY = "";
    this.pCZ = "";
    this.pDe = new HashMap();
    if ((!bg.nm(paramString)) && (paramString.trim().startsWith("<RecXml")))
    {
      paramString = W(paramString, ".RecXml", "RecXml");
      if ((paramString != null) && (!paramString.isEmpty()))
      {
        this.pDa = bg.Sy((String)paramString.get(".RecXml.$type"));
        this.pDb = bg.Sy((String)paramString.get(".RecXml.$source"));
        this.pDc = bg.Sy((String)paramString.get(".RecXml.$expId"));
        this.pDd = i.Hb((String)paramString.get(".RecXml.$expOriginSnsId"));
      }
      GMTrace.o(8309016887296L, 61907);
      return;
    }
    W(paramString, "", "adxml");
    GMTrace.o(8309016887296L, 61907);
  }
  
  private Map<String, String> W(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8309151105024L, 61908);
    if ((bg.nm(paramString1)) || (bg.nm(paramString3)))
    {
      GMTrace.o(8309151105024L, 61908);
      return null;
    }
    this.ePi = paramString1;
    w.i("MicroMsg.ADXml", "feed xml %s, keyPrefix %s, tag %s", new Object[] { paramString1, paramString2, paramString3 });
    paramString3 = f.q(paramString1, paramString3);
    if (paramString3 == null)
    {
      GMTrace.o(8309151105024L, 61908);
      return null;
    }
    this.gVx = bg.Sy((String)paramString3.get(paramString2 + ".adxml.adType"));
    this.pCG = bg.aq((String)paramString3.get(paramString2 + ".adxml.adActionTitle"), "");
    this.pCg = bg.aq((String)paramString3.get(paramString2 + ".adxml.adActionLink"), "");
    this.eCQ = bg.aq((String)paramString3.get(paramString2 + ".adxml.nickname"), "");
    this.pCH = bg.Sy((String)paramString3.get(paramString2 + ".adxml.webviewRightBarShow"));
    this.pCI = bg.Sy((String)paramString3.get(paramString2 + ".adxml.adActionLinkHidden"));
    this.pCJ = bg.aq((String)paramString3.get(paramString2 + ".adxml.adActionLinkName"), "");
    this.pCK = bg.aq((String)paramString3.get(paramString2 + ".adxml.adActionLinkIcon"), "");
    this.pCL = bg.aq((String)paramString3.get(paramString2 + ".adxml.adActionLinkTitle.zh"), "");
    this.pCN = bg.aq((String)paramString3.get(paramString2 + ".adxml.adActionLinkTitle.tw"), "");
    this.pCM = bg.aq((String)paramString3.get(paramString2 + ".adxml.adActionLinkTitle.en"), "");
    this.pCP = bg.aq((String)paramString3.get(paramString2 + ".adxml.attachShareLinkWording"), "");
    this.pCQ = bg.aq((String)paramString3.get(paramString2 + ".adxml.attachShareLinkUrl"), "");
    this.pCO = bg.Sy((String)paramString3.get(paramString2 + ".adxml.attachShareLinkIsHidden"));
    if ((bg.nm(this.pCP)) || (bg.nm(this.pCQ))) {
      this.pCO = 1;
    }
    this.pCU = bg.aq((String)paramString3.get(paramString2 + ".adxml.expandOutsideTitle.zh"), "");
    this.pCW = bg.aq((String)paramString3.get(paramString2 + ".adxml.expandOutsideTitle.tw"), "");
    this.pCV = bg.aq((String)paramString3.get(paramString2 + ".adxml.expandOutsideTitle.en"), "");
    this.pCX = bg.aq((String)paramString3.get(paramString2 + ".adxml.expandInsideTitle.zh"), "");
    this.pCZ = bg.aq((String)paramString3.get(paramString2 + ".adxml.expandInsideTitle.tw"), "");
    this.pCY = bg.aq((String)paramString3.get(paramString2 + ".adxml.expandInsideTitle.en"), "");
    this.pCR = bg.Sy((String)paramString3.get(paramString2 + ".adxml.headClickType"));
    this.pCS = bg.aq((String)paramString3.get(paramString2 + ".adxml.headClickParam"), "");
    this.pCT = bg.Sy((String)paramString3.get(paramString2 + ".adxml.headClickRightBarShow"));
    int i = 0;
    Object localObject1 = new StringBuilder().append(paramString2).append(pDf);
    label993:
    String str;
    Object localObject2;
    if (i == 0)
    {
      paramString1 = "";
      localObject1 = paramString1 + ".key";
      str = (String)paramString3.get(localObject1);
      if (str == null) {
        break label1179;
      }
      localObject2 = new StringBuilder().append(paramString2).append(pDf);
      if (i != 0) {
        break label1170;
      }
    }
    label1170:
    for (paramString1 = "";; paramString1 = Integer.valueOf(i))
    {
      paramString1 = paramString1 + ".value";
      localObject2 = (String)paramString3.get(paramString1);
      w.i("MicroMsg.ADXml", "newKey " + (String)localObject1 + " " + str + " newValue : " + paramString1 + " " + (String)localObject2);
      this.pDe.put(str, localObject2);
      i += 1;
      break;
      paramString1 = Integer.valueOf(i);
      break label993;
    }
    label1179:
    this.pCp = paramString3.containsKey(paramString2 + ".adxml.adCanvasInfo");
    this.pDg = bg.Sy((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.contentDisplayType"));
    this.pDh = bg.Sy((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaDisplayMode"));
    this.pDi = ((float)bg.SA((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaDisplayWidth")));
    this.pDj = ((float)bg.SA((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaDisplayHeight")));
    this.pDm = bg.Sy((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.btnDisplayType"));
    this.pDn = bg.aq((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconUrl"), "");
    this.pDk = bg.Sy((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.basicRemWidth"));
    this.pDl = bg.Sy((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.basicRootFontSize"));
    this.pDo = ((float)bg.SA((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconWidth")));
    this.pDp = ((float)bg.SA((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconHeight")));
    this.pDq = ((float)bg.SA((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconPaddingRight")));
    this.pDr = ((float)bg.SA((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconPaddingBottom")));
    this.pDs = bg.Sy((String)paramString3.get(paramString2 + ".adxml.adContentStyle"));
    this.pDt = bg.aq((String)paramString3.get(paramString2 + ".adxml.adCardInfo.title"), "");
    this.pDu = bg.aq((String)paramString3.get(paramString2 + ".adxml.adCardInfo.description"), "");
    paramString1 = bg.aq((String)paramString3.get(paramString2 + ".adxml.adSelectInfo.leftBtnTitle"), "");
    localObject1 = bg.aq((String)paramString3.get(paramString2 + ".adxml.adSelectInfo.rightBtnTitle"), "");
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty((CharSequence)localObject1)))
    {
      this.pDv = new a();
      this.pDv.pDx = paramString1;
      this.pDv.pDy = ((String)localObject1);
    }
    paramString1 = bg.aq((String)paramString3.get(paramString2 + ".adxml.adVoteInfo.componentUrl"), "");
    if (!TextUtils.isEmpty(paramString1))
    {
      this.pDw = new b();
      this.pDw.pDA = paramString1;
      paramString2 = paramString2 + ".adxml.adVoteInfo.optionList.option";
      i = 0;
      if (i == 0) {
        break label2264;
      }
    }
    label2264:
    for (paramString1 = paramString2 + i;; paramString1 = paramString2)
    {
      if (!TextUtils.isEmpty(bg.aq((String)paramString3.get(paramString1 + ".title"), "")))
      {
        localObject1 = new c();
        ((c)localObject1).title = bg.aq((String)paramString3.get(paramString1 + ".title"), "");
        ((c)localObject1).kBR = bg.aq((String)paramString3.get(paramString1 + ".shareTitle"), "");
        ((c)localObject1).pDC = bg.aq((String)paramString3.get(paramString1 + ".shareDesc"), "");
        ((c)localObject1).pDD = bg.aq((String)paramString3.get(paramString1 + ".shareThumb"), "");
        ((c)localObject1).pDE = bg.aq((String)paramString3.get(paramString1 + ".selectedTitle"), "");
        this.pDw.pDB.add(localObject1);
        i += 1;
        break;
      }
      GMTrace.o(8309151105024L, 61908);
      return paramString3;
    }
  }
  
  public final String bka()
  {
    GMTrace.i(18582041788416L, 138447);
    String str;
    if (bkf())
    {
      str = this.pDv.pDx;
      GMTrace.o(18582041788416L, 138447);
      return str;
    }
    if (bkg())
    {
      str = ((c)this.pDw.pDB.get(0)).title;
      GMTrace.o(18582041788416L, 138447);
      return str;
    }
    GMTrace.o(18582041788416L, 138447);
    return "";
  }
  
  public final String bkb()
  {
    GMTrace.i(18582176006144L, 138448);
    String str;
    if (bkf())
    {
      str = this.pDv.pDy;
      GMTrace.o(18582176006144L, 138448);
      return str;
    }
    if (bkg())
    {
      str = ((c)this.pDw.pDB.get(1)).title;
      GMTrace.o(18582176006144L, 138448);
      return str;
    }
    GMTrace.o(18582176006144L, 138448);
    return "";
  }
  
  public final String bkc()
  {
    GMTrace.i(20837839142912L, 155254);
    if (bkg())
    {
      String str = this.pDw.pDA;
      GMTrace.o(20837839142912L, 155254);
      return str;
    }
    GMTrace.o(20837839142912L, 155254);
    return "";
  }
  
  public final boolean bkd()
  {
    GMTrace.i(8309285322752L, 61909);
    if (this.pDs == 2)
    {
      GMTrace.o(8309285322752L, 61909);
      return true;
    }
    GMTrace.o(8309285322752L, 61909);
    return false;
  }
  
  public final boolean bke()
  {
    GMTrace.i(8309419540480L, 61910);
    if (this.pDs == 1)
    {
      GMTrace.o(8309419540480L, 61910);
      return true;
    }
    GMTrace.o(8309419540480L, 61910);
    return false;
  }
  
  public final boolean bkf()
  {
    GMTrace.i(18582310223872L, 138449);
    if (this.pDv != null)
    {
      GMTrace.o(18582310223872L, 138449);
      return true;
    }
    GMTrace.o(18582310223872L, 138449);
    return false;
  }
  
  public final boolean bkg()
  {
    GMTrace.i(20837973360640L, 155255);
    if ((this.pDw != null) && (this.pDw.pDB.size() > 1))
    {
      GMTrace.o(20837973360640L, 155255);
      return true;
    }
    GMTrace.o(20837973360640L, 155255);
    return false;
  }
  
  public final String bkh()
  {
    GMTrace.i(18582444441600L, 138450);
    String str2 = this.ePi;
    String str1 = str2;
    if (str2.contains("<adCanvasInfoLeft>")) {
      str1 = str2.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("(?s)<adCanvasInfoRight[^>]*>.*?</adCanvasInfoRight>", "").replaceAll("adCanvasInfoLeft", "adCanvasInfo");
    }
    GMTrace.o(18582444441600L, 138450);
    return str1;
  }
  
  public final String bki()
  {
    GMTrace.i(18582578659328L, 138451);
    String str2 = this.ePi;
    String str1 = str2;
    if (str2.contains("<adCanvasInfoRight>")) {
      str1 = str2.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("(?s)<adCanvasInfoLeft[^>]*>.*?</adCanvasInfoLeft>", "").replaceAll("adCanvasInfoRight", "adCanvasInfo");
    }
    GMTrace.o(18582578659328L, 138451);
    return str1;
  }
  
  public final boolean bkj()
  {
    GMTrace.i(20066489860096L, 149507);
    if (this.pDb == 2)
    {
      GMTrace.o(20066489860096L, 149507);
      return true;
    }
    GMTrace.o(20066489860096L, 149507);
    return false;
  }
  
  public final class a
  {
    public String pDx;
    public String pDy;
    
    public a()
    {
      GMTrace.i(18577209950208L, 138411);
      GMTrace.o(18577209950208L, 138411);
    }
  }
  
  public final class b
  {
    public String pDA;
    public ArrayList<b.c> pDB;
    
    public b()
    {
      GMTrace.i(20833812611072L, 155224);
      this.pDA = "";
      this.pDB = new ArrayList();
      GMTrace.o(20833812611072L, 155224);
    }
    
    public final String uH(int paramInt)
    {
      GMTrace.i(20833946828800L, 155225);
      if ((paramInt >= 0) && (paramInt < this.pDB.size()))
      {
        String str = ((b.c)this.pDB.get(paramInt)).pDE;
        GMTrace.o(20833946828800L, 155225);
        return str;
      }
      GMTrace.o(20833946828800L, 155225);
      return "";
    }
    
    public final String uI(int paramInt)
    {
      GMTrace.i(20834081046528L, 155226);
      if ((paramInt >= 0) && (paramInt < this.pDB.size()))
      {
        String str = ((b.c)this.pDB.get(paramInt)).title;
        GMTrace.o(20834081046528L, 155226);
        return str;
      }
      GMTrace.o(20834081046528L, 155226);
      return "";
    }
  }
  
  public final class c
  {
    public String kBR;
    public String pDC;
    public String pDD;
    public String pDE;
    public String title;
    
    public c()
    {
      GMTrace.i(20834215264256L, 155227);
      this.title = "";
      this.kBR = "";
      this.pDC = "";
      this.pDD = "";
      this.pDE = "";
      GMTrace.o(20834215264256L, 155227);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */