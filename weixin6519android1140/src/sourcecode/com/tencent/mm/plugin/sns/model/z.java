package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.bgn;
import com.tencent.mm.protocal.c.bgo;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Vector;

public final class z
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k, d
{
  private static Vector<String> ptg;
  private final int eDi;
  private boolean eHl;
  private b fUa;
  public com.tencent.mm.ad.e fUd;
  private String psD;
  private long psU;
  private boolean psV;
  private boolean psW;
  private boolean psb;
  private long psc;
  long psd;
  public int psf;
  private int pth;
  private boolean pti;
  private boolean ptj;
  public long ptk;
  String userName;
  
  static
  {
    GMTrace.i(8100576755712L, 60354);
    ptg = new Vector();
    GMTrace.o(8100576755712L, 60354);
  }
  
  public z(String paramString, long paramLong, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(8098697707520L, 60340);
    this.psU = 0L;
    this.psc = 0L;
    this.psd = 0L;
    this.pth = 0;
    this.pti = false;
    this.psD = "";
    this.psV = false;
    this.psW = false;
    this.ptj = false;
    this.psf = 0;
    this.userName = paramString;
    this.psc = paramLong;
    this.eHl = paramBoolean;
    int i;
    label120:
    Object localObject;
    n localn;
    if (paramLong == 0L)
    {
      w.i("MicroMsg.NetSceneSnsUserPage", "fp userName " + paramString);
      if (!paramBoolean) {
        break label460;
      }
      i = 4;
      this.eDi = i;
      localObject = new b.a();
      ((b.a)localObject).gtF = new bgn();
      ((b.a)localObject).gtG = new bgo();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsuserpage";
      ((b.a)localObject).gtE = 212;
      ((b.a)localObject).gtH = 99;
      ((b.a)localObject).gtI = 1000000099;
      this.fUa = ((b.a)localObject).DA();
      localObject = (bgn)this.fUa.gtC.gtK;
      ((bgn)localObject).tRz = paramString;
      ((bgn)localObject).uQA = paramLong;
      if (paramLong == 0L) {
        bool = true;
      }
      this.psb = bool;
      i = ae.biT().Hy(paramString);
      localn = ae.bjd();
      if (!this.psb) {
        break label467;
      }
    }
    for (;;)
    {
      this.psd = localn.a(l, i, paramString, paramBoolean);
      ((bgn)localObject).uRW = this.psd;
      int j = c.a(this.psd, paramLong, paramString);
      ((bgn)localObject).uRX = j;
      ((bgn)localObject).tQP = paramInt;
      if (this.psb)
      {
        this.psD = ae.bjh().Iw(paramString).field_md5;
        if (this.psD == null) {
          this.psD = "";
        }
        ((bgn)localObject).uQz = this.psD;
      }
      this.psU = paramLong;
      w.i("MicroMsg.NetSceneSnsUserPage", "nextCount: " + i + " maxId:" + i.dt(paramLong) + " minId:" + i.dt(this.psd) + " lastReqTime:" + j + " snsSource " + paramInt);
      GMTrace.o(8098697707520L, 60340);
      return;
      w.i("MicroMsg.NetSceneSnsUserPage", "np userName " + paramString);
      break;
      label460:
      i = 8;
      break label120;
      label467:
      l = paramLong;
    }
  }
  
  /* Error */
  public static boolean Ho(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 245
    //   6: ldc -9
    //   8: invokestatic 45	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: getstatic 52	com/tencent/mm/plugin/sns/model/z:ptg	Ljava/util/Vector;
    //   14: aload_0
    //   15: invokevirtual 251	java/util/Vector:contains	(Ljava/lang/Object;)Z
    //   18: ifeq +18 -> 36
    //   21: iconst_0
    //   22: istore_1
    //   23: ldc2_w 245
    //   26: ldc -9
    //   28: invokestatic 55	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   31: ldc 2
    //   33: monitorexit
    //   34: iload_1
    //   35: ireturn
    //   36: getstatic 52	com/tencent/mm/plugin/sns/model/z:ptg	Ljava/util/Vector;
    //   39: aload_0
    //   40: invokevirtual 254	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   43: pop
    //   44: iconst_1
    //   45: istore_1
    //   46: ldc2_w 245
    //   49: ldc -9
    //   51: invokestatic 55	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   54: goto -23 -> 31
    //   57: astore_0
    //   58: ldc 2
    //   60: monitorexit
    //   61: aload_0
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	paramString	String
    //   22	24	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	21	57	finally
    //   23	31	57	finally
    //   36	44	57	finally
    //   46	54	57	finally
  }
  
  public static boolean Hp(String paramString)
  {
    try
    {
      GMTrace.i(8098563489792L, 60339);
      ptg.remove(paramString);
      GMTrace.o(8098563489792L, 60339);
      return true;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private void a(bgo parambgo, String paramString)
  {
    GMTrace.i(8098966142976L, 60342);
    ai.a(this.userName, this.eDi, parambgo.tTQ, paramString);
    if (this.psc == 0L) {}
    for (this.psc = ((bfh)parambgo.tTQ.getFirst()).tXT;; this.psc = c.dx(this.psc))
    {
      this.psd = ((bfh)parambgo.tTQ.getLast()).tXT;
      w.i("MicroMsg.NetSceneSnsUserPage", "insertListAndUpdateFaultInfo userName %s maxId %s minId %s NewRequestTime %s", new Object[] { this.userName, Long.valueOf(this.psc), Long.valueOf(this.psd), Integer.valueOf(parambgo.uSa) });
      c.c(this.userName, this.psc, this.psd, parambgo.uSa);
      GMTrace.o(8098966142976L, 60342);
      return;
    }
  }
  
  private void biz()
  {
    GMTrace.i(8098831925248L, 60341);
    Object localObject = ae.bjd();
    String str = this.userName;
    boolean bool = this.eHl;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select snsId from SnsInfo ").append(n.ax(str, bool)).append(" AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25 , 26) and  (snsId != 0  )  limit ").append(4);
    str = localStringBuilder.toString();
    localObject = ((n)localObject).fTZ.rawQuery(str, null);
    int i = ((Cursor)localObject).getCount();
    ((Cursor)localObject).close();
    if ((i <= 3) && (i > 0))
    {
      this.psW = true;
      GMTrace.o(8098831925248L, 60341);
      return;
    }
    if (i == 0) {
      this.psV = true;
    }
    GMTrace.o(8098831925248L, 60341);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(8099368796160L, 60345);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(8099368796160L, 60345);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(8099100360704L, 60343);
    w.i("MicroMsg.NetSceneSnsUserPage", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    bgo localbgo = (bgo)((b)paramq).gtD.gtK;
    if ((paramq.AZ().tKs != 207) && (paramq.AZ().tKs != 203) && (paramq.AZ().tKs != 0) && (paramq.AZ().tKs != 2001) && (paramq.AZ().tKs != 2004) && (paramq.AZ().tKs != 2003))
    {
      Hp(this.userName);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8099100360704L, 60343);
      return;
    }
    Object localObject;
    boolean bool;
    if (paramq.AZ().tKs == 2003)
    {
      paramArrayOfByte = ae.bjd();
      str1 = this.userName;
      localObject = "DELETE FROM SnsInfo" + " where SnsInfo.userName=\"" + bg.nk(str1) + "\"";
      bool = paramArrayOfByte.fTZ.eZ("SnsInfo", (String)localObject);
      w.d("MicroMsg.SnsInfoStorage", "del snsinfo " + str1 + " res " + bool);
    }
    this.psf = localbgo.uQD;
    w.i("MicroMsg.NetSceneSnsUserPage", "for same md5 count: " + localbgo.uQD + " , objCount:  " + localbgo.uEP);
    this.ptk = localbgo.uSk;
    String str1 = i.du(this.psc);
    if (!this.psb)
    {
      w.d("MicroMsg.NetSceneSnsUserPage", "np  " + localbgo.tTQ.size());
      if (localbgo.tTQ.isEmpty()) {
        if (paramq.AZ().tKs == 203)
        {
          bool = true;
          this.ptj = bool;
          ae.bjd().a(this.userName, this.eHl, str1);
          this.psV = true;
          this.psd = this.psc;
        }
      }
      for (;;)
      {
        Hp(this.userName);
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8099100360704L, 60343);
        return;
        bool = false;
        break;
        a(localbgo, str1);
      }
    }
    if (this.psD.equals(localbgo.uQz))
    {
      paramq = ae.bjd();
      if (this.psb) {}
      for (long l = 0L;; l = this.psU)
      {
        this.psd = paramq.a(l, this.psf, this.userName, this.eHl);
        w.i("MicroMsg.NetSceneSnsUserPage", "md5 is nochange the new minid %s", new Object[] { Long.valueOf(this.psd) });
        biz();
        Hp(this.userName);
        paramq = ae.bjh().Iw(this.userName);
        this.fUd.a(paramq.field_lastFirstPageRequestErrType, paramq.field_lastFirstPageRequestErrCode, paramString, this);
        GMTrace.o(8099100360704L, 60343);
        return;
      }
    }
    w.i("MicroMsg.NetSceneSnsUserPage", "fp  " + localbgo.tTQ.size());
    if ((!this.psb) || (this.psD.equals(localbgo.uQz)))
    {
      ae.bjh().k(this.userName, localbgo.uQz, paramInt2, paramInt3);
      if ((paramq.AZ().tKs != 207) && (paramq.AZ().tKs != 2001) && (paramq.AZ().tKs != 2004)) {
        break label1366;
      }
      ae.bjh().dO(this.userName, "");
      if (!localbgo.tTQ.isEmpty()) {
        break label1206;
      }
      paramq = ae.bjd();
      paramArrayOfByte = this.userName;
      bool = this.eHl;
      paramq.i(bool, n.ax(paramArrayOfByte, bool) + " AND  (snsId != 0  ) ");
      this.psd = this.psc;
    }
    for (;;)
    {
      biz();
      Hp(this.userName);
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8099100360704L, 60343);
      return;
      this.pth = localbgo.uSj;
      paramArrayOfByte = ae.bjh().Iw(this.userName);
      paramArrayOfByte.field_icount = this.pth;
      localObject = localbgo.uAB;
      if (localObject != null)
      {
        str2 = i.dt(((bgm)localObject).gCK);
        String str3 = ae.getAccSnsPath();
        String str4 = this.userName + "bg_";
        String str5 = this.userName + "tbg_";
        if ((paramArrayOfByte.field_bgUrl == null) || (!paramArrayOfByte.field_bgId.equals(str2)))
        {
          paramArrayOfByte.field_older_bgId = paramArrayOfByte.field_bgId;
          if (FileOp.aZ(am.dE(str3, this.userName) + str4))
          {
            FileOp.deleteFile(am.dE(str3, this.userName) + str5);
            FileOp.g(am.dE(str3, this.userName), str4, str5);
          }
          this.pti = true;
          paramArrayOfByte.blM();
          w.d("MicroMsg.NetSceneSnsUserPage", "get new  bgid " + ((bgm)localObject).gCJ);
        }
        paramArrayOfByte.field_bgId = str2;
        paramArrayOfByte.field_bgUrl = ((bgm)localObject).gCJ;
        paramArrayOfByte.field_snsBgId = ((bgm)localObject).gCK;
      }
      ae.bjh().a(paramArrayOfByte);
      break;
      label1206:
      localObject = ae.bjd();
      paramq = this.userName;
      bool = this.eHl;
      String str2 = i.du(((bfh)localbgo.tTQ.getFirst()).tXT);
      paramArrayOfByte = n.ax(paramq, bool) + " AND  (snsId != 0  ) ";
      paramq = paramArrayOfByte;
      if (n.IA(str2)) {
        paramq = paramArrayOfByte + " AND " + ((n)localObject).ID(str2);
      }
      ((n)localObject).i(bool, paramq);
      ae.bjd().a(this.userName, this.eHl, i.du(((bfh)localbgo.tTQ.getLast()).tXT));
      a(localbgo, str1);
    }
    label1366:
    if (localbgo.tTQ.size() == 0)
    {
      w.d("MicroMsg.NetSceneSnsUserPage", "error: server give size zero");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8099100360704L, 60343);
      return;
    }
    a(localbgo, str1);
    Hp(this.userName);
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8099100360704L, 60343);
  }
  
  public final boolean bik()
  {
    GMTrace.i(8099771449344L, 60348);
    boolean bool = this.psb;
    GMTrace.o(8099771449344L, 60348);
    return bool;
  }
  
  public final boolean bil()
  {
    GMTrace.i(8099905667072L, 60349);
    boolean bool = this.psV;
    GMTrace.o(8099905667072L, 60349);
    return bool;
  }
  
  public final boolean bim()
  {
    GMTrace.i(8100308320256L, 60352);
    boolean bool = this.psW;
    GMTrace.o(8100308320256L, 60352);
    return bool;
  }
  
  public final boolean bin()
  {
    GMTrace.i(8100174102528L, 60351);
    boolean bool = this.ptj;
    GMTrace.o(8100174102528L, 60351);
    return bool;
  }
  
  public final long bio()
  {
    GMTrace.i(8099503013888L, 60346);
    long l = this.psd;
    GMTrace.o(8099503013888L, 60346);
    return l;
  }
  
  public final boolean bip()
  {
    GMTrace.i(8100039884800L, 60350);
    boolean bool = this.pti;
    GMTrace.o(8100039884800L, 60350);
    return bool;
  }
  
  public final long biq()
  {
    GMTrace.i(8100442537984L, 60353);
    long l = this.ptk;
    GMTrace.o(8100442537984L, 60353);
    return l;
  }
  
  public final int getType()
  {
    GMTrace.i(8099234578432L, 60344);
    GMTrace.o(8099234578432L, 60344);
    return 212;
  }
  
  public final String getUserName()
  {
    GMTrace.i(8099637231616L, 60347);
    String str = this.userName;
    GMTrace.o(8099637231616L, 60347);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */