package com.tencent.d.b.b;

import android.content.SharedPreferences;
import android.util.SparseArray;

public class a
{
  private static a yas = null;
  private boolean eCk = false;
  private boolean isInit = false;
  private SparseArray<String> yat = new SparseArray(10);
  public SharedPreferences yau = null;
  
  public static a cpH()
  {
    if (yas == null) {
      try
      {
        if (yas == null) {
          yas = new a();
        }
        a locala = yas;
        return locala;
      }
      finally {}
    }
    return yas;
  }
  
  public final boolean cpG()
  {
    try
    {
      boolean bool = this.eCk;
      return bool;
    }
    finally {}
  }
  
  public final void cpI()
  {
    try
    {
      this.isInit = true;
      return;
    }
    finally {}
  }
  
  public final SparseArray<String> cpJ()
  {
    try
    {
      SparseArray localSparseArray = this.yat;
      return localSparseArray;
    }
    finally {}
  }
  
  public final SharedPreferences cpK()
  {
    try
    {
      SharedPreferences localSharedPreferences = this.yau;
      return localSharedPreferences;
    }
    finally {}
  }
  
  public final boolean isInit()
  {
    try
    {
      boolean bool = this.isInit;
      return bool;
    }
    finally {}
  }
  
  public final void nb(boolean paramBoolean)
  {
    try
    {
      this.eCk = paramBoolean;
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\b\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */