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

public final class to
  extends c
{
  private final int height;
  private final int width;
  
  public to()
  {
    GMTrace.i(15718640779264L, 117113);
    this.width = 108;
    this.height = 108;
    GMTrace.o(15718640779264L, 117113);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15718774996992L, 117114);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15718774996992L, 117114);
      return 0;
      GMTrace.o(15718774996992L, 117114);
      return 108;
      GMTrace.o(15718774996992L, 117114);
      return 108;
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
      ((Paint)localObject).setColor(-13063453);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(0.0F, 0.0F);
      localPath.lineTo(108.0F, 0.0F);
      localPath.lineTo(108.0F, 108.0F);
      localPath.lineTo(0.0F, 108.0F);
      localPath.lineTo(0.0F, 0.0F);
      localPath.close();
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localPaint.setColor(-1);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(86.9129F, 31.579287F);
      ((Path)localObject).cubicTo(87.37079F, 30.729229F, 87.75414F, 29.83387F, 88.049644F, 28.901205F);
      ((Path)localObject).cubicTo(88.32917F, 28.01917F, 88.04166F, 27.059858F, 87.31755F, 26.481606F);
      ((Path)localObject).cubicTo(86.59876F, 25.906017F, 85.59247F, 25.8394F, 84.80181F, 26.30573F);
      ((Path)localObject).cubicTo(82.666756F, 27.57682F, 80.37198F, 28.51215F, 77.95474F, 29.109056F);
      ((Path)localObject).cubicTo(75.05032F, 26.481606F, 71.23811F, 25.0F, 67.29812F, 25.0F);
      ((Path)localObject).cubicTo(58.542282F, 25.0F, 51.421013F, 32.128227F, 51.421013F, 40.88462F);
      ((Path)localObject).cubicTo(51.421013F, 41.105793F, 51.426334F, 41.32164F, 51.434322F, 41.542816F);
      ((Path)localObject).cubicTo(42.13807F, 40.38098F, 33.55527F, 35.651035F, 27.578726F, 28.30963F);
      ((Path)localObject).cubicTo(27.120836F, 27.7447F, 26.4127F, 27.448912F, 25.680609F, 27.496878F);
      ((Path)localObject).cubicTo(24.953838F, 27.555502F, 24.298948F, 27.963211F, 23.934233F, 28.600088F);
      ((Path)localObject).cubicTo(22.528614F, 31.014359F, 21.783209F, 33.775047F, 21.783209F, 36.58903F);
      ((Path)localObject).cubicTo(21.783209F, 39.253788F, 22.443424F, 41.817284F, 23.66003F, 44.092987F);
      ((Path)localObject).cubicTo(23.35122F, 44.14362F, 23.047733F, 44.25554F, 22.77087F, 44.418087F);
      ((Path)localObject).cubicTo(22.09202F, 44.82313F, 21.67406F, 45.633217F, 21.67406F, 46.421986F);
      ((Path)localObject).cubicTo(21.67406F, 51.146603F, 23.774504F, 55.48749F, 27.160769F, 58.43471F);
      ((Path)localObject).cubicTo(27.110188F, 58.480015F, 27.06493F, 58.530643F, 27.014349F, 58.581276F);
      ((Path)localObject).cubicTo(26.495228F, 59.17285F, 26.32485F, 59.988266F, 26.564444F, 60.737064F);
      ((Path)localObject).cubicTo(28.023306F, 65.29114F, 31.40691F, 68.84059F, 35.65039F, 70.58334F);
      ((Path)localObject).cubicTo(31.319057F, 72.72847F, 26.290241F, 73.56521F, 21.482386F, 72.99495F);
      ((Path)localObject).cubicTo(20.468103F, 72.90435F, 19.480442F, 73.47727F, 19.129038F, 74.46056F);
      ((Path)localObject).cubicTo(18.782957F, 75.43587F, 19.150335F, 76.520424F, 20.023523F, 77.08269F);
      ((Path)localObject).cubicTo(26.64697F, 81.33031F, 34.29535F, 83.574036F, 42.148716F, 83.574036F);
      ((Path)localObject).cubicTo(67.854515F, 83.574036F, 83.22049F, 62.671677F, 83.22049F, 42.46482F);
      ((Path)localObject).cubicTo(83.22049F, 42.235653F, 83.22049F, 42.01181F, 83.215164F, 41.782642F);
      ((Path)localObject).cubicTo(85.69896F, 39.8427F, 87.85264F, 37.52436F, 89.62564F, 34.870262F);
      ((Path)localObject).cubicTo(90.17404F, 34.049515F, 90.11548F, 32.95963F, 89.47922F, 32.200176F);
      ((Path)localObject).cubicTo(88.85095F, 31.454042F, 87.81537F, 31.19556F, 86.91822F, 31.576622F);
      ((Path)localObject).lineTo(86.9129F, 31.579287F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(78.72942F, 40.807343F);
      ((Path)localObject).cubicTo(78.75339F, 41.35628F, 78.76669F, 41.915882F, 78.76669F, 42.46482F);
      ((Path)localObject).cubicTo(78.76669F, 60.483913F, 65.06989F, 79.12656F, 42.146053F, 79.12656F);
      ((Path)localObject).cubicTo(38.03302F, 79.12656F, 33.97589F, 78.436386F, 30.13706F, 77.093346F);
      ((Path)localObject).cubicTo(34.734608F, 76.213974F, 39.041977F, 74.252716F, 42.803608F, 71.3055F);
      ((Path)localObject).cubicTo(43.543686F, 70.72191F, 43.839188F, 69.74128F, 43.541023F, 68.845924F);
      ((Path)localObject).cubicTo(43.2402F, 67.955894F, 42.414932F, 67.345665F, 41.472527F, 67.32967F);
      ((Path)localObject).cubicTo(37.766804F, 67.25506F, 34.4045F, 65.41105F, 32.346653F, 62.490475F);
      ((Path)localObject).cubicTo(33.398205F, 62.418526F, 34.43112F, 62.245316F, 35.43209F, 61.97351F);
      ((Path)localObject).cubicTo(36.425076F, 61.701706F, 37.101265F, 60.782364F, 37.066658F, 59.751102F);
      ((Path)localObject).cubicTo(37.03471F, 58.722507F, 36.29197F, 57.848465F, 35.283012F, 57.64328F);
      ((Path)localObject).cubicTo(31.11141F, 56.806545F, 27.836956F, 53.718094F, 26.625673F, 49.710297F);
      ((Path)localObject).cubicTo(27.733131F, 49.990097F, 28.86721F, 50.152645F, 30.003952F, 50.189953F);
      ((Path)localObject).cubicTo(30.980965F, 50.184624F, 31.88876F, 49.585052F, 32.192245F, 48.644394F);
      ((Path)localObject).cubicTo(32.49573F, 47.703735F, 32.139004F, 46.667145F, 31.311071F, 46.118202F);
      ((Path)localObject).cubicTo(28.129793F, 43.986397F, 26.229012F, 40.43161F, 26.229012F, 36.597027F);
      ((Path)localObject).cubicTo(26.229012F, 35.66969F, 26.340822F, 34.753014F, 26.556458F, 33.857655F);
      ((Path)localObject).cubicTo(33.757595F, 41.24703F, 43.527714F, 45.710495F, 53.875523F, 46.232788F);
      ((Path)localObject).cubicTo(54.607616F, 46.238117F, 55.249195F, 45.974308F, 55.693775F, 45.43869F);
      ((Path)localObject).cubicTo(56.138355F, 44.903076F, 56.308735F, 44.18892F, 56.151665F, 43.50674F);
      ((Path)localObject).cubicTo(55.95733F, 42.662014F, 55.856167F, 41.782642F, 55.856167F, 40.89528F);
      ((Path)localObject).cubicTo(55.856167F, 34.5878F, 60.986145F, 29.45814F, 67.287476F, 29.45814F);
      ((Path)localObject).cubicTo(70.436806F, 29.45814F, 73.47699F, 30.77453F, 75.62801F, 33.071552F);
      ((Path)localObject).cubicTo(76.15246F, 33.633816F, 76.92715F, 33.87897F, 77.6832F, 33.73241F);
      ((Path)localObject).cubicTo(78.37003F, 33.59384F, 79.04623F, 33.436623F, 79.71709F, 33.252754F);
      ((Path)localObject).cubicTo(79.41892F, 33.476593F, 79.10479F, 33.68711F, 78.77734F, 33.881638F);
      ((Path)localObject).cubicTo(77.87753F, 34.419918F, 77.47821F, 35.5178F, 77.81631F, 36.509087F);
      ((Path)localObject).cubicTo(78.1544F, 37.500378F, 79.16336F, 38.150578F, 80.18297F, 37.99602F);
      ((Path)localObject).cubicTo(80.43587F, 37.96671F, 80.68611F, 37.934734F, 80.93902F, 37.900093F);
      ((Path)localObject).cubicTo(80.52638F, 38.24118F, 80.095116F, 38.57161F, 79.6532F, 38.88605F);
      ((Path)localObject).cubicTo(79.0409F, 39.331066F, 78.692154F, 40.050552F, 78.72942F, 40.807343F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\to.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */