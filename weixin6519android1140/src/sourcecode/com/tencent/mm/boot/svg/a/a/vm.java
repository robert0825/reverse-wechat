package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class vm
  extends c
{
  private final int height;
  private final int width;
  
  public vm()
  {
    GMTrace.i(15875675521024L, 118283);
    this.width = 180;
    this.height = 180;
    GMTrace.o(15875675521024L, 118283);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15875809738752L, 118284);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15875809738752L, 118284);
      return 0;
      GMTrace.o(15875809738752L, 118284);
      return 180;
      GMTrace.o(15875809738752L, 118284);
      return 180;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      Object localObject1 = c.e(paramVarArgs);
      Object localObject2 = c.d(paramVarArgs);
      Paint localPaint1 = c.h(paramVarArgs);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.h(paramVarArgs);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramVarArgs).setStrokeWidth(1.0F);
      localPaint2 = c.a(localPaint1, paramVarArgs);
      localPaint2.setColor(-1250068);
      localCanvas.save();
      Object localObject3 = c.a(localPaint2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(179.88945F, 0.0F);
      localPath.cubicTo(179.96985F, 60.0F, 179.73871F, 120.0F, 180.0F, 180.0F);
      localPath.lineTo(0.0F, 180.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint2, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(88.3F, 70.37F);
      localPath.cubicTo(90.79F, 69.1F, 94.13F, 71.17F, 93.98F, 73.99F);
      localPath.cubicTo(94.2F, 77.11F, 90.14F, 79.2F, 87.71F, 77.26F);
      localPath.cubicTo(85.19F, 75.7F, 85.6F, 71.51F, 88.3F, 70.37F);
      localPath.lineTo(88.3F, 70.37F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint2, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(65.02F, 97.05F);
      localPath.cubicTo(68.67F, 96.95F, 72.31F, 96.94F, 75.96F, 97.03F);
      localPath.cubicTo(76.05F, 100.01F, 76.05F, 102.99F, 75.95F, 105.97F);
      localPath.cubicTo(72.32F, 106.05F, 68.68F, 106.05F, 65.04F, 105.96F);
      localPath.cubicTo(64.95F, 102.99F, 64.95F, 100.02F, 65.02F, 97.05F);
      localPath.lineTo(65.02F, 97.05F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint2, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(85.03F, 97.04F);
      localPath.cubicTo(88.67F, 96.95F, 92.32F, 96.95F, 95.96F, 97.04F);
      localPath.cubicTo(96.05F, 100.01F, 96.05F, 102.98F, 95.97F, 105.96F);
      localPath.cubicTo(92.32F, 106.05F, 88.68F, 106.05F, 85.04F, 105.97F);
      localPath.cubicTo(84.95F, 102.99F, 84.95F, 100.02F, 85.03F, 97.04F);
      localPath.lineTo(85.03F, 97.04F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint2, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(105.05F, 97.03F);
      localPath.cubicTo(108.69F, 96.94F, 112.33F, 96.95F, 115.98F, 97.05F);
      localPath.cubicTo(116.05F, 100.02F, 116.05F, 102.99F, 115.96F, 105.96F);
      localPath.cubicTo(112.32F, 106.05F, 108.68F, 106.05F, 105.03F, 105.96F);
      localPath.cubicTo(104.95F, 102.98F, 104.95F, 100.01F, 105.05F, 97.03F);
      localPath.lineTo(105.05F, 97.03F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint2, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(65.04F, 112.04F);
      localPath.cubicTo(68.68F, 111.95F, 72.32F, 111.95F, 75.96F, 112.03F);
      localPath.cubicTo(76.04F, 115.0F, 76.05F, 117.98F, 75.98F, 120.95F);
      localPath.cubicTo(72.33F, 121.05F, 68.68F, 121.05F, 65.03F, 120.95F);
      localPath.cubicTo(64.95F, 117.98F, 64.95F, 115.01F, 65.04F, 112.04F);
      localPath.lineTo(65.04F, 112.04F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localObject3 = c.a(localPaint2, paramVarArgs);
      localPath = c.i(paramVarArgs);
      localPath.moveTo(85.02F, 112.05F);
      localPath.cubicTo(88.66F, 111.95F, 92.31F, 111.94F, 95.95F, 112.03F);
      localPath.cubicTo(96.05F, 115.01F, 96.05F, 117.99F, 95.96F, 120.96F);
      localPath.cubicTo(92.32F, 121.05F, 88.67F, 121.05F, 85.03F, 120.95F);
      localPath.cubicTo(84.95F, 117.98F, 84.95F, 115.02F, 85.02F, 112.05F);
      localPath.lineTo(85.02F, 112.05F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject3);
      localCanvas.restore();
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localObject3 = c.i(paramVarArgs);
      ((Path)localObject3).moveTo(105.02F, 112.05F);
      ((Path)localObject3).cubicTo(108.67F, 111.95F, 112.31F, 111.94F, 115.96F, 112.03F);
      ((Path)localObject3).cubicTo(116.05F, 115.01F, 116.04F, 118.0F, 115.94F, 120.98F);
      ((Path)localObject3).cubicTo(112.31F, 121.05F, 108.68F, 121.05F, 105.05F, 120.98F);
      ((Path)localObject3).cubicTo(104.96F, 118.0F, 104.94F, 115.03F, 105.02F, 112.05F);
      ((Path)localObject3).lineTo(105.02F, 112.05F);
      ((Path)localObject3).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject3, 2);
      localCanvas.drawPath((Path)localObject3, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-3355444);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 47.0F, 0.0F, 1.0F, 49.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(24.15F, 5.27F);
      ((Path)localObject2).cubicTo(26.54F, 3.4F, 29.02F, 1.65F, 31.64F, 0.12F);
      ((Path)localObject2).cubicTo(36.17F, 6.37F, 40.34F, 12.87F, 45.04F, 18.99F);
      ((Path)localObject2).cubicTo(58.34F, 19.05F, 71.65F, 18.93F, 84.96F, 19.03F);
      ((Path)localObject2).cubicTo(85.05F, 23.01F, 85.05F, 27.0F, 84.95F, 30.98F);
      ((Path)localObject2).cubicTo(56.98F, 31.01F, 29.01F, 31.02F, 1.04F, 30.98F);
      ((Path)localObject2).cubicTo(0.95F, 27.0F, 0.95F, 23.02F, 1.03F, 19.04F);
      ((Path)localObject2).cubicTo(11.83F, 18.9F, 22.64F, 19.11F, 33.44F, 18.95F);
      ((Path)localObject2).cubicTo(30.57F, 14.24F, 26.98F, 10.01F, 24.15F, 5.27F);
      ((Path)localObject2).lineTo(24.15F, 5.27F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(41.3F, 21.37F);
      ((Path)localObject2).cubicTo(38.6F, 22.51F, 38.19F, 26.7F, 40.71F, 28.26F);
      ((Path)localObject2).cubicTo(43.14F, 30.2F, 47.2F, 28.11F, 46.98F, 24.99F);
      ((Path)localObject2).cubicTo(47.13F, 22.17F, 43.79F, 20.1F, 41.3F, 21.37F);
      ((Path)localObject2).lineTo(41.3F, 21.37F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(5.71F, 37.04F);
      ((Path)localObject2).cubicTo(30.57F, 36.97F, 55.44F, 36.97F, 80.3F, 37.04F);
      ((Path)localObject2).cubicTo(79.26F, 50.35F, 77.78F, 63.63F, 76.62F, 76.93F);
      ((Path)localObject2).cubicTo(76.54F, 79.1F, 75.8F, 82.1F, 73.04F, 81.91F);
      ((Path)localObject2).cubicTo(54.04F, 82.15F, 35.02F, 81.89F, 16.01F, 82.04F);
      ((Path)localObject2).cubicTo(14.1F, 81.85F, 11.64F, 82.42F, 10.3F, 80.68F);
      ((Path)localObject2).cubicTo(9.4F, 78.97F, 9.45F, 76.97F, 9.2F, 75.11F);
      ((Path)localObject2).cubicTo(8.13F, 62.41F, 6.65F, 49.74F, 5.71F, 37.04F);
      ((Path)localObject2).lineTo(5.71F, 37.04F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(18.02F, 48.05F);
      ((Path)localObject2).cubicTo(17.95F, 51.02F, 17.95F, 53.99F, 18.04F, 56.96F);
      ((Path)localObject2).cubicTo(21.68F, 57.05F, 25.32F, 57.05F, 28.95F, 56.97F);
      ((Path)localObject2).cubicTo(29.05F, 53.99F, 29.05F, 51.01F, 28.96F, 48.03F);
      ((Path)localObject2).cubicTo(25.31F, 47.94F, 21.67F, 47.95F, 18.02F, 48.05F);
      ((Path)localObject2).lineTo(18.02F, 48.05F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(38.03F, 48.04F);
      ((Path)localObject2).cubicTo(37.95F, 51.02F, 37.95F, 53.99F, 38.04F, 56.97F);
      ((Path)localObject2).cubicTo(41.68F, 57.05F, 45.32F, 57.05F, 48.97F, 56.96F);
      ((Path)localObject2).cubicTo(49.05F, 53.98F, 49.05F, 51.01F, 48.96F, 48.04F);
      ((Path)localObject2).cubicTo(45.32F, 47.95F, 41.67F, 47.95F, 38.03F, 48.04F);
      ((Path)localObject2).lineTo(38.03F, 48.04F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(58.05F, 48.03F);
      ((Path)localObject2).cubicTo(57.95F, 51.01F, 57.95F, 53.98F, 58.03F, 56.96F);
      ((Path)localObject2).cubicTo(61.68F, 57.05F, 65.32F, 57.05F, 68.96F, 56.96F);
      ((Path)localObject2).cubicTo(69.05F, 53.99F, 69.05F, 51.02F, 68.98F, 48.05F);
      ((Path)localObject2).cubicTo(65.33F, 47.95F, 61.69F, 47.94F, 58.05F, 48.03F);
      ((Path)localObject2).lineTo(58.05F, 48.03F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(18.04F, 63.04F);
      ((Path)localObject2).cubicTo(17.95F, 66.01F, 17.95F, 68.98F, 18.03F, 71.95F);
      ((Path)localObject2).cubicTo(21.68F, 72.05F, 25.33F, 72.05F, 28.98F, 71.95F);
      ((Path)localObject2).cubicTo(29.05F, 68.98F, 29.04F, 66.0F, 28.96F, 63.03F);
      ((Path)localObject2).cubicTo(25.32F, 62.95F, 21.68F, 62.95F, 18.04F, 63.04F);
      ((Path)localObject2).lineTo(18.04F, 63.04F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(38.02F, 63.05F);
      ((Path)localObject2).cubicTo(37.95F, 66.02F, 37.95F, 68.98F, 38.03F, 71.95F);
      ((Path)localObject2).cubicTo(41.67F, 72.05F, 45.32F, 72.05F, 48.96F, 71.96F);
      ((Path)localObject2).cubicTo(49.05F, 68.99F, 49.05F, 66.01F, 48.95F, 63.03F);
      ((Path)localObject2).cubicTo(45.31F, 62.94F, 41.66F, 62.95F, 38.02F, 63.05F);
      ((Path)localObject2).lineTo(38.02F, 63.05F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(58.02F, 63.05F);
      ((Path)localObject2).cubicTo(57.94F, 66.03F, 57.96F, 69.0F, 58.05F, 71.98F);
      ((Path)localObject2).cubicTo(61.68F, 72.05F, 65.31F, 72.05F, 68.94F, 71.98F);
      ((Path)localObject2).cubicTo(69.04F, 69.0F, 69.05F, 66.01F, 68.96F, 63.03F);
      ((Path)localObject2).cubicTo(65.31F, 62.94F, 61.67F, 62.95F, 58.02F, 63.05F);
      ((Path)localObject2).lineTo(58.02F, 63.05F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\vm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */