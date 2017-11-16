package com.tencent.mm.plugin.shake.ui;

import android.database.Cursor;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.shake.b.f;
import com.tencent.mm.plugin.shake.b.g;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e
{
  public static void a(ImageView paramImageView, String paramString, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(6586735001600L, 49075);
    if (paramImageView == null)
    {
      GMTrace.o(6586735001600L, 49075);
      return;
    }
    paramImageView.setImageBitmap(null);
    if (!bg.nm(paramString))
    {
      Object localObject = new c.a();
      ((c.a)localObject).gKE = m.km(paramString);
      ((c.a)localObject).gKC = true;
      ((c.a)localObject).gKY = true;
      ((c.a)localObject).gKZ = paramBoolean;
      if (paramInt != 0) {
        ((c.a)localObject).gKV = paramInt;
      }
      localObject = ((c.a)localObject).Jn();
      n.Jd().a(paramString, paramImageView, (c)localObject);
    }
    GMTrace.o(6586735001600L, 49075);
  }
  
  public static String bgf()
  {
    GMTrace.i(6586869219328L, 49076);
    Object localObject2 = m.bfl();
    Object localObject1 = new ArrayList();
    Object localObject3 = "SELECT * FROM " + ((g)localObject2).getTableName() + " where status != 1";
    localObject2 = ((g)localObject2).fTZ.a((String)localObject3, null, 2);
    if (localObject2 != null)
    {
      while (((Cursor)localObject2).moveToNext())
      {
        localObject3 = new f();
        ((f)localObject3).b((Cursor)localObject2);
        ((List)localObject1).add(localObject3);
      }
      ((Cursor)localObject2).close();
    }
    localObject2 = new StringBuilder();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      ((StringBuilder)localObject2).append(((f)((Iterator)localObject1).next()).field_reserved1);
      ((StringBuilder)localObject2).append("|");
    }
    localObject1 = ((StringBuilder)localObject2).toString();
    GMTrace.o(6586869219328L, 49076);
    return (String)localObject1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */