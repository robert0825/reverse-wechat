package com.tencent.mm.plugin.record.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.ly;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import java.io.File;
import java.util.HashMap;

public final class s
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private q ohA;
  private com.tencent.mm.sdk.b.c ohB;
  private l ohv;
  private i ohw;
  private p ohx;
  private h ohy;
  private e ohz;
  
  static
  {
    GMTrace.i(7503978954752L, 55909);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("RECORD_MSG_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(7513776848896L, 55982);
        String[] arrayOfString = l.fTX;
        GMTrace.o(7513776848896L, 55982);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("RECORD_MSG_CDN_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(7495120584704L, 55843);
        String[] arrayOfString = i.fTX;
        GMTrace.o(7495120584704L, 55843);
        return arrayOfString;
      }
    });
    GMTrace.o(7503978954752L, 55909);
  }
  
  public s()
  {
    GMTrace.i(7502502559744L, 55898);
    this.ohv = null;
    this.ohw = null;
    this.ohx = null;
    this.ohy = null;
    this.ohz = null;
    this.ohA = new q();
    this.ohB = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7502502559744L, 55898);
  }
  
  private static s baJ()
  {
    GMTrace.i(7502636777472L, 55899);
    s locals2 = (s)at.AK().gZ("plugin.record");
    s locals1 = locals2;
    if (locals2 == null)
    {
      locals1 = new s();
      at.AK().a("plugin.record", locals1);
    }
    GMTrace.o(7502636777472L, 55899);
    return locals1;
  }
  
  public static l baK()
  {
    GMTrace.i(7502770995200L, 55900);
    com.tencent.mm.kernel.h.xw().wG();
    if (baJ().ohv == null)
    {
      localObject = baJ();
      at.AR();
      ((s)localObject).ohv = new l(com.tencent.mm.y.c.yH());
    }
    Object localObject = baJ().ohv;
    GMTrace.o(7502770995200L, 55900);
    return (l)localObject;
  }
  
  public static i baL()
  {
    GMTrace.i(7502905212928L, 55901);
    com.tencent.mm.kernel.h.xw().wG();
    if (baJ().ohw == null)
    {
      localObject = baJ();
      at.AR();
      ((s)localObject).ohw = new i(com.tencent.mm.y.c.yH());
    }
    Object localObject = baJ().ohw;
    GMTrace.o(7502905212928L, 55901);
    return (i)localObject;
  }
  
  public static p baM()
  {
    GMTrace.i(7503039430656L, 55902);
    com.tencent.mm.kernel.h.xw().wG();
    if (baJ().ohx == null) {
      baJ().ohx = new p();
    }
    p localp = baJ().ohx;
    GMTrace.o(7503039430656L, 55902);
    return localp;
  }
  
  public static h baN()
  {
    GMTrace.i(7503173648384L, 55903);
    com.tencent.mm.kernel.h.xw().wG();
    if (baJ().ohy == null) {
      baJ().ohy = new h();
    }
    h localh = baJ().ohy;
    GMTrace.o(7503173648384L, 55903);
    return localh;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7503576301568L, 55906);
    w.d("MicroMsg.SubCoreRecordMsg", "on account post reset");
    com.tencent.mm.sdk.b.a.vgX.b(this.ohA);
    com.tencent.mm.sdk.b.a.vgX.b(this.ohB);
    this.ohz = new e();
    baL().a(this.ohz);
    at.AR();
    File localFile = new File(com.tencent.mm.y.c.zi());
    if ((!localFile.exists()) || (!localFile.isDirectory()))
    {
      w.d("MicroMsg.SubCoreRecordMsg", "record stg dir[%s] not exsit, create it");
      localFile.mkdirs();
    }
    GMTrace.o(7503576301568L, 55906);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7503710519296L, 55907);
    GMTrace.o(7503710519296L, 55907);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7503442083840L, 55905);
    GMTrace.o(7503442083840L, 55905);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7503844737024L, 55908);
    w.d("MicroMsg.SubCoreRecordMsg", "on account post release");
    com.tencent.mm.sdk.b.a.vgX.c(this.ohA);
    com.tencent.mm.sdk.b.a.vgX.c(this.ohB);
    baL().b(this.ohz);
    this.ohz = null;
    Object localObject = baJ().ohx;
    if (localObject != null)
    {
      ((p)localObject).finish();
      at.wS().b(632, (com.tencent.mm.ad.e)localObject);
      baL().b((i.a)localObject);
    }
    localObject = baJ().ohy;
    if (localObject != null) {
      ((f)localObject).finish();
    }
    GMTrace.o(7503844737024L, 55908);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7503307866112L, 55904);
    HashMap localHashMap = fIv;
    GMTrace.o(7503307866112L, 55904);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\record\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */