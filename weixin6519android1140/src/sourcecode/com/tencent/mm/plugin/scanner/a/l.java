package com.tencent.mm.plugin.scanner.a;

import android.graphics.Point;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class l
{
  public static int otl;
  public static int otm;
  public static int otn;
  public static l oto;
  private boolean gRT;
  public String otA;
  public StringBuilder otB;
  private int otC;
  public boolean otD;
  private long otp;
  public boolean otq;
  public int otr;
  private long ots;
  public int ott;
  private Point otu;
  public String otv;
  public String otw;
  public String otx;
  public int oty;
  public int otz;
  private int retryCount;
  
  static
  {
    GMTrace.i(6056038105088L, 45121);
    otl = 0;
    otm = 1;
    otn = 2;
    oto = new l();
    GMTrace.o(6056038105088L, 45121);
  }
  
  public l()
  {
    GMTrace.i(6054695927808L, 45111);
    this.otp = 0L;
    this.otq = false;
    this.otr = 0;
    this.ots = 0L;
    this.ott = -1;
    this.otu = null;
    this.retryCount = 0;
    this.otB = new StringBuilder();
    this.gRT = false;
    GMTrace.o(6054695927808L, 45111);
  }
  
  public final void aIS()
  {
    int k = 0;
    GMTrace.i(6055769669632L, 45119);
    if (this.gRT)
    {
      w.i("MicroMsg.QBarEngineReporter", "doReport, already report");
      GMTrace.o(6055769669632L, 45119);
      return;
    }
    int j = this.otr;
    long l1 = this.otp;
    long l2 = this.ots;
    int m = this.ott;
    Object localObject1 = this.otu;
    int n = this.retryCount;
    boolean bool = this.otq;
    Object localObject2 = this.otv;
    String str1 = this.otw;
    String str2 = this.otx;
    int i1 = this.oty;
    int i2 = this.otz;
    String str3 = this.otA;
    int i;
    label357:
    int i3;
    if (!bg.nm(this.otw))
    {
      i = this.otw.length();
      w.i("MicroMsg.QBarEngineReporter", "doReport, scanTotalFrames: %s, totalScanTime: %s, scanSuccessTime: %s, scanScene: %s, scanResolution: %s, retryCount: %s, scanSuccess: %s, decodeTypeName: %s, dataContent: %s, dataCharSet: %s, qrCodeVersion: %s, pyramidLv: %s, binarizerMethod: %s,dataContentLen: %d,zoomLog: %s,lightMode: %d", new Object[] { Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(m), localObject1, Integer.valueOf(n), Boolean.valueOf(bool), localObject2, str1, str2, Integer.valueOf(i1), Integer.valueOf(i2), str3, Integer.valueOf(i), this.otB.toString(), Integer.valueOf(this.otC) });
      localObject1 = "";
      if (this.otu != null) {
        localObject1 = this.otu.x + "x" + this.otu.y;
      }
      localObject2 = g.ork;
      m = this.otr;
      l1 = this.otp;
      l2 = this.ots;
      n = this.ott;
      i1 = this.retryCount;
      if (!this.otq) {
        break label587;
      }
      i = 0;
      str1 = this.otv;
      str2 = this.otx;
      i2 = this.oty;
      i3 = this.otz;
      str3 = this.otA;
      if (bg.nm(this.otw)) {
        break label592;
      }
    }
    label587:
    label592:
    for (j = this.otw.length();; j = 0)
    {
      String str4 = this.otB.toString();
      int i4 = this.otC;
      if (this.otD) {
        k = 1;
      }
      ((g)localObject2).i(13233, new Object[] { Integer.valueOf(m), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(n), localObject1, Integer.valueOf(i1), Integer.valueOf(i), str1, "", str2, Integer.valueOf(i2), Integer.valueOf(i3), str3, Integer.valueOf(j), str4, Integer.valueOf(i4), Integer.valueOf(k) });
      this.gRT = true;
      GMTrace.o(6055769669632L, 45119);
      return;
      i = 0;
      break;
      i = 1;
      break label357;
    }
  }
  
  public final void bcq()
  {
    GMTrace.i(6054964363264L, 45113);
    w.i("MicroMsg.QBarEngineReporter", "markScanSuccess");
    this.otq = true;
    GMTrace.o(6054964363264L, 45113);
  }
  
  public final void bcr()
  {
    GMTrace.i(6055098580992L, 45114);
    w.i("MicroMsg.QBarEngineReporter", "addScanFrame, current scan frame: %s", new Object[] { Integer.valueOf(this.otr) });
    this.otr += 1;
    GMTrace.o(6055098580992L, 45114);
  }
  
  public final void bcs()
  {
    GMTrace.i(6055501234176L, 45117);
    w.i("MicroMsg.QBarEngineReporter", "addRetryTime, current retry count: %s", new Object[] { Integer.valueOf(this.retryCount) });
    this.retryCount += 1;
    GMTrace.o(6055501234176L, 45117);
  }
  
  public final void cO(int paramInt1, int paramInt2)
  {
    GMTrace.i(6055367016448L, 45116);
    w.i("MicroMsg.QBarEngineReporter", "setScanResolution, width: %s, height: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.otu = new Point(paramInt1, paramInt2);
    GMTrace.o(6055367016448L, 45116);
  }
  
  public final void di(long paramLong)
  {
    GMTrace.i(6054830145536L, 45112);
    w.i("MicroMsg.QBarEngineReporter", "addScanTime: %s", new Object[] { Long.valueOf(paramLong) });
    this.otp += paramLong;
    GMTrace.o(6054830145536L, 45112);
  }
  
  public final void dj(long paramLong)
  {
    GMTrace.i(6055635451904L, 45118);
    w.i("MicroMsg.QBarEngineReporter", "setScanSuccessTime: %s,", new Object[] { Long.valueOf(paramLong) });
    this.ots = paramLong;
    GMTrace.o(6055635451904L, 45118);
  }
  
  public final void reset()
  {
    GMTrace.i(6055903887360L, 45120);
    this.otp = 0L;
    this.otq = false;
    this.otr = 0;
    this.ott = -1;
    this.otu = null;
    this.retryCount = 0;
    this.otv = "";
    this.otw = "";
    this.otx = "";
    this.oty = 0;
    this.otz = 0;
    this.otA = "";
    this.ots = 0L;
    this.gRT = false;
    this.otB.delete(0, this.otB.length());
    this.otC = 0;
    this.otD = false;
    w.i("MicroMsg.QBarEngineReporter", "reset");
    GMTrace.o(6055903887360L, 45120);
  }
  
  public final void tu(int paramInt)
  {
    GMTrace.i(6055232798720L, 45115);
    w.i("MicroMsg.QBarEngineReporter", "setScanScene, scene: %s", new Object[] { Integer.valueOf(paramInt) });
    this.ott = paramInt;
    GMTrace.o(6055232798720L, 45115);
  }
  
  public final void tv(int paramInt)
  {
    GMTrace.i(20380022472704L, 151843);
    if (this.otC != 2) {
      this.otC = paramInt;
    }
    GMTrace.o(20380022472704L, 151843);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */