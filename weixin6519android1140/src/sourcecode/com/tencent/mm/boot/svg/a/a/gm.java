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

public final class gm
  extends c
{
  private final int height;
  private final int width;
  
  public gm()
  {
    GMTrace.i(15849368846336L, 118087);
    this.width = 96;
    this.height = 96;
    GMTrace.o(15849368846336L, 118087);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15849503064064L, 118088);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15849503064064L, 118088);
      return 0;
      GMTrace.o(15849503064064L, 118088);
      return 96;
      GMTrace.o(15849503064064L, 118088);
      return 96;
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
      localPaint.setColor(-8617851);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(88.98887F, 65.823074F);
      ((Path)localObject).cubicTo(88.89869F, 63.170345F, 87.255264F, 60.917454F, 84.9405F, 59.961655F);
      ((Path)localObject).lineTo(84.9405F, 59.71703F);
      ((Path)localObject).lineTo(68.109055F, 54.481007F);
      ((Path)localObject).lineTo(68.71548F, 54.481007F);
      ((Path)localObject).cubicTo(68.71548F, 54.481007F, 66.46022F, 54.097507F, 66.46022F, 52.20633F);
      ((Path)localObject).lineTo(66.46022F, 53.968163F);
      ((Path)localObject).lineTo(66.44624F, 53.963623F);
      ((Path)localObject).lineTo(66.44624F, 49.67024F);
      ((Path)localObject).cubicTo(66.45075F, 49.66706F, 66.45481F, 49.663883F, 66.45932F, 49.66071F);
      ((Path)localObject).lineTo(66.45932F, 51.29274F);
      ((Path)localObject).cubicTo(66.45932F, 50.144054F, 67.36151F, 49.03304F, 67.36151F, 49.03304F);
      ((Path)localObject).lineTo(67.33626F, 49.03304F);
      ((Path)localObject).cubicTo(72.19574F, 45.30106F, 75.48529F, 38.039978F, 75.47853F, 29.270761F);
      ((Path)localObject).cubicTo(75.46906F, 17.741253F, 68.396255F, 10.0F, 59.679577F, 10.0F);
      ((Path)localObject).cubicTo(53.00083F, 10.0F, 47.299126F, 14.547539F, 45.000137F, 21.85764F);
      ((Path)localObject).cubicTo(54.34443F, 25.274193F, 61.041206F, 34.628414F, 61.05248F, 47.25033F);
      ((Path)localObject).cubicTo(61.060143F, 55.714108F, 58.636265F, 63.1649F, 54.675816F, 68.67596F);
      ((Path)localObject).lineTo(55.6763F, 69.0F);
      ((Path)localObject).lineTo(76.62464F, 69.0F);
      ((Path)localObject).lineTo(88.300835F, 69.0F);
      ((Path)localObject).lineTo(89.00014F, 69.0F);
      ((Path)localObject).lineTo(89.00014F, 65.823074F);
      ((Path)localObject).lineTo(88.98887F, 65.823074F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(61.913708F, 77.961655F);
      ((Path)localObject).lineTo(61.913708F, 77.71748F);
      ((Path)localObject).lineTo(44.97163F, 72.48101F);
      ((Path)localObject).lineTo(45.581596F, 72.48101F);
      ((Path)localObject).cubicTo(45.581596F, 72.48101F, 43.31146F, 72.09751F, 43.31146F, 70.20633F);
      ((Path)localObject).lineTo(43.31146F, 71.967705F);
      ((Path)localObject).lineTo(43.29739F, 71.96362F);
      ((Path)localObject).lineTo(43.29739F, 68.124084F);
      ((Path)localObject).cubicTo(43.30193F, 68.12091F, 43.306015F, 68.11773F, 43.31055F, 68.115005F);
      ((Path)localObject).lineTo(43.31055F, 69.74658F);
      ((Path)localObject).cubicTo(43.31055F, 68.59744F, 44.218697F, 67.486885F, 44.218697F, 67.486885F);
      ((Path)localObject).lineTo(44.191013F, 67.486885F);
      ((Path)localObject).cubicTo(49.083927F, 63.71043F, 52.3961F, 56.04134F, 52.388836F, 47.270763F);
      ((Path)localObject).cubicTo(52.37976F, 35.741253F, 45.260277F, 28.0F, 36.48607F, 28.0F);
      ((Path)localObject).cubicTo(27.711407F, 28.0F, 20.60463F, 35.741253F, 20.61416F, 47.270763F);
      ((Path)localObject).cubicTo(20.621422F, 56.412132F, 24.235397F, 63.911938F, 29.476868F, 67.486885F);
      ((Path)localObject).lineTo(29.235874F, 67.486885F);
      ((Path)localObject).cubicTo(29.235874F, 67.486885F, 30.144022F, 68.59744F, 30.144022F, 69.74658F);
      ((Path)localObject).lineTo(30.144022F, 67.928474F);
      ((Path)localObject).cubicTo(30.148106F, 67.9312F, 30.152191F, 67.93438F, 30.156729F, 67.9371F);
      ((Path)localObject).lineTo(30.156729F, 71.96362F);
      ((Path)localObject).lineTo(30.143114F, 71.967705F);
      ((Path)localObject).lineTo(30.143114F, 70.20633F);
      ((Path)localObject).cubicTo(30.143114F, 72.09751F, 27.872974F, 72.48101F, 27.872974F, 72.48101F);
      ((Path)localObject).lineTo(28.482944F, 72.48101F);
      ((Path)localObject).lineTo(11.540868F, 77.71748F);
      ((Path)localObject).lineTo(11.540868F, 77.79736F);
      ((Path)localObject).cubicTo(8.977545F, 78.634705F, 7.108152F, 81.00197F, 7.0114827F, 83.823074F);
      ((Path)localObject).lineTo(7.000137F, 83.823074F);
      ((Path)localObject).lineTo(7.000137F, 87.0F);
      ((Path)localObject).lineTo(7.704506F, 87.0F);
      ((Path)localObject).lineTo(19.457306F, 87.0F);
      ((Path)localObject).lineTo(53.54297F, 87.0F);
      ((Path)localObject).lineTo(65.29577F, 87.0F);
      ((Path)localObject).lineTo(66.00014F, 87.0F);
      ((Path)localObject).lineTo(66.00014F, 83.823074F);
      ((Path)localObject).lineTo(65.98879F, 83.823074F);
      ((Path)localObject).cubicTo(65.89802F, 81.1708F, 64.24375F, 78.91746F, 61.913708F, 77.961655F);
      ((Path)localObject).lineTo(61.913708F, 77.961655F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\gm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */