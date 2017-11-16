package com.tencent.mm.pluginsdk.j.a.d;

import com.tencent.gmtrace.GMTrace;

public abstract class a
{
  public final String eDW;
  private final String filePath;
  private final long gXo;
  public final int networkType;
  public final int priority;
  private volatile int retryTimes;
  protected volatile int status;
  public final String tpD;
  public final int tpN;
  public final String tqW;
  private final String tqX;
  private final String tqY;
  public final String url;
  
  public a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, long paramLong, String paramString5, String paramString6, String paramString7, int paramInt3)
  {
    GMTrace.i(880334077952L, 6559);
    this.status = 0;
    this.url = paramString1;
    this.tpD = paramString2;
    this.tqW = paramString3;
    this.networkType = paramInt1;
    this.tpN = paramInt2;
    this.retryTimes = this.tpN;
    this.filePath = paramString4;
    this.gXo = paramLong;
    this.tqX = paramString6;
    this.tqY = paramString7;
    this.eDW = paramString5;
    this.priority = paramInt3;
    GMTrace.o(880334077952L, 6559);
  }
  
  public int OI(String paramString)
  {
    GMTrace.i(880602513408L, 6561);
    GMTrace.o(880602513408L, 6561);
    return 0;
  }
  
  public q bKc()
  {
    GMTrace.i(880468295680L, 6560);
    q localq = new q();
    localq.field_url = this.url;
    localq.field_urlKey = this.tpD;
    localq.field_fileVersion = this.tqW;
    localq.field_networkType = this.networkType;
    localq.field_maxRetryTimes = this.tpN;
    localq.field_retryTimes = this.retryTimes;
    localq.field_filePath = this.filePath;
    localq.field_status = this.status;
    localq.field_expireTime = this.gXo;
    localq.field_groupId1 = this.tqX;
    localq.field_groupId2 = this.tqY;
    localq.field_md5 = this.eDW;
    localq.field_priority = this.priority;
    GMTrace.o(880468295680L, 6560);
    return localq;
  }
  
  public String toString()
  {
    GMTrace.i(880736731136L, 6562);
    String str = "BaseResDownloadRequest | urlKey='" + this.tpD + '\'' + ", networkType=" + this.networkType + ", expireTime=" + this.gXo + ", fileVersion=" + this.tqW + ", maxRetryTimes=" + this.tpN + ", md5='" + this.eDW + '\'' + ", groupId1='" + this.tqX + '\'' + ", groupId2='" + this.tqY + '\'' + ", filePath='" + this.filePath + '\'' + ", retryTimes=" + this.retryTimes + ", status=" + this.status + ", priority=" + this.priority;
    GMTrace.o(880736731136L, 6562);
    return str;
  }
  
  public static abstract class a<T extends a>
  {
    public String eDW;
    public long gXo;
    public int networkType;
    public int priority;
    public String tpD;
    public int tpN;
    public final String url;
    
    public a(String paramString)
    {
      GMTrace.i(872146796544L, 6498);
      this.url = paramString;
      GMTrace.o(872146796544L, 6498);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */