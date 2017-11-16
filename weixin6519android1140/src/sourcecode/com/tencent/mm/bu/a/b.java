package com.tencent.mm.bu.a;

import android.database.sqlite.SQLiteClosable;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class b<T extends a>
  extends SQLiteClosable
{
  int mStartPos;
  SparseArray<Object> vDN;
  int vDO;
  HashMap<Object, T> vDP;
  ArrayList<Object> vDQ;
  T vDR;
  
  public b()
  {
    GMTrace.i(17543733444608L, 130711);
    this.mStartPos = 0;
    this.vDN = new SparseArray();
    this.vDP = new HashMap();
    GMTrace.o(17543733444608L, 130711);
  }
  
  public final boolean AJ(int paramInt)
  {
    GMTrace.i(17543867662336L, 130712);
    if (this.vDN.indexOfKey(paramInt) >= 0)
    {
      GMTrace.o(17543867662336L, 130712);
      return true;
    }
    GMTrace.o(17543867662336L, 130712);
    return false;
  }
  
  public final void Ty()
  {
    GMTrace.i(17544404533248L, 130716);
    w.i("MicroMsg.CursorDataWindow", "clearData");
    this.vDN.clear();
    this.vDP.clear();
    GMTrace.o(17544404533248L, 130716);
  }
  
  public abstract ArrayList<T> ah(ArrayList<Object> paramArrayList);
  
  final void b(Object paramObject, T paramT)
  {
    GMTrace.i(18785515864064L, 139963);
    this.vDP.put(paramObject, paramT);
    GMTrace.o(18785515864064L, 139963);
  }
  
  public final boolean bL(Object paramObject)
  {
    GMTrace.i(17544807186432L, 130719);
    if ((paramObject instanceof Object[]))
    {
      Object[] arrayOfObject = (Object[])paramObject;
      if (arrayOfObject.length == 1)
      {
        if ((this.vDP != null) && (this.vDP.containsKey(arrayOfObject[0])))
        {
          GMTrace.o(17544807186432L, 130719);
          return true;
        }
        GMTrace.o(17544807186432L, 130719);
        return false;
      }
    }
    if ((this.vDP != null) && (this.vDP.containsKey(paramObject)))
    {
      GMTrace.o(17544807186432L, 130719);
      return true;
    }
    GMTrace.o(17544807186432L, 130719);
    return false;
  }
  
  public abstract T bVm();
  
  public final void ef(int paramInt1, int paramInt2)
  {
    GMTrace.i(17544001880064L, 130713);
    if (paramInt2 != 0)
    {
      w.e("MicroMsg.CursorDataWindow", "newcursor rowEnd with error %d rowNum : %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      this.vDN.remove(paramInt1);
      GMTrace.o(17544001880064L, 130713);
      return;
    }
    if (this.vDR != null)
    {
      Object localObject = this.vDR.getKey();
      b(localObject, this.vDR);
      this.vDN.put(paramInt1, localObject);
    }
    GMTrace.o(17544001880064L, 130713);
  }
  
  protected void onAllReferencesReleased()
  {
    GMTrace.i(17544538750976L, 130717);
    Ty();
    GMTrace.o(17544538750976L, 130717);
  }
  
  final void r(Object[] paramArrayOfObject)
  {
    GMTrace.i(17544672968704L, 130718);
    SparseArray localSparseArray = new SparseArray();
    int i = 0;
    int j = 0;
    if (i < this.vDN.size())
    {
      int i2 = this.vDN.keyAt(i);
      Object localObject = this.vDN.valueAt(i);
      int i1 = 1;
      int i3 = paramArrayOfObject.length;
      int n = 0;
      label62:
      int k = j;
      int m = i1;
      if (n < i3)
      {
        if (paramArrayOfObject[n].equals(localObject))
        {
          k = j + 1;
          m = 0;
        }
      }
      else
      {
        if (m == 0) {
          break label132;
        }
        localSparseArray.put(i2 - k, localObject);
      }
      for (;;)
      {
        i += 1;
        j = k;
        break;
        n += 1;
        break label62;
        label132:
        w.i("MicroMsg.CursorDataWindow", "newcursor delete index : " + i + " obj : " + localObject);
      }
    }
    if (this.vDN.size() != localSparseArray.size()) {
      w.i("MicroMsg.CursorDataWindow", "newcursor oldposition size :" + this.vDN.size() + " newposistion Size : " + localSparseArray.size());
    }
    this.vDN = localSparseArray;
    GMTrace.o(17544672968704L, 130718);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bu\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */