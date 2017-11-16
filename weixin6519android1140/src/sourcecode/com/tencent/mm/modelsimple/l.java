package com.tencent.mm.modelsimple;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.ahp;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.ht;
import com.tencent.mm.protocal.c.oq;
import com.tencent.mm.protocal.c.vn;
import com.tencent.mm.protocal.c.vo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public final b fUa;
  private com.tencent.mm.ad.e fUd;
  public Object tag;
  
  private l()
  {
    GMTrace.i(1340432449536L, 9987);
    this.fUa = a.b(a.a(l.a.a.gTS));
    GMTrace.o(1340432449536L, 9987);
  }
  
  public l(int paramInt1, int paramInt2)
  {
    this();
    GMTrace.i(1341506191360L, 9995);
    vn localvn = (vn)this.fUa.gtC.gtK;
    localvn.tMX = 3;
    localvn.tOG = 5;
    localvn.unN = paramInt1;
    localvn.unT = paramInt2;
    w.d("MicroMsg.NetSceneGetA8Key", "dkwt geta8key friendQQNum:%d  a2key-len:%d requestId", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(localvn.tSj.uNN), Integer.valueOf(paramInt2) });
    GMTrace.o(1341506191360L, 9995);
  }
  
  private l(l.a.a parama)
  {
    GMTrace.i(20982794289152L, 156334);
    this.fUa = a.a(parama);
    GMTrace.o(20982794289152L, 156334);
  }
  
  private l(String paramString, int paramInt)
  {
    GMTrace.i(20982660071424L, 156333);
    l.a.a locala2 = l.a.a.gTR;
    l.a.a locala1 = locala2;
    if (locala2 == l.a.a.gTR) {
      locala1 = a.H(paramString, paramInt);
    }
    w.i("MicroMsg.NetSceneGetA8Key", "getCommReqRespFromReqUrl reqUrl=%s, type=%s, reason=%d", new Object[] { paramString, locala1, Integer.valueOf(paramInt) });
    this.fUa = a.b(a.a(locala1));
    GMTrace.o(20982660071424L, 156333);
  }
  
  public l(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, int paramInt4, byte[] paramArrayOfByte)
  {
    this(paramString1, 0);
    GMTrace.i(20983062724608L, 156336);
    vn localvn = (vn)this.fUa.gtC.gtK;
    localvn.tMX = 2;
    localvn.unL = new azq().Rq(paramString1);
    localvn.tOG = paramInt1;
    localvn.jhi = null;
    localvn.unQ = 0;
    localvn.uco = paramInt2;
    localvn.ucp = paramInt3;
    localvn.unT = paramInt4;
    localvn.unI = new azq().Rq(paramString2);
    localvn.unW = new azp().be(paramArrayOfByte);
    w.d("MicroMsg.NetSceneGetA8Key", "get a8key reqUrl = " + paramString1 + ", username = " + null + ", scene = " + paramInt1 + ", reason = 0, codeType = " + paramInt2 + ", codeVersion = " + paramInt3 + ", requestId = " + paramInt4);
    w.d("MicroMsg.NetSceneGetA8Key", "a8KeyCookie = %s", new Object[] { bg.bs(paramArrayOfByte) });
    GMTrace.o(20983062724608L, 156336);
  }
  
  public l(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, int paramInt4, String paramString4, String paramString5, int paramInt5, byte[] paramArrayOfByte)
  {
    this(paramString1, paramInt2);
    GMTrace.i(20983196942336L, 156337);
    vn localvn = (vn)this.fUa.gtC.gtK;
    localvn.tMX = 2;
    localvn.unL = new azq().Rq(paramString1);
    localvn.tOG = paramInt1;
    localvn.jhi = paramString2;
    localvn.unQ = paramInt2;
    localvn.tPM = paramInt3;
    localvn.unS = paramString3;
    localvn.unT = paramInt4;
    localvn.unU = paramString5;
    localvn.unV = paramInt5;
    localvn.unI = new azq().Rq(paramString4);
    localvn.unW = new azp().be(paramArrayOfByte);
    w.i("MicroMsg.NetSceneGetA8Key", "get a8key reqUrl = %s, username = %s, scene = %d, reason = %d, flag = %d, netType = %s, requestId = %d, appId = %s, functionId = %s, wallentRegion = %d, a8KeyCookie = %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString3, Integer.valueOf(paramInt4), paramString4, paramString5, Integer.valueOf(paramInt5), bg.bs(paramArrayOfByte) });
    GMTrace.o(20983196942336L, 156337);
  }
  
  public l(String paramString1, String paramString2, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    this(paramString1, 0);
    GMTrace.i(20982928506880L, 156335);
    vn localvn = (vn)this.fUa.gtC.gtK;
    localvn.tMX = 2;
    localvn.unL = new azq().Rq(paramString1);
    localvn.tOG = paramInt1;
    localvn.jhi = paramString2;
    localvn.unQ = 0;
    localvn.unT = paramInt2;
    localvn.unW = new azp().be(paramArrayOfByte);
    w.d("MicroMsg.NetSceneGetA8Key", "get a8key reqUrl = " + paramString1 + ", username = " + paramString2 + ", scene = " + paramInt1 + ", reason = 0, requestId = " + paramInt2);
    w.d("MicroMsg.NetSceneGetA8Key", "a8KeyCookie = %s", new Object[] { bg.bs(paramArrayOfByte) });
    GMTrace.o(20982928506880L, 156335);
  }
  
  public l(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this(l.a.a.gTT);
    GMTrace.i(1340969320448L, 9991);
    vn localvn = (vn)this.fUa.gtC.gtK;
    localvn.tMX = 1;
    localvn.unI = new azq().Rq(paramString1);
    localvn.unJ = new azq().Rq(paramString2);
    localvn.unK = new azq().Rq(paramString3);
    localvn.unT = paramInt;
    w.d("MicroMsg.NetSceneGetA8Key", "get a8key appid=%s requestId=%d", new Object[] { paramString1, Integer.valueOf(paramInt) });
    GMTrace.o(1340969320448L, 9991);
  }
  
  public final String Lc()
  {
    GMTrace.i(1342043062272L, 9999);
    String str = ((vo)this.fUa.gtD.gtK).unX;
    GMTrace.o(1342043062272L, 9999);
    return str;
  }
  
  public final String Ld()
  {
    GMTrace.i(1342177280000L, 10000);
    Object localObject = ((vn)this.fUa.gtC.gtK).unL;
    if (localObject != null)
    {
      localObject = ((azq)localObject).uNR;
      GMTrace.o(1342177280000L, 10000);
      return (String)localObject;
    }
    GMTrace.o(1342177280000L, 10000);
    return null;
  }
  
  public final int Le()
  {
    GMTrace.i(1342579933184L, 10003);
    int i = ((vo)this.fUa.gtD.gtK).tNf;
    GMTrace.o(1342579933184L, 10003);
    return i;
  }
  
  public final byte[] Lf()
  {
    GMTrace.i(1342714150912L, 10004);
    Object localObject = (vo)this.fUa.gtD.gtK;
    if (((vo)localObject).uog == null)
    {
      GMTrace.o(1342714150912L, 10004);
      return null;
    }
    try
    {
      localObject = n.a(((vo)localObject).uog);
      GMTrace.o(1342714150912L, 10004);
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      GMTrace.o(1342714150912L, 10004);
    }
    return null;
  }
  
  public final String Lg()
  {
    GMTrace.i(1342848368640L, 10005);
    String str = ((vo)this.fUa.gtD.gtK).uob;
    GMTrace.o(1342848368640L, 10005);
    return str;
  }
  
  public final ArrayList<byte[]> Lh()
  {
    GMTrace.i(1342982586368L, 10006);
    Object localObject = (vo)this.fUa.gtD.gtK;
    ArrayList localArrayList = new ArrayList();
    if ((localObject == null) || (((vo)localObject).uod == null))
    {
      GMTrace.o(1342982586368L, 10006);
      return localArrayList;
    }
    localObject = ((vo)localObject).uod.iterator();
    while (((Iterator)localObject).hasNext())
    {
      ht localht = (ht)((Iterator)localObject).next();
      try
      {
        localArrayList.add(localht.toByteArray());
      }
      catch (IOException localIOException)
      {
        w.e("MicroMsg.NetSceneGetA8Key", "exception:%s", new Object[] { bg.f(localIOException) });
      }
    }
    w.d("MicroMsg.NetSceneGetA8Key", "ScopeList size = %s", new Object[] { Integer.valueOf(localArrayList.size()) });
    GMTrace.o(1342982586368L, 10006);
    return localArrayList;
  }
  
  public final long Li()
  {
    GMTrace.i(1343116804096L, 10007);
    vo localvo = (vo)this.fUa.gtD.gtK;
    if (localvo.uof != null)
    {
      long l = localvo.uof.ufx;
      GMTrace.o(1343116804096L, 10007);
      return l;
    }
    GMTrace.o(1343116804096L, 10007);
    return -1L;
  }
  
  public final List<ahp> Lj()
  {
    GMTrace.i(17934843904000L, 133625);
    LinkedList localLinkedList = ((vo)this.fUa.gtD.gtK).uoi;
    GMTrace.o(17934843904000L, 133625);
    return localLinkedList;
  }
  
  public final int Lk()
  {
    GMTrace.i(1343251021824L, 10008);
    int i = ((vn)this.fUa.gtC.gtK).unT;
    GMTrace.o(1343251021824L, 10008);
    return i;
  }
  
  public final byte[] Ll()
  {
    GMTrace.i(20983331160064L, 156338);
    Object localObject = (vo)this.fUa.gtD.gtK;
    if (((vo)localObject).unW == null)
    {
      GMTrace.o(20983331160064L, 156338);
      return new byte[0];
    }
    try
    {
      localObject = n.a(((vo)localObject).unW);
      GMTrace.o(20983331160064L, 156338);
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      GMTrace.o(20983331160064L, 156338);
    }
    return new byte[0];
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1341774626816L, 9997);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(1341774626816L, 9997);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1341908844544L, 9998);
    w.d("MicroMsg.NetSceneGetA8Key", "dkwt geta8key onGYNetEnd:[%d,%d] url:[%s]  a8key:[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Lc(), ((vo)this.fUa.gtD.gtK).unY });
    w.d("MicroMsg.NetSceneGetA8Key", "a8KeyCookie:%s", new Object[] { bg.bs(Ll()) });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1341908844544L, 9998);
  }
  
  public final String getTitle()
  {
    GMTrace.i(1342311497728L, 10001);
    String str = ((vo)this.fUa.gtD.gtK).eBt;
    GMTrace.o(1342311497728L, 10001);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(1341640409088L, 9996);
    GMTrace.o(1341640409088L, 9996);
    return 233;
  }
  
  public final String rc()
  {
    GMTrace.i(1342445715456L, 10002);
    String str = ((vo)this.fUa.gtD.gtK).nIp;
    GMTrace.o(1342445715456L, 10002);
    return str;
  }
  
  static final class a
  {
    static a H(String paramString, int paramInt)
    {
      GMTrace.i(20982257418240L, 156330);
      if (paramInt == 5)
      {
        paramString = a.gTV;
        GMTrace.o(20982257418240L, 156330);
        return paramString;
      }
      if (bg.nm(paramString))
      {
        w.i("MicroMsg.NetSceneGetA8Key", "getTypeFromUrl reqUrl is null, getA8Key");
        paramString = a.gTS;
        GMTrace.o(20982257418240L, 156330);
        return paramString;
      }
      try
      {
        Object localObject = Uri.parse(paramString);
        if (localObject == null)
        {
          paramString = a.gTW;
          GMTrace.o(20982257418240L, 156330);
          return paramString;
        }
        String str = bg.nl(((Uri)localObject).getHost()).toLowerCase();
        if (bg.nm(((Uri)localObject).getFragment())) {}
        for (localObject = "";; localObject = "#" + ((Uri)localObject).getFragment())
        {
          w.d("MicroMsg.NetSceneGetA8Key", "get TypeFromUrl domain:%s, fragment:%s", new Object[] { str, localObject });
          if ((!str.equals("open.weixin.qq.com")) && (!str.equals("mp.weixin.qq.com")) && (!str.equals("mp.weixinbridge.com"))) {
            break;
          }
          paramString = a.gTT;
          GMTrace.o(20982257418240L, 156330);
          return paramString;
        }
        if (((String)localObject).contains("wechat_pay"))
        {
          paramString = a.gTU;
          GMTrace.o(20982257418240L, 156330);
          return paramString;
        }
        if ((str.contains(".qq.com")) || (str.contains(".wechat.com")) || (str.contains(".tenpay.com")) || (str.contains(".url.cn")) || ((!paramString.startsWith("http://")) && (!paramString.startsWith("https://"))))
        {
          paramString = a.gTS;
          GMTrace.o(20982257418240L, 156330);
          return paramString;
        }
        paramString = a.gTW;
        GMTrace.o(20982257418240L, 156330);
        return paramString;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.NetSceneGetA8Key", "getTypeFromUrl parse uri fail %s", new Object[] { paramString.getMessage() });
        paramString = a.gTS;
        GMTrace.o(20982257418240L, 156330);
      }
      return paramString;
    }
    
    public static b a(a parama)
    {
      GMTrace.i(20982123200512L, 156329);
      b.a locala = new b.a();
      locala.gtF = new vn();
      locala.gtG = new vo();
      switch (l.1.gTQ[parama.ordinal()])
      {
      default: 
        locala.uri = "/cgi-bin/micromsg-bin/3rd-geta8key";
        locala.gtE = 226;
        locala.gtH = 388;
        locala.gtI = 1000000388;
      }
      for (;;)
      {
        parama = locala.DA();
        GMTrace.o(20982123200512L, 156329);
        return parama;
        locala.uri = "/cgi-bin/micromsg-bin/geta8key";
        locala.gtE = 233;
        locala.gtH = 155;
        locala.gtI = 1000000155;
        continue;
        locala.uri = "/cgi-bin/micromsg-bin/mp-geta8key";
        locala.gtE = 238;
        locala.gtH = 345;
        locala.gtI = 1000000345;
        continue;
        locala.uri = "/cgi-bin/micromsg-bin/pay-geta8key";
        locala.gtE = 835;
        locala.gtH = 346;
        locala.gtI = 1000000346;
        continue;
        locala.uri = "/cgi-bin/micromsg-bin/minor-geta8key";
        locala.gtE = 812;
        locala.gtH = 387;
        locala.gtI = 1000000387;
        continue;
        locala.uri = "/cgi-bin/micromsg-bin/3rd-geta8key";
        locala.gtE = 226;
        locala.gtH = 388;
        locala.gtI = 1000000388;
      }
    }
    
    static b b(b paramb)
    {
      GMTrace.i(20982391635968L, 156331);
      vn localvn = (vn)paramb.gtC.gtK;
      h.xz();
      String str1 = bg.nl((String)h.xy().xh().get(46, null));
      localvn.tSj = new azp().be(bg.St(str1));
      h.xz();
      String str2 = bg.nl((String)h.xy().xh().get(72, null));
      localvn.unP = new azp().be(bg.St(str2));
      w.d("MicroMsg.NetSceneGetA8Key", "dkwt get a2=" + str1 + " newa2=" + str2);
      GMTrace.o(20982391635968L, 156331);
      return paramb;
    }
    
    public static enum a
    {
      static
      {
        GMTrace.i(20981988982784L, 156328);
        gTR = new a("AutoRoute", 0);
        gTS = new a("GetA8Key", 1);
        gTT = new a("MpGetA8Key", 2);
        gTU = new a("PayGetA8Key", 3);
        gTV = new a("MinorGetA8Key", 4);
        gTW = new a("ThridGetA8Key", 5);
        gTX = new a[] { gTR, gTS, gTT, gTU, gTV, gTW };
        GMTrace.o(20981988982784L, 156328);
      }
      
      private a()
      {
        GMTrace.i(20981854765056L, 156327);
        GMTrace.o(20981854765056L, 156327);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */