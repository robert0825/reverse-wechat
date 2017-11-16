package com.tencent.recovery.model;

import android.os.Parcelable;

public abstract class RecoveryPersistentItem
  implements Parcelable
{
  public abstract boolean XM(String paramString);
  
  public abstract String cnl();
  
  public String toString()
  {
    return cnl();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\model\RecoveryPersistentItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */