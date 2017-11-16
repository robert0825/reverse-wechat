package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.plugin.sns.data.h;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.q;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.amb;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.anf;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.anw;
import com.tencent.mm.protocal.c.anx;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bfc;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfr;
import com.tencent.mm.protocal.c.bgp;
import com.tencent.mm.protocal.c.bhq;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.cm;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.cu;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class aw
{
  private static final Pattern hux;
  public anf eUF;
  private String fJS;
  public int iZe;
  int ppm;
  int ppn;
  List<h> pwE;
  String pwF;
  String pwG;
  LinkedList<bgp> pwH;
  LinkedList<Long> pwI;
  public biz pwJ;
  public anv pwK;
  m pwL;
  bfh pwM;
  as pwN;
  public bhq pwO;
  public boolean pwP;
  
  static
  {
    GMTrace.i(8085007499264L, 60238);
    hux = Pattern.compile("(\n){3,}");
    GMTrace.o(8085007499264L, 60238);
  }
  
  public aw(int paramInt)
  {
    GMTrace.i(8079907225600L, 60200);
    this.pwJ = e.LU();
    this.pwK = new anv();
    this.pwL = new m();
    this.pwM = null;
    Object localObject = new as();
    ((as)localObject).tOK = new aq();
    ((as)localObject).tOM = new cm();
    ((as)localObject).tON = new cu();
    this.pwN = ((as)localObject);
    this.pwO = new bhq();
    this.eUF = new anf();
    this.fJS = "";
    this.pwP = false;
    this.fJS = ae.biJ();
    this.iZe = paramInt;
    this.pwJ.uUc.ueV = paramInt;
    w.d("MicroMsg.UploadPackHelper", "contentType " + paramInt);
    this.pwJ.uCQ = 0;
    this.pwJ.jhi = this.fJS;
    this.pwK.tPP = com.tencent.mm.a.g.n((ae.biJ() + bg.Pw() + System.currentTimeMillis()).getBytes());
    this.pwK.uDk = 0;
    this.pwK.uDl = 0;
    this.pwK.uCQ = 0;
    this.pwK.uDo = 0;
    this.pwK.gsq = 0;
    this.pwK.uDq = 0;
    this.pwK.uDs = 0;
    localObject = new bfh();
    ((bfh)localObject).tXT = 0L;
    ((bfh)localObject).nFd = 0;
    ((bfh)localObject).uQN = 0;
    ((bfh)localObject).tRz = ae.biJ();
    ((bfh)localObject).uQQ = new LinkedList();
    ((bfh)localObject).uQO = 0;
    ((bfh)localObject).uQP = 0;
    ((bfh)localObject).uQW = new LinkedList();
    ((bfh)localObject).uQU = 0;
    ((bfh)localObject).uQV = 0;
    ((bfh)localObject).uQT = new LinkedList();
    ((bfh)localObject).uQR = 0;
    ((bfh)localObject).uQS = 0;
    ((bfh)localObject).uEI = 1;
    ((bfh)localObject).uQN = 0;
    ((bfh)localObject).uQX = 0;
    ((bfh)localObject).uQM = new azp().be(new byte[0]);
    this.pwM = ((bfh)localObject);
    localObject = this.pwL;
    ((m)localObject).field_localFlag |= 0x10;
    this.pwL.gl((int)(System.currentTimeMillis() / 1000L));
    this.pwL.field_type = paramInt;
    this.pwL.field_userName = this.fJS;
    this.pwL.field_pravited = 0;
    this.pwL.field_stringSeq = "0000099999999999999999999";
    this.pwL.uV(2);
    this.pwL.blV();
    if ((paramInt == 1) || (paramInt == 2)) {
      this.pwL.uV(4);
    }
    if (paramInt == 7) {
      this.pwL.uY(2);
    }
    this.pwI = new LinkedList();
    this.pwK.uDr = this.pwI;
    localObject = this.pwI.iterator();
    while (((Iterator)localObject).hasNext())
    {
      long l = ((Long)((Iterator)localObject).next()).longValue();
      bfc localbfc = new bfc();
      localbfc.uQK = l;
      this.pwM.tQs.add(localbfc);
    }
    this.pwM.uFY = this.pwI.size();
    GMTrace.o(8079907225600L, 60200);
  }
  
  private static String HH(String paramString)
  {
    GMTrace.i(8080041443328L, 60201);
    if (paramString == null) {}
    String str2;
    for (String str1 = "";; str2 = paramString)
    {
      paramString = str1;
      try
      {
        str1 = str1.trim();
        paramString = str1;
        str1 = str1.replace("\r\n", "\n");
        paramString = str1;
        str1 = hux.matcher(str1).replaceAll("\n\n");
        GMTrace.o(8080041443328L, 60201);
        return str1;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      w.e("MicroMsg.UploadPackHelper", "filter desc error ");
      GMTrace.o(8080041443328L, 60201);
      return paramString;
    }
  }
  
  public static void HS(String paramString)
  {
    GMTrace.i(14438337871872L, 107574);
    paramString = new File(paramString);
    if (!paramString.getParentFile().exists()) {
      paramString.getParentFile().mkdirs();
    }
    GMTrace.o(14438337871872L, 107574);
  }
  
  public static anu V(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8083262668800L, 60225);
    anu localanu = e.LV();
    localanu.mmR = paramString1;
    w.d("MicroMsg.UploadPackHelper", "mediaOBj type 2");
    localanu.jib = 2;
    localanu.lPM = paramString2;
    localanu.uCN = 0;
    localanu.uCO = paramString3;
    localanu.uCP = 0;
    localanu.uCU = 1;
    GMTrace.o(8083262668800L, 60225);
    return localanu;
  }
  
  public static anu a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    GMTrace.i(15963588132864L, 118938);
    anu localanu = e.LV();
    localanu.mmR = paramString1;
    w.i("MicroMsg.UploadPackHelper", "mediaType %d  videopath %s sightmd5 %s,cdnUrl %s,cdnThumbUrl %s", new Object[] { Integer.valueOf(6), paramString2, paramString4, paramString5, paramString6 });
    localanu.jib = 6;
    if (FileOp.kX(paramString2) <= 0L)
    {
      GMTrace.o(15963588132864L, 118938);
      return null;
    }
    paramString1 = new h(paramString2, 6);
    paramString1.ppr = paramString4;
    paramString3 = ae.biS().a(paramString1, paramString2, paramString3, paramString5, paramString6);
    paramString2 = null;
    paramString1 = paramString2;
    if (paramString3.height > 0)
    {
      paramString1 = paramString2;
      if (paramString3.width > 0)
      {
        paramString1 = paramString2;
        if (paramString3.fileSize > 0)
        {
          paramString1 = new anw();
          paramString1.uDF = paramString3.height;
          paramString1.uDE = paramString3.width;
          paramString1.uDG = paramString3.fileSize;
        }
      }
    }
    localanu.mmR = ("Locall_path" + paramString3.ppo);
    localanu.uCR = paramString1;
    localanu.ppo = paramString3.ppo;
    GMTrace.o(15963588132864L, 118938);
    return localanu;
  }
  
  private static anu q(String paramString1, int paramInt, String paramString2)
  {
    Object localObject = null;
    GMTrace.i(8083128451072L, 60224);
    anu localanu = e.LV();
    localanu.mmR = paramString1;
    w.d("MicroMsg.UploadPackHelper", "mediaOBj type 2");
    localanu.jib = 2;
    if (FileOp.kX(paramString2) <= 0L)
    {
      GMTrace.o(8083128451072L, 60224);
      return null;
    }
    paramString1 = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(new StringBuilder().append(paramString2).append(System.currentTimeMillis()).toString().getBytes());
    FileOp.o(paramString2, paramString1);
    paramString1 = new h(paramString1, 2);
    paramString2 = new LinkedList();
    paramString2.add(paramString1);
    paramString1 = ae.biS().bz(paramString2);
    if ((paramString1 == null) || (paramString1.size() == 0))
    {
      GMTrace.o(8083128451072L, 60224);
      return null;
    }
    paramString2 = (h)paramString1.get(0);
    paramString1 = (String)localObject;
    if (paramString2.height > 0)
    {
      paramString1 = (String)localObject;
      if (paramString2.width > 0)
      {
        paramString1 = (String)localObject;
        if (paramString2.fileSize > 0)
        {
          paramString1 = new anw();
          paramString1.uDF = paramString2.height;
          paramString1.uDE = paramString2.width;
          paramString1.uDG = paramString2.fileSize;
        }
      }
    }
    localanu.mmR = ("Locall_path" + paramString2.ppo);
    localanu.uCR = paramString1;
    localanu.ppo = paramString2.ppo;
    GMTrace.o(8083128451072L, 60224);
    return localanu;
  }
  
  private static anu r(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(8082994233344L, 60223);
    if (bg.bq(paramArrayOfByte))
    {
      w.e("MicroMsg.UploadPackHelper", com.tencent.mm.compatible.util.g.tC() + " attachBuf is null");
      GMTrace.o(8082994233344L, 60223);
      return null;
    }
    String str = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(new StringBuilder(" ").append(System.currentTimeMillis()).toString().getBytes());
    FileOp.la(ae.getAccSnsTmpPath());
    w.d("MicroMsg.UploadPackHelper", com.tencent.mm.compatible.util.g.tC() + " buildUploadAttachInfo file:" + str);
    if (FileOp.b(str, paramArrayOfByte, paramArrayOfByte.length) < 0)
    {
      w.e("MicroMsg.UploadPackHelper", com.tencent.mm.compatible.util.g.tC() + " writeFile error file:" + str);
      GMTrace.o(8082994233344L, 60223);
      return null;
    }
    paramString = q(paramString, 2, str);
    GMTrace.o(8082994233344L, 60223);
    return paramString;
  }
  
  public final aw HI(String paramString)
  {
    GMTrace.i(8080175661056L, 60202);
    this.pwF = HH(paramString);
    this.pwJ.uTZ = this.pwF;
    GMTrace.o(8080175661056L, 60202);
    return this;
  }
  
  public final aw HJ(String paramString)
  {
    GMTrace.i(8080578314240L, 60205);
    this.pwJ.uUg = paramString;
    this.pwN.tOK.tOD = paramString;
    GMTrace.o(8080578314240L, 60205);
    return this;
  }
  
  public final aw HK(String paramString)
  {
    GMTrace.i(8080712531968L, 60206);
    this.pwJ.pRQ = paramString;
    GMTrace.o(8080712531968L, 60206);
    return this;
  }
  
  public final aw HL(String paramString)
  {
    GMTrace.i(8080980967424L, 60208);
    this.pwG = paramString;
    this.pwJ.uUc.lPj = paramString;
    GMTrace.o(8080980967424L, 60208);
    return this;
  }
  
  public final aw HM(String paramString)
  {
    GMTrace.i(8081115185152L, 60209);
    this.pwJ.uUc.lPM = paramString;
    GMTrace.o(8081115185152L, 60209);
    return this;
  }
  
  public final aw HN(String paramString)
  {
    GMTrace.i(8081249402880L, 60210);
    this.pwJ.uUc.eBt = paramString;
    GMTrace.o(8081249402880L, 60210);
    return this;
  }
  
  public final aw HO(String paramString)
  {
    GMTrace.i(8082188926976L, 60217);
    cs localcs2 = this.pwJ.uUb;
    cs localcs1 = localcs2;
    if (localcs2 == null) {
      localcs1 = new cs();
    }
    localcs1.mmR = paramString;
    this.pwJ.uUb = localcs1;
    GMTrace.o(8082188926976L, 60217);
    return this;
  }
  
  public final aw HP(String paramString)
  {
    GMTrace.i(8082323144704L, 60218);
    cs localcs2 = this.pwJ.uUb;
    cs localcs1 = localcs2;
    if (localcs2 == null) {
      localcs1 = new cs();
    }
    localcs1.lRT = paramString;
    this.pwJ.uUb = localcs1;
    GMTrace.o(8082323144704L, 60218);
    return this;
  }
  
  public final aw HQ(String paramString)
  {
    GMTrace.i(8082457362432L, 60219);
    this.pwJ.twr = bg.nl(paramString);
    GMTrace.o(8082457362432L, 60219);
    return this;
  }
  
  public final aw HR(String paramString)
  {
    GMTrace.i(8082591580160L, 60220);
    this.pwJ.tws = bg.nl(paramString);
    GMTrace.o(8082591580160L, 60220);
    return this;
  }
  
  public final aw U(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8080846749696L, 60207);
    aq localaq = this.pwN.tOK;
    Object localObject = paramString1;
    if (bg.nm(paramString1)) {
      localObject = "";
    }
    localaq.lQa = ((String)localObject);
    localObject = this.pwN.tOK;
    paramString1 = paramString2;
    if (bg.nm(paramString2)) {
      paramString1 = "";
    }
    ((aq)localObject).tOE = paramString1;
    paramString2 = this.pwN.tOK;
    paramString1 = paramString3;
    if (bg.nm(paramString3)) {
      paramString1 = "";
    }
    paramString2.tOF = paramString1;
    GMTrace.o(8080846749696L, 60207);
    return this;
  }
  
  public final aw a(amc paramamc)
  {
    GMTrace.i(8081517838336L, 60212);
    if (paramamc == null)
    {
      GMTrace.o(8081517838336L, 60212);
      return this;
    }
    this.pwJ.uUa = paramamc;
    GMTrace.o(8081517838336L, 60212);
    return this;
  }
  
  @Deprecated
  public final boolean a(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    GMTrace.i(8083665321984L, 60228);
    paramString1 = V("", paramString1, paramString2);
    if (paramString1 == null)
    {
      w.e("MicroMsg.UploadPackHelper", "share img o.url is null!");
      GMTrace.o(8083665321984L, 60228);
      return false;
    }
    paramString1.lPj = paramString3;
    if (paramInt > 0) {
      paramString1.eCt = paramInt;
    }
    if (!bg.nm(paramString4)) {
      paramString1.pPP = paramString4;
    }
    this.pwJ.uUc.ueW.add(paramString1);
    GMTrace.o(8083665321984L, 60228);
    return true;
  }
  
  public final boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    GMTrace.i(8083799539712L, 60229);
    boolean bool = a(paramArrayOfByte, paramString1, paramString2, -1, "");
    GMTrace.o(8083799539712L, 60229);
    return bool;
  }
  
  public final boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    GMTrace.i(8083933757440L, 60230);
    paramArrayOfByte = r("", paramArrayOfByte);
    if (paramArrayOfByte == null)
    {
      w.e("MicroMsg.UploadPackHelper", "share img o.data is null!");
      GMTrace.o(8083933757440L, 60230);
      return false;
    }
    paramArrayOfByte.lPj = paramString1;
    if (paramInt > 0) {
      paramArrayOfByte.eCt = paramInt;
    }
    if (!bg.nm(paramString3)) {
      paramArrayOfByte.pPP = paramString3;
    }
    if (!bg.nm(paramString2)) {
      paramArrayOfByte.eBt = paramString2;
    }
    if (!bg.nm(paramString1)) {
      paramArrayOfByte.lPj = paramString1;
    }
    this.pwJ.uUc.ueW.add(paramArrayOfByte);
    paramString1 = new amb();
    paramString1.uAW = paramArrayOfByte.ppo;
    this.pwK.uDm.add(paramString1);
    GMTrace.o(8083933757440L, 60230);
    return true;
  }
  
  public final boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5)
  {
    GMTrace.i(8084067975168L, 60231);
    paramArrayOfByte = r("", paramArrayOfByte);
    if ((paramArrayOfByte == null) || ((bg.nm(paramString2)) && (bg.nm(paramString3))))
    {
      w.e("MicroMsg.UploadPackHelper", "share music/video  appmsg.thumbData is null!");
      GMTrace.o(8084067975168L, 60231);
      return false;
    }
    if (!bg.nm(paramString1)) {
      this.pwJ.uUc.lPM = paramString1;
    }
    if (!bg.nm(paramString3))
    {
      paramArrayOfByte.lPM = paramString3;
      paramArrayOfByte.uCN = 0;
    }
    for (;;)
    {
      if (!bg.nm(paramString2))
      {
        paramArrayOfByte.uCS = paramString2;
        paramArrayOfByte.uCT = 0;
      }
      paramArrayOfByte.jib = paramInt;
      paramArrayOfByte.eBt = bg.aq(paramString4, "");
      paramArrayOfByte.lPj = bg.aq(paramString5, "");
      this.pwJ.uUc.ueW.add(paramArrayOfByte);
      paramString1 = new amb();
      paramString1.uAW = paramArrayOfByte.ppo;
      this.pwK.uDm.add(paramString1);
      GMTrace.o(8084067975168L, 60231);
      return true;
      if (!bg.nm(paramString2))
      {
        paramArrayOfByte.lPM = paramString2;
        paramArrayOfByte.uCN = 0;
      }
    }
  }
  
  public final aw ak(LinkedList<bgp> paramLinkedList)
  {
    GMTrace.i(8081920491520L, 60215);
    this.pwH = paramLinkedList;
    this.pwK.uDn = paramLinkedList;
    paramLinkedList = this.pwH.iterator();
    while (paramLinkedList.hasNext())
    {
      bgp localbgp = (bgp)paramLinkedList.next();
      bew localbew = new bew();
      localbew.tRz = localbgp.jhi;
      this.pwM.uQW.add(localbew);
    }
    this.pwM.uQU = this.pwH.size();
    this.pwM.uQV = this.pwH.size();
    GMTrace.o(8081920491520L, 60215);
    return this;
  }
  
  public final aw bv(List<String> paramList)
  {
    GMTrace.i(8082725797888L, 60221);
    if ((paramList == null) || (paramList.size() == 0))
    {
      this.pwM.uEI = 1;
      GMTrace.o(8082725797888L, 60221);
      return this;
    }
    paramList = paramList.iterator();
    LinkedList localLinkedList = new LinkedList();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      azq localazq = new azq();
      localazq.Rq(str);
      localLinkedList.add(localazq);
    }
    this.pwK.uDw = localLinkedList;
    if (this.pwM.uEI == 3)
    {
      this.pwM.uRb = localLinkedList;
      this.pwM.uRa = localLinkedList.size();
    }
    for (;;)
    {
      GMTrace.o(8082725797888L, 60221);
      return this;
      if (this.pwM.uEI == 5)
      {
        this.pwM.uDw = localLinkedList;
        this.pwM.uRc = localLinkedList.size();
      }
    }
  }
  
  public final void bw(List<h> paramList)
  {
    GMTrace.i(8084202192896L, 60232);
    this.pwE = paramList;
    paramList = ae.biS().bz(this.pwE);
    Object localObject1 = new LinkedList();
    if (paramList == null)
    {
      GMTrace.o(8084202192896L, 60232);
      return;
    }
    Object localObject2 = paramList.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      h localh = (h)((Iterator)localObject2).next();
      amb localamb = new amb();
      localamb.uAW = localh.ppo;
      ((LinkedList)localObject1).add(localamb);
    }
    this.pwK.uDm = ((LinkedList)localObject1);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      localObject1 = (h)paramList.next();
      localObject2 = new anw();
      ((anw)localObject2).uDF = 0.0F;
      ((anw)localObject2).uDE = 0.0F;
      ((anw)localObject2).uDG = 0.0F;
      if ((((h)localObject1).height > 0) && (((h)localObject1).width > 0) && (((h)localObject1).fileSize > 0))
      {
        ((anw)localObject2).uDF = ((h)localObject1).height;
        ((anw)localObject2).uDE = ((h)localObject1).width;
        ((anw)localObject2).uDG = ((h)localObject1).fileSize;
      }
      localObject1 = e.a("Locall_path" + ((h)localObject1).ppo, ((h)localObject1).type, "", "", 0, 0, this.ppn, "", (anw)localObject2);
      this.pwJ.uUc.ueW.add(localObject1);
    }
    GMTrace.o(8084202192896L, 60232);
  }
  
  public final int commit()
  {
    GMTrace.i(8084604846080L, 60235);
    long l = System.currentTimeMillis();
    try
    {
      this.pwK.uDp = System.currentTimeMillis();
      this.pwK.gsq = 0;
      this.pwL.aE(this.pwM.toByteArray());
      this.pwL.field_postBuf = this.pwK.toByteArray();
      w.d("MicroMsg.UploadPackHelper", "snsObj " + this.pwM.toString());
      w.d("MicroMsg.UploadPackHelper", "postinfo " + this.pwK.toString());
      w.d("MicroMsg.UploadPackHelper", "timelineObj " + this.pwJ.toString());
      if (this.pwJ.uUc.ueW != null)
      {
        w.d("MicroMsg.UploadPackHelper", "timelineObj MeidaCount %d ", new Object[] { Integer.valueOf(this.pwJ.uUc.ueW.size()) });
        i = 0;
        while (i < this.pwJ.uUc.ueW.size())
        {
          anu localanu = (anu)this.pwJ.uUc.ueW.get(i);
          if (localanu != null) {
            w.d("MicroMsg.UploadPackHelper", "timelineObj media %d %s", new Object[] { Integer.valueOf(localanu.ppo), bg.aq(localanu.lPM, "") });
          }
          i += 1;
        }
      }
    }
    catch (Exception localException1)
    {
      int i;
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.UploadPackHelper", localException1, "", new Object[0]);
      }
      if (this.pwN != null) {
        this.pwJ.pwN = this.pwN;
      }
      this.pwL.c(this.pwJ);
      int k = ae.bjd().y(this.pwL);
      Iterator localIterator = this.pwK.uDm.iterator();
      int j = 0;
      Object localObject1 = null;
      if (localIterator.hasNext())
      {
        Object localObject2 = (amb)localIterator.next();
        q localq = ae.biS().dV(((amb)localObject2).uAW);
        for (;;)
        {
          try
          {
            anx localanx = (anx)new anx().aD(localq.pMO);
            if (this.pwJ.uUb != null) {
              localanx.eSd = this.pwJ.uUb.mmR;
            }
            if (this.eUF != null) {
              this.eUF.uCa = 0;
            }
            localanx.uDO = this.eUF;
            localanx.iZe = this.pwJ.uUc.ueV;
            if ((localanx.iZe == 1) || (localanx.iZe == 15))
            {
              if (!bg.nm(localanx.eSd))
              {
                i = 5;
                localanx.uDP = i;
              }
            }
            else
            {
              localq.pMO = localanx.toByteArray();
              ae.biS().a(((amb)localObject2).uAW, localq);
              localObject2 = localanx.eDW;
              j += 1;
              localObject1 = localObject2;
              break;
            }
            if ((localanx.uDO == null) || (localanx.iZe != 15)) {
              break label607;
            }
            if (localanx.uDO.uBZ)
            {
              i = 1;
              localanx.uDP = i;
              continue;
            }
          }
          catch (Exception localException2)
          {
            w.e("MicroMsg.UploadPackHelper", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
          }
          i = 2;
          continue;
          label607:
          boolean bool = ((h)this.pwE.get(j)).pps;
          if (bool) {
            i = 1;
          } else {
            i = 2;
          }
        }
      }
      w.i("MicroMsg.UploadPackHelper", "commit sns info ret %d, typeFlag %d sightMd5 %s", new Object[] { Integer.valueOf(k), Integer.valueOf(this.pwL.field_type), localObject1 });
      if ((k > 0) && (this.pwL.field_type == 15)) {
        ap.dG(u.W("sns_table_", k), (String)localObject1);
      }
      w.d("MicroMsg.UploadPackHelper", "pack commit result " + k + " cost " + (System.currentTimeMillis() - l));
      GMTrace.o(8084604846080L, 60235);
      return k;
    }
  }
  
  public final void d(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    GMTrace.i(8084336410624L, 60233);
    bfr localbfr = new bfr();
    localbfr.tQR = paramString1;
    localbfr.tQS = paramString2;
    localbfr.tQT = paramString3;
    localbfr.pRL = paramInt1;
    localbfr.pRM = paramInt2;
    this.pwK.uDx = localbfr;
    GMTrace.o(8084336410624L, 60233);
  }
  
  public final aw dH(String paramString1, String paramString2)
  {
    GMTrace.i(8080309878784L, 60203);
    this.pwK.token = paramString1;
    this.pwK.uDu = paramString2;
    GMTrace.o(8080309878784L, 60203);
    return this;
  }
  
  public final boolean dI(String paramString1, String paramString2)
  {
    GMTrace.i(8083531104256L, 60227);
    String str = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(paramString1.getBytes());
    HS(str);
    FileOp.o(paramString1, str);
    paramString1 = q("", 2, str);
    if (paramString1 == null)
    {
      w.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
      GMTrace.o(8083531104256L, 60227);
      return false;
    }
    paramString1.lPj = paramString2;
    if (bg.nm(paramString1.eBt)) {
      paramString1.eBt = paramString2;
    }
    this.pwJ.uUc.ueW.add(paramString1);
    paramString2 = new amb();
    paramString2.uAW = paramString1.ppo;
    this.pwK.uDm.add(paramString2);
    GMTrace.o(8083531104256L, 60227);
    return true;
  }
  
  public final boolean j(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(8083396886528L, 60226);
    String str = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(paramString1.getBytes());
    HS(str);
    FileOp.o(paramString1, str);
    paramString1 = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(paramString2.getBytes());
    FileOp.o(paramString2, paramString1);
    paramString1 = a("", 6, str, paramString1, paramString4, "", "");
    if (paramString1 == null)
    {
      w.e("MicroMsg.UploadPackHelper", "share img o.imagePath is null!");
      GMTrace.o(8083396886528L, 60226);
      return false;
    }
    paramString1.lPj = paramString3;
    if (bg.nm(paramString1.eBt)) {
      paramString1.eBt = paramString3;
    }
    this.pwJ.uUc.ueW.add(paramString1);
    paramString2 = new amb();
    paramString2.uAW = paramString1.ppo;
    this.pwK.uDm.add(paramString2);
    GMTrace.o(8083396886528L, 60226);
    return true;
  }
  
  public final void oJ(String paramString)
  {
    GMTrace.i(8084470628352L, 60234);
    this.pwK.eDA = paramString;
    GMTrace.o(8084470628352L, 60234);
  }
  
  public final aw uA(int paramInt)
  {
    GMTrace.i(8080444096512L, 60204);
    this.pwJ.uUe = 1;
    this.pwJ.uUf = paramInt;
    GMTrace.o(8080444096512L, 60204);
    return this;
  }
  
  public final void uB(int paramInt)
  {
    GMTrace.i(8081383620608L, 60211);
    w.d("MicroMsg.UploadPackHelper", "set post form " + paramInt);
    this.pwK.uDq = paramInt;
    GMTrace.o(8081383620608L, 60211);
  }
  
  public final aw uC(int paramInt)
  {
    GMTrace.i(8081652056064L, 60213);
    this.ppn = paramInt;
    this.pwK.uCQ = paramInt;
    this.pwJ.uCQ = paramInt;
    if (paramInt > 0)
    {
      this.pwL.field_pravited = paramInt;
      this.pwL.blS();
      this.pwL.uY(2);
      this.pwL.blW();
    }
    GMTrace.o(8081652056064L, 60213);
    return this;
  }
  
  public final aw uD(int paramInt)
  {
    GMTrace.i(8081786273792L, 60214);
    this.ppm = paramInt;
    this.pwK.uDl = paramInt;
    GMTrace.o(8081786273792L, 60214);
    return this;
  }
  
  public final aw uE(int paramInt)
  {
    GMTrace.i(8082054709248L, 60216);
    this.pwK.uDs = paramInt;
    GMTrace.o(8082054709248L, 60216);
    return this;
  }
  
  public final aw uF(int paramInt)
  {
    GMTrace.i(8082860015616L, 60222);
    if (paramInt == 1) {
      this.pwM.uEI = 3;
    }
    for (;;)
    {
      this.pwK.uDv = paramInt;
      GMTrace.o(8082860015616L, 60222);
      return this;
      if (paramInt == 0) {
        this.pwM.uEI = 5;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */