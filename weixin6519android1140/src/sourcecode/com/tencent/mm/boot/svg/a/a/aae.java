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

public final class aae
  extends c
{
  private final int height;
  private final int width;
  
  public aae()
  {
    GMTrace.i(15809640398848L, 117791);
    this.width = 68;
    this.height = 73;
    GMTrace.o(15809640398848L, 117791);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15809774616576L, 117792);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15809774616576L, 117792);
      return 0;
      GMTrace.o(15809774616576L, 117792);
      return 68;
      GMTrace.o(15809774616576L, 117792);
      return 73;
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
      localPaint.setColor(-2115775);
      localCanvas.save();
      localPaint = c.a(localPaint, paramVarArgs);
      localObject = c.i(paramVarArgs);
      ((Path)localObject).moveTo(45.02786F, 19.699146F);
      ((Path)localObject).cubicTo(47.790768F, 16.894377F, 53.183926F, 9.984685F, 51.000412F, 7.6524725F);
      ((Path)localObject).cubicTo(48.730103F, 5.2275586F, 44.949017F, 8.090303F, 40.595642F, 8.090303F);
      ((Path)localObject).cubicTo(35.52866F, 8.090303F, 30.163124F, 4.05F, 25.084188F, 4.05F);
      ((Path)localObject).cubicTo(20.005253F, 4.05F, 17.508955F, 5.9924593F, 17.103004F, 7.6524725F);
      ((Path)localObject).cubicTo(15.994337F, 12.186032F, 20.433609F, 17.720968F, 22.574883F, 19.639809F);
      ((Path)localObject).cubicTo(12.409413F, 24.923576F, 5.4F, 36.815495F, 5.4F, 47.60502F);
      ((Path)localObject).cubicTo(5.4F, 62.00375F, 17.88318F, 68.98671F, 33.69146F, 68.98671F);
      ((Path)localObject).cubicTo(49.499737F, 68.98671F, 62.646835F, 62.00375F, 62.646835F, 47.60502F);
      ((Path)localObject).cubicTo(62.646835F, 36.855694F, 55.319534F, 25.01218F, 45.02786F, 19.699146F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(40.52908F, 17.868376F);
      ((Path)localObject).cubicTo(42.654507F, 16.605152F, 45.585922F, 12.036678F, 45.00239F, 11.457223F);
      ((Path)localObject).cubicTo(44.324272F, 10.783839F, 42.947887F, 12.130608F, 40.303074F, 12.130608F);
      ((Path)localObject).cubicTo(34.199993F, 12.130608F, 27.791922F, 8.090303F, 24.706308F, 8.090303F);
      ((Path)localObject).cubicTo(21.620693F, 8.090303F, 21.315706F, 9.409305F, 21.315706F, 10.783839F);
      ((Path)localObject).cubicTo(21.315706F, 12.656585F, 25.16565F, 16.920174F, 26.480436F, 17.998384F);
      ((Path)localObject).cubicTo(28.776915F, 17.253117F, 31.192646F, 16.844296F, 33.69146F, 16.844296F);
      ((Path)localObject).cubicTo(36.04092F, 16.844296F, 38.331604F, 17.20571F, 40.52908F, 17.868376F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(33.790348F, 63.98117F);
      ((Path)localObject).cubicTo(46.243694F, 63.98117F, 58.293385F, 59.720745F, 58.293385F, 47.819958F);
      ((Path)localObject).cubicTo(58.293385F, 35.919167F, 46.243694F, 21.557983F, 33.790348F, 21.557983F);
      ((Path)localObject).cubicTo(21.337004F, 21.557983F, 10.146842F, 35.919167F, 10.146842F, 47.819958F);
      ((Path)localObject).cubicTo(10.146842F, 59.720745F, 21.337004F, 63.98117F, 33.790348F, 63.98117F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(20.487278F, 43.41178F);
      ((Path)localObject).cubicTo(20.300562F, 43.21989F, 20.275011F, 42.89434F, 20.42848F, 42.686977F);
      ((Path)localObject).lineTo(21.473255F, 41.2753F);
      ((Path)localObject).cubicTo(21.627497F, 41.06689F, 21.917448F, 41.018803F, 22.133364F, 41.177032F);
      ((Path)localObject).lineTo(29.26747F, 46.405273F);
      ((Path)localObject).cubicTo(29.477795F, 46.55941F, 29.811935F, 46.54795F, 30.008999F, 46.38367F);
      ((Path)localObject).lineTo(45.82105F, 33.202114F);
      ((Path)localObject).cubicTo(46.02026F, 33.036045F, 46.329716F, 33.046528F, 46.52178F, 33.234882F);
      ((Path)localObject).lineTo(47.44506F, 34.140343F);
      ((Path)localObject).cubicTo(47.63285F, 34.324512F, 47.63874F, 34.634953F, 47.46383F, 34.82707F);
      ((Path)localObject).cubicTo(47.46383F, 34.82707F, 42.825367F, 39.949135F, 39.71318F, 42.9906F);
      ((Path)localObject).cubicTo(36.600994F, 46.032063F, 29.990932F, 52.491913F, 29.990932F, 52.491913F);
      ((Path)localObject).cubicTo(29.8017F, 52.676846F, 29.49909F, 52.673416F, 29.31022F, 52.479313F);
      ((Path)localObject).lineTo(20.487278F, 43.41178F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\aae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */