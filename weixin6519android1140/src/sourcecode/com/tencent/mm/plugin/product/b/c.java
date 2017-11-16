package com.tencent.mm.plugin.product.b;

import android.app.Activity;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.product.c.f;
import com.tencent.mm.plugin.product.c.h;
import com.tencent.mm.plugin.product.c.k;
import com.tencent.mm.plugin.product.c.l;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.akq;
import com.tencent.mm.protocal.c.ar;
import com.tencent.mm.protocal.c.aup;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.azu;
import com.tencent.mm.protocal.c.beh;
import com.tencent.mm.protocal.c.bz;
import com.tencent.mm.protocal.c.px;
import com.tencent.mm.protocal.c.rz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.f.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  public int mCount;
  private d nHB;
  public m nHC;
  public List<n> nHD;
  public String nHE;
  public String nHF;
  public String nHG;
  public rz nHH;
  public bz nHI;
  public axt nHJ;
  public String nHK;
  public String nHL;
  public int nHM;
  public Map<String, e> nHN;
  public Map<String, String> nHO;
  public LinkedList<rz> nHP;
  public LinkedList<ar> nHQ;
  public e nHR;
  private com.tencent.mm.plugin.product.ui.e nHS;
  public Map<String, LinkedList<px>> nHT;
  
  public c()
  {
    GMTrace.i(5991210942464L, 44638);
    this.nHB = null;
    this.mCount = 1;
    this.nHO = new HashMap();
    this.nHT = null;
    GMTrace.o(5991210942464L, 44638);
  }
  
  private int EF(String paramString)
  {
    GMTrace.i(5992687337472L, 44649);
    int k = 0;
    int i = 0;
    int j = k;
    if (this.nHT != null)
    {
      j = k;
      if (this.nHT.size() > 0)
      {
        paramString = (LinkedList)this.nHT.get(paramString);
        j = k;
        if (paramString != null)
        {
          j = k;
          if (paramString.size() > 0)
          {
            paramString = paramString.iterator();
            for (;;)
            {
              j = i;
              if (!paramString.hasNext()) {
                break;
              }
              i = ((px)paramString.next()).tXI + i;
            }
          }
        }
      }
    }
    GMTrace.o(5992687337472L, 44649);
    return j;
  }
  
  public static String F(Map<String, String> paramMap)
  {
    GMTrace.i(5994432167936L, 44662);
    if ((paramMap == null) || (paramMap.isEmpty()))
    {
      GMTrace.o(5994432167936L, 44662);
      return null;
    }
    Object localObject = new ArrayList(paramMap.entrySet());
    Collections.sort((List)localObject, new Comparator() {});
    paramMap = new StringBuilder();
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      paramMap.append((String)localEntry.getKey()).append(":").append((String)localEntry.getValue()).append(";");
    }
    paramMap.deleteCharAt(paramMap.lastIndexOf(";"));
    paramMap = paramMap.toString();
    GMTrace.o(5994432167936L, 44662);
    return paramMap;
  }
  
  private void a(String[] paramArrayOfString, l paraml)
  {
    GMTrace.i(5994566385664L, 44663);
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      GMTrace.o(5994566385664L, 44663);
      return;
    }
    int k = paramArrayOfString.length;
    int i = 1;
    if (i <= -1 >>> 32 - k)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      int j = 0;
      while (j < k)
      {
        if (i << 31 - j >> 31 == -1) {
          localStringBuilder.append(paramArrayOfString[j]).append(";");
        }
        j += 1;
      }
      localStringBuilder.deleteCharAt(localStringBuilder.lastIndexOf(";"));
      e locale = (e)this.nHN.get(localStringBuilder.toString());
      if (locale != null)
      {
        if (locale.nHV < paraml.nIM) {
          locale.nHV = paraml.nIM;
        }
        if (locale.nHW > paraml.nIM) {
          locale.nHW = paraml.nIM;
        }
        locale.nIe += paraml.nIe;
      }
      for (;;)
      {
        i += 1;
        break;
        locale = new e();
        locale.nHV = paraml.nIM;
        locale.nHW = paraml.nIM;
        locale.nIe = paraml.nIe;
        locale.nIN = paraml.nIN;
        locale.url = paraml.url;
        this.nHN.put(localStringBuilder.toString(), locale);
      }
    }
    GMTrace.o(5994566385664L, 44663);
  }
  
  public final LinkedList<com.tencent.mm.plugin.product.c.a> F(Activity paramActivity)
  {
    GMTrace.i(5992150466560L, 44645);
    LinkedList localLinkedList = new LinkedList();
    if (this.nHQ != null)
    {
      Iterator localIterator = this.nHQ.iterator();
      while (localIterator.hasNext())
      {
        ar localar = (ar)localIterator.next();
        com.tencent.mm.plugin.product.c.a locala = new com.tencent.mm.plugin.product.c.a();
        locala.lPi = localar.lPi;
        locala.nIo = localar.nIo;
        locala.nIp = localar.nIp;
        locala.jib = localar.jib;
        locala.lRV = localar.lRV;
        if (locala.jib == 1)
        {
          int i = EF(locala.nIp);
          if (i > 0) {
            locala.nIo = paramActivity.getString(a.i.sVW, new Object[] { b.c(i, this.nHC.nIg.nEr) });
          }
        }
        localLinkedList.add(locala);
      }
    }
    GMTrace.o(5992150466560L, 44645);
    return localLinkedList;
  }
  
  public final void S(Intent paramIntent)
  {
    GMTrace.i(5992016248832L, 44644);
    bz localbz = new bz();
    localbz.jhi = bg.aq(paramIntent.getStringExtra("userName"), "");
    localbz.tQl = bg.aq(paramIntent.getStringExtra("telNumber"), "");
    localbz.tQm = bg.aq(paramIntent.getStringExtra("addressPostalCode"), "");
    localbz.gCy = bg.aq(paramIntent.getStringExtra("proviceFirstStageName"), "");
    localbz.gCz = bg.aq(paramIntent.getStringExtra("addressCitySecondStageName"), "");
    localbz.gCG = bg.aq(paramIntent.getStringExtra("addressCountiesThirdStageName"), "");
    localbz.lQf = bg.aq(paramIntent.getStringExtra("addressDetailInfo"), "");
    if ((!bg.nm(localbz.jhi)) && (!bg.nm(localbz.tQl))) {
      this.nHI = localbz;
    }
    GMTrace.o(5992016248832L, 44644);
  }
  
  public final String a(m paramm)
  {
    GMTrace.i(5994969038848L, 44666);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<mallProductInfo>");
    localStringBuilder.append("<type>").append(paramm.nId).append("</type>");
    localStringBuilder.append("<id>").append(paramm.nIc).append("</id>");
    localStringBuilder.append("<version>").append(paramm.nIg.version).append("</version>");
    localStringBuilder.append("<name>").append(bg.Sw(paramm.nIg.name)).append("</name>");
    localStringBuilder.append("<highPrice>").append(paramm.nIg.nIt).append("</highPrice>");
    localStringBuilder.append("<lowPrice>").append(paramm.nIg.nIu).append("</lowPrice>");
    localStringBuilder.append("<originPrice>").append(paramm.nIg.nIs).append("</originPrice>");
    localStringBuilder.append("<sourceUrl>").append(bg.Sw(this.nHC.nIk)).append("</sourceUrl>");
    if (paramm.nIg.nIv != null)
    {
      localStringBuilder.append("<imgCount>").append(paramm.nIg.nIv.size()).append("</imgCount>");
      localStringBuilder.append("<imgList>");
      Iterator localIterator = paramm.nIg.nIv.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("<imgUrl>").append(bg.Sw(str)).append("</imgUrl>");
      }
      localStringBuilder.append("</imgList>");
    }
    localStringBuilder.append("<shareInfo>");
    localStringBuilder.append("<shareUrl>").append(bg.Sw(aXh())).append("</shareUrl>");
    localStringBuilder.append("<shareThumbUrl>").append(bg.Sw(paramm.aXs())).append("</shareThumbUrl>");
    localStringBuilder.append("</shareInfo>");
    if (this.nHC.nIh != null)
    {
      localStringBuilder.append("<sellerInfo>");
      localStringBuilder.append("<appID>").append(paramm.nIh.eSd).append("</appID>");
      localStringBuilder.append("<appName>").append(paramm.nIh.name).append("</appName>");
      localStringBuilder.append("<usrName>").append(paramm.nIh.username).append("</usrName>");
      localStringBuilder.append("</sellerInfo>");
    }
    localStringBuilder.append("</mallProductInfo>");
    paramm = localStringBuilder.toString();
    GMTrace.o(5994969038848L, 44666);
    return paramm;
  }
  
  public final void a(m paramm, List<n> paramList)
  {
    int j = 0;
    GMTrace.i(5991479377920L, 44640);
    clear();
    this.nHC = paramm;
    this.nHD = paramList;
    if (bg.nm(this.nHC.nIk)) {
      this.nHC.nIk = this.nHF;
    }
    paramm = this.nHC.nIi;
    this.nHN = new HashMap();
    if ((paramm == null) || (paramm.size() <= 0))
    {
      if ((this.nHC.nIg != null) && (this.nHC.nIg.nIC != null)) {
        this.nHM = this.nHC.nIg.nIC.size();
      }
      if ((this.nHC.nIg != null) && (this.nHC.nIg.nIv != null) && (this.nHC.nIg.nIv.size() > 0)) {
        this.nHK = ((String)this.nHC.nIg.nIv.get(0));
      }
      if (!bg.nm(this.nHC.aXs()))
      {
        com.tencent.mm.platformtools.j.a(new com.tencent.mm.plugin.product.ui.c(this.nHC.aXs()));
        w.d("MicroMsg.MallProductManager", "product img path : " + aXg());
      }
      if ((this.nHC.nIj == null) || (this.nHC.nIj.nIG == null)) {
        break label371;
      }
    }
    label371:
    for (int i = this.nHC.nIj.nIG.eQl;; i = 0)
    {
      if (this.nHC.nIh != null) {
        j = this.nHC.nIh.eQl;
      }
      this.nHS = new com.tencent.mm.plugin.product.ui.e(i, j);
      GMTrace.o(5991479377920L, 44640);
      return;
      int k = paramm.size();
      i = 0;
      while (i < k)
      {
        paramList = (l)paramm.get(i);
        a(paramList.nIL.split(";"), paramList);
        i += 1;
      }
      aXo();
      break;
    }
  }
  
  public final com.tencent.mm.plugin.product.ui.e aWZ()
  {
    GMTrace.i(5991613595648L, 44641);
    if (this.nHS == null) {
      this.nHS = new com.tencent.mm.plugin.product.ui.e(0, 0);
    }
    com.tencent.mm.plugin.product.ui.e locale = this.nHS;
    GMTrace.o(5991613595648L, 44641);
    return locale;
  }
  
  public final String aXa()
  {
    GMTrace.i(5991747813376L, 44642);
    if ((this.nHR != null) && (!bg.nm(this.nHR.url)))
    {
      str = this.nHR.url;
      GMTrace.o(5991747813376L, 44642);
      return str;
    }
    String str = this.nHK;
    GMTrace.o(5991747813376L, 44642);
    return str;
  }
  
  public final String aXb()
  {
    GMTrace.i(5991882031104L, 44643);
    Object localObject1 = new StringBuilder();
    Iterator localIterator = this.nHC.nIg.nIC.iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label136;
      }
      Object localObject2 = (com.tencent.mm.plugin.product.c.m)localIterator.next();
      String str = (String)this.nHO.get(((com.tencent.mm.plugin.product.c.m)localObject2).nIO);
      if (str != null)
      {
        localObject2 = ((com.tencent.mm.plugin.product.c.m)localObject2).nIQ.iterator();
        if (((Iterator)localObject2).hasNext())
        {
          h localh = (h)((Iterator)localObject2).next();
          if (!str.equals(localh.id)) {
            break;
          }
          ((StringBuilder)localObject1).append(localh.name).append(" ");
        }
      }
    }
    label136:
    localObject1 = ((StringBuilder)localObject1).toString();
    GMTrace.o(5991882031104L, 44643);
    return (String)localObject1;
  }
  
  public final int aXc()
  {
    GMTrace.i(5992418902016L, 44647);
    int j = 0;
    int i = j;
    if (!aWZ().aXv())
    {
      i = j;
      if (this.nHH != null) {
        i = this.nHH.tXI + 0;
      }
    }
    if (this.nHR != null) {
      i += this.nHR.nHV * this.mCount;
    }
    for (;;)
    {
      j = aXd();
      GMTrace.o(5992418902016L, 44647);
      return i - j;
      i += this.nHC.nIg.nIt * this.mCount;
    }
  }
  
  public final int aXd()
  {
    GMTrace.i(5992553119744L, 44648);
    int j = 0;
    int i = j;
    if (this.nHT != null)
    {
      i = j;
      if (this.nHT.size() > 0)
      {
        Iterator localIterator = this.nHT.values().iterator();
        for (i = 0; localIterator.hasNext(); i = j)
        {
          Object localObject = (LinkedList)localIterator.next();
          j = i;
          if (localObject != null)
          {
            j = i;
            if (((LinkedList)localObject).size() > 0)
            {
              localObject = ((LinkedList)localObject).iterator();
              for (;;)
              {
                j = i;
                if (!((Iterator)localObject).hasNext()) {
                  break;
                }
                i += ((px)((Iterator)localObject).next()).tXI;
              }
            }
          }
        }
      }
    }
    GMTrace.o(5992553119744L, 44648);
    return i;
  }
  
  public final axt aXe()
  {
    GMTrace.i(5992821555200L, 44650);
    if (this.nHJ != null)
    {
      localObject = this.nHJ;
      GMTrace.o(5992821555200L, 44650);
      return (axt)localObject;
    }
    if (this.nHB == null) {
      this.nHB = com.tencent.mm.plugin.product.a.a.aWW().aWY();
    }
    Object localObject = this.nHB;
    if ((((d)localObject).nHU != null) && (((d)localObject).nHU.size() > 0)) {}
    for (localObject = (String)((d)localObject).nHU.get(0); !bg.nm((String)localObject); localObject = null)
    {
      this.nHJ = new axt();
      this.nHJ.lQf = ((String)localObject);
      this.nHJ.uMp = 1;
      localObject = this.nHJ;
      GMTrace.o(5992821555200L, 44650);
      return (axt)localObject;
    }
    localObject = this.nHI;
    if ((localObject != null) && (!bg.nm(((bz)localObject).jhi)))
    {
      this.nHJ = new axt();
      this.nHJ.lQf = ((bz)localObject).jhi;
      this.nHJ.uMp = 1;
      localObject = this.nHJ;
      GMTrace.o(5992821555200L, 44650);
      return (axt)localObject;
    }
    GMTrace.o(5992821555200L, 44650);
    return null;
  }
  
  public final String aXf()
  {
    GMTrace.i(5993089990656L, 44652);
    if (this.nHC.nIh != null)
    {
      String str = this.nHC.nIh.username;
      GMTrace.o(5993089990656L, 44652);
      return str;
    }
    GMTrace.o(5993089990656L, 44652);
    return null;
  }
  
  public final String aXg()
  {
    GMTrace.i(5993224208384L, 44653);
    if (!bg.nm(this.nHC.aXs()))
    {
      String str = com.tencent.mm.plugin.product.ui.c.EH(this.nHC.aXs());
      GMTrace.o(5993224208384L, 44653);
      return str;
    }
    GMTrace.o(5993224208384L, 44653);
    return null;
  }
  
  public final String aXh()
  {
    GMTrace.i(5993358426112L, 44654);
    if ((this.nHC.nIg != null) && (this.nHC.nIg.nIE != null))
    {
      str = this.nHC.nIg.nIE.url;
      GMTrace.o(5993358426112L, 44654);
      return str;
    }
    if (!bg.nm(this.nHC.nIk))
    {
      str = this.nHC.nIk;
      GMTrace.o(5993358426112L, 44654);
      return str;
    }
    String str = this.nHF;
    GMTrace.o(5993358426112L, 44654);
    return str;
  }
  
  public final int aXi()
  {
    GMTrace.i(5993492643840L, 44655);
    int j = this.nHC.nIe;
    int i = j;
    if (this.nHR != null)
    {
      i = j;
      if (j > this.nHR.nIe) {
        i = this.nHR.nIe;
      }
    }
    GMTrace.o(5993492643840L, 44655);
    return i;
  }
  
  public final boolean aXj()
  {
    GMTrace.i(5993626861568L, 44656);
    if ((this.mCount > 0) && (this.nHC != null) && (this.mCount <= aXi()) && (this.nHC.nIg != null) && (this.nHC.nIg.nIC != null))
    {
      GMTrace.o(5993626861568L, 44656);
      return true;
    }
    GMTrace.o(5993626861568L, 44656);
    return false;
  }
  
  public final boolean aXk()
  {
    GMTrace.i(5993761079296L, 44657);
    if (!aXj())
    {
      GMTrace.o(5993761079296L, 44657);
      return false;
    }
    if ((this.nHO != null) && (this.nHO.size() == this.nHM)) {
      if (this.nHM > 0)
      {
        if ((this.nHR != null) && (this.mCount > 0) && (this.mCount <= aXi()))
        {
          GMTrace.o(5993761079296L, 44657);
          return true;
        }
      }
      else if (this.nHM == 0)
      {
        GMTrace.o(5993761079296L, 44657);
        return true;
      }
    }
    GMTrace.o(5993761079296L, 44657);
    return false;
  }
  
  public final boolean aXl()
  {
    GMTrace.i(5993895297024L, 44658);
    if (!aXk())
    {
      GMTrace.o(5993895297024L, 44658);
      return false;
    }
    if (this.nHI == null)
    {
      GMTrace.o(5993895297024L, 44658);
      return false;
    }
    if ((!aWZ().aXv()) && (this.nHH == null))
    {
      GMTrace.o(5993895297024L, 44658);
      return false;
    }
    GMTrace.o(5993895297024L, 44658);
    return true;
  }
  
  public final LinkedList<azu> aXm()
  {
    GMTrace.i(5994029514752L, 44659);
    LinkedList localLinkedList = new LinkedList();
    azu localazu = new azu();
    localazu.jhc = this.mCount;
    localazu.usG = this.nHC.nIc;
    localazu.uJW = this.nHC.nIk;
    localazu.uJX = this.nHG;
    localLinkedList.add(localazu);
    GMTrace.o(5994029514752L, 44659);
    return localLinkedList;
  }
  
  public final beh aXn()
  {
    GMTrace.i(5994163732480L, 44660);
    beh localbeh = new beh();
    localbeh.tYP = this.nHE;
    localbeh.nFo = 1;
    localbeh.uPW = new LinkedList();
    aup localaup = new aup();
    localaup.jhc = this.mCount;
    localaup.usG = this.nHC.nIc;
    localaup.lPi = this.nHC.nIg.name;
    if (this.nHR != null) {}
    Iterator localIterator;
    Object localObject;
    for (localaup.uJV = this.nHR.nHV;; localaup.uJV = this.nHC.nIg.nIt)
    {
      localaup.uJW = this.nHC.nIk;
      localaup.uJX = this.nHG;
      localaup.jib = this.nHC.nId;
      localaup.uJT = this.nHM;
      localaup.uJU = new LinkedList();
      localIterator = this.nHO.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        String str = (String)this.nHO.get(localObject);
        akq localakq = new akq();
        localakq.tVN = ((String)localObject);
        localakq.oqQ = str;
        localaup.uJU.add(localakq);
      }
    }
    localaup.uKb = new LinkedList();
    localaup.uKa = 0;
    if ((this.nHT != null) && (this.nHT.size() > 0))
    {
      localIterator = this.nHT.values().iterator();
      while (localIterator.hasNext())
      {
        localObject = (LinkedList)localIterator.next();
        localaup.uKb.addAll((Collection)localObject);
        int i = localaup.uKa;
        localaup.uKa = (((LinkedList)localObject).size() + i);
      }
    }
    localbeh.uPW.add(localaup);
    localbeh.uPY = new LinkedList();
    localbeh.uPZ = 1;
    this.nHJ = aXe();
    if (this.nHJ != null) {
      localbeh.uPY.add(this.nHJ);
    }
    for (;;)
    {
      localbeh.urB = this.nHI;
      localbeh.uPX = this.nHH;
      GMTrace.o(5994163732480L, 44660);
      return localbeh;
      this.nHJ = new axt();
      this.nHJ.uMp = 0;
      localbeh.uPY.add(this.nHJ);
    }
  }
  
  public final void aXo()
  {
    GMTrace.i(5994297950208L, 44661);
    if (this.nHO == null)
    {
      GMTrace.o(5994297950208L, 44661);
      return;
    }
    Iterator localIterator1 = this.nHC.nIg.nIC.iterator();
    if (localIterator1.hasNext())
    {
      com.tencent.mm.plugin.product.c.m localm = (com.tencent.mm.plugin.product.c.m)localIterator1.next();
      Iterator localIterator2 = localm.nIQ.iterator();
      label68:
      h localh;
      Object localObject;
      String str2;
      boolean bool;
      if (localIterator2.hasNext())
      {
        localh = (h)localIterator2.next();
        localObject = localm.nIO;
        str2 = localh.id;
        if ((this.nHO != null) && (this.nHN != null)) {
          break label182;
        }
        bool = false;
      }
      for (;;)
      {
        localh.nII = bool;
        w.d("MicroMsg.MallProductManager", "(" + localm.nIO + " , " + localh.id + ") hasStock--> " + localh.nII);
        break label68;
        break;
        label182:
        String str1;
        if (this.nHO.containsKey(localObject))
        {
          str1 = (String)this.nHO.get(localObject);
          this.nHO.put(localObject, str2);
          str2 = F(this.nHO);
          this.nHO.put(localObject, str1);
          localObject = (e)this.nHN.get(str2);
          if (localObject != null)
          {
            if (((e)localObject).nIe > 0) {
              bool = true;
            } else {
              bool = false;
            }
          }
          else {
            bool = false;
          }
        }
        else
        {
          this.nHO.put(localObject, str2);
          str1 = F(this.nHO);
          this.nHO.remove(localObject);
          localObject = (e)this.nHN.get(str1);
          if (localObject != null)
          {
            if (((e)localObject).nIe > 0) {
              bool = true;
            } else {
              bool = false;
            }
          }
          else {
            bool = false;
          }
        }
      }
    }
    GMTrace.o(5994297950208L, 44661);
  }
  
  public final String aXp()
  {
    GMTrace.i(5994700603392L, 44664);
    Object localObject = new f.a();
    ((f.a)localObject).title = this.nHC.nIg.name;
    ((f.a)localObject).description = aXq();
    ((f.a)localObject).type = 13;
    ((f.a)localObject).url = aXh();
    ((f.a)localObject).thumburl = this.nHC.aXs();
    ((f.a)localObject).giW = this.nHC.nId;
    ((f.a)localObject).giX = a(this.nHC);
    localObject = f.a.a((f.a)localObject, null, null);
    GMTrace.o(5994700603392L, 44664);
    return (String)localObject;
  }
  
  public final String aXq()
  {
    GMTrace.i(5994834821120L, 44665);
    String str = b.c(this.nHC.nIg.nIu, this.nHC.nIg.nEr);
    GMTrace.o(5994834821120L, 44665);
    return str;
  }
  
  public final void clear()
  {
    GMTrace.i(5991345160192L, 44639);
    this.nHC = null;
    if (this.nHD != null)
    {
      this.nHD.clear();
      this.nHD = null;
    }
    this.nHE = null;
    this.nHF = null;
    this.mCount = 1;
    this.nHG = null;
    this.nHH = null;
    this.nHJ = null;
    this.nHK = null;
    this.nHM = 0;
    this.nHR = null;
    if (this.nHN != null)
    {
      this.nHN.clear();
      this.nHN = null;
    }
    if (this.nHO != null) {
      this.nHO.clear();
    }
    if (this.nHP != null)
    {
      this.nHP.clear();
      this.nHP = null;
    }
    if (this.nHT != null)
    {
      this.nHT.clear();
      this.nHT = null;
    }
    GMTrace.o(5991345160192L, 44639);
  }
  
  public final String getAppId()
  {
    GMTrace.i(5992955772928L, 44651);
    if (this.nHC.nIh != null)
    {
      String str = this.nHC.nIh.eSd;
      GMTrace.o(5992955772928L, 44651);
      return str;
    }
    GMTrace.o(5992955772928L, 44651);
    return null;
  }
  
  public final void su(int paramInt)
  {
    GMTrace.i(5992284684288L, 44646);
    if (this.nHP == null)
    {
      GMTrace.o(5992284684288L, 44646);
      return;
    }
    if ((paramInt < this.nHP.size()) && (paramInt >= 0)) {
      this.nHH = ((rz)this.nHP.get(paramInt));
    }
    GMTrace.o(5992284684288L, 44646);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */