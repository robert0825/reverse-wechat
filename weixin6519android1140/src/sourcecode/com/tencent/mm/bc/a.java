package com.tencent.mm.bc;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public final class a
{
  public static ArrayList<au> b(long[] paramArrayOfLong)
  {
    GMTrace.i(1410628321280L, 10510);
    ArrayList localArrayList = new ArrayList();
    if (paramArrayOfLong != null)
    {
      int i = 0;
      while (i < paramArrayOfLong.length)
      {
        at.AR();
        localArrayList.add(com.tencent.mm.y.c.yM().cM(paramArrayOfLong[i]));
        i += 1;
      }
    }
    GMTrace.o(1410628321280L, 10510);
    return localArrayList;
  }
  
  public static ArrayList<String> lH(String paramString)
  {
    GMTrace.i(1410091450368L, 10506);
    ArrayList localArrayList = new ArrayList();
    paramString = l.MM().L(paramString, 10);
    if (paramString != null)
    {
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        localArrayList.add(paramString[i].field_sayhicontent);
        i += 1;
      }
    }
    w.d("MicroMsg.ExposeDataLogic", "get lbs sayhi msg content");
    GMTrace.o(1410091450368L, 10506);
    return localArrayList;
  }
  
  public static ArrayList<String> lI(String paramString)
  {
    GMTrace.i(1410225668096L, 10507);
    ArrayList localArrayList = new ArrayList();
    paramString = l.MN().M(paramString, 10);
    if (paramString != null)
    {
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        localArrayList.add(paramString[i].field_sayhicontent);
        i += 1;
      }
    }
    w.d("MicroMsg.ExposeDataLogic", "get shake sayhi msg content");
    GMTrace.o(1410225668096L, 10507);
    return localArrayList;
  }
  
  public static ArrayList<String> lJ(String paramString)
  {
    GMTrace.i(1410359885824L, 10508);
    ArrayList localArrayList = new ArrayList();
    at.AR();
    paramString = com.tencent.mm.y.c.yM().Cj(paramString);
    int i;
    if ((paramString != null) && (paramString.getCount() != 0)) {
      if (paramString.moveToFirst())
      {
        i = 0;
        if (!paramString.isAfterLast())
        {
          au localau = new au();
          localau.b(paramString);
          paramString.moveToNext();
          if (!localau.bTF()) {
            break label133;
          }
          localArrayList.add(localau.field_content);
        }
      }
    }
    for (;;)
    {
      int j = i + 1;
      i = j;
      if (j != 10) {
        break;
      }
      paramString.close();
      GMTrace.o(1410359885824L, 10508);
      return localArrayList;
      label133:
      localArrayList.add("");
    }
  }
  
  public static ArrayList<String> s(int paramInt, String paramString)
  {
    GMTrace.i(1410494103552L, 10509);
    ArrayList localArrayList = new ArrayList();
    paramString = l.MK().K(paramString, 10);
    if (paramString != null)
    {
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramString[i];
        if (((f)localObject).field_type == 1) {
          localArrayList.add(bg.nl(au.d.Uk(((f)localObject).field_msgContent).content));
        }
        i += 1;
      }
    }
    w.d("MicroMsg.ExposeDataLogic", "getFMessageContent,scene:%d", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(1410494103552L, 10509);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bc\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */