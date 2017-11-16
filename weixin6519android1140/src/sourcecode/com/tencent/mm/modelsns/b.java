package com.tencent.mm.modelsns;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
{
  private static boolean gSY;
  private static AtomicInteger gVJ;
  public int gVA;
  public long gVB;
  public int gVC;
  public int gVD;
  public int gVE;
  public StringBuffer gVF;
  public StringBuffer gVG;
  public StringBuffer gVH;
  public StringBuffer gVI;
  public Object gVz;
  public int opType;
  
  static
  {
    GMTrace.i(4462739456000L, 33250);
    gSY = false;
    gVJ = new AtomicInteger(0);
    GMTrace.o(4462739456000L, 33250);
  }
  
  public b(int paramInt1, int paramInt2)
  {
    GMTrace.i(4460055101440L, 33230);
    this.gVz = null;
    this.gVA = 1;
    this.opType = 0;
    this.gVF = new StringBuffer();
    this.gVG = new StringBuffer();
    this.gVH = new StringBuffer();
    this.gVI = new StringBuffer();
    this.opType = paramInt1;
    this.gVE = paramInt2;
    if (!LN())
    {
      GMTrace.o(4460055101440L, 33230);
      return;
    }
    this.gVB = System.currentTimeMillis();
    if (am.isWifi(ab.getContext())) {
      this.gVD = 4;
    }
    for (;;)
    {
      this.gVC = gVJ.incrementAndGet();
      GMTrace.o(4460055101440L, 33230);
      return;
      if (am.is4G(ab.getContext())) {
        this.gVD = 3;
      } else if (am.is3G(ab.getContext())) {
        this.gVD = 2;
      } else if (am.is2G(ab.getContext())) {
        this.gVD = 1;
      } else {
        this.gVD = 0;
      }
    }
  }
  
  private static b D(byte[] paramArrayOfByte)
  {
    GMTrace.i(4462471020544L, 33248);
    if (paramArrayOfByte == null)
    {
      GMTrace.o(4462471020544L, 33248);
      return null;
    }
    bhc localbhc = new bhc();
    try
    {
      localbhc.aD(paramArrayOfByte);
      paramArrayOfByte = new b(localbhc.opType, localbhc.gVE);
      paramArrayOfByte.gVA = localbhc.gVA;
      paramArrayOfByte.gVB = localbhc.gVB;
      paramArrayOfByte.gVC = localbhc.gVC;
      paramArrayOfByte.gVD = localbhc.gVD;
      paramArrayOfByte.gVF = new StringBuffer(localbhc.uSW);
      paramArrayOfByte.gVI = new StringBuffer(localbhc.uSX);
      paramArrayOfByte.gVG = new StringBuffer(localbhc.uSY);
      paramArrayOfByte.gVH = new StringBuffer(localbhc.uSZ);
      GMTrace.o(4462471020544L, 33248);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("MicroMsg.StatisticsOplog", "putIntent " + paramArrayOfByte.getMessage());
      GMTrace.o(4462471020544L, 33248);
    }
    return null;
  }
  
  public static void LQ()
  {
    GMTrace.i(4461531496448L, 33241);
    w.i("MicroMsg.StatisticsOplog", "wait op");
    GMTrace.o(4461531496448L, 33241);
  }
  
  public static b c(Intent paramIntent, String paramString)
  {
    GMTrace.i(4462336802816L, 33247);
    paramIntent = paramIntent.getByteArrayExtra(paramString);
    if (paramIntent == null)
    {
      GMTrace.o(4462336802816L, 33247);
      return null;
    }
    paramIntent = D(paramIntent);
    GMTrace.o(4462336802816L, 33247);
    return paramIntent;
  }
  
  public static b ha(int paramInt)
  {
    GMTrace.i(4459652448256L, 33227);
    b localb = new b(paramInt, 1);
    GMTrace.o(4459652448256L, 33227);
    return localb;
  }
  
  public static b hb(int paramInt)
  {
    GMTrace.i(4459786665984L, 33228);
    b localb = new b(paramInt, 4);
    GMTrace.o(4459786665984L, 33228);
    return localb;
  }
  
  public static b p(Bundle paramBundle)
  {
    GMTrace.i(4462068367360L, 33245);
    paramBundle = paramBundle.getByteArray("intent_key_StatisticsOplog");
    if (paramBundle == null)
    {
      GMTrace.o(4462068367360L, 33245);
      return null;
    }
    paramBundle = D(paramBundle);
    GMTrace.o(4462068367360L, 33245);
    return paramBundle;
  }
  
  public static b q(Intent paramIntent)
  {
    GMTrace.i(4462202585088L, 33246);
    paramIntent = c(paramIntent, "intent_key_StatisticsOplog");
    GMTrace.o(4462202585088L, 33246);
    return paramIntent;
  }
  
  public final byte[] Ec()
  {
    GMTrace.i(4461799931904L, 33243);
    Object localObject = new bhc();
    ((bhc)localObject).opType = this.opType;
    ((bhc)localObject).gVE = this.gVE;
    ((bhc)localObject).gVA = this.gVA;
    ((bhc)localObject).gVB = this.gVB;
    ((bhc)localObject).gVC = this.gVC;
    ((bhc)localObject).gVD = this.gVD;
    ((bhc)localObject).uSW = this.gVF.toString();
    ((bhc)localObject).uSX = this.gVI.toString();
    ((bhc)localObject).uSY = this.gVG.toString();
    ((bhc)localObject).uSZ = this.gVH.toString();
    try
    {
      localObject = ((bhc)localObject).toByteArray();
      GMTrace.o(4461799931904L, 33243);
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.StatisticsOplog", "putIntent " + localException.getMessage());
      GMTrace.o(4461799931904L, 33243);
    }
    return null;
  }
  
  public final boolean LN()
  {
    GMTrace.i(4459920883712L, 33229);
    int i = c.gVL;
    if (i == 0)
    {
      GMTrace.o(4459920883712L, 33229);
      return false;
    }
    if (i == 1)
    {
      if ((this.opType >= 501) && (this.opType <= 700))
      {
        GMTrace.o(4459920883712L, 33229);
        return true;
      }
      if ((this.opType >= 701) && (this.opType <= 1000))
      {
        GMTrace.o(4459920883712L, 33229);
        return true;
      }
    }
    if ((i == 2) && (this.opType >= 701) && (this.opType <= 1000))
    {
      GMTrace.o(4459920883712L, 33229);
      return true;
    }
    if ((i == 3) && (this.opType >= 501) && (this.opType <= 700))
    {
      GMTrace.o(4459920883712L, 33229);
      return true;
    }
    if (i == 4)
    {
      if ((this.opType >= 701) && (this.opType <= 1000))
      {
        GMTrace.o(4459920883712L, 33229);
        return true;
      }
      if ((this.opType >= 501) && (this.opType <= 700))
      {
        GMTrace.o(4459920883712L, 33229);
        return true;
      }
    }
    GMTrace.o(4459920883712L, 33229);
    return false;
  }
  
  public final b LO()
  {
    GMTrace.i(4460860407808L, 33236);
    this.gVG = new StringBuffer();
    GMTrace.o(4460860407808L, 33236);
    return this;
  }
  
  public final b LP()
  {
    GMTrace.i(4460994625536L, 33237);
    this.gVF = new StringBuffer();
    GMTrace.o(4460994625536L, 33237);
    return this;
  }
  
  public final boolean LR()
  {
    GMTrace.i(4461665714176L, 33242);
    if (!LN())
    {
      GMTrace.o(4461665714176L, 33242);
      return false;
    }
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4463947415552L, 33259);
        Object localObject = b.this;
        d locald = new d();
        locald.q("\n\nmodel", ((b)localObject).gVA + ",");
        locald.q("opType", ((b)localObject).opType + ",");
        locald.q("timeStamp", ((b)localObject).gVB + ",");
        locald.q("seq", ((b)localObject).gVC + ",");
        locald.q("netWork", ((b)localObject).gVD + ",");
        locald.q("page", ((b)localObject).gVE + ",");
        locald.q("StatusDesc1", ((b)localObject).gVF.toString() + ",");
        locald.q("DataFlowSourceInfo", ((b)localObject).gVG.toString() + ",");
        locald.q("DataFlowResultInfo", ((b)localObject).gVH.toString() + ",");
        locald.q("StatusDesc2", ((b)localObject).gVI.toString() + ", ");
        localObject = "bindkey: " + ((b)localObject).gVz;
        locald.gVN.append((String)localObject);
        w.d("MicroMsg.StatisticsOplog", "report logbuffer: " + locald.LT());
        com.tencent.mm.plugin.report.d.oqe.i(12645, new Object[] { locald });
        GMTrace.o(4463947415552L, 33259);
      }
    }, "StatisticsOplog");
    GMTrace.o(4461665714176L, 33242);
    return true;
  }
  
  public final void b(Intent paramIntent, String paramString)
  {
    GMTrace.i(4461934149632L, 33244);
    byte[] arrayOfByte = Ec();
    if (arrayOfByte == null)
    {
      GMTrace.o(4461934149632L, 33244);
      return;
    }
    paramIntent.putExtra(paramString, arrayOfByte);
    GMTrace.o(4461934149632L, 33244);
  }
  
  public final b bC(boolean paramBoolean)
  {
    GMTrace.i(4461263060992L, 33239);
    if (paramBoolean) {}
    for (Object localObject = "1";; localObject = "0")
    {
      localObject = lu((String)localObject);
      GMTrace.o(4461263060992L, 33239);
      return (b)localObject;
    }
  }
  
  public final boolean hc(int paramInt)
  {
    GMTrace.i(4460189319168L, 33231);
    this.gVz = Integer.valueOf(paramInt);
    GMTrace.o(4460189319168L, 33231);
    return true;
  }
  
  public final b hd(int paramInt)
  {
    GMTrace.i(4460591972352L, 33234);
    b localb = lu(String.valueOf(paramInt));
    GMTrace.o(4460591972352L, 33234);
    return localb;
  }
  
  public final b he(int paramInt)
  {
    GMTrace.i(4461397278720L, 33240);
    if (!LN())
    {
      GMTrace.o(4461397278720L, 33240);
      return this;
    }
    if (this.gVG.length() == 0) {
      this.gVG.append(paramInt);
    }
    for (;;)
    {
      GMTrace.o(4461397278720L, 33240);
      return this;
      this.gVG.append("||" + paramInt);
    }
  }
  
  public final b lu(String paramString)
  {
    GMTrace.i(4460457754624L, 33233);
    if (!LN())
    {
      GMTrace.o(4460457754624L, 33233);
      return this;
    }
    if (this.gVF.length() == 0) {
      if (bg.nm(paramString)) {
        this.gVF.append(" ");
      }
    }
    for (;;)
    {
      GMTrace.o(4460457754624L, 33233);
      return this;
      this.gVF.append(paramString);
      continue;
      this.gVF.append("||" + paramString);
    }
  }
  
  public final b lv(String paramString)
  {
    GMTrace.i(4460726190080L, 33235);
    if (!LN())
    {
      GMTrace.o(4460726190080L, 33235);
      return this;
    }
    if (this.gVG.length() == 0) {
      this.gVG.append(paramString);
    }
    for (;;)
    {
      GMTrace.o(4460726190080L, 33235);
      return this;
      this.gVG.append("||" + paramString);
    }
  }
  
  public final b lw(String paramString)
  {
    GMTrace.i(4461128843264L, 33238);
    if (!LN())
    {
      GMTrace.o(4461128843264L, 33238);
      return this;
    }
    if (this.gVH.length() == 0) {
      this.gVH.append(paramString);
    }
    for (;;)
    {
      GMTrace.o(4461128843264L, 33238);
      return this;
      this.gVH.append("||" + paramString);
    }
  }
  
  public final void update()
  {
    GMTrace.i(4460323536896L, 33232);
    if (!LN())
    {
      GMTrace.o(4460323536896L, 33232);
      return;
    }
    this.gVB = System.currentTimeMillis();
    this.gVC = gVJ.incrementAndGet();
    GMTrace.o(4460323536896L, 33232);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsns\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */