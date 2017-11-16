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

public final class amd
  extends c
{
  private final int height;
  private final int width;
  
  public amd()
  {
    GMTrace.i(15723204182016L, 117147);
    this.width = 210;
    this.height = 210;
    GMTrace.o(15723204182016L, 117147);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15723338399744L, 117148);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15723338399744L, 117148);
      return 0;
      GMTrace.o(15723338399744L, 117148);
      return 210;
      GMTrace.o(15723338399744L, 117148);
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
      ((Paint)localObject).setColor(-2471350);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(105.0F, 0.0F);
      localPath.cubicTo(162.9899F, 0.0F, 210.0F, 47.010098F, 210.0F, 105.0F);
      localPath.cubicTo(210.0F, 162.9899F, 162.9899F, 210.0F, 105.0F, 210.0F);
      localPath.cubicTo(47.010098F, 210.0F, 0.0F, 162.9899F, 0.0F, 105.0F);
      localPath.cubicTo(0.0F, 47.010098F, 47.010098F, 0.0F, 105.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(105.0F, 96.46164F);
      ((Path)localObject).cubicTo(93.324905F, 96.46164F, 85.05575F, 99.22135F, 83.17065F, 101.40075F);
      ((Path)localObject).cubicTo(81.28554F, 103.58014F, 79.694786F, 112.07398F, 77.24351F, 114.4038F);
      ((Path)localObject).cubicTo(76.0654F, 115.52354F, 63.405796F, 117.93891F, 61.901104F, 118.25871F);
      ((Path)localObject).cubicTo(60.39641F, 118.578514F, 58.85897F, 118.73449F, 58.145496F, 117.714584F);
      ((Path)localObject).cubicTo(57.432022F, 116.69469F, 51.136547F, 103.91579F, 60.94151F, 96.85904F);
      ((Path)localObject).cubicTo(70.746475F, 89.8023F, 91.694466F, 87.15565F, 105.0F, 87.0F);
      ((Path)localObject).lineTo(105.0F, 96.46164F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(105.0F, 96.46164F);
      ((Path)localObject).cubicTo(116.675095F, 96.46164F, 124.94425F, 99.22135F, 126.82935F, 101.40075F);
      ((Path)localObject).cubicTo(128.71446F, 103.58014F, 130.30522F, 112.07398F, 132.7565F, 114.4038F);
      ((Path)localObject).cubicTo(133.9346F, 115.52354F, 146.59421F, 117.93891F, 148.09889F, 118.25871F);
      ((Path)localObject).cubicTo(149.60359F, 118.578514F, 151.14102F, 118.73449F, 151.8545F, 117.714584F);
      ((Path)localObject).cubicTo(152.56798F, 116.69469F, 158.86345F, 103.91579F, 149.05849F, 96.85904F);
      ((Path)localObject).cubicTo(139.25352F, 89.8023F, 118.305534F, 87.15565F, 105.0F, 87.0F);
      ((Path)localObject).lineTo(105.0F, 96.46164F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\amd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */