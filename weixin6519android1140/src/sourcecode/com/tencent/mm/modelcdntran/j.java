package com.tencent.mm.modelcdntran;

import com.tencent.gmtrace.GMTrace;

public final class j
  extends i
{
  public String eMI;
  public int eMK;
  public long eSf;
  public String ern;
  public String filename;
  public long gAP;
  public String gAQ;
  public int gAR;
  public int gAS;
  public String gAT;
  public int gAU;
  public int gAV;
  public long gAW;
  public int gAX;
  public a gAY;
  public String host;
  public String[] iplist;
  public boolean isColdSnsData;
  public String referer;
  public String signalQuality;
  public String snsScene;
  public String url;
  
  public j()
  {
    GMTrace.i(592168615936L, 4412);
    this.gAV = 0;
    this.gAW = 0L;
    this.eSf = 0L;
    this.isColdSnsData = false;
    this.signalQuality = "";
    this.snsScene = "";
    this.ern = "";
    this.gAX = 0;
    GMTrace.o(592168615936L, 4412);
  }
  
  public final boolean Gp()
  {
    GMTrace.i(17503870779392L, 130414);
    if (this.gAN == 3)
    {
      GMTrace.o(17503870779392L, 130414);
      return true;
    }
    GMTrace.o(17503870779392L, 130414);
    return false;
  }
  
  public final String toString()
  {
    GMTrace.i(592437051392L, 4414);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("{");
    ((StringBuffer)localObject).append("isPlayMode: ").append(this.gAS);
    ((StringBuffer)localObject).append(" videoFormat: ").append(this.field_requestVideoFormat);
    ((StringBuffer)localObject).append(" initialDownloadLength : ").append(this.initialDownloadLength);
    ((StringBuffer)localObject).append(" initialDownloadOffset : ").append(this.initialDownloadOffset);
    ((StringBuffer)localObject).append(" videoXmlTotalLen : ").append(this.gAR);
    ((StringBuffer)localObject).append(" videoTaskType : ").append(this.gAN);
    ((StringBuffer)localObject).append(" filename : ").append(this.filename);
    int i;
    if (Gn())
    {
      ((StringBuffer)localObject).append(" url : ").append(this.url);
      ((StringBuffer)localObject).append(" host : ").append(this.host);
      ((StringBuffer)localObject).append(" referer : ").append(this.referer);
      StringBuffer localStringBuffer = ((StringBuffer)localObject).append(" ip size : ");
      if (this.iplist != null)
      {
        i = this.iplist.length;
        localStringBuffer.append(i);
        ((StringBuffer)localObject).append(" isColdSnsData : ").append(this.isColdSnsData);
        ((StringBuffer)localObject).append(" signalQuality : ").append(this.signalQuality);
        ((StringBuffer)localObject).append(" snsScene : ").append(this.snsScene);
      }
    }
    for (;;)
    {
      ((StringBuffer)localObject).append("fileid : ").append(this.field_fileId);
      ((StringBuffer)localObject).append("fileaeskey: ").append(this.field_aesKey);
      ((StringBuffer)localObject).append("field_preloadRatio:").append(this.field_preloadRatio);
      ((StringBuffer)localObject).append("newmd5: ").append(this.ern);
      ((StringBuffer)localObject).append("}");
      localObject = ((StringBuffer)localObject).toString();
      GMTrace.o(592437051392L, 4414);
      return (String)localObject;
      i = 0;
      break;
      ((StringBuffer)localObject).append(" field_mediaId : ").append(this.field_mediaId);
    }
  }
  
  public static abstract interface a
  {
    public abstract void A(String paramString, int paramInt);
    
    public abstract void f(String paramString, int paramInt1, int paramInt2);
    
    public abstract void onDataAvailable(String paramString, int paramInt1, int paramInt2);
    
    public abstract void onMoovReady(String paramString, int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcdntran\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */