package oicq.wlogin_sdk.request;

import java.lang.reflect.Array;
import oicq.wlogin_sdk.a.a;
import oicq.wlogin_sdk.a.ab;
import oicq.wlogin_sdk.a.ac;
import oicq.wlogin_sdk.a.ad;
import oicq.wlogin_sdk.a.af;
import oicq.wlogin_sdk.a.ah;
import oicq.wlogin_sdk.a.ai;
import oicq.wlogin_sdk.a.ak;
import oicq.wlogin_sdk.a.al;
import oicq.wlogin_sdk.a.am;
import oicq.wlogin_sdk.a.ap;
import oicq.wlogin_sdk.a.e;
import oicq.wlogin_sdk.a.f;
import oicq.wlogin_sdk.a.g;
import oicq.wlogin_sdk.a.h;
import oicq.wlogin_sdk.a.j;
import oicq.wlogin_sdk.a.l;
import oicq.wlogin_sdk.a.m;
import oicq.wlogin_sdk.a.n;
import oicq.wlogin_sdk.a.o;
import oicq.wlogin_sdk.a.p;
import oicq.wlogin_sdk.a.q;
import oicq.wlogin_sdk.a.s;
import oicq.wlogin_sdk.a.t;
import oicq.wlogin_sdk.a.u;
import oicq.wlogin_sdk.a.v;
import oicq.wlogin_sdk.a.w;
import oicq.wlogin_sdk.a.x;
import oicq.wlogin_sdk.a.z;
import oicq.wlogin_sdk.tools.ErrMsg;
import oicq.wlogin_sdk.tools.util;

public class d
{
  protected static int yrA = 0;
  protected int yrB = 0;
  protected int yrC = 0;
  protected int yrD = 0;
  protected int yrE = 0;
  protected int yrF = 0;
  byte yrG;
  protected i yrH;
  int yrs = 4096;
  int yrt = 0;
  int yru = 27;
  int yrv = 0;
  public int yrw = 15;
  protected int yrx = 0;
  protected byte[] yry = new byte[this.yrs];
  protected int yrz = 8001;
  
  private int a(s params)
  {
    long l3 = 4294967295L;
    o localo = new o();
    p localp = new p();
    l locall = new l();
    q localq = new q();
    e locale = new e();
    t localt = new t();
    oicq.wlogin_sdk.a.d locald = new oicq.wlogin_sdk.a.d();
    m localm = new m();
    u localu = new u();
    Object localObject10 = new w();
    Object localObject9 = new x();
    j localj = new j();
    Object localObject6 = new h();
    n localn = new n();
    Object localObject8 = new z();
    Object localObject1 = new v();
    Object localObject2 = new ad();
    Object localObject3 = new ab();
    Object localObject4 = new af();
    Object localObject5 = new ap();
    ak localak = new ak();
    Object localObject7 = new al();
    am localam = new am();
    byte[] arrayOfByte2 = null;
    byte[] arrayOfByte3 = null;
    byte[] arrayOfByte4 = null;
    byte[] arrayOfByte5 = null;
    byte[] arrayOfByte6 = null;
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte7 = null;
    byte[] arrayOfByte8 = null;
    ac localac = new ac();
    byte[] arrayOfByte9 = params.cth();
    int i = arrayOfByte9.length;
    localo.n(arrayOfByte9, 2, i);
    localp.n(arrayOfByte9, 2, i);
    locall.n(arrayOfByte9, 2, i);
    localq.n(arrayOfByte9, 2, i);
    int j = localt.n(arrayOfByte9, 2, i);
    if (j < 0) {
      return j;
    }
    if (locale.n(arrayOfByte9, 2, i) >= 0) {
      arrayOfByte1 = locale.cth();
    }
    if (localj.n(arrayOfByte9, 2, i) >= 0) {
      util.a(this.yrH._context, localj.cth());
    }
    if (locald.n(arrayOfByte9, 2, i) >= 0) {
      arrayOfByte2 = locald.cth();
    }
    if (localm.n(arrayOfByte9, 2, i) >= 0) {
      arrayOfByte3 = localm.cth();
    }
    if (localu.n(arrayOfByte9, 2, i) >= 0) {
      arrayOfByte4 = localu.cth();
    }
    if (((a)localObject10).n(arrayOfByte9, 2, i) >= 0) {
      arrayOfByte5 = ((a)localObject10).cth();
    }
    if (((a)localObject9).n(arrayOfByte9, 2, i) >= 0) {
      arrayOfByte6 = ((a)localObject9).cth();
    }
    if (((a)localObject8).n(arrayOfByte9, 2, i) >= 0)
    {
      arrayOfByte7 = new byte[((z)localObject8).ysM];
      System.arraycopy(((z)localObject8).yry, ((z)localObject8).ysn + 2, arrayOfByte7, 0, arrayOfByte7.length);
      arrayOfByte8 = new byte[((z)localObject8).ysN];
      System.arraycopy(((z)localObject8).yry, ((z)localObject8).ysn + 2 + ((z)localObject8).ysM + 2, arrayOfByte8, 0, arrayOfByte8.length);
    }
    label636:
    long l1;
    if (((a)localObject7).n(arrayOfByte9, 2, i) >= 0)
    {
      localObject10 = new h();
      localObject9 = new n();
      localObject8 = new am();
      params = new ah();
      localObject7 = ((a)localObject7).cth();
      j = localObject7.length;
      if (((a)localObject10).n((byte[])localObject7, 2, j) < 0)
      {
        params = null;
        if ((params == null) || (params.length <= 0)) {
          break label1362;
        }
        this.yrH.ysk = ((byte[])params.clone());
        util.fL("fast data:", util.bZ(params));
      }
    }
    else
    {
      params = (byte[][])Array.newInstance(Byte.TYPE, new int[] { 7, 0 });
      if (localac.n(arrayOfByte9, 2, i) >= 0) {
        params[0] = localac.cth();
      }
      j = localn.n(arrayOfByte9, 2, i);
      if ((((a)localObject6).n(arrayOfByte9, 2, i) >= 0) && (j >= 0))
      {
        this.yrH.yrJ = localn.cth();
        this.yrH.ysi = bO(((a)localObject6).cth());
        params[1] = ((byte[])this.yrH.ysi.clone());
      }
      if (((a)localObject3).n(arrayOfByte9, 2, i) >= 0)
      {
        localObject6 = new byte[((ab)localObject3).ysP];
        System.arraycopy(((ab)localObject3).yry, ((ab)localObject3).ysn + 2, localObject6, 0, localObject6.length);
        params[2] = localObject6;
      }
      if (((a)localObject4).n(arrayOfByte9, 2, i) >= 0) {
        params[3] = ((a)localObject4).cth();
      }
      if (((a)localObject5).n(arrayOfByte9, 2, i) >= 0) {
        params[4] = ((a)localObject5).cth();
      }
      if (localak.n(arrayOfByte9, 2, i) >= 0) {
        params[5] = localak.cth();
      }
      if (localam.n(arrayOfByte9, 2, i) >= 0) {
        params[6] = localam.cth();
      }
      if (((a)localObject1).n(arrayOfByte9, 2, i) < 0) {
        break label1398;
      }
      if (this.yrH.yrQ != -1L) {
        break label1375;
      }
      l1 = util.K(((v)localObject1).yry, ((v)localObject1).ysn);
      label918:
      l3 = 0xFFFFFFFF & util.K(((v)localObject1).yry, ((v)localObject1).ysn + 4);
    }
    for (;;)
    {
      if ((((a)localObject2).n(arrayOfByte9, 2, i) >= 0) && (((ad)localObject2).ctk() != 0)) {}
      for (long l2 = ((ad)localObject2).ctk();; l2 = 2160000L)
      {
        if (l2 < l1) {
          l2 = l1;
        }
        for (;;)
        {
          localObject1 = this.yrH;
          long l4 = this.yrH._uin;
          long l5 = this.yrH.yrO;
          long l6 = i.ctg();
          long l7 = i.ctg();
          long l8 = i.ctg();
          localObject2 = new byte[2];
          System.arraycopy(localt.yry, localt.ysn, localObject2, 0, 2);
          localObject3 = new byte[1];
          System.arraycopy(localt.yry, localt.ysn + 2, localObject3, 0, 1);
          localObject4 = new byte[1];
          System.arraycopy(localt.yry, localt.ysn + 2 + 1, localObject4, 0, 1);
          localObject5 = new byte[localt.ysK];
          System.arraycopy(localt.yry, localt.ysn + 2 + 1 + 1 + 1, localObject5, 0, localt.ysK);
          ((i)localObject1).a(l4, l5, l3, l6, l1 + l7, l2 + l8, (byte[])localObject2, (byte[])localObject3, (byte[])localObject4, (byte[])localObject5, locall.cth(), localo.cth(), localq.cth(), localp.cth(), arrayOfByte1, arrayOfByte3, arrayOfByte2, arrayOfByte4, arrayOfByte5, arrayOfByte6, arrayOfByte7, arrayOfByte8, params);
          return 0;
          if (((a)localObject9).n((byte[])localObject7, 2, j) < 0)
          {
            params = null;
            break;
          }
          if (((a)localObject8).n((byte[])localObject7, 2, j) < 0)
          {
            params = null;
            break;
          }
          localObject7 = ((a)localObject10).cte();
          localObject9 = ((a)localObject9).cte();
          localObject8 = ((a)localObject8).cte();
          localObject10 = params.bV(this.yrH.yrS);
          params = new byte[localObject7.length + 3 + localObject9.length + localObject8.length + localObject10.length];
          params[0] = 64;
          util.p(params, 1, 4);
          System.arraycopy(localObject7, 0, params, 3, localObject7.length);
          j = localObject7.length + 3;
          System.arraycopy(localObject9, 0, params, j, localObject9.length);
          j = localObject9.length + j;
          System.arraycopy(localObject8, 0, params, j, localObject8.length);
          System.arraycopy(localObject10, 0, params, j + localObject8.length, localObject10.length);
          break;
          label1362:
          this.yrH.ysk = new byte[0];
          break label636;
          label1375:
          l1 = this.yrH.yrQ;
          break label918;
        }
      }
      label1398:
      l1 = 3600L;
    }
  }
  
  public final int E(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 64534;
    int j = 0;
    if (paramInt <= this.yrw + 2) {
      i = 64527;
    }
    for (;;)
    {
      return i;
      this.yrx = (paramInt - this.yrw - 2);
      if (paramInt > this.yrs)
      {
        this.yrs = (paramInt + 128);
        this.yry = new byte[this.yrs];
      }
      this.yrt = paramInt;
      System.arraycopy(paramArrayOfByte, 0, this.yry, 0, paramInt);
      paramArrayOfByte = this.yry;
      paramInt = this.yrw + 1;
      paramArrayOfByte = oicq.wlogin_sdk.tools.d.decrypt(paramArrayOfByte, paramInt, this.yrx, this.yrH.yrL);
      if (paramArrayOfByte == null) {}
      for (paramInt = 64534; paramInt >= 0; paramInt = j)
      {
        return l(this.yry, this.yrw + 1, this.yrx);
        this.yrx = paramArrayOfByte.length;
        if (paramArrayOfByte.length + this.yrw + 2 > this.yrs)
        {
          this.yrs = (paramArrayOfByte.length + this.yrw + 2);
          byte[] arrayOfByte = new byte[this.yrs];
          System.arraycopy(this.yry, 0, arrayOfByte, 0, this.yrt);
          this.yry = arrayOfByte;
        }
        this.yrt = 0;
        System.arraycopy(paramArrayOfByte, 0, this.yry, paramInt, paramArrayOfByte.length);
        paramInt = this.yrt;
        int k = this.yrw;
        this.yrt = (paramArrayOfByte.length + (k + 2) + paramInt);
      }
    }
  }
  
  public final int F(byte[] paramArrayOfByte, int paramInt)
  {
    this.yrG = paramArrayOfByte[paramInt];
    return paramArrayOfByte[paramInt] & 0xFF;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4, int paramInt5, int paramInt6, int paramInt7, byte[] paramArrayOfByte)
  {
    paramInt3 = paramArrayOfByte.length;
    int i = yrA + 1;
    yrA = i;
    this.yrt = 0;
    util.o(this.yry, this.yrt, 2);
    this.yrt += 1;
    util.p(this.yry, this.yrt, this.yru + 2 + paramInt3);
    this.yrt += 2;
    util.p(this.yry, this.yrt, paramInt1);
    this.yrt += 2;
    util.p(this.yry, this.yrt, paramInt2);
    this.yrt += 2;
    util.p(this.yry, this.yrt, i);
    this.yrt += 2;
    util.q(this.yry, this.yrt, (int)paramLong);
    this.yrt += 4;
    util.o(this.yry, this.yrt, 3);
    this.yrt += 1;
    util.o(this.yry, this.yrt, 0);
    this.yrt += 1;
    util.o(this.yry, this.yrt, paramInt4);
    this.yrt += 1;
    util.q(this.yry, this.yrt, paramInt5);
    this.yrt += 4;
    util.q(this.yry, this.yrt, paramInt6);
    this.yrt += 4;
    util.q(this.yry, this.yrt, paramInt7);
    this.yrt += 4;
    if (this.yrt + paramInt3 + 1 > this.yrs)
    {
      this.yrs = (this.yrt + paramInt3 + 1 + 128);
      byte[] arrayOfByte = new byte[this.yrs];
      System.arraycopy(this.yry, 0, arrayOfByte, 0, this.yrt);
      this.yry = arrayOfByte;
    }
    System.arraycopy(paramArrayOfByte, 0, this.yry, this.yrt, paramInt3);
    this.yrt = (paramInt3 + this.yrt);
    util.o(this.yry, this.yrt, 3);
    this.yrt += 1;
  }
  
  public final byte[] bO(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    byte[] arrayOfByte = new byte[paramArrayOfByte.length + this.yrH.yrJ.length];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    System.arraycopy(this.yrH.yrJ, 0, arrayOfByte, paramArrayOfByte.length, this.yrH.yrJ.length);
    return arrayOfByte;
  }
  
  public final byte[] bP(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 16)) {
      return null;
    }
    paramArrayOfByte = (byte[])paramArrayOfByte.clone();
    int i = paramArrayOfByte.length - 16;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i);
    this.yrH.yrJ = new byte[16];
    System.arraycopy(paramArrayOfByte, i, this.yrH.yrJ, 0, 16);
    return arrayOfByte;
  }
  
  public final byte[] cte()
  {
    byte[] arrayOfByte = new byte[this.yrt];
    System.arraycopy(this.yry, 0, arrayOfByte, 0, this.yrt);
    return arrayOfByte;
  }
  
  public final void ctf()
  {
    this.yrH.ysh.ctl();
  }
  
  final byte[] j(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length + 4];
    util.p(arrayOfByte, 0, paramInt1);
    util.p(arrayOfByte, 2, paramInt2);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 4, paramArrayOfByte.length);
    paramArrayOfByte = oicq.wlogin_sdk.tools.d.b(arrayOfByte, arrayOfByte.length, this.yrH.yrL);
    arrayOfByte = new byte[paramArrayOfByte.length + this.yrH.yrL.length];
    System.arraycopy(this.yrH.yrL, 0, arrayOfByte, 0, this.yrH.yrL.length);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, this.yrH.yrL.length, paramArrayOfByte.length);
    return arrayOfByte;
  }
  
  public final void k(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    ai localai = new ai();
    if (localai.n(paramArrayOfByte, paramInt1, paramInt2) >= 0)
    {
      paramArrayOfByte = this.yrH.ysh;
      byte[] arrayOfByte = new byte[localai.ysW];
      System.arraycopy(localai.yry, localai.ysn + 6, arrayOfByte, 0, localai.ysW);
      paramArrayOfByte.title = new String(arrayOfByte);
      paramArrayOfByte = this.yrH.ysh;
      arrayOfByte = new byte[localai.ysX];
      System.arraycopy(localai.yry, localai.ysn + 8 + localai.ysW, arrayOfByte, 0, localai.ysX);
      paramArrayOfByte.message = new String(arrayOfByte);
      paramArrayOfByte = this.yrH.ysh;
      arrayOfByte = new byte[localai.ysY];
      System.arraycopy(localai.yry, localai.ysn + 12 + localai.ysW + localai.ysX, arrayOfByte, 0, localai.ysY);
      paramArrayOfByte.ytf = new String(arrayOfByte);
      return;
    }
    this.yrH.ysh.ctl();
  }
  
  public int l(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    f localf = new f();
    g localg = new g();
    s locals = new s();
    int i;
    if ((this.yrE == 2064) && (this.yrF == 9)) {
      i = 0;
    }
    while (paramInt2 < 5)
    {
      return 64527;
      if ((this.yrE == 2064) && (this.yrF == 10)) {
        i = 1;
      } else if ((this.yrE == 2064) && (this.yrF == 2)) {
        i = 2;
      } else if ((this.yrE == 2064) && (this.yrF == 13)) {
        i = 4;
      } else {
        return 64524;
      }
    }
    int j = F(paramArrayOfByte, paramInt1 + 2);
    ctf();
    int k = paramInt1 + 5;
    switch (j)
    {
    default: 
      k(paramArrayOfByte, k, this.yrt - k - 1);
      return j;
    case 0: 
      if (i == 1) {
        if (this.yrH.yrK == null) {
          return 64530;
        }
      }
      for (paramInt1 = locals.b(paramArrayOfByte, k, this.yrt - k - 1, this.yrH.yrK); paramInt1 < 0; paramInt1 = locals.b(paramArrayOfByte, k, this.yrt - k - 1, this.yrH.yrJ))
      {
        util.Zk("119 can not decrypt, ret=" + paramInt1);
        return paramInt1;
      }
      paramInt1 = a(locals);
      if (paramInt1 < 0)
      {
        util.Zk("parse 119 failed, ret=" + paramInt1);
        return paramInt1;
      }
      return 0;
    case 1: 
      k(paramArrayOfByte, k, this.yrt - k - 1);
      return j;
    }
    paramInt2 = localf.n(paramArrayOfByte, k, this.yrt - k - 1);
    paramInt1 = paramInt2;
    if (paramInt2 >= 0)
    {
      this.yrH.yrM = localf;
      paramInt2 = localg.n(paramArrayOfByte, k, this.yrt - k - 1);
      paramInt1 = paramInt2;
      if (paramInt2 >= 0)
      {
        this.yrH.yrN = localg;
        return j;
      }
    }
    return paramInt1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\request\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */