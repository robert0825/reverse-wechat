package com.tencent.mm.ao;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.cache.e;

final class i
  implements e
{
  private f<String, Bitmap> gIk;
  
  i()
  {
    GMTrace.i(3527644545024L, 26283);
    this.gIk = new f(5);
    GMTrace.o(3527644545024L, 26283);
  }
  
  public final Object get(Object paramObject)
  {
    GMTrace.i(3527912980480L, 26285);
    paramObject = this.gIk.get((String)paramObject);
    GMTrace.o(3527912980480L, 26285);
    return paramObject;
  }
  
  public final void o(Object paramObject1, Object paramObject2)
  {
    GMTrace.i(3527778762752L, 26284);
    this.gIk.m((String)paramObject1, (Bitmap)paramObject2);
    GMTrace.o(3527778762752L, 26284);
  }
  
  public final Object remove(Object paramObject)
  {
    GMTrace.i(3528047198208L, 26286);
    this.gIk.remove((String)paramObject);
    GMTrace.o(3528047198208L, 26286);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */