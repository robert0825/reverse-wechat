package com.d.a.a;

import android.location.Location;
import android.net.wifi.ScanResult;
import android.os.SystemClock;
import java.lang.reflect.Array;
import java.util.List;

class n
  extends b
{
  private final e aFR = new e();
  public final j aFS = new j();
  private final d aFT = new d();
  private final i aFU;
  public final s aFV;
  private long aFW;
  private long aFX;
  private long aFY;
  private int aFZ;
  private long aGa;
  private boolean aGb;
  private Location aGc;
  private int aGd;
  private float aGe;
  private float aGf;
  private float aGg;
  private int aGh;
  private int aGi;
  private long aGj;
  
  n()
  {
    if (i.aEp == null) {
      i.aEp = new i();
    }
    this.aFU = i.aEp;
    this.aGb = true;
    this.aFV = new s(this);
  }
  
  private boolean a(long paramLong, int paramInt1, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, int paramInt2, float paramFloat2)
  {
    paramLong /= 1000L;
    paramDouble1 = Math.toRadians(paramDouble1);
    paramDouble2 = Math.toRadians(paramDouble2);
    if (this.aGb)
    {
      this.aFS.a(paramLong, paramDouble1, paramDouble2, paramFloat1, this.aFR.aGu, y.aJT);
      this.aGb = false;
    }
    for (boolean bool = true;; bool = false)
    {
      j.a locala = new j.a(paramInt1, paramLong, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramInt2, paramFloat2, 0, 0.0D, 0.0D);
      this.aFS.a(locala);
      if (y.aJN) {
        o.l("filter_input_log_" + y.aJU, locala.toString());
      }
      return bool;
    }
  }
  
  private void nL()
  {
    this.aFU.aEy = false;
    this.aFV.nX();
    this.aFT.reset();
    this.aFR.reset();
    nK();
    this.aFX = 0L;
    this.aFY = SystemClock.elapsedRealtime();
    this.aGe = 0.0F;
    this.aGf = 0.0F;
    this.aGg = 0.0F;
    this.aGh = 0;
    this.aGi = 0;
    this.aFZ = 0;
  }
  
  final k.a a(d.a parama)
  {
    return new k.a(0L);
  }
  
  final void a(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat, long paramLong1, long paramLong2)
  {
    if (paramInt2 <= 0) {
      return;
    }
    Object localObject = this.aFR;
    if (paramInt3 >= 3)
    {
      if (paramLong2 - ((e)localObject).aGt <= 5000L) {
        ((e)localObject).ak(true);
      }
      ((e)localObject).aGt = paramLong2;
    }
    int i = Math.round(paramFloat);
    if (!v.c(paramDouble1, paramDouble2)) {}
    for (localObject = "";; localObject = "&GD=" + paramDouble1 + ',' + paramDouble2 + ',' + paramInt1 + ',' + paramInt3 + ',' + paramInt5 + ',' + paramInt2 + ',' + i + ',' + paramLong1 + ',')
    {
      this.aFT.b((String)localObject, paramLong2);
      if (a(paramLong2, 1, paramDouble1, paramDouble2, paramInt1, paramInt2, paramInt5, paramInt3)) {
        this.aFU.a(paramDouble1, paramDouble2, paramInt2, this.aGe, this.aGf, this.aGg);
      }
      if (d.b(paramLong2, this.aFY)) {
        this.aFV.a(paramDouble1, paramDouble2, paramInt2, paramFloat, this.aGe, this.aGf, this.aGg, paramLong2);
      }
      if (!y.aJN) {
        break;
      }
      o.l("gps_log_" + y.aJU, String.valueOf(paramDouble1) + ',' + paramDouble2 + ',' + paramInt1 + ',' + paramInt2 + ',' + paramInt3 + ',' + paramInt4 + ',' + paramInt5 + ',' + paramFloat + ',' + paramLong1);
      return;
    }
  }
  
  final void a(float paramFloat1, float paramFloat2, int paramInt, float paramFloat3, float paramFloat4, float paramFloat5, long paramLong)
  {
    Object localObject1 = this.aFR;
    if (paramLong - ((e)localObject1).aGt > 5000L) {
      ((e)localObject1).ak(false);
    }
    if (paramLong - this.aFY > 5000L) {
      nL();
    }
    this.aGe = paramFloat1;
    this.aGf = paramFloat2;
    this.aGg = paramFloat4;
    this.aGh = paramInt;
    this.aFY = paramLong;
    boolean bool;
    if (paramFloat5 > 0.0F)
    {
      i = 1;
      this.aGi = i;
      if ((this.aFX != 0L) || (paramLong - this.aGj >= 30000L))
      {
        if (i != 0) {
          break label327;
        }
        bool = true;
        label119:
        if ((!bool) || (!this.aFR.aGu))
        {
          ab.oh().aj(bool);
          k.nJ().aj(bool);
        }
      }
      localObject1 = new double[2];
      localObject2 = this.aFU;
      arrayOfDouble1 = new double[2];
      arrayOfDouble1[0] = paramFloat1;
      arrayOfDouble1[1] = paramFloat2;
      if (!((i)localObject2).aEy) {
        break label385;
      }
      localObject1[0] = ((i)localObject2).aEq;
      localObject1[1] = ((i)localObject2).aEr;
      localObject1[0] += 1.0E-5D * (arrayOfDouble1[1] - ((i)localObject2).aEt) / ((i)localObject2).aEw;
      localObject1[1] += 1.0E-5D * (arrayOfDouble1[0] - ((i)localObject2).aEs) / ((i)localObject2).aEx;
      if (localObject1[0] <= 90.0D) {
        break label333;
      }
      localObject1[0] = (180.0D - localObject1[0]);
      label289:
      if (localObject1[1] <= 180.0D) {
        break label359;
      }
      localObject1[1] -= 360.0D;
    }
    label312:
    label327:
    label333:
    label359:
    label385:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        break label391;
      }
      return;
      i = 0;
      break;
      bool = false;
      break label119;
      if (localObject1[0] >= -90.0D) {
        break label289;
      }
      localObject1[0] = (-180.0D - localObject1[0]);
      break label289;
      if (localObject1[1] >= -180.0D) {
        break label312;
      }
      localObject1[1] += 360.0D;
      break label312;
    }
    label391:
    double d1 = localObject1[0];
    double d2 = localObject1[1];
    localObject1 = this.aFU;
    paramFloat2 = (paramFloat4 - ((i)localObject1).aEu) / 10.0F;
    paramFloat4 = ((i)localObject1).aEv;
    paramFloat1 = 0.0F;
    localObject1 = new Location("S");
    ((Location)localObject1).setLatitude(d1);
    ((Location)localObject1).setLongitude(d2);
    if (this.aGc != null) {
      paramFloat1 = this.aGc.bearingTo((Location)localObject1);
    }
    this.aGc = ((Location)localObject1);
    i = Math.max(0, paramInt - this.aGd);
    this.aGd = paramInt;
    long l = paramLong / 1000L;
    d1 = Math.toRadians(d1);
    d2 = Math.toRadians(d2);
    double d3 = Math.toRadians(paramFloat1);
    localObject1 = new j.a(3, l, d1, d2, 0.0D, paramFloat2 + paramFloat4, 0, paramFloat5, i, paramFloat3, d3);
    this.aFS.a((j.a)localObject1);
    if (y.aJN) {
      o.l("filter_input_log_" + y.aJU, ((j.a)localObject1).toString());
    }
    localObject1 = new double[4];
    l = paramLong / 1000L;
    Object localObject2 = new double[2];
    double[] arrayOfDouble1 = new double[2];
    double[] arrayOfDouble2 = new double[2];
    double[][] arrayOfDouble3 = (double[][])Array.newInstance(Double.TYPE, new int[] { 2, 2 });
    double[][] arrayOfDouble4 = (double[][])Array.newInstance(Double.TYPE, new int[] { 2, 2 });
    j localj = this.aFS;
    d1 = l - localj.aEA.aEC;
    d2 = d1 * d1;
    double[] arrayOfDouble5 = new double[2];
    localObject2[0] = (localj.aEA.aFl[0] + localj.aEA.aFl[2] * d1);
    d3 = localj.aEA.aFl[1];
    localObject2[1] = (d1 * localj.aEA.aFl[3] + d3);
    arrayOfDouble2[0] = localj.aEA.aFl[2];
    arrayOfDouble2[1] = localj.aEA.aFl[3];
    int j;
    if (localj.aEA.aET)
    {
      localObject2[0] -= localj.aEA.aEU[0];
      localObject2[1] -= localj.aEA.aEU[1];
      d1 = Math.sqrt(arrayOfDouble5[0] * arrayOfDouble5[0] + arrayOfDouble5[1] * arrayOfDouble5[1]);
      d1 = d1 * d1 * localj.aEA.aFo;
      arrayOfDouble3[0][0] = (localj.aEA.aFm[0][0] + localj.aEA.aFm[2][2] * d2 + d1);
      arrayOfDouble3[0][1] = (localj.aEA.aFm[0][1] + localj.aEA.aFm[2][3] * d2);
      arrayOfDouble3[1][0] = (localj.aEA.aFm[1][0] + localj.aEA.aFm[3][2] * d2);
      arrayOfDouble5 = arrayOfDouble3[1];
      d3 = localj.aEA.aFm[1][1];
      arrayOfDouble5[1] = (d1 + (d2 * localj.aEA.aFm[3][3] + d3));
      arrayOfDouble4[0][0] = localj.aEA.aFm[2][2];
      arrayOfDouble4[0][1] = localj.aEA.aFm[2][3];
      arrayOfDouble4[1][0] = localj.aEA.aFm[3][2];
      arrayOfDouble4[1][1] = localj.aEA.aFm[3][3];
      localj.a(1, (double[])localObject2, arrayOfDouble1);
      localObject1[0] = Math.toDegrees(arrayOfDouble1[0]);
      localObject1[1] = Math.toDegrees(arrayOfDouble1[1]);
      localObject1[2] = Math.sqrt((arrayOfDouble3[0][0] + arrayOfDouble3[1][1]) / 2.0D);
      d1 = arrayOfDouble2[0];
      d2 = arrayOfDouble2[0];
      d3 = arrayOfDouble2[1];
      localObject1[3] = Math.sqrt(d1 * d2 + arrayOfDouble2[1] * d3);
      if (y.aJN) {
        o.l("filter_output_log_" + y.aJU, String.valueOf(l) + ',' + localObject1[0] + ',' + localObject1[1] + ',' + localObject1[2] + ',' + localObject1[3]);
      }
      d1 = localObject1[0];
      d2 = localObject1[1];
      paramInt = Double.valueOf(localObject1[2]).intValue();
      i = Double.valueOf(localObject1[3]).intValue();
      j = this.aFZ;
      if (v.c(d1, d2)) {
        break label1391;
      }
    }
    label1391:
    for (localObject1 = "";; localObject1 = "&SD=" + d1 + ',' + d2 + ',' + 0 + ',' + paramInt + ',' + j + ',' + 0 + ',' + i + ',' + 0 + ',' + 0 + ',' + 0)
    {
      this.aFT.c((String)localObject1, paramLong);
      c(new a(d1, d2, paramInt, this.aFZ, this.aGa));
      return;
      d1 = 0.0D;
      break;
    }
  }
  
  void a(int paramInt, String paramString, long paramLong1, long paramLong2)
  {
    c(new b(paramInt, paramString, (byte)0));
    if ((paramInt == -4) || (paramInt == -5)) {
      stop();
    }
  }
  
  /* Error */
  void a(android.os.Handler paramHandler, d.a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_2
    //   3: instanceof 12
    //   6: ifeq +44 -> 50
    //   9: aload_2
    //   10: checkcast 12	com/d/a/a/n$c
    //   13: astore_2
    //   14: aload_0
    //   15: aload_2
    //   16: getfield 415	com/d/a/a/n$c:aGo	J
    //   19: putfield 417	com/d/a/a/n:aFW	J
    //   22: aload_0
    //   23: invokespecial 248	com/d/a/a/n:nL	()V
    //   26: aload_0
    //   27: getfield 82	com/d/a/a/n:aFV	Lcom/d/a/a/s;
    //   30: aload_1
    //   31: putfield 421	com/d/a/a/s:aHh	Landroid/os/Handler;
    //   34: aload_0
    //   35: invokestatic 162	android/os/SystemClock:elapsedRealtime	()J
    //   38: putfield 250	com/d/a/a/n:aGj	J
    //   41: aload_0
    //   42: aload_1
    //   43: aload_2
    //   44: invokespecial 423	com/d/a/a/b:a	(Landroid/os/Handler;Lcom/d/a/a/d$a;)V
    //   47: aload_0
    //   48: monitorexit
    //   49: return
    //   50: aload_2
    //   51: ifnull +23 -> 74
    //   54: aload_2
    //   55: getfield 428	com/d/a/a/d$a:aDL	J
    //   58: lstore_3
    //   59: new 12	com/d/a/a/n$c
    //   62: dup
    //   63: lload_3
    //   64: ldc2_w 429
    //   67: invokespecial 433	com/d/a/a/n$c:<init>	(JJ)V
    //   70: astore_2
    //   71: goto -57 -> 14
    //   74: ldc2_w 187
    //   77: lstore_3
    //   78: goto -19 -> 59
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_1
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	n
    //   0	86	1	paramHandler	android.os.Handler
    //   0	86	2	parama	d.a
    //   58	20	3	l	long
    // Exception table:
    //   from	to	target	type
    //   2	14	81	finally
    //   14	47	81	finally
    //   54	59	81	finally
    //   59	71	81	finally
  }
  
  void a(x paramx, long paramLong1, long paramLong2)
  {
    this.aFX = paramx.aGW;
    this.aFZ = paramx.level;
    this.aGa = paramx.aGm;
    if ((paramx.aJy.equals("W")) && (a(paramLong2, 2, paramx.latitude, paramx.longitude, paramx.altitude, paramx.aFG, paramx.aJD, paramx.aFH))) {
      this.aFU.a(paramx.latitude, paramx.longitude, paramx.aFG, this.aGe, this.aGf, this.aGg);
    }
    if (!u.ob().aHV) {
      c(new a(paramx.latitude, paramx.longitude, Float.valueOf(paramx.aFG).intValue(), this.aFZ, this.aGa));
    }
  }
  
  final void a(List<ScanResult> paramList, long paramLong1, long paramLong2)
  {
    paramLong1 = aa.s(paramLong1);
    boolean bool;
    Object localObject1;
    Object localObject2;
    r localr;
    int i;
    long l1;
    if ((this.aFX != 0L) && (paramLong2 - this.aFX < this.aFW))
    {
      bool = false;
      localObject1 = v.a(paramList, bool);
      localObject2 = this.aFT.a((String)localObject1, paramLong2, bool);
      if (!bool) {
        break label306;
      }
      localr = r.nN();
      i = this.aGi;
      if (localObject2 != null)
      {
        if (!localr.aDI) {
          break label265;
        }
        if (!localr.nP()) {
          break label260;
        }
        l1 = System.currentTimeMillis();
        long l2 = SystemClock.elapsedRealtime();
        if (localr.aGI != null) {
          localr.aGI.execute(new r.e(localr, (String)localObject2, l1, l2, i, true));
        }
      }
      label136:
      if (d.b(paramLong2, this.aFY)) {
        if (bool) {
          break label324;
        }
      }
    }
    for (;;)
    {
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = v.a(paramList, false);
      }
      paramList = v.a((String)localObject2, paramLong1, "2");
      localObject1 = this.aFV;
      float f1 = this.aGe;
      float f2 = this.aGf;
      float f3 = this.aGg;
      float f4 = this.aGh;
      i = this.aFZ;
      if (((s)localObject1).aHc != 0.0F) {
        z.b(null).execute(new s.a((s)localObject1, f1, f2, f3, f4, i, paramList));
      }
      return;
      bool = true;
      break;
      label260:
      localr.nO();
      label265:
      l1 = aa.s(System.currentTimeMillis());
      if (localr.aGI == null) {
        break label136;
      }
      localr.aGI.execute(new r.c(localr, (String)localObject2, l1, 0));
      break label136;
      label306:
      r.nN().aK(v.a((String)localObject2, paramLong1, "0"));
      break label136;
      label324:
      localObject1 = null;
    }
  }
  
  public final void nK()
  {
    this.aGb = true;
    this.aGc = null;
    this.aGd = 0;
  }
  
  final void stop()
  {
    try
    {
      this.aFV.nV();
      super.stop();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  static final class a
    extends p
  {
    final int aGk;
    final int aGl;
    final long aGm;
    final double lat;
    final double lng;
    
    a(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, long paramLong)
    {
      super();
      this.lat = paramDouble1;
      this.lng = paramDouble2;
      this.aGk = paramInt1;
      this.aGl = paramInt2;
      this.aGm = paramLong;
    }
  }
  
  static final class b
    extends p
  {
    final boolean aGn;
    final int code;
    final String message;
    
    private b(int paramInt, String paramString)
    {
      super();
      this.code = paramInt;
      this.message = paramString;
      this.aGn = false;
    }
    
    b(int paramInt, String paramString, byte paramByte)
    {
      this(paramInt, paramString);
    }
  }
  
  static final class c
    extends d.a
  {
    final long aGo;
    
    c(long paramLong1, long paramLong2)
    {
      super();
      this.aGo = paramLong2;
    }
  }
  
  private static final class d
  {
    private String aGp;
    private long aGq;
    private String aGr;
    private long aGs;
    
    public static boolean b(long paramLong1, long paramLong2)
    {
      return Math.abs(paramLong1 - paramLong2) <= 10000L;
    }
    
    public final String a(String paramString, long paramLong, boolean paramBoolean)
    {
      String str;
      if (paramBoolean) {
        str = paramString;
      }
      for (;;)
      {
        try
        {
          if (this.aGp != null)
          {
            str = paramString;
            if (b(paramLong, this.aGq))
            {
              str = paramString + this.aGp;
              this.aGp = null;
            }
          }
          paramString = str;
          if (this.aGr != null)
          {
            paramString = str;
            if (b(paramLong, this.aGs))
            {
              paramString = str + this.aGr;
              this.aGr = null;
            }
          }
          return paramString;
        }
        finally {}
        str = paramString;
        if (this.aGp != null)
        {
          str = paramString;
          if (b(paramLong, this.aGq))
          {
            str = paramString + v.aQ(this.aGp);
            this.aGp = null;
          }
        }
        paramString = str;
        if (this.aGr != null)
        {
          paramString = str;
          if (b(paramLong, this.aGs))
          {
            paramString = str + v.aP(this.aGr);
            this.aGr = null;
          }
        }
      }
    }
    
    public final void b(String paramString, long paramLong)
    {
      try
      {
        this.aGp = paramString;
        this.aGq = paramLong;
        return;
      }
      finally
      {
        paramString = finally;
        throw paramString;
      }
    }
    
    public final void c(String paramString, long paramLong)
    {
      try
      {
        this.aGr = paramString;
        this.aGs = paramLong;
        return;
      }
      finally
      {
        paramString = finally;
        throw paramString;
      }
    }
    
    public final void reset()
    {
      try
      {
        this.aGp = null;
        this.aGr = null;
        this.aGq = 0L;
        this.aGs = 0L;
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
  }
  
  private final class e
  {
    long aGt;
    public boolean aGu = y.aJS;
    
    public e() {}
    
    final void ak(boolean paramBoolean)
    {
      StringBuilder localStringBuilder;
      if ((this.aGu ^ paramBoolean))
      {
        if (!this.aGu) {
          break label146;
        }
        paramBoolean = false;
        this.aGu = paramBoolean;
        n.this.aFV.nV();
        n.this.aFV.nX();
        n.this.aFS.ak(this.aGu);
        n.this.nK();
        if (y.aJN)
        {
          localStringBuilder = new StringBuilder("vehicle mode: ");
          if (!this.aGu) {
            break label151;
          }
        }
      }
      label146:
      label151:
      for (String str = "enable";; str = "disable")
      {
        str = str;
        o.l("filter_input_log_" + y.aJU, str);
        o.l("filter_output_log_" + y.aJU, str);
        return;
        paramBoolean = true;
        break;
      }
    }
    
    public final void reset()
    {
      this.aGt = 0L;
      this.aGu = y.aJS;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */