package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;
import java.io.File;

public class WXFileObject
  implements WXMediaMessage.IMediaObject
{
  private static final int CONTENT_LENGTH_LIMIT = 10485760;
  private static final String TAG = "MicroMsg.SDK.WXFileObject";
  private int contentLengthLimit;
  public byte[] fileData;
  public String filePath;
  
  public WXFileObject()
  {
    GMTrace.i(36775657472L, 274);
    this.contentLengthLimit = 10485760;
    this.fileData = null;
    this.filePath = null;
    GMTrace.o(36775657472L, 274);
  }
  
  public WXFileObject(String paramString)
  {
    GMTrace.i(37044092928L, 276);
    this.contentLengthLimit = 10485760;
    this.filePath = paramString;
    GMTrace.o(37044092928L, 276);
  }
  
  public WXFileObject(byte[] paramArrayOfByte)
  {
    GMTrace.i(36909875200L, 275);
    this.contentLengthLimit = 10485760;
    this.fileData = paramArrayOfByte;
    GMTrace.o(36909875200L, 275);
  }
  
  private int getFileSize(String paramString)
  {
    GMTrace.i(38117834752L, 284);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(38117834752L, 284);
      return 0;
    }
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      GMTrace.o(38117834752L, 284);
      return 0;
    }
    int i = (int)paramString.length();
    GMTrace.o(38117834752L, 284);
    return i;
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(37983617024L, 283);
    if (((this.fileData == null) || (this.fileData.length == 0)) && ((this.filePath == null) || (this.filePath.length() == 0)))
    {
      Log.e("MicroMsg.SDK.WXFileObject", "checkArgs fail, both arguments is null");
      GMTrace.o(37983617024L, 283);
      return false;
    }
    if ((this.fileData != null) && (this.fileData.length > this.contentLengthLimit))
    {
      Log.e("MicroMsg.SDK.WXFileObject", "checkArgs fail, fileData is too large");
      GMTrace.o(37983617024L, 283);
      return false;
    }
    if ((this.filePath != null) && (getFileSize(this.filePath) > this.contentLengthLimit))
    {
      Log.e("MicroMsg.SDK.WXFileObject", "checkArgs fail, fileSize is too large");
      GMTrace.o(37983617024L, 283);
      return false;
    }
    GMTrace.o(37983617024L, 283);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(37446746112L, 279);
    paramBundle.putByteArray("_wxfileobject_fileData", this.fileData);
    paramBundle.putString("_wxfileobject_filePath", this.filePath);
    GMTrace.o(37446746112L, 279);
  }
  
  public void setContentLengthLimit(int paramInt)
  {
    GMTrace.i(37849399296L, 282);
    this.contentLengthLimit = paramInt;
    GMTrace.o(37849399296L, 282);
  }
  
  public void setFileData(byte[] paramArrayOfByte)
  {
    GMTrace.i(37178310656L, 277);
    this.fileData = paramArrayOfByte;
    GMTrace.o(37178310656L, 277);
  }
  
  public void setFilePath(String paramString)
  {
    GMTrace.i(37312528384L, 278);
    this.filePath = paramString;
    GMTrace.o(37312528384L, 278);
  }
  
  public int type()
  {
    GMTrace.i(37715181568L, 281);
    GMTrace.o(37715181568L, 281);
    return 6;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(37580963840L, 280);
    this.fileData = paramBundle.getByteArray("_wxfileobject_fileData");
    this.filePath = paramBundle.getString("_wxfileobject_filePath");
    GMTrace.o(37580963840L, 280);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXFileObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */