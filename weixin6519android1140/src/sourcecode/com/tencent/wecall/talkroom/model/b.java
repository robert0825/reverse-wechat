package com.tencent.wecall.talkroom.model;

import com.tencent.mm.plugin.multi.talk;
import com.tencent.pb.common.a.a;
import com.tencent.pb.common.c.c;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
{
  talk yke = new talk();
  
  public b()
  {
    c.d("simon:TalkRoomContext", new Object[] { "construct" });
  }
  
  public final int Close()
  {
    if (!a.xJW) {
      return 0;
    }
    try
    {
      i = this.yke.close();
      c.d("simon:TalkRoomContext", new Object[] { "Close ret: ", Integer.valueOf(i) });
      return i;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        c.k("simon:TalkRoomContext", new Object[] { "Close ", localThrowable });
        int i = 0;
      }
    }
  }
  
  public final void OnMembersChanged(int[] paramArrayOfInt)
  {
    if (!a.xJW) {
      return;
    }
    this.yke.OnMembersChanged(paramArrayOfInt);
  }
  
  public final byte[] crl()
  {
    if (!a.xJW) {
      return new byte[0];
    }
    return this.yke.field_capInfo;
  }
  
  public final int crm()
  {
    try
    {
      if (!a.xJW) {
        return 0;
      }
      AtomicInteger localAtomicInteger1 = new AtomicInteger();
      AtomicInteger localAtomicInteger2 = new AtomicInteger();
      this.yke.getChannelBytes(localAtomicInteger1, localAtomicInteger2);
      int i = localAtomicInteger2.get();
      return i;
    }
    catch (Throwable localThrowable)
    {
      c.k("simon:TalkRoomContext", new Object[] { "getTotalWWANBytes: ", localThrowable });
    }
    return 0;
  }
  
  public final int uninitLive()
  {
    if (!a.xJW) {
      return 0;
    }
    try
    {
      i = this.yke.uninit();
      c.d("simon:TalkRoomContext", new Object[] { "uninitLive ret: ", Integer.valueOf(i) });
      return i;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        c.k("simon:TalkRoomContext", new Object[] { "uninitLive ", localThrowable });
        int i = 0;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */