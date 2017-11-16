package com.tencent.mm.plugin.downloader.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.fx;
import com.tencent.mm.g.a.fx.b;
import com.tencent.mm.g.a.fy;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.g.a.ga;
import com.tencent.mm.g.a.ga.b;
import com.tencent.mm.g.a.gb;
import com.tencent.mm.g.a.gb.b;
import com.tencent.mm.g.a.gc;
import com.tencent.mm.g.a.gc.b;
import com.tencent.mm.sdk.b.a;

final class l
  extends j
{
  private com.tencent.mm.sdk.b.c gpZ;
  
  public l(c paramc)
  {
    super(paramc);
    GMTrace.i(18605529890816L, 138622);
    this.gpZ = new com.tencent.mm.sdk.b.c() {};
    a.vgX.b(this.gpZ);
    GMTrace.o(18605529890816L, 138622);
  }
  
  public final long a(g paramg)
  {
    GMTrace.i(18605664108544L, 138623);
    fx localfx = new fx();
    localfx.eIN.eIP = paramg.hJF;
    localfx.eIN.eIQ = paramg.kfp;
    localfx.eIN.fileSize = paramg.kfq;
    localfx.eIN.euR = paramg.mFileName;
    localfx.eIN.eIR = paramg.kfr;
    localfx.eIN.fileType = paramg.kfs;
    localfx.eIN.appId = paramg.hyD;
    localfx.eIN.eIS = paramg.kft;
    localfx.eIN.eIT = paramg.kfu;
    localfx.eIN.eIU = paramg.kfv;
    localfx.eIN.packageName = paramg.mPackageName;
    localfx.eIN.eIV = paramg.kfw;
    localfx.eIN.scene = paramg.gRb;
    a.vgX.m(localfx);
    long l = localfx.eIO.eAf;
    GMTrace.o(18605664108544L, 138623);
    return l;
  }
  
  public final int bf(long paramLong)
  {
    GMTrace.i(18605798326272L, 138624);
    gb localgb = new gb();
    localgb.eJf.eAf = paramLong;
    a.vgX.m(localgb);
    int i = localgb.eJg.count;
    GMTrace.o(18605798326272L, 138624);
    return i;
  }
  
  public final FileDownloadTaskInfo bg(long paramLong)
  {
    GMTrace.i(18605932544000L, 138625);
    ga localga = new ga();
    localga.eJb.eAf = paramLong;
    a.vgX.m(localga);
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    localFileDownloadTaskInfo.id = paramLong;
    localFileDownloadTaskInfo.url = localga.eJc.url;
    localFileDownloadTaskInfo.status = localga.eJc.status;
    localFileDownloadTaskInfo.path = localga.eJc.path;
    localFileDownloadTaskInfo.eDW = localga.eJc.eDW;
    localFileDownloadTaskInfo.eJd = localga.eJc.eJd;
    localFileDownloadTaskInfo.eJe = localga.eJc.eJe;
    GMTrace.o(18605932544000L, 138625);
    return localFileDownloadTaskInfo;
  }
  
  public final boolean bh(long paramLong)
  {
    GMTrace.i(18606066761728L, 138626);
    fz localfz = new fz();
    localfz.eIZ.eAf = paramLong;
    a.vgX.m(localfz);
    boolean bool = localfz.eJa.eAO;
    GMTrace.o(18606066761728L, 138626);
    return bool;
  }
  
  public final boolean bi(long paramLong)
  {
    GMTrace.i(18606200979456L, 138627);
    gc localgc = new gc();
    localgc.eJh.eAf = paramLong;
    a.vgX.m(localgc);
    boolean bool = localgc.eJi.eAO;
    GMTrace.o(18606200979456L, 138627);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */