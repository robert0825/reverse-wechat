package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class BatchDownloadActionResponse
  extends JceStruct
{
  static ArrayList<IPCQueryDownloadInfo> cache_batchData;
  public ArrayList<IPCQueryDownloadInfo> batchData = null;
  public int batchRequestType = 0;
  
  public BatchDownloadActionResponse() {}
  
  public BatchDownloadActionResponse(int paramInt, ArrayList<IPCQueryDownloadInfo> paramArrayList)
  {
    this.batchRequestType = paramInt;
    this.batchData = paramArrayList;
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.batchRequestType = paramJceInputStream.read(this.batchRequestType, 0, true);
    if (cache_batchData == null)
    {
      cache_batchData = new ArrayList();
      IPCQueryDownloadInfo localIPCQueryDownloadInfo = new IPCQueryDownloadInfo();
      cache_batchData.add(localIPCQueryDownloadInfo);
    }
    this.batchData = ((ArrayList)paramJceInputStream.read(cache_batchData, 1, false));
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.batchRequestType, 0);
    if (this.batchData != null) {
      paramJceOutputStream.write(this.batchData, 1);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\openSDK\param\jce\BatchDownloadActionResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */