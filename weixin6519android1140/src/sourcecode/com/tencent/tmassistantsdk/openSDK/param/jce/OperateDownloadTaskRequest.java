package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

public final class OperateDownloadTaskRequest
  extends JceStruct
{
  static IPCBaseParam cache_baseParam;
  public String actionFlag = "";
  public IPCBaseParam baseParam = null;
  public String opList = "";
  public int requestType = 0;
  public String verifyType = "";
  
  public OperateDownloadTaskRequest() {}
  
  public OperateDownloadTaskRequest(int paramInt, IPCBaseParam paramIPCBaseParam, String paramString1, String paramString2, String paramString3)
  {
    this.requestType = paramInt;
    this.baseParam = paramIPCBaseParam;
    this.opList = paramString1;
    this.actionFlag = paramString2;
    this.verifyType = paramString3;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.requestType = paramJceInputStream.read(this.requestType, 0, true);
    if (cache_baseParam == null) {
      cache_baseParam = new IPCBaseParam();
    }
    this.baseParam = ((IPCBaseParam)paramJceInputStream.read(cache_baseParam, 1, true));
    this.opList = paramJceInputStream.readString(2, false);
    this.actionFlag = paramJceInputStream.readString(3, false);
    this.verifyType = paramJceInputStream.readString(4, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.requestType, 0);
    paramJceOutputStream.write(this.baseParam, 1);
    if (this.opList != null) {
      paramJceOutputStream.write(this.opList, 2);
    }
    if (this.actionFlag != null) {
      paramJceOutputStream.write(this.actionFlag, 3);
    }
    if (this.verifyType != null) {
      paramJceOutputStream.write(this.verifyType, 4);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\openSDK\param\jce\OperateDownloadTaskRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */