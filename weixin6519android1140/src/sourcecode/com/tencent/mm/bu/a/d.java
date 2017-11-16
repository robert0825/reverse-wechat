package com.tencent.mm.bu.a;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.HashMap;

public abstract interface d<T>
  extends Cursor
{
  public abstract boolean AG(int paramInt);
  
  public abstract a AH(int paramInt);
  
  public abstract void AI(int paramInt);
  
  public abstract void a(f.a parama);
  
  public abstract boolean a(Object paramObject, a parama);
  
  public abstract boolean bL(Object paramObject);
  
  public abstract a bM(Object paramObject);
  
  public abstract SparseArray<T>[] bVf();
  
  public abstract HashMap<Object, T> bVg();
  
  public abstract boolean bVh();
  
  public abstract void kN(boolean paramBoolean);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bu\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */