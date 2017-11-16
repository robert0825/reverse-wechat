package com.tencent.mm.y;

import android.database.Cursor;
import android.database.MergeCursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bl
{
  private e fTZ;
  private ar goW;
  
  public bl(e parame, ar paramar)
  {
    GMTrace.i(618206855168L, 4606);
    this.fTZ = parame;
    this.goW = paramar;
    GMTrace.o(618206855168L, 4606);
  }
  
  private static String a(String paramString, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, ArrayList<String> paramArrayList3)
  {
    GMTrace.i(619012161536L, 4612);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(" and (username in (");
    localStringBuffer.append("select chatroomname from chatroom where ");
    if ((paramArrayList2 != null) && (paramArrayList2.size() != 0))
    {
      paramArrayList2 = paramArrayList2.iterator();
      while (paramArrayList2.hasNext())
      {
        String str = (String)paramArrayList2.next();
        localStringBuffer.append("chatroomname != '" + str + "' and ");
      }
    }
    localStringBuffer.append("(memberlist like '%" + paramString + "%'");
    paramString = paramArrayList1.iterator();
    while (paramString.hasNext())
    {
      paramArrayList1 = (String)paramString.next();
      localStringBuffer.append(" or memberlist like '%" + paramArrayList1 + "%'");
    }
    if ((paramArrayList3 != null) && (paramArrayList3.size() != 0))
    {
      paramString = paramArrayList3.iterator();
      while (paramString.hasNext())
      {
        paramArrayList1 = (String)paramString.next();
        localStringBuffer.append(" or chatroomname = '" + paramArrayList1 + "'");
      }
    }
    localStringBuffer.append(")))");
    paramString = localStringBuffer.toString();
    GMTrace.o(619012161536L, 4612);
    return paramString;
  }
  
  public final Cursor a(String paramString1, String paramString2, String paramString3, List<String> paramList1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, List<String> paramList2)
  {
    GMTrace.i(618743726080L, 4610);
    paramString3 = "select * ,rowid from rcontact ";
    if (paramInt == 2) {
      paramString3 = "select 2, *,rowid from rcontact ";
    }
    paramString2 = paramString3 + this.goW.d(paramString2, null, paramList1) + this.goW.TL(paramString1) + this.goW.Fj();
    w.v("Micro.SimpleSearchConversationModel", paramString2);
    paramString2 = this.fTZ.rawQuery(paramString2, null);
    ArrayList localArrayList;
    if (paramBoolean3)
    {
      paramString3 = new ArrayList();
      localArrayList = new ArrayList();
      while (paramString2.moveToNext())
      {
        String str = paramString2.getString(paramString2.getColumnIndex("username"));
        if (!str.endsWith("@chatroom")) {
          paramString3.add(str);
        } else {
          localArrayList.add(str);
        }
      }
      if ((paramList2 != null) && (paramList2.size() != 0)) {
        paramString3.addAll(paramList2);
      }
      if (paramString3.size() == 0) {}
    }
    for (paramString1 = new MergeCursor(new Cursor[] { paramString2, a(paramString1, paramString3, localArrayList, null, paramList1) });; paramString1 = paramString2)
    {
      GMTrace.o(618743726080L, 4610);
      return paramString1;
    }
  }
  
  public final Cursor a(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2)
  {
    GMTrace.i(618475290624L, 4608);
    paramString1 = a(paramString1, paramString2, null, paramList1, false, true, true, 2, paramList2);
    GMTrace.o(618475290624L, 4608);
    return paramString1;
  }
  
  public final Cursor a(String paramString1, String paramString2, List<String> paramList, boolean paramBoolean)
  {
    GMTrace.i(618341072896L, 4607);
    paramString1 = a(paramString1, paramString2, null, paramList, false, false, paramBoolean, 1, null);
    GMTrace.o(618341072896L, 4607);
    return paramString1;
  }
  
  public final Cursor a(String paramString, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, ArrayList<String> paramArrayList3, List<String> paramList)
  {
    GMTrace.i(618877943808L, 4611);
    paramString = "select * ,rowid from rcontact " + this.goW.d("@all.contact.android", "", paramList) + a(paramString, paramArrayList1, paramArrayList2, paramArrayList3) + this.goW.Fj();
    w.v("Micro.SimpleSearchConversationModel", "roomsSql " + paramString);
    paramString = this.fTZ.rawQuery(paramString, null);
    GMTrace.o(618877943808L, 4611);
    return paramString;
  }
  
  public final Cursor b(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2)
  {
    GMTrace.i(618609508352L, 4609);
    paramString1 = a(paramString1, paramString2, null, paramList1, false, false, true, 2, paramList2);
    GMTrace.o(618609508352L, 4609);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */