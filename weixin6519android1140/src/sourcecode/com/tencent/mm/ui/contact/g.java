package com.tencent.mm.ui.contact;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.List;

public final class g
{
  private static final boolean Jh(String paramString)
  {
    GMTrace.i(1764023599104L, 13143);
    String[] arrayOfString = s.gmD;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      if (paramString.equals(arrayOfString[i]))
      {
        GMTrace.o(1764023599104L, 13143);
        return false;
      }
      i += 1;
    }
    if (s.eb(paramString))
    {
      GMTrace.o(1764023599104L, 13143);
      return false;
    }
    if (s.fD(paramString))
    {
      GMTrace.o(1764023599104L, 13143);
      return false;
    }
    GMTrace.o(1764023599104L, 13143);
    return true;
  }
  
  static final List<String> cT(List<String> paramList)
  {
    GMTrace.i(1763889381376L, 13142);
    ArrayList localArrayList = new ArrayList();
    paramList = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().b(s.gmw, paramList, true, null);
    if (paramList.moveToFirst())
    {
      int i = 0;
      do
      {
        ae localae = new ae();
        localae.b(paramList);
        int j = i;
        if (Jh(localae.field_username))
        {
          localArrayList.add(localae.field_username);
          j = i + 1;
          if (j >= 4) {
            break;
          }
        }
        i = j;
      } while (paramList.moveToNext());
    }
    paramList.close();
    GMTrace.o(1763889381376L, 13142);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */