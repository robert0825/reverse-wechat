package com.tencent.mm.plugin.emoji.model;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.r;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.protocal.c.ez;
import com.tencent.mm.protocal.c.fa;
import com.tencent.mm.protocal.c.qp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.LinkedList;

public final class b
  implements com.tencent.mm.ad.e
{
  private com.tencent.mm.ao.a.c.c kkb;
  
  public b()
  {
    GMTrace.i(11313883381760L, 84295);
    this.kkb = new com.tencent.mm.ao.a.c.c()
    {
      public final void a(boolean paramAnonymousBoolean, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(11309051543552L, 84259);
        if ((paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length < 2))
        {
          w.w("MicroMsg.emoji.EmojiAppMsgDownloadService", "extra obj error");
          GMTrace.o(11309051543552L, 84259);
          return;
        }
        boolean bool = ((Boolean)paramAnonymousVarArgs[1]).booleanValue();
        if ((paramAnonymousVarArgs[0] instanceof qp)) {}
        for (paramAnonymousVarArgs = (qp)paramAnonymousVarArgs[0];; paramAnonymousVarArgs = null)
        {
          if (paramAnonymousVarArgs == null)
          {
            w.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "msginfo or  emojiInfo");
            GMTrace.o(11309051543552L, 84259);
            return;
          }
          if (paramAnonymousBoolean)
          {
            at.AR();
            String str2 = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", paramAnonymousVarArgs.ugy);
            Object localObject2 = str2 + "_encrypt";
            if (bool)
            {
              if (com.tencent.mm.a.e.aY((String)localObject2) > 0)
              {
                long l = System.currentTimeMillis();
                for (;;)
                {
                  try
                  {
                    paramAnonymousBoolean = com.tencent.mm.a.a.f(Base64.encodeToString(bg.St(paramAnonymousVarArgs.ugB), 0), (String)localObject2, str2);
                    if (paramAnonymousBoolean) {}
                    try
                    {
                      com.tencent.mm.plugin.emoji.c.bu(7L);
                      w.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "encrypt file use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
                      if (paramAnonymousBoolean) {
                        continue;
                      }
                      str2 = paramAnonymousVarArgs.ugy;
                      i = com.tencent.mm.a.e.aY((String)localObject2);
                      if (g.bg((String)localObject2) != null) {
                        continue;
                      }
                      String str1 = "";
                      w.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "handleCNDDownloadResult file aes failed. try to download by cgi.emojiMd5:%s buf size:%d buf md5:%s key:%s eUrl:%s ", new Object[] { str2, Integer.valueOf(i), str1, paramAnonymousVarArgs.ugB, paramAnonymousVarArgs.ugA });
                      com.tencent.mm.plugin.emoji.c.a(paramAnonymousVarArgs.ugy, 3, 0, 1, "", 1, "");
                      com.tencent.mm.loader.stub.b.deleteFile((String)localObject2);
                      b.aQ(paramAnonymousVarArgs.ugy, 2);
                      GMTrace.o(11309051543552L, 84259);
                      return;
                    }
                    catch (Exception localException1) {}
                    com.tencent.mm.plugin.emoji.c.bu(8L);
                    continue;
                  }
                  catch (Exception localException2)
                  {
                    int i;
                    Object localObject1;
                    String str3;
                    paramAnonymousBoolean = false;
                    continue;
                  }
                  w.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "encrypt file failed. exception:%s", new Object[] { bg.f(localException1) });
                  com.tencent.mm.plugin.emoji.c.bu(8L);
                  continue;
                  localObject1 = g.bg((String)localObject2);
                }
                com.tencent.mm.loader.stub.b.deleteFile((String)localObject2);
              }
            }
            else
            {
              localObject1 = new File(str2);
              i = com.tencent.mm.a.e.aY(str2);
              localObject2 = com.tencent.mm.a.e.c(str2, 0, 10);
              if ((i <= 0) || (localObject2 == null)) {
                break label773;
              }
              str3 = g.h((File)localObject1);
              if ((bg.nm(str3)) || (!str3.equalsIgnoreCase(paramAnonymousVarArgs.ugy))) {
                break label663;
              }
              if (!bool) {
                break label632;
              }
              com.tencent.mm.plugin.emoji.c.bu(4L);
              com.tencent.mm.plugin.emoji.c.a(paramAnonymousVarArgs.ugy, 3, 0, 0, "", 0, "");
              i = EmojiInfo.vCz;
              if (!o.bi((byte[])localObject2)) {
                break label656;
              }
            }
            label632:
            label656:
            for (i = EmojiInfo.vCy;; i = EmojiInfo.vCz)
            {
              localObject2 = h.arl().kjy.UK(str3);
              localObject1 = localObject2;
              if (localObject2 == null)
              {
                localObject1 = new EmojiInfo();
                ((EmojiInfo)localObject1).field_md5 = str3;
                ((EmojiInfo)localObject1).field_catalog = EmojiInfo.vCo;
                ((EmojiInfo)localObject1).field_size = com.tencent.mm.a.e.aY(str2);
              }
              ((EmojiInfo)localObject1).field_type = i;
              ((EmojiInfo)localObject1).field_state = EmojiInfo.vCC;
              h.arl().kjy.p((EmojiInfo)localObject1);
              b.aQ(paramAnonymousVarArgs.ugy, 1);
              EmojiLogic.a(ab.getContext(), null, ((EmojiInfo)localObject1).GS(), ((EmojiInfo)localObject1).nSe, (EmojiInfo)localObject1);
              GMTrace.o(11309051543552L, 84259);
              return;
              w.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "handleCNDDownloadResult file aes download failed., try to download by cgi.emojiMd5:%s", new Object[] { paramAnonymousVarArgs.ugy });
              com.tencent.mm.plugin.emoji.c.a(paramAnonymousVarArgs.ugy, 3, 1, 1, "", 1, "");
              b.aQ(paramAnonymousVarArgs.ugy, 2);
              GMTrace.o(11309051543552L, 84259);
              return;
              com.tencent.mm.plugin.emoji.c.bu(4L);
              com.tencent.mm.plugin.emoji.c.a(paramAnonymousVarArgs.ugy, 2, 0, 0, "", 1, "");
              break;
            }
            label663:
            w.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "handleCNDDownloadResult md5 check failed, try to download by cgi. buf md5:%s emojiMd5:%s field_cdnUrl:%s", new Object[] { str3, paramAnonymousVarArgs.ugy, paramAnonymousVarArgs.lPM });
            ((File)localObject1).delete();
            b.aQ(paramAnonymousVarArgs.ugy, 2);
            if (bool)
            {
              com.tencent.mm.plugin.emoji.c.bu(5L);
              com.tencent.mm.plugin.emoji.c.a(paramAnonymousVarArgs.ugy, 3, 0, 1, "", 1, "");
              GMTrace.o(11309051543552L, 84259);
              return;
            }
            com.tencent.mm.plugin.emoji.c.bu(5L);
            com.tencent.mm.plugin.emoji.c.a(paramAnonymousVarArgs.ugy, 2, 0, 1, "", 1, "");
            GMTrace.o(11309051543552L, 84259);
            return;
            label773:
            b.this.a(paramAnonymousVarArgs, bool);
            GMTrace.o(11309051543552L, 84259);
            return;
          }
          b.this.a(paramAnonymousVarArgs, bool);
          GMTrace.o(11309051543552L, 84259);
          return;
        }
      }
    };
    GMTrace.o(11313883381760L, 84295);
  }
  
  public static void aQ(String paramString, int paramInt)
  {
    GMTrace.i(11314151817216L, 84297);
    r localr = new r();
    localr.eAD.eAE = paramString;
    localr.eAD.status = paramInt;
    localr.eAD.eAF = 0;
    com.tencent.mm.sdk.b.a.vgX.m(localr);
    w.d("MicroMsg.emoji.EmojiAppMsgDownloadService", "attachid:%s percentage:%d status:%d", new Object[] { paramString, Integer.valueOf(0), Integer.valueOf(paramInt) });
    GMTrace.o(11314151817216L, 84297);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11314017599488L, 84296);
    w.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paramk.getType())
    {
    default: 
      w.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "no download app attach scene");
      GMTrace.o(11314017599488L, 84296);
      return;
    case 221: 
      GMTrace.o(11314017599488L, 84296);
      return;
    }
    String str1 = "";
    Object localObject = (com.tencent.mm.plugin.emoji.f.e)paramk;
    if (((com.tencent.mm.plugin.emoji.f.e)localObject).klq == com.tencent.mm.plugin.emoji.f.e.klo)
    {
      if (((com.tencent.mm.plugin.emoji.f.e)localObject).fUa == null)
      {
        paramk = null;
        paramString = str1;
        if (paramk != null)
        {
          paramString = str1;
          if (paramk.tTK != null)
          {
            paramString = str1;
            if (paramk.tTK.size() > 0) {
              paramString = (String)paramk.tTK.get(0);
            }
          }
        }
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          break label505;
        }
        if (((com.tencent.mm.plugin.emoji.f.e)localObject).fUa != null) {
          break label255;
        }
      }
      label255:
      for (paramk = null;; paramk = (fa)((com.tencent.mm.plugin.emoji.f.e)localObject).fUa.gtD.gtK)
      {
        if ((paramk != null) && (paramk.tTM != null) && (paramk.tTM.size() > 0)) {
          break label274;
        }
        aQ(paramString, 2);
        w.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "NetSceneBatchEmojiDownLoad MD5 to URL failed.");
        GMTrace.o(11314017599488L, 84296);
        return;
        paramk = (ez)((com.tencent.mm.plugin.emoji.f.e)localObject).fUa.gtC.gtK;
        break;
      }
      label274:
      paramk = (qp)paramk.tTM.get(0);
      at.AR();
      str1 = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", paramk.ugy);
      String str2;
      if ((!bg.nm(paramk.ugA)) && (!bg.nm(paramk.ugB)))
      {
        paramString = h.aqJ();
        localObject = paramk.ugA;
        str2 = paramk.ugA;
        paramString.a((String)localObject, f.h(str1 + "_encrypt", new Object[] { paramk, Boolean.valueOf(true) }), this.kkb);
        com.tencent.mm.plugin.emoji.c.bu(6L);
        GMTrace.o(11314017599488L, 84296);
        return;
      }
      if (!bg.nm(paramk.lPM))
      {
        paramString = h.aqJ();
        localObject = paramk.lPM;
        str2 = paramk.lPM;
        paramString.a((String)localObject, f.g(str1, new Object[] { paramk, Boolean.valueOf(false) }), this.kkb);
        com.tencent.mm.plugin.emoji.c.bu(1L);
        GMTrace.o(11314017599488L, 84296);
        return;
      }
      w.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "no url info. download faild.");
      aQ(paramString, 2);
      GMTrace.o(11314017599488L, 84296);
      return;
      label505:
      aQ(paramString, 2);
      GMTrace.o(11314017599488L, 84296);
      return;
    }
    w.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "no request type ");
    GMTrace.o(11314017599488L, 84296);
  }
  
  public final void a(qp paramqp, boolean paramBoolean)
  {
    GMTrace.i(18947650879488L, 141171);
    w.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "handleCNDDownloadResult file no exist., try to download by cgi.emojiMd5:%s", new Object[] { paramqp.ugy });
    if (paramBoolean)
    {
      com.tencent.mm.plugin.emoji.c.a(paramqp.ugy, 3, 1, 1, "", 1, "");
      com.tencent.mm.plugin.emoji.c.bu(8L);
    }
    for (;;)
    {
      aQ(paramqp.ugy, 2);
      GMTrace.o(18947650879488L, 141171);
      return;
      com.tencent.mm.plugin.emoji.c.a(paramqp.ugy, 2, 1, 1, "", 1, "");
      com.tencent.mm.plugin.emoji.c.bu(3L);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */