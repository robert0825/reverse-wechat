package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;
import java.io.File;

public class WXVideoFileObject
  implements WXMediaMessage.IMediaObject
{
  private static final int FILE_SIZE_LIMIT = 10485760;
  private static final String TAG = "MicroMsg.SDK.WXVideoFileObject";
  public String filePath;
  
  public WXVideoFileObject()
  {
    GMTrace.i(14615639490560L, 108895);
    this.filePath = null;
    GMTrace.o(14615639490560L, 108895);
  }
  
  public WXVideoFileObject(String paramString)
  {
    GMTrace.i(16293092655104L, 121393);
    this.filePath = paramString;
    GMTrace.o(16293092655104L, 121393);
  }
  
  private int getFileSize(String paramString)
  {
    GMTrace.i(14616444796928L, 108901);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(14616444796928L, 108901);
      return 0;
    }
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      GMTrace.o(14616444796928L, 108901);
      return 0;
    }
    int i = (int)paramString.length();
    GMTrace.o(14616444796928L, 108901);
    return i;
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(14616310579200L, 108900);
    if ((this.filePath == null) || (this.filePath.length() == 0))
    {
      Log.e("MicroMsg.SDK.WXVideoFileObject", "checkArgs fail, filePath is null");
      GMTrace.o(14616310579200L, 108900);
      return false;
    }
    if (getFileSize(this.filePath) > 10485760)
    {
      Log.e("MicroMsg.SDK.WXVideoFileObject", "checkArgs fail, video file size is too large");
      GMTrace.o(14616310579200L, 108900);
      return false;
    }
    GMTrace.o(14616310579200L, 108900);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(14615907926016L, 108897);
    paramBundle.putString("_wxvideofileobject_filePath", this.filePath);
    GMTrace.o(14615907926016L, 108897);
  }
  
  public int type()
  {
    GMTrace.i(14616176361472L, 108899);
    GMTrace.o(14616176361472L, 108899);
    return 38;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(14616042143744L, 108898);
    this.filePath = paramBundle.getString("_wxvideofileobject_filePath");
    GMTrace.o(14616042143744L, 108898);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXVideoFileObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */