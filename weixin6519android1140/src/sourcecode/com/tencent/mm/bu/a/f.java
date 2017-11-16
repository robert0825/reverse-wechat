package com.tencent.mm.bu.a;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteCursorDriver;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabase.CursorFactory;
import com.tencent.wcdb.database.SQLiteProgram;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class f
  extends AbstractCursor
  implements d
{
  public static final SQLiteDatabase.CursorFactory FACTORY;
  private Map<String, Integer> mColumnNameMap;
  private final String[] mColumns;
  private int mCount;
  private final SQLiteCursorDriver mDriver;
  private final String mEditTable;
  private final Throwable mStackTrace;
  private int pageSize;
  private final h vEa;
  public a vEb;
  private boolean vEc;
  private b<a> vEd;
  c vEe;
  private boolean vEf;
  
  static
  {
    GMTrace.i(17552054943744L, 130773);
    FACTORY = new SQLiteDatabase.CursorFactory()
    {
      public final Cursor newCursor(SQLiteDatabase paramAnonymousSQLiteDatabase, SQLiteCursorDriver paramAnonymousSQLiteCursorDriver, String paramAnonymousString, SQLiteProgram paramAnonymousSQLiteProgram)
      {
        GMTrace.i(17539170041856L, 130677);
        paramAnonymousSQLiteDatabase = new f(paramAnonymousSQLiteCursorDriver, paramAnonymousString, (h)paramAnonymousSQLiteProgram);
        GMTrace.o(17539170041856L, 130677);
        return paramAnonymousSQLiteDatabase;
      }
      
      public final SQLiteProgram newQuery(SQLiteDatabase paramAnonymousSQLiteDatabase, String paramAnonymousString, Object[] paramAnonymousArrayOfObject, CancellationSignal paramAnonymousCancellationSignal)
      {
        GMTrace.i(17539304259584L, 130678);
        paramAnonymousSQLiteDatabase = new h(paramAnonymousSQLiteDatabase, paramAnonymousString, paramAnonymousCancellationSignal);
        GMTrace.o(17539304259584L, 130678);
        return paramAnonymousSQLiteDatabase;
      }
    };
    GMTrace.o(17552054943744L, 130773);
  }
  
  public f(SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, h paramh)
  {
    GMTrace.i(17547357323264L, 130738);
    this.mCount = -1;
    this.pageSize = 3000;
    if (paramh == null) {
      throw new IllegalArgumentException("query object cannot be null");
    }
    this.mStackTrace = null;
    this.mDriver = paramSQLiteCursorDriver;
    this.mEditTable = paramString;
    this.mColumnNameMap = null;
    this.vEa = paramh;
    this.mColumns = paramh.getColumnNames();
    this.mRowIdColumnIndex = DatabaseUtils.findRowIdColumnIndex(this.mColumns);
    GMTrace.o(17547357323264L, 130738);
  }
  
  private int AK(int paramInt)
  {
    GMTrace.i(17548296847360L, 130745);
    if (this.vEc)
    {
      if (this.vEd == null) {
        this.vEd = new b()
        {
          public final ArrayList<a> ah(ArrayList<Object> paramAnonymousArrayList)
          {
            GMTrace.i(17538364735488L, 130671);
            f localf = f.this;
            if (localf.vEb != null)
            {
              paramAnonymousArrayList = localf.vEb.ah(paramAnonymousArrayList);
              GMTrace.o(17538364735488L, 130671);
              return paramAnonymousArrayList;
            }
            GMTrace.o(17538364735488L, 130671);
            return null;
          }
          
          public final a bVm()
          {
            GMTrace.i(17538230517760L, 130670);
            Object localObject = f.this;
            if (((f)localObject).vEb != null)
            {
              localObject = ((f)localObject).vEb.bVm();
              GMTrace.o(17538230517760L, 130670);
              return (a)localObject;
            }
            GMTrace.o(17538230517760L, 130670);
            return null;
          }
        };
      }
      this.vEd.mStartPos = paramInt;
      paramInt = this.vEa.a(this.vEd, paramInt, this.pageSize);
      GMTrace.o(17548296847360L, 130745);
      return paramInt;
    }
    bVn();
    paramInt = this.vEa.a(this.vEe, paramInt, this.pageSize);
    GMTrace.o(17548296847360L, 130745);
    return paramInt;
  }
  
  private void bVn()
  {
    GMTrace.i(17547894194176L, 130742);
    if (this.vEe == null) {
      this.vEe = new c(this.mColumns, (byte)0);
    }
    GMTrace.o(17547894194176L, 130742);
  }
  
  public final boolean AG(int paramInt)
  {
    GMTrace.i(17550712766464L, 130763);
    if (!this.vEc)
    {
      GMTrace.o(17550712766464L, 130763);
      return false;
    }
    b localb = this.vEd;
    if (paramInt <= 50)
    {
      if (localb.vDO < 10)
      {
        GMTrace.o(17550712766464L, 130763);
        return true;
      }
      if (paramInt / localb.vDO < 0.1D)
      {
        GMTrace.o(17550712766464L, 130763);
        return true;
      }
    }
    GMTrace.o(17550712766464L, 130763);
    return false;
  }
  
  public final a AH(int paramInt)
  {
    Object localObject1 = null;
    int i = 0;
    GMTrace.i(17550310113280L, 130760);
    if (this.vEd != null)
    {
      b localb = this.vEd;
      if (localb.AJ(paramInt))
      {
        Object localObject2 = localb.vDN.get(paramInt);
        a locala = (a)localb.vDP.get(localObject2);
        localObject1 = locala;
        if (locala == null)
        {
          w.i("MicroMsg.CursorDataWindow", "get data null %s", new Object[] { localObject2 });
          if (localb.vDQ.size() != 0)
          {
            localObject1 = localb.ah(localb.vDQ);
            if (localObject1 != null) {
              if (i < ((ArrayList)localObject1).size())
              {
                locala = (a)((ArrayList)localObject1).get(i);
                if (locala != null) {
                  localb.b(locala.getKey(), locala);
                }
                for (;;)
                {
                  i += 1;
                  break;
                  w.e("MicroMsg.CursorDataWindow", "newcursor obj is null");
                }
              }
            }
            localb.vDQ.clear();
          }
          locala = (a)localb.vDP.get(localObject2);
          localObject1 = locala;
          if (locala == null)
          {
            w.e("MicroMsg.CursorDataWindow", "newcursor error obj : " + localObject2 + "pos:" + paramInt);
            localObject1 = locala;
          }
        }
      }
      for (;;)
      {
        GMTrace.o(17550310113280L, 130760);
        return (a)localObject1;
        w.e("MicroMsg.CursorDataWindow", "newcursor cursor getItem error: pos " + paramInt + " loaded num :" + localb.vDN.size());
      }
    }
    GMTrace.o(17550310113280L, 130760);
    return null;
  }
  
  public final void AI(int paramInt)
  {
    GMTrace.i(17547491540992L, 130739);
    if ((paramInt <= 15000) && (paramInt >= 2000)) {
      this.pageSize = paramInt;
    }
    GMTrace.o(17547491540992L, 130739);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(17551786508288L, 130771);
    this.vEb = parama;
    GMTrace.o(17551786508288L, 130771);
  }
  
  public final boolean a(Object paramObject, a parama)
  {
    GMTrace.i(17550444331008L, 130761);
    if ((this.vEc) && (this.vEd != null))
    {
      if ((!this.vEf) && ((paramObject instanceof Object[])) && (this.vEd.bL(paramObject)))
      {
        this.mCount -= ((Object[])paramObject).length;
        this.pageSize -= ((Object[])paramObject).length;
      }
      b localb = this.vEd;
      if (parama != null)
      {
        w.v("MicroMsg.CursorDataWindow", "newcursor cursor update Memory key : " + paramObject + "values : " + parama);
        localb.b(paramObject, parama);
      }
      for (;;)
      {
        GMTrace.o(17550444331008L, 130761);
        return false;
        if ((paramObject instanceof Object[]))
        {
          paramObject = (Object[])paramObject;
          int j = paramObject.length;
          int i = 0;
          while (i < j)
          {
            parama = paramObject[i];
            localb.vDP.remove(parama);
            i += 1;
          }
          localb.r((Object[])paramObject);
        }
        else
        {
          if (localb.vDQ == null) {
            localb.vDQ = new ArrayList();
          }
          if (!localb.vDQ.contains(paramObject))
          {
            localb.vDQ.add(paramObject);
            w.i("MicroMsg.CursorDataWindow", "newcursor cursor clearData : " + paramObject);
          }
          localb.vDP.remove(paramObject);
        }
      }
    }
    if (!this.vEc)
    {
      paramObject = this.vEe;
      ((c)paramObject).mPos = 0;
      ((c)paramObject).vDS.clear();
    }
    GMTrace.o(17550444331008L, 130761);
    return false;
  }
  
  public final boolean bL(Object paramObject)
  {
    GMTrace.i(17550846984192L, 130764);
    if (!this.vEc)
    {
      GMTrace.o(17550846984192L, 130764);
      return false;
    }
    if (this.vEd == null)
    {
      GMTrace.o(17550846984192L, 130764);
      return false;
    }
    boolean bool = this.vEd.bL(paramObject);
    GMTrace.o(17550846984192L, 130764);
    return bool;
  }
  
  public final a bM(Object paramObject)
  {
    GMTrace.i(17550981201920L, 130765);
    if (!this.vEc)
    {
      Log.e("WCDB.SQLiteNewCursor", "newcursor getItemByKey error " + paramObject);
      GMTrace.o(17550981201920L, 130765);
      return null;
    }
    if (this.vEd == null)
    {
      Log.e("WCDB.SQLiteNewCursor", "newcursor error getItemByKey window is null");
      GMTrace.o(17550981201920L, 130765);
      return null;
    }
    b localb = this.vEd;
    if (localb.vDP == null)
    {
      GMTrace.o(17550981201920L, 130765);
      return null;
    }
    paramObject = (a)localb.vDP.get(paramObject);
    GMTrace.o(17550981201920L, 130765);
    return (a)paramObject;
  }
  
  public final SparseArray<Object>[] bVf()
  {
    GMTrace.i(17551920726016L, 130772);
    if (!this.vEc)
    {
      GMTrace.o(17551920726016L, 130772);
      return null;
    }
    SparseArray localSparseArray = this.vEd.vDN;
    GMTrace.o(17551920726016L, 130772);
    return new SparseArray[] { localSparseArray };
  }
  
  public final HashMap bVg()
  {
    GMTrace.i(18785113210880L, 139960);
    HashMap localHashMap = this.vEd.vDP;
    GMTrace.o(18785113210880L, 139960);
    return localHashMap;
  }
  
  public final boolean bVh()
  {
    GMTrace.i(17550578548736L, 130762);
    boolean bool = this.vEf;
    GMTrace.o(17550578548736L, 130762);
    return bool;
  }
  
  protected final void checkPosition()
  {
    GMTrace.i(17548162629632L, 130744);
    super.checkPosition();
    GMTrace.o(17548162629632L, 130744);
  }
  
  public final void close()
  {
    GMTrace.i(17548833718272L, 130749);
    super.close();
    try
    {
      this.vEa.close();
      this.mDriver.cursorClosed();
      GMTrace.o(17548833718272L, 130749);
      return;
    }
    finally {}
  }
  
  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
    GMTrace.i(17551115419648L, 130766);
    GMTrace.o(17551115419648L, 130766);
  }
  
  public final void deactivate()
  {
    GMTrace.i(17548699500544L, 130748);
    super.deactivate();
    this.mDriver.cursorDeactivated();
    GMTrace.o(17548699500544L, 130748);
  }
  
  protected final void finalize()
  {
    GMTrace.i(17549102153728L, 130751);
    try
    {
      if (this.vEd != null) {
        close();
      }
      super.finalize();
      GMTrace.o(17549102153728L, 130751);
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public final byte[] getBlob(int paramInt)
  {
    GMTrace.i(17550175895552L, 130759);
    if (!this.vEc)
    {
      byte[] arrayOfByte = this.vEe.getBlob(paramInt);
      GMTrace.o(17550175895552L, 130759);
      return arrayOfByte;
    }
    GMTrace.o(17550175895552L, 130759);
    return null;
  }
  
  public final int getColumnIndex(String paramString)
  {
    GMTrace.i(17548431065088L, 130746);
    if (this.mColumnNameMap == null)
    {
      localObject = this.mColumns;
      int j = localObject.length;
      HashMap localHashMap = new HashMap(j, 1.0F);
      i = 0;
      while (i < j)
      {
        localHashMap.put(localObject[i], Integer.valueOf(i));
        i += 1;
      }
      this.mColumnNameMap = localHashMap;
    }
    int i = paramString.lastIndexOf('.');
    Object localObject = paramString;
    if (i != -1)
    {
      localObject = new Exception();
      Log.e("WCDB.SQLiteNewCursor", "requesting column name with table name -- " + paramString, new Object[] { localObject });
      localObject = paramString.substring(i + 1);
    }
    paramString = (Integer)this.mColumnNameMap.get(localObject);
    if (paramString != null)
    {
      i = paramString.intValue();
      GMTrace.o(17548431065088L, 130746);
      return i;
    }
    GMTrace.o(17548431065088L, 130746);
    return -1;
  }
  
  public final String[] getColumnNames()
  {
    GMTrace.i(17548565282816L, 130747);
    String[] arrayOfString = this.mColumns;
    GMTrace.o(17548565282816L, 130747);
    return arrayOfString;
  }
  
  public final int getCount()
  {
    GMTrace.i(17548028411904L, 130743);
    if (this.mCount == -1)
    {
      this.mCount = AK(0);
      if (this.vEd != null) {
        if ((this.mCount == -1) || (this.mCount != this.vEd.vDN.size())) {
          break label97;
        }
      }
    }
    label97:
    for (boolean bool = true;; bool = false)
    {
      this.vEf = bool;
      if ((!this.vEc) || (!this.vEf)) {
        break label124;
      }
      if (this.vEd != null) {
        break;
      }
      GMTrace.o(17548028411904L, 130743);
      return 0;
    }
    int i = this.vEd.vDN.size();
    GMTrace.o(17548028411904L, 130743);
    return i;
    label124:
    i = this.mCount;
    GMTrace.o(17548028411904L, 130743);
    return i;
  }
  
  public final double getDouble(int paramInt)
  {
    GMTrace.i(17549907460096L, 130757);
    if (!this.vEc)
    {
      double d = this.vEe.getDouble(paramInt);
      GMTrace.o(17549907460096L, 130757);
      return d;
    }
    GMTrace.o(17549907460096L, 130757);
    return 0.0D;
  }
  
  public final float getFloat(int paramInt)
  {
    GMTrace.i(17549773242368L, 130756);
    if (!this.vEc)
    {
      float f = this.vEe.getFloat(paramInt);
      GMTrace.o(17549773242368L, 130756);
      return f;
    }
    GMTrace.o(17549773242368L, 130756);
    return 0.0F;
  }
  
  public final int getInt(int paramInt)
  {
    GMTrace.i(17549504806912L, 130754);
    if (!this.vEc)
    {
      paramInt = this.vEe.getInt(paramInt);
      GMTrace.o(17549504806912L, 130754);
      return paramInt;
    }
    GMTrace.o(17549504806912L, 130754);
    return 0;
  }
  
  public final long getLong(int paramInt)
  {
    GMTrace.i(17549639024640L, 130755);
    if (!this.vEc)
    {
      long l = this.vEe.getLong(paramInt);
      GMTrace.o(17549639024640L, 130755);
      return l;
    }
    GMTrace.o(17549639024640L, 130755);
    return 0L;
  }
  
  public final short getShort(int paramInt)
  {
    GMTrace.i(17549370589184L, 130753);
    if (!this.vEc)
    {
      short s = this.vEe.getShort(paramInt);
      GMTrace.o(17549370589184L, 130753);
      return s;
    }
    GMTrace.o(17549370589184L, 130753);
    return 0;
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(17549236371456L, 130752);
    if (!this.vEc)
    {
      String str = this.vEe.getString(paramInt);
      GMTrace.o(17549236371456L, 130752);
      return str;
    }
    GMTrace.o(17549236371456L, 130752);
    return null;
  }
  
  public final boolean isNull(int paramInt)
  {
    GMTrace.i(17550041677824L, 130758);
    if (!this.vEc)
    {
      boolean bool = this.vEe.isNull(paramInt);
      GMTrace.o(17550041677824L, 130758);
      return bool;
    }
    GMTrace.o(17550041677824L, 130758);
    return false;
  }
  
  public final void kN(boolean paramBoolean)
  {
    GMTrace.i(17547625758720L, 130740);
    this.vEc = paramBoolean;
    GMTrace.o(17547625758720L, 130740);
  }
  
  public final boolean onMove(int paramInt1, int paramInt2)
  {
    GMTrace.i(17547759976448L, 130741);
    if (this.vEc)
    {
      if ((this.vEd == null) || (!this.vEd.AJ(paramInt2))) {
        AK(paramInt2 / this.pageSize * this.pageSize);
      }
      GMTrace.o(17547759976448L, 130741);
      return true;
    }
    if (this.vEe == null) {
      bVn();
    }
    c localc = this.vEe;
    paramInt1 = paramInt2 / localc.vDT;
    if (localc.vDS.indexOfKey(paramInt1) >= 0)
    {
      int i = localc.vDT;
      int j = localc.columnCount;
      if (((Object[])localc.vDS.get(paramInt1))[(paramInt2 % i * j)] == null) {}
    }
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if (paramInt1 == 0) {
        AK(paramInt2 / this.pageSize * this.pageSize);
      }
      this.vEe.moveToPosition(paramInt2);
      break;
    }
  }
  
  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
    GMTrace.i(17551249637376L, 130767);
    GMTrace.o(17551249637376L, 130767);
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    GMTrace.i(17551383855104L, 130768);
    GMTrace.o(17551383855104L, 130768);
  }
  
  public final boolean requery()
  {
    GMTrace.i(17548967936000L, 130750);
    if (isClosed())
    {
      GMTrace.o(17548967936000L, 130750);
      return false;
    }
    try
    {
      if (!this.vEa.getDatabase().isOpen())
      {
        GMTrace.o(17548967936000L, 130750);
        return false;
      }
      if (this.vEd != null) {
        this.vEd.Ty();
      }
      this.mPos = -1;
      this.mCount = -1;
      this.mDriver.cursorRequeried(this);
      boolean bool;
      return false;
    }
    finally
    {
      try
      {
        bool = super.requery();
        GMTrace.o(17548967936000L, 130750);
        return bool;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        Log.w("WCDB.SQLiteNewCursor", "requery() failed " + localIllegalStateException.getMessage(), new Object[] { localIllegalStateException });
        GMTrace.o(17548967936000L, 130750);
      }
      localObject = finally;
    }
  }
  
  public final void unregisterContentObserver(ContentObserver paramContentObserver)
  {
    GMTrace.i(17551518072832L, 130769);
    GMTrace.o(17551518072832L, 130769);
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    GMTrace.i(17551652290560L, 130770);
    GMTrace.o(17551652290560L, 130770);
  }
  
  public static abstract interface a
  {
    public abstract ArrayList<a> ah(ArrayList<Object> paramArrayList);
    
    public abstract a bVm();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bu\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */