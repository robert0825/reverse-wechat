package com.tencent.mm.plugin.scanner.util;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qbar.QbarNative;

public abstract class b
{
  protected static int oAc;
  protected int eDg;
  protected int eDh;
  protected byte[] oAa;
  public String oAb;
  public boolean[] oAd;
  protected a ozY;
  protected byte[] ozZ;
  
  static
  {
    GMTrace.i(6178847326208L, 46036);
    oAc = 0;
    GMTrace.o(6178847326208L, 46036);
  }
  
  public b(a parama)
  {
    GMTrace.i(6178310455296L, 46032);
    this.ozY = null;
    this.ozZ = null;
    this.oAa = null;
    this.oAd = null;
    this.ozY = parama;
    GMTrace.o(6178310455296L, 46032);
  }
  
  public final void a(final byte[] paramArrayOfByte, final Point paramPoint, final int paramInt, final Rect paramRect)
  {
    GMTrace.i(20666577321984L, 153978);
    w.d("MicroMsg.scanner.BaseDecoder", "decode task reach");
    e.b(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6178176237568L, 46031);
        byte[] arrayOfByte1 = paramArrayOfByte;
        if (270 == paramInt)
        {
          byte[] arrayOfByte2 = new byte[paramArrayOfByte.length];
          QbarNative.a(arrayOfByte2, paramArrayOfByte, paramPoint.x, paramPoint.y);
          arrayOfByte1 = new byte[paramArrayOfByte.length];
          QbarNative.a(arrayOfByte1, arrayOfByte2, paramPoint.y, paramPoint.x);
          QbarNative.nativeRelease();
        }
        w.d("MicroMsg.scanner.BaseDecoder", "asyncDecode() resolution:%s, coverage:%s", new Object[] { paramPoint.toString(), paramRect.toString() });
        if ((paramArrayOfByte != null) && (b.this.a(arrayOfByte1, paramPoint, paramRect)))
        {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6176699842560L, 46020);
              if (b.this.ozY != null) {
                b.this.ozY.a(b.oAc, b.this.oAb, b.this.oAa, b.this.eDg, b.this.eDh);
              }
              GMTrace.o(6176699842560L, 46020);
            }
          });
          GMTrace.o(6178176237568L, 46031);
          return;
        }
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6160862150656L, 45902);
            if (b.this.ozY != null)
            {
              w.d("MicroMsg.scanner.BaseDecoder", "failed in asyncDecode() resolution:%s, coverage:%s", new Object[] { b.1.this.oAf.toString(), b.1.this.oAg.toString() });
              b.this.ozY.bct();
            }
            GMTrace.o(6160862150656L, 45902);
          }
        });
        GMTrace.o(6178176237568L, 46031);
      }
    }, "scan_decode", 10);
    GMTrace.o(20666577321984L, 153978);
  }
  
  public abstract boolean a(byte[] paramArrayOfByte, Point paramPoint, Rect paramRect);
  
  public abstract void bdl();
  
  public abstract void releaseDecoder();
  
  public static abstract interface a
  {
    public static final boolean[] oAj;
    
    static
    {
      GMTrace.i(6161801674752L, 45909);
      oAj = new boolean[2];
      GMTrace.o(6161801674752L, 45909);
    }
    
    public abstract void E(Bundle paramBundle);
    
    public abstract void a(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
    
    public abstract void bct();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */