package com.tencent.mm.pluginsdk.f.a;

import android.database.MatrixCursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static MatrixCursor yI(int paramInt)
  {
    GMTrace.i(20406866018304L, 152043);
    w.i("MicroMsg.ExtCommonUtils", "returnMatrix = " + paramInt);
    MatrixCursor localMatrixCursor = new MatrixCursor(com.tencent.mm.plugin.ext.b.a.kMv);
    localMatrixCursor.addRow(new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(20406866018304L, 152043);
    return localMatrixCursor;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\f\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */