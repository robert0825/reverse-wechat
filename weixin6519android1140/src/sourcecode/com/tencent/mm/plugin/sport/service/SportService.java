package com.tencent.mm.plugin.sport.service;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.IBinder;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sport.PluginSport;
import com.tencent.mm.plugin.sport.a.a.a;
import com.tencent.mm.plugin.sport.c.c;
import com.tencent.mm.plugin.sport.c.f;
import com.tencent.mm.plugin.sport.c.g;
import com.tencent.mm.plugin.sport.c.j;
import com.tencent.mm.plugin.sport.c.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public class SportService
  extends Service
  implements c
{
  private SensorManager gXR;
  private j qqS;
  private boolean qqT;
  private final a.a qqU;
  private Sensor sensor;
  
  public SportService()
  {
    GMTrace.i(16740708777984L, 124728);
    this.qqT = false;
    this.qqU = new a.a()
    {
      public final void H(int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(16740306124800L, 124725);
        ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getSportFileStorage().setLong(paramAnonymousInt, paramAnonymousLong);
        GMTrace.o(16740306124800L, 124725);
      }
      
      public final void Jt(String paramAnonymousString)
      {
        GMTrace.i(16740037689344L, 124723);
        f.Ju(paramAnonymousString);
        if (!SportService.this.bri()) {
          SportService.this.stopSelf();
        }
        GMTrace.o(16740037689344L, 124723);
      }
      
      public final long bqO()
      {
        GMTrace.i(16739903471616L, 124722);
        try
        {
          long l1 = bg.bQR() / 10000L;
          long l2 = com.tencent.mm.plugin.sport.c.h.vO(202);
          long l3 = com.tencent.mm.plugin.sport.c.h.vO(201);
          long l4 = j.bre();
          int i = (int)j.brd();
          if (l4 == l1)
          {
            w.i("MicroMsg.Sport.SportService", "cacheTime %s cacheStep:%s", new Object[] { Long.valueOf(l4), Integer.valueOf(i) });
            l1 = i;
            GMTrace.o(16739903471616L, 124722);
            return l1;
          }
          if (l2 == l1)
          {
            w.i("MicroMsg.Sport.SportService", "saveTime %s saveStep:%s", new Object[] { Long.valueOf(l2), Long.valueOf(l3) });
            l1 = (int)l3;
            GMTrace.o(16739903471616L, 124722);
            return l1;
          }
          w.i("MicroMsg.Sport.SportService", "getStepCount:0, new day");
          w.i("MicroMsg.Sport.SportService", "saveTime:%s, cacheTime: %S, beginOfToday:%s", new Object[] { Long.valueOf(l2), Long.valueOf(l4), Long.valueOf(l1) });
          GMTrace.o(16739903471616L, 124722);
          return 0L;
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.Sport.SportService", localException, "exception in :exdevice getTodayDeviceStepCount", new Object[0]);
          GMTrace.o(16739903471616L, 124722);
        }
        return 0L;
      }
      
      public final void bqP()
      {
        GMTrace.i(16740171907072L, 124724);
        GMTrace.o(16740171907072L, 124724);
      }
      
      public final void clearConfig()
      {
        GMTrace.i(16740574560256L, 124727);
        ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getSportFileStorage().reset();
        Process.killProcess(Process.myPid());
        GMTrace.o(16740574560256L, 124727);
      }
      
      public final long getLong(int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(16740440342528L, 124726);
        paramAnonymousLong = ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getSportFileStorage().getLong(paramAnonymousInt, paramAnonymousLong);
        GMTrace.o(16740440342528L, 124726);
        return paramAnonymousLong;
      }
    };
    GMTrace.o(16740708777984L, 124728);
  }
  
  private boolean brg()
  {
    GMTrace.i(16741111431168L, 124731);
    try
    {
      if (this.gXR == null) {
        this.gXR = ((SensorManager)getSystemService("sensor"));
      }
      if (this.qqS == null)
      {
        this.qqS = new j();
        this.qqS.qqR = this;
      }
      if ((this.gXR != null) && (getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter")))
      {
        this.sensor = this.gXR.getDefaultSensor(19);
        if (this.sensor == null)
        {
          w.i("MicroMsg.Sport.SportService", " TYPE_STEP_COUNTER sensor null");
          GMTrace.o(16741111431168L, 124731);
          return false;
        }
        JSONObject localJSONObject = f.bra();
        boolean bool = this.gXR.registerListener(this.qqS, this.sensor, localJSONObject.optInt("stepCounterRateUs", 60000));
        if (!bool) {
          brh();
        }
        w.i("MicroMsg.Sport.SportService", "registerDetector() ok.(result : %s)", new Object[] { Boolean.valueOf(bool) });
        GMTrace.o(16741111431168L, 124731);
        return bool;
      }
      w.i("MicroMsg.Sport.SportService", "no step sensor");
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.Sport.SportService", "Exception in registerDetector %s", new Object[] { localException.getMessage() });
      }
    }
    GMTrace.o(16741111431168L, 124731);
    return false;
  }
  
  private void brh()
  {
    GMTrace.i(16741245648896L, 124732);
    try
    {
      if (this.gXR == null) {
        this.gXR = ((SensorManager)getSystemService("sensor"));
      }
      this.gXR.unregisterListener(this.qqS);
      w.i("MicroMsg.Sport.SportService", "unregisterDetector() success!");
      GMTrace.o(16741245648896L, 124732);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.Sport.SportService", "Exception in unregisterDetector %s", new Object[] { localException.getMessage() });
      GMTrace.o(16741245648896L, 124732);
    }
  }
  
  public final void bqY()
  {
    GMTrace.i(16741648302080L, 124735);
    brh();
    GMTrace.o(16741648302080L, 124735);
  }
  
  public final boolean bri()
  {
    GMTrace.i(16741514084352L, 124734);
    this.qqT = k.dh(this);
    if (this.qqT)
    {
      brh();
      boolean bool = brg();
      GMTrace.o(16741514084352L, 124734);
      return bool;
    }
    GMTrace.o(16741514084352L, 124734);
    return false;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(16740977213440L, 124730);
    paramIntent = this.qqU;
    GMTrace.o(16740977213440L, 124730);
    return paramIntent;
  }
  
  public void onCreate()
  {
    GMTrace.i(16740842995712L, 124729);
    super.onCreate();
    w.i("MicroMsg.Sport.SportService", "onCreate");
    this.qqT = k.dh(this);
    w.i("MicroMsg.Sport.SportService", "isSupportDeviceStep %b", new Object[] { Boolean.valueOf(this.qqT) });
    if (this.qqT)
    {
      brg();
      GMTrace.o(16740842995712L, 124729);
      return;
    }
    w.i("MicroMsg.Sport.SportService", "stop self");
    stopSelf();
    GMTrace.o(16740842995712L, 124729);
  }
  
  public void onDestroy()
  {
    GMTrace.i(16741379866624L, 124733);
    w.i("MicroMsg.Sport.SportService", "onDestroy");
    if (this.qqT) {
      brh();
    }
    super.onDestroy();
    GMTrace.o(16741379866624L, 124733);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    GMTrace.i(16741782519808L, 124736);
    w.i("MicroMsg.Sport.SportService", "onStartCommand");
    try
    {
      if (this.qqT)
      {
        if (this.qqS != null) {
          this.qqS.qqR = this;
        }
        boolean bool = bri();
        if (bool)
        {
          GMTrace.o(16741782519808L, 124736);
          return 1;
        }
      }
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.Sport.SportService", localException, "Exception onStartCommand %s", new Object[0]);
      paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
      GMTrace.o(16741782519808L, 124736);
    }
    return paramInt1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\service\SportService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */