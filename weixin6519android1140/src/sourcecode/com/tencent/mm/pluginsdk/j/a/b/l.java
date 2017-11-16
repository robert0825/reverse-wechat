package com.tencent.mm.pluginsdk.j.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.a.q;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.pluginsdk.j.a.e.a;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

final class l
{
  private final int eCs;
  private final int eCt;
  private final int eCu;
  private final boolean eCv;
  private final boolean eCy;
  final String filePath;
  volatile int state;
  final String tpD;
  private final String tpG;
  private final int tpH;
  private final byte[] tpI;
  private final String tpJ;
  private final long tpL;
  private final String tpM;
  private final int tpN;
  private final int tpO;
  volatile String tqM;
  volatile String tqN;
  final boolean tqm;
  final boolean tqn;
  private final String url;
  
  l(int paramInt1, int paramInt2, String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2, int paramInt3, boolean paramBoolean3, boolean paramBoolean4, byte[] paramArrayOfByte, String paramString3, String paramString4, long paramLong, String paramString5, int paramInt4, int paramInt5, int paramInt6)
  {
    GMTrace.i(855503798272L, 6374);
    this.state = -1;
    this.tqM = null;
    this.tqN = null;
    this.tpD = i.dU(paramInt1, paramInt2);
    this.eCs = paramInt1;
    this.eCt = paramInt2;
    this.filePath = paramString1;
    this.tqn = paramBoolean1;
    this.tqm = paramBoolean2;
    this.tpG = paramString2;
    this.tpH = paramInt3;
    this.tpI = paramArrayOfByte;
    this.tpJ = paramString3;
    this.eCy = paramBoolean3;
    this.eCv = paramBoolean4;
    this.tpM = paramString4;
    this.tpL = paramLong;
    this.url = paramString5;
    this.tpN = paramInt4;
    this.tpO = paramInt5;
    this.eCu = paramInt6;
    GMTrace.o(855503798272L, 6374);
  }
  
  final l bKf()
  {
    GMTrace.i(855638016000L, 6375);
    w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decrypt(), file_state = %s, before do decrypt, inPath = %s, outPath = %s, (key == empty) = %b", new Object[] { this.tpD, bKi(), this.tqM, this.tqN, Boolean.valueOf(bg.nm(this.tpG)) });
    if (1 != this.state)
    {
      GMTrace.o(855638016000L, 6375);
      return this;
    }
    if (bg.nm(this.tpG))
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decrypt(), invalid encrypt key", new Object[] { this.tpD });
      this.tqM = null;
      this.state = 8;
      j.r(this.tpL, 54L);
      j.r(this.tpL, 45L);
      GMTrace.o(855638016000L, 6375);
      return this;
    }
    for (;;)
    {
      try
      {
        localObject2 = this.tqM;
        str = this.tqN;
        localObject1 = this.tpG;
        localFile = new File((String)localObject2);
        if ((!localFile.exists()) || (!localFile.isFile()))
        {
          w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "inFile(%s) not exists", new Object[] { localObject2 });
          bool1 = false;
        }
      }
      catch (Exception localException1)
      {
        Object localObject2;
        String str;
        Object localObject1;
        File localFile;
        boolean bool2;
        boolean bool1 = false;
      }
      try
      {
        w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decrypt(), decrypt done, ret = %b", new Object[] { this.tpD, Boolean.valueOf(bool1) });
        w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decrypt(), after try-catch, ret = %b", new Object[] { this.tpD, Boolean.valueOf(bool1) });
        if (bool1) {
          break;
        }
        this.tqM = null;
        this.state = 8;
        GMTrace.o(855638016000L, 6375);
        return this;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      localFile = new File(str);
      localFile.getParentFile().mkdirs();
      localFile.delete();
      localObject2 = a.OR((String)localObject2);
      if (bg.bq((byte[])localObject2))
      {
        w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "read bytes empty");
        j.r(this.tpL, 56L);
        j.r(this.tpL, 45L);
        j.r(this.tpL, 18L);
        bool1 = false;
      }
      else
      {
        localObject1 = MMProtocalJni.aesDecrypt((byte[])localObject2, ((String)localObject1).getBytes());
        if (bg.bq((byte[])localObject1))
        {
          w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "decrypted bytes empty");
          j.r(this.tpL, 55L);
          j.r(this.tpL, 45L);
          j.r(this.tpL, 18L);
          bool1 = false;
        }
        else
        {
          bool2 = a.u(str, (byte[])localObject1);
          bool1 = bool2;
          if (!bool2)
          {
            w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "decrypt write bytes fail");
            j.r(this.tpL, 57L);
            j.r(this.tpL, 45L);
            j.r(this.tpL, 18L);
            bool1 = bool2;
            continue;
            w.printErrStackTrace("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", localException1, "", new Object[0]);
            w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decrypt(), error = %s", new Object[] { this.tpD, localException1 });
            j.r(this.tpL, 45L);
            j.r(this.tpL, 18L);
          }
        }
      }
    }
    j.r(this.tpL, 17L);
    this.tqM = this.tqN;
    if (this.tqm)
    {
      this.tqN = (this.filePath + ".decompressed");
      this.state = 2;
      GMTrace.o(855638016000L, 6375);
      return this;
    }
    this.state = 4;
    GMTrace.o(855638016000L, 6375);
    return this;
  }
  
  final l bKg()
  {
    GMTrace.i(855772233728L, 6376);
    w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decompress(), file_state = %s, before do decompress, inPath = %s, outPath = %s", new Object[] { this.tpD, bKi(), this.tqM, this.tqN });
    if (2 != this.state)
    {
      if ((8 == this.state) && (this.tqn)) {
        j.a(this.eCs, this.eCt, this.tpH, this.eCy, false, false, false, this.tpM);
      }
      GMTrace.o(855772233728L, 6376);
      return this;
    }
    for (;;)
    {
      try
      {
        localObject = this.tqM;
        str1 = this.tqN;
        File localFile = new File((String)localObject);
        if ((!localFile.exists()) || (!localFile.isFile()))
        {
          w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "inFile(%s) not exists", new Object[] { localObject });
          bool = false;
        }
      }
      catch (Exception localException1)
      {
        Object localObject;
        String str1;
        boolean bool = false;
      }
      try
      {
        w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decompress(), decompress done, ret = %b", new Object[] { this.tpD, Boolean.valueOf(bool) });
        w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decompress(), after try-catch, ret = %b", new Object[] { this.tpD, Boolean.valueOf(bool) });
        if (!bool) {
          break;
        }
        this.tqM = this.tqN;
        this.state = 4;
        j.r(this.tpL, 19L);
        GMTrace.o(855772233728L, 6376);
        return this;
      }
      catch (Exception localException2)
      {
        int j;
        int k;
        String str2;
        int m;
        int i;
        for (;;) {}
      }
      new File(str1).delete();
      localObject = q.q(a.OR((String)localObject));
      if (bg.bq((byte[])localObject))
      {
        w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "uncompressed bytes empty");
        bool = false;
      }
      else
      {
        bool = a.u(str1, (byte[])localObject);
        continue;
        w.printErrStackTrace("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", localException1, "", new Object[0]);
        w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: decompress(), error = %s", new Object[] { this.tpD, localException1 });
      }
    }
    this.tqM = null;
    this.state = 8;
    j.r(this.tpL, 20L);
    j.r(this.tpL, 46L);
    if (this.tqn) {
      j.a(this.eCs, this.eCt, this.tpH, this.eCy, true, false, false, this.tpM);
    }
    while ((!this.tqm) || (!this.eCv))
    {
      GMTrace.o(855772233728L, 6376);
      return this;
    }
    j = this.eCs;
    k = this.eCt;
    str2 = this.url;
    m = this.eCu;
    if (this.tpN > this.tpO) {}
    for (i = j.a.tqG;; i = j.a.tqE)
    {
      j.a(j, k, str2, m, i, false, this.eCy, false, this.tpM);
      break;
    }
  }
  
  final String bKh()
  {
    GMTrace.i(855906451456L, 6377);
    w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSum(), state " + bKi(), new Object[] { this.tpD });
    String str1;
    if (16 == this.state)
    {
      str1 = this.tqM;
      GMTrace.o(855906451456L, 6377);
      return str1;
    }
    if ((4 != this.state) && (32 != this.state))
    {
      GMTrace.o(855906451456L, 6377);
      return null;
    }
    if (!bg.nm(this.tqM))
    {
      str2 = this.tpD;
      String str3 = bKi();
      String str4 = this.tpJ;
      if (this.tpI == null)
      {
        str1 = "null";
        w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, originalMd5 = %s, eccSig.size = %s", new Object[] { str2, str3, str4, str1 });
        if ((bg.nm(this.tpJ)) || (!bg.nl(g.bg(this.tqM)).equals(this.tpJ))) {
          break label385;
        }
        w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, md5 ok", new Object[] { this.tpD, bKi() });
        if (this.state == 4) {
          j.r(this.tpL, 23L);
        }
        str1 = this.tqM;
        label252:
        w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl return = %s", new Object[] { this.tpD, str1 });
        if (this.state == 4)
        {
          if ((bg.nm(str1)) && (!this.tqm))
          {
            j.r(this.tpL, 58L);
            j.r(this.tpL, 45L);
          }
          if (!bg.nm(str1)) {
            break label591;
          }
          if (!this.tqn) {
            break label510;
          }
          j.a(this.eCs, this.eCt, this.tpH, this.eCy, true, true, false, this.tpM);
        }
      }
    }
    label385:
    label510:
    label591:
    label627:
    do
    {
      for (;;)
      {
        GMTrace.o(855906451456L, 6377);
        return str1;
        str1 = String.valueOf(this.tpI.length);
        break;
        if (this.state == 4) {
          j.r(this.tpL, 24L);
        }
        if ((!bg.bq(this.tpI)) && (UtilsJni.doEcdsaSHAVerify(i.tqp, a.OR(this.tqM), this.tpI) > 0))
        {
          w.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, ecc check ok", new Object[] { this.tpD, bKi() });
          if (this.state == 4) {
            j.r(this.tpL, 25L);
          }
          str1 = this.tqM;
          break label252;
        }
        if (this.state == 4) {
          j.r(this.tpL, 26L);
        }
        str1 = null;
        break label252;
        if ((this.tqm) && (this.eCv))
        {
          j = this.eCs;
          k = this.eCt;
          str2 = this.url;
          m = this.eCu;
          if (this.tpN > this.tpO) {}
          for (i = j.a.tqG;; i = j.a.tqE)
          {
            j.a(j, k, str2, m, i, false, this.eCy, true, this.tpM);
            break;
          }
          if (!this.tqn) {
            break label627;
          }
          j.a(this.eCs, this.eCt, this.tpH, this.eCy, true, true, true, this.tpM);
        }
      }
    } while ((!this.tqm) || (!this.eCv));
    int j = this.eCs;
    int k = this.eCt;
    String str2 = this.url;
    int m = this.eCu;
    if (this.tpN > this.tpO) {}
    for (int i = j.a.tqG;; i = j.a.tqE)
    {
      j.a(j, k, str2, m, i, true, this.eCy, true, this.tpM);
      break;
    }
  }
  
  final String bKi()
  {
    GMTrace.i(856040669184L, 6378);
    switch (this.state)
    {
    default: 
      String str = this.state;
      GMTrace.o(856040669184L, 6378);
      return str;
    case 1: 
      GMTrace.o(856040669184L, 6378);
      return "state_decrypt";
    case 2: 
      GMTrace.o(856040669184L, 6378);
      return "state_decompress";
    case 4: 
      GMTrace.o(856040669184L, 6378);
      return "state_check_sum";
    case 8: 
      GMTrace.o(856040669184L, 6378);
      return "state_file_invalid";
    case 16: 
      GMTrace.o(856040669184L, 6378);
      return "state_file_valid";
    }
    GMTrace.o(856040669184L, 6378);
    return "state_pre_verify_check_sum";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */