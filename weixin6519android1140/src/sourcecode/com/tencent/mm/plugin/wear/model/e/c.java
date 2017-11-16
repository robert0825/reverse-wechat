package com.tencent.mm.plugin.wear.model.e;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.protocal.c.brq;
import com.tencent.mm.protocal.c.brw;
import com.tencent.mm.protocal.c.brx;
import com.tencent.mm.protocal.c.bst;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends a
{
  public c()
  {
    GMTrace.i(9203175391232L, 68569);
    GMTrace.o(9203175391232L, 68569);
  }
  
  public final List<Integer> bBA()
  {
    GMTrace.i(9203309608960L, 68570);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11008));
    localArrayList.add(Integer.valueOf(11009));
    GMTrace.o(9203309608960L, 68570);
    return localArrayList;
  }
  
  protected final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    int i = 5;
    GMTrace.i(9203443826688L, 68571);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    brq localbrq;
    if (paramInt == 11008)
    {
      com.tencent.mm.plugin.wear.model.c.a.xi(6);
      localObject1 = new bst();
      for (;;)
      {
        try
        {
          ((bst)localObject1).aD(paramArrayOfByte);
          paramArrayOfByte = new LinkedList();
          paramArrayOfByte.addAll(s.cgI());
          paramArrayOfByte.addAll(s.cgJ());
          at.AR();
          paramArrayOfByte = com.tencent.mm.y.c.yP().k(paramArrayOfByte, ((bst)localObject1).tWu);
          if (((bst)localObject1).tWu == 0)
          {
            paramInt = i;
            localObject2 = new bsu();
            ((bsu)localObject2).tWu = ((bst)localObject1).tWu;
            if ((paramArrayOfByte != null) && (paramArrayOfByte.moveToNext()))
            {
              localObject3 = paramArrayOfByte.getString(paramArrayOfByte.getColumnIndex("username"));
              at.AR();
              localObject3 = com.tencent.mm.y.c.yK().TE((String)localObject3);
              ((bsu)localObject2).tWu += 1;
              if ((((x)localObject3).bSA()) || (((x)localObject3).uZ())) {
                continue;
              }
              localbrq = new brq();
              localbrq.jio = r.c((x)localObject3);
              localbrq.jhi = ((af)localObject3).field_username;
              ((bsu)localObject2).uql.add(localbrq);
              if (((bsu)localObject2).uql.size() < paramInt) {
                continue;
              }
              ((bsu)localObject2).vbm = paramArrayOfByte.moveToNext();
            }
            w.d("MicroMsg.Wear.HttpContactServer", "request offset: %d | return offset: %d | return size: %d", new Object[] { Integer.valueOf(((bst)localObject1).tWu), Integer.valueOf(((bsu)localObject2).tWu), Integer.valueOf(((bsu)localObject2).uql.size()) });
            if (paramArrayOfByte != null) {
              paramArrayOfByte.close();
            }
          }
          paramInt = 20;
        }
        catch (IOException paramArrayOfByte)
        {
          try
          {
            paramArrayOfByte = ((bsu)localObject2).toByteArray();
            GMTrace.o(9203443826688L, 68571);
            return paramArrayOfByte;
          }
          catch (IOException paramArrayOfByte)
          {
            GMTrace.o(9203443826688L, 68571);
            return null;
          }
          paramArrayOfByte = paramArrayOfByte;
          w.printErrStackTrace("MicroMsg.Wear.HttpContactServer", paramArrayOfByte, "", new Object[0]);
          GMTrace.o(9203443826688L, 68571);
          return null;
        }
      }
    }
    if (paramInt == 11009)
    {
      com.tencent.mm.plugin.wear.model.c.a.xi(7);
      localObject1 = new brw();
      do
      {
        try
        {
          ((brw)localObject1).aD(paramArrayOfByte);
          paramArrayOfByte = new brx();
          at.AR();
          localObject2 = com.tencent.mm.y.c.yK().cq(null);
          paramInt = ((brw)localObject1).tWu;
          for (;;)
          {
            if ((localObject2 == null) || (!((Cursor)localObject2).moveToNext())) {
              break label552;
            }
            if (paramInt <= 0) {
              break;
            }
            paramInt -= 1;
          }
          localObject3 = ((Cursor)localObject2).getString(0);
        }
        catch (IOException paramArrayOfByte)
        {
          w.printErrStackTrace("MicroMsg.Wear.HttpContactServer", paramArrayOfByte, "", new Object[0]);
          GMTrace.o(9203443826688L, 68571);
          return null;
        }
        at.AR();
        localObject3 = com.tencent.mm.y.c.yK().TE((String)localObject3);
        localbrq = new brq();
        localbrq.jio = r.c((x)localObject3);
        localbrq.jhi = ((af)localObject3).field_username;
        paramArrayOfByte.uql.add(localbrq);
      } while (paramArrayOfByte.uql.size() < 5);
      paramArrayOfByte.vbm = ((Cursor)localObject2).moveToNext();
      label552:
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
      paramArrayOfByte.tWu = (((brw)localObject1).tWu + paramArrayOfByte.uql.size());
      try
      {
        paramArrayOfByte = paramArrayOfByte.toByteArray();
        GMTrace.o(9203443826688L, 68571);
        return paramArrayOfByte;
      }
      catch (IOException paramArrayOfByte)
      {
        w.printErrStackTrace("MicroMsg.Wear.HttpContactServer", paramArrayOfByte, "", new Object[0]);
        GMTrace.o(9203443826688L, 68571);
        return null;
      }
    }
    GMTrace.o(9203443826688L, 68571);
    return null;
  }
  
  protected final boolean xj(int paramInt)
  {
    GMTrace.i(9203712262144L, 68573);
    if (paramInt == 11008)
    {
      GMTrace.o(9203712262144L, 68573);
      return true;
    }
    if (paramInt == 11009)
    {
      GMTrace.o(9203712262144L, 68573);
      return true;
    }
    boolean bool = super.xj(paramInt);
    GMTrace.o(9203712262144L, 68573);
    return bool;
  }
  
  protected final boolean xk(int paramInt)
  {
    GMTrace.i(9203578044416L, 68572);
    if (paramInt == 11008)
    {
      GMTrace.o(9203578044416L, 68572);
      return true;
    }
    if (paramInt == 11009)
    {
      GMTrace.o(9203578044416L, 68572);
      return true;
    }
    boolean bool = super.xk(paramInt);
    GMTrace.o(9203578044416L, 68572);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */