package com.tencent.mm.opensdk.modelmsg;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class WXImageObject
  implements WXMediaMessage.IMediaObject
{
  private static final int CONTENT_LENGTH_LIMIT = 10485760;
  private static final int PATH_LENGTH_LIMIT = 10240;
  private static final String TAG = "MicroMsg.SDK.WXImageObject";
  public byte[] imageData;
  public String imagePath;
  
  public WXImageObject()
  {
    GMTrace.i(38252052480L, 285);
    GMTrace.o(38252052480L, 285);
  }
  
  public WXImageObject(Bitmap paramBitmap)
  {
    GMTrace.i(38520487936L, 287);
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 85, localByteArrayOutputStream);
      this.imageData = localByteArrayOutputStream.toByteArray();
      localByteArrayOutputStream.close();
      GMTrace.o(38520487936L, 287);
      return;
    }
    catch (Exception paramBitmap)
    {
      Log.e("MicroMsg.SDK.WXImageObject", "WXImageObject <init>, exception:" + paramBitmap.getMessage());
      GMTrace.o(38520487936L, 287);
    }
  }
  
  public WXImageObject(byte[] paramArrayOfByte)
  {
    GMTrace.i(38386270208L, 286);
    this.imageData = paramArrayOfByte;
    GMTrace.o(38386270208L, 286);
  }
  
  private int getFileSize(String paramString)
  {
    GMTrace.i(39325794304L, 293);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(39325794304L, 293);
      return 0;
    }
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      GMTrace.o(39325794304L, 293);
      return 0;
    }
    int i = (int)paramString.length();
    GMTrace.o(39325794304L, 293);
    return i;
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(39191576576L, 292);
    if (((this.imageData == null) || (this.imageData.length == 0)) && ((this.imagePath == null) || (this.imagePath.length() == 0)))
    {
      Log.e("MicroMsg.SDK.WXImageObject", "checkArgs fail, all arguments are null");
      GMTrace.o(39191576576L, 292);
      return false;
    }
    if ((this.imageData != null) && (this.imageData.length > 10485760))
    {
      Log.e("MicroMsg.SDK.WXImageObject", "checkArgs fail, content is too large");
      GMTrace.o(39191576576L, 292);
      return false;
    }
    if ((this.imagePath != null) && (this.imagePath.length() > 10240))
    {
      Log.e("MicroMsg.SDK.WXImageObject", "checkArgs fail, path is invalid");
      GMTrace.o(39191576576L, 292);
      return false;
    }
    if ((this.imagePath != null) && (getFileSize(this.imagePath) > 10485760))
    {
      Log.e("MicroMsg.SDK.WXImageObject", "checkArgs fail, image content is too large");
      GMTrace.o(39191576576L, 292);
      return false;
    }
    GMTrace.o(39191576576L, 292);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(38788923392L, 289);
    paramBundle.putByteArray("_wximageobject_imageData", this.imageData);
    paramBundle.putString("_wximageobject_imagePath", this.imagePath);
    GMTrace.o(38788923392L, 289);
  }
  
  public void setImagePath(String paramString)
  {
    GMTrace.i(38654705664L, 288);
    this.imagePath = paramString;
    GMTrace.o(38654705664L, 288);
  }
  
  public int type()
  {
    GMTrace.i(39057358848L, 291);
    GMTrace.o(39057358848L, 291);
    return 2;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(38923141120L, 290);
    this.imageData = paramBundle.getByteArray("_wximageobject_imageData");
    this.imagePath = paramBundle.getString("_wximageobject_imagePath");
    GMTrace.o(38923141120L, 290);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXImageObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */