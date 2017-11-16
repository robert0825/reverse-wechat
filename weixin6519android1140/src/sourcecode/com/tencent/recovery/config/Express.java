package com.tencent.recovery.config;

import com.tencent.recovery.model.RecoveryStatusItem;
import com.tencent.recovery.util.AttributeUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Express
{
  public List<List<ExpressItem>> xPv = new ArrayList();
  
  public final void df(List<ExpressItem> paramList)
  {
    this.xPv.add(paramList);
  }
  
  public final boolean dg(List<RecoveryStatusItem> paramList)
  {
    boolean bool2 = false;
    Iterator localIterator1 = this.xPv.iterator();
    for (;;)
    {
      boolean bool1 = bool2;
      if (localIterator1.hasNext())
      {
        Iterator localIterator2 = ((List)localIterator1.next()).iterator();
        ExpressItem localExpressItem;
        do
        {
          if (!localIterator2.hasNext()) {
            break;
          }
          localExpressItem = (ExpressItem)localIterator2.next();
          Iterator localIterator3 = paramList.iterator();
          i = 0;
          while (localIterator3.hasNext())
          {
            RecoveryStatusItem localRecoveryStatusItem = (RecoveryStatusItem)localIterator3.next();
            if ((AttributeUtil.ew(localExpressItem.xPu, localRecoveryStatusItem.xPu)) && (AttributeUtil.ew(localExpressItem.xPw, localRecoveryStatusItem.xPw)) && (AttributeUtil.ew(localExpressItem.xPx, localRecoveryStatusItem.xPx))) {
              i += 1;
            }
          }
        } while (localExpressItem.count <= i);
      }
      for (int i = 0; i != 0; i = 1)
      {
        bool1 = true;
        return bool1;
      }
    }
  }
  
  public String toString()
  {
    return this.xPv.toString();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\config\Express.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */