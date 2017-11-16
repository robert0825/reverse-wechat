package com.tencent.recovery;

import android.content.Context;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.CommonOptions.Builder;
import com.tencent.recovery.option.IOptionsCreator;
import com.tencent.recovery.option.ProcessOptions;
import com.tencent.recovery.util.Util;
import com.tencent.recovery.wx.WXConstantsRecovery;
import com.tencent.recovery.wx.service.WXRecoveryHandleService;
import com.tencent.recovery.wx.service.WXRecoveryUploadService;
import com.tencent.recovery.wx.util.FileUtil;
import com.tencent.recovery.wx.util.WXUtil;
import java.io.File;

public class DefaultOptionsCreator
  implements IOptionsCreator
{
  private String clientVersion;
  
  private String getClientVersion()
  {
    if (Util.nm(this.clientVersion))
    {
      File localFile = new File(WXConstantsRecovery.xPX, "version.info");
      if (localFile.exists()) {
        this.clientVersion = FileUtil.H(localFile);
      }
    }
    if (Util.nm(this.clientVersion)) {
      this.clientVersion = "0x26051334";
    }
    return this.clientVersion;
  }
  
  public CommonOptions createCommonOptions(Context paramContext)
  {
    CommonOptions.Builder localBuilder = new CommonOptions.Builder();
    localBuilder.xPL = WXRecoveryHandleService.class.getName();
    localBuilder.xPM = WXRecoveryUploadService.class.getName();
    localBuilder.clientVersion = getClientVersion();
    localBuilder.xPH = String.format("http://dldir1.qq.com/weixin/android/recovery-%s.conf", new Object[] { getClientVersion() });
    localBuilder.lOv = WXUtil.fT(paramContext);
    localBuilder.xPN = true;
    localBuilder.xPO = 600000L;
    localBuilder.xPP = 600000L;
    return localBuilder.cnm();
  }
  
  public ProcessOptions createProcessOptions(String paramString, int paramInt)
  {
    return null;
  }
  
  public String toString()
  {
    return String.format("Creator: [ClientVersion=%s]", new Object[] { getClientVersion() });
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\DefaultOptionsCreator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */