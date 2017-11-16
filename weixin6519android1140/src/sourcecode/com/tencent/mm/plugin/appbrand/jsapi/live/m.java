package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.Iterator;
import java.util.Set;

public final class m
  extends PhoneStateListener
  implements ITXLivePushListener
{
  boolean fVS;
  TXCloudVideoView ifM;
  private String ifS;
  private boolean ifX;
  private TXLivePushConfig ifY;
  TXLivePusher ifZ;
  private boolean ify;
  ITXLivePushListener iga;
  String igb;
  boolean igc;
  private int igd;
  private int ige;
  private int igf;
  private int igg;
  private boolean igh;
  private String igi;
  private int igj;
  private int igk;
  private String igl;
  private boolean igm;
  Context mContext;
  private boolean mFrontCamera;
  private int mMode;
  private boolean mMute;
  
  public m(Context paramContext)
  {
    GMTrace.i(20720130195456L, 154377);
    this.fVS = false;
    this.mFrontCamera = true;
    this.igc = false;
    this.mMode = 1;
    this.igd = 2;
    this.ige = -1;
    this.igf = -1;
    this.mMute = false;
    this.igg = 0;
    this.igh = true;
    this.ifS = "vertical";
    this.igi = "low";
    this.igj = 5;
    this.igk = 5;
    this.igl = "";
    this.igm = false;
    this.ify = false;
    this.ifX = false;
    this.mContext = paramContext;
    this.ifY = new TXLivePushConfig();
    this.ifZ = new TXLivePusher(paramContext);
    this.ifZ.setConfig(this.ifY);
    this.ifZ.setPushListener(this);
    GMTrace.o(20720130195456L, 154377);
  }
  
  static void b(String paramString, Bundle paramBundle)
  {
    GMTrace.i(20720801284096L, 154382);
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.equalsIgnoreCase("pushUrl")) || (str.equalsIgnoreCase("orientation")) || (str.equalsIgnoreCase("backgroundImage")) || (str.equalsIgnoreCase("audioQuality"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getString(str);
      } else if ((str.equalsIgnoreCase("mode")) || (str.equalsIgnoreCase("focusMode")) || (str.equalsIgnoreCase("beauty")) || (str.equalsIgnoreCase("whiteness")) || (str.equalsIgnoreCase("aspect")) || (str.equalsIgnoreCase("minBitrate")) || (str.equalsIgnoreCase("maxBitrate"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getInt(str);
      } else if ((str.equalsIgnoreCase("hide")) || (str.equalsIgnoreCase("autopush")) || (str.equalsIgnoreCase("muted")) || (str.equalsIgnoreCase("enableCamera")) || (str.equalsIgnoreCase("backgroundMute")) || (str.equalsIgnoreCase("needEvent")) || (str.equalsIgnoreCase("debug"))) {
        paramString = paramString + "\n" + str + " = " + paramBundle.getBoolean(str);
      }
    }
    w.i("TXLivePusherJSAdapter", paramString);
    GMTrace.o(20720801284096L, 154382);
  }
  
  final void c(Bundle paramBundle, boolean paramBoolean)
  {
    GMTrace.i(20720667066368L, 154381);
    int i1 = paramBundle.getInt("mode", this.mMode);
    if ((paramBoolean) || (i1 != this.mMode)) {}
    int k;
    int m;
    int j;
    int n;
    int i;
    switch (i1)
    {
    default: 
      k = this.ige;
      m = this.igf;
      j = paramBundle.getInt("minBitrate", -1);
      n = paramBundle.getInt("maxBitrate", -1);
      if ((j != -1) && (n != -1))
      {
        i = j;
        if (j < 200) {
          i = 200;
        }
        j = n;
        if (n > 1000) {
          j = 1000;
        }
        if (i <= j) {
          k = i;
        }
      }
      break;
    }
    for (;;)
    {
      n = paramBundle.getInt("aspect", this.igd);
      String str1 = paramBundle.getString("audioQuality", this.igi);
      label201:
      label258:
      int i2;
      Object localObject;
      boolean bool1;
      label284:
      boolean bool2;
      label317:
      label360:
      int i3;
      int i4;
      String str2;
      if (i1 == 6)
      {
        if (n == 1)
        {
          this.ifY.setVideoResolution(13);
          if ((k != -1) && (j != -1) && (k <= j))
          {
            this.ifY.setMinVideoBitrate(k);
            this.ifY.setMaxVideoBitrate(j);
          }
          if (!str1.equalsIgnoreCase("low")) {
            break label908;
          }
          this.ifY.setAudioSampleRate(16000);
        }
      }
      else
      {
        i2 = paramBundle.getInt("focusMode", this.igg);
        localObject = this.ifY;
        if (i2 == 0) {
          break label932;
        }
        bool1 = true;
        ((TXLivePushConfig)localObject).setTouchFocus(bool1);
        bool2 = paramBundle.getBoolean("enableCamera", this.igh);
        localObject = this.ifY;
        if (bool2) {
          break label938;
        }
        bool1 = true;
        ((TXLivePushConfig)localObject).enablePureAudioPush(bool1);
        localObject = paramBundle.getString("orientation", this.ifS);
        i = 0;
        if (!((String)localObject).equalsIgnoreCase("horizontal")) {
          break label944;
        }
        this.ifY.setHomeOrientation(0);
        i = 90;
        i3 = paramBundle.getInt("beauty", this.igj);
        i4 = paramBundle.getInt("whiteness", this.igk);
        this.ifY.setBeautyFilter(i3, i4, 5);
        str2 = paramBundle.getString("backgroundImage", this.igl);
        Bitmap localBitmap = BitmapFactory.decodeFile(str2);
        if (localBitmap != null) {
          this.ifY.setPauseImg(localBitmap);
        }
        bool1 = paramBundle.getBoolean("backgroundMute", this.igm);
        if (!bool1) {
          break label967;
        }
        this.ifY.setPauseFlag(3);
      }
      for (;;)
      {
        m = 0;
        if ((n != this.igd) || (k != this.ige) || (j != this.igf) || (i2 != this.igg) || (bool2 != this.igh) || (i3 != this.igj) || (i4 != this.igk) || (bool1 != this.igm) || (!str2.equalsIgnoreCase(this.igl)) || (!((String)localObject).equalsIgnoreCase(this.ifS)) || (!str1.equalsIgnoreCase(this.igi))) {
          m = 1;
        }
        if ((paramBoolean) || (m != 0))
        {
          this.ifZ.setConfig(this.ifY);
          this.ifZ.setRenderRotation(i);
        }
        if ((!((String)localObject).equalsIgnoreCase(this.ifS)) && (this.ifZ.isPushing()))
        {
          this.ifZ.stopCameraPreview(true);
          this.ifZ.startCameraPreview(this.ifM);
        }
        this.mMode = i1;
        this.igd = n;
        this.igg = i2;
        this.igh = bool2;
        this.ifS = ((String)localObject);
        this.igj = i3;
        this.igk = i4;
        this.igm = bool1;
        this.igl = str2;
        this.ige = k;
        this.igf = j;
        this.igi = str1;
        this.ify = paramBundle.getBoolean("needEvent", this.ify);
        bool1 = paramBundle.getBoolean("muted", this.mMute);
        if ((paramBoolean) || (bool1 != this.mMute)) {
          this.ifZ.setMute(bool1);
        }
        this.mMute = bool1;
        bool1 = paramBundle.getBoolean("debug", this.ifX);
        if ((paramBoolean) || (bool1 != this.ifX)) {
          this.ifM.showLog(bool1);
        }
        this.ifX = bool1;
        GMTrace.o(20720667066368L, 154381);
        return;
        this.ifZ.setVideoQuality(1, false, false);
        break;
        this.ifZ.setVideoQuality(2, true, false);
        break;
        this.ifZ.setVideoQuality(3, true, false);
        break;
        this.ifZ.setVideoQuality(4, true, false);
        break;
        this.ifZ.setVideoQuality(5, true, false);
        break;
        this.ifZ.setVideoQuality(6, false, false);
        break;
        if (n != 2) {
          break label201;
        }
        this.ifY.setVideoResolution(0);
        break label201;
        label908:
        if (!str1.equalsIgnoreCase("high")) {
          break label258;
        }
        this.ifY.setAudioSampleRate(48000);
        break label258;
        label932:
        bool1 = false;
        break label284;
        label938:
        bool1 = false;
        break label317;
        label944:
        if (!((String)localObject).equalsIgnoreCase("vertical")) {
          break label360;
        }
        this.ifY.setHomeOrientation(1);
        i = 0;
        break label360;
        label967:
        this.ifY.setPauseFlag(1);
      }
      j = m;
    }
  }
  
  public final void onCallStateChanged(int paramInt, String paramString)
  {
    boolean bool2 = true;
    GMTrace.i(21058761523200L, 156900);
    super.onCallStateChanged(paramInt, paramString);
    if ((this.ifZ != null) && (this.ifZ.isPushing())) {}
    boolean bool1;
    switch (paramInt)
    {
    default: 
      GMTrace.o(21058761523200L, 156900);
      return;
    case 1: 
      paramString = this.ifZ;
      bool1 = bool2;
    }
    for (;;)
    {
      paramString.setMute(bool1);
      break;
      paramString = this.ifZ;
      bool1 = bool2;
      continue;
      TXLivePusher localTXLivePusher = this.ifZ;
      bool1 = bool2;
      paramString = localTXLivePusher;
      if (!this.mMute)
      {
        bool1 = bool2;
        paramString = localTXLivePusher;
        if (!this.igm)
        {
          bool1 = false;
          paramString = localTXLivePusher;
        }
      }
    }
  }
  
  public final void onNetStatus(Bundle paramBundle)
  {
    GMTrace.i(20720532848640L, 154380);
    GMTrace.o(20720532848640L, 154380);
  }
  
  public final void onPushEvent(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(20720398630912L, 154379);
    if (paramInt == 64229) {
      qw("stop");
    }
    if ((this.ify) && (this.iga != null)) {
      this.iga.onPushEvent(paramInt, paramBundle);
    }
    GMTrace.o(20720398630912L, 154379);
  }
  
  public final j qw(String paramString)
  {
    GMTrace.i(20720264413184L, 154378);
    if (paramString == null)
    {
      paramString = new j(-1, "invalid params");
      GMTrace.o(20720264413184L, 154378);
      return paramString;
    }
    w.i("TXLivePusherJSAdapter", "operateLivePusher: " + paramString);
    if (paramString.equalsIgnoreCase("switchCamera")) {
      if (this.mFrontCamera) {
        break label124;
      }
    }
    label124:
    for (boolean bool = true;; bool = false)
    {
      this.mFrontCamera = bool;
      this.ifY.setFrontCamera(this.mFrontCamera);
      if (this.fVS) {
        break;
      }
      paramString = new j(-3, "uninited livePusher");
      GMTrace.o(20720264413184L, 154378);
      return paramString;
    }
    if (paramString.equalsIgnoreCase("start")) {
      if ((this.igb != null) && (!this.igb.isEmpty()) && (!this.ifZ.isPushing()))
      {
        this.ifM.setVisibility(0);
        this.ifZ.startCameraPreview(this.ifM);
        this.ifZ.startPusher(this.igb);
      }
    }
    for (;;)
    {
      paramString = new j();
      GMTrace.o(20720264413184L, 154378);
      return paramString;
      if (paramString.equalsIgnoreCase("stop"))
      {
        this.ifZ.stopCameraPreview(true);
        this.ifZ.stopPusher();
      }
      else if (paramString.equalsIgnoreCase("pause"))
      {
        this.ifZ.pausePusher();
      }
      else if (paramString.equalsIgnoreCase("resume"))
      {
        this.ifZ.resumePusher();
      }
      else
      {
        if (!paramString.equalsIgnoreCase("switchCamera")) {
          break;
        }
        this.ifZ.switchCamera();
      }
    }
    paramString = new j(-4, "invalid operate command");
    GMTrace.o(20720264413184L, 154378);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */