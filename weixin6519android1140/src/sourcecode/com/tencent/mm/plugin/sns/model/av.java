package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.a.pv;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.sns.b.l;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.amb;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.anr;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.anw;
import com.tencent.mm.protocal.c.anx;
import com.tencent.mm.protocal.c.bgp;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.brn;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class av
  implements com.tencent.mm.ad.e, l
{
  public static int pqL;
  private String fJS;
  public Set<a> fMZ;
  public r pwm;
  public ab.a pwn;
  
  static
  {
    GMTrace.i(8120306761728L, 60501);
    pqL = 0;
    GMTrace.o(8120306761728L, 60501);
  }
  
  public av()
  {
    GMTrace.i(8116817100800L, 60475);
    this.fJS = "";
    this.pwm = null;
    this.fMZ = new HashSet();
    this.pwn = new ab.a()
    {
      public final void hC(boolean paramAnonymousBoolean)
      {
        GMTrace.i(8051050414080L, 59985);
        if (!paramAnonymousBoolean) {
          av.this.bhR();
        }
        GMTrace.o(8051050414080L, 59985);
      }
    };
    GMTrace.o(8116817100800L, 60475);
  }
  
  private void G(final int paramInt, final boolean paramBoolean)
  {
    GMTrace.i(8118696148992L, 60489);
    ae.aDa().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8070646202368L, 60131);
        if (ae.biM())
        {
          w.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
          GMTrace.o(8070646202368L, 60131);
          return;
        }
        Iterator localIterator = av.this.fMZ.iterator();
        while (localIterator.hasNext())
        {
          av.a locala = (av.a)localIterator.next();
          if (locala != null) {
            locala.H(paramInt, paramBoolean);
          }
        }
        GMTrace.o(8070646202368L, 60131);
      }
    });
    GMTrace.o(8118696148992L, 60489);
  }
  
  private int a(final int paramInt1, final boolean paramBoolean, final anv paramanv, final int paramInt2)
  {
    GMTrace.i(8118830366720L, 60490);
    if (paramInt1 == -1)
    {
      w.e("MicroMsg.UploadManager", "uploading depend localMediaId can not get the media");
      paramInt1 = b.pwA;
      GMTrace.o(8118830366720L, 60490);
      return paramInt1;
    }
    final Object localObject = ae.biS().dV(paramInt1);
    anx localanx;
    try
    {
      localanx = (anx)new anx().aD(((com.tencent.mm.plugin.sns.storage.q)localObject).pMO);
      w.i("MicroMsg.UploadManager", "state " + localanx.uDK + " pic isMuti: " + paramBoolean);
      if (localanx.uDK == 1)
      {
        paramInt1 = b.pwA;
        GMTrace.o(8118830366720L, 60490);
        return paramInt1;
      }
    }
    catch (Exception paramanv)
    {
      w.e("MicroMsg.UploadManager", "parse uploadInfo error");
      paramInt1 = b.pwA;
      GMTrace.o(8118830366720L, 60490);
      return paramInt1;
    }
    String str = i.GQ(((com.tencent.mm.plugin.sns.storage.q)localObject).pMK);
    str = am.dE(ae.getAccSnsPath(), ((com.tencent.mm.plugin.sns.storage.q)localObject).pMK) + str;
    if (FileOp.kX(str) == 0L)
    {
      w.i("MicroMsg.UploadManager", "path not exist  " + str);
      paramInt1 = b.pwA;
      GMTrace.o(8118830366720L, 60490);
      return paramInt1;
    }
    if (localanx.uDK == 0)
    {
      paramInt1 = b.pwB;
      GMTrace.o(8118830366720L, 60490);
      return paramInt1;
    }
    if (ae.bjc().uq(paramInt1))
    {
      ae.biS().a(paramInt1, (com.tencent.mm.plugin.sns.storage.q)localObject);
      localObject = com.tencent.mm.a.g.n((bg.Pw() + " " + System.currentTimeMillis()).getBytes());
      ae.aDa().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8142318469120L, 60665);
          if (ae.biM())
          {
            w.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
            GMTrace.o(8142318469120L, 60665);
            return;
          }
          y localy = new y(paramInt1, localObject, paramBoolean, paramInt2);
          ae.bjc().cW(paramInt1, localy.hashCode());
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(localy, 0);
          GMTrace.o(8142318469120L, 60665);
        }
      });
    }
    paramInt1 = b.pwC;
    GMTrace.o(8118830366720L, 60490);
    return paramInt1;
  }
  
  public static aw a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8117622407168L, 60481);
    w.d("MicroMsg.UploadManager", "appmsg.description " + paramWXMediaMessage.description);
    w.d("MicroMsg.UploadManager", "appmsg.title " + paramWXMediaMessage.title);
    Object localObject = paramWXMediaMessage.mediaObject;
    int i;
    switch (((WXMediaMessage.IMediaObject)localObject).type())
    {
    default: 
      i = -1;
    }
    aw localaw;
    for (;;)
    {
      localaw = new aw(i);
      localaw.HO(bg.aq(paramString2, "")).HP(bg.aq(paramString3, ""));
      localaw.uE(5);
      w.d("MicroMsg.UploadManager", "TimeLineType " + i);
      if (i != -1) {
        break;
      }
      w.d("MicroMsg.UploadManager", "timeLineType is invalid");
      GMTrace.o(8117622407168L, 60481);
      return null;
      i = 2;
      continue;
      i = 4;
      continue;
      i = 1;
      continue;
      i = 3;
      continue;
      i = 5;
      continue;
      i = 3;
    }
    if (!bg.nm(paramString1)) {
      localaw.HI(paramString1);
    }
    localaw.HN(bg.aq(paramWXMediaMessage.title, "")).HL(bg.aq(paramWXMediaMessage.description, ""));
    switch (((WXMediaMessage.IMediaObject)localObject).type())
    {
    default: 
      w.e("MicroMsg.UploadManager", "none type not support!");
      GMTrace.o(8117622407168L, 60481);
      return null;
    case 1: 
      paramWXMediaMessage = (WXTextObject)localObject;
      localaw.HL("");
      localaw.HI(paramWXMediaMessage.text);
    }
    for (;;)
    {
      GMTrace.o(8117622407168L, 60481);
      return localaw;
      paramString3 = (WXMusicObject)localObject;
      if (!bg.nm(paramString3.musicUrl))
      {
        paramString1 = paramString3.musicUrl;
        paramString2 = bg.aq(paramString1, "");
        if (bg.nm(paramString3.musicDataUrl)) {
          break label483;
        }
      }
      label483:
      for (paramString1 = paramString3.musicDataUrl;; paramString1 = paramString3.musicUrl)
      {
        localObject = bg.aq(paramString1, "");
        localaw.HN("").HL("");
        i = uy(3);
        if (i != -1) {
          break label491;
        }
        w.d("MicroMsg.UploadManager", "mediaType is invalid");
        GMTrace.o(8117622407168L, 60481);
        return null;
        paramString1 = paramString3.musicLowBandUrl;
        break;
      }
      label491:
      if (!bg.nm(paramString3.musicLowBandDataUrl)) {}
      for (paramString1 = paramString3.musicLowBandDataUrl;; paramString1 = paramString3.musicLowBandUrl)
      {
        paramString1 = bg.aq(paramString1, "");
        if (localaw.a(paramWXMediaMessage.thumbData, paramString2, paramString1, (String)localObject, i, bg.aq(paramWXMediaMessage.title, ""), bg.aq(paramWXMediaMessage.description, ""))) {
          break;
        }
        GMTrace.o(8117622407168L, 60481);
        return null;
      }
      paramWXMediaMessage = (WXImageObject)localObject;
      if (!bg.bq(paramWXMediaMessage.imageData))
      {
        if (!localaw.a(paramWXMediaMessage.imageData, "", ""))
        {
          GMTrace.o(8117622407168L, 60481);
          return null;
        }
      }
      else if (!bg.nm(paramWXMediaMessage.imagePath))
      {
        if (!localaw.dI(paramWXMediaMessage.imagePath, ""))
        {
          GMTrace.o(8117622407168L, 60481);
          return null;
        }
      }
      else
      {
        w.e("MicroMsg.UploadManager", "share img but no res is exist!");
        GMTrace.o(8117622407168L, 60481);
        return null;
        paramString1 = (WXWebpageObject)localObject;
        if (!bg.bq(paramWXMediaMessage.thumbData)) {
          localaw.a(paramWXMediaMessage.thumbData, bg.aq(paramWXMediaMessage.description, ""), bg.aq(paramWXMediaMessage.title, ""));
        }
        localaw.HL(paramString1.webpageUrl).HM(paramString1.webpageUrl);
        paramWXMediaMessage = paramString1.webpageUrl;
        localaw.pwJ.uUc.lPM = paramWXMediaMessage;
        localaw.HK(paramString1.canvasPageXml);
        continue;
        w.e("MicroMsg.UploadManager", "file is not support!");
        GMTrace.o(8117622407168L, 60481);
        return null;
        paramString2 = (WXVideoObject)localObject;
        localaw.HN("").HL("");
        i = uy(4);
        if (i == -1)
        {
          w.d("MicroMsg.UploadManager", "mediaType is invalid");
          GMTrace.o(8117622407168L, 60481);
          return null;
        }
        if (!bg.nm(paramString2.videoUrl)) {}
        for (paramString1 = paramString2.videoUrl;; paramString1 = paramString2.videoLowBandUrl)
        {
          paramString1 = bg.aq(paramString1, "");
          if (localaw.a(paramWXMediaMessage.thumbData, paramString1, paramString2.videoLowBandUrl, paramString2.videoUrl, i, bg.aq(paramWXMediaMessage.title, ""), bg.aq(paramWXMediaMessage.description, ""))) {
            break;
          }
          GMTrace.o(8117622407168L, 60481);
          return null;
        }
        paramWXMediaMessage = (WXAppExtendObject)localObject;
        if ((bg.nm(paramWXMediaMessage.filePath)) || (!paramWXMediaMessage.filePath.startsWith("http"))) {
          break;
        }
        localaw.HN(paramWXMediaMessage.filePath);
        localaw.HL(paramWXMediaMessage.filePath);
      }
    }
    w.e("MicroMsg.UploadManager", "appdata is not support!");
    GMTrace.o(8117622407168L, 60481);
    return null;
  }
  
  private void a(m paramm, int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(8117085536256L, 60477);
    w.i("MicroMsg.UploadManager", "localId " + paramm.blY() + "processError " + paramInt2 + " errMsg: " + paramString);
    com.tencent.mm.plugin.report.service.g.ork.a(22L, 129L, 1L, true);
    if (paramInt1 != 0) {
      paramString = ae.biS().dV(paramInt1);
    }
    for (;;)
    {
      int i;
      try
      {
        i = ((anx)new anx().aD(paramString.pMO)).uDt;
      }
      catch (Exception paramString)
      {
        paramInt1 = 0;
      }
      try
      {
        paramString = paramm.blQ();
        paramInt1 = i;
        if (paramString != null)
        {
          paramString.uDt = i;
          paramm.field_postBuf = paramString.toByteArray();
          paramInt1 = i;
        }
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          paramInt1 = i;
        }
        paramInt1 = 0;
      }
    }
    w.d("MicroMsg.UploadManager", "post error " + paramInt1);
    paramm.bmc();
    ae.bjd().b(paramm.pMe, paramm);
    w.d("MicroMsg.UploadManager", "processError, publish SnsPostFailEvent, snsInfoLocalId:" + paramm.pMe);
    paramString = new pv();
    paramString.eUA.eUB = paramm.pMe;
    com.tencent.mm.sdk.b.a.vgX.m(paramString);
    switch (paramInt2)
    {
    }
    for (;;)
    {
      G(paramm.pMe, false);
      GMTrace.o(8117085536256L, 60477);
      return;
      w.e("MicroMsg.UploadManager", "parse uploadInfo error");
      break;
      paramString = paramm.blQ();
      if (paramString == null) {
        break label399;
      }
      paramInt1 = paramString.uDt;
      break;
      w.e("MicroMsg.UploadManager", "upload find timeLine is null delete this item");
      continue;
      w.e("MicroMsg.UploadManager", "parser protobuf error");
      continue;
      w.e("MicroMsg.UploadManager", "local id is not in db");
      continue;
      w.e("MicroMsg.UploadManager", "arg is error");
      continue;
      w.e("MicroMsg.UploadManager", "pullTimeLineXml  error");
      continue;
      w.e("MicroMsg.UploadManager", "errtle  error");
    }
  }
  
  private static void a(anv paramanv)
  {
    GMTrace.i(8118964584448L, 60491);
    if (paramanv == null)
    {
      GMTrace.o(8118964584448L, 60491);
      return;
    }
    paramanv = paramanv.uDm.iterator();
    while (paramanv.hasNext())
    {
      amb localamb = (amb)paramanv.next();
      ae.bjc().ur(localamb.uAW);
    }
    GMTrace.o(8118964584448L, 60491);
  }
  
  private void b(m paramm, int paramInt, String paramString)
  {
    GMTrace.i(8117219753984L, 60478);
    a(paramm, 0, paramInt, paramString);
    GMTrace.o(8117219753984L, 60478);
  }
  
  private boolean q(m paramm)
  {
    GMTrace.i(8117890842624L, 60483);
    if (paramm == null)
    {
      GMTrace.o(8117890842624L, 60483);
      return false;
    }
    Object localObject1 = paramm.blD();
    if (((biz)localObject1).uUc.ueV == 8)
    {
      GMTrace.o(8117890842624L, 60483);
      return true;
    }
    if (((biz)localObject1).uUc.ueV == 2)
    {
      GMTrace.o(8117890842624L, 60483);
      return true;
    }
    Object localObject2;
    if (((biz)localObject1).uUc.ueV == 26)
    {
      localObject2 = new ft();
      ((ft)localObject2).eIo.type = 30;
      ((ft)localObject2).eIo.eIv = 5;
      ((ft)localObject2).eIo.desc = ((biz)localObject1).uUc.ueY;
      ((ft)localObject2).eIo.eIu = String.valueOf(paramm.pMe);
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      if (((ft)localObject2).eIp.ret != 1)
      {
        GMTrace.o(8117890842624L, 60483);
        return false;
      }
    }
    if ((localObject1 == null) || (((biz)localObject1).uUc.ueW == null))
    {
      b(paramm, 1, "timeline or timelineObjList is null");
      GMTrace.o(8117890842624L, 60483);
      return false;
    }
    if (((biz)localObject1).uUc.ueW.size() == 0)
    {
      GMTrace.o(8117890842624L, 60483);
      return true;
    }
    for (;;)
    {
      int i;
      try
      {
        localObject2 = (anv)new anv().aD(paramm.field_postBuf);
        if (((biz)localObject1).uUc.ueV != 1) {
          break label605;
        }
        if (((anv)localObject2).uDm.size() > 1)
        {
          bool = true;
          if (((biz)localObject1).uUc.ueV != 21) {
            break label602;
          }
          bool = false;
          if (((biz)localObject1).uUc.ueV != 15) {
            break label488;
          }
          localObject1 = ((anv)localObject2).uDm.iterator();
          if (!((Iterator)localObject1).hasNext()) {
            break label477;
          }
          localObject2 = (amb)((Iterator)localObject1).next();
          i = uz(((amb)localObject2).uAW);
          if (i != b.pwA) {
            break label459;
          }
          a(paramm, ((amb)localObject2).uAW, 2, "upload has set it fail");
          GMTrace.o(8117890842624L, 60483);
          return false;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.UploadManager", "error to parser postinfo in canPost " + paramm.blY());
        b(paramm, 2, "mediaPostInfo parser error " + localException.getMessage());
        GMTrace.o(8117890842624L, 60483);
        return false;
      }
      boolean bool = false;
      continue;
      label459:
      if (i == b.pwC)
      {
        GMTrace.o(8117890842624L, 60483);
        return false;
        label477:
        GMTrace.o(8117890842624L, 60483);
        return true;
        label488:
        Iterator localIterator = ((anv)localObject2).uDm.iterator();
        while (localIterator.hasNext())
        {
          amb localamb = (amb)localIterator.next();
          i = a(localamb.uAW, bool, (anv)localObject2, localException.uUc.ueV);
          if (i == b.pwA)
          {
            a(paramm, localamb.uAW, 2, "upload has set it fail");
            GMTrace.o(8117890842624L, 60483);
            return false;
          }
          if (i == b.pwC)
          {
            GMTrace.o(8117890842624L, 60483);
            return false;
          }
        }
        GMTrace.o(8117890842624L, 60483);
        return true;
        label602:
        continue;
        label605:
        bool = true;
      }
    }
  }
  
  private static biz s(m paramm)
  {
    GMTrace.i(8118427713536L, 60487);
    Object localObject = paramm.blD();
    amc localamc = ((biz)localObject).uUa;
    String str1 = ((biz)localObject).uTZ;
    String str2 = ((biz)localObject).twr;
    String str3 = ((biz)localObject).tws;
    String str4 = ((biz)localObject).uUc.lPj;
    String str5 = ((biz)localObject).uUc.eBt;
    String str6 = ((biz)localObject).uUc.lPM;
    String str7 = ((biz)localObject).uUc.ueY;
    cs localcs = ((biz)localObject).uUb;
    brn localbrn = ((biz)localObject).uUi;
    int i = ((biz)localObject).uUc.ueV;
    int j = ((biz)localObject).uUc.ueX;
    biz localbiz = com.tencent.mm.modelsns.e.LU();
    localbiz.jhi = paramm.field_userName;
    localbiz.uCQ = paramm.field_pravited;
    localbiz.uTZ = str1;
    localbiz.twr = bg.nl(str2);
    localbiz.tws = bg.nl(str3);
    localbiz.uUe = ((biz)localObject).uUe;
    localbiz.uUf = ((biz)localObject).uUf;
    localbiz.giA = ((biz)localObject).giA;
    localbiz.uUg = ((biz)localObject).uUg;
    localbiz.pRQ = ((biz)localObject).pRQ;
    localbiz.uUc.lPj = str4;
    localbiz.uUc.eBt = str5;
    localbiz.uUc.ueV = i;
    localbiz.uUc.ueX = j;
    localbiz.uUc.lPM = str6;
    localbiz.uUc.ueY = str7;
    localbiz.uUa = localamc;
    localbiz.uUh = ((biz)localObject).uUh;
    localbiz.pTh = ((biz)localObject).pTh;
    if (((biz)localObject).pwN != null) {
      localbiz.pwN = ((biz)localObject).pwN;
    }
    if (localcs != null) {
      localbiz.uUb = localcs;
    }
    if (localbrn != null) {
      localbiz.uUi = localbrn;
    }
    paramm = ((biz)localObject).uUc.ueW.iterator();
    while (paramm.hasNext())
    {
      localObject = (anu)paramm.next();
      if (((anu)localObject).uCU == 1) {
        localbiz.uUc.ueW.add(localObject);
      }
    }
    GMTrace.o(8118427713536L, 60487);
    return localbiz;
  }
  
  private static int uy(int paramInt)
  {
    GMTrace.i(8117353971712L, 60479);
    switch (paramInt)
    {
    default: 
      GMTrace.o(8117353971712L, 60479);
      return -1;
    case 1: 
      GMTrace.o(8117353971712L, 60479);
      return 1;
    case 3: 
      GMTrace.o(8117353971712L, 60479);
      return 3;
    case 2: 
      GMTrace.o(8117353971712L, 60479);
      return 2;
    }
    GMTrace.o(8117353971712L, 60479);
    return 4;
  }
  
  private int uz(int paramInt)
  {
    GMTrace.i(8119098802176L, 60492);
    if (paramInt == -1)
    {
      w.e("MicroMsg.UploadManager", "uploading depend localMediaId can not get the media doUploadSight");
      paramInt = b.pwA;
      GMTrace.o(8119098802176L, 60492);
      return paramInt;
    }
    com.tencent.mm.plugin.sns.storage.q localq = ae.biS().dV(paramInt);
    anx localanx;
    try
    {
      localanx = (anx)new anx().aD(localq.pMO);
      w.i("MicroMsg.UploadManager", "state " + localanx.uDK + " doUploadSight, serverErr:" + localanx.uDt);
      if (localanx.uDK == 1)
      {
        paramInt = b.pwA;
        GMTrace.o(8119098802176L, 60492);
        return paramInt;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.UploadManager", "parse uploadInfo error doUploadSight");
      paramInt = b.pwA;
      GMTrace.o(8119098802176L, 60492);
      return paramInt;
    }
    if (FileOp.kX(localanx.videoPath) == 0L)
    {
      w.i("MicroMsg.UploadManager", "path not fileexist  " + localanx.videoPath);
      paramInt = b.pwA;
      GMTrace.o(8119098802176L, 60492);
      return paramInt;
    }
    if (FileOp.kX(localanx.uDM) == 0L)
    {
      w.i("MicroMsg.UploadManager", "thumbpath not fileexist  " + localanx.uDM);
      paramInt = b.pwA;
      GMTrace.o(8119098802176L, 60492);
      return paramInt;
    }
    if (localanx.uDK == 0)
    {
      paramInt = b.pwB;
      GMTrace.o(8119098802176L, 60492);
      return paramInt;
    }
    if (ae.bjc().uq(paramInt))
    {
      ae.biS().a(paramInt, localException);
      new ab(paramInt, localException, localanx.videoPath, localanx.uDM, this.pwn).biC();
    }
    paramInt = b.pwC;
    GMTrace.o(8119098802176L, 60492);
    return paramInt;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8119367237632L, 60494);
    w.i("MicroMsg.UploadManager", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType() + " @" + hashCode());
    switch (paramk.getType())
    {
    }
    while ((paramInt1 != 0) || (paramInt2 != 0))
    {
      GMTrace.o(8119367237632L, 60494);
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        bhR();
        continue;
        paramString = (r)paramk;
        int i = paramString.ppo;
        if (paramString.jPB)
        {
          long l = paramString.pst;
          w.i("MicroMsg.UploadManager", "get the del post come back %d " + l, new Object[] { Integer.valueOf(i) });
          if (l != 0L)
          {
            ae.bjc().dG(l);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.a(new q(l, 1), 0);
          }
          ae.bjd().vb(i);
          if (l != 0L) {
            ae.bji().dP(l);
          }
        }
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          G(paramString.ppo, false);
        }
        for (;;)
        {
          this.pwm = null;
          break;
          G(paramString.ppo, true);
          aj.dK(paramString.pst);
        }
      }
    }
    GMTrace.o(8119367237632L, 60494);
  }
  
  public final boolean a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    GMTrace.i(8117756624896L, 60482);
    paramString1 = a(paramWXMediaMessage, paramString1, paramString2, paramString3);
    if (paramString1 == null)
    {
      GMTrace.o(8117756624896L, 60482);
      return false;
    }
    paramString1.HJ(paramWXMediaMessage.mediaTagName);
    paramString1.U(paramString2, paramWXMediaMessage.messageExt, paramWXMediaMessage.messageAction);
    if (paramInt > com.tencent.mm.plugin.sns.c.a.poV) {
      paramString1.uA(1);
    }
    paramInt = paramString1.commit();
    w.d("MicroMsg.UploadManager", "shareAppMsg set and the result: " + paramInt);
    GMTrace.o(8117756624896L, 60482);
    return true;
  }
  
  public final void bhR()
  {
    GMTrace.i(8118159278080L, 60485);
    ae.aDa().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8076954435584L, 60178);
        av localav = av.this;
        if (ae.biN() != null)
        {
          if (!ae.biM())
          {
            com.tencent.mm.kernel.h.xz();
            if (com.tencent.mm.kernel.h.xy().isSDCardAvailable()) {}
          }
          else
          {
            GMTrace.o(8076954435584L, 60178);
            return;
          }
          ae.biN().post(new av.2(localav));
        }
        GMTrace.o(8076954435584L, 60178);
      }
    }, 1000L);
    GMTrace.o(8118159278080L, 60485);
  }
  
  public final String biJ()
  {
    GMTrace.i(8116951318528L, 60476);
    if ((this.fJS == null) || (this.fJS.equals("")))
    {
      com.tencent.mm.kernel.h.xz();
      this.fJS = ((String)com.tencent.mm.kernel.h.xy().xh().get(2, null));
    }
    String str = this.fJS;
    GMTrace.o(8116951318528L, 60476);
    return str;
  }
  
  public final boolean bjL()
  {
    GMTrace.i(8118293495808L, 60486);
    Object localObject1 = ae.bjd();
    localObject2 = "select *,rowid from SnsInfo  where " + com.tencent.mm.plugin.sns.storage.n.pMz + " order by SnsInfo.rowid" + " asc ";
    localObject1 = ((com.tencent.mm.plugin.sns.storage.n)localObject1).fTZ.rawQuery((String)localObject2, null);
    w.d("MicroMsg.SnsInfoStorage", "getLastUpload " + (String)localObject2);
    if (((Cursor)localObject1).getCount() == 0)
    {
      ((Cursor)localObject1).close();
      localObject1 = null;
    }
    for (;;)
    {
      localObject2 = new m();
      if (localObject1 != null) {
        break;
      }
      GMTrace.o(8118293495808L, 60486);
      return false;
      ((Cursor)localObject1).moveToFirst();
    }
    ((Cursor)localObject1).moveToFirst();
    do
    {
      ((m)localObject2).b((Cursor)localObject1);
      try
      {
        anv localanv = (anv)new anv().aD(((m)localObject2).field_postBuf);
        int i = localanv.gsq;
        if (m.dT(localanv.uDp))
        {
          a(localanv);
          b((m)localObject2, 6, "snsinfo is tle");
          w.i("MicroMsg.UploadManager", "checkTLE snsinfo localId it time limit " + ((m)localObject2).blY() + " is die ");
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.UploadManager", "startPost parseFrom MediaPostInfo Exception");
          b((m)localObject2, 2, "MediaPostInfo parser error");
        }
      }
    } while (((Cursor)localObject1).moveToNext());
    ((Cursor)localObject1).close();
    GMTrace.o(8118293495808L, 60486);
    return true;
  }
  
  public final void bjM()
  {
    GMTrace.i(8119233019904L, 60493);
    Iterator localIterator = this.fMZ.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala != null) {
        locala.bjN();
      }
    }
    GMTrace.o(8119233019904L, 60493);
  }
  
  public final boolean dz(String paramString1, String paramString2)
  {
    GMTrace.i(8117488189440L, 60480);
    w.d("MicroMsg.UploadManager", "imgPath " + paramString1 + " text " + paramString2);
    String str = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(paramString1.getBytes());
    FileOp.o(paramString1, str);
    paramString1 = new aw(1);
    paramString1.HI(paramString2);
    paramString1.uE(6);
    paramString2 = new LinkedList();
    paramString2.add(new com.tencent.mm.plugin.sns.data.h(str, 2));
    paramString1.bw(paramString2);
    if (paramString1.commit() > 0)
    {
      GMTrace.o(8117488189440L, 60480);
      return true;
    }
    GMTrace.o(8117488189440L, 60480);
    return false;
  }
  
  public final void r(m paramm)
  {
    GMTrace.i(8118025060352L, 60484);
    if (paramm == null)
    {
      GMTrace.o(8118025060352L, 60484);
      return;
    }
    w.i("MicroMsg.UploadManager", "cancel snsinfo " + paramm.blY());
    try
    {
      Object localObject1 = (anv)new anv().aD(paramm.field_postBuf);
      if ((localObject1 != null) && (((anv)localObject1).uDm != null))
      {
        localObject1 = ((anv)localObject1).uDm.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          amb localamb = (amb)((Iterator)localObject1).next();
          int i = ae.bjc().ut(localamb.uAW);
          ae.bjc().us(localamb.uAW);
          w.i("MicroMsg.UploadManager", "cancel upload %d", new Object[] { Integer.valueOf(i) });
          if ((paramm.field_type != 15) && (i >= 0))
          {
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xx().fYr.cancel(i);
            ae.bjc().ur(localamb.uAW);
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.UploadManager", "error to parser postinfo in canPost " + paramm.blY());
        b(paramm, 2, "mediaPostInfo parser error " + localException.getMessage());
        localObject2 = null;
      }
      if ((ae.bjc().un(paramm.pMe)) && (this.pwm != null))
      {
        w.i("MicroMsg.UploadManager", "cancel post");
        this.pwm.jPB = true;
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.c(this.pwm);
        ae.bjc().up(paramm.pMe);
      }
      Object localObject2 = ae.bjd().va(paramm.pMe);
      if ((localObject2 != null) && (((m)localObject2).field_snsId != 0L))
      {
        ae.bjc().dG(((m)localObject2).field_snsId);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new q(((m)localObject2).field_snsId, 1), 0);
      }
      ae.bjd().vb(paramm.pMe);
      if (paramm.field_type == 21) {
        com.tencent.mm.plugin.sns.lucky.a.g.bhW().bhY();
      }
      w.d("MicroMsg.UploadManager", "cancelPost, publish SnsPostFailEvent, snsInfoLocalId " + paramm.blY());
      localObject2 = new pv();
      ((pv)localObject2).eUA.eUB = paramm.pMe;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      GMTrace.o(8118025060352L, 60484);
    }
  }
  
  public final boolean t(m paramm)
  {
    GMTrace.i(8118561931264L, 60488);
    final anv localanv;
    final int i;
    try
    {
      localanv = (anv)new anv().aD(paramm.field_postBuf);
      localanv.gsq += 1;
      paramm.field_postBuf = localanv.toByteArray();
      ae.bjd().b(paramm.pMe, paramm);
      i = localanv.gsq;
      if (m.dT(localanv.uDp))
      {
        b(paramm, 6, "this item isTimeLimit");
        w.i("MicroMsg.UploadManager", "snsinfo localId it time limit " + paramm.blY() + " is die ");
        GMTrace.o(8118561931264L, 60488);
        return false;
      }
    }
    catch (Exception localException1)
    {
      w.e("MicroMsg.UploadManager", "startPost parseFrom MediaPostInfo Exception");
      b(paramm, 2, "MediaPostInfo parser error:" + localException1.getMessage());
      GMTrace.o(8118561931264L, 60488);
      return false;
    }
    w.i("MicroMsg.UploadManager", "try start post " + paramm.blY());
    final biz localbiz;
    final Object localObject2;
    int j;
    com.tencent.mm.plugin.sns.storage.q localq;
    final Object localObject3;
    String str;
    final Object localObject5;
    int k;
    final Object localObject4;
    final Object localObject1;
    if (q(paramm))
    {
      localbiz = paramm.blD();
      localObject2 = s(paramm);
      i = 0;
      if (i < localanv.uDm.size())
      {
        j = ((amb)localanv.uDm.get(i)).uAW;
        localq = ae.biS().dV(j);
        if (localq == null)
        {
          b(paramm, 3, "can not get the media from db ,localMediaId: " + j);
          GMTrace.o(8118561931264L, 60488);
          return false;
        }
        try
        {
          localObject3 = (anx)new anx().aD(localq.pMO);
          if ((((anx)localObject3).uDH == null) || (((anx)localObject3).uDJ.size() <= 0))
          {
            w.e("MicroMsg.UploadManager", "item with not url" + paramm.field_type);
            if (paramm.field_type == 3) {
              break label824;
            }
            b(paramm, 4, "buf url is null");
            GMTrace.o(8118561931264L, 60488);
            return false;
          }
        }
        catch (Exception localException2)
        {
          w.e("MicroMsg.UploadManager", "MediaUploadInfo parseFrom MediaUploadInfo Exception");
          b(paramm, 2, "mediaUploadInfo parser error " + localException2.getMessage());
          GMTrace.o(8118561931264L, 60488);
          return false;
        }
        str = ((anx)localObject3).uDH.lPM;
        localObject5 = ((anr)((anx)localObject3).uDJ.get(0)).lPM;
        j = ((anx)localObject3).uDH.jib;
        k = ((anr)((anx)localObject3).uDJ.get(0)).jib;
        localObject4 = ((anx)localObject3).eDW;
        localObject1 = null;
        if (i < localbiz.uUc.ueW.size()) {
          localObject1 = ((anu)localbiz.uUc.ueW.get(i)).uCR;
        }
        if ((localbiz.uUc.ueV == 4) || (localbiz.uUc.ueV == 5))
        {
          if (i >= localbiz.uUc.ueW.size()) {
            break label1174;
          }
          localObject1 = (anu)localbiz.uUc.ueW.get(i);
          ((anu)localObject1).uCO = ((String)localObject5);
          ((anu)localObject1).uCP = k;
        }
      }
    }
    for (;;)
    {
      if ((localObject1 != null) && (((biz)localObject2).uUc.ueV == 1)) {
        ((anu)localObject1).eDW = ((String)localObject4);
      }
      if ((localObject1 != null) && (((biz)localObject2).uUc.ueV == 15))
      {
        ((anu)localObject1).eDW = ((anx)localObject3).eDW;
        ((anu)localObject1).uDj = ((anx)localObject3).uDj;
      }
      if (i < localbiz.uUc.ueW.size())
      {
        localObject3 = (anu)localbiz.uUc.ueW.get(i);
        ((anu)localObject1).eBt = ((anu)localObject3).eBt;
        ((anu)localObject1).lPj = ((anu)localObject3).lPj;
        ((anu)localObject1).eCt = ((anu)localObject3).eCt;
        ((anu)localObject1).pPP = ((anu)localObject3).pPP;
      }
      if (localObject1 == null)
      {
        b(paramm, 3, "make media error");
        GMTrace.o(8118561931264L, 60488);
        return false;
        localObject1 = com.tencent.mm.modelsns.e.a(localq.pMN, localq.type, str, (String)localObject5, j, k, ((anx)localObject3).uCQ, "", (anw)localObject1);
      }
      else
      {
        ((biz)localObject2).uUc.ueW.add(localObject1);
        i += 1;
        break;
        label824:
        if (!ae.bjc().uo(paramm.pMe))
        {
          w.d("MicroMsg.UploadManager", "this snsinfo is posting");
          GMTrace.o(8118561931264L, 60488);
          return false;
        }
        localObject1 = new LinkedList();
        localObject3 = localanv.uDn.iterator();
        while (((Iterator)localObject3).hasNext()) {
          ((List)localObject1).add(((bgp)((Iterator)localObject3).next()).jhi);
        }
        localObject3 = com.tencent.mm.plugin.sns.g.j.b((biz)localObject2);
        w.d("MicroMsg.UploadManager", "timeLine contentDescScene ：  " + ((biz)localObject2).uUf + " contentDescShowType: " + ((biz)localObject2).uUe);
        if (paramm.field_pravited == 1) {
          w.i("MicroMsg.UploadManager", "content private xml is null ? " + bg.nm((String)localObject3));
        }
        while ((localObject3 == null) || (((String)localObject3).equals("")))
        {
          b(paramm, 5, "content is error");
          ae.bjc().up(paramm.pMe);
          GMTrace.o(8118561931264L, 60488);
          return false;
          w.i("MicroMsg.UploadManager", "upload xmlsns: %s", new Object[] { localObject3 });
        }
        if (localanv.uDv == 1) {}
        for (final boolean bool = true;; bool = false)
        {
          i = paramm.pMe;
          localObject4 = localanv.uDw;
          localObject5 = ((biz)localObject2).uUa.uBb;
          localObject2 = ((biz)localObject2).uUc.eBt;
          ae.aDa().post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8090644643840L, 60280);
              if (ae.biM())
              {
                w.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
                GMTrace.o(8090644643840L, 60280);
                return;
              }
              av.this.pwm = new r(localObject3, localanv.uCQ, localanv.uDl, localObject1, localbiz, i, localanv.tPP, localanv.uDq, localanv.uDr, localanv.uDs, localanv, bool, localObject4, localanv.uDx, localObject5, localObject2);
              com.tencent.mm.kernel.h.xz();
              com.tencent.mm.kernel.h.xx().fYr.a(av.this.pwm, 0);
              GMTrace.o(8090644643840L, 60280);
            }
          });
          w.d("MicroMsg.UploadManager", "startPost, canPost is false, snsInfoId: " + paramm.blY());
          GMTrace.o(8118561931264L, 60488);
          return true;
        }
        label1174:
        localObject1 = null;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void H(int paramInt, boolean paramBoolean);
    
    public abstract void bjN();
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(8107556077568L, 60406);
      pwA = 1;
      pwB = 2;
      pwC = 3;
      pwD = new int[] { pwA, pwB, pwC };
      GMTrace.o(8107556077568L, 60406);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */