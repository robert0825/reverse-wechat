package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.libwebp;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.c;
import java.util.Map;

final class w
{
  private Context xWR = null;
  private Context xWS = null;
  private String xWT = null;
  private String[] xWU = null;
  DexLoader xWV = null;
  private String xWW = "TbsDexOpt";
  private String xWX = null;
  
  public w(Context paramContext1, Context paramContext2, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, o paramo)
  {
    TbsLog.i("TbsWizard", "construction start...");
    if ((paramContext1 == null) || ((paramContext2 == null) && (t.coF() == null)) || (TextUtils.isEmpty(paramString1)) || (paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      throw new Exception("TbsWizard paramter error:-1callerContext:" + paramContext1 + "hostcontext" + paramContext2 + "isEmpty" + TextUtils.isEmpty(paramString1) + "dexfileList" + paramArrayOfString);
    }
    this.xWR = paramContext1.getApplicationContext();
    this.xWS = paramContext2;
    this.xWT = paramString1;
    this.xWU = paramArrayOfString;
    this.xWW = paramString2;
    if (paramo != null) {
      paramo.a("load_tbs_dex", (byte)1);
    }
    this.xWV = new DexLoader(paramString3, this.xWR, this.xWU, paramString2, QbSdk.xUc);
    if (paramo != null) {
      paramo.a("load_tbs_dex", (byte)2);
    }
    libwebp.loadWepLibraryIfNeed(paramContext2, this.xWT);
    if ("com.nd.android.pandahome2".equals(this.xWR.getApplicationInfo().packageName))
    {
      paramContext2 = this.xWV;
      paramString1 = this.xWR;
      paramContext2.invokeStaticMethod("com.tencent.tbs.common.beacon.X5CoreBeaconUploader", "getInstance", new Class[] { Context.class }, new Object[] { paramString1 });
    }
    if (QbSdk.xUc != null)
    {
      paramContext2 = this.xWV;
      paramString1 = QbSdk.xUc;
      paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTbsSettings", new Class[] { Map.class }, new Object[] { paramString1 });
    }
    if (paramo != null) {
      paramo.a("init_tbs", (byte)1);
    }
    paramContext2 = this.xWV;
    paramString1 = c.aGO;
    paramString2 = c.xYb;
    paramArrayOfString = c.xYc;
    paramString3 = c.aKJ;
    paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "putInfo", new Class[] { Context.class, String.class, String.class, String.class, String.class }, new Object[] { paramContext1, paramString1, paramString2, paramArrayOfString, paramString3 });
    String str1;
    String str2;
    int i;
    if ((this.xWS == null) && (t.coF() != null))
    {
      paramContext2 = this.xWV;
      paramString1 = Integer.TYPE;
      paramString2 = this.xWS;
      paramArrayOfString = this.xWV;
      paramString3 = this.xWT;
      str1 = this.xWW;
      str2 = QbSdk.cnN();
      String str3 = t.coF();
      paramContext2 = paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[] { Context.class, Context.class, DexLoader.class, String.class, String.class, String.class, paramString1, String.class, String.class }, new Object[] { paramContext1, paramString2, paramArrayOfString, paramString3, str1, "3.6.0.1026", Integer.valueOf(43601), str2, str3 });
      paramString1 = paramContext2;
      if (paramContext2 == null)
      {
        this.xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "setTesSdkVersionName", new Class[] { String.class }, new Object[] { "3.6.0.1026" });
        this.xWV.setStaticField("com.tencent.tbs.tbsshell.TBSShell", "VERSION", Integer.valueOf(43601));
        paramContext2 = this.xWV;
        paramString1 = this.xWS;
        paramString2 = this.xWV;
        paramArrayOfString = this.xWT;
        paramString3 = this.xWW;
        paramString1 = paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[] { Context.class, Context.class, DexLoader.class, String.class, String.class }, new Object[] { paramContext1, paramString1, paramString2, paramArrayOfString, paramString3 });
      }
      if (paramString1 != null) {
        break label1042;
      }
      i = -3;
      label746:
      if (i >= 0) {
        break label1099;
      }
      paramContext1 = this.xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "getLoadFailureDetails", new Class[0], new Object[0]);
      if ((paramContext1 instanceof Throwable))
      {
        paramContext2 = (Throwable)paramContext1;
        this.xWX = ("#" + paramContext2.getMessage() + "; cause: " + paramContext2.getCause() + "; th: " + paramContext2);
      }
      if (!(paramContext1 instanceof String)) {}
    }
    label1042:
    label1099:
    for (this.xWX = ((String)paramContext1);; this.xWX = null)
    {
      if (paramo != null) {
        paramo.a("init_tbs", (byte)2);
      }
      if (i >= 0) {
        break label1107;
      }
      throw new Exception("TbsWizard init error: " + i + "; msg: " + this.xWX);
      paramContext2 = this.xWV;
      paramString1 = Integer.TYPE;
      paramString2 = this.xWS;
      paramArrayOfString = this.xWV;
      paramString3 = this.xWT;
      str1 = this.xWW;
      str2 = QbSdk.cnN();
      paramContext2 = paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[] { Context.class, Context.class, DexLoader.class, String.class, String.class, String.class, paramString1, String.class }, new Object[] { paramContext1, paramString2, paramArrayOfString, paramString3, str1, "3.6.0.1026", Integer.valueOf(43601), str2 });
      break;
      if ((paramString1 instanceof Integer))
      {
        i = ((Integer)paramString1).intValue();
        break label746;
      }
      if ((paramString1 instanceof Throwable))
      {
        i.cnZ().a(this.xWR, 328, (Throwable)paramString1);
        i = -5;
        break label746;
      }
      i = -4;
      break label746;
    }
    label1107:
    TbsLog.i("TbsWizard", "construction end...");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */