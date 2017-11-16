package com.tencent.mm.bu.a;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.CursorIndexOutOfBoundsException;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.wcdb.AbstractCursor;

public final class c
  extends AbstractCursor
{
  final int columnCount;
  private final String[] columnNames;
  SparseArray<Object[]> vDS;
  public int vDT;
  int vDU;
  
  private c(String[] paramArrayOfString)
  {
    GMTrace.i(17544941404160L, 130720);
    this.vDT = 3000;
    this.columnNames = paramArrayOfString;
    this.columnCount = paramArrayOfString.length;
    this.vDS = new SparseArray();
    GMTrace.o(17544941404160L, 130720);
  }
  
  public c(String[] paramArrayOfString, byte paramByte)
  {
    this(paramArrayOfString);
    GMTrace.i(17545075621888L, 130721);
    GMTrace.o(17545075621888L, 130721);
  }
  
  private Object get(int paramInt)
  {
    GMTrace.i(17545209839616L, 130722);
    if ((paramInt < 0) || (paramInt >= this.columnCount)) {
      throw new CursorIndexOutOfBoundsException("Requested column: " + paramInt + ", # of columns: " + this.columnCount);
    }
    if (this.mPos < 0) {
      throw new CursorIndexOutOfBoundsException("Before first row.");
    }
    if (this.mPos >= this.vDU) {
      throw new CursorIndexOutOfBoundsException("After last row.");
    }
    int i = this.mPos / this.vDT;
    int j = this.mPos;
    int k = this.vDT;
    int m = this.columnCount;
    Object localObject = ((Object[])this.vDS.get(i))[(j % k * m + paramInt)];
    GMTrace.o(17545209839616L, 130722);
    return localObject;
  }
  
  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
    GMTrace.i(17546686234624L, 130733);
    GMTrace.o(17546686234624L, 130733);
  }
  
  public final byte[] getBlob(int paramInt)
  {
    GMTrace.i(17546552016896L, 130732);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(17546552016896L, 130732);
      return null;
    }
    localObject = (byte[])localObject;
    GMTrace.o(17546552016896L, 130732);
    return (byte[])localObject;
  }
  
  public final String[] getColumnNames()
  {
    GMTrace.i(17545478275072L, 130724);
    String[] arrayOfString = this.columnNames;
    GMTrace.o(17545478275072L, 130724);
    return arrayOfString;
  }
  
  public final int getCount()
  {
    GMTrace.i(17545344057344L, 130723);
    int i = this.vDU;
    GMTrace.o(17545344057344L, 130723);
    return i;
  }
  
  public final double getDouble(int paramInt)
  {
    GMTrace.i(17546283581440L, 130730);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(17546283581440L, 130730);
      return 0.0D;
    }
    if ((localObject instanceof Number))
    {
      d = ((Number)localObject).doubleValue();
      GMTrace.o(17546283581440L, 130730);
      return d;
    }
    double d = Double.parseDouble(localObject.toString());
    GMTrace.o(17546283581440L, 130730);
    return d;
  }
  
  public final float getFloat(int paramInt)
  {
    GMTrace.i(17546149363712L, 130729);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(17546149363712L, 130729);
      return 0.0F;
    }
    if ((localObject instanceof Number))
    {
      f = ((Number)localObject).floatValue();
      GMTrace.o(17546149363712L, 130729);
      return f;
    }
    float f = Float.parseFloat(localObject.toString());
    GMTrace.o(17546149363712L, 130729);
    return f;
  }
  
  public final int getInt(int paramInt)
  {
    GMTrace.i(17545880928256L, 130727);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(17545880928256L, 130727);
      return 0;
    }
    if ((localObject instanceof Number))
    {
      paramInt = ((Number)localObject).intValue();
      GMTrace.o(17545880928256L, 130727);
      return paramInt;
    }
    paramInt = Integer.parseInt(localObject.toString());
    GMTrace.o(17545880928256L, 130727);
    return paramInt;
  }
  
  public final long getLong(int paramInt)
  {
    GMTrace.i(17546015145984L, 130728);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(17546015145984L, 130728);
      return 0L;
    }
    if ((localObject instanceof Number))
    {
      l = ((Number)localObject).longValue();
      GMTrace.o(17546015145984L, 130728);
      return l;
    }
    long l = Long.parseLong(localObject.toString());
    GMTrace.o(17546015145984L, 130728);
    return l;
  }
  
  public final short getShort(int paramInt)
  {
    GMTrace.i(17545746710528L, 130726);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(17545746710528L, 130726);
      return 0;
    }
    if ((localObject instanceof Number))
    {
      s = ((Number)localObject).shortValue();
      GMTrace.o(17545746710528L, 130726);
      return s;
    }
    short s = Short.parseShort(localObject.toString());
    GMTrace.o(17545746710528L, 130726);
    return s;
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(17545612492800L, 130725);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(17545612492800L, 130725);
      return null;
    }
    localObject = localObject.toString();
    GMTrace.o(17545612492800L, 130725);
    return (String)localObject;
  }
  
  public final boolean isNull(int paramInt)
  {
    GMTrace.i(17546417799168L, 130731);
    if (get(paramInt) == null)
    {
      GMTrace.o(17546417799168L, 130731);
      return true;
    }
    GMTrace.o(17546417799168L, 130731);
    return false;
  }
  
  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
    GMTrace.i(17546820452352L, 130734);
    GMTrace.o(17546820452352L, 130734);
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    GMTrace.i(17547088887808L, 130736);
    GMTrace.o(17547088887808L, 130736);
  }
  
  public final void unregisterContentObserver(ContentObserver paramContentObserver)
  {
    GMTrace.i(17546954670080L, 130735);
    GMTrace.o(17546954670080L, 130735);
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    GMTrace.i(17547223105536L, 130737);
    GMTrace.o(17547223105536L, 130737);
  }
  
  public final class a
  {
    final int endIndex;
    int index;
    Object[] vDV;
    
    a(int paramInt1, int paramInt2, Object[] paramArrayOfObject)
    {
      GMTrace.i(17555276169216L, 130797);
      this.index = paramInt1;
      this.endIndex = paramInt2;
      this.vDV = paramArrayOfObject;
      GMTrace.o(17555276169216L, 130797);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bu\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */