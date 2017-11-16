package com.tencent.mm.plugin.sns.model;

import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.a.pt;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.g.c;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.protocal.ad;
import com.tencent.mm.protocal.c.ahh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.beq;
import com.tencent.mm.protocal.c.ber;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfz;
import com.tencent.mm.protocal.c.bga;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.nl;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ao;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class t
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static List<ao> psE;
  private static c psG;
  private static boolean psH;
  public String fJS;
  com.tencent.mm.ad.b fUa;
  com.tencent.mm.ad.e fUd;
  private a psF;
  
  static
  {
    GMTrace.i(8116146012160L, 60470);
    psE = new LinkedList();
    psH = true;
    GMTrace.o(8116146012160L, 60470);
  }
  
  public t()
  {
    GMTrace.i(8113059004416L, 60447);
    this.fJS = "";
    this.psF = new a();
    localObject = new b.a();
    ((b.a)localObject).gtF = new bfz();
    ((b.a)localObject).gtG = new bga();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnssync";
    ((b.a)localObject).gtE = 214;
    ((b.a)localObject).gtH = 102;
    ((b.a)localObject).gtI = 1000000102;
    this.fUa = ((b.a)localObject).DA();
    ((bfz)this.fUa.gtC.gtK).tZz = 256;
    this.fJS = com.tencent.mm.y.q.zE();
    long l;
    byte[] arrayOfByte;
    if (psH)
    {
      l = System.currentTimeMillis();
      localObject = new StringBuilder();
      h.xz();
      localObject = h.xy().cachePath + "ad_1100007";
      w.i("MicroMsg.NetSceneNewSyncAlbum", "filepath to list  " + (String)localObject);
      arrayOfByte = FileOp.c((String)localObject, 0, -1);
      if (arrayOfByte == null) {}
    }
    try
    {
      psG = (c)new c().aD(arrayOfByte);
      w.i("MicroMsg.NetSceneNewSyncAlbum", "fileToList " + (System.currentTimeMillis() - l));
      if (psG != null) {
        break label286;
      }
      w.i("MicroMsg.NetSceneNewSyncAlbum", "igNoreAbTestId parser error");
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", localIOException, "", new Object[0]);
        FileOp.deleteFile((String)localObject);
        continue;
        w.i("MicroMsg.NetSceneNewSyncAlbum", "igNoreAbTestId size " + psG.pyY.size());
      }
    }
    psH = false;
    GMTrace.o(8113059004416L, 60447);
  }
  
  private static void AG()
  {
    GMTrace.i(8115474923520L, 60465);
    Iterator localIterator = psE.iterator();
    while (localIterator.hasNext())
    {
      ao localao = (ao)localIterator.next();
      if (localao != null) {
        localao.AG();
      }
    }
    GMTrace.o(8115474923520L, 60465);
  }
  
  public static void a(ao paramao)
  {
    GMTrace.i(8115609141248L, 60466);
    if (!psE.contains(paramao)) {
      psE.add(paramao);
    }
    GMTrace.o(8115609141248L, 60466);
  }
  
  private static boolean a(ber paramber, beq parambeq, long paramLong1, long paramLong2, String paramString)
  {
    GMTrace.i(8114938052608L, 60461);
    try
    {
      int i = bg.getInt(com.tencent.mm.k.g.ut().getValue("SnsAdNotifyLimit"), 0);
      int j = bg.getInt(com.tencent.mm.k.g.ut().getValue("SnsAdNotifyLikeTimeLimit"), 0);
      int k = bg.getInt(com.tencent.mm.k.g.ut().getValue("SnsAdNotifyCommentTimeLimit"), 0);
      boolean bool;
      if (((i > 0) || (j > 0) || (k > 0)) && ((parambeq.jib == 8) || (parambeq.jib == 7)))
      {
        bool = a.a(paramLong1, paramber, i, j, k, true);
        if (dC(paramLong1)) {
          w.i("MicroMsg.NetSceneNewSyncAlbum", "user open notify off");
        }
        if (!bool)
        {
          w.i("MicroMsg.NetSceneNewSyncAlbum", "pass the comment clientId " + paramString + " snsId: " + paramLong1 + " " + parambeq.uQp + " " + parambeq.uQm + " actionLimit:" + i + " actionLikeTimeLimit:" + j + " actionCommentTimeLimit:" + k);
          if (!a.a(paramLong1, paramber))
          {
            w.i("MicroMsg.NetSceneNewSyncAlbum", "pass comment ID  " + paramber.uQt.uQp);
            GMTrace.o(8114938052608L, 60461);
            return false;
          }
          GMTrace.o(8114938052608L, 60461);
          return false;
        }
      }
      w.i("MicroMsg.NetSceneNewSyncAlbum", "processNormalAction clientId " + paramString + " snsId: " + paramLong1 + " " + parambeq.uQp + " " + parambeq.uQm + " actionLimit: " + i);
      if (!ae.bji().a(paramLong1, parambeq.uKB, parambeq.nFd, paramString))
      {
        beq localbeq = paramber.uQu;
        com.tencent.mm.plugin.sns.storage.i locali = new com.tencent.mm.plugin.sns.storage.i();
        locali.field_snsID = paramLong1;
        locali.field_parentID = paramLong2;
        locali.field_createTime = parambeq.nFd;
        locali.field_talker = parambeq.uKB;
        locali.field_type = parambeq.jib;
        locali.field_curActionBuf = parambeq.toByteArray();
        locali.field_refActionBuf = localbeq.toByteArray();
        locali.field_clientId = paramString;
        if ((parambeq.uQr & 0x2) == 0) {}
        for (i = 0;; i = 1)
        {
          locali.field_isSilence = i;
          if ((parambeq.jib != 8) && (parambeq.jib != 7)) {
            break;
          }
          locali.field_commentSvrID = parambeq.uQp;
          if (a.a(paramLong1, paramber)) {
            break label586;
          }
          w.i("MicroMsg.NetSceneNewSyncAlbum", "pass comment ID " + locali.field_snsID + " " + locali.field_commentSvrID);
          GMTrace.o(8114938052608L, 60461);
          return false;
        }
        locali.field_commentSvrID = parambeq.uQm;
        bool = ai.a(paramLong1, paramber);
        if (!bool)
        {
          GMTrace.o(8114938052608L, 60461);
          return false;
        }
        label586:
        ae.bji().b(locali);
        paramber = ae.bji();
        if ((parambeq.uQr & 0x2) != 0) {}
        for (bool = true;; bool = false)
        {
          paramber.l(paramLong1, bool);
          GMTrace.o(8114938052608L, 60461);
          return true;
        }
      }
      GMTrace.o(8114938052608L, 60461);
      return false;
    }
    catch (Exception paramber)
    {
      w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", paramber, "", new Object[0]);
      GMTrace.o(8114938052608L, 60461);
    }
    return false;
  }
  
  public static void b(ao paramao)
  {
    GMTrace.i(8115743358976L, 60467);
    psE.remove(paramao);
    GMTrace.o(8115743358976L, 60467);
  }
  
  private static boolean b(ber paramber, beq parambeq, long paramLong1, long paramLong2, String paramString)
  {
    GMTrace.i(8115072270336L, 60462);
    try
    {
      w.i("MicroMsg.NetSceneNewSyncAlbum", "processHbAction clientId " + paramString + " snsId: " + paramLong1 + " " + parambeq.uQp + " " + parambeq.uQm);
      if (!com.tencent.mm.plugin.sns.lucky.a.g.bhX())
      {
        w.i("MicroMsg.NetSceneNewSyncAlbum", "passed because close lucky");
        GMTrace.o(8115072270336L, 60462);
        return false;
      }
      if (!ae.bji().a(paramLong1, parambeq.uKB, parambeq.nFd, paramString))
      {
        beq localbeq = paramber.uQu;
        com.tencent.mm.plugin.sns.storage.i locali = new com.tencent.mm.plugin.sns.storage.i();
        locali.field_snsID = paramLong1;
        locali.field_parentID = paramLong2;
        locali.field_createTime = parambeq.nFd;
        locali.field_talker = parambeq.uKB;
        locali.field_type = parambeq.jib;
        locali.field_curActionBuf = parambeq.toByteArray();
        locali.field_refActionBuf = localbeq.toByteArray();
        locali.field_clientId = paramString;
        locali.field_commentSvrID = parambeq.uQm;
        w.i("MicroMsg.NetSceneNewSyncAlbum", "curAction.HBBuffer " + parambeq.uQq);
        ai.c(paramLong1, paramber);
        AG();
        ae.bji().b(locali);
        GMTrace.o(8115072270336L, 60462);
        return true;
      }
      GMTrace.o(8115072270336L, 60462);
      return false;
    }
    catch (Exception paramber)
    {
      w.e("MicroMsg.NetSceneNewSyncAlbum", "error processHbAction " + paramber.getMessage());
      w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", paramber, "", new Object[0]);
      GMTrace.o(8115072270336L, 60462);
    }
    return false;
  }
  
  public static void bix()
  {
    GMTrace.i(8113998528512L, 60454);
    if (psG == null)
    {
      GMTrace.o(8113998528512L, 60454);
      return;
    }
    long l = System.currentTimeMillis();
    Object localObject = new StringBuilder();
    h.xz();
    localObject = h.xy().cachePath + "ad_1100007";
    w.i("MicroMsg.NetSceneNewSyncAlbum", "listToFile to list  " + (String)localObject);
    try
    {
      byte[] arrayOfByte = psG.toByteArray();
      com.tencent.mm.a.e.b((String)localObject, arrayOfByte, arrayOfByte.length);
      w.i("MicroMsg.NetSceneNewSyncAlbum", "listTofile " + (System.currentTimeMillis() - l) + " igNoreAbTestId " + psG.pyY.size());
      GMTrace.o(8113998528512L, 60454);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", localException, "listToFile failed: " + (String)localObject, new Object[0]);
      GMTrace.o(8113998528512L, 60454);
    }
  }
  
  public static void biy()
  {
    GMTrace.i(8115340705792L, 60464);
    Iterator localIterator = psE.iterator();
    while (localIterator.hasNext())
    {
      ao localao = (ao)localIterator.next();
      if (localao != null) {
        localao.AH();
      }
    }
    GMTrace.o(8115340705792L, 60464);
  }
  
  private static boolean c(ber paramber, beq parambeq, long paramLong1, long paramLong2, String paramString)
  {
    GMTrace.i(8115206488064L, 60463);
    try
    {
      w.i("MicroMsg.NetSceneNewSyncAlbum", "processGrabHbAction clientId " + paramString + " snsId: " + paramLong1 + " " + parambeq.uQp + " " + parambeq.uQm);
      if (!ae.bji().a(paramLong1, parambeq.uKB, parambeq.nFd, paramString))
      {
        beq localbeq = paramber.uQu;
        paramber = new com.tencent.mm.plugin.sns.storage.i();
        paramber.field_snsID = paramLong1;
        paramber.field_parentID = paramLong2;
        paramber.field_createTime = parambeq.nFd;
        paramber.field_talker = parambeq.uKB;
        paramber.field_type = parambeq.jib;
        paramber.field_curActionBuf = parambeq.toByteArray();
        paramber.field_refActionBuf = localbeq.toByteArray();
        paramber.field_clientId = paramString;
        paramber.field_commentSvrID = parambeq.uQm;
        paramString = new ahh();
        w.i("MicroMsg.NetSceneNewSyncAlbum", "curAction.HBBuffer " + parambeq.uQq);
        paramString.aD(com.tencent.mm.platformtools.n.a(parambeq.uQq));
        w.i("MicroMsg.NetSceneNewSyncAlbum", "hbbuffer  " + paramString.eYB);
        ae.bji().b(paramber);
        GMTrace.o(8115206488064L, 60463);
        return true;
      }
      GMTrace.o(8115206488064L, 60463);
      return false;
    }
    catch (Exception paramber)
    {
      w.e("MicroMsg.NetSceneNewSyncAlbum", "error processHbAction " + paramber.getMessage());
      w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", paramber, "", new Object[0]);
      GMTrace.o(8115206488064L, 60463);
    }
    return false;
  }
  
  public static void dA(long paramLong)
  {
    GMTrace.i(8113595875328L, 60451);
    if (psG == null) {
      psG = new c();
    }
    psG.pyY.add(Long.valueOf(paramLong));
    GMTrace.o(8113595875328L, 60451);
  }
  
  public static void dB(long paramLong)
  {
    GMTrace.i(8113730093056L, 60452);
    if (psG != null) {
      psG.pyY.remove(Long.valueOf(paramLong));
    }
    GMTrace.o(8113730093056L, 60452);
  }
  
  public static boolean dC(long paramLong)
  {
    GMTrace.i(8113864310784L, 60453);
    if (psG == null)
    {
      GMTrace.o(8113864310784L, 60453);
      return false;
    }
    if (psG.pyY.contains(Long.valueOf(paramLong)))
    {
      GMTrace.o(8113864310784L, 60453);
      return true;
    }
    GMTrace.o(8113864310784L, 60453);
    return false;
  }
  
  public static boolean dD(long paramLong)
  {
    GMTrace.i(8114803834880L, 60460);
    try
    {
      boolean bool = a.a(paramLong, null, bg.getInt(com.tencent.mm.k.g.ut().getValue("SnsAdNotifyLimit"), 0), bg.getInt(com.tencent.mm.k.g.ut().getValue("SnsAdNotifyLikeTimeLimit"), 0), bg.getInt(com.tencent.mm.k.g.ut().getValue("SnsAdNotifyCommentTimeLimit"), 0), false);
      GMTrace.o(8114803834880L, 60460);
      return bool;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", localException, "", new Object[0]);
      GMTrace.o(8114803834880L, 60460);
    }
    return true;
  }
  
  public final boolean DE()
  {
    GMTrace.i(8114132746240L, 60455);
    GMTrace.o(8114132746240L, 60455);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8113461657600L, 60450);
    h.xz();
    byte[] arrayOfByte = bg.St(bg.nl((String)h.xy().xh().get(8195, null)));
    azp localazp = new azp();
    localazp.be(arrayOfByte);
    ((bfz)this.fUa.gtC.gtK).tZA = localazp;
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8113461657600L, 60450);
    return i;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    GMTrace.i(8113327439872L, 60449);
    int i = k.b.gum;
    GMTrace.o(8113327439872L, 60449);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8114401181696L, 60457);
    w.d("MicroMsg.NetSceneNewSyncAlbum", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8114401181696L, 60457);
      return;
    }
    bga localbga = (bga)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    paramArrayOfByte = localbga.tZD.jhd;
    if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0))
    {
      w.d("MicroMsg.NetSceneNewSyncAlbum", "cmlList size:" + paramArrayOfByte.size());
      paramString = this.psF;
      paramString.lcw = paramArrayOfByte;
      paramString.lcx.sendEmptyMessage(0);
      GMTrace.o(8114401181696L, 60457);
      return;
    }
    if ((localbga.tZA != null) && (localbga.tZA.uNP != null))
    {
      paramArrayOfByte = localbga.tZA.uNP.toByteArray();
      paramq = ad.g(((bfz)((com.tencent.mm.ad.b)paramq).gtC.gtK).tZA.uNP.toByteArray(), paramArrayOfByte);
      if ((paramq != null) && (paramq.length > 0))
      {
        h.xz();
        h.xy().xh().set(8195, bg.bs(paramq));
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8114401181696L, 60457);
  }
  
  public final boolean a(nk paramnk, final com.tencent.mm.sdk.platformtools.ae paramae)
  {
    GMTrace.i(8114535399424L, 60458);
    final bfh localbfh;
    boolean bool;
    try
    {
      localbfh = (bfh)new bfh().aD(paramnk.uej.uNP.toByteArray());
      paramnk = new String(localbfh.uQM.uNP.toByteArray());
      if (paramnk.indexOf("<contentStyle><![CDATA[1]]></contentStyle>") >= 0) {
        break label464;
      }
      if (paramnk.indexOf("<contentStyle>1</contentStyle>") < 0) {
        break label479;
      }
    }
    catch (Exception paramnk)
    {
      com.tencent.mm.plugin.sns.storage.k localk;
      String[] arrayOfString;
      int i;
      w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", paramnk, "", new Object[0]);
      GMTrace.o(8114535399424L, 60458);
      return false;
    }
    w.i("MicroMsg.NetSceneNewSyncAlbum", "snsSync " + localbfh.tXT + " " + com.tencent.mm.plugin.sns.data.i.dt(localbfh.tXT) + " isPhoto " + bool);
    String str;
    int j;
    if (bool)
    {
      str = com.tencent.mm.plugin.sns.data.i.dt(localbfh.tXT);
      localk = ae.bjh().Iw(localbfh.tRz);
      if (bg.nm(localk.field_newerIds)) {
        break label380;
      }
      arrayOfString = localk.field_newerIds.split(",");
      i = 1;
      j = 0;
      label187:
      if (j >= arrayOfString.length) {
        break label485;
      }
      if (!str.equals(arrayOfString[j])) {
        break label470;
      }
      i = 0;
      break label470;
    }
    for (;;)
    {
      if ((j < 2) && (j < arrayOfString.length) && (i != 0))
      {
        paramnk = paramnk + "," + arrayOfString[j];
        j += 1;
      }
      else
      {
        w.d("MicroMsg.NetSceneNewSyncAlbum", "snsync newerIds " + localbfh.tXT + " S: " + str + " list " + localk.field_newerIds + " newer " + paramnk);
        if (i != 0) {
          ae.bjh().dO(localbfh.tRz, paramnk);
        }
        while (ae.bjd().dO(localbfh.tXT))
        {
          w.i("MicroMsg.NetSceneNewSyncAlbum", "this item has in your sns pass it");
          GMTrace.o(8114535399424L, 60458);
          return false;
          label380:
          ae.bjh().dO(localbfh.tRz, str);
        }
        com.tencent.mm.sdk.b.a.vgX.m(new pt());
        ae.aDa().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8046218575872L, 59949);
            if (!localbfh.tRz.equals(t.this.fJS))
            {
              h.xz();
              if (!h.xw().wL())
              {
                w.e("MicroMsg.NetSceneNewSyncAlbum", "mmcore has not set uin!!");
                GMTrace.o(8046218575872L, 59949);
                return;
              }
              h.xz();
              Object localObject = (String)h.xy().xh().get(68377, null);
              h.xz();
              if ((bg.a((Integer)h.xy().xh().get(68400, null), 0) != localbfh.nFd) || ((!bg.nm((String)localObject)) && (!((String)localObject).equals(localbfh.tRz))))
              {
                h.xz();
                h.xy().xh().set(68377, localbfh.tRz);
                h.xz();
                h.xy().xh().set(68400, Integer.valueOf(localbfh.nFd));
                h.xz();
                h.xy().xh().set(68418, com.tencent.mm.plugin.sns.data.i.dt(localbfh.tXT));
              }
              localObject = t.psE.iterator();
              while (((Iterator)localObject).hasNext()) {
                ((ao)((Iterator)localObject).next()).AF();
              }
            }
            paramae.sendEmptyMessage(0);
            GMTrace.o(8046218575872L, 59949);
          }
        });
        GMTrace.o(8114535399424L, 60458);
        return true;
        label464:
        bool = true;
        break;
        label470:
        j += 1;
        break label187;
        label479:
        bool = false;
        break;
        label485:
        j = 0;
        paramnk = str;
      }
    }
  }
  
  public final boolean b(nk paramnk, final com.tencent.mm.sdk.platformtools.ae paramae)
  {
    GMTrace.i(8114669617152L, 60459);
    for (;;)
    {
      ber localber;
      long l1;
      long l2;
      final beq localbeq;
      String str;
      final boolean bool;
      try
      {
        localber = (ber)new ber().aD(paramnk.uej.uNP.toByteArray());
        l1 = localber.tXT;
        l2 = localber.uQs;
        localbeq = localber.uQt;
        str = localber.tPP;
        paramnk = str;
        if (str == null) {
          paramnk = "";
        }
        w.i("MicroMsg.NetSceneNewSyncAlbum", "process action " + localbeq.jib + " " + l1 + " " + paramnk);
        switch (localbeq.jib)
        {
        case 9: 
          a(localber, localbeq, l1, l2, paramnk);
          if ((localbeq.uQr & 0x2) != 0) {
            break label608;
          }
          bool = true;
          ae.aDa().post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8123393769472L, 60524);
              if (bool)
              {
                Iterator localIterator = t.psE.iterator();
                while (localIterator.hasNext())
                {
                  ao localao = (ao)localIterator.next();
                  w.i("MicroMsg.NetSceneNewSyncAlbum", "notify list ");
                  localao.AE();
                }
              }
              paramae.sendEmptyMessage(0);
              GMTrace.o(8123393769472L, 60524);
            }
          });
          GMTrace.o(8114669617152L, 60459);
          return true;
        }
      }
      catch (Exception paramnk)
      {
        w.printErrStackTrace("MicroMsg.NetSceneNewSyncAlbum", paramnk, "", new Object[0]);
        GMTrace.o(8114669617152L, 60459);
        return false;
      }
      paramnk = ae.bji().d(l1, localbeq.uQm, localbeq.jib);
      if (paramnk != null)
      {
        paramnk.blH();
        bool = ae.bji().a(paramnk.vmr, paramnk);
        ai.b(l1, localber);
        w.i("MicroMsg.NetSceneNewSyncAlbum", " setdel flag  " + bool);
        continue;
        paramnk = ae.bji().d(l1, localbeq.uQp, localbeq.jib);
        if (paramnk != null)
        {
          paramnk.blH();
          bool = ae.bji().a(paramnk.vmr, paramnk);
          ai.b(l1, localber);
          w.i("MicroMsg.NetSceneNewSyncAlbum", " setdel ad flag  " + bool);
          continue;
          paramnk = ae.bji();
          str = " update SnsComment set commentflag = commentflag | 2 where snsID = " + l1;
          w.i("MicroMsg.SnsCommentStorage", "set sns del " + str);
          bool = paramnk.goN.eZ("SnsComment", str);
          w.i("MicroMsg.NetSceneNewSyncAlbum", "processSnsDelAction " + bool);
          continue;
          paramnk = ae.bji();
          str = localbeq.uKB;
          str = " update SnsComment set commentflag = commentflag | 2 where snsID = " + l1 + " and talker = " + bg.nk(str);
          w.i("MicroMsg.SnsCommentStorage", "set sns del  by username " + str);
          bool = paramnk.goN.eZ("SnsComment", str);
          w.i("MicroMsg.NetSceneNewSyncAlbum", "processSnsDelAction " + bool);
          continue;
          b(localber, localbeq, l1, l2, paramnk);
          continue;
          c(localber, localbeq, l1, l2, paramnk);
          continue;
          label608:
          bool = false;
        }
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8114266963968L, 60456);
    GMTrace.o(8114266963968L, 60456);
    return 214;
  }
  
  protected final int vB()
  {
    GMTrace.i(8113193222144L, 60448);
    GMTrace.o(8113193222144L, 60448);
    return 10;
  }
  
  final class a
  {
    LinkedList<nk> lcw;
    com.tencent.mm.sdk.platformtools.ae lcx;
    
    a()
    {
      GMTrace.i(8049842454528L, 59976);
      this.lcx = new com.tencent.mm.sdk.platformtools.ae()
      {
        public final void handleMessage(final Message paramAnonymousMessage)
        {
          GMTrace.i(8088765595648L, 60266);
          if ((t.a.this.lcw == null) || (t.a.this.lcw.isEmpty()))
          {
            paramAnonymousMessage = t.this;
            bga localbga = (bga)paramAnonymousMessage.fUa.gtD.gtK;
            bfz localbfz = (bfz)paramAnonymousMessage.fUa.gtC.gtK;
            byte[] arrayOfByte = localbga.tZA.uNP.toByteArray();
            arrayOfByte = ad.g(localbfz.tZA.uNP.toByteArray(), arrayOfByte);
            if ((arrayOfByte != null) && (arrayOfByte.length > 0))
            {
              h.xz();
              h.xy().xh().set(8195, bg.bs(arrayOfByte));
            }
            localbfz.tZA.be(arrayOfByte);
            if ((localbga.tXv & localbfz.tZz) == 0)
            {
              paramAnonymousMessage.fUd.a(0, 0, "", paramAnonymousMessage);
              GMTrace.o(8088765595648L, 60266);
              return;
            }
            paramAnonymousMessage.a(paramAnonymousMessage.gtW, paramAnonymousMessage.fUd);
            GMTrace.o(8088765595648L, 60266);
            return;
          }
          paramAnonymousMessage = (nk)t.a.this.lcw.getFirst();
          w.d("MicroMsg.NetSceneNewSyncAlbum", "cmdId = " + paramAnonymousMessage.uei);
          t.a.this.lcw.removeFirst();
          switch (paramAnonymousMessage.uei)
          {
          }
          for (;;)
          {
            GMTrace.o(8088765595648L, 60266);
            return;
            ae.biN().post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8090107772928L, 60276);
                if (!t.this.a(paramAnonymousMessage, t.a.this.lcx)) {
                  t.a.this.lcx.sendEmptyMessage(0);
                }
                GMTrace.o(8090107772928L, 60276);
              }
            });
            GMTrace.o(8088765595648L, 60266);
            return;
            ae.biN().post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8107421859840L, 60405);
                if (!t.this.b(paramAnonymousMessage, t.a.this.lcx)) {
                  t.a.this.lcx.sendEmptyMessage(0);
                }
                GMTrace.o(8107421859840L, 60405);
              }
            });
          }
        }
      };
      GMTrace.o(8049842454528L, 59976);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */