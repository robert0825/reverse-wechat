package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pe;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.g.i;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
{
  private static String ppF;
  private static g ppG;
  private static int[] pql;
  private StringBuffer jae;
  public long jim;
  public String ppC;
  public long ppD;
  public String ppH;
  public int ppI;
  public int ppJ;
  public long ppK;
  public long ppL;
  public String ppM;
  public long ppN;
  public long ppO;
  public String ppP;
  public String ppQ;
  public String ppR;
  public String ppS;
  public String ppT;
  public String ppU;
  public String ppV;
  public String ppW;
  public String ppX;
  public String ppY;
  public String ppZ;
  public String pqa;
  public String pqb;
  public String pqc;
  public String pqd;
  public String pqe;
  public String pqf;
  public String pqg;
  public int pqh;
  public String pqi;
  private List<List<Integer>> pqj;
  private List<Integer> pqk;
  private LinkedList<c> pqm;
  
  static
  {
    GMTrace.i(8802267037696L, 65582);
    ppG = null;
    ppF = "";
    pql = new int[] { 50, 66, 68, 88, 99, 121, 123, 166, 168, 188, 199, 233, 266, 268, 288, 299, 369, 419, 520, 666, 1024 };
    GMTrace.o(8802267037696L, 65582);
  }
  
  public g()
  {
    GMTrace.i(8801595949056L, 65577);
    this.ppD = 0L;
    this.jim = 0L;
    this.ppH = "";
    this.ppI = 0;
    this.ppJ = 0;
    this.ppC = "";
    this.ppK = 0L;
    this.ppL = 0L;
    this.ppM = "";
    this.ppN = 0L;
    this.ppO = 0L;
    this.ppP = "";
    this.ppQ = "";
    this.ppR = "";
    this.ppS = "";
    this.ppT = "";
    this.ppU = "";
    this.ppV = "";
    this.ppW = "";
    this.ppX = "";
    this.ppY = "";
    this.ppZ = "";
    this.pqa = "";
    this.pqb = "";
    this.pqc = "";
    this.pqd = "";
    this.pqe = "";
    this.pqf = "";
    this.pqg = "";
    this.pqh = -1;
    this.pqi = "";
    this.pqj = new LinkedList();
    this.pqk = new LinkedList();
    this.pqm = new LinkedList();
    this.jae = new StringBuffer();
    GMTrace.o(8801595949056L, 65577);
  }
  
  public static g bhW()
  {
    GMTrace.i(8801864384512L, 65579);
    h.xz();
    if (!h.xw().wL())
    {
      localObject1 = new g();
      GMTrace.o(8801864384512L, 65579);
      return (g)localObject1;
    }
    Object localObject3 = com.tencent.mm.y.c.c.Ct().er("100068");
    Object localObject2 = ((com.tencent.mm.storage.c)localObject3).field_rawXML;
    Object localObject1 = localObject2;
    if (bg.nm((String)localObject2)) {
      localObject1 = "";
    }
    String str = com.tencent.mm.a.g.n(((String)localObject1).getBytes());
    if ((ppG == null) || (!str.equals(ppF)))
    {
      w.i("MicroMsg.NewYearSnsCtrlV2", "create newYearSnsCtrl");
      ppG = new g();
    }
    for (;;)
    {
      try
      {
        localObject2 = ((com.tencent.mm.storage.c)localObject3).bSg();
        localObject1 = "";
        if (localObject2 != null) {
          localObject1 = (String)((Map)localObject2).get("SnsHBConfig");
        }
        localObject2 = localObject1;
        if (bg.nm((String)localObject1)) {
          localObject2 = "";
        }
        localObject1 = URLDecoder.decode((String)localObject2, "UTF-8");
        localObject2 = ppG;
        ((g)localObject2).jae = new StringBuffer();
        ((g)localObject2).pqm.clear();
        localObject3 = bh.q((String)localObject1, "sysmsg");
        if (localObject3 != null) {
          continue;
        }
        w.i("MicroMsg.NewYearSnsCtrlV2", "errr for paser %s", new Object[] { localObject1 });
        ppF = str;
      }
      catch (Exception localException)
      {
        int i;
        int k;
        LinkedList localLinkedList;
        int j;
        StringBuilder localStringBuilder;
        int m;
        w.e("MicroMsg.NewYearSnsCtrlV2", "createctrl error " + localException.getMessage());
        continue;
      }
      localObject1 = ppG;
      GMTrace.o(8801864384512L, 65579);
      return (g)localObject1;
      ((g)localObject2).ppD = bg.Sz((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.BeginTime"));
      ((g)localObject2).jae.append("BeginTime:" + ((g)localObject2).ppD + ";");
      ((g)localObject2).jim = bg.Sz((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.EndTime"));
      ((g)localObject2).jae.append("EndTime:" + ((g)localObject2).jim + ";\n");
      ((g)localObject2).ppI = bg.Sy((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.SvrDownReqLimitLevelMin"));
      ((g)localObject2).ppJ = bg.Sy((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.SvrDownReqLimitLevelMax"));
      ((g)localObject2).jae.append("SvrDownReqLimitLevelMin:" + ((g)localObject2).ppI + " SvrDownReqLimitLevelMax: " + ((g)localObject2).ppJ + ";\n");
      ((g)localObject2).ppN = bg.Sz((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.BrowseBeginTime"));
      ((g)localObject2).ppO = bg.Sz((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.BrowseEndTime"));
      ((g)localObject2).ppP = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenTitle"), "");
      ((g)localObject2).ppQ = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenDescription"), "");
      ((g)localObject2).ppR = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenQueryTips"), "");
      ((g)localObject2).ppS = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenAcceptButtonText"), "");
      ((g)localObject2).ppT = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenRejectButtonText"), "");
      ((g)localObject2).ppU = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenTips"), "");
      ((g)localObject2).ppW = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenSuccTips"), "");
      ((g)localObject2).ppX = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenFailTips"), "");
      ((g)localObject2).ppV = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseTips"), "");
      ((g)localObject2).ppY = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseSuccTips"), "");
      ((g)localObject2).ppZ = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseFailTips"), "");
      ((g)localObject2).pqg = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.MaxPostFeedID"), "");
      ((g)localObject2).pqh = bg.Sy((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.MaxPostFeedCount"));
      ((g)localObject2).pqi = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenID"), "");
      if (((g)localObject2).pqh <= 0)
      {
        w.i("MicroMsg.NewYearSnsCtrlV2", "svr MaxPostFeedCount error " + ((g)localObject2).pqh);
        ((g)localObject2).pqh = 1;
      }
      ((g)localObject2).jae.append("FullScreenID:" + ((g)localObject2).pqi + " BrowseBeginTime:" + ((g)localObject2).ppN + " BrowseEndTime:" + ((g)localObject2).ppO + " FullScreenTitle:" + ((g)localObject2).ppP + " FullScreenDescription:" + ((g)localObject2).ppQ + " FullScreenQueryTips:" + ((g)localObject2).ppR + " FullScreenAcceptButtonText: " + ((g)localObject2).ppS);
      ((g)localObject2).jae.append("FullScreenRejectButtonText:" + ((g)localObject2).ppT + " ActionSheetOpenTips:" + ((g)localObject2).ppU + " ActionSheetOpenSuccTips:" + ((g)localObject2).ppW + " ActionSheetOpenFailTips:" + ((g)localObject2).ppX + " ActionSheetCloseTips:" + ((g)localObject2).ppV + " ActionSheetCloseSuccTips: " + ((g)localObject2).ppY + " ActionSheetCloseFailTips: " + ((g)localObject2).ppZ + "MaxPostFeedID: " + ((g)localObject2).pqg + " MaxPostFeedCount:" + ((g)localObject2).pqh);
      ((g)localObject2).pqa = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForHasUsed"), "");
      ((g)localObject2).pqb = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForObtainUsedRight"), "");
      ((g)localObject2).pqc = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForClosedBrowseSwitch"), "");
      ((g)localObject2).pqd = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertButtonText"), "");
      ((g)localObject2).pqe = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.GoldenCameraTip"), "");
      ((g)localObject2).pqf = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.GoldenCameraTipID"), "");
      ((g)localObject2).jae.append("AlertTipForHasUsed:" + ((g)localObject2).pqa + " AlertTipForObtainUsedRight:" + ((g)localObject2).pqb + " AlertTipForClosedBrowseSwitch:" + ((g)localObject2).pqc + " AlertButtonText:" + ((g)localObject2).pqd + " GoldenCameraTip:" + ((g)localObject2).pqe + " GoldenCameraTipID:" + ((g)localObject2).pqf);
      i = 0;
      if (i == 0)
      {
        localObject1 = "";
        ((g)localObject2).ppC = bg.aq((String)((Map)localObject3).get(String.format(".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s", new Object[] { localObject1, "RedPointID" })), "");
        ((g)localObject2).jae.append("RedPointID:" + ((g)localObject2).ppC + ";");
        if (bg.nm(((g)localObject2).ppC)) {
          continue;
        }
        if (i == 0)
        {
          localObject1 = "";
          ((g)localObject2).ppK = bg.Sz((String)((Map)localObject3).get(String.format(".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s", new Object[] { localObject1, "BeginTime" })));
          ((g)localObject2).jae.append("RedPointID_BeginTime:" + ((g)localObject2).ppK + ";");
          if (i != 0) {
            continue;
          }
          localObject1 = "";
          ((g)localObject2).ppL = bg.Sz((String)((Map)localObject3).get(String.format(".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s", new Object[] { localObject1, "EndTime" })));
          ((g)localObject2).jae.append("RedPointID_EndTime:" + ((g)localObject2).ppL + ";\n");
          localObject1 = new c();
          ((c)localObject1).ppC = ((g)localObject2).ppC;
          ((c)localObject1).ppD = ((g)localObject2).ppK;
          ((c)localObject1).jim = ((g)localObject2).ppL;
          ((g)localObject2).pqm.add(localObject1);
          i += 1;
        }
      }
      else
      {
        localObject1 = String.valueOf(i);
        continue;
      }
      localObject1 = String.valueOf(i);
      continue;
      localObject1 = String.valueOf(i);
      continue;
      ((g)localObject2).ppM = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.PostTips"), "");
      ((g)localObject2).jae.append("PostTips:" + ((g)localObject2).ppM + ";");
      ((g)localObject2).ppH = bg.aq((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.EntranceTips"), "");
      ((g)localObject2).jae.append("EntranceTips:" + ((g)localObject2).ppH + ";");
      ((g)localObject2).pqj.clear();
      i = 0;
      k = bg.Sy((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.AmountLevel" + i + ".Count"));
      ((g)localObject2).jae.append("count: " + i + " | " + k + ";\n");
      if (k != 0)
      {
        localLinkedList = new LinkedList();
        j = 0;
        if (j < k)
        {
          localStringBuilder = new StringBuilder(".sysmsg.NewYearSNSCtrl2016.AmountLevel").append(i).append(".Amount");
          if (j == 0)
          {
            localObject1 = "";
            m = bg.Sy((String)((Map)localObject3).get(localObject1));
            localLinkedList.add(Integer.valueOf(m));
            ((g)localObject2).jae.append("AmountLevel : " + i + " index " + j + " val: " + m + ";");
            j += 1;
          }
          else
          {
            localObject1 = Integer.valueOf(j);
          }
        }
        else
        {
          ((g)localObject2).pqj.add(localLinkedList);
          i += 1;
        }
      }
      else
      {
        w.i("MicroMsg.NewYearSnsCtrlV2", "dumpinfo " + ((g)localObject2).jae.toString());
      }
    }
  }
  
  public static boolean bhX()
  {
    GMTrace.i(8801998602240L, 65580);
    h.xz();
    boolean bool = ((Boolean)h.xy().xh().get(w.a.vty, Boolean.valueOf(true))).booleanValue();
    GMTrace.o(8801998602240L, 65580);
    return bool;
  }
  
  public final void bhY()
  {
    GMTrace.i(8802132819968L, 65581);
    Object localObject = k.g(w.a.vtC);
    if ((((i)localObject).pzm == null) || (bg.nm(((i)localObject).pzm.pzj)))
    {
      ((i)localObject).pzm = new com.tencent.mm.plugin.sns.g.g();
      ((i)localObject).pzm.pzj = this.pqg;
      ((i)localObject).pzm.pzk = 0;
    }
    if ((!bg.nm(((i)localObject).pzm.pzj)) && (((i)localObject).pzm.pzj.equals(this.pqg)))
    {
      com.tencent.mm.plugin.sns.g.g localg = ((i)localObject).pzm;
      localg.pzk -= 1;
      if (((i)localObject).pzm.pzk < 0) {
        ((i)localObject).pzm.pzk = 0;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.NewYearSnsCtrlV2", "minusPostCountV2 " + ((i)localObject).pzm.pzk + " postId: " + this.pqg + " " + bg.bQW().toString());
      try
      {
        h.xz();
        h.xy().xh().a(w.a.vtC, new String(((i)localObject).toByteArray(), Charset.forName("ISO-8859-1")));
        localObject = new pe();
        com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
        GMTrace.o(8802132819968L, 65581);
        return;
        ((i)localObject).pzm = new com.tencent.mm.plugin.sns.g.g();
        ((i)localObject).pzm.pzj = this.pqg;
        ((i)localObject).pzm.pzk = 0;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          w.w("MicroMsg.NewYearSnsCtrlV2", "minusPostCountV2 save exception:" + localIOException.getLocalizedMessage());
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\lucky\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */