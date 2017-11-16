package com.tencent.mm.plugin.emoji.sync.a;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.cq;
import com.tencent.mm.plugin.emoji.c;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a
  extends com.tencent.mm.plugin.emoji.sync.d
{
  private EmojiInfo iZN;
  private String klF;
  private String klG;
  private String klj;
  private com.tencent.mm.plugin.emoji.sync.e kmL;
  private String kmM;
  private String kmN;
  private String kmO;
  private String kmP;
  private String kmQ;
  private com.tencent.mm.plugin.emoji.d.a kmR;
  private com.tencent.mm.ao.a.b.a kmS;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    GMTrace.i(17972827521024L, 133908);
    if (bg.nm(paramString1)) {
      w.e("MicroMsg.BKGLoader.EmojiDownloadTask", "[cpan] can not create task md5 is null.");
    }
    this.kmM = paramString1;
    this.kmN = paramString2;
    this.kmO = paramString3;
    this.klF = paramString4;
    this.kmP = paramString5;
    this.kmQ = paramString6;
    this.klj = paramString7;
    this.klG = paramString8;
    this.iZN = h.arl().kjy.UK(this.kmM);
    if (this.iZN == null)
    {
      this.iZN = new EmojiInfo();
      this.iZN.field_md5 = this.kmM;
      this.iZN.field_cdnUrl = this.kmN;
      this.iZN.field_thumbUrl = this.kmO;
      this.iZN.field_designerID = this.klF;
      this.iZN.field_encrypturl = this.kmP;
      this.iZN.field_aeskey = this.kmQ;
      this.iZN.field_groupId = this.klj;
    }
    if (!bg.nm(this.kmN))
    {
      this.iZN.field_cdnUrl = this.kmN;
      if (bg.nm(this.kmP)) {
        break label365;
      }
      this.iZN.field_encrypturl = this.kmP;
      this.iZN.field_aeskey = this.kmQ;
    }
    for (;;)
    {
      if (!bg.nm(this.klF)) {
        this.iZN.field_designerID = this.klF;
      }
      if (!bg.nm(this.klj)) {
        this.iZN.field_groupId = this.klj;
      }
      if (!bg.nm(this.kmO)) {
        this.iZN.field_thumbUrl = this.kmO;
      }
      if (!bg.nm(this.klG)) {
        this.iZN.field_activityid = this.klG;
      }
      this.kmR = new com.tencent.mm.plugin.emoji.d.a();
      this.kmS = new com.tencent.mm.ao.a.b.a();
      GMTrace.o(17972827521024L, 133908);
      return;
      this.kmN = this.iZN.field_cdnUrl;
      break;
      label365:
      this.kmP = this.iZN.field_encrypturl;
      this.kmQ = this.iZN.field_aeskey;
    }
  }
  
  private void arM()
  {
    GMTrace.i(11327305154560L, 84395);
    w.i("MicroMsg.BKGLoader.EmojiDownloadTask", "disable to download emoji when cdn download failed.");
    cq localcq = new cq();
    localcq.eDV.eDW = this.kmM;
    localcq.eDV.eCx = 0;
    localcq.eDV.success = false;
    com.tencent.mm.sdk.b.a.vgX.m(localcq);
    if (this.iZN != null)
    {
      w.i("MicroMsg.BKGLoader.EmojiDownloadTask", "[cpan] this emoji is broken. md5 is:%s", new Object[] { this.iZN.GS() });
      this.iZN.field_state = EmojiInfo.vCD;
      this.iZN.field_catalog = EmojiInfo.vCo;
      h.arl().kjy.p(this.iZN);
    }
    GMTrace.o(11327305154560L, 84395);
  }
  
  public final void a(com.tencent.mm.plugin.emoji.sync.e parame)
  {
    GMTrace.i(11327573590016L, 84397);
    this.kmL = parame;
    GMTrace.o(11327573590016L, 84397);
  }
  
  public final void cancel()
  {
    GMTrace.i(11327842025472L, 84399);
    GMTrace.o(11327842025472L, 84399);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(11327707807744L, 84398);
    if ((paramObject != null) && ((paramObject instanceof a)))
    {
      paramObject = (a)paramObject;
      if ((!bg.nm(this.kmM)) && (!bg.nm(((a)paramObject).kmM)) && (this.kmM.equals(((a)paramObject).kmM)))
      {
        GMTrace.o(11327707807744L, 84398);
        return true;
      }
    }
    GMTrace.o(11327707807744L, 84398);
    return false;
  }
  
  public final String getKey()
  {
    GMTrace.i(15572477673472L, 116024);
    String str = this.kmM;
    GMTrace.o(15572477673472L, 116024);
    return str;
  }
  
  public final void run()
  {
    GMTrace.i(11327170936832L, 84394);
    Object localObject1;
    if (this.kmL != null)
    {
      this.kmL.wp(this.kmM);
      w.i("MicroMsg.BKGLoader.EmojiDownloadTask", "emoji md5:%s cndUrl:%s thumbUrl:%s field_designerID:%s field_encrypturl:%s field_groupId:%s", new Object[] { this.iZN.GS(), this.iZN.field_cdnUrl, this.iZN.field_thumbUrl, this.iZN.field_designerID, this.iZN.field_encrypturl, this.iZN.field_groupId });
      if ((bg.nm(this.kmN)) && (bg.nm(this.kmP))) {
        break label988;
      }
      localObject1 = this.kmN;
      if ((bg.nm(this.kmP)) || (bg.nm(this.kmQ))) {
        break label1045;
      }
      localObject1 = this.kmP;
    }
    label812:
    label924:
    label988:
    label1045:
    for (int i = 1;; i = 0)
    {
      long l = System.currentTimeMillis();
      Object localObject5 = this.kmR.ks((String)localObject1);
      if ((localObject5 == null) || (bg.bq(((com.tencent.mm.ao.a.d.b)localObject5).data)))
      {
        w.d("MicroMsg.BKGLoader.EmojiDownloadTask", "get image data suuse time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        arM();
      }
      for (;;)
      {
        if (!bg.nm(this.iZN.field_thumbUrl))
        {
          localObject4 = this.kmR.ks(this.iZN.field_thumbUrl);
          if (localObject4 != null)
          {
            localObject1 = this.kmS;
            localObject2 = this.iZN.field_thumbUrl;
            localObject4 = ((com.tencent.mm.ao.a.d.b)localObject4).data;
            localObject5 = this.iZN.field_thumbUrl;
            ((com.tencent.mm.ao.a.b.a)localObject1).a((String)localObject2, (byte[])localObject4, f.g(this.iZN.bUU() + "_cover", new Object[0]));
          }
        }
        GMTrace.o(11327170936832L, 84394);
        return;
        w.w("MicroMsg.BKGLoader.EmojiDownloadTask", "call back is null.");
        break;
        w.d("MicroMsg.BKGLoader.EmojiDownloadTask", "get image data use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        Object localObject4 = ((com.tencent.mm.ao.a.d.b)localObject5).data;
        Object localObject2 = localObject4;
        if (i != 0) {}
        try
        {
          localObject2 = ((com.tencent.mm.ao.a.d.b)localObject5).data;
          localObject5 = Base64.decode(Base64.encodeToString(bg.St(this.kmQ), 0).getBytes(), 0);
          SecretKeySpec localSecretKeySpec = new SecretKeySpec((byte[])localObject5, "AES");
          Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
          localCipher.init(2, localSecretKeySpec, new IvParameterSpec(Arrays.copyOf((byte[])localObject5, localObject5.length)));
          localObject2 = localCipher.doFinal((byte[])localObject2);
          localObject4 = com.tencent.mm.sdk.platformtools.d.decodeByteArray((byte[])localObject2, 10, 10);
          boolean bool = this.kmS.a((String)localObject1, (byte[])localObject2, f.g(this.iZN.bUU(), new Object[0]));
          localObject1 = new File(this.iZN.bUU());
          if ((localObject4 == null) || (!bool) || (!((File)localObject1).exists())) {
            break label924;
          }
          localObject4 = com.tencent.mm.a.g.h((File)localObject1);
          if ((!bg.nm((String)localObject4)) && (((String)localObject4).equalsIgnoreCase(this.iZN.GS())))
          {
            this.iZN.field_size = localObject2.length;
            this.iZN.field_state = EmojiInfo.vCC;
            this.iZN.field_temp = 0;
            this.iZN.field_catalog = EmojiInfo.vCu;
            j = EmojiLogic.af((byte[])localObject2);
            this.iZN.field_type = j;
            j = h.arl().kjy.bVb();
            if (j < com.tencent.mm.plugin.emoji.e.n.aqT())
            {
              j = com.tencent.mm.plugin.emoji.e.n.aqT();
              this.iZN.field_idx = j;
              h.arl().kjy.p(this.iZN);
              localObject1 = h.arl().kjz;
              if (!com.tencent.mm.storage.emotion.a.bUC()) {
                h.arl().kjz.bUD();
              }
              localObject1 = new cq();
              ((cq)localObject1).eDV.eDW = this.kmM;
              ((cq)localObject1).eDV.eCx = 0;
              ((cq)localObject1).eDV.success = true;
              com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
              if (i == 0) {
                break label812;
              }
              c.bu(7L);
              c.bu(4L);
              c.a(this.kmM, 3, 0, 0, this.klj, 0, this.klF);
              com.tencent.mm.plugin.emoji.e.e.aqw().c(this.iZN, true);
            }
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            int j;
            w.w("MicroMsg.BKGLoader.EmojiDownloadTask", "encrypt file failed. %s", new Object[] { bg.f(localException) });
            Object localObject3 = localObject4;
            continue;
            j += 1;
            continue;
            c.bu(2L);
            c.bu(4L);
            c.a(this.kmM, 2, 0, 0, this.klj, 1, this.klF);
          }
          if (((File)localObject1).exists()) {
            ((File)localObject1).delete();
          }
          arM();
          if (i != 0)
          {
            c.bu(8L);
            c.a(this.kmM, 3, 0, 1, this.klj, 1, this.klF);
            continue;
          }
          c.bu(5L);
          c.a(this.kmM, 2, 0, 1, this.klj, 1, this.klF);
        }
        continue;
        arM();
        if (i != 0)
        {
          c.bu(8L);
          c.a(this.kmM, 3, 0, 1, this.klj, 1, this.klF);
        }
        else
        {
          c.bu(3L);
          c.a(this.kmM, 2, 1, 1, this.klj, 1, this.klF);
          continue;
          com.tencent.mm.plugin.report.service.g.ork.a(164L, 10L, 1L, false);
          localObject1 = new LinkedList();
          ((LinkedList)localObject1).add(this.kmM);
          at.wS().a(new com.tencent.mm.plugin.emoji.f.e((LinkedList)localObject1), 0);
          arM();
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\sync\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */