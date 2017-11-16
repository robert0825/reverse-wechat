package com.tencent.mm.plugin.voip_cs.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.protocal.c.bot;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  public static int qRa;
  public static int qRb;
  public static int qRc;
  public int aGU;
  public int channelStrategy;
  public String deviceModel;
  public long mjG;
  public long mld;
  public String mlm;
  public String mln;
  public int networkType;
  public int qJB;
  public int qJG;
  public int qJH;
  public int qJI;
  public int qJo;
  public int qKS;
  public int qRA;
  public int qRB;
  public long qRC;
  public int qRD;
  public long qRE;
  public long qRF;
  public long qRG;
  public int qRH;
  public int qRI;
  public int qRJ;
  public int qRK;
  public String qRL;
  public String qRM;
  public String qRN;
  public int qRO;
  public int qRP;
  public int qRQ;
  public int qRR;
  public int qRS;
  public int qRT;
  public int qRd;
  public int qRe;
  public int qRf;
  public int qRg;
  public int qRh;
  public int qRi;
  public int qRj;
  public int qRk;
  public int qRl;
  public int qRm;
  public int qRn;
  public int qRo;
  public long qRp;
  public String qRq;
  public int qRr;
  public int qRs;
  public int qRt;
  public int qRu;
  public int qRv;
  public int qRw;
  public int qRx;
  public int qRy;
  public int qRz;
  public int qwP;
  public int videoFps;
  
  static
  {
    GMTrace.i(11272275886080L, 83985);
    qRa = 0;
    qRb = 1;
    qRc = 2;
    GMTrace.o(11272275886080L, 83985);
  }
  
  public c()
  {
    GMTrace.i(11271470579712L, 83979);
    this.aGU = 0;
    this.qRd = 0;
    this.qRe = 0;
    this.qRf = 0;
    this.videoFps = 0;
    this.qRg = 0;
    this.qRh = 0;
    this.qRi = 0;
    this.qRj = 0;
    this.qRk = 0;
    this.qRl = 0;
    this.networkType = 0;
    this.qRm = 0;
    this.qRo = 0;
    this.qJB = 0;
    this.qRp = 0L;
    this.mjG = 0L;
    this.qRq = "";
    this.qJo = 0;
    this.qRs = 0;
    this.qRt = 0;
    this.qRu = 0;
    this.qRv = 0;
    this.qJH = 0;
    this.qJG = 0;
    this.qRw = 0;
    this.qRx = 1;
    this.qRy = 0;
    this.qRz = 0;
    this.qRA = 0;
    this.qRB = 0;
    this.qRC = 0L;
    this.qRE = 0L;
    this.qRF = 0L;
    this.qRG = 0L;
    this.mld = 0L;
    this.channelStrategy = 1;
    this.qKS = 0;
    this.qJI = 0;
    this.qRJ = -1;
    this.qRK = 0;
    this.qRL = "";
    this.deviceModel = "";
    this.qRM = "";
    this.qRN = "";
    this.qRO = 0;
    this.qRP = 0;
    this.qRQ = 0;
    this.qRR = 0;
    this.qRS = 0;
    this.qRT = 0;
    this.qwP = l.sK();
    this.mln = "";
    this.mlm = "";
    this.qRL = Build.MANUFACTURER;
    if (this.qRL.contains(",")) {
      this.qRL = this.qRL.replace(',', ' ');
    }
    this.deviceModel = Build.MODEL;
    if (this.deviceModel.contains(",")) {
      this.deviceModel = this.deviceModel.replace(',', ' ');
    }
    this.qRM = Build.VERSION.SDK;
    if (this.qRM.contains(",")) {
      this.qRM = this.qRM.replace(',', ' ');
    }
    this.qRN = Build.VERSION.RELEASE;
    if (this.qRN.contains(",")) {
      this.qRN = this.qRN.replace(',', ' ');
    }
    GMTrace.o(11271470579712L, 83979);
  }
  
  public static int bwt()
  {
    GMTrace.i(11272007450624L, 83983);
    int i;
    try
    {
      Object localObject = (ConnectivityManager)ab.getContext().getSystemService("connectivity");
      if (localObject != null)
      {
        localObject = ((ConnectivityManager)localObject).getNetworkInfo(0);
        if (localObject == null)
        {
          i = qRa;
          GMTrace.o(11272007450624L, 83983);
          return i;
        }
        if (((NetworkInfo)localObject).getState() == NetworkInfo.State.CONNECTED)
        {
          i = qRb;
          GMTrace.o(11272007450624L, 83983);
          return i;
        }
        i = qRc;
        GMTrace.o(11272007450624L, 83983);
        return i;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.VoipCSReportHelper", "isMobileNetworkAvailable fail!");
      i = qRa;
      GMTrace.o(11272007450624L, 83983);
    }
    return i;
  }
  
  public static int getNetType(Context paramContext)
  {
    GMTrace.i(11272141668352L, 83984);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        GMTrace.o(11272141668352L, 83984);
        return 0;
      }
      int i = paramContext.getType();
      if (i == 1)
      {
        GMTrace.o(11272141668352L, 83984);
        return 1;
      }
      i = paramContext.getType();
      if (i != 0)
      {
        GMTrace.o(11272141668352L, 83984);
        return 0;
      }
      i = paramContext.getSubtype();
      if (i == 1)
      {
        GMTrace.o(11272141668352L, 83984);
        return 2;
      }
      i = paramContext.getSubtype();
      if (i == 2)
      {
        GMTrace.o(11272141668352L, 83984);
        return 2;
      }
      i = paramContext.getSubtype();
      if (i == 13)
      {
        GMTrace.o(11272141668352L, 83984);
        return 4;
      }
      if ((paramContext.getSubtype() < 3) || (paramContext.getSubtype() >= 13))
      {
        i = paramContext.getSubtype();
        if (i <= 13) {}
      }
      else
      {
        GMTrace.o(11272141668352L, 83984);
        return 3;
      }
      GMTrace.o(11272141668352L, 83984);
      return 2;
    }
    catch (NullPointerException paramContext)
    {
      w.printErrStackTrace("MicroMsg.VoipCSReportHelper", paramContext, "", new Object[0]);
      GMTrace.o(11272141668352L, 83984);
    }
    return 0;
  }
  
  public final void bwr()
  {
    GMTrace.i(11271739015168L, 83981);
    w.d("MicroMsg.VoipCSReportHelper", "markEndTalk");
    if ((this.qRS == 0) && (this.qRR != 0))
    {
      this.qRS = ((int)(System.currentTimeMillis() / 1000L));
      this.mld = (this.qRS - this.qRR);
    }
    GMTrace.o(11271739015168L, 83981);
  }
  
  public final bot bws()
  {
    GMTrace.i(11271873232896L, 83982);
    bot localbot = new bot();
    localbot.jib = 2;
    localbot.uYN = this.mlm;
    w.i("MicroMsg.VoipCSReportHelper", "getVoipCSEngineReportData, result: %s", new Object[] { localbot.uYN });
    String[] arrayOfString = this.mlm.split(",");
    if ((arrayOfString != null) && (arrayOfString.length > 0)) {}
    try
    {
      this.videoFps = bg.getInt(arrayOfString[8], 0);
      this.qRg = bg.getInt(arrayOfString[10], 0);
      GMTrace.o(11271873232896L, 83982);
      return localbot;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.VoipCSReportHelper", "get videoFps and rate fail!!");
      }
    }
  }
  
  public final void wH(int paramInt)
  {
    GMTrace.i(11271604797440L, 83980);
    this.qJG = Math.abs(paramInt);
    GMTrace.o(11271604797440L, 83980);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */