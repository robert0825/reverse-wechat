package com.tencent.mm.opensdk.channel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.channel.a.b;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

public class MMessageActV2
{
  public static final String DEFAULT_ENTRY_CLASS_NAME = ".wxapi.WXEntryActivity";
  public static final String MM_ENTRY_PACKAGE_NAME = "com.tencent.mm";
  public static final String MM_MSG_ENTRY_CLASS_NAME = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
  private static final String TAG = "MicroMsg.SDK.MMessageAct";
  
  public MMessageActV2()
  {
    GMTrace.i(805306368L, 6);
    GMTrace.o(805306368L, 6);
  }
  
  public static boolean send(Context paramContext, Args paramArgs)
  {
    GMTrace.i(939524096L, 7);
    if ((paramContext == null) || (paramArgs == null))
    {
      Log.e("MicroMsg.SDK.MMessageAct", "send fail, invalid argument");
      GMTrace.o(939524096L, 7);
      return false;
    }
    if (d.a(paramArgs.targetPkgName))
    {
      Log.e("MicroMsg.SDK.MMessageAct", "send fail, invalid targetPkgName, targetPkgName = " + paramArgs.targetPkgName);
      GMTrace.o(939524096L, 7);
      return false;
    }
    if (d.a(paramArgs.targetClassName)) {
      paramArgs.targetClassName = (paramArgs.targetPkgName + ".wxapi.WXEntryActivity");
    }
    Log.d("MicroMsg.SDK.MMessageAct", "send, targetPkgName = " + paramArgs.targetPkgName + ", targetClassName = " + paramArgs.targetClassName);
    Intent localIntent = new Intent();
    localIntent.setClassName(paramArgs.targetPkgName, paramArgs.targetClassName);
    if (paramArgs.bundle != null) {
      localIntent.putExtras(paramArgs.bundle);
    }
    String str = paramContext.getPackageName();
    localIntent.putExtra("_mmessage_sdkVersion", 620822528);
    localIntent.putExtra("_mmessage_appPackage", str);
    localIntent.putExtra("_mmessage_content", paramArgs.content);
    localIntent.putExtra("_mmessage_checksum", b.a(paramArgs.content, 620822528, str));
    if (paramArgs.flags == -1) {
      localIntent.addFlags(268435456).addFlags(134217728);
    }
    for (;;)
    {
      try
      {
        paramContext.startActivity(localIntent);
        Log.d("MicroMsg.SDK.MMessageAct", "send mm message, intent=" + localIntent);
        GMTrace.o(939524096L, 7);
        return true;
      }
      catch (Exception paramContext)
      {
        Log.e("MicroMsg.SDK.MMessageAct", "send fail, ex = " + paramContext.getMessage());
        GMTrace.o(939524096L, 7);
      }
      localIntent.setFlags(paramArgs.flags);
    }
    return false;
  }
  
  public static class Args
  {
    public static final int INVALID_FLAGS = -1;
    public Bundle bundle;
    public String content;
    public int flags;
    public String targetClassName;
    public String targetPkgName;
    
    public Args()
    {
      GMTrace.i(536870912L, 4);
      this.flags = -1;
      GMTrace.o(536870912L, 4);
    }
    
    public String toString()
    {
      GMTrace.i(671088640L, 5);
      String str = "targetPkgName:" + this.targetPkgName + ", targetClassName:" + this.targetClassName + ", content:" + this.content + ", flags:" + this.flags + ", bundle:" + this.bundle;
      GMTrace.o(671088640L, 5);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\channel\MMessageActV2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */