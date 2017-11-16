package com.tencent.recovery;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryStatusItem;
import java.util.ArrayList;
import java.util.Iterator;

public final class RecoveryContext
{
  public ArrayList<RecoveryStatusItem> xPs = new ArrayList();
  
  protected final void a(SharedPreferences.Editor paramEditor)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.xPs.iterator();
    while (localIterator.hasNext())
    {
      localStringBuffer.append(((RecoveryStatusItem)localIterator.next()).cnl());
      localStringBuffer.append(";");
    }
    localStringBuffer.trimToSize();
    if (localStringBuffer.length() > 0) {
      paramEditor.putString("KeyHistoryExceptionTypeList", localStringBuffer.toString());
    }
    for (;;)
    {
      RecoveryLog.i("Recovery.RecoveryContext", "RecoveryContext saveToSp %s", new Object[] { toString() });
      return;
      paramEditor.remove("KeyHistoryExceptionTypeList");
    }
  }
  
  protected final void clear()
  {
    RecoveryLog.i("Recovery.RecoveryContext", "clear", new Object[0]);
    this.xPs.clear();
  }
  
  protected final void f(SharedPreferences paramSharedPreferences)
  {
    if (paramSharedPreferences.contains("KeyHistoryExceptionTypeList"))
    {
      paramSharedPreferences = paramSharedPreferences.getString("KeyHistoryExceptionTypeList", "").split(";");
      if ((paramSharedPreferences != null) && (paramSharedPreferences.length > 0))
      {
        int j = paramSharedPreferences.length;
        int i = 0;
        while (i < j)
        {
          String str = paramSharedPreferences[i];
          RecoveryStatusItem localRecoveryStatusItem = new RecoveryStatusItem();
          if (localRecoveryStatusItem.XM(str)) {
            this.xPs.add(localRecoveryStatusItem);
          }
          i += 1;
        }
      }
    }
    RecoveryLog.i("Recovery.RecoveryContext", "RecoveryContext readFromSp %s", new Object[] { toString() });
  }
  
  public final String toString()
  {
    return this.xPs.toString();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\RecoveryContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */