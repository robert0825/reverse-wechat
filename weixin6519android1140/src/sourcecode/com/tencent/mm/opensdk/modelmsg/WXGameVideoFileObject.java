package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;
import java.io.File;

public class WXGameVideoFileObject
  implements WXMediaMessage.IMediaObject
{
  private static final int FILE_SIZE_LIMIT = 10485760;
  private static final String TAG = "MicroMsg.SDK.WXGameVideoFileObject";
  private static final int URL_LENGTH_LIMIT = 10240;
  public String filePath;
  public String thumbUrl;
  public String videoUrl;
  
  public WXGameVideoFileObject()
  {
    GMTrace.i(15950837448704L, 118843);
    this.filePath = null;
    this.videoUrl = null;
    this.thumbUrl = null;
    GMTrace.o(15950837448704L, 118843);
  }
  
  public WXGameVideoFileObject(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(16292958437376L, 121392);
    this.filePath = paramString1;
    this.videoUrl = paramString2;
    this.thumbUrl = paramString3;
    GMTrace.o(16292958437376L, 121392);
  }
  
  private int getFileSize(String paramString)
  {
    GMTrace.i(15951642755072L, 118849);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(15951642755072L, 118849);
      return 0;
    }
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      GMTrace.o(15951642755072L, 118849);
      return 0;
    }
    int i = (int)paramString.length();
    GMTrace.o(15951642755072L, 118849);
    return i;
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(15951508537344L, 118848);
    if ((this.filePath == null) || (this.filePath.length() == 0))
    {
      Log.e("MicroMsg.SDK.WXGameVideoFileObject", "checkArgs fail, filePath is null");
      GMTrace.o(15951508537344L, 118848);
      return false;
    }
    if (getFileSize(this.filePath) > 10485760)
    {
      Log.e("MicroMsg.SDK.WXGameVideoFileObject", "checkArgs fail, video file size is too large");
      GMTrace.o(15951508537344L, 118848);
      return false;
    }
    if ((this.videoUrl != null) && (this.videoUrl.length() > 10240))
    {
      Log.e("MicroMsg.SDK.WXGameVideoFileObject", "checkArgs fail, videoUrl is too long");
      GMTrace.o(15951508537344L, 118848);
      return false;
    }
    if ((this.thumbUrl != null) && (this.thumbUrl.length() > 10240))
    {
      Log.e("MicroMsg.SDK.WXGameVideoFileObject", "checkArgs fail, thumbUrl is too long");
      GMTrace.o(15951508537344L, 118848);
      return false;
    }
    GMTrace.o(15951508537344L, 118848);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(15951105884160L, 118845);
    paramBundle.putString("_wxvideofileobject_filePath", this.filePath);
    paramBundle.putString("_wxvideofileobject_cdnUrl", this.videoUrl);
    paramBundle.putString("_wxvideofileobject_thumbUrl", this.thumbUrl);
    GMTrace.o(15951105884160L, 118845);
  }
  
  public int type()
  {
    GMTrace.i(15951374319616L, 118847);
    GMTrace.o(15951374319616L, 118847);
    return 39;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(15951240101888L, 118846);
    this.filePath = paramBundle.getString("_wxvideofileobject_filePath");
    this.videoUrl = paramBundle.getString("_wxvideofileobject_cdnUrl");
    this.thumbUrl = paramBundle.getString("_wxvideofileobject_thumbUrl");
    GMTrace.o(15951240101888L, 118846);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXGameVideoFileObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */