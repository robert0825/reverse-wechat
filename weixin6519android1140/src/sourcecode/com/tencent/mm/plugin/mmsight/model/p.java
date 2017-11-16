package com.tencent.mm.plugin.mmsight.model;

import com.tencent.gmtrace.GMTrace;

public final class p
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
    GMTrace.i(18671833448448L, 139116);
    mZr = 480;
    mZs = 640;
    GMTrace.o(18671833448448L, 139116);
  }
  
  public p()
  {
    GMTrace.i(18671430795264L, 139113);
    GMTrace.o(18671430795264L, 139113);
  }
  
  public static p aPm()
  {
    GMTrace.i(18671699230720L, 139115);
    p localp = new p();
    localp.fps = 30;
    localp.eSp = 0;
    localp.mZu = mZs;
    localp.mZv = mZr;
    localp.kXC = mZs;
    localp.kXB = mZr;
    localp.mZt = 327680;
    localp.mZw = 4;
    localp.mZx = 1;
    localp.mZy = "/sdcard/2.yuv";
    localp.mZC = "/sdcard/2.mp4";
    localp.mZz = "/sdcard/2.pcm";
    localp.mZB = "/sdcard/2.x264";
    localp.mZD = 0;
    localp.hcv = 0;
    localp.mZE = 0;
    GMTrace.o(18671699230720L, 139115);
    return localp;
  }
  
  public final String toString()
  {
    GMTrace.i(18671565012992L, 139114);
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
    GMTrace.o(18671565012992L, 139114);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */