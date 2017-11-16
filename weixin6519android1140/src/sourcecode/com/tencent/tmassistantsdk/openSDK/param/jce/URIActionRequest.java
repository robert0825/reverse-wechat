package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class URIActionRequest
  extends JceStruct
{
  public String uri = "";
  
  public URIActionRequest() {}
  
  public URIActionRequest(String paramString)
  {
    this.uri = paramString;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.uri = paramJceInputStream.readString(0, true);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.uri, 0);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\openSDK\param\jce\URIActionRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */