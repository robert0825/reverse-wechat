package com.tencent.mm.plugin.record.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.Vector;

public final class i
  extends com.tencent.mm.sdk.e.i<g>
{
  public static final String[] fTX;
  e fTZ;
  public Vector<a> ohh;
  
  static
  {
    GMTrace.i(7497804939264L, 55863);
    fTX = new String[] { com.tencent.mm.sdk.e.i.a(g.fTp, "RecordCDNInfo") };
    GMTrace.o(7497804939264L, 55863);
  }
  
  public i(e parame)
  {
    super(parame, g.fTp, "RecordCDNInfo", null);
    GMTrace.i(7495925891072L, 55849);
    this.ohh = new Vector();
    this.fTZ = parame;
    GMTrace.o(7495925891072L, 55849);
  }
  
  private void b(final int paramInt, final g paramg)
  {
    GMTrace.i(7496328544256L, 55852);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7500220858368L, 55881);
        Iterator localIterator = i.this.ohh.iterator();
        while (localIterator.hasNext()) {
          ((i.a)localIterator.next()).a(paramInt, paramg);
        }
        GMTrace.o(7500220858368L, 55881);
      }
    });
    GMTrace.o(7496328544256L, 55852);
  }
  
  public final g Fv(String paramString)
  {
    Object localObject = null;
    GMTrace.i(7496462761984L, 55853);
    paramString = "SELECT * FROM RecordCDNInfo WHERE mediaId='" + paramString + "'";
    Cursor localCursor = this.fTZ.a(paramString, null, 2);
    paramString = (String)localObject;
    if (localCursor != null)
    {
      paramString = (String)localObject;
      if (localCursor.moveToFirst())
      {
        paramString = new g();
        paramString.b(localCursor);
      }
    }
    if (localCursor != null) {
      localCursor.close();
    }
    GMTrace.o(7496462761984L, 55853);
    return paramString;
  }
  
  public final void a(final a parama)
  {
    GMTrace.i(7496060108800L, 55850);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7499012898816L, 55872);
        if (!i.this.ohh.contains(parama)) {
          i.this.ohh.add(parama);
        }
        GMTrace.o(7499012898816L, 55872);
      }
    });
    GMTrace.o(7496060108800L, 55850);
  }
  
  public final boolean a(g paramg)
  {
    GMTrace.i(7496865415168L, 55856);
    if (paramg != null)
    {
      w.v("MicroMsg.RecordMsgCDNStorage", "insert record cdn info %s", new Object[] { paramg });
      if (super.b(paramg))
      {
        b(2, paramg);
        GMTrace.o(7496865415168L, 55856);
        return true;
      }
    }
    else
    {
      w.e("MicroMsg.RecordMsgCDNStorage", "insert null record cdn info");
      GMTrace.o(7496865415168L, 55856);
      return false;
    }
    GMTrace.o(7496865415168L, 55856);
    return false;
  }
  
  public final boolean a(g paramg, String... paramVarArgs)
  {
    GMTrace.i(7496596979712L, 55854);
    if (super.a(paramg, paramVarArgs))
    {
      b(0, paramg);
      GMTrace.o(7496596979712L, 55854);
      return true;
    }
    GMTrace.o(7496596979712L, 55854);
    return false;
  }
  
  public final void b(final a parama)
  {
    GMTrace.i(7496194326528L, 55851);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7517534945280L, 56010);
        i.this.ohh.remove(parama);
        GMTrace.o(7517534945280L, 56010);
      }
    });
    GMTrace.o(7496194326528L, 55851);
  }
  
  public final boolean b(g paramg, String... paramVarArgs)
  {
    GMTrace.i(7496731197440L, 55855);
    if (super.c(paramg, paramVarArgs))
    {
      b(1, paramg);
      GMTrace.o(7496731197440L, 55855);
      return true;
    }
    GMTrace.o(7496731197440L, 55855);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt, g paramg);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\record\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */