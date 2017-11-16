package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.bu.g;
import com.tencent.mm.protocal.c.aks;
import com.tencent.mm.protocal.c.bff;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class p
  extends i<o>
{
  public static final String[] fTX;
  public g goN;
  
  static
  {
    GMTrace.i(8310895935488L, 61921);
    fTX = new String[] { i.a(o.fTp, "SnsReportKv") };
    GMTrace.o(8310895935488L, 61921);
  }
  
  public p(g paramg)
  {
    super(paramg, o.fTp, "SnsReportKv", o.eZt);
    GMTrace.i(8310359064576L, 61917);
    this.goN = paramg;
    GMTrace.o(8310359064576L, 61917);
  }
  
  private int a(bff parambff, int paramInt)
  {
    GMTrace.i(8310627500032L, 61919);
    try
    {
      parambff = parambff.toByteArray();
      o localo = new o();
      localo.field_value = parambff;
      localo.field_logtime = System.currentTimeMillis();
      localo.field_logsize = paramInt;
      localo.field_offset = 0;
      parambff = localo.qL();
      paramInt = (int)this.goN.insert("SnsReportKv", "", parambff);
      w.d("MicroMsg.SnsKvReportStg", "SnsKvReport Insert result " + paramInt);
      GMTrace.o(8310627500032L, 61919);
      return paramInt;
    }
    catch (Exception parambff)
    {
      GMTrace.o(8310627500032L, 61919);
    }
    return 0;
  }
  
  public final int a(bff parambff)
  {
    GMTrace.i(8310493282304L, 61918);
    bff localbff = new bff();
    int k = 0;
    int i = 0;
    int j = 0;
    if (k < parambff.tPB.size())
    {
      aks localaks = (aks)parambff.tPB.get(k);
      if (localaks.uzN.tJp.length + j > 51200)
      {
        a(localbff, j);
        i += 1;
        localbff.tPB.clear();
        j = 0;
      }
      for (;;)
      {
        k += 1;
        break;
        j += localaks.uzN.tJp.length;
        localbff.tPB.add(localaks);
      }
    }
    k = i;
    if (localbff.tPB.size() > 0)
    {
      k = i + 1;
      a(localbff, j);
    }
    GMTrace.o(8310493282304L, 61918);
    return k;
  }
  
  public final bff db(int paramInt1, int paramInt2)
  {
    GMTrace.i(8310761717760L, 61920);
    Object localObject = "select rowid, *  from SnsReportKv";
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramInt2 > 0) {
      localObject = "select rowid, *  from SnsReportKv" + " where rowid <= " + paramInt2;
    }
    Cursor localCursor = this.goN.a((String)localObject, null, 0);
    bff localbff = new bff();
    i = 0;
    ArrayList localArrayList = new ArrayList();
    localStringBuffer.append("target size " + paramInt1 + " current maxcolid " + paramInt2);
    if (localCursor.moveToFirst()) {
      paramInt2 = i;
    }
    for (;;)
    {
      o localo = new o();
      localo.b(localCursor);
      i = localo.field_offset;
      localStringBuffer.append("|offset: " + i);
      localObject = new bff();
      for (;;)
      {
        try
        {
          ((bff)localObject).aD(localo.field_value);
        }
        catch (Exception localException2)
        {
          aks localaks;
          continue;
          i = 0;
          continue;
          i = 1;
          continue;
        }
        try
        {
          if (i >= ((bff)localObject).tPB.size()) {
            continue;
          }
          localaks = (aks)((bff)localObject).tPB.get(i);
          if (localaks.uzN.tJp.length + paramInt2 > paramInt1)
          {
            if (paramInt2 != 0) {
              continue;
            }
            localArrayList.add(Integer.valueOf(localo.pMe));
            w.i("MicroMsg.SnsKvReportStg", "error by server for the mini size " + paramInt1 + " vlauesize " + localaks.uzN.tJp.length);
            continue;
            localStringBuffer.append("|read end on " + localo.pMe + " and get size " + paramInt2);
            if ((i != 0) && (localo.field_offset <= ((bff)localObject).tPB.size()))
            {
              a(localo.pMe, localo);
              localStringBuffer.append("|update new offset " + localo.field_offset);
              if (i == 0) {
                continue;
              }
              w.i("MicroMsg.SnsKvReportStg", "read info " + localStringBuffer.toString());
              localCursor.close();
              localObject = localArrayList.iterator();
              if (!((Iterator)localObject).hasNext()) {
                continue;
              }
              delete(((Integer)((Iterator)localObject).next()).intValue());
              continue;
            }
          }
          else
          {
            localo.field_offset = (i + 1);
            localbff.tPB.add(localaks);
            int j = paramInt2 + localaks.uzN.tJp.length;
            i += 1;
            paramInt2 = j;
            continue;
          }
          localStringBuffer.append("|read full ");
          localArrayList.add(Integer.valueOf(localo.pMe));
          continue;
          if (localCursor.moveToNext()) {
            break;
          }
        }
        catch (Exception localException1)
        {
          w.printErrStackTrace("MicroMsg.SnsKvReportStg", localException1, "", new Object[0]);
          localArrayList.add(Integer.valueOf(localo.pMe));
          w.i("MicroMsg.SnsKvReportStg", "error paser then delete " + localo.pMe);
        }
      }
    }
    for (;;)
    {
      break;
    }
    GMTrace.o(8310761717760L, 61920);
    return localbff;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */