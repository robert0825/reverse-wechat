package com.tencent.tmassistantsdk.logreport;

import com.qq.taf.jce.JceStruct;
import com.tencent.tmassistantsdk.network.PostHttpRequest;
import com.tencent.tmassistantsdk.protocol.ProtocolPackage;
import com.tencent.tmassistantsdk.protocol.jce.ReportLogRequest;
import com.tencent.tmassistantsdk.protocol.jce.ReportLogResponse;
import com.tencent.tmassistantsdk.storage.table.BaseLogTable.DataWrapper;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;

public class LogReportHttpRequest
  extends PostHttpRequest
{
  protected ILogReportHttpListener mListener = null;
  
  protected void onFinished(JceStruct paramJceStruct1, JceStruct paramJceStruct2, int paramInt)
  {
    if (paramJceStruct2 == null) {
      return;
    }
    if ((this.mListener != null) && (paramInt == 0))
    {
      if ((paramJceStruct2 instanceof ReportLogResponse))
      {
        if (((ReportLogResponse)paramJceStruct2).ret == 0)
        {
          this.mListener.onLogReprotHttpRequestFinish(this, true);
          return;
        }
        this.mListener.onLogReprotHttpRequestFinish(this, false);
        return;
      }
      TMLog.i("LogReportHttpRequest", "response isn't instanceof ReportLogResponse !");
      return;
    }
    TMLog.i("LogReportHttpRequest", "mListener is null !");
  }
  
  public boolean sendLogDataToServer(byte paramByte, BaseLogTable.DataWrapper paramDataWrapper)
  {
    if (paramDataWrapper == null) {
      return false;
    }
    String str = GlobalUtil.getAppPackageName(GlobalUtil.getInstance().getContext());
    int i = GlobalUtil.getAppVersionCode(GlobalUtil.getInstance().getContext());
    return super.sendRequest((ReportLogRequest)ProtocolPackage.buildReportRequest(paramByte, paramDataWrapper.dataList, str, i, ""));
  }
  
  public void setmListener(ILogReportHttpListener paramILogReportHttpListener)
  {
    this.mListener = paramILogReportHttpListener;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\logreport\LogReportHttpRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */