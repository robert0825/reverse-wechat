package com.tencent.mm.bu.a;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

public abstract class g<K, T extends a>
{
  public d vEh;
  
  public g(d paramd, int paramInt)
  {
    GMTrace.i(17552189161472L, 130774);
    this.vEh = paramd;
    this.vEh.kN(true);
    this.vEh.a(new f.a()
    {
      public final ArrayList<a> ah(ArrayList<Object> paramAnonymousArrayList)
      {
        GMTrace.i(17537962082304L, 130668);
        paramAnonymousArrayList = g.this.ah(paramAnonymousArrayList);
        GMTrace.o(17537962082304L, 130668);
        return paramAnonymousArrayList;
      }
      
      public final a bVm()
      {
        GMTrace.i(17537827864576L, 130667);
        a locala = g.this.bVo();
        GMTrace.o(17537827864576L, 130667);
        return locala;
      }
    });
    if (paramInt != 0) {
      this.vEh.AI(paramInt);
    }
    getCount();
    GMTrace.o(17552189161472L, 130774);
  }
  
  public abstract ArrayList<T> ah(ArrayList<Object> paramArrayList);
  
  public final boolean bL(Object paramObject)
  {
    GMTrace.i(17553397121024L, 130783);
    boolean bool = this.vEh.bL(paramObject);
    GMTrace.o(17553397121024L, 130783);
    return bool;
  }
  
  public final SparseArray<K>[] bVf()
  {
    GMTrace.i(17553262903296L, 130782);
    SparseArray[] arrayOfSparseArray = this.vEh.bVf();
    GMTrace.o(17553262903296L, 130782);
    return arrayOfSparseArray;
  }
  
  public final boolean bVh()
  {
    GMTrace.i(17552994467840L, 130780);
    boolean bool = this.vEh.bVh();
    GMTrace.o(17552994467840L, 130780);
    return bool;
  }
  
  public abstract T bVo();
  
  public final void c(Object paramObject, T paramT)
  {
    GMTrace.i(17553128685568L, 130781);
    this.vEh.a(paramObject, paramT);
    GMTrace.o(17553128685568L, 130781);
  }
  
  public final void close()
  {
    GMTrace.i(17552323379200L, 130775);
    this.vEh.close();
    this.vEh = null;
    GMTrace.o(17552323379200L, 130775);
  }
  
  public final int getCount()
  {
    GMTrace.i(17552726032384L, 130778);
    int i = this.vEh.getCount();
    GMTrace.o(17552726032384L, 130778);
    return i;
  }
  
  public final boolean isClosed()
  {
    GMTrace.i(17552860250112L, 130779);
    boolean bool = this.vEh.isClosed();
    GMTrace.o(17552860250112L, 130779);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bu\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */