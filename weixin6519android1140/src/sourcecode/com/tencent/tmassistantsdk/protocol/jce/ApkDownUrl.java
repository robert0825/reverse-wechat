package com.tencent.tmassistantsdk.protocol.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class ApkDownUrl
  extends JceStruct
{
  static ArrayList<String> cache_urlList;
  public byte type = 0;
  public ArrayList<String> urlList = null;
  
  public ApkDownUrl() {}
  
  public ApkDownUrl(byte paramByte, ArrayList<String> paramArrayList)
  {
    this.type = paramByte;
    this.urlList = paramArrayList;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.type = paramJceInputStream.read(this.type, 0, true);
    if (cache_urlList == null)
    {
      cache_urlList = new ArrayList();
      cache_urlList.add("");
    }
    this.urlList = ((ArrayList)paramJceInputStream.read(cache_urlList, 1, true));
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.type, 0);
    paramJceOutputStream.write(this.urlList, 1);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\protocol\jce\ApkDownUrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */