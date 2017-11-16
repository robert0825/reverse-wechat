package com.tencent.mm.plugin.scanner.util;

import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.qbar.QbarNative;

public final class i
{
  private boolean isInit;
  private long oBf;
  
  public i()
  {
    GMTrace.i(6181129027584L, 46053);
    this.isInit = false;
    this.oBf = 0L;
    GMTrace.o(6181129027584L, 46053);
  }
  
  public final boolean a(byte[] paramArrayOfByte, Point paramPoint, Rect paramRect, boolean paramBoolean)
  {
    boolean bool = true;
    Rect localRect;
    int i;
    for (;;)
    {
      try
      {
        GMTrace.i(6181263245312L, 46054);
        localRect = new Rect();
        int j;
        if ((com.tencent.mm.compatible.d.c.sG()) || (paramBoolean))
        {
          i = paramRect.width();
          j = paramRect.height();
          localRect.left = paramRect.left;
          paramRect.right -= i % 4;
          localRect.top = paramRect.top;
          paramRect.bottom -= j % 4;
          if ((localRect.right <= localRect.left) || (localRect.bottom <= localRect.top))
          {
            GMTrace.o(6181263245312L, 46054);
            paramBoolean = bool;
            return paramBoolean;
          }
        }
        else
        {
          localRect.left = (paramPoint.x / 2 - paramRect.height());
          localRect.right = (paramPoint.x / 2 + paramRect.height());
          localRect.top = (paramPoint.y / 2 - paramRect.width() / 2);
          localRect.bottom = (paramPoint.y / 2 + paramRect.width() / 2);
          if (localRect.left < 0) {
            localRect.left = 0;
          }
          if (localRect.right > paramPoint.x - 1) {
            localRect.right = (paramPoint.x - 1);
          }
          if (localRect.top < 0) {
            localRect.top = 0;
          }
          if (localRect.bottom > paramPoint.y - 1) {
            localRect.bottom = (paramPoint.y - 1);
          }
          i = localRect.width() % 4;
          j = localRect.height() % 4;
          if (i != 0) {
            localRect.right -= i;
          }
          if (j != 0) {
            localRect.bottom -= j;
          }
          if ((localRect.right <= localRect.left) || (localRect.bottom <= localRect.top))
          {
            GMTrace.o(6181263245312L, 46054);
            paramBoolean = bool;
            continue;
          }
        }
        paramArrayOfByte = new c(paramArrayOfByte, paramPoint.x, paramPoint.y, localRect).bdn();
      }
      finally {}
      if (paramArrayOfByte != null) {
        break;
      }
      GMTrace.o(6181263245312L, 46054);
      paramBoolean = bool;
    }
    if (!this.isInit)
    {
      if (!com.tencent.mm.compatible.d.c.sG()) {}
      for (i = QbarNative.FocusInit(localRect.height(), localRect.width(), false, 15, 65);; i = QbarNative.FocusInit(localRect.width(), localRect.height(), false, 15, 65))
      {
        if (i != -1) {
          break label517;
        }
        w.e("MicroMsg.ScanClearImageDetector", "error in Focus init = [%s]", new Object[] { Integer.valueOf(i) });
        GMTrace.o(6181263245312L, 46054);
        paramBoolean = bool;
        break;
      }
      label517:
      this.isInit = true;
    }
    long l = bg.Pw();
    QbarNative.FocusPro(paramArrayOfByte, com.tencent.mm.compatible.d.c.sG(), b.a.oAj);
    w.d("MicroMsg.ScanClearImageDetector", "is best:%s, need focus:%s, cost:%s", new Object[] { Boolean.valueOf(b.a.oAj[0]), Boolean.valueOf(b.a.oAj[1]), Long.valueOf(bg.aI(l)) });
    if (b.a.oAj[1] != 0) {
      this.oBf = System.currentTimeMillis();
    }
    for (;;)
    {
      paramBoolean = b.a.oAj[1];
      GMTrace.o(6181263245312L, 46054);
      break;
      if (this.oBf <= 0L) {
        this.oBf = System.currentTimeMillis();
      }
      l = System.currentTimeMillis();
      if (l - this.oBf >= 2000L)
      {
        w.d("MicroMsg.ScanClearImageDetector", "timeout, need refocus");
        b.a.oAj[1] = true;
        this.oBf = l;
      }
    }
  }
  
  public final void release()
  {
    try
    {
      GMTrace.i(6181397463040L, 46055);
      this.oBf = 0L;
      if (this.isInit)
      {
        w.d("MicroMsg.ScanClearImageDetector", "release, ret: %s", new Object[] { Integer.valueOf(QbarNative.FocusRelease()) });
        this.isInit = false;
      }
      GMTrace.o(6181397463040L, 46055);
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */