package com.tencent.mm.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import com.tencent.gmtrace.GMTrace;

public class WeChatSVGRenderC2Java
{
  public WeChatSVGRenderC2Java()
  {
    GMTrace.i(3476507590656L, 25902);
    GMTrace.o(3476507590656L, 25902);
  }
  
  public static void addPath(Path paramPath1, Matrix paramMatrix, Path paramPath2, boolean paramBoolean)
  {
    GMTrace.i(3477312897024L, 25908);
    if (paramBoolean) {
      paramPath1.setFillType(paramPath2.getFillType());
    }
    paramPath1.addPath(paramPath2, paramMatrix);
    GMTrace.o(3477312897024L, 25908);
  }
  
  public static void addTextPath(Paint paramPaint, Path paramPath, String paramString, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(3477715550208L, 25911);
    Path localPath = new Path();
    paramPaint.getTextPath(paramString, 0, paramString.length(), paramFloat1, paramFloat2, localPath);
    paramPath.addPath(localPath);
    GMTrace.o(3477715550208L, 25911);
  }
  
  public static Bitmap checkForImageDataURL(String paramString)
  {
    GMTrace.i(3476641808384L, 25903);
    GMTrace.o(3476641808384L, 25903);
    return null;
  }
  
  public static float[] computePathBound(Path paramPath, Matrix paramMatrix)
  {
    GMTrace.i(3477849767936L, 25912);
    if (paramMatrix != null) {
      paramPath.transform(paramMatrix);
    }
    paramMatrix = new RectF();
    paramPath.computeBounds(paramMatrix, true);
    float f1 = paramMatrix.left;
    float f2 = paramMatrix.top;
    float f3 = paramMatrix.right;
    float f4 = paramMatrix.bottom;
    GMTrace.o(3477849767936L, 25912);
    return new float[] { f1, f2, f3, f4 };
  }
  
  public static void doNonScalingStroke(Canvas paramCanvas, Path paramPath, Paint paramPaint)
  {
    GMTrace.i(3476910243840L, 25905);
    Matrix localMatrix1 = paramCanvas.getMatrix();
    Path localPath = new Path();
    paramPath.transform(localMatrix1, localPath);
    paramCanvas.setMatrix(new Matrix());
    paramPath = paramPaint.getShader();
    Matrix localMatrix2 = new Matrix();
    if (paramPath != null)
    {
      paramPath.getLocalMatrix(localMatrix2);
      Matrix localMatrix3 = new Matrix(localMatrix2);
      localMatrix3.postConcat(localMatrix1);
      paramPath.setLocalMatrix(localMatrix3);
    }
    paramCanvas.drawPath(localPath, paramPaint);
    paramCanvas.setMatrix(localMatrix1);
    if (paramPath != null) {
      paramPath.setLocalMatrix(localMatrix2);
    }
    GMTrace.o(3476910243840L, 25905);
  }
  
  public static float getPathMeasureLength(Path paramPath, Matrix paramMatrix)
  {
    GMTrace.i(3477447114752L, 25909);
    if (paramMatrix != null) {
      paramPath.transform(paramMatrix);
    }
    float f = new PathMeasure(paramPath, false).getLength();
    GMTrace.o(3477447114752L, 25909);
    return f;
  }
  
  public static float[] getTextBounds(Paint paramPaint, String paramString)
  {
    GMTrace.i(3477983985664L, 25913);
    Rect localRect = new Rect();
    paramPaint.getTextBounds(paramString, 0, paramString.length(), localRect);
    paramPaint = new RectF(localRect);
    float f1 = paramPaint.left;
    float f2 = paramPaint.top;
    float f3 = paramPaint.right;
    float f4 = paramPaint.bottom;
    GMTrace.o(3477983985664L, 25913);
    return new float[] { f1, f2, f3, f4 };
  }
  
  public static void invert(Matrix paramMatrix1, Matrix paramMatrix2)
  {
    GMTrace.i(3476776026112L, 25904);
    paramMatrix1.invert(paramMatrix2);
    GMTrace.o(3476776026112L, 25904);
  }
  
  public static void setFillType(Path paramPath, int paramInt)
  {
    GMTrace.i(3477581332480L, 25910);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(3477581332480L, 25910);
      return;
      paramPath.setFillType(Path.FillType.WINDING);
      GMTrace.o(3477581332480L, 25910);
      return;
      paramPath.setFillType(Path.FillType.EVEN_ODD);
    }
  }
  
  public static void setLinearGradient(Paint paramPaint, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int[] paramArrayOfInt, float[] paramArrayOfFloat, Matrix paramMatrix, int paramInt)
  {
    GMTrace.i(3477178679296L, 25907);
    Shader.TileMode localTileMode2 = Shader.TileMode.CLAMP;
    Shader.TileMode localTileMode1 = localTileMode2;
    if (paramInt != 0)
    {
      if (paramInt != 2) {
        break label78;
      }
      localTileMode1 = Shader.TileMode.MIRROR;
    }
    for (;;)
    {
      paramArrayOfInt = new LinearGradient(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramArrayOfInt, paramArrayOfFloat, localTileMode1);
      paramArrayOfInt.setLocalMatrix(paramMatrix);
      paramPaint.setShader(paramArrayOfInt);
      GMTrace.o(3477178679296L, 25907);
      return;
      label78:
      localTileMode1 = localTileMode2;
      if (paramInt == 3) {
        localTileMode1 = Shader.TileMode.REPEAT;
      }
    }
  }
  
  public static void setRadialGradient(Paint paramPaint, float paramFloat1, float paramFloat2, float paramFloat3, int[] paramArrayOfInt, float[] paramArrayOfFloat, Matrix paramMatrix, int paramInt)
  {
    GMTrace.i(3477044461568L, 25906);
    Shader.TileMode localTileMode2 = Shader.TileMode.CLAMP;
    Shader.TileMode localTileMode1 = localTileMode2;
    if (paramInt != 0)
    {
      if (paramInt != 2) {
        break label76;
      }
      localTileMode1 = Shader.TileMode.MIRROR;
    }
    for (;;)
    {
      paramArrayOfInt = new RadialGradient(paramFloat1, paramFloat2, paramFloat3, paramArrayOfInt, paramArrayOfFloat, localTileMode1);
      paramArrayOfInt.setLocalMatrix(paramMatrix);
      paramPaint.setShader(paramArrayOfInt);
      GMTrace.o(3477044461568L, 25906);
      return;
      label76:
      localTileMode1 = localTileMode2;
      if (paramInt == 3) {
        localTileMode1 = Shader.TileMode.REPEAT;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\svg\WeChatSVGRenderC2Java.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */