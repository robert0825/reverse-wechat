package com.tencent.mm.plugin.sns.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import com.tencent.gmtrace.GMTrace;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class f
{
  public static byte[] aF(byte[] paramArrayOfByte)
  {
    GMTrace.i(8538126548992L, 63614);
    Object localObject = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
    paramArrayOfByte = ((Bitmap)localObject).copy(Bitmap.Config.ARGB_8888, true);
    Canvas localCanvas = new Canvas(paramArrayOfByte);
    localCanvas.drawColor(-1);
    localCanvas.drawBitmap((Bitmap)localObject, 0.0F, 0.0F, null);
    localObject = new ByteArrayOutputStream();
    paramArrayOfByte.compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)localObject);
    paramArrayOfByte = ((ByteArrayOutputStream)localObject).toByteArray();
    GMTrace.o(8538126548992L, 63614);
    return paramArrayOfByte;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */