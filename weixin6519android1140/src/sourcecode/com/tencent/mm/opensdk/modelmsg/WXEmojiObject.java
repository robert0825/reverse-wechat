package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;
import java.io.File;

public class WXEmojiObject
  implements WXMediaMessage.IMediaObject
{
  private static final int CONTENT_LENGTH_LIMIT = 10485760;
  private static final String TAG = "MicroMsg.SDK.WXEmojiObject";
  public byte[] emojiData;
  public String emojiPath;
  
  public WXEmojiObject()
  {
    GMTrace.i(33822867456L, 252);
    this.emojiData = null;
    this.emojiPath = null;
    GMTrace.o(33822867456L, 252);
  }
  
  public WXEmojiObject(String paramString)
  {
    GMTrace.i(34091302912L, 254);
    this.emojiPath = paramString;
    GMTrace.o(34091302912L, 254);
  }
  
  public WXEmojiObject(byte[] paramArrayOfByte)
  {
    GMTrace.i(33957085184L, 253);
    this.emojiData = paramArrayOfByte;
    GMTrace.o(33957085184L, 253);
  }
  
  private int getFileSize(String paramString)
  {
    GMTrace.i(35030827008L, 261);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(35030827008L, 261);
      return 0;
    }
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      GMTrace.o(35030827008L, 261);
      return 0;
    }
    int i = (int)paramString.length();
    GMTrace.o(35030827008L, 261);
    return i;
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(34896609280L, 260);
    if (((this.emojiData == null) || (this.emojiData.length == 0)) && ((this.emojiPath == null) || (this.emojiPath.length() == 0)))
    {
      Log.e("MicroMsg.SDK.WXEmojiObject", "checkArgs fail, both arguments is null");
      GMTrace.o(34896609280L, 260);
      return false;
    }
    if ((this.emojiData != null) && (this.emojiData.length > 10485760))
    {
      Log.e("MicroMsg.SDK.WXEmojiObject", "checkArgs fail, emojiData is too large");
      GMTrace.o(34896609280L, 260);
      return false;
    }
    if ((this.emojiPath != null) && (getFileSize(this.emojiPath) > 10485760))
    {
      Log.e("MicroMsg.SDK.WXEmojiObject", "checkArgs fail, emojiSize is too large");
      GMTrace.o(34896609280L, 260);
      return false;
    }
    GMTrace.o(34896609280L, 260);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(34493956096L, 257);
    paramBundle.putByteArray("_wxemojiobject_emojiData", this.emojiData);
    paramBundle.putString("_wxemojiobject_emojiPath", this.emojiPath);
    GMTrace.o(34493956096L, 257);
  }
  
  public void setEmojiData(byte[] paramArrayOfByte)
  {
    GMTrace.i(34225520640L, 255);
    this.emojiData = paramArrayOfByte;
    GMTrace.o(34225520640L, 255);
  }
  
  public void setEmojiPath(String paramString)
  {
    GMTrace.i(34359738368L, 256);
    this.emojiPath = paramString;
    GMTrace.o(34359738368L, 256);
  }
  
  public int type()
  {
    GMTrace.i(34762391552L, 259);
    GMTrace.o(34762391552L, 259);
    return 8;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(34628173824L, 258);
    this.emojiData = paramBundle.getByteArray("_wxemojiobject_emojiData");
    this.emojiPath = paramBundle.getString("_wxemojiobject_emojiPath");
    GMTrace.o(34628173824L, 258);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXEmojiObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */