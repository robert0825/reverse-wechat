package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.FileEntry;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public final class v
{
  public boolean pMZ;
  
  public v()
  {
    GMTrace.i(8186476101632L, 60994);
    this.pMZ = false;
    GMTrace.o(8186476101632L, 60994);
  }
  
  public static void IQ(String paramString)
  {
    GMTrace.i(8186878754816L, 60997);
    Object localObject = FileOp.A(paramString, false);
    if (localObject == null)
    {
      GMTrace.o(8186878754816L, 60997);
      return;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      SFSContext.FileEntry localFileEntry = (SFSContext.FileEntry)((Iterator)localObject).next();
      if (localFileEntry.name.startsWith("SnsMicroMsg.dberr"))
      {
        w.i("MicroMsg.TrimSnsDb", "find error %s", new Object[] { paramString + localFileEntry.name });
        FileOp.deleteFile(paramString + localFileEntry.name);
      }
    }
    GMTrace.o(8186878754816L, 60997);
  }
  
  public static int a(g paramg1, g paramg2, String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    GMTrace.i(8186744537088L, 60996);
    paramString = paramg1.a(" select sql from sqlite_master where tbl_name=\"" + paramString + "\" and type = \"table\"", null, 0);
    paramg1 = (g)localObject2;
    if (paramString != null)
    {
      paramg1 = (g)localObject1;
      if (paramString.getCount() == 1)
      {
        paramString.moveToFirst();
        paramg1 = paramString.getString(0);
      }
      paramString.close();
    }
    if (paramg1 == null)
    {
      w.w("MicroMsg.TrimSnsDb", "diskDB has not this table !");
      GMTrace.o(8186744537088L, 60996);
      return -1;
    }
    w.i("MicroMsg.TrimSnsDb", "create sql %s", new Object[] { paramg1 });
    boolean bool = paramg2.eZ("", paramg1);
    w.i("MicroMsg.TrimSnsDb", "create result " + bool);
    GMTrace.o(8186744537088L, 60996);
    return 1;
  }
  
  public static boolean a(g paramg1, g paramg2)
  {
    GMTrace.i(8186610319360L, 60995);
    try
    {
      if (bg.nm(paramg1.getKey())) {
        paramg2.eZ("", "ATTACH DATABASE '" + paramg1.getPath() + "' AS old ");
      }
      for (;;)
      {
        w.i("MicroMsg.TrimSnsDb", "ATTACH DATABASE " + paramg1.getKey());
        GMTrace.o(8186610319360L, 60995);
        return true;
        paramg2.eZ("", "ATTACH DATABASE '" + paramg1.getPath() + "' AS old KEY '" + paramg1.getKey() + "'");
      }
      return false;
    }
    catch (Exception paramg1)
    {
      w.e("MicroMsg.TrimSnsDb", "ERROR : attach disk db [%s] , will do again !", new Object[] { paramg1.getMessage() });
      w.printErrStackTrace("MicroMsg.TrimSnsDb", paramg1, "", new Object[0]);
      GMTrace.o(8186610319360L, 60995);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */