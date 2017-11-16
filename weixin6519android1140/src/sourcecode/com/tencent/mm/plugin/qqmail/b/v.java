package com.tencent.mm.plugin.qqmail.b;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.f;
import com.tencent.mm.ad.n;
import com.tencent.mm.protocal.c.blp;
import com.tencent.mm.protocal.c.lv;
import com.tencent.mm.protocal.c.ob;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class v
  implements com.tencent.mm.ad.e
{
  String eMI;
  String[] nSE;
  String[] nSF;
  String[] nSG;
  public String nSb;
  HashMap<Long, String> nTA;
  HashMap<String, Integer> nTB;
  int nTC;
  public ArrayList<g> nTD;
  public String nTE;
  public String nTF;
  public HashMap<String, String> nTG;
  public c nTH;
  public d nTI;
  int nTJ;
  f nTK;
  public e nTp;
  String nTr;
  Map<String, String> nTs;
  Map<String, String> nTt;
  Map<String, String> nTu;
  private b nTv;
  public t nTw;
  public Map<String, String> nTx;
  public f nTy;
  HashMap<Long, Integer> nTz;
  
  public v()
  {
    GMTrace.i(5472593641472L, 40774);
    this.nTs = new HashMap();
    this.nTt = new LinkedHashMap();
    this.nTu = new LinkedHashMap();
    this.nTx = new HashMap();
    this.nTy = null;
    this.nTp = null;
    this.nTz = new HashMap();
    this.nTA = new HashMap();
    this.nTB = new HashMap();
    this.nTC = 0;
    this.nTD = new ArrayList();
    this.nTE = null;
    this.nTF = null;
    this.nTG = new HashMap();
    this.nTJ = 0;
    this.nTK = new f()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(5459977175040L, 40680);
        w.i("MicroMsg.ShareModeMailAppService", "currentSendFile: %s, offset: %d, totalLen: %d, filesInfo.size: %d", new Object[] { v.this.nTE, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(v.this.nTD.size()) });
        if (paramAnonymousInt1 >= paramAnonymousInt2)
        {
          v.this.nTG.put(v.this.nTF, ((o)paramAnonymousk).aYy().ueZ);
          paramAnonymousk = ((o)paramAnonymousk).aYy();
          if (v.this.nTI != null) {
            v.this.nTI.c(v.this.nTJ - v.this.nTD.size(), v.this.nTJ, v.this.nTF, paramAnonymousk.ueZ);
          }
          if (v.this.nTD.isEmpty())
          {
            w.i("MicroMsg.ShareModeMailAppService", "finished send all files");
            if (v.this.nTH != null) {
              v.this.nTH.aYB();
            }
            GMTrace.o(5459977175040L, 40680);
            return;
          }
          w.i("MicroMsg.ShareModeMailAppService", "finished send one file, continue to send another one");
          paramAnonymousk = (v.g)v.this.nTD.remove(0);
          v.this.nTE = paramAnonymousk.eML;
          v.this.nTF = paramAnonymousk.euR;
          paramAnonymousk = new o(v.this.nTF, v.this.nTE, this);
          at.wS().a(paramAnonymousk, 0);
        }
        GMTrace.o(5459977175040L, 40680);
      }
    };
    at.wS().a(483, this);
    at.wS().a(484, this);
    at.wS().a(485, this);
    GMTrace.o(5472593641472L, 40774);
  }
  
  private void N(ArrayList<Long> paramArrayList)
  {
    GMTrace.i(5473264730112L, 40779);
    if (this.nTz != null)
    {
      this.nTz.clear();
      this.nTz = null;
    }
    this.nTz = new HashMap();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      long l = ((Long)paramArrayList.next()).longValue();
      this.nTz.put(Long.valueOf(l), Integer.valueOf(1));
    }
    GMTrace.o(5473264730112L, 40779);
  }
  
  private void a(l paraml)
  {
    GMTrace.i(5473533165568L, 40781);
    this.nTC += 1;
    w.i("MicroMsg.ShareModeMailAppService", "processCheckImgStatusSceneEnd, checkTimes: %d", new Object[] { Integer.valueOf(this.nTC) });
    paraml = ((lv)paraml.fUa.gtD.gtK).ucy.iterator();
    while (paraml.hasNext())
    {
      ob localob = (ob)paraml.next();
      long l = localob.tPV;
      int i = localob.jhA;
      if (this.nTz.containsKey(Long.valueOf(l)))
      {
        w.i("MicroMsg.ShareModeMailAppService", "msgSvrId: %d, status: %d", new Object[] { Long.valueOf(l), Integer.valueOf(i) });
        if (i == 0)
        {
          this.nTz.remove(Long.valueOf(l));
          if (localob.ueZ != null)
          {
            w.i("MicroMsg.ShareModeMailAppService", "msgSvrId: %d, attachId: %s", new Object[] { Long.valueOf(l), localob.ueZ });
            this.nTA.put(Long.valueOf(l), localob.ueZ);
            this.nTB.put(localob.ueZ, Integer.valueOf(localob.ufa));
          }
        }
        else
        {
          this.nTz.put(Long.valueOf(l), Integer.valueOf(i));
        }
      }
    }
    if (this.nTz.isEmpty())
    {
      w.i("MicroMsg.ShareModeMailAppService", "all image is in server");
      if (this.nTv != null) {
        this.nTv.a(new ArrayList(), this.nTA);
      }
      GMTrace.o(5473533165568L, 40781);
      return;
    }
    if (this.nTC < 3)
    {
      w.i("MicroMsg.ShareModeMailAppService", "checkTime small than limit, doScene again");
      paraml = new l(g(this.nTz));
      at.wS().a(paraml, 0);
      GMTrace.o(5473533165568L, 40781);
      return;
    }
    this.nTv.a(g(this.nTz), this.nTA);
    GMTrace.o(5473533165568L, 40781);
  }
  
  private static ArrayList<Long> g(HashMap<Long, Integer> paramHashMap)
  {
    GMTrace.i(5473398947840L, 40780);
    ArrayList localArrayList = new ArrayList();
    paramHashMap = paramHashMap.keySet().iterator();
    while (paramHashMap.hasNext()) {
      localArrayList.add((Long)paramHashMap.next());
    }
    GMTrace.o(5473398947840L, 40780);
    return localArrayList;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(5473130512384L, 40778);
    w.i("MicroMsg.ShareModeMailAppService", "onSceneEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.ShareModeMailAppService", "errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramk.getType() == 483)
      {
        a((l)paramk);
        GMTrace.o(5473130512384L, 40778);
        return;
      }
      if (this.nTp != null) {
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5460245610496L, 40682);
            v.this.nTp.Fb(v.this.nSb);
            GMTrace.o(5460245610496L, 40682);
          }
        });
      }
      GMTrace.o(5473130512384L, 40778);
      return;
    }
    if (paramk.getType() == 483)
    {
      a((l)paramk);
      GMTrace.o(5473130512384L, 40778);
      return;
    }
    if (paramk.getType() != 484) {
      paramk.getType();
    }
    GMTrace.o(5473130512384L, 40778);
  }
  
  public final void a(f paramf, e parame)
  {
    GMTrace.i(5472862076928L, 40776);
    this.nTy = paramf;
    this.nTp = parame;
    if (this.nTs.size() > 0)
    {
      paramf = new ArrayList();
      parame = this.nTs.keySet().iterator();
      while (parame.hasNext())
      {
        String str = (String)parame.next();
        w.i("MicroMsg.ShareModeMailAppService", "check img status, msgSvrId: %s", new Object[] { str });
        paramf.add(Long.valueOf(bg.getLong(str, 0L)));
      }
      parame = new b()
      {
        public final void a(ArrayList<Long> paramAnonymousArrayList, HashMap<Long, String> paramAnonymousHashMap)
        {
          GMTrace.i(5456890167296L, 40657);
          w.i("MicroMsg.ShareModeMailAppService", "finishChckImgStatus, notUploadedImgIdList.size: %d, attachIdMap.size: %d", new Object[] { Integer.valueOf(paramAnonymousArrayList.size()), Integer.valueOf(paramAnonymousHashMap.size()) });
          Object localObject1;
          if (paramAnonymousArrayList.size() > 0)
          {
            localObject1 = v.this;
            paramAnonymousArrayList = paramAnonymousArrayList.iterator();
            while (paramAnonymousArrayList.hasNext())
            {
              Object localObject2 = (Long)paramAnonymousArrayList.next();
              localObject2 = (String)((v)localObject1).nTs.get(String.valueOf(localObject2));
              w.i("MicroMsg.ShareModeMailAppService", "appendAllUndownloadImage, filePath: %s", new Object[] { localObject2 });
              if (!bg.nm((String)localObject2))
              {
                if (((v)localObject1).nTD == null) {
                  ((v)localObject1).nTD = new ArrayList();
                }
                ((v)localObject1).nTD.add(new v.g((String)localObject2, (String)localObject2));
              }
            }
          }
          if (paramAnonymousHashMap.size() > 0) {
            v.this.f(paramAnonymousHashMap);
          }
          v.this.sS(10);
          paramAnonymousArrayList = v.this;
          w.i("MicroMsg.ShareModeMailAppService", "uploadMsgImg, filesInfo.size = %d", new Object[] { Integer.valueOf(paramAnonymousArrayList.nTD.size()) });
          if (paramAnonymousArrayList.nTD == null) {
            paramAnonymousArrayList.nTD = new ArrayList();
          }
          if (paramAnonymousArrayList.nTD.size() > 0)
          {
            paramAnonymousHashMap = new v.3(paramAnonymousArrayList);
            localObject1 = new v.4(paramAnonymousArrayList);
            w.i("MicroMsg.ShareModeMailAppService", "uploadFile, filesInfo.size: %d", new Object[] { Integer.valueOf(paramAnonymousArrayList.nTD.size()) });
            paramAnonymousArrayList.nTH = paramAnonymousHashMap;
            paramAnonymousArrayList.nTI = ((v.d)localObject1);
            paramAnonymousArrayList.nTJ = paramAnonymousArrayList.nTD.size();
            if ((paramAnonymousArrayList.nTD != null) && (paramAnonymousArrayList.nTD.size() > 0))
            {
              paramAnonymousHashMap = (v.g)paramAnonymousArrayList.nTD.remove(0);
              paramAnonymousArrayList.nTE = paramAnonymousHashMap.eML;
              paramAnonymousArrayList.nTF = paramAnonymousHashMap.euR;
              paramAnonymousArrayList.nTG = new HashMap();
              paramAnonymousArrayList = new o(paramAnonymousArrayList.nTF, paramAnonymousArrayList.nTE, paramAnonymousArrayList.nTK);
              at.wS().a(paramAnonymousArrayList, 0);
            }
            GMTrace.o(5456890167296L, 40657);
            return;
          }
          paramAnonymousArrayList.sS(90);
          paramAnonymousArrayList.aYA();
          GMTrace.o(5456890167296L, 40657);
        }
      };
      w.i("MicroMsg.ShareModeMailAppService", "checkImgStatus");
      this.nTC = 0;
      N(paramf);
      if (this.nTA != null)
      {
        this.nTA.clear();
        this.nTA = null;
      }
      this.nTA = new HashMap();
      this.nTv = parame;
      paramf = new l(paramf);
      at.wS().a(paramf, 0);
      GMTrace.o(5472862076928L, 40776);
      return;
    }
    sS(90);
    aYA();
    GMTrace.o(5472862076928L, 40776);
  }
  
  public final void aYA()
  {
    GMTrace.i(5472996294656L, 40777);
    int j = 0;
    Object localObject2 = null;
    int i = j;
    Object localObject1 = localObject2;
    final Object localObject3;
    Object localObject4;
    if (this.nTt != null)
    {
      i = j;
      localObject1 = localObject2;
      if (this.nTt.size() > 0)
      {
        localObject1 = new k.a[this.nTt.size()];
        localObject2 = this.nTt.keySet().iterator();
        i = 0;
        j = 0;
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (String)((Iterator)localObject2).next();
          localObject4 = new k.a();
          ((k.a)localObject4).nSK = ((String)this.nTt.get(localObject3));
          ((k.a)localObject4).euR = ((String)localObject3);
          ((k.a)localObject4).name = ((String)this.nTu.get(localObject3));
          ((k.a)localObject4).fileSize = com.tencent.mm.a.e.aY((String)localObject3);
          localObject1[j] = localObject4;
          w.i("MicroMsg.ShareModeMailAppService", "fileInfos[%d], attachId: %s, fileName: %s, name: %s, fileSize: %d", new Object[] { Integer.valueOf(j), ((k.a)localObject4).nSK, ((k.a)localObject4).euR, ((k.a)localObject4).name, Integer.valueOf(((k.a)localObject4).fileSize) });
          i = ((k.a)localObject4).fileSize + i;
          j += 1;
        }
      }
    }
    Object localObject5;
    if ((this.nTx != null) && (this.nTx.size() > 0))
    {
      localObject2 = new k.a[this.nTx.size()];
      localObject3 = this.nTx.keySet().iterator();
      j = 0;
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (String)((Iterator)localObject3).next();
        localObject5 = new k.a();
        ((k.a)localObject5).nSK = ((String)this.nTx.get(localObject4));
        ((k.a)localObject5).euR = ((String)localObject4);
        ((k.a)localObject5).fileSize = bg.a((Integer)this.nTB.get(((k.a)localObject5).nSK), 0);
        if (((k.a)localObject5).fileSize == 0) {
          ((k.a)localObject5).fileSize = com.tencent.mm.a.e.aY((String)localObject4);
        }
        localObject2[j] = localObject5;
        w.i("MicroMsg.ShareModeMailAppService", "imagesFileInfos[%d], attachId: %s, fileName: %s, fileSize: %d", new Object[] { Integer.valueOf(j), ((k.a)localObject5).nSK, ((k.a)localObject5).euR, Integer.valueOf(((k.a)localObject5).fileSize) });
        i = ((k.a)localObject5).fileSize + i;
        j += 1;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.ShareModeMailAppService", "totalFileSize = %d", new Object[] { Integer.valueOf(i) });
      if ((localObject2 == null) || (localObject2.length == 0))
      {
        localObject2 = null;
        if ((localObject1 != null) && (localObject1.length != 0)) {
          break label607;
        }
        localObject1 = null;
      }
      label607:
      for (;;)
      {
        localObject3 = new a()
        {
          public final void aYC()
          {
            GMTrace.i(5453534724096L, 40632);
            v.this.sS(100);
            GMTrace.o(5453534724096L, 40632);
          }
        };
        localObject4 = new k(this.eMI, this.nSE, this.nSF, this.nSG, this.nSb);
        ((k)localObject4).nSH = this.nTr;
        if ((localObject1 == null) || (localObject1.length <= 0)) {
          break label1649;
        }
        ((k)localObject4).nSJ = new k.a[localObject1.length];
        j = 0;
        while (j < ((k)localObject4).nSJ.length)
        {
          ((k)localObject4).nSJ[j] = localObject1[j];
          j += 1;
        }
        break;
      }
      w.i("MicroMsg.MailContentFormatter", "setFileInfo, fileInfos.length = %d", new Object[] { Integer.valueOf(((k)localObject4).nSJ.length) });
      if ((localObject2 != null) && (localObject2.length > 0))
      {
        ((k)localObject4).nSI = ((k.a[])localObject2);
        label653:
        localObject2 = new StringBuilder("");
        localObject5 = new StringBuilder("");
        if (((k)localObject4).eMI == null) {
          break label1667;
        }
        localObject1 = new StringBuilder("");
        ((StringBuilder)localObject1).append("From: ");
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append("=?utf-8?B?");
        ((StringBuilder)localObject1).append(Base64.encodeToString(((k)localObject4).eMI.getBytes(), 2));
        ((StringBuilder)localObject1).append("?=");
        ((StringBuilder)localObject1).append("\"");
        ((StringBuilder)localObject1).append(" ");
        ((StringBuilder)localObject1).append("<");
        ((StringBuilder)localObject1).append(((k)localObject4).eMI);
        ((StringBuilder)localObject1).append(">");
      }
      int k;
      Object localObject6;
      int m;
      label1649:
      label1667:
      for (localObject1 = ((StringBuilder)localObject1).toString();; localObject1 = null)
      {
        if (localObject1 != null)
        {
          ((StringBuilder)localObject5).append((String)localObject1);
          ((StringBuilder)localObject5).append("\n");
        }
        localObject1 = ((k)localObject4).aYv();
        if (localObject1 != null)
        {
          ((StringBuilder)localObject5).append((String)localObject1);
          ((StringBuilder)localObject5).append("\n");
        }
        localObject1 = ((k)localObject4).aYw();
        if (localObject1 != null)
        {
          ((StringBuilder)localObject5).append((String)localObject1);
          ((StringBuilder)localObject5).append("\n");
        }
        localObject1 = ((k)localObject4).aYx();
        if (localObject1 != null)
        {
          ((StringBuilder)localObject5).append((String)localObject1);
          ((StringBuilder)localObject5).append("\n");
        }
        ((StringBuilder)localObject5).append("Subject: ");
        if (((k)localObject4).nSb != null) {
          ((StringBuilder)localObject5).append(((k)localObject4).nSb);
        }
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject5).append("Mime-Version: 1.0");
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject5).append("Content-Type: multipart/mixed;boundary=\"----=_NextPart_5208D22F_0929AFA8_5112E4AB\"");
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject5).append("Content-Transfer-Encoding: 8Bit");
        ((StringBuilder)localObject5).append("\n");
        localObject1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", new Locale("en")).format(new Date());
        ((StringBuilder)localObject5).append("Date: " + (String)localObject1);
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject5).append("X-QQ-MIME: TCMime 1.0 by Tencent");
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject5).append("X-Mailer: QQMail 2.x");
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject5).append("X-QQ-Mailer: QQMail 2.x");
        ((StringBuilder)localObject5).append("\n");
        ((StringBuilder)localObject2).append(((StringBuilder)localObject5).toString());
        ((StringBuilder)localObject2).append("\r\n");
        ((StringBuilder)localObject2).append("This is a multi-part message in MIME format.");
        ((StringBuilder)localObject2).append("\n");
        ((StringBuilder)localObject2).append("\r\n");
        localObject1 = new StringBuilder("");
        ((StringBuilder)localObject1).append("------=_NextPart_5208D22F_0929AFA8_5112E4AB");
        ((StringBuilder)localObject1).append("\n");
        ((StringBuilder)localObject1).append("Content-Type:text/html;charset=\"utf-8\"");
        ((StringBuilder)localObject1).append("\n");
        ((StringBuilder)localObject1).append("Content-Transfer-Encoding:base64");
        ((StringBuilder)localObject1).append("\n");
        ((StringBuilder)localObject1).append("\r\n");
        ((StringBuilder)localObject1).append(Base64.encodeToString(((k)localObject4).nSH.getBytes(), 0));
        ((StringBuilder)localObject1).append("\n");
        ((StringBuilder)localObject2).append(((StringBuilder)localObject1).toString());
        ((StringBuilder)localObject2).append("\r\n");
        if ((((k)localObject4).nSI == null) || (((k)localObject4).nSI.length <= 0)) {
          break label1673;
        }
        localObject1 = ((k)localObject4).nSI;
        k = localObject1.length;
        j = 0;
        while (j < k)
        {
          StringBuilder localStringBuilder = localObject1[j];
          localObject5 = localStringBuilder.nSK;
          localObject6 = localStringBuilder.euR;
          m = localStringBuilder.fileSize;
          localStringBuilder = new StringBuilder("");
          localStringBuilder.append("------=_NextPart_5208D22F_0929AFA8_5112E4AB");
          localStringBuilder.append("\n");
          localStringBuilder.append(String.format("Content-Type:image/jpeg;name=\"%s\"", new Object[] { localObject6 }));
          localStringBuilder.append("\n");
          localStringBuilder.append("Content-Transfer-Encoding:base64");
          localStringBuilder.append("\n");
          localStringBuilder.append(String.format("Content-ID:<%s>", new Object[] { localObject6 }));
          localStringBuilder.append("\n");
          localStringBuilder.append("\r\n");
          localStringBuilder.append(String.format("QQMail-LinkID:%s", new Object[] { localObject5 }));
          localStringBuilder.append("\n");
          localStringBuilder.append(String.format("QQMail-LinkSize:%d", new Object[] { Integer.valueOf(m) }));
          localStringBuilder.append("\n");
          localStringBuilder.append("QQMail-LineLen:72");
          localStringBuilder.append("\n");
          localStringBuilder.append("QQMail-BreakType:1");
          localStringBuilder.append("\n");
          localStringBuilder.append(String.format("QQMail-Key:%s", new Object[] { k.EY((String)localObject5) }));
          localStringBuilder.append("\n");
          localStringBuilder.append("QQMail-LinkEnd");
          localStringBuilder.append("\n");
          ((StringBuilder)localObject2).append(localStringBuilder.toString());
          ((StringBuilder)localObject2).append("\r\n");
          j += 1;
        }
        ((k)localObject4).nSJ = null;
        break;
        ((k)localObject4).nSI = null;
        break label653;
      }
      label1673:
      ((StringBuilder)localObject2).append("\r\n");
      if ((((k)localObject4).nSJ != null) && (((k)localObject4).nSJ.length > 0))
      {
        localObject1 = ((k)localObject4).nSJ;
        k = localObject1.length;
        j = 0;
        while (j < k)
        {
          localObject5 = localObject1[j];
          localObject4 = ((k.a)localObject5).nSK;
          m = ((k.a)localObject5).fileSize;
          localObject5 = ((k.a)localObject5).name;
          localObject6 = new StringBuilder("");
          ((StringBuilder)localObject6).append("------=_NextPart_5208D22F_0929AFA8_5112E4AB");
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append(String.format("Content-Type:application/octet-stream;charset=\"utf-8\";name=\"=?utf-8?B?%s?=\"", new Object[] { Base64.encodeToString(((String)localObject5).getBytes(), 2) }));
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append(String.format("Content-Disposition: attachment; filename=\"=?utf-8?B?%s?=\"", new Object[] { Base64.encodeToString(((String)localObject5).getBytes(), 2) }));
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append("Content-Transfer-Encoding:base64");
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append(String.format("Content-ID:<%s>", new Object[] { Long.valueOf(System.currentTimeMillis()) }));
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append("\r\n");
          ((StringBuilder)localObject6).append(String.format("QQMail-LinkID:%s", new Object[] { localObject4 }));
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append(String.format("QQMail-LinkSize:%d", new Object[] { Integer.valueOf(m) }));
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append("QQMail-LineLen:72");
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append("QQMail-BreakType:1");
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append(String.format("QQMail-Key:%s", new Object[] { k.EY((String)localObject4) }));
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject6).append("QQMail-LinkEnd");
          ((StringBuilder)localObject6).append("\n");
          ((StringBuilder)localObject2).append(((StringBuilder)localObject6).toString());
          ((StringBuilder)localObject2).append("\r\n");
          j += 1;
        }
      }
      ((StringBuilder)localObject2).append("------=_NextPart_5208D22F_0929AFA8_5112E4AB--");
      localObject1 = new m(((StringBuilder)localObject2).toString(), this.eMI, this.nSE, i, new f()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(5474741125120L, 40790);
          w.i("MicroMsg.ShareModeMailAppService", "composeSend, offset: %d, totalLen: %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          if (paramAnonymousInt1 >= paramAnonymousInt2)
          {
            w.i("MicroMsg.ShareModeMailAppService", "finish send");
            if (localObject3 != null) {
              localObject3.aYC();
            }
          }
          GMTrace.o(5474741125120L, 40790);
        }
      });
      at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
      GMTrace.o(5472996294656L, 40777);
      return;
      localObject2 = null;
    }
  }
  
  public final void f(HashMap<Long, String> paramHashMap)
  {
    GMTrace.i(16027207335936L, 119412);
    if (this.nTx == null) {
      this.nTx = new HashMap();
    }
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Long)localIterator.next();
      String str = (String)paramHashMap.get(localObject);
      localObject = (String)this.nTs.get(String.valueOf(localObject));
      w.i("MicroMsg.ShareModeMailAppService", "appendDownloadImgToAttachIdMap, filePath: %s, attachId: %s", new Object[] { localObject, str });
      if (!bg.nm((String)localObject)) {
        this.nTx.put(localObject, str);
      }
    }
    GMTrace.o(16027207335936L, 119412);
  }
  
  public final void sS(final int paramInt)
  {
    GMTrace.i(5472727859200L, 40775);
    if (this.nTy != null) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5452729417728L, 40626);
          v.this.nTy.L(v.this.nSb, paramInt, this.gIC);
          GMTrace.o(5452729417728L, 40626);
        }
      });
    }
    GMTrace.o(5472727859200L, 40775);
  }
  
  static abstract interface a
  {
    public abstract void aYC();
  }
  
  public static abstract interface b
  {
    public abstract void a(ArrayList<Long> paramArrayList, HashMap<Long, String> paramHashMap);
  }
  
  public static abstract interface c
  {
    public abstract void aYB();
  }
  
  public static abstract interface d
  {
    public abstract void c(int paramInt1, int paramInt2, String paramString1, String paramString2);
  }
  
  public static abstract interface e
  {
    public abstract void Fb(String paramString);
  }
  
  public static abstract interface f
  {
    public abstract void L(String paramString, int paramInt1, int paramInt2);
  }
  
  public static final class g
  {
    public String eML;
    public String euR;
    
    public g()
    {
      GMTrace.i(5474875342848L, 40791);
      GMTrace.o(5474875342848L, 40791);
    }
    
    public g(String paramString1, String paramString2)
    {
      GMTrace.i(5475009560576L, 40792);
      this.eML = paramString1;
      this.euR = paramString2;
      GMTrace.o(5475009560576L, 40792);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */