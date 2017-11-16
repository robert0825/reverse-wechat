package com.tencent.e.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public HashMap<String, Object> yjR = new HashMap();
  public Object yjS = new Object();
  c yjT;
  
  public final void a(d paramd, String[] paramArrayOfString)
  {
    if ((paramd == null) || (paramArrayOfString == null)) {
      return;
    }
    for (;;)
    {
      int i;
      Object localObject2;
      Object localObject3;
      synchronized (this.yjS)
      {
        int j = paramArrayOfString.length;
        i = 0;
        if (i >= j) {
          break label178;
        }
        localObject2 = paramArrayOfString[i];
        if (localObject2 == null) {
          break label182;
        }
        localObject3 = this.yjR.get(localObject2);
        if (localObject3 == null)
        {
          this.yjR.put(localObject2, paramd);
          break label182;
        }
        if (!(localObject3 instanceof d)) {
          break label140;
        }
        localObject3 = (d)localObject3;
        if (localObject3 == paramd) {
          return;
        }
      }
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(localObject3);
      localLinkedList.add(paramd);
      this.yjR.put(localObject2, localLinkedList);
      break label182;
      label140:
      if ((localObject3 instanceof List))
      {
        localObject2 = (LinkedList)localObject3;
        if (((LinkedList)localObject2).indexOf(paramd) >= 0) {
          return;
        }
        ((LinkedList)localObject2).add(paramd);
        break label182;
        label178:
        return;
      }
      label182:
      i += 1;
    }
  }
  
  public final void b(String arg1, int paramInt, Object paramObject)
  {
    Object localObject2 = null;
    Object localObject3 = this.yjT;
    Object localObject1 = ((com.tencent.e.d)localObject3).cqX();
    if (localObject1 == null)
    {
      localObject1 = ((com.tencent.e.d)localObject3).cqW();
      localObject1 = (e)localObject1;
      ((e)localObject1).eNB = ???;
      ((e)localObject1).yjV = paramInt;
      ((e)localObject1).arg1 = 0;
      ((e)localObject1).arg2 = 0;
      ((e)localObject1).obj = paramObject;
      if ((localObject1 != null) && (((e)localObject1).eNB != null))
      {
        System.currentTimeMillis();
        localObject3 = ((e)localObject1).eNB;
      }
    }
    else
    {
      for (;;)
      {
        synchronized (this.yjS)
        {
          ??? = this.yjR.get(localObject3);
          if (??? == null) {
            break label283;
          }
          if ((??? instanceof d))
          {
            ??? = (d)???;
            paramObject = localObject2;
            if (??? != null) {
              ???.ds((String)localObject3, ((e)localObject1).yjV);
            }
            if (paramObject == null) {
              break label228;
            }
            ??? = ((LinkedList)paramObject).iterator();
            if (!???.hasNext()) {
              break label228;
            }
            ((d)???.next()).ds((String)localObject3, ((e)localObject1).yjV);
            continue;
            ((com.tencent.e.e)localObject1).reset();
            break;
          }
          if (!(??? instanceof List)) {
            break label283;
          }
          paramObject = (LinkedList)((LinkedList)???).clone();
          ??? = null;
        }
        label228:
        paramObject = this.yjT;
        synchronized (((com.tencent.e.d)paramObject).mLock)
        {
          paramInt = ((com.tencent.e.d)paramObject).yjD.length;
          if (((com.tencent.e.d)paramObject).oSX < paramInt)
          {
            ((com.tencent.e.d)paramObject).yjD[paramObject.oSX] = localObject1;
            ((com.tencent.e.d)paramObject).oSX += 1;
          }
          return;
        }
        label283:
        ??? = null;
        paramObject = localObject2;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\e\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */