package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class BatchDownloadActionRequest
  extends JceStruct
{
  static ArrayList<IPCDownloadParam> cache_batchData;
  public ArrayList<IPCDownloadParam> batchData = null;
  public int batchRequestType = 0;
  public String uin = "";
  public String uinType = "";
  public String via = "";
  
  public BatchDownloadActionRequest() {}
  
  public BatchDownloadActionRequest(int paramInt, ArrayList<IPCDownloadParam> paramArrayList, String paramString1, String paramString2, String paramString3)
  {
    this.batchRequestType = paramInt;
    this.batchData = paramArrayList;
    this.uin = paramString1;
    this.uinType = paramString2;
    this.via = paramString3;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.batchRequestType = paramJceInputStream.read(this.batchRequestType, 0, true);
    if (cache_batchData == null)
    {
      cache_batchData = new ArrayList();
      IPCDownloadParam localIPCDownloadParam = new IPCDownloadParam();
      cache_batchData.add(localIPCDownloadParam);
    }
    this.batchData = ((ArrayList)paramJceInputStream.read(cache_batchData, 1, false));
    this.uin = paramJceInputStream.readString(2, false);
    this.uinType = paramJceInputStream.readString(3, false);
    this.via = paramJceInputStream.readString(4, false);
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.batchRequestType, 0);
    if (this.batchData != null) {
      paramJceOutputStream.write(this.batchData, 1);
    }
    if (this.uin != null) {
      paramJceOutputStream.write(this.uin, 2);
    }
    if (this.uinType != null) {
      paramJceOutputStream.write(this.uinType, 3);
    }
    if (this.via != null) {
      paramJceOutputStream.write(this.via, 4);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\openSDK\param\jce\BatchDownloadActionRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */