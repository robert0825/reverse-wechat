package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.graphics.Point;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.od;
import com.tencent.mm.plugin.scanner.util.l;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends m
{
  public n(i.b paramb, Point paramPoint, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    super(paramb, paramPoint, paramDisplayMetrics, paramInt);
    GMTrace.i(6135629217792L, 45714);
    GMTrace.o(6135629217792L, 45714);
  }
  
  public final void a(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    GMTrace.i(6135763435520L, 45715);
    w.d("MicroMsg.ScanModeLicenceForIdCardPayAuth", "onDecodeSuccess");
    paramString = ((l)this.oxK).oBo;
    paramArrayOfByte = new od();
    paramArrayOfByte.eTb.cardType = "identity";
    paramArrayOfByte.eTb.eTc = 1;
    if ((this.oxK instanceof l)) {
      paramArrayOfByte.eTb.eTe = paramString;
    }
    a.vgX.a(paramArrayOfByte, Looper.getMainLooper());
    this.oxQ.bcT().finish();
    GMTrace.o(6135763435520L, 45715);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */