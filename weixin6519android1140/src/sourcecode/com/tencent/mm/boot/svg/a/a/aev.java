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

public final class aev
  extends c
{
  private final int height;
  private final int width;
  
  public aev()
  {
    GMTrace.i(17572321820672L, 130924);
    this.width = 81;
    this.height = 39;
    GMTrace.o(17572321820672L, 130924);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17572456038400L, 130925);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17572456038400L, 130925);
      return 0;
      GMTrace.o(17572456038400L, 130925);
      return 81;
      GMTrace.o(17572456038400L, 130925);
      return 39;
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
      ((Paint)localObject).setColor(-1);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 19.353983F);
      localPath.cubicTo(0.0F, 8.665072F, 8.665072F, 0.0F, 19.353983F, 0.0F);
      localPath.lineTo(61.64602F, 0.0F);
      localPath.cubicTo(72.33493F, 0.0F, 81.0F, 8.665072F, 81.0F, 19.353983F);
      localPath.lineTo(81.0F, 19.646017F);
      localPath.cubicTo(81.0F, 30.334927F, 72.33493F, 39.0F, 61.64602F, 39.0F);
      localPath.lineTo(19.353983F, 39.0F);
      localPath.cubicTo(8.665072F, 39.0F, 0.0F, 30.334927F, 0.0F, 19.646017F);
      localPath.lineTo(0.0F, 19.353983F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-564640);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(31.066368F, 28.874792F);
      ((Path)localObject).lineTo(27.080488F, 28.874792F);
      ((Path)localObject).lineTo(19.06778F, 15.470228F);
      ((Path)localObject).lineTo(18.985878F, 15.483878F);
      ((Path)localObject).lineTo(18.985878F, 28.874792F);
      ((Path)localObject).lineTo(15.0F, 28.874792F);
      ((Path)localObject).lineTo(15.0F, 9.0F);
      ((Path)localObject).lineTo(18.985878F, 9.0F);
      ((Path)localObject).lineTo(26.998587F, 22.390915F);
      ((Path)localObject).lineTo(27.080488F, 22.377264F);
      ((Path)localObject).lineTo(27.080488F, 9.0F);
      ((Path)localObject).lineTo(31.066368F, 9.0F);
      ((Path)localObject).lineTo(31.066368F, 28.874792F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(39.966133F, 29.161448F);
      ((Path)localObject).cubicTo(37.763878F, 29.161448F, 36.04396F, 28.485767F, 34.80633F, 27.134382F);
      ((Path)localObject).cubicTo(33.5687F, 25.782999F, 32.949894F, 24.042608F, 32.949894F, 21.913155F);
      ((Path)localObject).lineTo(32.949894F, 21.367144F);
      ((Path)localObject).cubicTo(32.949894F, 19.15579F, 33.5505F, 17.344872F, 34.75173F, 15.934337F);
      ((Path)localObject).cubicTo(35.95296F, 14.523802F, 37.604626F, 13.823095F, 39.70678F, 13.832195F);
      ((Path)localObject).cubicTo(41.690628F, 13.832195F, 43.212616F, 14.439627F, 44.272793F, 15.654507F);
      ((Path)localObject).cubicTo(45.33297F, 16.869387F, 45.86305F, 18.505127F, 45.86305F, 20.561779F);
      ((Path)localObject).lineTo(45.86305F, 22.622969F);
      ((Path)localObject).lineTo(37.058624F, 22.622969F);
      ((Path)localObject).lineTo(37.017673F, 22.70487F);
      ((Path)localObject).cubicTo(37.081375F, 23.714996F, 37.388504F, 24.534004F, 37.939068F, 25.161919F);
      ((Path)localObject).cubicTo(38.48963F, 25.789835F, 39.306366F, 26.103788F, 40.38929F, 26.103788F);
      ((Path)localObject).cubicTo(41.281113F, 26.103788F, 42.038696F, 26.012787F, 42.66206F, 25.830782F);
      ((Path)localObject).cubicTo(43.285427F, 25.648779F, 43.929256F, 25.371225F, 44.593575F, 24.998116F);
      ((Path)localObject).lineTo(45.671947F, 27.455164F);
      ((Path)localObject).cubicTo(45.080433F, 27.937477F, 44.279625F, 28.34243F, 43.269497F, 28.670038F);
      ((Path)localObject).cubicTo(42.259373F, 28.997646F, 41.158264F, 29.161448F, 39.966133F, 29.161448F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(39.70678F, 16.903505F);
      ((Path)localObject).cubicTo(38.90596F, 16.903505F, 38.28943F, 17.178783F, 37.857166F, 17.729347F);
      ((Path)localObject).cubicTo(37.424908F, 18.279911F, 37.163277F, 19.010193F, 37.072277F, 19.920216F);
      ((Path)localObject).lineTo(37.099575F, 19.988466F);
      ((Path)localObject).lineTo(41.959072F, 19.988466F);
      ((Path)localObject).lineTo(41.959072F, 19.688162F);
      ((Path)localObject).cubicTo(41.959072F, 18.823639F, 41.78162F, 18.143408F, 41.426712F, 17.647446F);
      ((Path)localObject).cubicTo(41.071804F, 17.151484F, 40.498497F, 16.903505F, 39.70678F, 16.903505F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(60.168324F, 23.387384F);
      ((Path)localObject).lineTo(60.250225F, 23.387384F);
      ((Path)localObject).lineTo(62.03841F, 14.105201F);
      ((Path)localObject).lineTo(65.915085F, 14.105201F);
      ((Path)localObject).lineTo(62.161263F, 28.874792F);
      ((Path)localObject).lineTo(58.830597F, 28.874792F);
      ((Path)localObject).lineTo(56.08689F, 20.357025F);
      ((Path)localObject).lineTo(56.00499F, 20.357025F);
      ((Path)localObject).lineTo(53.261284F, 28.874792F);
      ((Path)localObject).lineTo(49.94427F, 28.874792F);
      ((Path)localObject).lineTo(46.190445F, 14.105201F);
      ((Path)localObject).lineTo(50.067123F, 14.105201F);
      ((Path)localObject).lineTo(51.882607F, 23.346434F);
      ((Path)localObject).lineTo(51.96451F, 23.346434F);
      ((Path)localObject).lineTo(54.721863F, 14.105201F);
      ((Path)localObject).lineTo(57.383667F, 14.105201F);
      ((Path)localObject).lineTo(60.168324F, 23.387384F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */