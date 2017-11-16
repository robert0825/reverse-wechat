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

public final class my
  extends c
{
  private final int height;
  private final int width;
  
  public my()
  {
    GMTrace.i(15907082469376L, 118517);
    this.width = 192;
    this.height = 192;
    GMTrace.o(15907082469376L, 118517);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15907216687104L, 118518);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15907216687104L, 118518);
      return 0;
      GMTrace.o(15907216687104L, 118518);
      return 192;
      GMTrace.o(15907216687104L, 118518);
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
      ((Paint)localObject).setColor(-12206054);
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
      ((Path)localObject).moveTo(125.05173F, 106.30443F);
      ((Path)localObject).cubicTo(134.37202F, 117.3619F, 151.40338F, 137.34488F, 152.32759F, 139.00922F);
      ((Path)localObject).cubicTo(156.1268F, 140.24745F, 158.94827F, 137.81317F, 158.94827F, 135.69887F);
      ((Path)localObject).lineTo(158.94827F, 56.250595F);
      ((Path)localObject).cubicTo(158.94827F, 53.69053F, 155.8298F, 51.942085F, 152.32759F, 52.94025F);
      ((Path)localObject).cubicTo(150.75885F, 54.967968F, 134.14519F, 74.351326F, 125.05173F, 85.322044F);
      ((Path)localObject).lineTo(125.05173F, 106.30443F);
      ((Path)localObject).lineTo(125.05173F, 106.30443F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(33.051723F, 67.973175F);
      ((Path)localObject).cubicTo(33.051723F, 61.34662F, 38.431973F, 55.97473F, 45.052055F, 55.97473F);
      ((Path)localObject).lineTo(103.05139F, 55.97473F);
      ((Path)localObject).cubicTo(109.67899F, 55.97473F, 115.05173F, 61.34798F, 115.05173F, 67.973175F);
      ((Path)localObject).lineTo(115.05173F, 123.976295F);
      ((Path)localObject).cubicTo(115.05173F, 130.60284F, 109.67148F, 135.97473F, 103.05139F, 135.97473F);
      ((Path)localObject).lineTo(45.052055F, 135.97473F);
      ((Path)localObject).cubicTo(38.424454F, 135.97473F, 33.051723F, 130.60149F, 33.051723F, 123.976295F);
      ((Path)localObject).lineTo(33.051723F, 67.973175F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\my.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */