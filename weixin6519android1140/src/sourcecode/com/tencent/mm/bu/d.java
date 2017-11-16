package com.tencent.mm.bu;

import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class d
  extends AbstractCursor
{
  private final int columnCount;
  private final String[] columnNames;
  private Object[] data;
  private int rowCount;
  
  private d(String[] paramArrayOfString)
  {
    GMTrace.i(13557332705280L, 101010);
    this.rowCount = 0;
    this.columnNames = paramArrayOfString;
    this.columnCount = paramArrayOfString.length;
    this.data = new Object[this.columnCount * 16];
    GMTrace.o(13557332705280L, 101010);
  }
  
  public d(String[] paramArrayOfString, byte paramByte)
  {
    this(paramArrayOfString);
    GMTrace.i(13557466923008L, 101011);
    GMTrace.o(13557466923008L, 101011);
  }
  
  private static int bN(Object paramObject)
  {
    GMTrace.i(13559345971200L, 101025);
    if (paramObject == null)
    {
      GMTrace.o(13559345971200L, 101025);
      return 0;
    }
    if ((paramObject instanceof byte[]))
    {
      GMTrace.o(13559345971200L, 101025);
      return 4;
    }
    if (((paramObject instanceof Float)) || ((paramObject instanceof Double)))
    {
      GMTrace.o(13559345971200L, 101025);
      return 2;
    }
    if (((paramObject instanceof Long)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Short)) || ((paramObject instanceof Byte)))
    {
      GMTrace.o(13559345971200L, 101025);
      return 1;
    }
    GMTrace.o(13559345971200L, 101025);
    return 3;
  }
  
  private Object get(int paramInt)
  {
    GMTrace.i(13557601140736L, 101012);
    if ((paramInt < 0) || (paramInt >= this.columnCount)) {
      throw new CursorIndexOutOfBoundsException("Requested column: " + paramInt + ", # of columns: " + this.columnCount);
    }
    if (this.mPos < 0) {
      throw new CursorIndexOutOfBoundsException("Before first row.");
    }
    if (this.mPos >= this.rowCount) {
      throw new CursorIndexOutOfBoundsException("After last row.");
    }
    Object localObject = this.data[(this.mPos * this.columnCount + paramInt)];
    GMTrace.o(13557601140736L, 101012);
    return localObject;
  }
  
  public final void addRow(Object[] paramArrayOfObject)
  {
    GMTrace.i(13557735358464L, 101013);
    if (paramArrayOfObject.length != this.columnCount) {
      throw new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.length = " + paramArrayOfObject.length);
    }
    int i = this.rowCount;
    this.rowCount = (i + 1);
    int k = i * this.columnCount;
    i = this.columnCount + k;
    Object[] arrayOfObject;
    int j;
    if (i > this.data.length)
    {
      arrayOfObject = this.data;
      j = this.data.length * 2;
      if (j >= i) {
        break label156;
      }
    }
    for (;;)
    {
      this.data = new Object[i];
      System.arraycopy(arrayOfObject, 0, this.data, 0, arrayOfObject.length);
      System.arraycopy(paramArrayOfObject, 0, this.data, k, this.columnCount);
      GMTrace.o(13557735358464L, 101013);
      return;
      label156:
      i = j;
    }
  }
  
  public final void fillWindow(int paramInt, CursorWindow paramCursorWindow)
  {
    GMTrace.i(13559480188928L, 101026);
    if ((paramInt < 0) || (paramInt >= getCount()))
    {
      GMTrace.o(13559480188928L, 101026);
      return;
    }
    paramCursorWindow.acquireReference();
    try
    {
      int j = getPosition();
      int k = getColumnCount();
      paramCursorWindow.clear();
      paramCursorWindow.setStartPosition(paramInt);
      paramCursorWindow.setNumColumns(k);
      int i;
      if (moveToPosition(paramInt)) {
        if (paramCursorWindow.allocRow())
        {
          i = 0;
          label78:
          if (i < k) {
            switch (bN(get(i)))
            {
            }
          }
        }
      }
      for (;;)
      {
        Object localObject1 = getString(i);
        boolean bool;
        if (localObject1 != null) {
          bool = paramCursorWindow.putString((String)localObject1, paramInt, i);
        }
        for (;;)
        {
          if (bool) {
            break label280;
          }
          paramCursorWindow.freeLastRow();
          paramInt += 1;
          if (moveToNext()) {
            break;
          }
          moveToPosition(j);
          paramCursorWindow.releaseReference();
          GMTrace.o(13559480188928L, 101026);
          return;
          bool = paramCursorWindow.putNull(paramInt, i);
          continue;
          bool = paramCursorWindow.putLong(getLong(i), paramInt, i);
          continue;
          bool = paramCursorWindow.putDouble(getDouble(i), paramInt, i);
          continue;
          localObject1 = getBlob(i);
          if (localObject1 != null)
          {
            bool = paramCursorWindow.putBlob((byte[])localObject1, paramInt, i);
          }
          else
          {
            bool = paramCursorWindow.putNull(paramInt, i);
            continue;
            bool = paramCursorWindow.putNull(paramInt, i);
          }
        }
        label280:
        i += 1;
        break label78;
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      paramCursorWindow.releaseReference();
      GMTrace.o(13559480188928L, 101026);
      return;
    }
    finally
    {
      paramCursorWindow.releaseReference();
    }
  }
  
  public final byte[] getBlob(int paramInt)
  {
    GMTrace.i(13558943318016L, 101022);
    byte[] arrayOfByte = (byte[])get(paramInt);
    GMTrace.o(13558943318016L, 101022);
    return arrayOfByte;
  }
  
  public final String[] getColumnNames()
  {
    GMTrace.i(13558003793920L, 101015);
    String[] arrayOfString = this.columnNames;
    GMTrace.o(13558003793920L, 101015);
    return arrayOfString;
  }
  
  public final int getCount()
  {
    GMTrace.i(13557869576192L, 101014);
    int i = this.rowCount;
    GMTrace.o(13557869576192L, 101014);
    return i;
  }
  
  public final double getDouble(int paramInt)
  {
    GMTrace.i(13558809100288L, 101021);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(13558809100288L, 101021);
      return 0.0D;
    }
    if ((localObject instanceof Number))
    {
      d = ((Number)localObject).doubleValue();
      GMTrace.o(13558809100288L, 101021);
      return d;
    }
    double d = bg.getDouble(localObject.toString(), 0.0D);
    GMTrace.o(13558809100288L, 101021);
    return d;
  }
  
  public final float getFloat(int paramInt)
  {
    GMTrace.i(13558674882560L, 101020);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(13558674882560L, 101020);
      return 0.0F;
    }
    if ((localObject instanceof Number))
    {
      f = ((Number)localObject).floatValue();
      GMTrace.o(13558674882560L, 101020);
      return f;
    }
    float f = bg.getFloat(localObject.toString(), 0.0F);
    GMTrace.o(13558674882560L, 101020);
    return f;
  }
  
  public final int getInt(int paramInt)
  {
    GMTrace.i(13558406447104L, 101018);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(13558406447104L, 101018);
      return 0;
    }
    if ((localObject instanceof Number))
    {
      paramInt = ((Number)localObject).intValue();
      GMTrace.o(13558406447104L, 101018);
      return paramInt;
    }
    paramInt = bg.getInt(localObject.toString(), 0);
    GMTrace.o(13558406447104L, 101018);
    return paramInt;
  }
  
  public final long getLong(int paramInt)
  {
    GMTrace.i(13558540664832L, 101019);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(13558540664832L, 101019);
      return 0L;
    }
    if ((localObject instanceof Number))
    {
      l = ((Number)localObject).longValue();
      GMTrace.o(13558540664832L, 101019);
      return l;
    }
    long l = bg.getLong(localObject.toString(), 0L);
    GMTrace.o(13558540664832L, 101019);
    return l;
  }
  
  public final short getShort(int paramInt)
  {
    GMTrace.i(13558272229376L, 101017);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(13558272229376L, 101017);
      return 0;
    }
    if ((localObject instanceof Number))
    {
      s = ((Number)localObject).shortValue();
      GMTrace.o(13558272229376L, 101017);
      return s;
    }
    short s = Short.parseShort(localObject.toString());
    GMTrace.o(13558272229376L, 101017);
    return s;
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(13558138011648L, 101016);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(13558138011648L, 101016);
      return null;
    }
    localObject = localObject.toString();
    GMTrace.o(13558138011648L, 101016);
    return (String)localObject;
  }
  
  public final int getType(int paramInt)
  {
    GMTrace.i(13559077535744L, 101023);
    paramInt = bN(get(paramInt));
    GMTrace.o(13559077535744L, 101023);
    return paramInt;
  }
  
  public final boolean isNull(int paramInt)
  {
    GMTrace.i(13559211753472L, 101024);
    if (get(paramInt) == null)
    {
      GMTrace.o(13559211753472L, 101024);
      return true;
    }
    GMTrace.o(13559211753472L, 101024);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\bu\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */