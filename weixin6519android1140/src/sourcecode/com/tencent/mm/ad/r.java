package com.tencent.mm.ad;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.zero.a.e;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.anh;
import com.tencent.mm.protocal.c.ani;
import com.tencent.mm.protocal.c.aqg;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.dz;
import com.tencent.mm.protocal.c.ea;
import com.tencent.mm.protocal.c.yq;
import com.tencent.mm.protocal.g.a;
import com.tencent.mm.protocal.i.a;
import com.tencent.mm.protocal.i.c;
import com.tencent.mm.protocal.i.c.a;
import com.tencent.mm.protocal.i.d;
import com.tencent.mm.protocal.k.a;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.r.a;
import com.tencent.mm.protocal.y.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class r
  extends g.a
{
  private static e guW;
  private k.d gtS;
  private byte[] guX;
  private int type;
  
  public r(k.d paramd, int paramInt)
  {
    GMTrace.i(13420833275904L, 99993);
    this.gtS = paramd;
    this.type = paramInt;
    GMTrace.o(13420833275904L, 99993);
  }
  
  public static void a(e parame)
  {
    GMTrace.i(13420699058176L, 99992);
    guW = parame;
    GMTrace.o(13420699058176L, 99992);
  }
  
  public static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, k.d paramd, ByteArrayOutputStream paramByteArrayOutputStream, boolean paramBoolean)
  {
    GMTrace.i(13420967493632L, 99994);
    int i;
    if (bg.bq(paramArrayOfByte1))
    {
      if (paramArrayOfByte1 == null) {}
      for (i = -1;; i = paramArrayOfByte1.length)
      {
        w.e("MicroMsg.RemoteReq", "reqToBufNoRSA session is null :%d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(13420967493632L, 99994);
        return false;
      }
    }
    PByteArray localPByteArray = new PByteArray();
    try
    {
      k.b localb = (k.b)paramd;
      byte[] arrayOfByte = localb.Ba();
      if (arrayOfByte == null)
      {
        GMTrace.o(13420967493632L, 99994);
        return false;
      }
      if (localb.bOl())
      {
        paramByteArrayOutputStream.write(arrayOfByte);
        GMTrace.o(13420967493632L, 99994);
        return true;
      }
      ac localac = ac.bOo();
      i = 6;
      if (paramBoolean) {
        i = 7;
      }
      if (MMProtocalJni.pack(arrayOfByte, localPByteArray, paramArrayOfByte1, paramArrayOfByte2, paramd.tKl, paramd.tKi, localb.Bb(), localac.ver, localac.tLb.getBytes(), localac.tLc.getBytes(), paramArrayOfByte3, i))
      {
        w.d("MicroMsg.RemoteReq", "reqToBuf using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(i) });
        paramByteArrayOutputStream.write(localPByteArray.value);
        GMTrace.o(13420967493632L, 99994);
        return true;
      }
      GMTrace.o(13420967493632L, 99994);
      return false;
    }
    catch (Exception paramArrayOfByte1)
    {
      w.e("MicroMsg.RemoteReq", "protobuf build exception, check now! :" + paramArrayOfByte1.getMessage());
      w.printErrStackTrace("MicroMsg.RemoteReq", paramArrayOfByte1, "", new Object[0]);
      GMTrace.o(13420967493632L, 99994);
    }
    return false;
  }
  
  public static byte[][] a(long paramLong, com.tencent.mm.bm.a parama1, com.tencent.mm.bm.a parama2)
  {
    GMTrace.i(13421235929088L, 99996);
    if (paramLong == 0L) {
      w.w("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray autoauth uin is invalid!");
    }
    try
    {
      parama1 = parama1.toByteArray();
      if (bg.bq(parama1))
      {
        w.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf rsaReqDataBuf is null and ret false");
        GMTrace.o(13421235929088L, 99996);
        return null;
      }
    }
    catch (IOException parama1)
    {
      for (;;)
      {
        w.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf rsaReqData toProtoBuf exception:%s", new Object[] { bg.f(parama1) });
        parama1 = null;
      }
      try
      {
        parama2 = parama2.toByteArray();
        if (bg.bq(parama2))
        {
          w.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf aesReqDataBuf is null and ret false");
          GMTrace.o(13421235929088L, 99996);
          return null;
        }
      }
      catch (IOException parama2)
      {
        for (;;)
        {
          w.e("MicroMsg.RemoteReq", "summerauth toRsaAesByteArray reqToBuf aesReqData toProtoBuf exception:%s", new Object[] { bg.f(parama2) });
          parama2 = null;
        }
        GMTrace.o(13421235929088L, 99996);
      }
    }
    return tmp143_139;
  }
  
  public final void B(byte[] paramArrayOfByte)
  {
    GMTrace.i(13421504364544L, 99998);
    k.d locald = this.gtS;
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      locald.aGR = paramArrayOfByte;
      GMTrace.o(13421504364544L, 99998);
      return;
      paramArrayOfByte = new byte[0];
    }
  }
  
  public final byte[] Ec()
  {
    GMTrace.i(13421370146816L, 99997);
    byte[] arrayOfByte = this.guX;
    GMTrace.o(13421370146816L, 99997);
    return arrayOfByte;
  }
  
  public final String Ed()
  {
    GMTrace.i(13422443888640L, 100005);
    String str = this.gtS.tKk;
    GMTrace.o(13422443888640L, 100005);
    return str;
  }
  
  public final String Ee()
  {
    GMTrace.i(13422578106368L, 100006);
    String str = this.gtS.tKl;
    GMTrace.o(13422578106368L, 100006);
    return str;
  }
  
  public final int Ef()
  {
    GMTrace.i(13422980759552L, 100009);
    int i = this.gtS.tKm;
    GMTrace.o(13422980759552L, 100009);
    return i;
  }
  
  public final byte[] Eg()
  {
    GMTrace.i(13423114977280L, 100010);
    w.d("MicroMsg.RemoteReq", "dkrsa getpass type:%d", new Object[] { Integer.valueOf(this.type) });
    switch (this.type)
    {
    default: 
      if (guW != null)
      {
        arrayOfByte = guW.a(this.gtS, this.type);
        if (arrayOfByte != null)
        {
          GMTrace.o(13423114977280L, 100010);
          return arrayOfByte;
        }
      }
      break;
    case 701: 
      arrayOfByte = ((i.d)this.gtS).tJZ.uCi.tUK.uNP.toByteArray();
      GMTrace.o(13423114977280L, 100010);
      return arrayOfByte;
    case 702: 
      arrayOfByte = ((i.a)this.gtS).tJX.tSC.tSE.uNP.toByteArray();
      GMTrace.o(13423114977280L, 100010);
      return arrayOfByte;
    case 381: 
      arrayOfByte = ((r.a)this.gtS).tKL.tUK.uNP.toByteArray();
      GMTrace.o(13423114977280L, 100010);
      return arrayOfByte;
    case 126: 
      arrayOfByte = ((y.a)this.gtS).tKV.tUK.uNP.toByteArray();
      GMTrace.o(13423114977280L, 100010);
      return arrayOfByte;
    }
    if (this.gtS.tKp != null)
    {
      arrayOfByte = this.gtS.tKp;
      GMTrace.o(13423114977280L, 100010);
      return arrayOfByte;
    }
    byte[] arrayOfByte = wR();
    GMTrace.o(13423114977280L, 100010);
    return arrayOfByte;
  }
  
  public final String Eh()
  {
    GMTrace.i(13423383412736L, 100012);
    switch (this.type)
    {
    default: 
      GMTrace.o(13423383412736L, 100012);
      return "";
    }
    String str = ((i.d)this.gtS).tJZ.uCi.tVd;
    GMTrace.o(13423383412736L, 100012);
    return str;
  }
  
  public final boolean Ei()
  {
    GMTrace.i(13423786065920L, 100015);
    boolean bool = this.gtS.Ei();
    GMTrace.o(13423786065920L, 100015);
    return bool;
  }
  
  public final boolean a(int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(13421101711360L, 99995);
    PByteArray localPByteArray = new PByteArray();
    w.d("MicroMsg.RemoteReq", "reqToBuf jType: %d, stack: %s", new Object[] { Integer.valueOf(paramInt1), bg.bQW() });
    switch (paramInt1)
    {
    default: 
      if (!(this.gtS instanceof k.b))
      {
        w.f("MicroMsg.RemoteReq", "all protocal should implemented with protobuf");
        GMTrace.o(13421101711360L, 99995);
        return false;
      }
      break;
    case 268369922: 
      try
      {
        this.guX = ((k.b)this.gtS).Ba();
        this.gtS.tKr = this.guX.length;
        GMTrace.o(13421101711360L, 99995);
        return true;
      }
      catch (Exception paramArrayOfByte1)
      {
        w.printErrStackTrace("MicroMsg.RemoteReq", paramArrayOfByte1, "", new Object[0]);
        GMTrace.o(13421101711360L, 99995);
        return false;
      }
    }
    k.b localb;
    byte[] arrayOfByte2;
    long l;
    ac localac;
    byte[] arrayOfByte1;
    label287:
    int i;
    try
    {
      localb = (k.b)this.gtS;
      arrayOfByte2 = localb.Ba();
      if (arrayOfByte2 == null)
      {
        GMTrace.o(13421101711360L, 99995);
        return false;
      }
      if (localb.bOl())
      {
        this.guX = arrayOfByte2;
        this.gtS.tKr = this.guX.length;
        GMTrace.o(13421101711360L, 99995);
        return true;
      }
      l = this.gtS.tKi;
      if ((!com.tencent.mm.sdk.a.b.bPq()) || (l != 0L)) {
        break label1192;
      }
      l = com.tencent.mm.protocal.d.tJB;
      localac = this.gtS.tKq;
      arrayOfByte1 = paramArrayOfByte1;
      if (localac.bOr()) {
        break label1195;
      }
      arrayOfByte1 = new byte[0];
    }
    catch (Exception paramArrayOfByte1)
    {
      label537:
      w.e("MicroMsg.RemoteReq", "protobuf build exception, check now! :" + paramArrayOfByte1.getMessage());
      w.printErrStackTrace("MicroMsg.RemoteReq", paramArrayOfByte1, "", new Object[0]);
      GMTrace.o(13421101711360L, 99995);
      return false;
    }
    if (paramInt2 != 0)
    {
      if ((localac.bOr()) && (bg.bq(arrayOfByte1)))
      {
        w.e("MicroMsg.RemoteReq", "dksession jType %d session should not null", new Object[] { Integer.valueOf(paramInt1) });
        GMTrace.o(13421101711360L, 99995);
        return false;
        paramArrayOfByte1 = ((i.d)this.gtS).tJZ;
        paramArrayOfByte1 = a(l, paramArrayOfByte1.uCi, paramArrayOfByte1.uCj);
        paramInt2 = 1;
        break label1223;
        w.d("MicroMsg.RemoteReq", "summerauth reqToBuf rsaReqData uin[%d]", new Object[] { Long.valueOf(l) });
        if (l == 0L) {
          if (i.c.a.tJY != null) {
            break label537;
          }
        }
        for (paramInt2 = -1;; paramInt2 = i.c.a.tJY.AW())
        {
          h.xz();
          h.xw();
          i = com.tencent.mm.kernel.a.ww();
          w.w("MicroMsg.RemoteReq", "summerauth autoauth uin[%d] is invalid! uinForProtocal[%d] accountUin[%d]", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt2), Integer.valueOf(i) });
          com.tencent.mm.plugin.report.d.oqe.a(148L, 54L, 1L, true);
          if (paramInt2 != 0) {
            com.tencent.mm.plugin.report.d.oqe.a(148L, 55L, 1L, true);
          }
          if (i != 0) {
            com.tencent.mm.plugin.report.d.oqe.a(148L, 56L, 1L, true);
          }
          paramArrayOfByte1 = ((i.a)this.gtS).tJX;
          paramArrayOfByte1 = a(l, paramArrayOfByte1.tSC, paramArrayOfByte1.tSD);
          paramInt2 = 1;
          break;
        }
      }
      if (paramArrayOfByte1 == null)
      {
        GMTrace.o(13421101711360L, 99995);
        return false;
      }
      paramArrayOfByte3 = paramArrayOfByte1[0];
      paramArrayOfByte1 = paramArrayOfByte1[1];
      switch (paramInt1)
      {
      }
    }
    for (;;)
    {
      if (MMProtocalJni.packHybrid(localPByteArray, paramArrayOfByte2, this.gtS.tKl, (int)l, localb.Bb(), localac.ver, paramArrayOfByte3, paramArrayOfByte1, localac.tLb.getBytes(), localac.tLc.getBytes(), Eg(), i))
      {
        w.d("MicroMsg.RemoteReq", "MMEncryptCheckResUpdate reqToBuf packHybrid EncryptCheckResUpdate using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(i) });
        this.guX = localPByteArray.value;
      }
      for (;;)
      {
        this.gtS.tKr = this.guX.length;
        GMTrace.o(13421101711360L, 99995);
        return true;
        if (MMProtocalJni.packDoubleHybrid(localPByteArray, paramArrayOfByte2, this.gtS.tKl, (int)l, localb.Bb(), localac.ver, paramArrayOfByte3, paramArrayOfByte1, localac.tLb.getBytes(), localac.tLc.getBytes(), Eg(), i))
        {
          w.d("MicroMsg.RemoteReq", "summer reqToBuf packDoubleHybrid AutoAuth using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(i) });
          this.guX = localPByteArray.value;
        }
      }
      if (this.gtS.tKo != null)
      {
        paramInt2 = 6;
        if (paramBoolean) {
          paramInt2 = 7;
        }
        if (this.gtS.tKo.a(localPByteArray, paramInt1, paramArrayOfByte2, paramArrayOfByte3, paramInt2))
        {
          this.guX = localPByteArray.value;
          this.gtS.tKr = this.guX.length;
          w.d("MicroMsg.RemoteReq", "reqToBuf using req.getReqPackControl() ok, len:%d", new Object[] { Integer.valueOf(localPByteArray.value.length) });
        }
        GMTrace.o(13421101711360L, 99995);
        return true;
      }
      if ((paramInt1 != 775) && (localac.bOr()) && (bg.bq(arrayOfByte1)))
      {
        w.e("MicroMsg.RemoteReq", "dksession jType %d session should not null", new Object[] { Integer.valueOf(paramInt1) });
        GMTrace.o(13421101711360L, 99995);
        return false;
      }
      if (paramInt1 == 775) {}
      for (paramInt2 = i & 0xFFFFFFFD & 0xFFFFFFFB;; paramInt2 = i)
      {
        w.d("MicroMsg.RemoteReq", "dkrsa use session :%s  type:%d, flag:%d, ecdh:[%s]", new Object[] { arrayOfByte1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), bg.bp(paramArrayOfByte3) });
        if (MMProtocalJni.pack(arrayOfByte2, localPByteArray, arrayOfByte1, paramArrayOfByte2, this.gtS.tKl, (int)l, localb.Bb(), localac.ver, localac.tLb.getBytes(), localac.tLc.getBytes(), paramArrayOfByte3, paramInt2))
        {
          w.d("MicroMsg.RemoteReq", "reqToBuf using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(localPByteArray.value.length), Integer.valueOf(paramInt2) });
          this.guX = localPByteArray.value;
        }
        this.gtS.tKr = this.guX.length;
        break;
      }
      label1192:
      break;
      label1195:
      paramArrayOfByte1 = null;
      switch (paramInt1)
      {
      }
      paramInt2 = 0;
      label1223:
      i = 6;
      if (!paramBoolean) {
        break label287;
      }
      i = 7;
      break label287;
    }
  }
  
  public final void dp(int paramInt)
  {
    GMTrace.i(13421772800000L, 100000);
    this.gtS.dp(paramInt);
    GMTrace.o(13421772800000L, 100000);
  }
  
  public final void fK(int paramInt)
  {
    GMTrace.i(13422041235456L, 100002);
    this.gtS.tKj = paramInt;
    GMTrace.o(13422041235456L, 100002);
  }
  
  public final void fL(int paramInt)
  {
    GMTrace.i(13422846541824L, 100008);
    this.gtS.tKm = paramInt;
    GMTrace.o(13422846541824L, 100008);
  }
  
  public final int getClientVersion()
  {
    GMTrace.i(13422175453184L, 100003);
    int i = this.gtS.tKj;
    GMTrace.o(13422175453184L, 100003);
    return i;
  }
  
  public final int getCmdId()
  {
    GMTrace.i(13423651848192L, 100014);
    int i = this.gtS.getCmdId();
    GMTrace.o(13423651848192L, 100014);
    return i;
  }
  
  public final String getPassword()
  {
    GMTrace.i(13423249195008L, 100011);
    switch (this.type)
    {
    default: 
      GMTrace.o(13423249195008L, 100011);
      return "";
    case 701: 
      str = ((i.d)this.gtS).tJZ.uCi.tUR;
      GMTrace.o(13423249195008L, 100011);
      return str;
    }
    String str = ((y.a)this.gtS).tKV.tUR;
    GMTrace.o(13423249195008L, 100011);
    return str;
  }
  
  public final String getUserName()
  {
    GMTrace.i(13423517630464L, 100013);
    switch (this.type)
    {
    default: 
      GMTrace.o(13423517630464L, 100013);
      return "";
    case 702: 
      str = ((i.a)this.gtS).username;
      GMTrace.o(13423517630464L, 100013);
      return str;
    case 701: 
      str = ((i.d)this.gtS).tJZ.uCi.jhi;
      GMTrace.o(13423517630464L, 100013);
      return str;
    }
    String str = ((y.a)this.gtS).tKV.jhi;
    GMTrace.o(13423517630464L, 100013);
    return str;
  }
  
  public final void il(String paramString)
  {
    GMTrace.i(13422309670912L, 100004);
    this.gtS.tKk = paramString;
    GMTrace.o(13422309670912L, 100004);
  }
  
  public final void im(String paramString)
  {
    GMTrace.i(13422712324096L, 100007);
    this.gtS.tKl = paramString;
    GMTrace.o(13422712324096L, 100007);
  }
  
  public final byte[] wR()
  {
    GMTrace.i(13421638582272L, 99999);
    byte[] arrayOfByte = this.gtS.aGR;
    GMTrace.o(13421638582272L, 99999);
    return arrayOfByte;
  }
  
  public final int ww()
  {
    GMTrace.i(13421907017728L, 100001);
    int i = this.gtS.tKi;
    GMTrace.o(13421907017728L, 100001);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ad\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */