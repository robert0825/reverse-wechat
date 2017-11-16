package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.akw;
import com.tencent.mm.protocal.c.bii;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class ad
{
  private static Map<Integer, Long> bc(byte[] paramArrayOfByte)
  {
    GMTrace.i(13568875429888L, 101096);
    if (bg.bq(paramArrayOfByte))
    {
      GMTrace.o(13568875429888L, 101096);
      return null;
    }
    try
    {
      paramArrayOfByte = (bii)new bii().aD(paramArrayOfByte);
      if (paramArrayOfByte == null)
      {
        GMTrace.o(13568875429888L, 101096);
        return null;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      GMTrace.o(13568875429888L, 101096);
      return null;
    }
    w.d("MicroMsg.SyncKeyUtil", "dkpush : keyCount:" + paramArrayOfByte.uPP);
    LinkedList localLinkedList = paramArrayOfByte.uPQ;
    if (localLinkedList.size() != paramArrayOfByte.uPP)
    {
      GMTrace.o(13568875429888L, 101096);
      return null;
    }
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramArrayOfByte.uPP)
    {
      localHashMap.put(Integer.valueOf(((akw)localLinkedList.get(i)).oqG), Long.valueOf(0xFFFFFFFF & ((akw)localLinkedList.get(i)).uzX));
      i += 1;
    }
    if (localHashMap.size() != paramArrayOfByte.uPP)
    {
      GMTrace.o(13568875429888L, 101096);
      return null;
    }
    GMTrace.o(13568875429888L, 101096);
    return localHashMap;
  }
  
  public static String bd(byte[] paramArrayOfByte)
  {
    GMTrace.i(13569009647616L, 101097);
    if (bg.bq(paramArrayOfByte))
    {
      GMTrace.o(13569009647616L, 101097);
      return "";
    }
    paramArrayOfByte = bc(paramArrayOfByte);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
    {
      GMTrace.o(13569009647616L, 101097);
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(" MsgKey:" + paramArrayOfByte.get(Integer.valueOf(2)));
    localStringBuffer.append(" profile:" + paramArrayOfByte.get(Integer.valueOf(1)));
    localStringBuffer.append(" contact:" + paramArrayOfByte.get(Integer.valueOf(3)));
    localStringBuffer.append(" chatroom:" + paramArrayOfByte.get(Integer.valueOf(11)));
    localStringBuffer.append(" Bottle:" + paramArrayOfByte.get(Integer.valueOf(7)));
    localStringBuffer.append(" QContact:" + paramArrayOfByte.get(Integer.valueOf(5)));
    paramArrayOfByte = localStringBuffer.toString();
    GMTrace.o(13569009647616L, 101097);
    return paramArrayOfByte;
  }
  
  public static byte[] g(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(13568741212160L, 101095);
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length <= 0))
    {
      w.d("MicroMsg.SyncKeyUtil", "empty old key, use new key");
      GMTrace.o(13568741212160L, 101095);
      return paramArrayOfByte2;
    }
    if ((paramArrayOfByte2 == null) || (paramArrayOfByte2.length <= 0))
    {
      w.e("MicroMsg.SyncKeyUtil", "newKey is null");
      GMTrace.o(13568741212160L, 101095);
      return null;
    }
    PByteArray localPByteArray = new PByteArray();
    try
    {
      if (!MMProtocalJni.mergeSyncKey(paramArrayOfByte1, paramArrayOfByte2, localPByteArray))
      {
        w.e("MicroMsg.SyncKeyUtil", "merge key failed");
        GMTrace.o(13568741212160L, 101095);
        return null;
      }
    }
    catch (IncompatibleClassChangeError paramArrayOfByte1)
    {
      w.printErrStackTrace("MicroMsg.Crash", paramArrayOfByte1, "NoSuchMethod MMProtocalJni.mergeSyncKey", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("NoSuchMethod MMProtocalJni.mergeSyncKey").initCause(paramArrayOfByte1));
    }
    paramArrayOfByte1 = localPByteArray.value;
    GMTrace.o(13568741212160L, 101095);
    return paramArrayOfByte1;
  }
  
  public static boolean h(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(13569143865344L, 101098);
    paramArrayOfByte1 = bc(paramArrayOfByte1);
    if (paramArrayOfByte1 == null)
    {
      w.d("MicroMsg.SyncKeyUtil", "dkpush local sync key failed");
      GMTrace.o(13569143865344L, 101098);
      return true;
    }
    paramArrayOfByte2 = bc(paramArrayOfByte2);
    if (paramArrayOfByte2 == null)
    {
      w.e("MicroMsg.SyncKeyUtil", "dkpush svr sync key failed");
      GMTrace.o(13569143865344L, 101098);
      return false;
    }
    Iterator localIterator = paramArrayOfByte2.keySet().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      Long localLong1 = (Long)paramArrayOfByte1.get(localInteger);
      Long localLong2 = (Long)paramArrayOfByte2.get(localInteger);
      if (localLong1 == null)
      {
        w.d("MicroMsg.SyncKeyUtil", "dkpush local key null :" + localInteger);
        GMTrace.o(13569143865344L, 101098);
        return true;
      }
      w.d("MicroMsg.SyncKeyUtil", "dkpush local key:" + localInteger + " sv:" + localLong2 + " lv:" + localLong1);
      if (localLong2.longValue() > localLong1.longValue())
      {
        GMTrace.o(13569143865344L, 101098);
        return true;
      }
    }
    w.d("MicroMsg.SyncKeyUtil", "dkpush two sync key is the same");
    GMTrace.o(13569143865344L, 101098);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */