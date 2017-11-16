package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class mc
  extends c
{
  private final int height;
  private final int width;
  
  public mc()
  {
    GMTrace.i(15748437114880L, 117335);
    this.width = 192;
    this.height = 192;
    GMTrace.o(15748437114880L, 117335);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15748571332608L, 117336);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15748571332608L, 117336);
      return 0;
      GMTrace.o(15748571332608L, 117336);
      return 192;
      GMTrace.o(15748571332608L, 117336);
      return 192;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
      Paint localPaint = c.h(paramVarArgs);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.h(paramVarArgs);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramVarArgs).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      ((Paint)localObject).setColor(-12953699);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(192.0F, 0.0F);
      localPath.lineTo(192.0F, 192.0F);
      localPath.lineTo(0.0F, 192.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(104.72727F, 192.0F);
      ((Path)localObject).lineTo(104.72727F, 117.818184F);
      ((Path)localObject).lineTo(80.0F, 117.818184F);
      ((Path)localObject).lineTo(80.0F, 87.27273F);
      ((Path)localObject).lineTo(104.72727F, 87.27273F);
      ((Path)localObject).lineTo(104.72727F, 61.090908F);
      ((Path)localObject).cubicTo(104.62603F, 44.320255F, 121.209656F, 29.09091F, 138.18182F, 29.09091F);
      ((Path)localObject).lineTo(164.36363F, 29.09091F);
      ((Path)localObject).lineTo(164.36363F, 58.18182F);
      ((Path)localObject).lineTo(148.36363F, 58.18182F);
      ((Path)localObject).cubicTo(137.98802F, 58.097572F, 133.74586F, 62.3439F, 133.81818F, 72.72727F);
      ((Path)localObject).lineTo(133.81818F, 87.27273F);
      ((Path)localObject).lineTo(164.36363F, 87.27273F);
      ((Path)localObject).lineTo(158.54546F, 117.818184F);
      ((Path)localObject).lineTo(133.81818F, 117.818184F);
      ((Path)localObject).lineTo(133.81818F, 192.0F);
      ((Path)localObject).lineTo(104.72727F, 192.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\mc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */