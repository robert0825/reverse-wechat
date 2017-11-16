package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.Iterator;
import java.util.Set;

public final class l
  implements ITXLivePlayListener
{
  boolean fVS;
  TXCloudVideoView ifM;
  private TXLivePlayConfig ifN;
  TXLivePlayer ifO;
  ITXLivePlayListener ifP;
  String ifQ;
  boolean ifR;
  private String ifS;
  private String ifT;
  private int ifU;
  private int ifV;
  boolean ifW;
  private boolean ifX;
  private boolean ify;
  private Context mContext;
  private int mMode;
  private boolean mMute;
  int mPlayType;
  
  public l(Context paramContext)
  {
    GMTrace.i(20723754074112L, 154404);
    this.ifQ = "";
    this.mPlayType = 0;
    this.fVS = false;
    this.ifR = false;
    this.mMode = 1;
    this.mMute = false;
    this.ifS = "vertical";
    this.ifT = "fillCrop";
    this.ifU = 1;
    this.ifV = 3;
    this.ifW = true;
    this.ify = false;
    this.ifX = false;
    this.mContext = paramContext;
    this.ifN = new TXLivePlayConfig();
    this.ifO = new TXLivePlayer(this.mContext);
    this.ifO.setConfig(this.ifN);
    this.ifO.setPlayListener(this);
    this.ifO.enableHardwareDecode(true);
    GMTrace.o(20723754074112L, 154404);
  }
  
  static void b(String paramString, Bundle paramBundle)
  {
    GMTrace.i(20724559380480L, 154410);
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.equalsIgnoreCase("playUrl")) || (str.equalsIgnoreCase("orientation")) || (str.equalsIgnoreCase("objectFit"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getString(str);
      } else if ((str.equalsIgnoreCase("mode")) || (str.equalsIgnoreCase("playType")) || (str.equalsIgnoreCase("minCache")) || (str.equalsIgnoreCase("maxCache"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getInt(str);
      } else if ((str.equalsIgnoreCase("hide")) || (str.equalsIgnoreCase("autoplay")) || (str.equalsIgnoreCase("muted")) || (str.equalsIgnoreCase("backgroundMute")) || (str.equalsIgnoreCase("needEvent")) || (str.equalsIgnoreCase("debug"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getBoolean(str);
      }
    }
    w.i("TXLivePlayerJSAdapter", paramString);
    GMTrace.o(20724559380480L, 154410);
  }
  
  public final void onNetStatus(Bundle paramBundle)
  {
    GMTrace.i(20724156727296L, 154407);
    GMTrace.o(20724156727296L, 154407);
  }
  
  public final void onPlayEvent(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(20724022509568L, 154406);
    if ((paramInt == 2006) || (paramInt == 63235)) {
      qv("stop");
    }
    if ((this.ify) && (this.ifP != null)) {
      this.ifP.onPlayEvent(paramInt, paramBundle);
    }
    GMTrace.o(20724022509568L, 154406);
  }
  
  public final j qv(String paramString)
  {
    GMTrace.i(20723888291840L, 154405);
    if (paramString == null)
    {
      paramString = new j(-1, "invalid params");
      GMTrace.o(20723888291840L, 154405);
      return paramString;
    }
    w.i("TXLivePlayerJSAdapter", "operateLivePlayer: " + paramString);
    if (!this.fVS)
    {
      paramString = new j(-3, "uninited livePlayer");
      GMTrace.o(20723888291840L, 154405);
      return paramString;
    }
    if (paramString.equalsIgnoreCase("play")) {
      this.ifO.startPlay(this.ifQ, this.mPlayType);
    }
    for (;;)
    {
      paramString = new j();
      GMTrace.o(20723888291840L, 154405);
      return paramString;
      if (paramString.equalsIgnoreCase("stop"))
      {
        this.ifO.stopPlay(true);
      }
      else if (paramString.equalsIgnoreCase("pause"))
      {
        this.ifO.stopPlay(true);
      }
      else if (paramString.equalsIgnoreCase("resume"))
      {
        this.ifO.startPlay(this.ifQ, this.mPlayType);
      }
      else
      {
        if (!paramString.equalsIgnoreCase("mute")) {
          break;
        }
        this.ifO.setMute(true);
      }
    }
    paramString = new j(-4, "invalid operate command");
    GMTrace.o(20723888291840L, 154405);
    return paramString;
  }
  
  final int x(Bundle paramBundle)
  {
    GMTrace.i(20724290945024L, 154408);
    this.mMode = paramBundle.getInt("mode", this.mMode);
    if (this.mMode == 1)
    {
      if (this.ifQ == null)
      {
        GMTrace.o(20724290945024L, 154408);
        return 0;
      }
      if (this.ifQ.startsWith("rtmp://"))
      {
        GMTrace.o(20724290945024L, 154408);
        return 0;
      }
      if (((this.ifQ.startsWith("http://")) || (this.ifQ.startsWith("https://"))) && (this.ifQ.contains(".flv")))
      {
        GMTrace.o(20724290945024L, 154408);
        return 1;
      }
      GMTrace.o(20724290945024L, 154408);
      return 0;
    }
    GMTrace.o(20724290945024L, 154408);
    return 5;
  }
  
  final void y(Bundle paramBundle)
  {
    GMTrace.i(20724425162752L, 154409);
    this.mMute = paramBundle.getBoolean("muted", this.mMute);
    this.ifO.setMute(this.mMute);
    this.ifS = paramBundle.getString("orientation", this.ifS);
    if (this.ifS.equalsIgnoreCase("horizontal"))
    {
      this.ifO.setRenderRotation(270);
      this.ifT = paramBundle.getString("objectFit", this.ifT);
      if (!this.ifT.equalsIgnoreCase("fillCrop")) {
        break label262;
      }
      this.ifO.setRenderMode(0);
    }
    for (;;)
    {
      this.ifW = paramBundle.getBoolean("backgroundMute", this.ifW);
      this.ifU = paramBundle.getInt("minCache", this.ifU);
      this.ifV = paramBundle.getInt("maxCache", this.ifV);
      this.ifN.setAutoAdjustCacheTime(true);
      this.ifN.setMinAutoAdjustCacheTime(this.ifU);
      this.ifN.setMaxAutoAdjustCacheTime(this.ifV);
      this.ifO.setConfig(this.ifN);
      this.ify = paramBundle.getBoolean("needEvent", this.ify);
      this.ifX = paramBundle.getBoolean("debug", this.ifX);
      this.ifM.showLog(this.ifX);
      GMTrace.o(20724425162752L, 154409);
      return;
      if (!this.ifS.equalsIgnoreCase("vertical")) {
        break;
      }
      this.ifO.setRenderRotation(0);
      break;
      label262:
      if (this.ifT.equalsIgnoreCase("contain")) {
        this.ifO.setRenderMode(1);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */