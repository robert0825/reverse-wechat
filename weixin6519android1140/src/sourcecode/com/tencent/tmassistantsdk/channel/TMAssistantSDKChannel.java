package com.tencent.tmassistantsdk.channel;

import java.util.ArrayList;

public class TMAssistantSDKChannel
{
  public long AddDataItem(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, long paramLong1, long paramLong2, int paramInt3, byte[] paramArrayOfByte)
  {
    try
    {
      paramString1 = new TMAssistantSDKChannelDataItem(paramString1, paramInt1, paramString2, paramInt2, paramString3, paramLong1, paramLong2, paramInt3, paramArrayOfByte);
      paramLong1 = new DBOption().insert(paramString1);
      return paramLong1;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  /* Error */
  public boolean delDataItem(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: lload_1
    //   3: lconst_0
    //   4: lcmp
    //   5: ifge +9 -> 14
    //   8: iconst_0
    //   9: istore_3
    //   10: aload_0
    //   11: monitorexit
    //   12: iload_3
    //   13: ireturn
    //   14: new 18	com/tencent/tmassistantsdk/channel/DBOption
    //   17: dup
    //   18: invokespecial 19	com/tencent/tmassistantsdk/channel/DBOption:<init>	()V
    //   21: lload_1
    //   22: invokevirtual 28	com/tencent/tmassistantsdk/channel/DBOption:delete	(J)Z
    //   25: istore_3
    //   26: goto -16 -> 10
    //   29: astore 4
    //   31: aload_0
    //   32: monitorexit
    //   33: aload 4
    //   35: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	TMAssistantSDKChannel
    //   0	36	1	paramLong	long
    //   9	17	3	bool	boolean
    //   29	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	26	29	finally
  }
  
  public ArrayList<TMAssistantSDKChannelDataItem> getChannelDataItemList()
  {
    try
    {
      ArrayList localArrayList = new DBOption().queryAll();
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\channel\TMAssistantSDKChannel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */