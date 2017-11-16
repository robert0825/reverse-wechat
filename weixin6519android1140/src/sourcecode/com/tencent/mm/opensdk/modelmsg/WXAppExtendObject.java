package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;
import java.io.File;

public class WXAppExtendObject
  implements WXMediaMessage.IMediaObject
{
  private static final int CONTENT_LENGTH_LIMIT = 10485760;
  private static final int EXTINFO_LENGTH_LIMIT = 2048;
  private static final int PATH_LENGTH_LIMIT = 10240;
  private static final String TAG = "MicroMsg.SDK.WXAppExtendObject";
  public String extInfo;
  public byte[] fileData;
  public String filePath;
  
  public WXAppExtendObject()
  {
    GMTrace.i(31406948352L, 234);
    GMTrace.o(31406948352L, 234);
  }
  
  public WXAppExtendObject(String paramString1, String paramString2)
  {
    GMTrace.i(31675383808L, 236);
    this.extInfo = paramString1;
    this.filePath = paramString2;
    GMTrace.o(31675383808L, 236);
  }
  
  public WXAppExtendObject(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(31541166080L, 235);
    this.extInfo = paramString;
    this.fileData = paramArrayOfByte;
    GMTrace.o(31541166080L, 235);
  }
  
  private int getFileSize(String paramString)
  {
    GMTrace.i(32346472448L, 241);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(32346472448L, 241);
      return 0;
    }
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      GMTrace.o(32346472448L, 241);
      return 0;
    }
    int i = (int)paramString.length();
    GMTrace.o(32346472448L, 241);
    return i;
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(32212254720L, 240);
    if (((this.extInfo == null) || (this.extInfo.length() == 0)) && ((this.filePath == null) || (this.filePath.length() == 0)) && ((this.fileData == null) || (this.fileData.length == 0)))
    {
      Log.e("MicroMsg.SDK.WXAppExtendObject", "checkArgs fail, all arguments is null");
      GMTrace.o(32212254720L, 240);
      return false;
    }
    if ((this.extInfo != null) && (this.extInfo.length() > 2048))
    {
      Log.e("MicroMsg.SDK.WXAppExtendObject", "checkArgs fail, extInfo is invalid");
      GMTrace.o(32212254720L, 240);
      return false;
    }
    if ((this.filePath != null) && (this.filePath.length() > 10240))
    {
      Log.e("MicroMsg.SDK.WXAppExtendObject", "checkArgs fail, filePath is invalid");
      GMTrace.o(32212254720L, 240);
      return false;
    }
    if ((this.filePath != null) && (getFileSize(this.filePath) > 10485760))
    {
      Log.e("MicroMsg.SDK.WXAppExtendObject", "checkArgs fail, fileSize is too large");
      GMTrace.o(32212254720L, 240);
      return false;
    }
    if ((this.fileData != null) && (this.fileData.length > 10485760))
    {
      Log.e("MicroMsg.SDK.WXAppExtendObject", "checkArgs fail, fileData is too large");
      GMTrace.o(32212254720L, 240);
      return false;
    }
    GMTrace.o(32212254720L, 240);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(31809601536L, 237);
    paramBundle.putString("_wxappextendobject_extInfo", this.extInfo);
    paramBundle.putByteArray("_wxappextendobject_fileData", this.fileData);
    paramBundle.putString("_wxappextendobject_filePath", this.filePath);
    GMTrace.o(31809601536L, 237);
  }
  
  public int type()
  {
    GMTrace.i(32078036992L, 239);
    GMTrace.o(32078036992L, 239);
    return 7;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(31943819264L, 238);
    this.extInfo = paramBundle.getString("_wxappextendobject_extInfo");
    this.fileData = paramBundle.getByteArray("_wxappextendobject_fileData");
    this.filePath = paramBundle.getString("_wxappextendobject_filePath");
    GMTrace.o(31943819264L, 238);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXAppExtendObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */