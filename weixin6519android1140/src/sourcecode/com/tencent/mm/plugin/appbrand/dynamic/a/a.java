package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class a
  implements c
{
  private Map<Object, Set<View>> hSW;
  
  public a()
  {
    GMTrace.i(17737946497024L, 132158);
    this.hSW = new HashMap();
    GMTrace.o(17737946497024L, 132158);
  }
  
  public final Map<Object, Set<View>> CF()
  {
    GMTrace.i(17738617585664L, 132163);
    Map localMap = this.hSW;
    GMTrace.o(17738617585664L, 132163);
    return localMap;
  }
  
  public final Set<View> aC(Object paramObject)
  {
    GMTrace.i(17738349150208L, 132161);
    if (paramObject == null)
    {
      GMTrace.o(17738349150208L, 132161);
      return null;
    }
    paramObject = (Set)this.hSW.get(paramObject);
    GMTrace.o(17738349150208L, 132161);
    return (Set<View>)paramObject;
  }
  
  public final Set<View> aD(Object paramObject)
  {
    GMTrace.i(17738483367936L, 132162);
    if (paramObject == null)
    {
      GMTrace.o(17738483367936L, 132162);
      return null;
    }
    paramObject = (Set)this.hSW.remove(paramObject);
    GMTrace.o(17738483367936L, 132162);
    return (Set<View>)paramObject;
  }
  
  public final boolean g(Object paramObject, View paramView)
  {
    GMTrace.i(17738080714752L, 132159);
    if ((paramObject == null) || (paramView == null))
    {
      GMTrace.o(17738080714752L, 132159);
      return false;
    }
    Set localSet = (Set)this.hSW.get(paramObject);
    Object localObject = localSet;
    if (localSet == null)
    {
      localObject = new HashSet();
      this.hSW.put(paramObject, localObject);
    }
    boolean bool = ((Set)localObject).add(paramView);
    GMTrace.o(17738080714752L, 132159);
    return bool;
  }
  
  public final boolean h(Object paramObject, View paramView)
  {
    GMTrace.i(17738214932480L, 132160);
    if ((paramObject == null) || (paramView == null))
    {
      GMTrace.o(17738214932480L, 132160);
      return false;
    }
    paramObject = (Set)this.hSW.get(paramObject);
    if (paramObject != null)
    {
      boolean bool = ((Set)paramObject).remove(paramView);
      GMTrace.o(17738214932480L, 132160);
      return bool;
    }
    GMTrace.o(17738214932480L, 132160);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */