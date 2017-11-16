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

public final class fq
  extends c
{
  private final int height;
  private final int width;
  
  public fq()
  {
    GMTrace.i(21021448994816L, 156622);
    this.width = 210;
    this.height = 210;
    GMTrace.o(21021448994816L, 156622);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(21021583212544L, 156623);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(21021583212544L, 156623);
      return 0;
      GMTrace.o(21021583212544L, 156623);
      return 210;
      GMTrace.o(21021583212544L, 156623);
      return 210;
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
      ((Paint)localObject).setColor(-15028967);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(210.0F, 106.296295F);
      localPath.cubicTo(210.0F, 47.00889F, 162.9911F, 0.0F, 103.703705F, 0.0F);
      localPath.cubicTo(47.00889F, 0.0F, 0.0F, 47.00889F, 0.0F, 106.296295F);
      localPath.cubicTo(0.0F, 162.9911F, 47.00889F, 210.0F, 103.703705F, 210.0F);
      localPath.cubicTo(162.9911F, 210.0F, 210.0F, 162.9911F, 210.0F, 106.296295F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(54.281837F, 109.439514F);
      ((Path)localObject).lineTo(58.17945F, 104.19687F);
      ((Path)localObject).lineTo(58.17945F, 104.19687F);
      ((Path)localObject).cubicTo(58.640762F, 103.57636F, 59.51775F, 103.44731F, 60.138256F, 103.90862F);
      ((Path)localObject).cubicTo(60.141663F, 103.911156F, 60.145058F, 103.913704F, 60.148438F, 103.91627F);
      ((Path)localObject).lineTo(84.99948F, 122.74494F);
      ((Path)localObject).lineTo(84.99948F, 122.74494F);
      ((Path)localObject).cubicTo(85.516304F, 123.13652F, 86.2344F, 123.12196F, 86.73493F, 122.709755F);
      ((Path)localObject).lineTo(147.92569F, 72.31694F);
      ((Path)localObject).lineTo(147.92569F, 72.31694F);
      ((Path)localObject).cubicTo(148.47726F, 71.8627F, 149.28241F, 71.89673F, 149.79369F, 72.39588F);
      ((Path)localObject).lineTo(153.3208F, 75.83935F);
      ((Path)localObject).lineTo(153.3208F, 75.83935F);
      ((Path)localObject).cubicTo(153.87405F, 76.37948F, 153.8847F, 77.26585F, 153.34456F, 77.8191F);
      ((Path)localObject).cubicTo(153.33617F, 77.8277F, 153.32767F, 77.83619F, 153.31905F, 77.84457F);
      ((Path)localObject).lineTo(86.880226F, 142.48117F);
      ((Path)localObject).lineTo(86.880226F, 142.48117F);
      ((Path)localObject).cubicTo(86.32694F, 143.01945F, 85.44236F, 143.00832F, 84.902794F, 142.4563F);
      ((Path)localObject).lineTo(54.40418F, 111.25338F);
      ((Path)localObject).lineTo(54.40418F, 111.25338F);
      ((Path)localObject).cubicTo(53.922985F, 110.76107F, 53.871113F, 109.99198F, 54.281837F, 109.439514F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\fq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */