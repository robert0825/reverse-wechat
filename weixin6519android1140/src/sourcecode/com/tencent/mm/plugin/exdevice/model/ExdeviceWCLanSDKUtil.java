package com.tencent.mm.plugin.exdevice.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.dl;
import com.tencent.mm.g.a.dm;
import com.tencent.mm.g.a.dn;
import com.tencent.mm.g.a.do;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import org.json.JSONObject;

public final class ExdeviceWCLanSDKUtil
{
  BroadcastReceiver idj;
  boolean kzA;
  boolean kzB;
  boolean kzC;
  int kzD;
  public HashMap<String, byte[]> kzc;
  public HashMap<String, Boolean> kze;
  j.a kzf;
  j.a kzh;
  private int kzv;
  private int kzw;
  j.a kzx;
  j.a kzy;
  public HashMap<String, String> kzz;
  Context mContext;
  
  public ExdeviceWCLanSDKUtil()
  {
    GMTrace.i(10991626616832L, 81894);
    this.kzv = 0;
    this.kzw = 0;
    this.kzc = new HashMap();
    this.kze = new HashMap();
    this.kzz = new HashMap();
    this.mContext = null;
    this.kzA = false;
    this.kzB = false;
    this.kzC = false;
    this.kzA = true;
    this.kzB = true;
    this.kzc.clear();
    this.kze.clear();
    this.kzz.clear();
    this.mContext = ab.getContext();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    if (this.idj == null) {
      this.idj = new LanStateChangeReceiver();
    }
    this.mContext.registerReceiver(this.idj, localIntentFilter);
    this.kzx = new j.a()
    {
      public final void f(int paramAnonymousInt, Object... paramAnonymousVarArgs)
      {
        String str2 = null;
        String str1 = null;
        GMTrace.i(10963440893952L, 81684);
        if ((paramAnonymousInt != 10) || (paramAnonymousVarArgs == null))
        {
          GMTrace.o(10963440893952L, 81684);
          return;
        }
        paramAnonymousVarArgs = (byte[])paramAnonymousVarArgs[0];
        for (;;)
        {
          try
          {
            JSONObject localJSONObject = new JSONObject(new String(paramAnonymousVarArgs));
            localObject = localJSONObject.getJSONObject("deviceInfo");
            paramAnonymousVarArgs = ((JSONObject)localObject).getString("deviceType");
            str1 = str2;
            w.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", localException1, "", new Object[0]);
          }
          catch (Exception localException1)
          {
            try
            {
              str2 = ((JSONObject)localObject).getString("deviceId");
              localObject = str2;
              arrayOfObject = paramAnonymousVarArgs;
              str1 = str2;
              if (!localJSONObject.isNull("manufacturerData"))
              {
                str1 = str2;
                localObject = localJSONObject.getString("manufacturerData");
                str1 = str2;
                ExdeviceWCLanSDKUtil.this.kzz.put(str2, localObject);
                arrayOfObject = paramAnonymousVarArgs;
                localObject = str2;
              }
              if ((arrayOfObject != null) && (localObject != null)) {
                break;
              }
              w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "deviceType or deviceId is null in mWCLanDeviceDiscPackageCallbackReceiver! ");
              GMTrace.o(10963440893952L, 81684);
              return;
            }
            catch (Exception localException2)
            {
              Object localObject;
              Object[] arrayOfObject;
              for (;;) {}
            }
            localException1 = localException1;
            paramAnonymousVarArgs = null;
          }
          w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "json decode failed in disc package callback!");
          localObject = str1;
          arrayOfObject = paramAnonymousVarArgs;
        }
        GMTrace.o(10963440893952L, 81684);
      }
    };
    this.kzf = new j.a()
    {
      public final void f(int paramAnonymousInt, Object... paramAnonymousVarArgs)
      {
        Object localObject5 = null;
        GMTrace.i(10972970352640L, 81755);
        if ((paramAnonymousInt != 14) || (paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length <= 0) || (!(paramAnonymousVarArgs[0] instanceof byte[])))
        {
          GMTrace.o(10972970352640L, 81755);
          return;
        }
        paramAnonymousVarArgs = (byte[])paramAnonymousVarArgs[0];
        for (;;)
        {
          try
          {
            paramAnonymousVarArgs = new JSONObject(new String(paramAnonymousVarArgs)).getJSONObject("deviceInfo");
            Object localObject2;
          }
          catch (Exception localException1)
          {
            try
            {
              localObject1 = paramAnonymousVarArgs.getString("deviceType");
            }
            catch (Exception localException2)
            {
              for (;;)
              {
                Object localObject3;
                localObject1 = null;
                localObject4 = paramAnonymousVarArgs;
                paramAnonymousVarArgs = (Object[])localObject1;
              }
            }
            try
            {
              localObject4 = paramAnonymousVarArgs.getString("deviceId");
              localObject2 = localObject1;
              localObject1 = localObject4;
              localObject4 = paramAnonymousVarArgs;
              if ((localObject2 != null) && (localObject1 != null)) {
                break;
              }
              w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "deviceType or deviceId is null in mWCLanGetDeviceProfileCallbackReceiver! ");
              GMTrace.o(10972970352640L, 81755);
              return;
            }
            catch (Exception localException3)
            {
              localObject4 = paramAnonymousVarArgs;
              paramAnonymousVarArgs = (Object[])localObject1;
              break label131;
            }
            localException1 = localException1;
            localObject4 = null;
            paramAnonymousVarArgs = null;
          }
          label131:
          tmp139_136[0] = localException1;
          w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON decode failed in get device profile callback %s", tmp139_136);
          localObject1 = localObject5;
          localObject3 = paramAnonymousVarArgs;
        }
        w.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "get device deviceType =" + (String)localObject3 + ",deviceId = " + (String)localObject1);
        if (ad.atR().wT((String)localObject1) == null)
        {
          w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "hdInfo null, %s", new Object[] { localObject1 });
          GMTrace.o(10972970352640L, 81755);
          return;
        }
        ExdeviceWCLanSDKUtil.this.kzc.put(localObject1, ((JSONObject)localObject4).toString().getBytes());
        paramAnonymousVarArgs = new dn();
        paramAnonymousVarArgs.eFn.esG = ((String)localObject1);
        if (ExdeviceWCLanSDKUtil.this.kzz.containsKey(localObject1))
        {
          localObject3 = (String)ExdeviceWCLanSDKUtil.this.kzz.get(localObject1);
          if (!bg.nm((String)localObject3)) {
            paramAnonymousVarArgs.eFn.eFo = ((String)localObject3).getBytes();
          }
          ExdeviceWCLanSDKUtil.this.kzz.remove(localObject1);
        }
        paramAnonymousVarArgs.eFn.eFp = false;
        a.vgX.m(paramAnonymousVarArgs);
        GMTrace.o(10972970352640L, 81755);
      }
    };
    this.kzh = new j.a()
    {
      public final void f(int paramAnonymousInt, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(10985855254528L, 81851);
        if ((paramAnonymousInt != 13) || (paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length < 2) || (!(paramAnonymousVarArgs[0] instanceof String)) || (!(paramAnonymousVarArgs[1] instanceof Integer)))
        {
          GMTrace.o(10985855254528L, 81851);
          return;
        }
        Object localObject3 = (String)paramAnonymousVarArgs[0];
        paramAnonymousInt = ((Integer)paramAnonymousVarArgs[1]).intValue();
        Object localObject1 = null;
        paramAnonymousVarArgs = (Object[])localObject1;
        try
        {
          localObject3 = new JSONObject(new String((String)localObject3));
          paramAnonymousVarArgs = (Object[])localObject1;
          localObject1 = ((JSONObject)localObject3).getString("deviceId");
          paramAnonymousVarArgs = (Object[])localObject1;
          localObject3 = ((JSONObject)localObject3).getString("deviceType");
          paramAnonymousVarArgs = (Object[])localObject1;
          localObject1 = localObject3;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", localException, "", new Object[0]);
            w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON decode failed in device ConnState notify callback");
            Object localObject2 = null;
            continue;
            ExdeviceWCLanSDKUtil.this.kzD = 2;
            ExdeviceWCLanSDKUtil.this.kze.put(paramAnonymousVarArgs, Boolean.valueOf(true));
            w.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "device connect!");
          }
        }
        switch (paramAnonymousInt)
        {
        default: 
          ExdeviceWCLanSDKUtil.this.kzD = 0;
          ExdeviceWCLanSDKUtil.this.kze.put(paramAnonymousVarArgs, Boolean.valueOf(false));
          w.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "device disconnect!");
          if (ExdeviceWCLanSDKUtil.this.kzC)
          {
            if (ExdeviceWCLanSDKUtil.this.kzD == 2) {
              ExdeviceWCLanSDKUtil.this.f(true, paramAnonymousVarArgs);
            }
            localObject3 = new dl();
            ((dl)localObject3).eFk.esG = paramAnonymousVarArgs;
            ((dl)localObject3).eFk.eFl = ExdeviceWCLanSDKUtil.this.kzD;
            ((dl)localObject3).eFk.eEs = ((String)localObject1);
            a.vgX.m((b)localObject3);
          }
          GMTrace.o(10985855254528L, 81851);
          return;
        }
      }
    };
    this.kzy = new j.a()
    {
      public final void f(int paramAnonymousInt, Object... paramAnonymousVarArgs)
      {
        GMTrace.i(10937000001536L, 81487);
        if ((paramAnonymousInt != 16) || (paramAnonymousVarArgs == null) || (paramAnonymousVarArgs.length < 2) || (!(paramAnonymousVarArgs[0] instanceof String)) || (!(paramAnonymousVarArgs[1] instanceof byte[])))
        {
          GMTrace.o(10937000001536L, 81487);
          return;
        }
        Object localObject1 = (String)paramAnonymousVarArgs[0];
        byte[] arrayOfByte = (byte[])paramAnonymousVarArgs[1];
        for (;;)
        {
          try
          {
            localObject1 = new JSONObject(new String((String)localObject1));
            paramAnonymousVarArgs = ((JSONObject)localObject1).getString("deviceType");
            Object localObject2;
            w.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", localException1, "", new Object[0]);
          }
          catch (Exception localException1)
          {
            try
            {
              localObject2 = ((JSONObject)localObject1).getString("deviceId");
              localObject1 = paramAnonymousVarArgs;
              paramAnonymousVarArgs = (Object[])localObject2;
              localObject2 = new String(arrayOfByte);
              w.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "receive data = " + (String)localObject2);
              localObject2 = new dm();
              ((dm)localObject2).eFm.esG = paramAnonymousVarArgs;
              ((dm)localObject2).eFm.data = arrayOfByte;
              ((dm)localObject2).eFm.eEs = ((String)localObject1);
              a.vgX.m((b)localObject2);
              GMTrace.o(10937000001536L, 81487);
              return;
            }
            catch (Exception localException2)
            {
              Object[] arrayOfObject;
              for (;;) {}
            }
            localException1 = localException1;
            paramAnonymousVarArgs = null;
          }
          w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON decode failed in receive notify callback");
          arrayOfObject = paramAnonymousVarArgs;
          paramAnonymousVarArgs = null;
        }
      }
    };
    GMTrace.o(10991626616832L, 81894);
  }
  
  public final boolean V(String paramString, boolean paramBoolean)
  {
    GMTrace.i(10991895052288L, 81896);
    Object localObject;
    if ((paramString != null) && (this.kzc.containsKey(paramString)))
    {
      localObject = (byte[])this.kzc.get(paramString);
      this.kzC = true;
      if (!paramBoolean) {}
    }
    else
    {
      String str;
      try
      {
        str = new JSONObject(new String((byte[])localObject)).getString("deviceType");
        w.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "connectWCLanDevice deviceId: " + paramString);
        if (Java2CExDevice.connectWCLanDevice((byte[])localObject, false) == 0) {
          break label161;
        }
        w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "connectWCLanDevice error!");
        GMTrace.o(10991895052288L, 81896);
        return false;
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", paramString, "", new Object[0]);
        w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON decode failed in connectWCLanDevice!");
        GMTrace.o(10991895052288L, 81896);
        return false;
      }
      w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "mDevClassInfo is null in connectWCLanDevice");
      GMTrace.o(10991895052288L, 81896);
      return false;
      label161:
      localObject = new dl();
      ((dl)localObject).eFk.esG = paramString;
      ((dl)localObject).eFk.eFl = 1;
      ((dl)localObject).eFk.eEs = str;
      a.vgX.m((b)localObject);
    }
    for (;;)
    {
      GMTrace.o(10991895052288L, 81896);
      return true;
      f(false, paramString);
      w.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "disconnectWCLanDevice...");
      Java2CExDevice.disconnectWCLanDevice((byte[])localObject);
    }
  }
  
  public final boolean bX(String paramString1, String paramString2)
  {
    GMTrace.i(10992029270016L, 81897);
    if (!wG(paramString1))
    {
      w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "deviceId " + paramString1 + " not connected!");
      GMTrace.o(10992029270016L, 81897);
      return false;
    }
    if ((paramString1 != null) && (this.kzc.containsKey(paramString1)))
    {
      paramString1 = (byte[])this.kzc.get(paramString1);
      this.kzv = 0;
    }
    for (;;)
    {
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("data", paramString2);
        paramString2 = new JSONObject();
        paramString2.put("wxmsg_jsapi", localJSONObject);
        localJSONObject = new JSONObject();
        localJSONObject.put("services", paramString2);
        this.kzv = Java2CExDevice.useWCLanDeviceService(paramString1, localJSONObject.toString().getBytes());
        if (this.kzv == 0) {
          break label247;
        }
        bool = true;
        w.d("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "get useWCLanDeviceService mCallBackCmdId =" + this.kzv);
        GMTrace.o(10992029270016L, 81897);
        return bool;
      }
      catch (Exception paramString1)
      {
        w.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", paramString1, "", new Object[0]);
        w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON encode failed in useWCLanDeviceService");
        GMTrace.o(10992029270016L, 81897);
        return false;
      }
      w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "mDevClassInfo is null in useWCLanDeviceService");
      GMTrace.o(10992029270016L, 81897);
      return false;
      label247:
      w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "useWCLanDeviceService error!");
      boolean bool = false;
    }
  }
  
  public final boolean f(boolean paramBoolean, String paramString)
  {
    GMTrace.i(10991760834560L, 81895);
    if ((paramString != null) && (this.kzc.containsKey(paramString))) {
      paramString = (byte[])this.kzc.get(paramString);
    }
    for (;;)
    {
      try
      {
        JSONObject localJSONObject2 = new JSONObject();
        if (paramBoolean)
        {
          w.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "open device!");
          localJSONObject2.put("cmd", "open");
          JSONObject localJSONObject1 = new JSONObject();
          localJSONObject1.put("wxmsg_jsapi", localJSONObject2);
          localJSONObject2 = new JSONObject();
          localJSONObject2.put("services", localJSONObject1);
          this.kzw = Java2CExDevice.useWCLanDeviceService(paramString, localJSONObject2.toString().getBytes());
          if (this.kzw != 0)
          {
            w.d("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "get openOrCloseDevice mCallBackCmdId =" + this.kzw);
            GMTrace.o(10991760834560L, 81895);
            return true;
            w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "mDevClassInfo is null in openOrCloseDevice");
            GMTrace.o(10991760834560L, 81895);
            return false;
          }
        }
        else
        {
          w.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "close device!");
          localJSONObject2.put("cmd", "close");
          continue;
        }
        w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "openOrCloseDevice error!");
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", paramString, "", new Object[0]);
        w.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON encode failed in openOrCloseDevice");
        GMTrace.o(10991760834560L, 81895);
        return false;
      }
    }
  }
  
  public final boolean wG(String paramString)
  {
    GMTrace.i(10992163487744L, 81898);
    if ((paramString != null) && (this.kze.containsKey(paramString)))
    {
      boolean bool = ((Boolean)this.kze.get(paramString)).booleanValue();
      GMTrace.o(10992163487744L, 81898);
      return bool;
    }
    GMTrace.o(10992163487744L, 81898);
    return false;
  }
  
  public class LanStateChangeReceiver
    extends BroadcastReceiver
  {
    public LanStateChangeReceiver()
    {
      GMTrace.i(10936328912896L, 81482);
      GMTrace.o(10936328912896L, 81482);
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(10936463130624L, 81483);
      if ("android.net.wifi.STATE_CHANGE".equals(paramIntent.getAction()))
      {
        paramContext = paramIntent.getParcelableExtra("networkInfo");
        if (paramContext != null) {
          if (((NetworkInfo)paramContext).getState() != NetworkInfo.State.CONNECTED) {
            break label137;
          }
        }
      }
      label137:
      for (boolean bool = true;; bool = false)
      {
        w.d("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "isConnected =" + bool);
        if ((ExdeviceWCLanSDKUtil.this.kzB) || (ExdeviceWCLanSDKUtil.this.kzA != bool))
        {
          paramContext = new do();
          paramContext.eFq.eFr = bool;
          a.vgX.m(paramContext);
          ExdeviceWCLanSDKUtil.this.kzB = false;
          ExdeviceWCLanSDKUtil.this.kzA = bool;
        }
        GMTrace.o(10936463130624L, 81483);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\ExdeviceWCLanSDKUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */