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

public final class vd
  extends c
{
  private final int height;
  private final int width;
  
  public vd()
  {
    GMTrace.i(15771790999552L, 117509);
    this.width = 72;
    this.height = 72;
    GMTrace.o(15771790999552L, 117509);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15771925217280L, 117510);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15771925217280L, 117510);
      return 0;
      GMTrace.o(15771925217280L, 117510);
      return 72;
      GMTrace.o(15771925217280L, 117510);
      return 72;
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
      localPaint2.setColor(-7822636);
      localCanvas.save();
      localPaint2 = c.a(localPaint2, paramVarArgs);
      Path localPath = c.i(paramVarArgs);
      localPath.moveTo(34.407272F, 0.0F);
      localPath.lineTo(37.44F, 0.0F);
      localPath.cubicTo(46.914547F, 0.39818183F, 56.16F, 4.6472726F, 62.53636F, 11.683637F);
      localPath.cubicTo(68.23637F, 17.83091F, 71.56364F, 26.01818F, 72.0F, 34.374546F);
      localPath.lineTo(72.0F, 37.47818F);
      localPath.cubicTo(71.59637F, 46.407272F, 67.821815F, 55.145454F, 61.46182F, 61.44F);
      localPath.cubicTo(55.205456F, 67.78364F, 46.52182F, 71.55273F, 37.636364F, 72.0F);
      localPath.lineTo(34.52182F, 72.0F);
      localPath.cubicTo(25.052727F, 71.59091F, 15.818182F, 67.34182F, 9.458181F, 60.305454F);
      localPath.cubicTo(3.769091F, 54.174545F, 0.44727272F, 45.99818F, 0.0F, 37.663635F);
      localPath.lineTo(0.0F, 34.36909F);
      localPath.cubicTo(0.43636364F, 26.012728F, 3.769091F, 17.82F, 9.4745455F, 11.678182F);
      localPath.cubicTo(15.812727F, 4.6745453F, 24.992727F, 0.45818183F, 34.407272F, 0.0F);
      localPath.lineTo(34.407272F, 0.0F);
      localPath.close();
      localPath.moveTo(23.52F, 24.12F);
      localPath.cubicTo(21.58909F, 24.714546F, 21.212727F, 27.032728F, 22.052727F, 28.663637F);
      localPath.cubicTo(21.316364F, 29.350908F, 20.356363F, 30.021818F, 20.307272F, 31.134546F);
      localPath.cubicTo(20.116364F, 32.165455F, 20.83091F, 33.01091F, 21.256363F, 33.872726F);
      localPath.cubicTo(20.389091F, 34.723637F, 19.374546F, 35.727272F, 19.66909F, 37.074547F);
      localPath.cubicTo(19.75091F, 38.274544F, 20.792727F, 38.945454F, 21.703636F, 39.534546F);
      localPath.cubicTo(21.065454F, 40.265453F, 20.209091F, 40.96909F, 20.192728F, 42.02727F);
      localPath.cubicTo(19.99091F, 43.805454F, 21.632727F, 45.414547F, 23.4F, 45.256363F);
      localPath.cubicTo(27.196363F, 45.31091F, 30.987272F, 45.250908F, 34.783638F, 45.267273F);
      localPath.cubicTo(33.9F, 48.665455F, 34.03636F, 52.26F, 34.914547F, 55.64182F);
      localPath.cubicTo(35.258183F, 57.556362F, 37.36909F, 58.98F, 39.256363F, 58.625454F);
      localPath.cubicTo(40.2F, 58.18909F, 40.063637F, 57.04909F, 40.06909F, 56.203636F);
      localPath.cubicTo(39.872726F, 53.14909F, 40.14F, 49.925453F, 41.78182F, 47.263638F);
      localPath.cubicTo(43.18909F, 45.12F, 45.305454F, 42.965454F, 48.054546F, 42.987274F);
      localPath.cubicTo(49.085453F, 42.703636F, 50.61273F, 43.085453F, 51.174545F, 41.934544F);
      localPath.cubicTo(51.42F, 38.514545F, 51.196365F, 35.078182F, 51.272728F, 31.652727F);
      localPath.cubicTo(51.201817F, 29.803637F, 51.572727F, 27.867273F, 50.836365F, 26.110909F);
      localPath.cubicTo(45.894547F, 26.82F, 41.84182F, 23.209091F, 37.06909F, 22.827272F);
      localPath.cubicTo(32.541817F, 22.347273F, 27.856363F, 22.690908F, 23.52F, 24.12F);
      localPath.lineTo(23.52F, 24.12F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, localPaint2);
      localCanvas.restore();
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-1);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 19.090908F, 0.0F, 1.0F, 22.363636F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(4.429091F, 1.7563636F);
      ((Path)localObject2).cubicTo(8.765454F, 0.3272727F, 13.450909F, -0.016363636F, 17.978182F, 0.46363637F);
      ((Path)localObject2).cubicTo(22.75091F, 0.8454546F, 26.803637F, 4.4563637F, 31.745455F, 3.7472727F);
      ((Path)localObject2).cubicTo(32.48182F, 5.5036364F, 32.11091F, 7.44F, 32.18182F, 9.289091F);
      ((Path)localObject2).cubicTo(32.105453F, 12.714545F, 32.32909F, 16.15091F, 32.083637F, 19.57091F);
      ((Path)localObject2).cubicTo(31.521818F, 20.721819F, 29.994545F, 20.34F, 28.963636F, 20.623636F);
      ((Path)localObject2).cubicTo(26.214546F, 20.601818F, 24.098183F, 22.756363F, 22.690908F, 24.9F);
      ((Path)localObject2).cubicTo(21.049091F, 27.56182F, 20.781818F, 30.785454F, 20.978182F, 33.84F);
      ((Path)localObject2).cubicTo(20.972727F, 34.685455F, 21.10909F, 35.825455F, 20.165455F, 36.261818F);
      ((Path)localObject2).cubicTo(18.278181F, 36.616364F, 16.167273F, 35.192726F, 15.823636F, 33.278183F);
      ((Path)localObject2).cubicTo(14.945455F, 29.896364F, 14.809091F, 26.301819F, 15.692727F, 22.903637F);
      ((Path)localObject2).cubicTo(11.896363F, 22.887272F, 8.105454F, 22.947273F, 4.309091F, 22.892727F);
      ((Path)localObject2).cubicTo(2.5418181F, 23.050909F, 0.9F, 21.441818F, 1.1018182F, 19.663637F);
      ((Path)localObject2).cubicTo(1.1181818F, 18.605455F, 1.9745455F, 17.901817F, 2.6127272F, 17.17091F);
      ((Path)localObject2).cubicTo(1.7018182F, 16.581818F, 0.66F, 15.910909F, 0.5781818F, 14.710909F);
      ((Path)localObject2).cubicTo(0.28363636F, 13.363636F, 1.2981818F, 12.36F, 2.1654546F, 11.50909F);
      ((Path)localObject2).cubicTo(1.74F, 10.647273F, 1.0254545F, 9.801818F, 1.2163637F, 8.770909F);
      ((Path)localObject2).cubicTo(1.2654545F, 7.6581817F, 2.2254546F, 6.9872727F, 2.9618182F, 6.3F);
      ((Path)localObject2).cubicTo(2.121818F, 4.6690907F, 2.4981818F, 2.350909F, 4.429091F, 1.7563636F);
      ((Path)localObject2).lineTo(4.429091F, 1.7563636F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\vd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */