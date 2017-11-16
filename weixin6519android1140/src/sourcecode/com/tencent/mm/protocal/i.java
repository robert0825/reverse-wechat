package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.ang;
import com.tencent.mm.protocal.c.anh;
import com.tencent.mm.protocal.c.ani;
import com.tencent.mm.protocal.c.ayx;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bki;
import com.tencent.mm.protocal.c.du;
import com.tencent.mm.protocal.c.dx;
import com.tencent.mm.protocal.c.dz;
import com.tencent.mm.protocal.c.ea;
import com.tencent.mm.protocal.c.ep;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.qm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.s;
import java.io.IOException;

public final class i
{
  public static final class a
    extends i.f
    implements k.b
  {
    public dz tJX;
    public String username;
    
    public a()
    {
      GMTrace.i(13571559784448L, 101116);
      this.tJX = new dz();
      GMTrace.o(13571559784448L, 101116);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(13571694002176L, 101117);
      a.eI("");
      int j = this.tKm;
      int i;
      Object localObject1;
      Object localObject2;
      Object localObject4;
      Object localObject3;
      int k;
      int m;
      if (j == 12)
      {
        i = 1;
        w.d("MicroMsg.AutoReq", "summerstatus[%d] clientUpgrade[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        this.tKq = ac.bOo();
        if ((10002 == r.hkj) && (r.hkk > 0))
        {
          r.hkk = 0;
          ac.G("", "", 0);
        }
        localObject1 = this.tJX.tSD;
        ((ayx)localObject1).uNh = k.a(this);
        w.i("MicroMsg.AutoReq", "summerauth autoauth toProtoBuf[%d]", new Object[] { Integer.valueOf(this.tKi) });
        ((dx)localObject1).tSv = p.sZ();
        ((dx)localObject1).tSw = com.tencent.mm.plugin.normsg.a.d.nxJ.rR(i);
        ((dx)localObject1).tSx = 0;
        ((dx)localObject1).tSy = a.wN();
        ((dx)localObject1).gCA = bg.eF(ab.getContext());
        ((dx)localObject1).jhm = d.tJA;
        ((dx)localObject1).tSz = ba.bUs();
        ((dx)localObject1).kBh = v.bPK();
        ((dx)localObject1).kBg = bg.bQP();
        h.xz();
        localObject2 = (String)h.xy().fYL.get(18);
        w.d("MicroMsg.AutoReq", "summerecdh ksid:%s, flag:%d", new Object[] { localObject2, Integer.valueOf(((dx)localObject1).tSu.tTw) });
        ((dx)localObject1).tSu.tTu.tVi = new azp().be(bg.St((String)localObject2));
        localObject1 = this.tJX.tSC;
        localObject2 = new qm();
        ((qm)localObject2).ugt = 713;
        localObject4 = new PByteArray();
        localObject3 = new PByteArray();
        k = MMProtocalJni.generateECKey(((qm)localObject2).ugt, (PByteArray)localObject4, (PByteArray)localObject3);
        localObject4 = ((PByteArray)localObject4).value;
        localObject3 = ((PByteArray)localObject3).value;
        aY((byte[])localObject3);
        m = ((qm)localObject2).ugt;
        if (localObject4 != null) {
          break label510;
        }
        i = -1;
        label382:
        if (localObject3 != null) {
          break label517;
        }
      }
      label510:
      label517:
      for (j = -1;; j = localObject3.length)
      {
        w.d("MicroMsg.AutoReq", "summerecdh nid:%d ret:%d, pub len: %d, pri len:%d, pub:%s, pri:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), bg.bp((byte[])localObject4), bg.bp((byte[])localObject3) });
        ((qm)localObject2).tSB = new azp().be((byte[])localObject4);
        ((ea)localObject1).tSF = ((qm)localObject2);
        try
        {
          localObject1 = this.tJX.toByteArray();
          GMTrace.o(13571694002176L, 101117);
          return (byte[])localObject1;
        }
        catch (IOException localIOException)
        {
          w.e("MicroMsg.AutoReq", "summerauth toProtoBuf :%s", new Object[] { bg.f(localIOException) });
          GMTrace.o(13571694002176L, 101117);
        }
        h.xz();
        i = h.xy().fYL.Ar(46);
        break;
        i = localObject4.length;
        break label382;
      }
      return null;
    }
    
    public final int Bb()
    {
      GMTrace.i(13571828219904L, 101118);
      GMTrace.o(13571828219904L, 101118);
      return 702;
    }
    
    public final String getUri()
    {
      GMTrace.i(13571962437632L, 101119);
      GMTrace.o(13571962437632L, 101119);
      return "/cgi-bin/micromsg-bin/autoauth";
    }
  }
  
  public static final class b
    extends i.g
    implements k.c
  {
    public b()
    {
      GMTrace.i(13590618701824L, 101258);
      GMTrace.o(13590618701824L, 101258);
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(13590752919552L, 101259);
      try
      {
        this.tKc = ((bki)this.tKc.aD(paramArrayOfByte));
        k.a(this, this.tKc.uND);
        this.tKe = 0;
        if ((this.tKc.uND.tST == 0) && ((this.tKc.uVc == null) || (this.tKc.uVc.kAW == 0) || (bg.bq(n.a(this.tKc.uVc.tSa)))))
        {
          w.e("MicroMsg.MMAuth", "retcode 0 but invalid auth sect resp or invalid uin or invalid session");
          this.tKc.uND.tST = -1;
        }
        paramArrayOfByte = this.tKu;
        w.i("MicroMsg.MMAuth", "summerauthkick auto errmsg[%s]", new Object[] { paramArrayOfByte });
        a.eI(paramArrayOfByte);
        int i = this.tKc.uND.tST;
        GMTrace.o(13590752919552L, 101259);
        return i;
      }
      catch (IOException paramArrayOfByte)
      {
        w.e("MicroMsg.MMAuth", "toProtoBuf :%s", new Object[] { bg.f(paramArrayOfByte) });
        this.tKc.uND.tST = -1;
        GMTrace.o(13590752919552L, 101259);
      }
      return -1;
    }
  }
  
  public static abstract interface c
  {
    public abstract int AW();
    
    public abstract void a(i.f paramf, i.g paramg, int paramInt1, int paramInt2, String paramString);
    
    public abstract q aJ(int paramInt1, int paramInt2);
    
    public static final class a
    {
      public static i.c tJY;
    }
  }
  
  public static final class d
    extends i.f
    implements k.b
  {
    public anh tJZ;
    public boolean tKa;
    
    public d()
    {
      GMTrace.i(13599611289600L, 101325);
      this.tJZ = new anh();
      this.tKa = false;
      GMTrace.o(13599611289600L, 101325);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(13599745507328L, 101326);
      a.eI("");
      int j = this.tKm;
      int i;
      Object localObject1;
      Object localObject2;
      qm localqm;
      Object localObject4;
      Object localObject3;
      int k;
      int m;
      if (j == 16)
      {
        i = 1;
        w.d("MicroMsg.ManualReq", "summerstatus[%d] clientUpgrade[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        if ((10002 == r.hkj) && (r.hkk > 0))
        {
          r.hkk = 0;
          ac.G("", "", 0);
        }
        this.tKq = ac.bOo();
        localObject1 = this.tJZ.uCj;
        ((ayx)localObject1).uNh = k.a(this);
        ((ang)localObject1).tSv = p.sZ();
        ((ang)localObject1).tSw = com.tencent.mm.plugin.normsg.a.d.nxJ.rR(i);
        ((ang)localObject1).tSx = 0;
        ((ang)localObject1).tSy = a.wN();
        ((ang)localObject1).gCA = bg.eF(ab.getContext());
        ((ang)localObject1).jhm = d.tJA;
        ((ang)localObject1).tSz = ba.bUs();
        ((ang)localObject1).kBh = v.bPK();
        ((ang)localObject1).kBg = bg.bQP();
        ((ang)localObject1).tMZ = f.vhp;
        if ((10012 == r.hkj) && (r.hkk > 0)) {
          ((ang)localObject1).tMZ = r.hkk;
        }
        ((ang)localObject1).tWE = d.tJv;
        ((ang)localObject1).tWD = d.tJw;
        ((ang)localObject1).uCe = d.tJx;
        ((ang)localObject1).ugv = p.getSimCountryIso();
        h.xz();
        localObject2 = (String)h.xy().fYL.get(18);
        w.d("MicroMsg.ManualReq", "summerauth ksid:%s authreq flag:%d", new Object[] { localObject2, Integer.valueOf(((ang)localObject1).tSu.tTw) });
        ((ang)localObject1).tSu.tTu.tVi = new azp().be(bg.St((String)localObject2));
        localObject2 = this.tJZ.uCi;
        ((ani)localObject2).tUK = new azp().be(bg.bQN());
        localqm = new qm();
        localqm.ugt = 713;
        localObject4 = new PByteArray();
        localObject3 = new PByteArray();
        k = MMProtocalJni.generateECKey(localqm.ugt, (PByteArray)localObject4, (PByteArray)localObject3);
        localObject4 = ((PByteArray)localObject4).value;
        localObject3 = ((PByteArray)localObject3).value;
        aY((byte[])localObject3);
        m = localqm.ugt;
        if (localObject4 != null) {
          break label720;
        }
        i = -1;
        label443:
        if (localObject3 != null) {
          break label727;
        }
      }
      label720:
      label727:
      for (j = -1;; j = localObject3.length)
      {
        w.d("MicroMsg.ManualReq", "summerecdh nid:%d ret:%d, pub len: %d, pri len:%d, pub:%s, pri:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), bg.bp((byte[])localObject4), bg.bp((byte[])localObject3) });
        localqm.tSB = new azp().be((byte[])localObject4);
        ((ani)localObject2).tSF = localqm;
        w.i("MicroMsg.ManualReq", "summerauth IMEI:%s SoftType:%s ClientSeqID:%s Signature:%s DeviceName:%s DeviceType:%s Language:%s TimeZone:%s chan[%d,%d] DeviceBrand:%s DeviceModel:%s OSType:%s RealCountry:%s", new Object[] { ((ang)localObject1).tSv, ((ang)localObject1).tSw, ((ang)localObject1).tSy, ((ang)localObject1).gCA, ((ang)localObject1).jhm, ((ang)localObject1).tSz, ((ang)localObject1).kBh, ((ang)localObject1).kBg, Integer.valueOf(((ang)localObject1).tMZ), Integer.valueOf(f.eqV), ((ang)localObject1).tWE, ((ang)localObject1).tWD, ((ang)localObject1).uCe, ((ang)localObject1).ugv });
        try
        {
          localObject1 = this.tJZ.toByteArray();
          GMTrace.o(13599745507328L, 101326);
          return (byte[])localObject1;
        }
        catch (IOException localIOException)
        {
          w.e("MicroMsg.ManualReq", "summerauth toProtoBuf :%s", new Object[] { bg.f(localIOException) });
          GMTrace.o(13599745507328L, 101326);
        }
        if (this.tKa)
        {
          i = 3;
          break;
        }
        h.xz();
        i = h.xy().fYL.Ar(46);
        break;
        i = localObject4.length;
        break label443;
      }
      return null;
    }
    
    public final int Bb()
    {
      GMTrace.i(13599879725056L, 101327);
      GMTrace.o(13599879725056L, 101327);
      return 701;
    }
    
    public final String getUri()
    {
      GMTrace.i(13600013942784L, 101328);
      GMTrace.o(13600013942784L, 101328);
      return "/cgi-bin/micromsg-bin/manualauth";
    }
  }
  
  public static final class e
    extends i.g
    implements k.c
  {
    public e()
    {
      GMTrace.i(13586592169984L, 101228);
      GMTrace.o(13586592169984L, 101228);
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(13586726387712L, 101229);
      try
      {
        this.tKc = ((bki)this.tKc.aD(paramArrayOfByte));
        k.a(this, this.tKc.uND);
        this.tKe = 0;
        if ((this.tKc.uND.tST == 0) && ((this.tKc.uVc == null) || (this.tKc.uVc.kAW == 0) || (bg.bq(n.a(this.tKc.uVc.tSa)))))
        {
          w.e("MicroMsg.MMAuth", "retcode 0 but invalid auth sect resp or invalid uin or invalid session");
          this.tKc.uND.tST = -1;
        }
        paramArrayOfByte = this.tKu;
        w.i("MicroMsg.MMAuth", "summerauthkick manual errmsg[%s]", new Object[] { paramArrayOfByte });
        a.eI(paramArrayOfByte);
        int i = this.tKc.uND.tST;
        GMTrace.o(13586726387712L, 101229);
        return i;
      }
      catch (IOException paramArrayOfByte)
      {
        w.e("MicroMsg.MMAuth", "toProtoBuf :%s", new Object[] { bg.f(paramArrayOfByte) });
        this.tKc.uND.tST = -1;
        GMTrace.o(13586726387712L, 101229);
      }
      return -1;
    }
  }
  
  public static abstract class f
    extends k.d
    implements k.b
  {
    public byte[] tKb;
    
    public f()
    {
      GMTrace.i(13603235168256L, 101352);
      GMTrace.o(13603235168256L, 101352);
    }
    
    public final void aY(byte[] paramArrayOfByte)
    {
      GMTrace.i(13603369385984L, 101353);
      if (paramArrayOfByte != null) {}
      for (;;)
      {
        this.tKb = paramArrayOfByte;
        GMTrace.o(13603369385984L, 101353);
        return;
        paramArrayOfByte = new byte[0];
      }
    }
    
    public abstract String getUri();
  }
  
  public static abstract class g
    extends k.e
    implements k.c
  {
    public byte[] hge;
    public String hgh;
    public bki tKc;
    public byte[] tKd;
    public int tKe;
    
    public g()
    {
      GMTrace.i(13602966732800L, 101350);
      this.tKc = new bki();
      this.tKe = 0;
      GMTrace.o(13602966732800L, 101350);
    }
    
    public final void aZ(byte[] paramArrayOfByte)
    {
      GMTrace.i(13603100950528L, 101351);
      if (paramArrayOfByte != null) {}
      for (;;)
      {
        this.hge = paramArrayOfByte;
        GMTrace.o(13603100950528L, 101351);
        return;
        paramArrayOfByte = new byte[0];
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */