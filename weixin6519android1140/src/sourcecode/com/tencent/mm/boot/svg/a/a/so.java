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

public final class so
  extends c
{
  private final int height;
  private final int width;
  
  public so()
  {
    GMTrace.i(15855542861824L, 118133);
    this.width = 55;
    this.height = 30;
    GMTrace.o(15855542861824L, 118133);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15855677079552L, 118134);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15855677079552L, 118134);
      return 0;
      GMTrace.o(15855677079552L, 118134);
      return 55;
      GMTrace.o(15855677079552L, 118134);
      return 30;
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
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 4.0F);
      localPath.cubicTo(0.0F, 1.7908609F, 1.7908609F, 0.0F, 4.0F, 0.0F);
      localPath.lineTo(30.0F, 0.0F);
      localPath.cubicTo(32.20914F, 0.0F, 34.0F, 1.7908609F, 34.0F, 4.0F);
      localPath.lineTo(34.0F, 26.0F);
      localPath.cubicTo(34.0F, 28.209139F, 32.20914F, 30.0F, 30.0F, 30.0F);
      localPath.lineTo(4.0F, 30.0F);
      localPath.cubicTo(1.7908609F, 30.0F, 0.0F, 28.209139F, 0.0F, 26.0F);
      localPath.lineTo(0.0F, 4.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(38.71698F, 13.0F);
      ((Path)localObject).cubicTo(43.57647F, 8.820671F, 48.100197F, 4.1560574F, 54.0F, 1.0F);
      ((Path)localObject).cubicTo(54.131836F, 10.646817F, 54.07152F, 20.353184F, 54.0F, 30.0F);
      ((Path)localObject).lineTo(52.981133F, 30.0F);
      ((Path)localObject).cubicTo(47.165295F, 25.652977F, 41.495552F, 21.266256F, 35.660378F, 17.0F);
      ((Path)localObject).cubicTo(34.679802F, 14.844969F, 37.29351F, 13.584531F, 38.71698F, 13.0F);
      ((Path)localObject).lineTo(38.71698F, 13.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\so.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */