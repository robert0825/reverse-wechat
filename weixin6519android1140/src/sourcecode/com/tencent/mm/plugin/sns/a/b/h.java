package com.tencent.mm.plugin.sns.a.b;

import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.a.b.a.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class h
{
  public String TAG;
  public int pnD;
  public int pnE;
  public long pnF;
  public int pnG;
  public int pnH;
  public int pnI;
  public int pnJ;
  public a pnK;
  public LinkedList<a> pnL;
  
  public h()
  {
    GMTrace.i(8162719563776L, 60817);
    this.TAG = "MicroMsg.SnsAdVideoStatistic";
    this.pnD = 0;
    this.pnE = 0;
    this.pnF = 0L;
    this.pnG = 0;
    this.pnH = 0;
    this.pnI = 0;
    this.pnJ = 0;
    this.pnK = new a();
    this.pnL = new LinkedList();
    GMTrace.o(8162719563776L, 60817);
  }
  
  public h(String paramString)
  {
    GMTrace.i(8162853781504L, 60818);
    this.TAG = "MicroMsg.SnsAdVideoStatistic";
    this.pnD = 0;
    this.pnE = 0;
    this.pnF = 0L;
    this.pnG = 0;
    this.pnH = 0;
    this.pnI = 0;
    this.pnJ = 0;
    this.pnK = new a();
    this.pnL = new LinkedList();
    this.TAG = ("MicroMsg.SnsAdVideoStatistic:" + paramString);
    GMTrace.o(8162853781504L, 60818);
  }
  
  public final String bhH()
  {
    GMTrace.i(8163122216960L, 60820);
    if (this.pnF == 0L) {}
    for (int i = 0;; i = (int)bg.aI(this.pnF))
    {
      this.pnE = i;
      w.d(this.TAG, "__staytotaltime " + this.pnF + " " + this.pnE + " clock: " + SystemClock.elapsedRealtime());
      localObject = new StringBuffer();
      ((StringBuffer)localObject).append("<viewinfo>");
      ((StringBuffer)localObject).append("<downloadstatus>");
      ((StringBuffer)localObject).append(this.pnD);
      ((StringBuffer)localObject).append("</downloadstatus>");
      ((StringBuffer)localObject).append("<staytotaltime>");
      ((StringBuffer)localObject).append(this.pnE);
      ((StringBuffer)localObject).append("</staytotaltime>");
      if (this.pnG > 0)
      {
        ((StringBuffer)localObject).append("<masktotaltime>");
        ((StringBuffer)localObject).append(this.pnG);
        ((StringBuffer)localObject).append("</masktotaltime>");
      }
      ((StringBuffer)localObject).append(String.format("<playitemlist count=\"%d\">", new Object[] { Integer.valueOf(this.pnL.size()) }));
      i = 0;
      while (i < this.pnL.size())
      {
        a locala = (a)this.pnL.get(i);
        ((StringBuffer)localObject).append("<playitem>");
        ((StringBuffer)localObject).append(String.format("<playcount>%d</playcount>", new Object[] { Integer.valueOf(locala.poH) }));
        ((StringBuffer)localObject).append(String.format("<playtotaltime>%d</playtotaltime>", new Object[] { Integer.valueOf(locala.poI) }));
        ((StringBuffer)localObject).append(String.format("<videototaltime>%d</videototaltime>", new Object[] { Integer.valueOf(locala.poJ * 1000) }));
        ((StringBuffer)localObject).append(String.format("<playmode>%d</playmode>", new Object[] { Integer.valueOf(locala.poK) }));
        ((StringBuffer)localObject).append(String.format("<playorientation>%d</playorientation>", new Object[] { Integer.valueOf(locala.poL) }));
        ((StringBuffer)localObject).append("</playitem>");
        i += 1;
      }
    }
    ((StringBuffer)localObject).append("</playitemlist>");
    ((StringBuffer)localObject).append("</viewinfo>");
    Object localObject = ((StringBuffer)localObject).toString();
    w.i(this.TAG, "xml " + (String)localObject);
    GMTrace.o(8163122216960L, 60820);
    return (String)localObject;
  }
  
  public final void ud(int paramInt)
  {
    GMTrace.i(8162987999232L, 60819);
    a locala;
    if (this.pnK.poI <= 0)
    {
      locala = this.pnK;
      if (this.pnK.poM != 0L) {
        break label130;
      }
    }
    label130:
    for (int i = 0;; i = (int)bg.aI(this.pnK.poM))
    {
      locala.poI = i;
      if (paramInt != 0) {
        this.pnK.poJ = paramInt;
      }
      w.i(this.TAG, "pushplayitem duration " + this.pnK.poI + " " + this.pnK.poL);
      this.pnL.add(this.pnK);
      this.pnK = new a();
      GMTrace.o(8162987999232L, 60819);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\a\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */