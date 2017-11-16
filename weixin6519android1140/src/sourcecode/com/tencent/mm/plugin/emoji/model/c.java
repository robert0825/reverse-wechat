package com.tencent.mm.plugin.emoji.model;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.g.a.qs;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.j;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.f.o;
import com.tencent.mm.plugin.emoji.f.r;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.al;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.m;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.am;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public final class c
  implements com.tencent.mm.ad.e
{
  private com.tencent.mm.ao.a.c.c kkb;
  public HashMap<Long, String> kke;
  private boolean kkf;
  List<b> kkg;
  private qs kkh;
  public a kki;
  public List kkj;
  
  public c()
  {
    GMTrace.i(11317373042688L, 84321);
    this.kke = new HashMap();
    this.kkf = false;
    this.kkg = new LinkedList();
    this.kkj = Collections.synchronizedList(new ArrayList());
    this.kkb = new com.tencent.mm.ao.a.c.c()
    {
      public final void a(boolean paramAnonymousBoolean, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(11309319979008L, 84261);
        if ((paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length < 4))
        {
          w.w("MicroMsg.emoji.EmojiService", "extra obj error");
          GMTrace.o(11309319979008L, 84261);
          return;
        }
        int i = ((Integer)paramAnonymousVarArgs[2]).intValue();
        if ((paramAnonymousVarArgs[0] instanceof al)) {}
        for (al localal = (al)paramAnonymousVarArgs[0];; localal = null)
        {
          if ((paramAnonymousVarArgs[1] instanceof EmojiInfo)) {}
          for (Object localObject1 = (EmojiInfo)paramAnonymousVarArgs[1];; localObject1 = null)
          {
            if ((paramAnonymousVarArgs[3] instanceof Long)) {
              ((Long)paramAnonymousVarArgs[3]).longValue();
            }
            if ((localal == null) || (localObject1 == null))
            {
              w.w("MicroMsg.emoji.EmojiService", "msginfo or  emojiInfo");
              GMTrace.o(11309319979008L, 84261);
              return;
            }
            c.this.kkj.remove(localal.eDW);
            if (((EmojiInfo)localObject1).field_state == EmojiInfo.vCE)
            {
              w.d("MicroMsg.emoji.EmojiService", "first receive emoji,then update.");
              ((EmojiInfo)localObject1).field_state = EmojiInfo.vCC;
              ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().d((EmojiInfo)localObject1);
            }
            if (paramAnonymousBoolean)
            {
              String str2 = ((EmojiInfo)localObject1).bUU();
              if ((i == 102) || (i == 101))
              {
                long l;
                if (i == 101)
                {
                  paramAnonymousVarArgs = str2 + "_extern";
                  if (com.tencent.mm.a.e.aY(paramAnonymousVarArgs) > 0) {
                    l = System.currentTimeMillis();
                  }
                }
                else
                {
                  for (;;)
                  {
                    try
                    {
                      paramAnonymousBoolean = com.tencent.mm.a.a.f(Base64.encodeToString(bg.St(localal.aeskey), 0), paramAnonymousVarArgs, str2);
                      if (!paramAnonymousBoolean) {
                        continue;
                      }
                      if (i == 101) {}
                      try
                      {
                        com.tencent.mm.plugin.emoji.c.bu(11L);
                        w.i("MicroMsg.emoji.EmojiService", "encrypt file use time:%d %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), str2 });
                        if (paramAnonymousBoolean) {
                          continue;
                        }
                        if (localObject1 != null) {
                          continue;
                        }
                        String str1 = "";
                        int j = com.tencent.mm.a.e.aY(paramAnonymousVarArgs);
                        if (com.tencent.mm.a.g.bg(paramAnonymousVarArgs) != null) {
                          continue;
                        }
                        str2 = "";
                        if (localObject1 != null) {
                          continue;
                        }
                        str3 = "";
                        if (localObject1 != null) {
                          continue;
                        }
                        localObject1 = "";
                        if (localal != null) {
                          continue;
                        }
                        str4 = "";
                        w.i("MicroMsg.emoji.EmojiService", "handleCNDDownloadResult file aes failed. try to download by cgi.emojiMd5:%s buf size:%d buf md5:%s key:%s eUrl:%s srcContent:%s", new Object[] { str1, Integer.valueOf(j), str2, str3, localObject1, str4 });
                        if (i != 101) {
                          continue;
                        }
                        com.tencent.mm.plugin.emoji.c.a(localal.eDW, 4, 0, 1, localal.eEa, 1, localal.vAU);
                        b.deleteFile(paramAnonymousVarArgs);
                        c.arb();
                        GMTrace.o(11309319979008L, 84261);
                        return;
                      }
                      catch (Exception localException1) {}
                      paramAnonymousVarArgs = str2 + "_encrypt";
                      break;
                      com.tencent.mm.plugin.emoji.c.bu(7L);
                      continue;
                    }
                    catch (Exception localException2)
                    {
                      String str3;
                      String str4;
                      Object localObject2;
                      paramAnonymousBoolean = false;
                      continue;
                    }
                    w.e("MicroMsg.emoji.EmojiService", "encrypt file failed. exception:%s", new Object[] { bg.f(localException1) });
                    if (i == 101)
                    {
                      com.tencent.mm.plugin.emoji.c.bu(12L);
                      continue;
                      if (i == 101) {
                        com.tencent.mm.plugin.emoji.c.bu(12L);
                      } else {
                        com.tencent.mm.plugin.emoji.c.bu(8L);
                      }
                    }
                    else
                    {
                      com.tencent.mm.plugin.emoji.c.bu(8L);
                      continue;
                      localObject2 = ((EmojiInfo)localObject1).GS();
                      continue;
                      str2 = com.tencent.mm.a.g.bg(paramAnonymousVarArgs);
                      continue;
                      str3 = ((EmojiInfo)localObject1).field_aeskey;
                      continue;
                      localObject1 = ((EmojiInfo)localObject1).field_encrypturl;
                      continue;
                      str4 = localal.vAT;
                      continue;
                      com.tencent.mm.plugin.emoji.c.a(localal.eDW, 3, 0, 1, localal.eEa, 1, localal.vAU);
                    }
                  }
                  b.deleteFile(paramAnonymousVarArgs);
                }
              }
              else
              {
                localObject2 = new File(str2);
                if (com.tencent.mm.a.e.aY(str2) <= 0) {
                  break label1128;
                }
                str2 = com.tencent.mm.a.g.h((File)localObject2);
                paramAnonymousVarArgs = ((EmojiInfo)localObject1).GS();
                if (i == 101) {
                  paramAnonymousVarArgs = ((EmojiInfo)localObject1).field_externMd5;
                }
                if ((bg.nm(str2)) || (!str2.equalsIgnoreCase(paramAnonymousVarArgs))) {
                  break label934;
                }
                if (i != 101) {
                  break label866;
                }
                com.tencent.mm.plugin.emoji.c.bu(13L);
                com.tencent.mm.plugin.emoji.c.a(localal.eDW, 4, 0, 0, localal.eEa, 0, localal.vAU);
              }
              for (;;)
              {
                com.tencent.mm.plugin.emoji.e.e.aqw().c((EmojiInfo)localObject1, true);
                if (c.this.kki != null) {
                  c.this.kki.h((EmojiInfo)localObject1);
                }
                c.arb();
                GMTrace.o(11309319979008L, 84261);
                return;
                w.i("MicroMsg.emoji.EmojiService", "handleCNDDownloadResult file aes download failed., try to download by cgi.emojiMd5:%s", new Object[] { ((EmojiInfo)localObject1).GS() });
                if (i == 101) {
                  com.tencent.mm.plugin.emoji.c.a(localal.eDW, 4, 1, 1, localal.eEa, 1, localal.vAU);
                }
                for (;;)
                {
                  c.arb();
                  GMTrace.o(11309319979008L, 84261);
                  return;
                  com.tencent.mm.plugin.emoji.c.a(localal.eDW, 3, 1, 1, localal.eEa, 1, localal.vAU);
                }
                label866:
                if (i == 102)
                {
                  com.tencent.mm.plugin.emoji.c.bu(4L);
                  com.tencent.mm.plugin.emoji.c.a(localal.eDW, 3, 0, 0, localal.eEa, 0, localal.vAU);
                }
                else
                {
                  com.tencent.mm.plugin.emoji.c.bu(4L);
                  com.tencent.mm.plugin.emoji.c.a(localal.eDW, 2, 0, 0, localal.eEa, 1, localal.vAU);
                }
              }
              label934:
              if (localObject1 == null)
              {
                paramAnonymousVarArgs = "";
                if (localObject1 != null) {
                  break label1038;
                }
              }
              label1038:
              for (localObject1 = "";; localObject1 = ((EmojiInfo)localObject1).field_cdnUrl)
              {
                w.i("MicroMsg.emoji.EmojiService", "handleCNDDownloadResult md5 check failed, try to download by cgi. buf md5:%s emojiMd5:%s field_cdnUrl:%s", new Object[] { str2, paramAnonymousVarArgs, localObject1 });
                ((File)localObject2).delete();
                c.arb();
                if (i != 101) {
                  break label1048;
                }
                com.tencent.mm.plugin.emoji.c.bu(14L);
                com.tencent.mm.plugin.emoji.c.a(localal.eDW, 4, 0, 1, localal.eEa, 0, localal.vAU);
                GMTrace.o(11309319979008L, 84261);
                return;
                paramAnonymousVarArgs = ((EmojiInfo)localObject1).GS();
                break;
              }
              label1048:
              if (i == 102)
              {
                com.tencent.mm.plugin.emoji.c.bu(5L);
                com.tencent.mm.plugin.emoji.c.a(localal.eDW, 3, 0, 1, localal.eEa, 1, localal.vAU);
                GMTrace.o(11309319979008L, 84261);
                return;
              }
              com.tencent.mm.plugin.emoji.c.bu(5L);
              com.tencent.mm.plugin.emoji.c.a(localal.eDW, 2, 0, 1, localal.eEa, 1, localal.vAU);
              GMTrace.o(11309319979008L, 84261);
              return;
              label1128:
              if (localObject1 == null)
              {
                paramAnonymousVarArgs = "";
                if (localObject1 != null) {
                  break label1221;
                }
                localObject1 = "";
                label1145:
                w.i("MicroMsg.emoji.EmojiService", "handleCNDDownloadResult file no exist., try to donwload by cgi.emojiMd5:%s field_cdnUrl:%s", new Object[] { paramAnonymousVarArgs, localObject1 });
                if (i != 101) {
                  break label1231;
                }
                com.tencent.mm.plugin.emoji.c.a(localal.eDW, 4, 1, 1, localal.eEa, 1, localal.vAU);
                com.tencent.mm.plugin.emoji.c.bu(3L);
              }
              for (;;)
              {
                c.arb();
                GMTrace.o(11309319979008L, 84261);
                return;
                paramAnonymousVarArgs = ((EmojiInfo)localObject1).GS();
                break;
                label1221:
                localObject1 = ((EmojiInfo)localObject1).field_cdnUrl;
                break label1145;
                label1231:
                com.tencent.mm.plugin.emoji.c.a(localal.eDW, 2, 1, 1, localal.eEa, 1, localal.vAU);
                com.tencent.mm.plugin.emoji.c.bu(3L);
              }
            }
            w.i("MicroMsg.emoji.EmojiService", "handleCNDDownloadResult file no exist., try to donwload by cgi.emojiMd5:%s", new Object[] { ((EmojiInfo)localObject1).GS() });
            if (i == 101)
            {
              com.tencent.mm.plugin.emoji.c.a(localal.eDW, 4, 1, 1, localal.eEa, 1, localal.vAU);
              com.tencent.mm.plugin.emoji.c.bu(3L);
            }
            for (;;)
            {
              c.arb();
              GMTrace.o(11309319979008L, 84261);
              return;
              com.tencent.mm.plugin.emoji.c.a(localal.eDW, 2, 1, 1, localal.eEa, 1, localal.vAU);
              com.tencent.mm.plugin.emoji.c.bu(3L);
            }
          }
        }
      }
    };
    at.wS().a(175, this);
    GMTrace.o(11317373042688L, 84321);
  }
  
  public static void arb()
  {
    GMTrace.i(11318178349056L, 84327);
    at.AR();
    com.tencent.mm.y.c.yM().doNotify();
    GMTrace.o(11318178349056L, 84327);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(11318044131328L, 84326);
    w.d("MicroMsg.emoji.EmojiService", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramk instanceof r))
    {
      if (this.kkg.size() <= 0)
      {
        this.kkf = false;
        GMTrace.o(11318044131328L, 84326);
        return;
      }
      paramString = (b)this.kkg.remove(0);
      int i = 2;
      if (paramInt1 == 0)
      {
        paramInt1 = i;
        if (paramInt2 == 0) {}
      }
      else
      {
        com.tencent.mm.plugin.report.d.oqe.a(111L, 35L, 1L, true);
        paramInt1 = 5;
      }
      at.AR();
      paramk = com.tencent.mm.y.c.yM().cM(paramString.eDr);
      paramk.dB(paramInt1);
      at.AR();
      com.tencent.mm.y.c.yM().a(paramString.eDr, paramk);
      if (this.kkg.size() <= 0) {
        break label269;
      }
      paramString = (b)this.kkg.get(0);
      at.wS().a(new r(paramString.eHy, paramString.toUserName, paramString.eCa, paramString.eDr), 0);
    }
    for (;;)
    {
      if (this.kkh == null) {
        this.kkh = new qs();
      }
      this.kkh.eVD.eEa = paramString.eCa.field_groupId;
      com.tencent.mm.sdk.b.a.vgX.m(this.kkh);
      GMTrace.o(11318044131328L, 84326);
      return;
      label269:
      this.kkf = false;
    }
  }
  
  public final void a(al paramal, d.a parama, boolean paramBoolean)
  {
    GMTrace.i(11317909913600L, 84325);
    if (paramal == null)
    {
      w.w("MicroMsg.emoji.EmojiService", "downloadEmoji msginfo is null.");
      GMTrace.o(11317909913600L, 84325);
      return;
    }
    if ((parama != null) && (parama.gtM != null) && (parama.gtM.tQd == paramal.eSf))
    {
      paramal.fwu = bc.c(parama);
      paramal.gLK = parama.gtM.tQe;
      paramal.hcs = parama.gtM.nFd;
    }
    EmojiInfo localEmojiInfo = h.arl().kjy.UK(paramal.eDW);
    int i;
    if (localEmojiInfo != null)
    {
      int j = 0;
      i = j;
      if (!bg.nm(paramal.eEa))
      {
        i = j;
        if (!paramal.eEa.equals(localEmojiInfo.field_groupId))
        {
          localEmojiInfo.field_groupId = paramal.eEa;
          i = 1;
        }
      }
      j = i;
      if (!bg.nm(paramal.vAU))
      {
        j = i;
        if (!paramal.vAU.equals(localEmojiInfo.field_designerID))
        {
          localEmojiInfo.field_designerID = paramal.vAU;
          j = 1;
        }
      }
      i = j;
      if (!bg.nm(paramal.thumbUrl))
      {
        i = j;
        if (!paramal.thumbUrl.equals(localEmojiInfo.field_thumbUrl))
        {
          localEmojiInfo.field_thumbUrl = paramal.thumbUrl;
          i = 1;
        }
      }
      j = i;
      if (!bg.nm(paramal.eHW))
      {
        j = i;
        if (!paramal.eHW.equals(localEmojiInfo.field_encrypturl))
        {
          localEmojiInfo.field_encrypturl = paramal.eHW;
          j = 1;
        }
      }
      i = j;
      if (!bg.nm(paramal.aeskey))
      {
        i = j;
        if (!paramal.aeskey.equals(localEmojiInfo.field_aeskey))
        {
          localEmojiInfo.field_aeskey = paramal.aeskey;
          i = 1;
        }
      }
      j = i;
      if (!bg.nm(paramal.mhI))
      {
        j = i;
        if (!paramal.mhI.equals(localEmojiInfo.field_cdnUrl))
        {
          localEmojiInfo.field_cdnUrl = paramal.mhI;
          j = 1;
        }
      }
      i = j;
      if (paramal.width > 0)
      {
        i = j;
        if (paramal.width != localEmojiInfo.field_width)
        {
          localEmojiInfo.field_width = paramal.width;
          i = 1;
        }
      }
      j = i;
      if (paramal.height > 0)
      {
        j = i;
        if (paramal.height != localEmojiInfo.field_height)
        {
          localEmojiInfo.field_height = paramal.height;
          j = 1;
        }
      }
      i = j;
      if (!bg.nm(paramal.vAV))
      {
        i = j;
        if (!paramal.vAV.equals(localEmojiInfo.field_externUrl))
        {
          localEmojiInfo.field_externUrl = paramal.vAV;
          i = 1;
        }
      }
      j = i;
      if (!bg.nm(paramal.vAW))
      {
        j = i;
        if (!paramal.vAW.equals(localEmojiInfo.field_externMd5))
        {
          localEmojiInfo.field_externMd5 = paramal.vAW;
          j = 1;
        }
      }
      i = j;
      if (!bg.nm(paramal.vAY))
      {
        i = j;
        if (!paramal.vAY.equalsIgnoreCase(localEmojiInfo.field_activityid))
        {
          localEmojiInfo.field_activityid = paramal.vAY;
          i = 1;
        }
      }
      if (i != 0)
      {
        h.arl().kjy.p(localEmojiInfo);
        w.i("MicroMsg.emoji.EmojiService", "update designer info. designer:%s thumbUrl:%s", new Object[] { localEmojiInfo.field_designerID, localEmojiInfo.field_thumbUrl });
      }
    }
    long l;
    for (;;)
    {
      l = 0L;
      if (paramal.vAX)
      {
        localEmojiInfo.bUN();
        if (paramal.eSf == 0L) {
          break;
        }
        at.AR();
        localObject = com.tencent.mm.y.c.yM().B(paramal.eDs, paramal.eSf);
        if (((ce)localObject).field_msgSvrId != paramal.eSf) {
          break;
        }
        l = ((ce)localObject).field_msgId;
      }
      if (localEmojiInfo.bUN()) {
        break label1881;
      }
      if (!paramBoolean) {
        break label1845;
      }
      if ((this.kkj == null) || (!this.kkj.contains(paramal.eDW))) {
        break label1458;
      }
      w.i("MicroMsg.emoji.EmojiService", "emoji md5:%s is downloading.", new Object[] { paramal.eDW });
      GMTrace.o(11317909913600L, 84325);
      return;
      w.d("MicroMsg.emoji.EmojiService", "jacks prepare Emoji check groupId&md5 handle remote server old emoji version");
      localEmojiInfo = new EmojiInfo();
      localEmojiInfo.field_md5 = paramal.eDW;
      localEmojiInfo.field_svrid = paramal.id;
      localEmojiInfo.field_catalog = EmojiInfo.vCo;
      localEmojiInfo.field_type = paramal.vAP;
      localEmojiInfo.field_size = paramal.vAQ;
      localEmojiInfo.field_groupId = paramal.eEa;
      localEmojiInfo.field_designerID = paramal.vAU;
      localEmojiInfo.field_thumbUrl = paramal.thumbUrl;
      localEmojiInfo.field_cdnUrl = paramal.mhI;
      localEmojiInfo.field_temp = 1;
      localEmojiInfo.field_encrypturl = paramal.eHW;
      localEmojiInfo.field_aeskey = paramal.aeskey;
      localEmojiInfo.field_designerID = paramal.vAU;
      localEmojiInfo.field_thumbUrl = paramal.thumbUrl;
      localEmojiInfo.field_state = EmojiInfo.vCE;
      localEmojiInfo.field_width = paramal.width;
      localEmojiInfo.field_height = paramal.height;
      localEmojiInfo.field_externUrl = paramal.vAV;
      localEmojiInfo.field_externMd5 = paramal.vAW;
      localEmojiInfo.field_activityid = paramal.vAY;
      h.arl().kjy.n(localEmojiInfo);
    }
    at.AR();
    Object localObject = com.tencent.mm.y.c.yK().TE(paramal.eDs);
    if ((localObject == null) || ((int)((com.tencent.mm.l.a)localObject).fTq == 0))
    {
      localObject = new x(paramal.eDs);
      ((x)localObject).setType(2);
      at.AR();
      com.tencent.mm.y.c.yK().R((x)localObject);
    }
    localObject = new au();
    ((au)localObject).setType(47);
    ((au)localObject).db(paramal.eDs);
    label1077:
    boolean bool;
    if (q.fp(paramal.hcn))
    {
      i = 1;
      ((au)localObject).dC(i);
      ((au)localObject).dc(localEmojiInfo.GS());
      ((au)localObject).D(paramal.eSf);
      String str = paramal.hcn;
      if ((localEmojiInfo.bJs()) || (localEmojiInfo.isGif())) {
        break label1443;
      }
      bool = true;
      label1128:
      ((au)localObject).setContent(aj.a(str, 0L, bool, localEmojiInfo.GS(), false, paramal.vAT));
      ((au)localObject).E(bc.k(((ce)localObject).field_talker, paramal.hcs));
      ((au)localObject).dB(3);
      if (!bg.nm(paramal.fwv)) {
        ((au)localObject).dh(paramal.fwv);
      }
      if (parama != null) {
        break label1449;
      }
      i = paramal.fwu;
      if (i != 0)
      {
        ((au)localObject).dL(i);
        if ((((ce)localObject).field_msgId == 0L) && (((ce)localObject).field_isSend == 0) && ((i & 0x2) != 0)) {
          ((au)localObject).E(bc.a(((ce)localObject).field_talker, paramal.hcs, true, ((ce)localObject).field_msgSeq));
        }
      }
      if (paramal.gLK != 0) {
        ((au)localObject).G(paramal.gLK);
      }
      w.i("MicroMsg.emoji.EmojiService", "summerbadcr insertEmojiMsg addMsgInfo is null but flag[%d], msgSeq[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramal.gLK) });
    }
    for (;;)
    {
      if ((this.kke != null) && (this.kke.containsKey(Long.valueOf(((ce)localObject).field_msgSvrId))))
      {
        w.i("MicroMsg.emoji.EmojiService", "this msg had been revoke.");
        ((au)localObject).setContent((String)this.kke.get(Long.valueOf(((ce)localObject).field_msgSvrId)));
        ((au)localObject).setType(10000);
        this.kke.remove(Long.valueOf(((ce)localObject).field_msgSvrId));
      }
      l = bc.i((au)localObject);
      if (!q.fp(paramal.hcn))
      {
        at.AR();
        parama = com.tencent.mm.y.c.yM().cM(l);
        ((am)at.getNotification()).a(parama);
      }
      break;
      i = 0;
      break label1077;
      label1443:
      bool = false;
      break label1128;
      label1449:
      bc.a((au)localObject, parama);
    }
    label1458:
    this.kkj.add(paramal.eDW);
    parama = localEmojiInfo.bUU();
    if ((com.tencent.mm.plugin.emoji.e.n.aqW()) && (com.tencent.mm.plugin.emoji.e.n.aqX()) && (!bg.nm(localEmojiInfo.field_externUrl)) && (!bg.nm(localEmojiInfo.field_externMd5)))
    {
      h.aqJ().a(paramal.vAV, f.h(parama + "_extern", new Object[] { paramal, localEmojiInfo, Integer.valueOf(101), Long.valueOf(l) }), this.kkb);
      com.tencent.mm.plugin.emoji.c.bu(10L);
      GMTrace.o(11317909913600L, 84325);
      return;
    }
    if ((!bg.nm(paramal.eHW)) && (!bg.nm(paramal.aeskey)))
    {
      h.aqJ().a(paramal.eHW, f.h(parama + "_encrypt", new Object[] { paramal, localEmojiInfo, Integer.valueOf(102), Long.valueOf(l) }), this.kkb);
      com.tencent.mm.plugin.emoji.c.bu(6L);
      GMTrace.o(11317909913600L, 84325);
      return;
    }
    if (!bg.nm(paramal.mhI))
    {
      h.aqJ().a(paramal.mhI, f.g(parama, new Object[] { paramal, localEmojiInfo, Integer.valueOf(100), Long.valueOf(l) }), this.kkb);
      com.tencent.mm.plugin.emoji.c.bu(1L);
      GMTrace.o(11317909913600L, 84325);
      return;
    }
    this.kkj.remove(paramal.eDW);
    parama = new LinkedList();
    parama.add(paramal.eDW);
    at.wS().a(new com.tencent.mm.plugin.emoji.f.e(parama), 0);
    w.i("MicroMsg.emoji.EmojiService", "emoji encrypt url and cdn url is null. md5:%s try to batch emoji download for get url.", new Object[] { paramal.eDW });
    com.tencent.mm.plugin.emoji.c.bu(9L);
    GMTrace.o(11317909913600L, 84325);
    return;
    label1845:
    w.i("MicroMsg.emoji.EmojiService", "cdnurl and cncrypt url is null. autodownload %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.kkj.remove(paramal.eDW);
    arb();
    label1881:
    GMTrace.o(11317909913600L, 84325);
  }
  
  public final void a(String paramString, EmojiInfo paramEmojiInfo, au paramau)
  {
    GMTrace.i(11317507260416L, 84322);
    if ((bg.nm(paramString)) || (paramEmojiInfo == null))
    {
      GMTrace.o(11317507260416L, 84322);
      return;
    }
    long l1 = System.currentTimeMillis();
    boolean bool1 = false;
    j localj;
    label103:
    label142:
    Object localObject1;
    boolean bool2;
    label174:
    long l2;
    label230:
    m localm;
    label498:
    int i;
    label827:
    int j;
    label883:
    String str1;
    if ((paramEmojiInfo != null) && (!bg.nm(paramEmojiInfo.field_groupId)))
    {
      localj = h.arm();
      localObject2 = paramEmojiInfo.field_groupId;
      if (bg.nm((String)localObject2)) {
        w.i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip product id is null.");
      }
      for (bool1 = false;; bool1 = false)
      {
        w.i("MicroMsg.emoji.EmojiService", "isNeedShowRewardTip:%b", new Object[] { Boolean.valueOf(bool1) });
        if (paramau != null) {
          break label1273;
        }
        paramau = new au();
        if ((paramEmojiInfo.field_type != EmojiInfo.vCy) && (paramEmojiInfo.field_type != EmojiInfo.vCz)) {
          break label1258;
        }
        paramau.setType(1048625);
        paramau.db(paramString);
        paramau.dC(1);
        localObject1 = q.zE();
        if ((paramEmojiInfo.bJs()) || (paramEmojiInfo.isGif())) {
          break label1267;
        }
        bool2 = true;
        paramau.setContent(aj.a((String)localObject1, l1, bool2, paramEmojiInfo.GS(), bool1, ""));
        paramau.dc(paramEmojiInfo.GS());
        paramau.E(bc.gR(paramau.field_talker));
        at.AR();
        l2 = com.tencent.mm.y.c.yM().P(paramau);
        w.i("MicroMsg.emoji.EmojiService", "NetSceneUploadEmoji: msgId = " + l2);
        this.kkg.add(new b(l2, paramString, paramEmojiInfo, String.valueOf(l1)));
        if ((!this.kkf) || (this.kkg.size() == 1))
        {
          this.kkf = true;
          at.wS().a(new r(String.valueOf(l1), paramString, paramEmojiInfo, l2), 0);
        }
        paramString = paramEmojiInfo.field_md5;
        wk(paramEmojiInfo.field_groupId);
        GMTrace.o(11317507260416L, 84322);
        return;
        if ((localj.kjc) || (q.zN())) {
          break;
        }
        w.i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip reward tip is disable. mRewardTipEnable:%b isOpenForWallet:%b", new Object[] { Boolean.valueOf(localj.kjc), Boolean.valueOf(q.zN()) });
      }
      if ((localj.kjg != null) && (localj.kjg.containsKey(localObject2))) {
        localm = (m)localj.kjg.get(localObject2);
      }
      for (;;)
      {
        if (System.currentTimeMillis() - localm.field_showTipsTime >= localj.kjd) {
          break label498;
        }
        w.i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip in cool down time.");
        localj.aqO();
        bool1 = false;
        break;
        localm = new m();
        localm.field_prodcutID = ((String)localObject2);
      }
      if ((localm != null) && (System.currentTimeMillis() - localm.field_setFlagTime > 86400000L)) {
        if ((localj.kjf != null) && (((String)localObject2).equalsIgnoreCase(localj.kjf.field_prodcutID)) && (localj.kjf.field_continuCount >= localj.kje - 1) && (localj.kjf.field_continuCount <= localj.kje + 5 - 1)) {
          at.wS().a(new o((String)localObject2, o.klR), 0);
        }
      }
      for (;;)
      {
        if ((localj.kjf != null) && (((String)localObject2).equalsIgnoreCase(localj.kjf.field_prodcutID)) && (localj.kjf.field_continuCount >= localj.kje))
        {
          if (((localj.kjf.field_flag & o.klS) == o.klS) && ((localj.kjf.field_flag & o.klT) != o.klT))
          {
            w.i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip:%b productid:%s  continue count:%d", new Object[] { Boolean.valueOf(true), localObject2, Integer.valueOf(localj.kjf.field_continuCount) });
            localj.a(localm, true);
            com.tencent.mm.plugin.report.service.g.ork.i(12953, new Object[] { Integer.valueOf(0), localj.kjf.field_prodcutID });
            bool1 = true;
            break;
            if ((localm.field_totalCount < localj.jtJ - 1) || (localm.field_totalCount > localj.jtJ + 5 - 1)) {
              continue;
            }
            at.wS().a(new o((String)localObject2, o.klR), 0);
            continue;
            if (localj.kjf == null)
            {
              i = 0;
              if (localj.kjf != null) {
                break label883;
              }
            }
            for (j = 0;; j = localj.kjf.field_totalCount)
            {
              w.d("MicroMsg.emoji.EmojiRewardTipMgr", "no need to get reward today. continue count:%d total count:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
              break;
              i = localj.kjf.field_continuCount;
              break label827;
            }
          }
          localObject1 = new Object[4];
          localObject1[0] = Boolean.valueOf(false);
          localObject1[1] = localObject2;
          localObject1[2] = Integer.valueOf(localj.kjf.field_continuCount);
          str1 = "isNeedShowTip:%b productid:%s  continue count:%d flag:%d";
        }
      }
    }
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      i = localj.kjf.field_flag;
      String str2 = "MicroMsg.emoji.EmojiRewardTipMgr";
      j = 3;
      localObject1[j] = Integer.valueOf(i);
      w.i(str2, str1, (Object[])localObject2);
      do
      {
        localj.a(localm, false);
        bool1 = false;
        break;
      } while ((localm == null) || (localm.field_totalCount < localj.jtJ));
      if (((localm.field_flag & o.klS) == o.klS) && ((localm.field_flag & o.klT) != o.klT))
      {
        if (localj.kjf == null)
        {
          i = 0;
          label1050:
          w.i("MicroMsg.emoji.EmojiRewardTipMgr", "isNeedShowTip:%b productid:%s  total count :%d", new Object[] { Boolean.valueOf(true), localObject2, Integer.valueOf(i) });
          localj.a(localm, true);
          localObject2 = com.tencent.mm.plugin.report.service.g.ork;
          if (localj.kjf != null) {
            break label1152;
          }
        }
        label1152:
        for (localObject1 = "";; localObject1 = localj.kjf.field_prodcutID)
        {
          ((com.tencent.mm.plugin.report.service.g)localObject2).i(12953, new Object[] { Integer.valueOf(0), localObject1 });
          bool1 = true;
          break;
          i = localj.kjf.field_totalCount;
          break label1050;
        }
      }
      localObject1 = new Object[4];
      localObject1[0] = Boolean.valueOf(false);
      localObject1[1] = localObject2;
      if (localj.kjf == null) {}
      for (i = 0;; i = localj.kjf.field_totalCount)
      {
        localObject1[2] = Integer.valueOf(i);
        if (localj.kjf != null) {
          break label1315;
        }
        str2 = "MicroMsg.emoji.EmojiRewardTipMgr";
        localObject2 = localObject1;
        j = 3;
        i = 0;
        str1 = "isNeedShowTip:%b productid:%s  total count :%d flag:%d";
        break;
      }
      h.arm().aqO();
      break label103;
      label1258:
      paramau.setType(47);
      break label142;
      label1267:
      bool2 = false;
      break label174;
      label1273:
      l2 = paramau.field_msgId;
      paramau = aj.Uf(paramau.field_content);
      if (paramau.time == 0L)
      {
        GMTrace.o(11317507260416L, 84322);
        return;
      }
      l1 = paramau.time;
      break label230;
      label1315:
      str1 = "isNeedShowTip:%b productid:%s  total count :%d flag:%d";
    }
  }
  
  public final boolean g(EmojiInfo paramEmojiInfo)
  {
    Object localObject = null;
    GMTrace.i(11317775695872L, 84324);
    al localal;
    if (paramEmojiInfo == null)
    {
      w.i("MicroMsg.emoji.EmojiMsgInfo", "parserEmojiInfo failed. emojiinfo is null.");
      localal = null;
    }
    while (localal == null)
    {
      w.i("MicroMsg.emoji.EmojiService", "prepareEmoji failed. emoji msg info is null.");
      GMTrace.o(11317775695872L, 84324);
      return true;
      localal = new al();
      localal.eDW = paramEmojiInfo.field_md5;
      localal.vAP = paramEmojiInfo.field_type;
      localal.vAQ = paramEmojiInfo.field_size;
      localal.eEa = paramEmojiInfo.field_groupId;
      localal.vAU = paramEmojiInfo.field_designerID;
      localal.thumbUrl = paramEmojiInfo.field_thumbUrl;
      localal.eHW = paramEmojiInfo.field_encrypturl;
      localal.aeskey = paramEmojiInfo.field_aeskey;
      localal.width = paramEmojiInfo.field_width;
      localal.height = paramEmojiInfo.field_height;
      localal.mhI = paramEmojiInfo.field_cdnUrl;
      localal.vAV = paramEmojiInfo.field_externUrl;
      localal.vAW = paramEmojiInfo.field_externMd5;
      localal.vAY = paramEmojiInfo.field_activityid;
    }
    localal.vAX = false;
    a(localal, null, true);
    if (paramEmojiInfo == null) {}
    for (paramEmojiInfo = (EmojiInfo)localObject;; paramEmojiInfo = paramEmojiInfo.field_groupId)
    {
      wk(paramEmojiInfo);
      GMTrace.o(11317775695872L, 84324);
      return true;
    }
  }
  
  public final void wk(final String paramString)
  {
    GMTrace.i(11317641478144L, 84323);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11307977801728L, 84251);
        Object localObject = h.arl().kjA;
        String str = paramString;
        long l1;
        long l2;
        int i;
        if ((!TextUtils.isEmpty(str)) && (!str.equals(EmojiGroupInfo.vCl)))
        {
          l1 = ((com.tencent.mm.storage.emotion.c)localObject).mSharedPreferences.getLong("274544" + str, 0L);
          l2 = System.currentTimeMillis();
          if (l2 - l1 >= 86400000L) {
            i = 1;
          }
        }
        while (i != 0)
        {
          h.arh();
          localObject = paramString;
          if (bg.nm((String)localObject))
          {
            w.w("MicroMsg.emoji.EmojiMgrImpl", "doSceneGetEmotionDesc get emotion desc faild.");
            GMTrace.o(11307977801728L, 84251);
            return;
            if ((!((com.tencent.mm.storage.emotion.c)localObject).UJ(str)) && (l2 - l1 >= 3600000L)) {
              i = 1;
            } else {
              i = 0;
            }
          }
          else
          {
            localObject = new com.tencent.mm.plugin.emoji.f.k((String)localObject);
            at.wS().a((com.tencent.mm.ad.k)localObject, 0);
          }
        }
        GMTrace.o(11307977801728L, 84251);
      }
    });
    GMTrace.o(11317641478144L, 84323);
  }
  
  public static abstract interface a
  {
    public abstract void h(EmojiInfo paramEmojiInfo);
  }
  
  private final class b
  {
    EmojiInfo eCa;
    long eDr;
    String eHy;
    String toUserName;
    
    public b(long paramLong, String paramString1, EmojiInfo paramEmojiInfo, String paramString2)
    {
      GMTrace.i(11306098753536L, 84237);
      this.eDr = paramLong;
      this.toUserName = paramString1;
      this.eCa = paramEmojiInfo;
      this.eHy = paramString2;
      GMTrace.o(11306098753536L, 84237);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */