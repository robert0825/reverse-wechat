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

public final class jd
  extends c
{
  private final int height;
  private final int width;
  
  public jd()
  {
    GMTrace.i(15782796853248L, 117591);
    this.width = 45;
    this.height = 45;
    GMTrace.o(15782796853248L, 117591);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15782931070976L, 117592);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15782931070976L, 117592);
      return 0;
      GMTrace.o(15782931070976L, 117592);
      return 45;
      GMTrace.o(15782931070976L, 117592);
      return 45;
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
      localCanvas.saveLayerAlpha(null, 38, 4);
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-16777216);
      localCanvas.save();
      localObject = c.a(localPaint, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(18.0743F, 25.9257F);
      localPath.cubicTo(21.81657F, 29.66797F, 25.362413F, 31.423225F, 26.673681F, 31.320438F);
      localPath.cubicTo(27.98495F, 31.217651F, 31.250372F, 28.972013F, 32.791916F, 29.001904F);
      localPath.cubicTo(33.5328F, 29.01627F, 38.37422F, 32.290524F, 38.960274F, 32.669083F);
      localPath.cubicTo(39.54633F, 33.047638F, 40.089733F, 33.48984F, 39.987553F, 34.049404F);
      localPath.cubicTo(39.885376F, 34.608967F, 37.757626F, 40.772552F, 32.325485F, 39.919037F);
      localPath.cubicTo(26.893343F, 39.06552F, 19.320179F, 33.20958F, 15.004804F, 28.995195F);
      localPath.lineTo(18.0743F, 25.9257F);
      localPath.lineTo(18.0743F, 25.9257F);
      localPath.close();
      localPath.moveTo(18.0743F, 25.9257F);
      localPath.cubicTo(14.33203F, 22.18343F, 12.576774F, 18.637587F, 12.679562F, 17.326319F);
      localPath.cubicTo(12.782349F, 16.01505F, 15.027987F, 12.749629F, 14.998096F, 11.208082F);
      localPath.cubicTo(14.983731F, 10.467202F, 11.709476F, 5.625779F, 11.330918F, 5.0397243F);
      localPath.cubicTo(10.952361F, 4.45367F, 10.510159F, 3.9102678F, 9.950595F, 4.012446F);
      localPath.cubicTo(9.391031F, 4.1146235F, 3.2274485F, 6.2423735F, 4.080963F, 11.674515F);
      localPath.cubicTo(4.9344783F, 17.106657F, 10.790419F, 24.679821F, 15.004804F, 28.995195F);
      localPath.lineTo(18.0743F, 25.9257F);
      localPath.lineTo(18.0743F, 25.9257F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(39.25F, 16.954916F);
      ((Path)localObject).cubicTo(39.652576F, 17.12634F, 40.0F, 16.78943F, 40.0F, 16.273945F);
      ((Path)localObject).lineTo(40.0F, 7.7189007F);
      ((Path)localObject).cubicTo(40.0F, 7.1419024F, 39.615803F, 6.899748F, 39.25F, 7.03793F);
      ((Path)localObject).cubicTo(39.033016F, 7.2903256F, 36.0F, 10.012693F, 36.0F, 10.012693F);
      ((Path)localObject).lineTo(36.0F, 13.939582F);
      ((Path)localObject).cubicTo(36.0F, 13.939582F, 39.103306F, 16.747684F, 39.25F, 16.954916F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(22.0F, 8.47057F);
      ((Path)localObject).cubicTo(22.0F, 8.210681F, 22.25619F, 8.0F, 22.570713F, 8.0F);
      ((Path)localObject).lineTo(33.429287F, 8.0F);
      ((Path)localObject).cubicTo(33.744484F, 8.0F, 34.0F, 8.209868F, 34.0F, 8.47057F);
      ((Path)localObject).lineTo(34.0F, 15.52943F);
      ((Path)localObject).cubicTo(34.0F, 15.789319F, 33.743813F, 16.0F, 33.429287F, 16.0F);
      ((Path)localObject).lineTo(22.570713F, 16.0F);
      ((Path)localObject).cubicTo(22.255516F, 16.0F, 22.0F, 15.790132F, 22.0F, 15.52943F);
      ((Path)localObject).lineTo(22.0F, 8.47057F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\jd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */