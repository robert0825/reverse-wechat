package com.tencent.mm.network;

import com.tencent.gmtrace.GMTrace;

public class MMNativeNetComm
{
  static final int CONNECTED = 5;
  static final int CONNECTTING = 4;
  static final int ECmdNormal = 0;
  static final int ECmdUser = 1;
  static final int EEXPECT_SENSITIVE = 1;
  static final int EFAST = 1;
  static final int ENORMAL = 0;
  static final int ETASK_PRIORITY_0 = 0;
  static final int ETASK_PRIORITY_1 = 1;
  static final int ETASK_PRIORITY_2 = 2;
  static final int ETASK_PRIORITY_3 = 3;
  static final int ETASK_PRIORITY_4 = 4;
  static final int ETASK_PRIORITY_5 = 5;
  static final int ETASK_PRIORITY_HIGHEST = 0;
  static final int ETASK_PRIORITY_LOWEST = 5;
  static final int ETASK_PRIORITY_NORMAL = 3;
  static final int GATEWAY_FAILED = 2;
  static final int NETWORK_CONNECTED = 1;
  static final int NETWORK_UNAVAILABLE = 0;
  static final int SERVER_DOWN = 6;
  static final int SERVER_FAILED = 3;
  static final int TYPE_DNS = 2;
  static final int TYPE_HC = 1;
  static final int TYPE_SVR_DNS = 3;
  static final int TYPE_WAP_HC = 4;
  static final int ectDial = 2;
  static final int ectDns = 3;
  static final int ectEnDecode = 7;
  static final int ectFalse = 1;
  static final int ectHttp = 5;
  static final int ectHttp_TaskTimeout = -500;
  static final int ectLocal = 9;
  static final int ectLocal_AntiAvalanche = -4;
  static final int ectLocal_StartTaskFail = -3;
  static final int ectLocal_TaskRetry = -2;
  static final int ectLocal_TaskTimeout = -1;
  static final int ectNetMsgXP = 6;
  static final int ectNetMsgXP_TaskTimeout = -500;
  static final int ectOK = 0;
  static final int ectServer = 8;
  static final int ectSocket = 4;
  
  public MMNativeNetComm()
  {
    GMTrace.i(13678397095936L, 101912);
    GMTrace.o(13678397095936L, 101912);
  }
  
  static class AccountInfo
  {
    public int uin;
    public String username;
    
    AccountInfo()
    {
      GMTrace.i(13701885198336L, 102087);
      GMTrace.o(13701885198336L, 102087);
    }
  }
  
  static class NetCmd
  {
    public static final int EBoth = 3;
    public static final int ELong = 2;
    public static final int EShort = 1;
    int cmduser_expectfinishtime;
    int cmduser_expecttos;
    int cmduser_firstpkgtimeout;
    int cmduser_priority;
    int cmduser_retrycount;
    public boolean isFlowLimit;
    public boolean isNotResp;
    public boolean isSessionCmd;
    public int netStrategy;
    public int networkType;
    public int reqCmdID;
    public int respCmdID;
    public int rtType;
    public String uri;
    
    NetCmd()
    {
      GMTrace.i(13700274585600L, 102075);
      this.cmduser_firstpkgtimeout = -1;
      this.cmduser_retrycount = -1;
      this.cmduser_expectfinishtime = -1;
      this.cmduser_expecttos = -1;
      this.cmduser_priority = 3;
      GMTrace.o(13700274585600L, 102075);
    }
  }
  
  public static class ReportInfo
  {
    public long actionId;
    public long beginTime;
    public String clientIp;
    public long connCostTime;
    public long connTotalCostTime;
    public long dnsCostTime;
    public int dnsErrType;
    public String dnsSvrIp;
    public int endFlag;
    public int endStep;
    public long endTime;
    public int errCode;
    public int errType;
    public long expand1;
    public long expand2;
    public String extraInfo;
    public long firstPkgTime;
    public String host;
    public String ip;
    public int ipType;
    public boolean isSocket;
    public int localIp;
    public long netSignal;
    public int netType;
    public int newNetType;
    public long newdnsCostTime;
    public int newdnsErrCode;
    public int newdnsErrType;
    public int port;
    public long recvSize;
    public int refTime1;
    public int refTime2;
    public int refTime3;
    public int retryCount;
    public long rtType;
    public long sendSize;
    public int subNetType;
    public int usedIpIndex;
    
    public ReportInfo()
    {
      GMTrace.i(13676115394560L, 101895);
      this.actionId = 0L;
      this.rtType = 0L;
      this.beginTime = 0L;
      this.endTime = 0L;
      this.ip = "";
      this.port = 0;
      this.isSocket = false;
      this.netType = 0;
      this.ipType = 0;
      this.sendSize = 0L;
      this.recvSize = 0L;
      this.errType = 0;
      this.errCode = 0;
      this.netSignal = 0L;
      this.retryCount = 0;
      this.expand1 = 0L;
      this.clientIp = "";
      this.expand2 = 0L;
      this.newNetType = 0;
      this.subNetType = 0;
      this.extraInfo = "";
      this.host = "";
      this.endStep = 0;
      this.newdnsCostTime = 0L;
      this.newdnsErrType = 0;
      this.newdnsErrCode = 0;
      this.dnsSvrIp = "";
      this.dnsCostTime = 0L;
      this.dnsErrType = 0;
      this.connCostTime = 0L;
      this.firstPkgTime = 0L;
      this.endFlag = 0;
      this.connTotalCostTime = 0L;
      this.usedIpIndex = 0;
      this.localIp = 0;
      this.refTime1 = 0;
      this.refTime2 = 0;
      this.refTime3 = 0;
      GMTrace.o(13676115394560L, 101895);
    }
    
    public String toString()
    {
      GMTrace.i(13676249612288L, 101896);
      String str = String.format("actionId:%d, rtType:%d, begin:%d, end:%d, cost:%d, ip:%s, port:%d, isSocket:%b, netType:%d, ipType:%d, sendSize:%d, recvSize:%d, errType:%d, errCode:%d, netSignal:%d, retryCount:%d, expand1:%d, clientip:%s, expand2:%d, newNetType:%d, subNetType:%d, extraInfo:%s, host:%s, endStep:%d, endFlag:%d", new Object[] { Long.valueOf(this.actionId), Long.valueOf(this.rtType), Long.valueOf(this.beginTime), Long.valueOf(this.endTime), Long.valueOf(this.endTime - this.beginTime), this.ip, Integer.valueOf(this.port), Boolean.valueOf(this.isSocket), Integer.valueOf(this.netType), Integer.valueOf(this.ipType), Long.valueOf(this.sendSize), Long.valueOf(this.recvSize), Integer.valueOf(this.errType), Integer.valueOf(this.errCode), Long.valueOf(this.netSignal), Integer.valueOf(this.retryCount), Long.valueOf(this.expand1), this.clientIp, Long.valueOf(this.expand2), Integer.valueOf(this.newNetType), Integer.valueOf(this.subNetType), this.extraInfo, this.host, Integer.valueOf(this.endStep), Integer.valueOf(this.endFlag) });
      GMTrace.o(13676249612288L, 101896);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\network\MMNativeNetComm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */