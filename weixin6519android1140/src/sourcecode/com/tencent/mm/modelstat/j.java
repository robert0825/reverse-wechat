package com.tencent.mm.modelstat;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public final class j
{
  private static final String gYT;
  int eQl;
  public int gYA;
  public int gYB;
  public int gYC;
  public int gYD;
  public int gYE;
  public int gYF;
  public int gYG;
  public int gYH;
  public int gYI;
  public int gYJ;
  public int gYK;
  public int gYL;
  public int gYM;
  public int gYN;
  public int gYO;
  public int gYP;
  public int gYQ;
  public int gYR;
  public int gYS;
  public int gYq;
  public int gYr;
  public int gYs;
  public int gYt;
  public int gYu;
  public int gYv;
  public int gYw;
  public int gYx;
  public int gYy;
  public int gYz;
  public int id;
  
  static
  {
    GMTrace.i(1387811307520L, 10340);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NetStatInfo:");
    localStringBuilder.append("[mobile in=%dB/%dB/%dB, out=%dB/%dB/%dB]");
    localStringBuilder.append("[wifi in=%dB/%dB/%dB, out=%dB/%dB/%dB]");
    localStringBuilder.append("[text in=%d/%dB, out=%d/%dB]");
    localStringBuilder.append("[image in=%d/%dB, out=%d/%dB]");
    localStringBuilder.append("[voice in=%d/%dB, out=%d/%dB]");
    localStringBuilder.append("[video in=%d/%dB, out=%d/%dB]");
    gYT = localStringBuilder.toString();
    GMTrace.o(1387811307520L, 10340);
  }
  
  public j()
  {
    GMTrace.i(1387408654336L, 10337);
    this.eQl = -2;
    this.id = 0;
    this.gYq = 0;
    this.gYr = 0;
    this.gYs = 0;
    this.gYt = 0;
    this.gYu = 0;
    this.gYv = 0;
    this.gYw = 0;
    this.gYx = 0;
    this.gYy = 0;
    this.gYz = 0;
    this.gYA = 0;
    this.gYB = 0;
    this.gYC = 0;
    this.gYD = 0;
    this.gYE = 0;
    this.gYF = 0;
    this.gYG = 0;
    this.gYH = 0;
    this.gYI = 0;
    this.gYJ = 0;
    this.gYK = 0;
    this.gYL = 0;
    this.gYM = 0;
    this.gYN = 0;
    this.gYO = 0;
    this.gYP = 0;
    this.gYQ = 0;
    this.gYR = 0;
    this.gYS = 0;
    GMTrace.o(1387408654336L, 10337);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(1387542872064L, 10338);
    this.id = paramCursor.getInt(0);
    this.gYq = paramCursor.getInt(1);
    this.gYr = paramCursor.getInt(2);
    this.gYs = paramCursor.getInt(3);
    this.gYt = paramCursor.getInt(4);
    this.gYu = paramCursor.getInt(5);
    this.gYv = paramCursor.getInt(6);
    this.gYw = paramCursor.getInt(7);
    this.gYx = paramCursor.getInt(8);
    this.gYy = paramCursor.getInt(9);
    this.gYz = paramCursor.getInt(10);
    this.gYA = paramCursor.getInt(11);
    this.gYB = paramCursor.getInt(12);
    this.gYC = paramCursor.getInt(13);
    this.gYD = paramCursor.getInt(14);
    this.gYE = paramCursor.getInt(15);
    this.gYF = paramCursor.getInt(16);
    this.gYG = paramCursor.getInt(17);
    this.gYH = paramCursor.getInt(18);
    this.gYI = paramCursor.getInt(19);
    this.gYJ = paramCursor.getInt(20);
    this.gYK = paramCursor.getInt(21);
    this.gYL = paramCursor.getInt(22);
    this.gYM = paramCursor.getInt(23);
    this.gYN = paramCursor.getInt(24);
    this.gYO = paramCursor.getInt(25);
    this.gYP = paramCursor.getInt(26);
    this.gYQ = paramCursor.getInt(27);
    this.gYR = paramCursor.getInt(28);
    this.gYS = paramCursor.getInt(29);
    GMTrace.o(1387542872064L, 10338);
  }
  
  public final String toString()
  {
    GMTrace.i(1387677089792L, 10339);
    String str = String.format(gYT, new Object[] { Integer.valueOf(this.gYz), Integer.valueOf(this.gYP), Integer.valueOf(this.gYB), Integer.valueOf(this.gYL), Integer.valueOf(this.gYR), Integer.valueOf(this.gYN), Integer.valueOf(this.gYA), Integer.valueOf(this.gYQ), Integer.valueOf(this.gYC), Integer.valueOf(this.gYM), Integer.valueOf(this.gYS), Integer.valueOf(this.gYO), Integer.valueOf(this.gYr), Integer.valueOf(this.gYs), Integer.valueOf(this.gYD), Integer.valueOf(this.gYE), Integer.valueOf(this.gYt), Integer.valueOf(this.gYu), Integer.valueOf(this.gYF), Integer.valueOf(this.gYG), Integer.valueOf(this.gYv), Integer.valueOf(this.gYw), Integer.valueOf(this.gYH), Integer.valueOf(this.gYI), Integer.valueOf(this.gYx), Integer.valueOf(this.gYy), Integer.valueOf(this.gYJ), Integer.valueOf(this.gYK) });
    GMTrace.o(1387677089792L, 10339);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */