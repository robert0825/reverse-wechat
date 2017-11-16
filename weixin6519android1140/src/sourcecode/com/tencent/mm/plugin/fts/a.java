package com.tencent.mm.plugin.fts;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Iterator;

public final class a
  extends CursorWrapper
{
  private static HashSet<Cursor> luY;
  
  static
  {
    GMTrace.i(17800894611456L, 132627);
    luY = new HashSet();
    GMTrace.o(17800894611456L, 132627);
  }
  
  public a(Cursor paramCursor)
  {
    super(paramCursor);
    GMTrace.i(17800491958272L, 132624);
    luY.add(paramCursor);
    w.d("MicroMsg.FTS.FTSCursor", "add cursor %d", new Object[] { Integer.valueOf(paramCursor.hashCode()) });
    GMTrace.o(17800491958272L, 132624);
  }
  
  public static final void aCb()
  {
    GMTrace.i(17800760393728L, 132626);
    Iterator localIterator = luY.iterator();
    for (;;)
    {
      Cursor localCursor;
      if (localIterator.hasNext())
      {
        localCursor = (Cursor)localIterator.next();
        if (localCursor.isClosed()) {
          continue;
        }
      }
      try
      {
        localCursor.close();
        w.e("MicroMsg.FTS.FTSCursor", "not close cursor!!! %d", new Object[] { Integer.valueOf(localCursor.hashCode()) });
        continue;
        luY.clear();
        GMTrace.o(17800760393728L, 132626);
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  public final void close()
  {
    GMTrace.i(17800626176000L, 132625);
    super.close();
    Cursor localCursor = getWrappedCursor();
    luY.remove(localCursor);
    w.d("MicroMsg.FTS.FTSCursor", "remove cursor %d", new Object[] { Integer.valueOf(localCursor.hashCode()) });
    GMTrace.o(17800626176000L, 132625);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */