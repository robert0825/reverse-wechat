package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class GetDownloadStateResponse
  extends JceStruct
{
  static IPCBaseParam cache_requestParam;
  public int errorCode = 0;
  public String errorMsg = "";
  public IPCBaseParam requestParam = null;
  public int state = 0;
  
  public GetDownloadStateResponse() {}
  
  public GetDownloadStateResponse(IPCBaseParam paramIPCBaseParam, int paramInt1, int paramInt2, String paramString)
  {
    this.requestParam = paramIPCBaseParam;
    this.state = paramInt1;
    this.errorCode = paramInt2;
    this.errorMsg = paramString;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_requestParam == null) {
      cache_requestParam = new IPCBaseParam();
    }
    this.requestParam = ((IPCBaseParam)paramJceInputStream.read(cache_requestParam, 0, true));
    this.state = paramJceInputStream.read(this.state, 1, false);
    this.errorCode = paramJceInputStream.read(this.errorCode, 2, false);
    this.errorMsg = paramJceInputStream.readString(3, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.requestParam, 0);
    paramJceOutputStream.write(this.state, 1);
    paramJceOutputStream.write(this.errorCode, 2);
    if (this.errorMsg != null) {
      paramJceOutputStream.write(this.errorMsg, 3);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\openSDK\param\jce\GetDownloadStateResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */