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

public final class ajc
  extends c
{
  private final int height;
  private final int width;
  
  public ajc()
  {
    GMTrace.i(17584132980736L, 131012);
    this.width = 42;
    this.height = 42;
    GMTrace.o(17584132980736L, 131012);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17584267198464L, 131013);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(17584267198464L, 131013);
      return 0;
      GMTrace.o(17584267198464L, 131013);
      return 42;
      GMTrace.o(17584267198464L, 131013);
      return 42;
      Canvas localCanvas = (Canvas)paramVarArgs[0];
      paramVarArgs = (Looper)paramVarArgs[1];
      c.e(paramVarArgs);
      c.d(paramVarArgs);
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
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint2.setStrokeWidth(1.0F);
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      localPaint1.setColor(-4210753);
      localPaint2.setColor(-4210753);
      localPaint2.setStrokeWidth(0.5F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint2 = c.a(localPaint2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(39.26192F, 36.23582F);
      localPath.cubicTo(35.93297F, 35.993877F, 25.853132F, 35.550735F, 21.830994F, 38.503082F);
      localPath.lineTo(21.830994F, 36.134388F);
      localPath.cubicTo(22.104116F, 34.477383F, 25.907093F, 33.48717F, 32.026222F, 33.48717F);
      localPath.cubicTo(34.581463F, 33.48717F, 36.614532F, 33.66426F, 36.634457F, 33.665924F);
      localPath.cubicTo(36.8669F, 33.694195F, 37.096027F, 33.60939F, 37.26787F, 33.447266F);
      localPath.cubicTo(37.439713F, 33.287632F, 37.537674F, 33.06149F, 37.537674F, 32.825367F);
      localPath.lineTo(37.537674F, 5.576668F);
      localPath.cubicTo(38.23418F, 5.498515F, 38.821934F, 5.441148F, 39.26192F, 5.402903F);
      localPath.lineTo(39.26192F, 36.23582F);
      localPath.close();
      localPath.moveTo(2.7380788F, 36.23582F);
      localPath.lineTo(2.7380788F, 5.40706F);
      localPath.cubicTo(3.1747444F, 5.447799F, 3.758349F, 5.5068293F, 4.463157F, 5.5874763F);
      localPath.lineTo(4.463157F, 32.825367F);
      localPath.cubicTo(4.463157F, 33.06149F, 4.560286F, 33.287632F, 4.73213F, 33.447266F);
      localPath.cubicTo(4.9048038F, 33.607727F, 5.13891F, 33.6917F, 5.366374F, 33.665924F);
      localPath.cubicTo(5.386298F, 33.66426F, 7.4185367F, 33.48717F, 9.973778F, 33.48717F);
      localPath.cubicTo(16.093739F, 33.48717F, 19.895884F, 34.477383F, 20.169838F, 36.134388F);
      localPath.lineTo(20.169838F, 38.493935F);
      localPath.cubicTo(16.143547F, 35.54824F, 6.0662017F, 35.993877F, 2.7380788F, 36.23582F);
      localPath.lineTo(2.7380788F, 36.23582F);
      localPath.close();
      localPath.moveTo(6.124313F, 3.9030354F);
      localPath.cubicTo(12.020959F, 4.377772F, 19.808716F, 6.0497413F, 20.169838F, 8.465825F);
      localPath.lineTo(20.169838F, 33.5911F);
      localPath.cubicTo(18.30363F, 32.400517F, 14.894153F, 31.799406F, 9.973778F, 31.799406F);
      localPath.cubicTo(8.364092F, 31.799406F, 6.9785504F, 31.866749F, 6.124313F, 31.91996F);
      localPath.lineTo(6.124313F, 3.9030354F);
      localPath.close();
      localPath.moveTo(35.87652F, 3.903867F);
      localPath.lineTo(35.87652F, 31.91996F);
      localPath.cubicTo(35.02228F, 31.866749F, 33.63508F, 31.799406F, 32.026222F, 31.799406F);
      localPath.cubicTo(27.105017F, 31.799406F, 23.69554F, 32.40135F, 21.830162F, 33.5911F);
      localPath.lineTo(21.821861F, 8.588874F);
      localPath.cubicTo(22.191284F, 6.0572243F, 29.979872F, 4.3794346F, 35.87652F, 3.903867F);
      localPath.lineTo(35.87652F, 3.903867F);
      localPath.close();
      localPath.moveTo(40.660744F, 3.8739362F);
      localPath.cubicTo(40.49222F, 3.7159677F, 40.263096F, 3.637815F, 40.039783F, 3.6469605F);
      localPath.cubicTo(40.039783F, 3.6469605F, 39.062683F, 3.7118106F, 37.537674F, 3.879756F);
      localPath.lineTo(37.537674F, 2.9976277F);
      localPath.cubicTo(37.537674F, 2.7656639F, 37.442204F, 2.5436766F, 37.276173F, 2.3832142F);
      localPath.cubicTo(37.10931F, 2.223583F, 36.882675F, 2.1412733F, 36.65687F, 2.1554072F);
      localPath.cubicTo(34.371433F, 2.2975788F, 24.132204F, 3.1223395F, 21.034037F, 6.6890974F);
      localPath.cubicTo(18.032999F, 3.1348107F, 7.6468315F, 2.2984102F, 5.34396F, 2.1554072F);
      localPath.cubicTo(5.1140046F, 2.1421046F, 4.891521F, 2.223583F, 4.7238283F, 2.3832142F);
      localPath.cubicTo(4.5577955F, 2.5436766F, 4.463157F, 2.7656639F, 4.463157F, 2.9976277F);
      localPath.lineTo(4.463157F, 3.8897328F);
      localPath.cubicTo(2.907432F, 3.7151363F, 1.9651973F, 3.6469605F, 1.9651973F, 3.6469605F);
      localPath.cubicTo(1.734412F, 3.637815F, 1.5094379F, 3.7134736F, 1.3409148F, 3.8722732F);
      localPath.cubicTo(1.173222F, 4.031904F, 1.0769231F, 4.255554F, 1.0769231F, 4.489181F);
      localPath.lineTo(1.0769231F, 37.148712F);
      localPath.cubicTo(1.0769231F, 37.38483F, 1.1757125F, 37.61181F, 1.3475561F, 37.77144F);
      localPath.cubicTo(1.5185697F, 37.9319F, 1.7559962F, 38.01338F, 1.9818006F, 37.98927F);
      localPath.cubicTo(8.751778F, 37.37735F, 19.67506F, 37.72571F, 20.177309F, 41.276672F);
      localPath.cubicTo(20.1798F, 41.294132F, 20.190592F, 41.308266F, 20.193913F, 41.325726F);
      localPath.cubicTo(20.203043F, 41.371452F, 20.220476F, 41.413025F, 20.23708F, 41.456257F);
      localPath.cubicTo(20.258665F, 41.511963F, 20.280249F, 41.56517F, 20.312626F, 41.615055F);
      localPath.cubicTo(20.3367F, 41.651638F, 20.364096F, 41.68323F, 20.393982F, 41.715656F);
      localPath.cubicTo(20.433828F, 41.76055F, 20.474506F, 41.798798F, 20.522655F, 41.83455F);
      localPath.cubicTo(20.558353F, 41.86032F, 20.59405F, 41.88194F, 20.634727F, 41.901894F);
      localPath.cubicTo(20.688688F, 41.93016F, 20.74514F, 41.949284F, 20.804913F, 41.96425F);
      localPath.cubicTo(20.832308F, 41.97007F, 20.853891F, 41.98753F, 20.882116F, 41.991688F);
      localPath.cubicTo(20.921135F, 41.997505F, 20.960152F, 42.0F, 20.99834F, 42.0F);
      localPath.lineTo(20.99917F, 42.0F);
      localPath.lineTo(21.0F, 42.0F);
      localPath.lineTo(21.00083F, 42.0F);
      localPath.lineTo(21.00166F, 42.0F);
      localPath.cubicTo(21.020754F, 42.0F, 21.039848F, 41.99917F, 21.05894F, 41.997505F);
      localPath.cubicTo(21.09381F, 41.99501F, 21.123693F, 41.97755F, 21.1569F, 41.9709F);
      localPath.cubicTo(21.215843F, 41.95926F, 21.273123F, 41.948452F, 21.327915F, 41.925175F);
      localPath.cubicTo(21.369423F, 41.90605F, 21.405119F, 41.880276F, 21.442476F, 41.855335F);
      localPath.cubicTo(21.488966F, 41.826237F, 21.532965F, 41.796303F, 21.571981F, 41.75806F);
      localPath.cubicTo(21.605188F, 41.725636F, 21.630095F, 41.689884F, 21.65749F, 41.651638F);
      localPath.cubicTo(21.689865F, 41.607574F, 21.719751F, 41.56517F, 21.743826F, 41.514454F);
      localPath.cubicTo(21.76375F, 41.47039F, 21.775372F, 41.426327F, 21.788654F, 41.378937F);
      localPath.cubicTo(21.798616F, 41.344017F, 21.81771F, 41.313255F, 21.822691F, 41.276672F);
      localPath.cubicTo(22.32411F, 37.72488F, 33.24905F, 37.375687F, 40.0182F, 37.98927F);
      localPath.cubicTo(40.257286F, 38.01504F, 40.48226F, 37.9319F, 40.653275F, 37.77144F);
      localPath.cubicTo(40.82512F, 37.61181F, 40.923077F, 37.38483F, 40.923077F, 37.148712F);
      localPath.lineTo(40.923077F, 4.489181F);
      localPath.cubicTo(40.923077F, 4.256386F, 40.82761F, 4.033567F, 40.660744F, 3.8739362F);
      localPath.lineTo(40.660744F, 3.8739362F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint1);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\ajc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */