package com.tencent.mm.plugin.clean.c;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.clean.c.a.a.a;
import com.tencent.mm.plugin.clean.c.a.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;

public final class e
  extends Thread
  implements a.a
{
  private long endTime;
  private ae ghS;
  private boolean isStop;
  private b jSV;
  private int jSX;
  private int jSY;
  private h jTm;
  private ArrayList<a> jTn;
  private int jTo;
  private long startTime;
  
  public e(b paramb, h paramh, ArrayList<a> paramArrayList)
  {
    GMTrace.i(7038646091776L, 52442);
    this.jSX = 0;
    this.jSY = 0;
    this.jTo = 0;
    this.startTime = 0L;
    this.endTime = 0L;
    this.ghS = new ae(Looper.getMainLooper());
    this.jSV = paramb;
    this.jTm = paramh;
    this.jTn = paramArrayList;
    GMTrace.o(7038646091776L, 52442);
  }
  
  private void anT()
  {
    GMTrace.i(7038914527232L, 52444);
    this.endTime = System.currentTimeMillis();
    w.i("MicroMsg.DeleteFileController", "totalUserTime:%d", new Object[] { Long.valueOf(this.endTime - this.startTime) });
    if ((this.jTm != null) && (!this.isStop)) {
      this.ghS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7045759631360L, 52495);
          e.c(e.this).be(e.d(e.this));
          GMTrace.o(7045759631360L, 52495);
        }
      });
    }
    GMTrace.o(7038914527232L, 52444);
  }
  
  public final void a(com.tencent.mm.plugin.clean.c.a.a parama)
  {
    GMTrace.i(15048625881088L, 112121);
    interrupt();
    this.jSY += 1;
    if ((this.jTm != null) && (!this.isStop)) {
      this.ghS.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7045222760448L, 52491);
          e.c(e.this).bR(e.a(e.this), e.b(e.this));
          GMTrace.o(7045222760448L, 52491);
        }
      });
    }
    if (this.jSY == this.jSX) {
      anT();
    }
    GMTrace.o(15048625881088L, 112121);
  }
  
  public final void aoh()
  {
    GMTrace.i(7039048744960L, 52445);
    w.i("MicroMsg.DeleteFileController", "stop analyseController");
    this.isStop = true;
    interrupt();
    GMTrace.o(7039048744960L, 52445);
  }
  
  public final void run()
  {
    GMTrace.i(7038780309504L, 52443);
    this.startTime = System.currentTimeMillis();
    this.jSX = this.jTn.size();
    w.d("MicroMsg.DeleteFileController", "totalTaskCount=%d", new Object[] { Integer.valueOf(this.jSX) });
    if (this.jSX == 0)
    {
      anT();
      GMTrace.o(7038780309504L, 52443);
      return;
    }
    int i = 0;
    while ((!this.isStop) && (i < this.jTn.size()))
    {
      a locala = (a)this.jTn.get(i);
      w.d("MicroMsg.DeleteFileController", "while loop index=%d | filePath=%s", new Object[] { Integer.valueOf(i), locala.filePath });
      a locala1 = new a(locala);
      while (!this.jSV.b(locala1)) {
        try
        {
          Thread.sleep(100L);
        }
        catch (InterruptedException localInterruptedException) {}
      }
      w.d("MicroMsg.DeleteFileController", "Start task： filePath＝%s", new Object[] { locala.filePath });
      i += 1;
    }
    GMTrace.o(7038780309504L, 52443);
  }
  
  final class a
    extends com.tencent.mm.plugin.clean.c.a.a
  {
    private a jTq;
    
    public a(a parama)
    {
      super();
      GMTrace.i(7045356978176L, 52492);
      this.jTq = parama;
      GMTrace.o(7045356978176L, 52492);
    }
    
    public final void execute()
    {
      GMTrace.i(7045491195904L, 52493);
      at.AR();
      Object localObject = com.tencent.mm.y.c.yM().cM(this.jTq.eCL);
      if (((ce)localObject).field_msgId != 0L)
      {
        ((au)localObject).bTP();
        at.AR();
        com.tencent.mm.y.c.yM().a(this.jTq.eCL, (au)localObject);
      }
      localObject = new File(this.jTq.filePath);
      e.a(e.this, (int)(e.d(e.this) + ((File)localObject).length()));
      ((File)localObject).delete();
      GMTrace.o(7045491195904L, 52493);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\clean\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */