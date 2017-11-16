package com.tencent.mm.bu;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

final class b
{
  private static int index;
  private static boolean on;
  private static g.a vCY;
  private static long vCZ;
  private static int vDa;
  
  static
  {
    GMTrace.i(13557198487552L, 101009);
    on = false;
    index = 0;
    vCY = null;
    vCZ = 0L;
    vDa = 0;
    GMTrace.o(13557198487552L, 101009);
  }
  
  static void a(String paramString, Cursor paramCursor, long paramLong)
  {
    GMTrace.i(13557064269824L, 101008);
    if (!on)
    {
      GMTrace.o(13557064269824L, 101008);
      return;
    }
    long l = vCY.tD();
    Object localObject1 = "Thread:[" + Thread.currentThread().getId() + "," + Thread.currentThread().getName() + "]";
    Object localObject2 = (String)localObject1 + "[" + index + "][" + l + "]";
    localObject1 = localObject2;
    if (paramLong != 0L) {
      localObject1 = (String)localObject2 + "[INTRANS]";
    }
    localObject2 = localObject1;
    if (paramCursor != null)
    {
      i(paramCursor);
      localObject2 = (String)localObject1 + "[cuCnt:" + vDa + ",cuTime:" + vCZ + "]";
    }
    paramString = (String)localObject2 + "[" + paramString + "]--";
    w.v("MicroMsg.dbtest", paramString + bg.bQW());
    GMTrace.o(13557064269824L, 101008);
  }
  
  static void begin()
  {
    GMTrace.i(13556795834368L, 101006);
    if (!on)
    {
      GMTrace.o(13556795834368L, 101006);
      return;
    }
    vCY = new g.a();
    index += 1;
    GMTrace.o(13556795834368L, 101006);
  }
  
  public static void h(Exception paramException)
  {
    GMTrace.i(13556661616640L, 101005);
    if (on) {
      w.e("MicroMsg.DKTest", "exception:%s", new Object[] { bg.f(paramException) });
    }
    GMTrace.o(13556661616640L, 101005);
  }
  
  private static void i(Cursor paramCursor)
  {
    GMTrace.i(13556930052096L, 101007);
    if (!on)
    {
      GMTrace.o(13556930052096L, 101007);
      return;
    }
    if (paramCursor == null)
    {
      GMTrace.o(13556930052096L, 101007);
      return;
    }
    vDa = paramCursor.getCount();
    g.a locala = new g.a();
    int i = 0;
    while (i < vDa)
    {
      paramCursor.moveToPosition(i);
      i += 1;
    }
    paramCursor.moveToPosition(-1);
    vCZ = locala.tD();
    GMTrace.o(13556930052096L, 101007);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bu\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */