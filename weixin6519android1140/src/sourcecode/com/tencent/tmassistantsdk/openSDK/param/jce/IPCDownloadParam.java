package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class IPCDownloadParam
  extends JceStruct
{
  static IPCBaseParam cache_baseParam;
  public String actionFlag = "";
  public IPCBaseParam baseParam = null;
  public String opList = "";
  public String reverse = "";
  public String verifyType = "";
  
  public IPCDownloadParam() {}
  
  public IPCDownloadParam(IPCBaseParam paramIPCBaseParam, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.baseParam = paramIPCBaseParam;
    this.opList = paramString1;
    this.actionFlag = paramString2;
    this.verifyType = paramString3;
    this.reverse = paramString4;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_baseParam == null) {
      cache_baseParam = new IPCBaseParam();
    }
    this.baseParam = ((IPCBaseParam)paramJceInputStream.read(cache_baseParam, 0, true));
    this.opList = paramJceInputStream.readString(1, false);
    this.actionFlag = paramJceInputStream.readString(2, false);
    this.verifyType = paramJceInputStream.readString(3, false);
    this.reverse = paramJceInputStream.readString(4, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.baseParam, 0);
    if (this.opList != null) {
      paramJceOutputStream.write(this.opList, 1);
    }
    if (this.actionFlag != null) {
      paramJceOutputStream.write(this.actionFlag, 2);
    }
    if (this.verifyType != null) {
      paramJceOutputStream.write(this.verifyType, 3);
    }
    if (this.reverse != null) {
      paramJceOutputStream.write(this.reverse, 4);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\openSDK\param\jce\IPCDownloadParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */