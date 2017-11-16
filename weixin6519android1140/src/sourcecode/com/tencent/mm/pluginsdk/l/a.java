package com.tencent.mm.pluginsdk.l;

import com.tencent.gmtrace.GMTrace;

@Deprecated
public final class a
{
  public static int mZr;
  public static int mZs;
  public int eSp;
  public int fps;
  public int hcv;
  public int kXB;
  public int kXC;
  public String mZA;
  public String mZB;
  public String mZC;
  public int mZD;
  public int mZE;
  public int mZt;
  public int mZu;
  public int mZv;
  public int mZw;
  public int mZx;
  public String mZy;
  public String mZz;
  
  static
  {
    GMTrace.i(891608367104L, 6643);
    mZr = 480;
    mZs = 640;
    GMTrace.o(891608367104L, 6643);
  }
  
  public a()
  {
    GMTrace.i(890937278464L, 6638);
    GMTrace.o(890937278464L, 6638);
  }
  
  public static a bKu()
  {
    GMTrace.i(891205713920L, 6640);
    a locala = new a();
    locala.fps = 30;
    locala.eSp = 0;
    locala.mZu = 640;
    locala.mZv = 480;
    locala.kXC = 640;
    locala.kXB = 480;
    locala.mZt = 1440000;
    locala.mZw = 1;
    locala.mZx = 4;
    locala.mZy = "/sdcard/1.yuv";
    locala.mZC = "/sdcard/1.mp4";
    locala.mZz = "/sdcard/1.pcm";
    locala.mZB = "/sdcard/1.x264";
    locala.mZD = 0;
    locala.hcv = 0;
    locala.mZE = 0;
    GMTrace.o(891205713920L, 6640);
    return locala;
  }
  
  public static a bKv()
  {
    GMTrace.i(891339931648L, 6641);
    a locala = new a();
    locala.fps = 30;
    locala.eSp = 0;
    locala.mZu = mZs;
    locala.mZv = mZr;
    locala.kXC = mZs;
    locala.kXB = mZr;
    locala.mZt = 327680;
    locala.mZw = 4;
    locala.mZx = 1;
    locala.mZy = "/sdcard/2.yuv";
    locala.mZC = "/sdcard/2.mp4";
    locala.mZz = "/sdcard/2.pcm";
    locala.mZB = "/sdcard/2.x264";
    locala.mZD = 0;
    locala.hcv = 0;
    locala.mZE = 0;
    GMTrace.o(891339931648L, 6641);
    return locala;
  }
  
  public final String toString()
  {
    GMTrace.i(891071496192L, 6639);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("fps=").append(this.fps).append('\n');
    ((StringBuilder)localObject).append("width=").append(this.kXB).append('\n');
    ((StringBuilder)localObject).append("height=").append(this.kXC).append('\n');
    ((StringBuilder)localObject).append("bitrate=").append(this.mZt).append('\n');
    ((StringBuilder)localObject).append("rotate=").append(this.eSp).append('\n');
    ((StringBuilder)localObject).append("yuvWidth=").append(this.mZv).append('\n');
    ((StringBuilder)localObject).append("yuvHeight=").append(this.mZu).append('\n');
    ((StringBuilder)localObject).append("x264Speed=").append(this.mZw).append('\n');
    ((StringBuilder)localObject).append("x264Quality=").append(this.mZx).append('\n');
    ((StringBuilder)localObject).append("yuvFile=").append(this.mZy).append('\n');
    ((StringBuilder)localObject).append("pcmFile=").append(this.mZz).append('\n');
    ((StringBuilder)localObject).append("thuFile=").append(this.mZA).append('\n');
    ((StringBuilder)localObject).append("x264File=").append(this.mZB).append('\n');
    ((StringBuilder)localObject).append("mp4File=").append(this.mZC).append('\n');
    ((StringBuilder)localObject).append("videoFrameCnt=").append(this.mZD).append('\n');
    ((StringBuilder)localObject).append("videoLength=").append(this.hcv).append('\n');
    ((StringBuilder)localObject).append("cameraCount=").append(this.mZE).append('\n');
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(891071496192L, 6639);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\l\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */