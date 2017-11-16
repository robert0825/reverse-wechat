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

public final class db
  extends c
{
  private final int height;
  private final int width;
  
  public db()
  {
    GMTrace.i(15756490178560L, 117395);
    this.width = 64;
    this.height = 60;
    GMTrace.o(15756490178560L, 117395);
  }
  
  protected final int b(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15756624396288L, 117396);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(15756624396288L, 117396);
      return 0;
      GMTrace.o(15756624396288L, 117396);
      return 64;
      GMTrace.o(15756624396288L, 117396);
      return 60;
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
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramVarArgs);
      localPaint1.setColor(-16777216);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, -194.0F, 0.0F, 1.0F, -102.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramVarArgs);
      localObject2 = c.i(paramVarArgs);
      ((Path)localObject2).moveTo(224.36317F, 150.10246F);
      ((Path)localObject2).lineTo(204.89511F, 161.91656F);
      ((Path)localObject2).lineTo(210.11502F, 139.75056F);
      ((Path)localObject2).lineTo(192.86317F, 124.88609F);
      ((Path)localObject2).lineTo(215.55734F, 123.000854F);
      ((Path)localObject2).lineTo(224.36317F, 102.0F);
      ((Path)localObject2).lineTo(233.16902F, 123.000854F);
      ((Path)localObject2).lineTo(255.86317F, 124.88609F);
      ((Path)localObject2).lineTo(238.61133F, 139.75056F);
      ((Path)localObject2).lineTo(243.83125F, 161.91656F);
      ((Path)localObject2).lineTo(224.36317F, 150.10246F);
      ((Path)localObject2).close();
      ((Path)localObject2).moveTo(224.24213F, 144.04645F);
      ((Path)localObject2).lineTo(235.99782F, 151.18034F);
      ((Path)localObject2).lineTo(232.8458F, 137.7955F);
      ((Path)localObject2).lineTo(243.26324F, 128.81966F);
      ((Path)localObject2).lineTo(229.5595F, 127.681274F);
      ((Path)localObject2).lineTo(224.24213F, 115.0F);
      ((Path)localObject2).lineTo(218.92476F, 127.681274F);
      ((Path)localObject2).lineTo(205.221F, 128.81966F);
      ((Path)localObject2).lineTo(215.63844F, 137.7955F);
      ((Path)localObject2).lineTo(212.48642F, 151.18034F);
      ((Path)localObject2).lineTo(224.24213F, 144.04645F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.g(paramVarArgs);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\boot\svg\a\a\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */