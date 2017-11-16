package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class a<T>
  implements b<T>
{
  public final DataHolder aiY;
  
  protected a(DataHolder paramDataHolder)
  {
    this.aiY = paramDataHolder;
    if (this.aiY != null) {
      this.aiY.ajk = this;
    }
  }
  
  public int getCount()
  {
    if (this.aiY == null) {
      return 0;
    }
    return this.aiY.ajj;
  }
  
  public Iterator<T> iterator()
  {
    return new e(this);
  }
  
  public final void release()
  {
    if (this.aiY != null) {
      this.aiY.close();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\data\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */