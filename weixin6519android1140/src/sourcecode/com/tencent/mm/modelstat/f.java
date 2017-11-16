package com.tencent.mm.modelstat;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class f
{
  private final String eRF;
  private a gYj;
  
  public f(String paramString)
  {
    GMTrace.i(1378550284288L, 10271);
    this.gYj = null;
    this.eRF = paramString;
    GMTrace.o(1378550284288L, 10271);
  }
  
  public final a Mm()
  {
    GMTrace.i(1378684502016L, 10272);
    if (this.gYj != null)
    {
      localObject1 = this.gYj;
      GMTrace.o(1378684502016L, 10272);
      return (a)localObject1;
    }
    Object localObject2 = this.eRF + "mobileinfo.ini";
    Object localObject3 = new File((String)localObject2);
    if (!((File)localObject3).exists())
    {
      w.i("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig file not exist :%s", new Object[] { localObject2 });
      localObject1 = null;
    }
    Object localObject4;
    for (;;)
    {
      this.gYj = ((a)localObject1);
      if ((this.gYj == null) || (this.gYj.gYl)) {
        break;
      }
      w.v("MicroMsg.MobileInfoStorage ReportDataFlow", "checkInfo mobile info cache Read file succ.");
      localObject1 = this.gYj;
      GMTrace.o(1378684502016L, 10272);
      return (a)localObject1;
      localObject4 = new a((String)localObject2);
      localObject1 = new a();
      ((a)localObject1).gYk = bg.e(((a)localObject4).SR("ispCode"));
      ((a)localObject1).ispName = ((a)localObject4).getValue("ispName");
      ((a)localObject1).eCt = bg.e(((a)localObject4).SR("subType"));
      ((a)localObject1).extraInfo = ((a)localObject4).getValue("extraInfo");
      long l2 = ((File)localObject3).lastModified();
      long l1 = l2;
      if (10011 == r.hkj)
      {
        l1 = l2;
        if (r.hkk > 0)
        {
          l1 = bg.Pv() - r.hkk;
          w.w("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig DK_TEST_MOBILEINFOFILE_MODTIME val:%d lm:%d", new Object[] { Integer.valueOf(r.hkk), Long.valueOf(l1) });
          r.hkk = 0;
        }
      }
      if ((l1 > 0L) && (bg.aH(l1) > 259200000L))
      {
        w.w("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig  diff:%d file:%s cache expired remove!", new Object[] { Long.valueOf(bg.aH(l1)), localObject2 });
        ((a)localObject1).gYl = true;
      }
      w.i("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig MobileInfo subType:%d ispCode:%d ispName:%s extraInfo:%s expired:%b", new Object[] { Integer.valueOf(((a)localObject1).eCt), Integer.valueOf(((a)localObject1).gYk), ((a)localObject1).ispName, ((a)localObject1).extraInfo, Boolean.valueOf(((a)localObject1).gYl) });
    }
    localObject3 = ab.getContext();
    if (localObject3 == null)
    {
      w.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem MMApplicationContext is null");
      localObject1 = null;
    }
    while (localObject1 == null)
    {
      w.v("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem failed , use old.");
      localObject1 = this.gYj;
      GMTrace.o(1378684502016L, 10272);
      return (a)localObject1;
      localObject1 = (ConnectivityManager)((Context)localObject3).getSystemService("connectivity");
      if (localObject1 == null)
      {
        w.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem ConnectivityManager is null");
        localObject1 = null;
      }
      else
      {
        localObject4 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
        if (localObject4 == null)
        {
          w.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem getActiveNetworkInfo is null");
          localObject1 = null;
        }
        else if (((NetworkInfo)localObject4).getType() == 1)
        {
          w.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem net type is wifi");
          localObject1 = null;
        }
        else
        {
          localObject1 = new a();
          ((a)localObject1).eCt = ((NetworkInfo)localObject4).getSubtype();
          ((a)localObject1).gYk = am.getISPCode((Context)localObject3);
          ((a)localObject1).ispName = am.getISPName((Context)localObject3);
          ((a)localObject1).extraInfo = ((NetworkInfo)localObject4).getExtraInfo();
          w.i("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem subType:%d ispCode:%d ispName:%s extraInfo:%s", new Object[] { Integer.valueOf(((a)localObject1).eCt), Integer.valueOf(((a)localObject1).gYk), ((a)localObject1).ispName, ((a)localObject1).extraInfo });
        }
      }
    }
    this.gYj = ((a)localObject1);
    Object localObject1 = this.gYj;
    if (localObject1 == null) {
      w.e("MicroMsg.MobileInfoStorage ReportDataFlow", "saveConfig info is null");
    }
    for (;;)
    {
      localObject1 = this.gYj;
      GMTrace.o(1378684502016L, 10272);
      return (a)localObject1;
      if (bg.nm((String)localObject2))
      {
        w.e("MicroMsg.MobileInfoStorage ReportDataFlow", "saveConfig path is null");
      }
      else
      {
        localObject2 = new a((String)localObject2);
        ((a)localObject2).cI("ispCode", ((a)localObject1).gYk);
        ((a)localObject2).eX("ispName", ((a)localObject1).ispName);
        ((a)localObject2).cI("subType", ((a)localObject1).eCt);
        ((a)localObject2).eX("extraInfo", ((a)localObject1).extraInfo);
      }
    }
  }
  
  public static final class a
  {
    public int eCt;
    public String extraInfo;
    public int gYk;
    boolean gYl;
    public String ispName;
    
    public a()
    {
      GMTrace.i(1403380563968L, 10456);
      this.gYk = 0;
      this.ispName = "";
      this.eCt = 0;
      this.extraInfo = "";
      this.gYl = false;
      GMTrace.o(1403380563968L, 10456);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */