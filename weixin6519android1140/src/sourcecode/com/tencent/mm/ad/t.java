package com.tencent.mm.ad;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.g.a.gz;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.aqh;
import com.tencent.mm.protocal.c.awt;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bbf;
import com.tencent.mm.protocal.c.bki;
import com.tencent.mm.protocal.c.du;
import com.tencent.mm.protocal.c.yr;
import com.tencent.mm.protocal.h.a;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.r.b;
import com.tencent.mm.protocal.y.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class t
  extends h.a
{
  private static a gvg;
  private k.e gve;
  private byte[] gvf;
  private int type;
  
  public t(k.e parame, int paramInt)
  {
    GMTrace.i(13401103269888L, 99846);
    this.gve = parame;
    this.type = paramInt;
    GMTrace.o(13401103269888L, 99846);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(13400969052160L, 99845);
    gvg = parama;
    GMTrace.o(13400969052160L, 99845);
  }
  
  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, PInt paramPInt, azh paramazh)
  {
    GMTrace.i(13401371705344L, 99848);
    PByteArray localPByteArray2 = new PByteArray();
    paramPInt.value = -1;
    PByteArray localPByteArray1 = new PByteArray();
    PInt localPInt1 = new PInt(0);
    PInt localPInt2 = new PInt(0);
    PInt localPInt3 = new PInt(255);
    for (;;)
    {
      try
      {
        boolean bool1 = MMProtocalJni.unpack(localPByteArray1, paramArrayOfByte1, paramArrayOfByte2, localPByteArray2, paramPInt, localPInt1, localPInt2, localPInt3);
        w.i("MicroMsg.RemoteResp", "bufToRespNoRSA unpack ret[%b], noticeid[%d], headExtFlags[%d]", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(localPInt2.value), Integer.valueOf(localPInt3.value) });
        if (localPInt2.value != 0)
        {
          paramArrayOfByte1 = new gz();
          paramArrayOfByte1.eKe.eKf = localPInt2.value;
          boolean bool2 = a.vgX.m(paramArrayOfByte1);
          w.i("MicroMsg.RemoteResp", "summerdiz bufToRespNoRSA publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt2.value), Boolean.valueOf(bool2) });
        }
        if (!bool1) {
          continue;
        }
        if ((paramPInt.value == -13) || (paramPInt.value == -102) || (paramPInt.value == 62535))
        {
          w.e("MicroMsg.RemoteResp", "unpack failed. error:%d", new Object[] { Integer.valueOf(paramPInt.value) });
          GMTrace.o(13401371705344L, 99848);
          return null;
        }
        int i = paramPInt.value;
        if (i != 62534) {
          continue;
        }
        try
        {
          paramArrayOfByte1 = new String(localPByteArray1.value);
          w.i("MicroMsg.RemoteResp", "bufToRespNoRSA -3002 ERR_IDCDISASTER, errStr:%s", new Object[] { paramArrayOfByte1 });
          new ae(Looper.getMainLooper()).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(13420296404992L, 99989);
              if ((!bg.nm(this.gvh)) && (t.Eu() != null)) {
                t.Eu().bL(this.gvh);
              }
              GMTrace.o(13420296404992L, 99989);
            }
          });
          GMTrace.o(13401371705344L, 99848);
          return null;
        }
        catch (Exception paramArrayOfByte1)
        {
          w.e("MicroMsg.RemoteResp", "parse string err while MM_ERR_IDCDISASTER");
        }
      }
      catch (Exception paramArrayOfByte1)
      {
        w.printErrStackTrace("MicroMsg.RemoteResp", paramArrayOfByte1, "parseFrom unbuild exception, check now!", new Object[0]);
        w.e("MicroMsg.RemoteResp", "exception:%s", new Object[] { bg.f(paramArrayOfByte1) });
        continue;
      }
      GMTrace.o(13401371705344L, 99848);
      return null;
      w.i("MicroMsg.RemoteResp", "fuckwifi bufToRespNoRSA using protobuf ok jtype:%d enType:%d ", new Object[] { Integer.valueOf(110), Integer.valueOf(localPInt1.value) });
      paramazh.aD(localPByteArray1.value);
      paramArrayOfByte1 = localPByteArray1.value;
      GMTrace.o(13401371705344L, 99848);
      return paramArrayOfByte1;
      w.e("MicroMsg.RemoteResp", "unpack failed.");
    }
  }
  
  public final byte[] DT()
  {
    GMTrace.i(13401505923072L, 99849);
    byte[] arrayOfByte = this.gvf;
    GMTrace.o(13401505923072L, 99849);
    return arrayOfByte;
  }
  
  public final byte[] DV()
  {
    GMTrace.i(13402445447168L, 99856);
    byte[] arrayOfByte = new byte[0];
    switch (this.type)
    {
    }
    for (;;)
    {
      GMTrace.o(13402445447168L, 99856);
      return arrayOfByte;
      arrayOfByte = ((i.g)this.gve).tKd;
      continue;
      arrayOfByte = ((y.b)this.gve).tKd;
    }
  }
  
  public final int Em()
  {
    GMTrace.i(20311571431424L, 151333);
    int i = this.gve.tKt;
    GMTrace.o(20311571431424L, 151333);
    return i;
  }
  
  public final String En()
  {
    GMTrace.i(13401640140800L, 99850);
    String str = this.gve.tKu;
    GMTrace.o(13401640140800L, 99850);
    return str;
  }
  
  public final int Eo()
  {
    GMTrace.i(13401908576256L, 99852);
    int i = this.gve.tKs;
    GMTrace.o(13401908576256L, 99852);
    return i;
  }
  
  public final byte[] Ep()
  {
    GMTrace.i(13402311229440L, 99855);
    switch (this.type)
    {
    }
    for (;;)
    {
      Object localObject = new byte[0];
      for (;;)
      {
        GMTrace.o(13402311229440L, 99855);
        return (byte[])localObject;
        if (((i.g)this.gve).tKc.uVc.tSb == null) {
          break;
        }
        localObject = ((i.g)this.gve).tKc.uVc.tSb.uNP.toByteArray();
        continue;
        localObject = ((y.b)this.gve).tKW.uGx;
        if ((localObject == null) || (((bbf)localObject).tSb == null)) {
          break label146;
        }
        localObject = ((bbf)localObject).tSb.uNP.toByteArray();
      }
      label146:
      w.d("MicroMsg.RemoteResp", "summerauth MMFunc_NewReg SecAuthRegKeySect is null");
    }
  }
  
  public final String Eq()
  {
    GMTrace.i(13402579664896L, 99857);
    if (this.type == 381)
    {
      Object localObject = ((r.b)this.gve).tKM.upz;
      if (localObject != null)
      {
        localObject = bg.nl(((awt)localObject).uLH);
        GMTrace.o(13402579664896L, 99857);
        return (String)localObject;
      }
    }
    GMTrace.o(13402579664896L, 99857);
    return "";
  }
  
  public final String Er()
  {
    GMTrace.i(13402713882624L, 99858);
    if (this.type == 381)
    {
      Object localObject = ((r.b)this.gve).tKM.upz;
      if (localObject != null)
      {
        localObject = bg.nl(((awt)localObject).uLG);
        GMTrace.o(13402713882624L, 99858);
        return (String)localObject;
      }
    }
    GMTrace.o(13402713882624L, 99858);
    return "";
  }
  
  public final int Es()
  {
    GMTrace.i(13402848100352L, 99859);
    if (this.type == 381)
    {
      int i = ((r.b)this.gve).tKM.uoK;
      GMTrace.o(13402848100352L, 99859);
      return i;
    }
    GMTrace.o(13402848100352L, 99859);
    return 0;
  }
  
  public final String Et()
  {
    GMTrace.i(13403116535808L, 99861);
    switch (this.type)
    {
    default: 
      GMTrace.o(13403116535808L, 99861);
      return "";
    case 701: 
    case 702: 
      str = ((i.g)this.gve).hgh;
      GMTrace.o(13403116535808L, 99861);
      return str;
    }
    String str = ((y.b)this.gve).tKW.jhi;
    GMTrace.o(13403116535808L, 99861);
    return str;
  }
  
  public final boolean a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(13401237487616L, 99847);
    PByteArray localPByteArray1 = new PByteArray();
    if (!(this.gve instanceof k.c))
    {
      w.f("MicroMsg.RemoteResp", "all protocal should implemented with protobuf");
      GMTrace.o(13401237487616L, 99847);
      return false;
    }
    PByteArray localPByteArray2 = new PByteArray();
    PInt localPInt2 = new PInt(0);
    k.c localc = (k.c)this.gve;
    PInt localPInt3 = new PInt(0);
    PInt localPInt1 = new PInt(0);
    PInt localPInt4 = new PInt(255);
    boolean bool;
    int i;
    try
    {
      if (localc.bOl())
      {
        paramInt = localc.y(paramArrayOfByte1);
        w.d("MicroMsg.RemoteResp", "rawData using protobuf ok");
        this.gve.tKs = paramInt;
        if (!bg.nm(r.hkm)) {
          this.gve.tKu = r.hkm;
        }
        GMTrace.o(13401237487616L, 99847);
        return true;
      }
      bool = MMProtocalJni.unpack(localPByteArray2, paramArrayOfByte1, paramArrayOfByte2, localPByteArray1, localPInt2, localPInt3, localPInt1, localPInt4);
      w.i("MicroMsg.RemoteResp", "bufToResp unpack ret[%b], jType[%d], noticeid[%d], headExtFlags[%d]", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt), Integer.valueOf(localPInt1.value), Integer.valueOf(localPInt4.value) });
      if (bool)
      {
        this.gve.tKt = localPInt4.value;
        if ((paramInt != 701) && (paramInt != 702) && (10001 == r.hkj) && (r.hkk > 0))
        {
          if (r.hkk == 2) {
            ac.G("", "", 0);
          }
          r.hkk = 0;
          localPInt2.value = -13;
          w.w("MicroMsg.RemoteResp", "dkcert dktest set session timeout once !");
        }
        if ((localPInt2.value == -13) || (localPInt2.value == -102) || (localPInt2.value == 62535) || (localPInt2.value == 62534) || (localPInt2.value == 62533))
        {
          this.gve.tKs = localPInt2.value;
          i = localPInt2.value;
          if (i == 62534) {}
          try
          {
            this.gve.tKu = new String(localPByteArray2.value);
            w.i("MicroMsg.RemoteResp", "jType [%d], ret value[%d], noticeId[%s], msg[%s]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localPInt2.value), localPInt1, this.gve.tKu });
            this.gve.tKr = paramArrayOfByte1.length;
            this.gvf = localPByteArray1.value;
            if (!bg.nm(r.hkm)) {
              this.gve.tKu = r.hkm;
            }
            if (localPInt1.value != 0)
            {
              paramArrayOfByte1 = new gz();
              paramArrayOfByte1.eKe.eKf = localPInt1.value;
              if ((paramInt == 701) && (this.gve.tKs == 0))
              {
                w.i("MicroMsg.RemoteResp", "summerdiz publish GetDisasterInfoEvent MMFunc_ManualAuth ok [%d]", new Object[] { Integer.valueOf(localPInt1.value) });
                paramArrayOfByte1.eKe.eKg = true;
              }
              bool = a.vgX.m(paramArrayOfByte1);
              w.i("MicroMsg.RemoteResp", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt1.value), Boolean.valueOf(bool) });
              localPInt1.value = 0;
            }
            GMTrace.o(13401237487616L, 99847);
            return true;
          }
          catch (Exception paramArrayOfByte2)
          {
            for (;;)
            {
              w.e("MicroMsg.RemoteResp", "parse string err while MM_ERR_IDCDISASTER");
            }
          }
          if (localPInt1.value == 0) {}
        }
      }
    }
    catch (Exception paramArrayOfByte1)
    {
      w.printErrStackTrace("MicroMsg.RemoteResp", paramArrayOfByte1, "from Protobuf unbuild exception, check now!", new Object[0]);
      w.e("MicroMsg.RemoteResp", "exception:%s", new Object[] { bg.f(paramArrayOfByte1) });
    }
    for (;;)
    {
      paramArrayOfByte1 = new gz();
      paramArrayOfByte1.eKe.eKf = localPInt1.value;
      bool = a.vgX.m(paramArrayOfByte1);
      w.i("MicroMsg.RemoteResp", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt1.value), Boolean.valueOf(bool) });
      localPInt1.value = 0;
      GMTrace.o(13401237487616L, 99847);
      return false;
      i = localc.y(localPByteArray2.value);
      w.i("MicroMsg.RemoteResp", "bufToResp using protobuf ok jType:%d, enType:%d errCode:%d, len:%d, headExtFlags:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localPInt3.value), Integer.valueOf(i), Integer.valueOf(localPByteArray2.value.length), Integer.valueOf(this.gve.tKt) });
      this.gve.tKs = i;
      break;
      w.e("MicroMsg.RemoteResp", "unpack return false jType[%d]", new Object[] { Integer.valueOf(paramInt) });
    }
  }
  
  public final void fM(int paramInt)
  {
    GMTrace.i(13402042793984L, 99853);
    this.gve.tKs = paramInt;
    GMTrace.o(13402042793984L, 99853);
  }
  
  public final int getCmdId()
  {
    GMTrace.i(13403250753536L, 99862);
    int i = this.gve.getCmdId();
    GMTrace.o(13403250753536L, 99862);
    return i;
  }
  
  public final void io(String paramString)
  {
    GMTrace.i(13401774358528L, 99851);
    this.gve.tKu = paramString;
    GMTrace.o(13401774358528L, 99851);
  }
  
  public final byte[] wR()
  {
    GMTrace.i(13402177011712L, 99854);
    byte[] arrayOfByte = new byte[0];
    switch (this.type)
    {
    }
    for (;;)
    {
      GMTrace.o(13402177011712L, 99854);
      return arrayOfByte;
      arrayOfByte = ((i.g)this.gve).hge;
      continue;
      arrayOfByte = ((y.b)this.gve).hge;
    }
  }
  
  public final int ww()
  {
    GMTrace.i(13402982318080L, 99860);
    switch (this.type)
    {
    default: 
      GMTrace.o(13402982318080L, 99860);
      return 0;
    case 701: 
    case 702: 
      i = ((i.g)this.gve).tKc.uVc.kAW;
      GMTrace.o(13402982318080L, 99860);
      return i;
    }
    int i = ((y.b)this.gve).tKW.kAW;
    GMTrace.o(13402982318080L, 99860);
    return i;
  }
  
  public static abstract interface a
  {
    public abstract void bL(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ad\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */