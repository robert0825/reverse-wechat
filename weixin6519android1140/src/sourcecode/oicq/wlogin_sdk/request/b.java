package oicq.wlogin_sdk.request;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import java.security.SecureRandom;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.tools.util;

public final class b
{
  private Context mContext = null;
  public i yrd = new i();
  private j yre = new j(this.yrd);
  private f yrf = new f(this.yrd);
  private g yrg = new g(this.yrd);
  private h yrh = new h(this.yrd);
  private e yri = new e(this.yrd);
  public d yrj = null;
  private int yrk = 66560;
  private int yrl = 1404;
  
  public b(Context paramContext, int paramInt)
  {
    this.mContext = paramContext;
    i locali = this.yrd;
    locali._context = paramContext;
    locali.yrR = paramInt;
    locali.ysl = new c(paramContext);
    paramContext = new byte[16];
    locali.yrI.nextBytes(paramContext);
    System.arraycopy(paramContext, 0, locali.yrL, 0, 16);
    ctc();
  }
  
  private int ctc()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = util.iB(this.mContext);
        if ((localObject1 == null) || (localObject1.length <= 0))
        {
          localObject1 = util.iu(this.mContext);
          if ((localObject1 == null) || (localObject1.length <= 0))
          {
            localObject1 = new String("%4;7t>;28<fc.5*6").getBytes();
            this.yrd.yse = 0;
            util.b(this.mContext, (byte[])localObject1);
            this.yrd.ysd = 1;
            this.yrd.ysf = 1;
            this.yrd.yrS = new byte[localObject1.length];
            System.arraycopy(localObject1, 0, this.yrd.yrS, 0, localObject1.length);
            Object localObject3 = new byte[localObject1.length + 1];
            localObject3[0] = 35;
            System.arraycopy(localObject1, 0, localObject3, 1, localObject1.length);
            this.yrd.yrJ = util.bY((byte[])localObject3);
            i.yrT = (byte[])this.yrd.yrS.clone();
            this.yrd.yrU = util.iv(this.mContext);
            i = util.ix(this.mContext);
            this.yrd.yrV = util.iw(this.mContext);
            if (i != this.yrd.yrV)
            {
              util.iy(this.mContext);
              util.ap(this.mContext, this.yrd.yrV);
            }
            this.yrd.yrX = util.iz(this.mContext).getBytes();
            this.yrd.ysg = util.iA(this.mContext);
            this.yrd.yrW = util.iC(this.mContext);
            this.yrd.yrZ = util.bR(this.mContext, new String(this.yrd.yrW));
            this.yrd.ysa = util.bS(this.mContext, new String(this.yrd.yrW));
            localObject1 = Build.MODEL;
            if (localObject1 != null) {
              break label475;
            }
            this.yrd.ysb = new byte[0];
            if ((util.isFileExist("/system/bin/su")) || (util.isFileExist("/system/xbin/su")) || (util.isFileExist("/sbin/su"))) {
              break label489;
            }
            i = 0;
            localObject1 = this.yrd;
            if (i == 0) {
              break label494;
            }
            i = 1;
            ((i)localObject1).ysc = i;
            localObject3 = Build.VERSION.RELEASE;
            localObject1 = localObject3;
            if (localObject3 == null) {
              localObject1 = "";
            }
            util.Zk("WtloginHelper init ok: android version:" + (String)localObject1 + " release time:" + util.cts());
            return 0;
          }
          this.yrd.yse = 1;
          continue;
        }
        this.yrd.yse = 1;
      }
      finally {}
      this.yrd.ysd = 0;
      this.yrd.ysf = 0;
      continue;
      label475:
      this.yrd.ysb = ((String)localObject2).getBytes();
      continue;
      label489:
      int i = 1;
      continue;
      label494:
      i = 0;
    }
  }
  
  public final byte[] a(long paramLong, a parama, String paramString)
  {
    util.Zk("wtlogin login with GetStWithPasswd:user:" + paramLong + " appid:522017402 dwSigMap:8256" + " ...");
    String str = paramString;
    if (paramString.length() > 16) {
      str = paramString.substring(0, 16);
    }
    try
    {
      switch (ctd()[parama.ordinal()])
      {
      case 1: 
        return null;
      }
    }
    finally {}
    if ((str == null) || (str.length() == 0))
    {
      util.Zk("USER_WITH_PWD userPasswd null");
      return null;
    }
    parama = oicq.wlogin_sdk.tools.c.Zi(str);
    for (int i = 0;; i = 1)
    {
      this.yrd.yrV = util.iw(this.mContext);
      this.yrd.yrX = util.iz(this.mContext).getBytes();
      this.yrd._uin = paramLong;
      this.yrd.yrO = 522017402L;
      this.yrd.yrP = 8256;
      this.yrd.yrM = new oicq.wlogin_sdk.a.f();
      this.yrj = this.yre;
      if (i != 0) {}
      for (parama = this.yre.a(522017402L, paramLong, this.yrd.ysj, parama, this.yrl, this.yrk, 8256, this.yrd.ysg);; parama = this.yre.a(522017402L, paramLong, this.yrd.ysj, paramString, parama, this.yrl, this.yrk, 8256, this.yrd.ysg))
      {
        util.Zk("wtlogin login with GetStWithPasswd:user:" + paramLong + " appid:522017402 dwSigMap:8256" + " end");
        return parama;
        if ((str == null) || (str.length() == 0))
        {
          util.Zk("USER_WITH_MD5 userPasswd null");
          return null;
        }
        try
        {
          parama = (byte[])str.getBytes("ISO-8859-1").clone();
          i = 0;
        }
        catch (Exception parama)
        {
          return null;
        }
        parama = this.yrd.D(paramLong, 522017402L);
        if ((parama == null) || (parama._en_A1 == null) || (parama._en_A1.length <= 0)) {
          util.Zk("userAccount:" + paramLong + " appid:522017402" + " GetA1ByAccount return: null");
        }
        for (parama = null; (parama == null) || (parama.length < 16); parama = (byte[])parama._en_A1.clone())
        {
          util.Zk("USER_WITH_A1 tmp_pwd null");
          return null;
          util.Zk("userAccount:" + paramLong + " appid:522017402" + " GetA1ByAccount return: not null");
        }
        paramString = new byte[4];
        util.c(paramString, 0, i.ctg());
      }
      break;
    }
  }
  
  public final byte[] f(long paramLong, byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return null;
    }
    util.Zk("user:" + paramLong + " CheckPicture ...");
    try
    {
      this.yrj = this.yrg;
      paramArrayOfByte = this.yrg.bQ(paramArrayOfByte);
      util.Zk("user:" + paramLong + " CheckPicture end");
      return paramArrayOfByte;
    }
    finally {}
  }
  
  /* Error */
  public final byte[] fE(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 38	oicq/wlogin_sdk/request/b:yrd	Loicq/wlogin_sdk/request/i;
    //   6: getfield 403	oicq/wlogin_sdk/request/i:yrN	Loicq/wlogin_sdk/a/g;
    //   9: astore_3
    //   10: aload_3
    //   11: getfield 408	oicq/wlogin_sdk/a/g:ysy	I
    //   14: newarray <illegal type>
    //   16: astore 4
    //   18: aload_3
    //   19: getfield 408	oicq/wlogin_sdk/a/g:ysy	I
    //   22: ifgt +40 -> 62
    //   25: aload_0
    //   26: monitorexit
    //   27: new 252	java/lang/StringBuilder
    //   30: dup
    //   31: ldc_w 390
    //   34: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   37: lload_1
    //   38: invokevirtual 302	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   41: ldc_w 410
    //   44: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: aload 4
    //   49: arraylength
    //   50: invokevirtual 413	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   53: invokevirtual 268	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   56: invokestatic 271	oicq/wlogin_sdk/tools/util:Zk	(Ljava/lang/String;)V
    //   59: aload 4
    //   61: areturn
    //   62: aload_3
    //   63: getfield 416	oicq/wlogin_sdk/a/g:yry	[B
    //   66: aload_3
    //   67: getfield 419	oicq/wlogin_sdk/a/g:ysA	I
    //   70: aload 4
    //   72: iconst_0
    //   73: aload_3
    //   74: getfield 408	oicq/wlogin_sdk/a/g:ysy	I
    //   77: invokestatic 109	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   80: goto -55 -> 25
    //   83: astore_3
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_3
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	b
    //   0	88	1	paramLong	long
    //   9	65	3	localg	oicq.wlogin_sdk.a.g
    //   83	4	3	localObject	Object
    //   16	55	4	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   2	25	83	finally
    //   25	27	83	finally
    //   62	80	83	finally
    //   84	86	83	finally
  }
  
  public final void fF(long paramLong)
  {
    util.Zk("user:" + paramLong + " ClearUserSigInfo");
    this.yrd.i(Long.valueOf(paramLong));
  }
  
  public static enum a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\oicq\wlogin_sdk\request\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */