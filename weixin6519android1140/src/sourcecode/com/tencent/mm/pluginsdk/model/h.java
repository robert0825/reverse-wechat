package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

public final class h
{
  public static void a(Context paramContext, final String[] paramArrayOfString, final a parama)
  {
    GMTrace.i(761148735488L, 5671);
    if ((parama == null) || (paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      throw new IllegalArgumentException();
    }
    new AsyncTask() {}.execute(new Void[0]);
    GMTrace.o(761148735488L, 5671);
  }
  
  public static ArrayList<p> g(Cursor paramCursor)
  {
    GMTrace.i(16011235426304L, 119293);
    if (paramCursor == null)
    {
      GMTrace.o(16011235426304L, 119293);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramCursor.moveToFirst();
    while (!paramCursor.isAfterLast())
    {
      int i = paramCursor.getInt(paramCursor.getColumnIndex("_id"));
      String str1 = paramCursor.getString(paramCursor.getColumnIndex("product_id"));
      String str2 = paramCursor.getString(paramCursor.getColumnIndex("full_price"));
      int j = paramCursor.getInt(paramCursor.getColumnIndex("product_state"));
      localArrayList.add(new p(i, str1, str2, paramCursor.getString(paramCursor.getColumnIndex("price_currency")), paramCursor.getString(paramCursor.getColumnIndex("price_amount")), j));
      paramCursor.moveToNext();
    }
    GMTrace.o(16011235426304L, 119293);
    return localArrayList;
  }
  
  public static abstract interface a
  {
    public abstract void x(ArrayList<p> paramArrayList);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */