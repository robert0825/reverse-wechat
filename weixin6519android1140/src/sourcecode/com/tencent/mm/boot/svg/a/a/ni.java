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

public final class ni
  extends c
{
  private final int height;
  private final int width;
  
  public ni()
  {
    GMTrace.i(15723741052928L, 117151);
    this.width = 270;
    this.height = 270;
    GMTrace.o(15723741052928L, 117151);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15723875270656L, 117152);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15723875270656L, 117152);
      return 0;
      GMTrace.o(15723875270656L, 117152);
      return 270;
      GMTrace.o(15723875270656L, 117152);
      return 270;
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
      ((Paint)localObject).setColor(14211288);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(270.0F, 0.0F);
      localPath.lineTo(270.0F, 270.0F);
      localPath.lineTo(0.0F, 270.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-15028967);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(63.314346F, 140.34763F);
      ((Path)localObject).cubicTo(62.933258F, 139.95532F, 62.89317F, 139.27344F, 63.224213F, 138.8254F);
      ((Path)localObject).lineTo(69.83471F, 129.87872F);
      ((Path)localObject).cubicTo(70.16602F, 129.43033F, 70.79083F, 129.3384F, 71.22918F, 129.67256F);
      ((Path)localObject).lineTo(108.10534F, 157.78488F);
      ((Path)localObject).cubicTo(108.54417F, 158.11943F, 109.244865F, 158.1048F, 109.66647F, 157.75543F);
      ((Path)localObject).lineTo(198.3778F, 84.246925F);
      ((Path)localObject).cubicTo(198.80116F, 83.89612F, 199.4602F, 83.922F, 199.85126F, 84.30612F);
      ((Path)localObject).lineTo(206.24776F, 90.58951F);
      ((Path)localObject).cubicTo(206.63817F, 90.97301F, 206.63751F, 91.59433F, 206.23552F, 91.98784F);
      ((Path)localObject).lineTo(109.616165F, 186.56723F);
      ((Path)localObject).cubicTo(109.219F, 186.956F, 108.58932F, 186.95439F, 108.20701F, 186.56084F);
      ((Path)localObject).lineTo(63.314346F, 140.34763F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */