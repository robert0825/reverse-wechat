package com.tencent.mm.plugin.sns.model;

import android.text.TextUtils;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.a.ml;
import com.tencent.mm.g.a.ml.a;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.g.a.mm.a;
import com.tencent.mm.g.a.pv;
import com.tencent.mm.g.a.pw;
import com.tencent.mm.g.a.tm;
import com.tencent.mm.g.a.tm.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.n.a;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.f;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.amb;
import com.tencent.mm.protocal.c.ans;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.anx;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.protocal.c.bfc;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfr;
import com.tencent.mm.protocal.c.bfs;
import com.tencent.mm.protocal.c.bft;
import com.tencent.mm.protocal.c.bfw;
import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.bhf;
import com.tencent.mm.protocal.c.bhq;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.bjz;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.jj;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.t;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class r
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public int fUO;
  private com.tencent.mm.sdk.b.c fUR;
  private com.tencent.mm.sdk.b.c fUS;
  private com.tencent.mm.ad.b fUa;
  public com.tencent.mm.ad.e fUd;
  boolean jPB;
  int ppo;
  public String psA;
  private biz psr;
  private biz pss;
  long pst;
  private int psu;
  private tm psv;
  public int psw;
  public String psx;
  public HashMap<String, anu> psy;
  public HashMap<String, Integer> psz;
  
  public r(String paramString1, int paramInt1, int paramInt2, List<String> paramList, biz parambiz, int paramInt3, String paramString2, int paramInt4, LinkedList<Long> paramLinkedList, int paramInt5, anv paramanv, boolean paramBoolean, LinkedList<azq> paramLinkedList1, bfr parambfr, com.tencent.mm.bm.b paramb, String paramString3)
  {
    GMTrace.i(8149297790976L, 60717);
    this.pst = 0L;
    this.jPB = false;
    this.psu = 0;
    this.fUO = 0;
    this.psx = "";
    this.psy = new HashMap();
    this.psz = new HashMap();
    this.psA = "";
    this.fUR = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(mm paramAnonymousmm)
      {
        GMTrace.i(8069706678272L, 60124);
        if (!r.this.psz.containsKey(paramAnonymousmm.eRt.filePath))
        {
          GMTrace.o(8069706678272L, 60124);
          return false;
        }
        int i = ((Integer)r.this.psz.remove(paramAnonymousmm.eRt.filePath)).intValue();
        try
        {
          str1 = URLEncoder.encode(paramAnonymousmm.eRt.result, "UTF-8");
          if (r.this.fUO != 0)
          {
            paramAnonymousmm = (anu)r.this.psy.get(paramAnonymousmm.eRt.filePath);
            r.this.psx += String.format("position=%d&qrUrl=%s&md5=%s&imgUrl=%s|", new Object[] { Integer.valueOf(i), str1, paramAnonymousmm.uDc, paramAnonymousmm.lPM });
          }
          if (r.this.psw == 12)
          {
            str1 = "2,3,," + str1;
            paramAnonymousmm = str1;
            if (i != 0) {}
          }
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          try
          {
            String str1;
            paramAnonymousmm = str1 + "," + URLEncoder.encode(r.this.psA, "UTF-8");
            w.i("MicroMsg.NetSceneSnsPost", "androidSystemShareFixed(13717) fileToIndex:%d,  %s", new Object[] { Integer.valueOf(i), paramAnonymousmm });
            com.tencent.mm.plugin.report.service.g.ork.A(13717, paramAnonymousmm);
            r.this.biw();
            GMTrace.o(8069706678272L, 60124);
            return false;
            localUnsupportedEncodingException = localUnsupportedEncodingException;
            w.printErrStackTrace("MicroMsg.NetSceneSnsPost", localUnsupportedEncodingException, "", new Object[0]);
            str2 = "";
          }
          catch (UnsupportedEncodingException paramAnonymousmm)
          {
            for (;;)
            {
              String str2;
              paramAnonymousmm = str2;
            }
          }
        }
      }
    };
    this.fUS = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(ml paramAnonymousml)
      {
        GMTrace.i(18585665667072L, 138474);
        if (!r.this.psz.containsKey(paramAnonymousml.eRs.filePath))
        {
          GMTrace.o(18585665667072L, 138474);
          return false;
        }
        int i = ((Integer)r.this.psz.remove(paramAnonymousml.eRs.filePath)).intValue();
        String str;
        if (r.this.psw == 12)
        {
          str = "2,3,,";
          paramAnonymousml = str;
          if (i != 0) {}
        }
        try
        {
          paramAnonymousml = "2,3,," + "," + URLEncoder.encode(r.this.psA, "UTF-8");
          w.i("MicroMsg.NetSceneSnsPost", "androidSystemShareFixed(13717) fileToIndex:%d,  %s", new Object[] { Integer.valueOf(i), paramAnonymousml });
          com.tencent.mm.plugin.report.service.g.ork.A(13717, paramAnonymousml);
          r.this.biw();
          GMTrace.o(18585665667072L, 138474);
          return false;
        }
        catch (UnsupportedEncodingException paramAnonymousml)
        {
          for (;;)
          {
            paramAnonymousml = str;
          }
        }
      }
    };
    this.psr = parambiz;
    this.ppo = paramInt3;
    this.psw = paramInt5;
    localObject1 = new b.a();
    ((b.a)localObject1).gtF = new bfs();
    ((b.a)localObject1).gtG = new bft();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/mmsnspost";
    ((b.a)localObject1).gtE = 209;
    ((b.a)localObject1).gtH = 97;
    ((b.a)localObject1).gtI = 1000000097;
    this.fUa = ((b.a)localObject1).DA();
    bfs localbfs = (bfs)this.fUa.gtC.gtK;
    if (!TextUtils.isEmpty(parambiz.pwN.tOK.tOE))
    {
      localObject1 = new jj();
      ((jj)localObject1).tYU = parambiz.pwN.tOK.tOE;
      localbfs.uRA = ((jj)localObject1);
    }
    localObject1 = u.Av().gx(paramanv.eDA);
    Object localObject2;
    if (localObject1 != null)
    {
      this.psv = new tm();
      this.psv.eZa.eZb = ((u.b)localObject1).getString("prePublishId", "");
      this.psv.eZa.url = ((u.b)localObject1).getString("url", "");
      this.psv.eZa.eZd = ((u.b)localObject1).getString("preUsername", "");
      this.psv.eZa.eZe = ((u.b)localObject1).getString("preChatName", "");
      this.psv.eZa.eZf = ((u.b)localObject1).getInt("preMsgIndex", 0);
      this.psv.eZa.eZj = ((u.b)localObject1).getInt("sendAppMsgScene", 0);
      this.psv.eZa.eZk = ((u.b)localObject1).getInt("getA8KeyScene", 0);
      this.psv.eZa.eZl = ((u.b)localObject1).getString("referUrl", null);
      this.psv.eZa.eZm = ((u.b)localObject1).getString("adExtStr", null);
      this.psv.eZa.eZn = paramString3;
      localObject1 = "";
      paramString3 = (String)localObject1;
      if (parambiz.pTh != null)
      {
        localObject2 = new bhf();
        paramString3 = Base64.decode(parambiz.pTh, 0);
      }
    }
    try
    {
      ((bhf)localObject2).aD(paramString3);
      paramString3 = (String)localObject1;
      if (((bhf)localObject2).uTd != null) {
        paramString3 = ((bhf)localObject2).uTd.lMv;
      }
    }
    catch (Exception paramString3)
    {
      for (;;)
      {
        int i;
        int j;
        paramString3 = (String)localObject1;
      }
    }
    localObject1 = paramString3;
    if (bg.nm(paramString3))
    {
      localObject1 = paramString3;
      if (parambiz.uUb != null) {
        localObject1 = parambiz.uUb.mmR;
      }
    }
    localbfs.uRz = String.format(Locale.US, "prePublishId=%s&preUserName=%s&preChatName=%s&preChatType=%d&getA8KeyScene=%d&sourceAppId=%s", new Object[] { this.psv.eZa.eZb, this.psv.eZa.eZd, this.psv.eZa.eZe, Integer.valueOf(t.H(this.psv.eZa.eZd, this.psv.eZa.eZe)), Integer.valueOf(this.psv.eZa.eZk), localObject1 });
    paramString3 = new azp();
    paramString3.be(paramString1.getBytes());
    i = paramString1.length();
    j = paramString3.uNN;
    if (paramb == null) {}
    for (paramInt3 = 0;; paramInt3 = paramb.tJp.length)
    {
      w.i("MicroMsg.NetSceneSnsPost", "len:%d   skb:%d ctx.len:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt3) });
      localbfs.uQM = paramString3;
      localbfs.uRu = paramInt1;
      localbfs.uDl = paramInt2;
      localbfs.tPP = paramString2;
      this.psu = paramInt1;
      if (com.tencent.mm.platformtools.r.hjL)
      {
        localbfs.uQM = new azp();
        w.e("MicroMsg.NetSceneSnsPost", "post error setObjectDesc is null!");
      }
      paramString3 = new LinkedList();
      if ((paramList == null) || (paramList.size() <= 0)) {
        break label939;
      }
      paramList = paramList.iterator();
      for (paramString1 = ""; paramList.hasNext(); paramString1 = paramString1 + "; + " + (String)localObject1)
      {
        localObject1 = (String)paramList.next();
        localObject2 = new azq();
        ((azq)localObject2).Rq((String)localObject1);
        paramString3.add(localObject2);
      }
    }
    w.d("MicroMsg.NetSceneSnsPost", "post with list : " + paramString1);
    label939:
    localbfs.uQW = paramString3;
    localbfs.uQV = paramString3.size();
    localbfs.uRv = paramInt4;
    paramString1 = localbfs.uRz;
    if (paramanv.uDD != null)
    {
      paramInt1 = paramanv.uDD.uQy;
      w.d("MicroMsg.NetSceneSnsPost", "setObjectSource: %d, clientid:%s fromScene:%s, score:%d", new Object[] { Integer.valueOf(paramInt5), paramString2, paramString1, Integer.valueOf(paramInt1) });
      if ((paramLinkedList1 != null) && (paramLinkedList1.size() > 0))
      {
        if (!paramBoolean) {
          break label1219;
        }
        localbfs.uRb = paramLinkedList1;
        localbfs.uRa = paramLinkedList1.size();
      }
    }
    for (;;)
    {
      w.d("MicroMsg.NetSceneSnsPost", "setObjectSource " + paramInt5);
      localbfs.uRw = paramInt5;
      paramString1 = new bjz();
      if (!bg.nm(paramanv.token))
      {
        paramString1.uUQ = paramanv.token;
        paramString1.uUR = paramanv.uDu;
        localbfs.uJw = paramString1;
      }
      if ((paramLinkedList == null) || (paramLinkedList.isEmpty())) {
        break label1283;
      }
      localbfs.uFY = paramLinkedList.size();
      paramString1 = paramLinkedList.iterator();
      while (paramString1.hasNext())
      {
        paramList = (Long)paramString1.next();
        paramString2 = new bfc();
        paramString2.uQK = paramList.longValue();
        localbfs.uDr.add(paramString2);
      }
      paramInt1 = 0;
      break;
      label1219:
      localbfs.uDw = paramLinkedList1;
      localbfs.uRc = paramLinkedList1.size();
    }
    w.d("MicroMsg.NetSceneSnsPost", "tagid " + paramLinkedList.size() + " " + localbfs.uDr.toString());
    label1283:
    localbfs.uDx = parambfr;
    if (!bg.nm(paramanv.uDz)) {
      localbfs.uRe = new bfw();
    }
    if (parambfr != null) {
      w.d("MicroMsg.NetSceneSnsPost", "SnsPostOperationFields: ShareUrlOriginal=%s, ShareUrlOpen=%s, JsAppId=%s", new Object[] { parambfr.tQR, parambfr.tQS, parambfr.tQT });
    }
    if (paramb != null) {
      localbfs.uRy = new azp().b(paramb);
    }
    localbfs.uRD = paramanv.uDD;
    paramString1 = ae.bjd().va(this.ppo);
    if ((paramString1 != null) && ((paramString1.field_type == 1) || (paramString1.field_type == 15)) && (parambiz.uUc != null) && (parambiz.uUc.ueW != null) && (parambiz.uUc.ueW.size() > 0) && (paramanv.uDm != null) && (paramanv.uDm.size() == parambiz.uUc.ueW.size()))
    {
      paramString1 = ae.getAccSnsPath();
      paramList = parambiz.uUc.ueW.iterator();
      paramInt1 = 0;
    }
    for (;;)
    {
      if (paramList.hasNext())
      {
        paramLinkedList = (anu)paramList.next();
        if ((paramLinkedList.jib == 2) || (paramLinkedList.jib == 6))
        {
          parambiz = new ans();
          if (paramLinkedList.jib != 2) {
            break label1763;
          }
          paramInt2 = 2;
          label1562:
          parambiz.lSq = paramInt2;
          if (paramLinkedList.jib == 6)
          {
            paramString2 = am.dE(paramString1, paramLinkedList.mmR);
            paramLinkedList = i.p(paramLinkedList);
            paramString2 = com.tencent.mm.plugin.sight.base.d.GB(paramString2 + paramLinkedList);
            if (paramString2 != null) {
              parambiz.uCL = ((int)Math.round(paramString2.ljb / 1000.0D));
            }
          }
          paramString2 = (amb)paramanv.uDm.get(paramInt1);
          paramString2 = ae.biS().dV(paramString2.uAW);
        }
      }
      try
      {
        parambiz.tQP = ((anx)new anx().aD(paramString2.pMO)).uDP;
        w.i("MicroMsg.NetSceneSnsPost", "post add mediaInfo, Source: %s, videoPlayLength: %s, MediaType: %s", new Object[] { Integer.valueOf(parambiz.tQP), Integer.valueOf(parambiz.uCL), Integer.valueOf(parambiz.lSq) });
        localbfs.uRC.add(parambiz);
        paramInt1 += 1;
        continue;
        label1763:
        paramInt2 = 1;
        break label1562;
        localbfs.uRB = localbfs.uRC.size();
        w.i("MicroMsg.NetSceneSnsPost", "post mediaCount: %s", new Object[] { Integer.valueOf(localbfs.uRB) });
        localbfs.uAI = new azp().be(com.tencent.mm.plugin.normsg.a.d.nxJ.aUq());
        GMTrace.o(8149297790976L, 60717);
        return;
      }
      catch (Exception paramString2)
      {
        for (;;) {}
      }
    }
  }
  
  private void Hn(String paramString)
  {
    GMTrace.i(18585934102528L, 138476);
    this.psA = paramString;
    paramString = com.tencent.mm.y.c.c.Ct().er("100132");
    if (paramString.isValid()) {
      this.fUO = bg.getInt((String)paramString.bSg().get("needUploadData"), 1);
    }
    if ((this.psw != 12) && (this.fUO == 0))
    {
      GMTrace.o(18585934102528L, 138476);
      return;
    }
    if ((this.pss != null) && (this.pss.uUc != null) && (this.pss.uUc.ueW != null) && (this.pss.uUc.ueW.size() > 0))
    {
      paramString = this.pss.uUc.ueW;
      com.tencent.mm.sdk.b.a.vgX.b(this.fUR);
      com.tencent.mm.sdk.b.a.vgX.b(this.fUS);
      paramString = paramString.iterator();
      int i = 0;
      while (paramString.hasNext())
      {
        Object localObject = (anu)paramString.next();
        if (((anu)localObject).jib == 2)
        {
          String str = g.B((anu)localObject);
          if (!bg.nm(str))
          {
            this.psz.put(str, Integer.valueOf(i));
            this.psy.put(str, localObject);
            localObject = new mk();
            ((mk)localObject).eRq.filePath = str;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
            i += 1;
          }
        }
      }
    }
    GMTrace.o(18585934102528L, 138476);
  }
  
  private static boolean a(biz parambiz1, biz parambiz2)
  {
    GMTrace.i(8149834661888L, 60721);
    if ((parambiz1 == null) || (parambiz2 == null) || (parambiz1.uUc == null) || (parambiz2.uUc == null))
    {
      GMTrace.o(8149834661888L, 60721);
      return false;
    }
    String str1 = ae.getAccSnsPath();
    int i = 0;
    while ((i < parambiz1.uUc.ueW.size()) && (i < parambiz2.uUc.ueW.size()))
    {
      Object localObject2 = (anu)parambiz1.uUc.ueW.get(i);
      Object localObject1 = (anu)parambiz2.uUc.ueW.get(i);
      String str2 = i.m((anu)localObject2);
      String str3 = i.n((anu)localObject2);
      String str4 = i.o((anu)localObject2);
      String str5 = i.p((anu)localObject2);
      String str6 = i.l((anu)localObject1);
      String str7 = i.e((anu)localObject1);
      String str8 = i.f((anu)localObject1);
      String str9 = i.j((anu)localObject1);
      w.d("MicroMsg.NetSceneSnsPost", "updateMediaFileName " + str2 + "  - " + str6);
      localObject2 = am.dE(str1, ((anu)localObject2).mmR);
      localObject1 = am.dE(str1, ((anu)localObject1).mmR);
      FileOp.la((String)localObject1);
      FileOp.al((String)localObject2 + str2, (String)localObject1 + str6);
      FileOp.al((String)localObject2 + str3, (String)localObject1 + str7);
      FileOp.al((String)localObject2 + str4, (String)localObject1 + str8);
      if (FileOp.aZ((String)localObject2 + str5))
      {
        w.i("MicroMsg.NetSceneSnsPost", "post done copy file %s", new Object[] { (String)localObject1 + str9 });
        FileOp.al((String)localObject2 + str5, (String)localObject1 + str9);
      }
      i += 1;
    }
    GMTrace.o(8149834661888L, 60721);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8149432008704L, 60718);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8149432008704L, 60718);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8149566226432L, 60719);
    w.i("MicroMsg.NetSceneSnsPost", "post netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    Object localObject1 = (bft)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if (paramInt2 == 4) {
      paramq = ae.bjd().va(this.ppo);
    }
    try
    {
      paramArrayOfByte = (anv)new anv().aD(paramq.field_postBuf);
      paramArrayOfByte.uDt = paramInt3;
      paramArrayOfByte.uDB = ((bft)localObject1).uDB;
      paramArrayOfByte.uDC = false;
      paramq.field_postBuf = paramArrayOfByte.toByteArray();
      if (paramq != null)
      {
        paramq.bmc();
        ae.bjd().b(this.ppo, paramq);
        ae.bjc().up(this.ppo);
        w.d("MicroMsg.NetSceneSnsPost", "onErrorServer, publish SnsPostFailEvent, snsInfoLocalId: " + paramq.blY());
        paramq = new pv();
        paramq.eUA.eUB = this.ppo;
        com.tencent.mm.sdk.b.a.vgX.m(paramq);
      }
      if ((this.psr != null) && (this.psr.uUc != null) && (this.psr.uUc.ueV == 21))
      {
        com.tencent.mm.plugin.sns.lucky.a.b.nU(8);
        switch (paramInt3)
        {
        default: 
          com.tencent.mm.plugin.sns.lucky.a.b.nU(20);
        }
      }
      for (;;)
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8149566226432L, 60719);
        return;
        com.tencent.mm.plugin.sns.lucky.a.b.nU(17);
        continue;
        com.tencent.mm.plugin.sns.lucky.a.b.nU(19);
        continue;
        com.tencent.mm.plugin.sns.lucky.a.b.nU(18);
      }
      if (paramInt3 != 0)
      {
        ae.bjc().up(this.ppo);
        if ((this.psr != null) && (this.psr.uUc != null) && (this.psr.uUc.ueV == 21))
        {
          com.tencent.mm.plugin.sns.lucky.a.b.nU(8);
          com.tencent.mm.plugin.sns.lucky.a.b.nU(16);
        }
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8149566226432L, 60719);
        return;
      }
      if ((((bft)localObject1).uQe == null) || (((bft)localObject1).uQe.uQM == null) || (((bft)localObject1).uQe.uQM.uNP == null))
      {
        w.e("MicroMsg.NetSceneSnsPost", "err respone buffer is null ignore");
        ae.bjc().up(this.ppo);
        paramq = ae.bjd().va(this.ppo);
        paramq.bmb();
        ae.bjd().b(this.ppo, paramq);
        paramq = new pw();
        paramq.eUC.eUB = this.ppo;
        com.tencent.mm.sdk.b.a.vgX.m(paramq);
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8149566226432L, 60719);
        return;
      }
      Object localObject2 = new String(((bft)localObject1).uQe.uQM.uNP.toByteArray());
      if (this.psu == 0) {
        w.d("MicroMsg.NetSceneSnsPost", "resp " + (String)localObject2 + "  ");
      }
      this.pss = com.tencent.mm.modelsns.e.lz((String)localObject2);
      if (this.pss.uUh != null)
      {
        paramq = this.pss.mmR;
        paramArrayOfByte = this.pss.uUh.gkP;
        String str = this.pss.uUh.gkO;
        com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
        locald.q("20CurrPublishId", paramq + ",");
        locald.q("20SourcePublishId", paramArrayOfByte + ",");
        locald.q("20SourceAdUxInfo", str + ",");
        w.i("MicroMsg.SnsVideoStatistic", "report snsad_shareReport: " + locald.LT());
        com.tencent.mm.plugin.report.service.g.ork.i(13004, new Object[] { locald });
      }
      paramArrayOfByte = ae.bjd().va(this.ppo);
      paramq = paramArrayOfByte;
      if (paramArrayOfByte == null)
      {
        w.e("MicroMsg.NetSceneSnsPost", "the item has delete");
        paramq = new m();
      }
      paramq.gl(((bft)localObject1).uQe.nFd);
      paramq.Iq((String)localObject2);
      paramq.field_localFlag &= 0xFFFFFFEF;
      paramq.dQ(((bft)localObject1).uQe.tXT);
      paramq.dS(((bft)localObject1).uQe.tXT);
      if ((((bft)localObject1).uQe.uEI & 0x1) > 0) {
        paramq.blV();
      }
      this.pst = ((bft)localObject1).uQe.tXT;
      if (this.psv != null)
      {
        this.psv.eZa.eZc = ("sns_" + i.dt(this.pst));
        com.tencent.mm.sdk.b.a.vgX.m(this.psv);
      }
      localObject2 = ((bft)localObject1).uQe;
      ((bfh)localObject2).uQM.be(new byte[0]);
      try
      {
        if ((((bfh)localObject2).uQS == 0) && (((bfh)localObject2).uQP == 0) && (((bfh)localObject2).uQV == 0) && (((bfh)localObject2).uFY == 0)) {
          w.d("MicroMsg.NetSceneSnsPost", "no use! this buf");
        }
        for (;;)
        {
          paramq.bmb();
          ae.bjd().b(this.ppo, paramq);
          ae.bjc().up(this.ppo);
          paramArrayOfByte = com.tencent.mm.plugin.sns.h.e.pBV.br(Integer.valueOf(this.ppo));
          if ((paramArrayOfByte != null) && (this.pss != null))
          {
            paramArrayOfByte.LO();
            paramArrayOfByte.LP();
            paramArrayOfByte.lw(this.pss.mmR);
            paramArrayOfByte.hd(this.pss.uUc.ueV);
            paramArrayOfByte.LR();
          }
          paramArrayOfByte = f.pBV.br(Integer.valueOf(this.ppo));
          if ((paramArrayOfByte != null) && (this.pss != null))
          {
            paramArrayOfByte.LO();
            paramArrayOfByte.LP();
            paramArrayOfByte.lw(this.pss.mmR);
            paramArrayOfByte.hd(this.pss.uUc.ueV);
            paramArrayOfByte.LR();
          }
          paramArrayOfByte = new pw();
          paramArrayOfByte.eUC.eUB = this.ppo;
          com.tencent.mm.sdk.b.a.vgX.m(paramArrayOfByte);
          if (paramq.field_type == 21)
          {
            if (paramq.field_pravited != 1) {
              paramInt1 = ((bft)localObject1).uQe.uEI;
            }
            com.tencent.mm.plugin.sns.lucky.a.b.nU(7);
            paramArrayOfByte = this.pss.mmR;
            System.currentTimeMillis();
          }
          a(this.psr, this.pss);
          if (this.pss != null) {
            break;
          }
          paramArrayOfByte = "";
          Hn(paramArrayOfByte);
          if (ae.biZ() != null) {
            ae.biZ().bhR();
          }
          try
          {
            if (paramq.field_type == 15)
            {
              localObject1 = (anu)this.pss.uUc.ueW.get(0);
              if (localObject1 != null)
              {
                paramq = am.dE(ae.getAccSnsPath(), ((anu)localObject1).mmR) + i.j((anu)localObject1);
                paramArrayOfByte = com.tencent.mm.modelvideo.n.Nf();
                localObject1 = ((anu)localObject1).lPM;
                l = ((bfh)localObject2).tXT;
                if (!bg.nm((String)localObject1))
                {
                  boolean bool = bg.nm(paramq);
                  if (!bool) {
                    break label1547;
                  }
                }
              }
            }
          }
          catch (Exception paramq)
          {
            long l;
            for (;;) {}
          }
          this.fUd.a(paramInt2, paramInt3, paramString, this);
          GMTrace.o(8149566226432L, 60719);
          return;
          paramq.aE(((bfh)localObject2).toByteArray());
        }
      }
      catch (IOException paramArrayOfByte)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.NetSceneSnsPost", paramArrayOfByte, "", new Object[0]);
          continue;
          paramArrayOfByte = this.pss.uTZ;
          continue;
          label1547:
          localObject2 = ((String)localObject1).hashCode();
          w.d("MicroMsg.SubCoreMediaRpt", "rpt sns video upload info snsKey[%s] url[%s] snsId[%d] path[%s]", new Object[] { localObject2, localObject1, Long.valueOf(l), paramq });
          localObject1 = (n.a)paramArrayOfByte.hbI.get(localObject2);
          if (localObject1 != null)
          {
            ((n.a)localObject1).hbW = String.valueOf(l);
            ((n.a)localObject1).hbV = paramq;
            paramArrayOfByte.a(((n.a)localObject1).hbm, (String)localObject2);
          }
        }
      }
    }
    catch (Exception paramArrayOfByte)
    {
      for (;;) {}
    }
  }
  
  public final void biw()
  {
    GMTrace.i(16042239721472L, 119524);
    if (this.psz.isEmpty())
    {
      com.tencent.mm.sdk.b.a.vgX.c(this.fUR);
      com.tencent.mm.sdk.b.a.vgX.c(this.fUS);
      if ((this.fUO != 0) && (!bg.nm(this.psx))) {
        if (this.pss.uUb != null) {
          break label183;
        }
      }
    }
    label183:
    for (String str = "";; str = this.pss.uUb.mmR)
    {
      int i = this.pss.uUc.ueW.size();
      w.i("MicroMsg.NetSceneSnsPost", "report qrCodeImgSns(13627), snsId:%s, size:%d, info:%s, appId:%s", new Object[] { this.pss.mmR, Integer.valueOf(i), this.psx, str });
      com.tencent.mm.modelstat.n.r(13627, String.format(Locale.US, "%s,%d,%s,%s", new Object[] { this.pss.mmR, Integer.valueOf(i), this.psx, str }));
      GMTrace.o(16042239721472L, 119524);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8149968879616L, 60722);
    GMTrace.o(8149968879616L, 60722);
    return 209;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */