package com.tencent.mm.plugin.exdevice.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public class ExDeviceService
  extends Service
{
  private h.a kCV;
  
  public ExDeviceService()
  {
    GMTrace.i(11178323476480L, 83285);
    this.kCV = null;
    GMTrace.o(11178323476480L, 83285);
  }
  
  private static boolean aui()
  {
    GMTrace.i(11178726129664L, 83288);
    PackageManager localPackageManager = ab.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app.cn", 1);
      localPackageManager.getPackageInfo("com.google.android.wearable.app", 1);
      bool = true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        boolean bool = false;
      }
    }
    w.i("MicroMsg.exdevice.ExDeviceService", "isInstallWearApp %b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(11178726129664L, 83288);
    return bool;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(11178994565120L, 83290);
    w.i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onBind");
    if (this.kCV == null) {
      this.kCV = new y();
    }
    paramIntent = this.kCV;
    GMTrace.o(11178994565120L, 83290);
    return paramIntent;
  }
  
  public void onCreate()
  {
    GMTrace.i(11178457694208L, 83286);
    w.i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onCreate");
    super.onCreate();
    GMTrace.o(11178457694208L, 83286);
  }
  
  public void onDestroy()
  {
    GMTrace.i(11178591911936L, 83287);
    w.i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onDestroy");
    Java2CExDevice.closeBluetoothAccessoryLib();
    super.onDestroy();
    if (!aui())
    {
      w.i("MicroMsg.exdevice.ExDeviceService", "kill exdevice process now");
      Process.killProcess(Process.myPid());
    }
    GMTrace.o(11178591911936L, 83287);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\ExDeviceService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */